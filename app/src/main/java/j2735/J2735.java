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
  A class for the J2735 ASN.1/Java  project.
*/
public class J2735 extends XASN1Project {

    /**
     * Initialize the pdu decoder.
     */
    private static final ProjectInfo c_projectInfo = new ProjectInfo (
	null,
	new byte[] {
	    (byte)0x0b, (byte)0x77, (byte)0x48, (byte)0x19, (byte)0xa2,
	    (byte)0x81, (byte)0x33, (byte)0xc5, (byte)0x20, (byte)0x01,
	    (byte)0xe5, (byte)0xb7, (byte)0x43, (byte)0x7e, (byte)0xc9,
	    (byte)0x71, (byte)0x6f, (byte)0x0c, (byte)0x26, (byte)0x1e,
	    (byte)0x98, (byte)0x3d, (byte)0xac, (byte)0x8b, (byte)0x1d,
	    (byte)0x33, (byte)0x3a, (byte)0x5c, (byte)0x2c, (byte)0x88,
	    (byte)0xc7, (byte)0x99, (byte)0x5f, (byte)0xa1, (byte)0x25,
	    (byte)0x64, (byte)0x1a, (byte)0x92, (byte)0x72, (byte)0x28,
	    (byte)0xd9, (byte)0x09, (byte)0x23, (byte)0xe2, (byte)0x1f,
	    (byte)0x44, (byte)0x2c, (byte)0xbf, (byte)0x1f, (byte)0x1a,
	    (byte)0x35, (byte)0x25, (byte)0x81, (byte)0x92, (byte)0xff,
	    (byte)0x07, (byte)0xac, (byte)0x8a, (byte)0x48, (byte)0x50,
	    (byte)0x1d, (byte)0x8b, (byte)0xac, (byte)0x3d, (byte)0x90,
	    (byte)0xe8, (byte)0x83, (byte)0xd0, (byte)0xca, (byte)0x0a,
	    (byte)0x6c, (byte)0xfc, (byte)0xfc, (byte)0x99, (byte)0x49,
	    (byte)0xcf, (byte)0x06, (byte)0x8f, (byte)0xf0, (byte)0xf7
	},
	"2022/11/14"
    );
    
    /**
     * Get the project descriptor of 'this' object.
     */
    public ProjectInfo getProjectInfo()
    {
	return c_projectInfo;
    }
    
    private static final ASN1Project c_project = new J2735();

    /**
     * Methods for accessing Coders.
     */
    public static Coder getDefaultCoder()
    {
	return createPERUnalignedCoder(c_project);
    }
    
    public static PERAlignedCoder getPERAlignedCoder()
    {
	return createPERAlignedCoder(c_project);
    }
    
    public static PERUnalignedCoder getPERUnalignedCoder()
    {
	return createPERUnalignedCoder(c_project);
    }
    
    public static JSONCoder getJSONCoder()
    {
	return createJSONCoder(c_project);
    }
    
}
