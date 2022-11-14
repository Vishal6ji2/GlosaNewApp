package com.example.glosanewapp.util;


import j2735.J2735;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.SPAT;
import com.oss.asn1.Coder;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;




public class SPATUPERDecoder {

    static Coder coder;
    static String border = "-------------------------------------------------------";

    public SPATUPERDecoder() {
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

        // Enable relaxed decoding mode if needed
        String relax = System.getProperty("oss.samples.relaxedmode");
        if (relax != null && relax.equalsIgnoreCase("on")) {
            coder.enableRelaxedDecoding();
        }


    }

    public SPAT decodeJERSPAT(InputStream in) {
        SPAT spat = null;
        /*;
         * Decode and process the MessageFrame PDU.
         */
        try (BufferedInputStream source = new BufferedInputStream(in)) {
            MessageFrame msg = coder.decode(source, new MessageFrame());
            spat = processMessageFrame(msg);
        } catch (DecodeNotSupportedException | DecodeFailedException | IOException e) {
            System.out.println("Decoding failed: " + e);
            System.exit(2);
        }
        return spat;
    }

    public SPAT decodeSPAT(InputStream in) {
        SPAT spat = null;
        /*;
         * Decode and process the MessageFrame PDU.
         */
        try (BufferedInputStream source = new BufferedInputStream(in)) {
            MessageFrame msg = coder.decode(source, new MessageFrame());
            spat = processMessageFrame(msg);
        } catch (DecodeNotSupportedException | DecodeFailedException | IOException e) {
            System.out.println("Decoding failed: " + e);
            System.exit(2);
        }
        return spat;
    }

    // Demonstrates how particular components of the BasicSafetyMessage are
    // accessed. Namely, the BSMcoreData and the crumb data (if present)
    private static SPAT processMessageFrame(MessageFrame msg) {
        /*
         * Print the decoded MessageFrame PDU.
         */
        SPAT spat = null;
        System.out.println("\nDecoded PDU...\n"+msg.getValue().getTypeName() + " "+msg.getValue().getClass().getName());
        System.out.println(msg);



        spat = (SPAT) msg.getValue().getDecodedValue();



        return spat;
    }
}
