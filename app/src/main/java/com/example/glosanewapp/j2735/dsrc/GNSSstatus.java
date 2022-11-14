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


package com.example.glosanewapp.j2735.dsrc;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the GNSSstatus ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class GNSSstatus extends BitString {
    
    /**
     * The default constructor.
     */
    public GNSSstatus()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public GNSSstatus(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public GNSSstatus(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int unavailable = 0;
    public static final int isHealthy = 1;
    public static final int isMonitored = 2;
    public static final int baseStationType = 3;
    public static final int aPDOPofUnder5 = 4;
    public static final int inViewOfUnder5 = 5;
    public static final int localCorrectionsPresent = 6;
    public static final int networkCorrectionsPresent = 7;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_ = 
	new Bounds (
	    Long.valueOf(8),
	    Long.valueOf(8)
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
		    "unavailable",
		    0
		),
		new MemberListElement (
		    "isHealthy",
		    1
		),
		new MemberListElement (
		    "isMonitored",
		    2
		),
		new MemberListElement (
		    "baseStationType",
		    3
		),
		new MemberListElement (
		    "aPDOPofUnder5",
		    4
		),
		new MemberListElement (
		    "inViewOfUnder5",
		    5
		),
		new MemberListElement (
		    "localCorrectionsPresent",
		    6
		),
		new MemberListElement (
		    "networkCorrectionsPresent",
		    7
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
    public GNSSstatus clone() {
	return (GNSSstatus)super.clone();
    }

} // End class definition for GNSSstatus
