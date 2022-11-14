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
 * Demonstrates decoding of the DP
x
cSRC MessageFrame PDU containing the
 * BasicSafetyMessage.
 */


import j2735.J2735;
import j2735.dsrc.BSMcoreData;
import j2735.dsrc.BasicSafetyMessage;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.PathHistory;
import j2735.dsrc.PathHistoryPoint;
import j2735.dsrc.VehicleSafetyExtensions;
import com.oss.asn1.Coder;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import com.oss.util.ASN1ValueFormat;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BSMUPERDecoder {

    static Coder coder;
    static String border = "-------------------------------------------------------";

    public BSMUPERDecoder() {
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

    public void decodeBSM(InputStream in){


        /* * Decode and process the MessageFrame PDU.*/

        try (BufferedInputStream source = new BufferedInputStream(in)) {
            MessageFrame msg = coder.decode(source, new MessageFrame());
            processMessageFrame(msg);
        } catch (DecodeNotSupportedException | DecodeFailedException | IOException e) {
            System.out.println("Decoding failed: " + e);
            System.exit(2);
        }
    }

    // Demonstrates how particular components of the BasicSafetyMessage are
    // accessed. Namely, the BSMcoreData and the crumb data (if present)
    private static void processMessageFrame(MessageFrame msg) {

         /** Print the decoded MessageFrame PDU.*/

        System.out.println("\nDecoded PDU...\n");
        System.out.println(msg);

            /* * Access the BSM core data*/

            System.out.println("The decoded PDU contains the BasicSafetyMessage.");
            System.out.println("Access and display the BSM core data " +
                    "and the crumb data");
            BasicSafetyMessage bsm = (BasicSafetyMessage) msg.getValue().getDecodedValue();
            BSMcoreData bsmCoreData = bsm.getCoreData();
            System.out.println("The BSM core data:");
            System.out.println(bsmCoreData);
            System.out.println("BSM Latitude value: "+ bsmCoreData.getLat().toString());
        /*    if (bsm.hasPartII()) {
                System.out.println("The BSM contains PartII data.");
                // Examine if the PartII component includes the VehicleSafetyExtensions
                // that may contain crumb data
                for (BasicSafetyMessage.PartII.Sequence_ partII_Element : bsm.getPartII()) {
                    switch (partII_Element.getPartII_Value().getTypeName()) {
                        case VehicleSafetyExtensions.class.getName():
                            processVehicleSafetyExtensions(
                                    (VehicleSafetyExtensions) partII_Element.getPartII_Value().getDecodedValue());
                            break;
                        case SpecialVehicleExtensions.class:
                        case SupplementalVehicleExtensions.class:
                            System.out.printf("Skipping the %s (id = %d) PartII extension ...\n",
                                    partII_Element.getPartII_Value().getTypeName(),
                                    partII_Element.getPartII_Id().intValue());
                            break;
                        default:
                            System.out.printf("Skipping PartII extension (id = %d) ...\n",
                                    partII_Element.getPartII_Id().intValue());
                    }
                }
            } else {
                System.out.println("The PartII data is absent.");
            }*/
            if (bsm.hasRegional())
                System.out.println("The BSM contains regional extensions.");
            else
                System.out.println("The BSM does not contain regional extensions.");

        }



    // Demonstrates access to the data contained in the  VehicleSafetyExtensions.
    // Prints path history data (crumb data) if present.
    private static void processVehicleSafetyExtensions(VehicleSafetyExtensions vse) {
        ASN1ValueFormat format = new ASN1ValueFormat()
                .excludeValueAssignment()
                .disableMultiline();
        System.out.printf("The BSM PartII VehicleSafetyExtensions:\n");
        System.out.printf("Events         %s\n",
                vse.hasEvents() ? vse.getEvents().toString(format) : "absent");
        System.out.printf("Lights         %s\n",
                vse.hasLights() ? vse.getLights().toString(format) : "absent");
        System.out.printf("PathPrediction %s\n",
                vse.hasPathPrediction() ? "present" : "absent");
        if (vse.hasPathHistory()) {
            System.out.printf("PathHistory (crumb data)\n");
            PathHistory pathHistory = vse.getPathHistory();
            for (PathHistoryPoint entry : pathHistory.getCrumbData()) {
                System.out.printf("   %s\n", entry.toString(format));
            }
        }
    }
}


