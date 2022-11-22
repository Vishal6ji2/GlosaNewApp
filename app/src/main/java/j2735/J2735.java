/*************************************************************/
/* Copyright (C) 2022 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Amantya tech (Trial), License 84978Z 84978Z. */
/* Abstract syntax: j2735 */
/* ASN.1 Java project: j2735.J2735 */
/* Created: Sun Oct 16 13:39:13 2022 */
/* ASN.1 Compiler for Java version: 8.5.0.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output j2735 -uper -json -root -sampleCode pdus -messageFormat msvc
 * C:/Users/Admin/Downloads/J2735.asn
 */


package j2735;

import com.oss.asn1.*;
import com.oss.metadata.*;

import java.io.IOException;

import com.oss.coders.EncoderException;
import com.oss.coders.DecoderException;
import com.oss.util.ExceptionDescriptor;
import com.oss.asn1printer.DataPrinter;
import com.oss.asn1printer.DataPrinterException;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * A class for the J2735 ASN.1/Java  project.
 */
public class J2735 extends XASN1Project {

    /**
     * Initialize the pdu decoder.
     */
    private static final ProjectInfo c_projectInfo = new ProjectInfo(
            null,
            new byte[]{
                    (byte) 0x0b, (byte) 0x77, (byte) 0x48, (byte) 0x19, (byte) 0xa2,
                    (byte) 0x81, (byte) 0x33, (byte) 0xc5, (byte) 0x20, (byte) 0x01,
                    (byte) 0xdc, (byte) 0x61, (byte) 0x43, (byte) 0xfc, (byte) 0x9d,
                    (byte) 0x5d, (byte) 0x97, (byte) 0x62, (byte) 0x50, (byte) 0x4d,
                    (byte) 0x4e, (byte) 0x59, (byte) 0x37, (byte) 0xd7, (byte) 0x3b,
                    (byte) 0xa2, (byte) 0x01, (byte) 0xe6, (byte) 0x5e, (byte) 0xc8,
                    (byte) 0x75, (byte) 0x73, (byte) 0xac, (byte) 0x8c, (byte) 0x76,
                    (byte) 0xa8, (byte) 0x57, (byte) 0xf4, (byte) 0xfa, (byte) 0x84,
                    (byte) 0xfb, (byte) 0x27, (byte) 0x3b, (byte) 0xd2, (byte) 0x3e,
                    (byte) 0xa8, (byte) 0x00, (byte) 0x81, (byte) 0xf3, (byte) 0x87,
                    (byte) 0xc2, (byte) 0x79, (byte) 0x2d, (byte) 0x77, (byte) 0x34,
                    (byte) 0xeb, (byte) 0xde, (byte) 0x09, (byte) 0xa5, (byte) 0xc1,
                    (byte) 0x3b, (byte) 0xd7, (byte) 0x37, (byte) 0x59, (byte) 0x46,
                    (byte) 0xbb, (byte) 0xf5, (byte) 0xbe, (byte) 0x32, (byte) 0x26,
                    (byte) 0x38, (byte) 0x7e, (byte) 0xbb, (byte) 0x28, (byte) 0x1a,
                    (byte) 0xaf, (byte) 0xbc, (byte) 0x36, (byte) 0x2d, (byte) 0xf5
            },
            "2022/12/22"
    );

    /**
     * Get the project descriptor of 'this' object.
     */
    public ProjectInfo getProjectInfo() {
        return c_projectInfo;
    }

    private static final ASN1Project c_project = new J2735();

    /**
     * Methods for accessing Coders.
     */
    public static Coder getDefaultCoder() {
        return createPERUnalignedCoder(c_project);
    }

    public static PERAlignedCoder getPERAlignedCoder() {
        return createPERAlignedCoder(c_project);
    }

    public static PERUnalignedCoder getPERUnalignedCoder() {
        return createPERUnalignedCoder(c_project);
    }

    public static JSONCoder getJSONCoder() {
        return createJSONCoder(c_project);
    }

}
