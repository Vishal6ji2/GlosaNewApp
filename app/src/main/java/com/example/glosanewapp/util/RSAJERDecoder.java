package com.example.glosanewapp.util;


import j2735.J2735;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.RoadSideAlert;
import com.oss.asn1.Coder;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RSAJERDecoder {

    static Coder coder;
    static String border = "-------------------------------------------------------";

    public RSAJERDecoder() {
        // Initialize the project
        try {
            J2735.initialize();
        } catch (Exception e) {
            System.out.println("Initialization exception: " + e);
            System.exit(1);
        }

        coder = J2735.getJSONCoder();
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

    public void decodeRSA(InputStream in){

        /*
         * Decode and process the MessageFrame PDU.
         */
        try (BufferedInputStream source = new BufferedInputStream(in)) {
            MessageFrame msg = coder.decode(source, new MessageFrame());
            System.out.println("Message Topic REGIONAL RSA: Decoded Success..");
            processMessageFrame(msg);

        } catch (DecodeNotSupportedException | DecodeFailedException | IOException e) {
            System.out.println("Decoding failed: " + e);
            System.exit(2);
        }
    }

    // Demonstrates how particular components of the BasicSafetyMessage are
    // accessed. Namely, the BSMcoreData and the crumb data (if present)
    private static void processMessageFrame(MessageFrame msg) {
        /*
         * Print the decoded MessageFrame PDU.
         */
        System.out.println("\nDecoded PDU...\n");
        System.out.println(msg);

        if (msg.getValue().getTypeName() == RoadSideAlert.class.getName()) {
            RoadSideAlert rsaData=(RoadSideAlert) msg.getValue().getDecodedValue();

            System.out.println("\nMessage Topic REGIONAL RSA: Decoded Success..\n"+rsaData.typeEvent);
        }
    }
}
