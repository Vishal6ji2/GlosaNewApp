package com.example.glosanewapp.util;


import j2735.J2735;
import j2735.dsrc.DSRC;
import j2735.dsrc.EmergencyVehicleAlert;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.RoadSideAlert;
import j2735.dsrc.TemporaryID;
import com.oss.asn1.Coder;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.OpenType;
import com.oss.util.HexTool;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public class EVAUPEREncoder {


    static Coder coder;
    static String border = "-------------------------------------------------------";

    public EVAUPEREncoder()
    {
        // Initialize the project
        try {
            J2735.initialize();
        } catch (Exception e) {
            System.out.println("Initialization exception: " + e);
            System.exit(1);
        }

        coder = J2735.getPERUnalignedCoder();
       // coder.enableEncodingOfImpliedValues();
        //coder.enableEncodingOfAbsentComponents();
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

    public byte[] getEVAMessage(RoadSideAlert rsa, byte[] temporaryID) throws UnsupportedEncodingException {

        // Construct a sample PDU for encoding

        MessageFrame msg = new MessageFrame(
                DSRC.emergencyVehicleAlert,
                new OpenType(create_EVA(rsa,temporaryID)));

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

    private EmergencyVehicleAlert create_EVA(RoadSideAlert rsa, byte[] temporaryID) {
        EmergencyVehicleAlert eva = new EmergencyVehicleAlert();
        eva.setId(new TemporaryID(temporaryID));
        eva.setRsaMsg(rsa);
        return eva;
    }
}
