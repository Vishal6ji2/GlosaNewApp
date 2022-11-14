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
import j2735.dsrc.TemporaryID;
import j2735.dsrc.Velocity;
import com.oss.asn1.Coder;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.util.HexTool;

import java.io.ByteArrayOutputStream;

public class PSMEncoder {

    static Coder coder;

    public PSMEncoder()
    {
        // Initialize the project
        try {
            J2735.initialize();
        } catch (Exception e) {
            System.out.println("Initialization exception: " + e);
            System.exit(1);
        }

        coder = J2735.getPERUnalignedCoder();
        coder.enableAutomaticEncoding();
        coder.enableAutomaticDecoding();
        coder.enableEncoderDebugging();
        coder.enableDecoderDebugging();

    }

    public byte[] getPSMMessage(){

        // Construct a sample PDU for encoding

        MessageFrame msg = new MessageFrame(
                DSRC.personalSafetyMessage,
                null/*new MessageFrame.Value(create_PSM())*/);

        System.out.println("\nPDU for encoding...\n");
//        System.out.println(msg);
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
        } catch (EncodeNotSupportedException e) {
            System.out.println("Encoding failed: " + e);
            System.exit(2);
        } catch (EncodeFailedException e) {
            System.out.println("Encoding failed: " + e);
            System.exit(2);
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

    private static PersonalSafetyMessage create_PSM()
    {
        PersonalSafetyMessage samplevalue_PersonalSafetyMessage_uper_value = new PersonalSafetyMessage();
        samplevalue_PersonalSafetyMessage_uper_value.setBasicType(PersonalDeviceUserType.unavailable);
        samplevalue_PersonalSafetyMessage_uper_value.setSecMark(new DSecond(0));
        samplevalue_PersonalSafetyMessage_uper_value.setMsgCnt(new MsgCount(0));
        samplevalue_PersonalSafetyMessage_uper_value.setId(new TemporaryID(new byte[]
                {
                        (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00
                }));
        samplevalue_PersonalSafetyMessage_uper_value.setPosition(new Position3D());
        {
            Position3D position_2 = samplevalue_PersonalSafetyMessage_uper_value.getPosition();
            position_2.setLat(new Latitude(-900000000));
            position_2.set_long(new Longitude(-1799999999));
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
        samplevalue_PersonalSafetyMessage_uper_value.setSpeed(new Velocity(0));
        samplevalue_PersonalSafetyMessage_uper_value.setHeading(new Heading(0));
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
