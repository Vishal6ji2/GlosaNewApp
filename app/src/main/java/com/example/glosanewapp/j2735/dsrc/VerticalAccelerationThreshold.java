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
 * Define the VerticalAccelerationThreshold ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class VerticalAccelerationThreshold extends BitString {
    
    /**
     * The default constructor.
     */
    public VerticalAccelerationThreshold()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public VerticalAccelerationThreshold(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public VerticalAccelerationThreshold(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int notEquipped = 0;
    public static final int leftFront = 1;
    public static final int leftRear = 2;
    public static final int rightFront = 3;
    public static final int rightRear = 4;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_ = 
	new Bounds (
	    Long.valueOf(5),
	    Long.valueOf(5)
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
		    "notEquipped",
		    0
		),
		new MemberListElement (
		    "leftFront",
		    1
		),
		new MemberListElement (
		    "leftRear",
		    2
		),
		new MemberListElement (
		    "rightFront",
		    3
		),
		new MemberListElement (
		    "rightRear",
		    4
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
    public VerticalAccelerationThreshold clone() {
	return (VerticalAccelerationThreshold)super.clone();
    }

} // End class definition for VerticalAccelerationThreshold
