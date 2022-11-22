package com.example.glosanewapp.util;


import j2735.J2735;
import j2735.dsrc.DSRC;
import j2735.dsrc.DSecond;
import j2735.dsrc.Heading;
import j2735.dsrc.Latitude;
import j2735.dsrc.Longitude;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.MsgCount;
import j2735.dsrc.PersonalDeviceUserType;
import j2735.dsrc.PersonalSafetyMessage;
import j2735.dsrc.Position3D;
import j2735.dsrc.PositionalAccuracy;
import j2735.dsrc.SemiMajorAxisAccuracy;
import j2735.dsrc.SemiMajorAxisOrientation;
import j2735.dsrc.SemiMinorAxisAccuracy;
import j2735.dsrc.Speed;
import j2735.dsrc.TemporaryID;
import j2735.dsrc.Velocity;
import com.oss.asn1.Coder;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.OpenType;
import com.oss.util.HexTool;

import java.io.ByteArrayOutputStream;

public class PSMUPEREncoder {

    static Coder coder;

    public PSMUPEREncoder()
    {
        // Initialize the project
        try {
            J2735.initialize();
        } catch (Exception e) {
            System.out.println("Initialization exception: " + e);
            System.exit(1);
        }

        coder = J2735.getPERUnalignedCoder();
//        coder.enableEncodingOfImpliedValues();
//        coder.enableEncodingOfAbsentComponents();
        coder.enableAutomaticEncoding();
        coder.enableAutomaticDecoding();
        coder.enableEncoderDebugging();
        coder.enableDecoderDebugging();

        // Enable relaxed decoding mode if needed
        String relax = System.getProperty("oss.samples.relaxedmode");
        if (relax != null && relax.equalsIgnoreCase("on")) {
            coder.enableRelaxedDecoding();
        }

    }

    public byte[] getPSMMessage(Latitude latitude, Longitude longitude, Heading heading, Speed speed, byte[] temporaryID ) throws EncodeFailedException, EncodeNotSupportedException {

        // Construct a sample PDU for encoding

        MessageFrame msg = new MessageFrame(
                DSRC.personalSafetyMessage,
                new OpenType(create_PSM(latitude,longitude,heading,speed,temporaryID)));

        System.out.println("\nPDU for encoding...\n");
        System.out.println(msg);
        System.out.println("\nEncoding...");
        /*
         * Set the output stream.
         */
        ByteArrayOutputStream sink = new ByteArrayOutputStream();
        /*
         * Encode the PDU.
         */
        try {
            coder.encode(msg, sink);
        } catch (EncodeNotSupportedException | EncodeFailedException e) {
            System.out.println("Encoding failed: " + e);
//            System.exit(2);
            return new byte[0];
        }
        System.out.println("Encoded successfully.");
        /*
         * Print the encoded PDU.
         */
        System.out.println("\nEncoded PDU...\n");
        byte[] encoding = sink.toByteArray();
        HexTool.printHex(encoding);
        return encoding;
    }

    private static PersonalSafetyMessage create_PSM(Latitude latitude, Longitude longitude, Heading heading, Speed speed, byte[] temporaryID )
    {
        PersonalSafetyMessage samplevalue_PersonalSafetyMessage_uper_value = new PersonalSafetyMessage();
        samplevalue_PersonalSafetyMessage_uper_value.setBasicType(PersonalDeviceUserType.unavailable);
        samplevalue_PersonalSafetyMessage_uper_value.setSecMark(new DSecond(0));
        samplevalue_PersonalSafetyMessage_uper_value.setMsgCnt(new MsgCount(0));

        samplevalue_PersonalSafetyMessage_uper_value.setId(new TemporaryID(temporaryID));
        samplevalue_PersonalSafetyMessage_uper_value.setPosition(new Position3D(latitude,longitude));
        {
            Position3D position_2 = samplevalue_PersonalSafetyMessage_uper_value.getPosition();
            position_2.setLat(latitude);
            position_2.set_long(longitude);
            position_2.setElevation(null);
            position_2.setRegional(null);
        }
        samplevalue_PersonalSafetyMessage_uper_value.setAccuracy(new PositionalAccuracy());
        {
            PositionalAccuracy accuracy_2 = samplevalue_PersonalSafetyMessage_uper_value.getAccuracy();
            accuracy_2.setSemiMajor(new SemiMajorAxisAccuracy(0));
            accuracy_2.setSemiMinor(new SemiMinorAxisAccuracy(0));
            accuracy_2.setOrientation(new SemiMajorAxisOrientation(0));
        }
        samplevalue_PersonalSafetyMessage_uper_value.setSpeed(new Velocity(speed.intValue()));
        samplevalue_PersonalSafetyMessage_uper_value.setHeading(heading);
        samplevalue_PersonalSafetyMessage_uper_value.setAccelSet(null);
        samplevalue_PersonalSafetyMessage_uper_value.setPathHistory(null);
        samplevalue_PersonalSafetyMessage_uper_value.setPathPrediction(null);
        samplevalue_PersonalSafetyMessage_uper_value.setPropulsion(null);
        samplevalue_PersonalSafetyMessage_uper_value.setUseState(null);
        samplevalue_PersonalSafetyMessage_uper_value.setCrossRequest(null);
        samplevalue_PersonalSafetyMessage_uper_value.setCrossState(null);
        samplevalue_PersonalSafetyMessage_uper_value.setClusterSize(null);
        samplevalue_PersonalSafetyMessage_uper_value.setClusterRadius(null);
        samplevalue_PersonalSafetyMessage_uper_value.setEventResponderType(null);
        samplevalue_PersonalSafetyMessage_uper_value.setActivityType(null);
        samplevalue_PersonalSafetyMessage_uper_value.setActivitySubType(null);
        samplevalue_PersonalSafetyMessage_uper_value.setAssistType(null);
        samplevalue_PersonalSafetyMessage_uper_value.setSizing(null);
        samplevalue_PersonalSafetyMessage_uper_value.setAttachment(null);
        samplevalue_PersonalSafetyMessage_uper_value.setAttachmentRadius(null);
        samplevalue_PersonalSafetyMessage_uper_value.setAnimalType(null);
        samplevalue_PersonalSafetyMessage_uper_value.setRegional(null);
        return samplevalue_PersonalSafetyMessage_uper_value;

    }
}
