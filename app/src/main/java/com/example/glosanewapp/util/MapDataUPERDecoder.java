package com.example.glosanewapp.util;

import com.oss.asn1.Coder;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import j2735.J2735;
import j2735.dsrc.MapData;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.SPAT;


public class MapDataUPERDecoder {

    static Coder coder;
    static String border = "-------------------------------------------------------";

    public MapDataUPERDecoder() {
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

    public MapData decodeMap(InputStream in) {
        MapData map = null;
        /*;
         * Decode and process the MessageFrame PDU.
         */
        try (BufferedInputStream source = new BufferedInputStream(in)) {
            MessageFrame msg = coder.decode(source, new MessageFrame());
            map = processMessageFrame(msg);
        } catch (DecodeNotSupportedException | DecodeFailedException | IOException e) {
            System.out.println("Decoding failed: " + e);
            System.exit(2);
        }
        return map;
    }

    // Demonstrates how particular components of the BasicSafetyMessage are
    // accessed. Namely, the BSMcoreData and the crumb data (if present)
    private static MapData processMessageFrame(MessageFrame msg) {
        /*
         * Print the decoded MessageFrame PDU.
         */
        MapData map = null;
        System.out.println("\nDecoded PDU...\n"+msg.getValue().getTypeName() + " "+msg.getValue().getClass().getName());
        System.out.println(msg);



        map = (MapData) msg.getValue().getDecodedValue();



        return map;
    }
}
