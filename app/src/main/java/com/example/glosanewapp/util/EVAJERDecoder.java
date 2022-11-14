package com.example.glosanewapp.util;

/*****************************************************************************/
/* Copyright (C) ###RELEASE_YEAR### OSS Nokalva, Inc.  All rights reserved.                */
/*****************************************************************************/
/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.                    */
/* AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.             */
/* THIS FILE MAY NOT BE DISTRIBUTED.                                         */
/* THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED.                              */
/*****************************************************************************/
/* THIS SAMPLE PROGRAM IS PROVIDED AS IS. THE SAMPLE PROGRAM AND ANY RESULTS */
/* OBTAINED FROM IT ARE PROVIDED WITHOUT ANY WARRANTIES OR REPRESENTATIONS,  */
/* EXPRESS, IMPLIED OR STATUTORY.                                            */
/*****************************************************************************/
/*
 * $Id: bfde6f804fa8fea16200fa42390e93b0087d86b3 $
 */

/*
 * Demonstrates decoding of the DSRC MessageFrame PDU containing the
 * BasicSafetyMessage.
 */


import j2735.J2735;
import j2735.dsrc.EmergencyVehicleAlert;
import j2735.dsrc.MessageFrame;
import com.oss.asn1.Coder;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EVAJERDecoder {

    static Coder coder;
    static String border = "-------------------------------------------------------";

    public EVAJERDecoder() {
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

    public EmergencyVehicleAlert decodeJEREVA(InputStream in) {

        EmergencyVehicleAlert evadata=null;

        /*
         * Decode and process the MessageFrame PDU.
         */
        try (BufferedInputStream source = new BufferedInputStream(in)) {
            MessageFrame msg = coder.decode(source, new MessageFrame());
            evadata= processMessageFrame(msg);
        } catch (DecodeNotSupportedException | DecodeFailedException | IOException e) {
            System.out.println("Decoding failed: " + e);
            System.exit(2);
        }
        return evadata;
    }

    // Demonstrates how particular components of the BasicSafetyMessage are
    // accessed. Namely, the BSMcoreData and the crumb data (if present)
    private static EmergencyVehicleAlert processMessageFrame(MessageFrame msg) {
        /*
         * Print the decoded MessageFrame PDU.
         */
        EmergencyVehicleAlert evadata=null;
        System.out.println("\nDecoded PDU...\n");
        System.out.println(msg);
        try{
            evadata = (EmergencyVehicleAlert) msg.getValue().getDecodedValue();
           // Log.d("########", "processMessageFrame: "+evadata.timeStamp);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }




        return evadata;

    }
}


