package com.example.glosanewapp.util;


import j2735.J2735;
import j2735.dsrc.DSRC;
import j2735.dsrc.FullPositionVector;
import j2735.dsrc.Heading;
import j2735.dsrc.Latitude;
import j2735.dsrc.Longitude;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.MsgCount;
import j2735.dsrc.RoadSideAlert;
import j2735.dsrc.Speed;
import j2735.dsrc.TransmissionAndSpeed;
import j2735.dsrc.TransmissionState;
import j2735.dsrc.Velocity;
import j2735.itis.ITIScodes;

import com.oss.asn1.Coder;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.OpenType;
import com.oss.util.HexTool;

import java.io.ByteArrayOutputStream;

public class RSAUPEREncoder {
    static Coder coder;
    static String border = "-------------------------------------------------------";

    public RSAUPEREncoder()
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

    public byte[] getRSAMessage(Latitude latitude, Longitude longitude, Heading heading, Speed speed){

        // Construct a sample PDU for encoding

        MessageFrame msg = new MessageFrame(
                DSRC.roadSideAlert,
                new OpenType(create_RSA(latitude,longitude,heading,speed)));

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

    public static RoadSideAlert create_RSA(Latitude latitude, Longitude longitude, Heading heading, Speed speed)
    {
        RoadSideAlert samplevalue_RSA_431_UPER_value = new RoadSideAlert();
        samplevalue_RSA_431_UPER_value.setMsgCnt(new MsgCount(27));
        samplevalue_RSA_431_UPER_value.setTimeStamp(null);
        samplevalue_RSA_431_UPER_value.setTypeEvent(new ITIScodes(9729));
        samplevalue_RSA_431_UPER_value.setDescription(null);
        samplevalue_RSA_431_UPER_value.setPriority(null);
        samplevalue_RSA_431_UPER_value.setHeading(null);
        samplevalue_RSA_431_UPER_value.setExtent(null);
        FullPositionVector positionVector = new FullPositionVector();
        positionVector._long=longitude;
        positionVector.lat=latitude;
        positionVector.heading=heading;
        positionVector.speed= new TransmissionAndSpeed(new TransmissionState(1),new Velocity(speed.intValue()));
        samplevalue_RSA_431_UPER_value.setPosition(positionVector);
        samplevalue_RSA_431_UPER_value.setFurtherInfoID(null);
        samplevalue_RSA_431_UPER_value.setRegional(null);
        return samplevalue_RSA_431_UPER_value;

    }
}
