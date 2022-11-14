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


package j2735.dsrc;

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
 * Define the HeadingSlice ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class HeadingSlice extends BitString {
    
    /**
     * The default constructor.
     */
    public HeadingSlice()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public HeadingSlice(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public HeadingSlice(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int from000_0to022_5degrees = 0;
    public static final int from022_5to045_0degrees = 1;
    public static final int from045_0to067_5degrees = 2;
    public static final int from067_5to090_0degrees = 3;
    public static final int from090_0to112_5degrees = 4;
    public static final int from112_5to135_0degrees = 5;
    public static final int from135_0to157_5degrees = 6;
    public static final int from157_5to180_0degrees = 7;
    public static final int from180_0to202_5degrees = 8;
    public static final int from202_5to225_0degrees = 9;
    public static final int from225_0to247_5degrees = 10;
    public static final int from247_5to270_0degrees = 11;
    public static final int from270_0to292_5degrees = 12;
    public static final int from292_5to315_0degrees = 13;
    public static final int from315_0to337_5degrees = 14;
    public static final int from337_5to360_0degrees = 15;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_ = 
	new Bounds (
	    Long.valueOf(16),
	    Long.valueOf(16)
	);
    
    /**
     * The list of named bits (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final MemberList _cBitList_ = 
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "from000-0to022-5degrees",
		    0
		),
		new MemberListElement (
		    "from022-5to045-0degrees",
		    1
		),
		new MemberListElement (
		    "from045-0to067-5degrees",
		    2
		),
		new MemberListElement (
		    "from067-5to090-0degrees",
		    3
		),
		new MemberListElement (
		    "from090-0to112-5degrees",
		    4
		),
		new MemberListElement (
		    "from112-5to135-0degrees",
		    5
		),
		new MemberListElement (
		    "from135-0to157-5degrees",
		    6
		),
		new MemberListElement (
		    "from157-5to180-0degrees",
		    7
		),
		new MemberListElement (
		    "from180-0to202-5degrees",
		    8
		),
		new MemberListElement (
		    "from202-5to225-0degrees",
		    9
		),
		new MemberListElement (
		    "from225-0to247-5degrees",
		    10
		),
		new MemberListElement (
		    "from247-5to270-0degrees",
		    11
		),
		new MemberListElement (
		    "from270-0to292-5degrees",
		    12
		),
		new MemberListElement (
		    "from292-5to315-0degrees",
		    13
		),
		new MemberListElement (
		    "from315-0to337-5degrees",
		    14
		),
		new MemberListElement (
		    "from337-5to360-0degrees",
		    15
		)
	    }
	);
    
    /**
     * Returns whether the type has a named bit list or has none..
     */
    public boolean hasNamedBits()
    {
	return true;
    }
    
    /**
     * Returns the named bit list for this Bit String type..
     */
    public MemberList getNamedBits()
    {
	return _cBitList_;
    }
    
    /**
     * Clone 'this' object.
     */
    public HeadingSlice clone() {
	return (HeadingSlice)super.clone();
    }

} // End class definition for HeadingSlice
