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
 * Define the PersonalAssistive ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class PersonalAssistive extends BitString {
    
    /**
     * The default constructor.
     */
    public PersonalAssistive()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public PersonalAssistive(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public PersonalAssistive(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int unavailable = 0;
    public static final int otherType = 1;
    public static final int vision = 2;
    public static final int hearing = 3;
    public static final int movement = 4;
    public static final int cognition = 5;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_ = 
	new Bounds (
	    Long.valueOf(6),
	    Long.valueOf(6)
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
		    "otherType",
		    1
		),
		new MemberListElement (
		    "vision",
		    2
		),
		new MemberListElement (
		    "hearing",
		    3
		),
		new MemberListElement (
		    "movement",
		    4
		),
		new MemberListElement (
		    "cognition",
		    5
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
    public PersonalAssistive clone() {
	return (PersonalAssistive)super.clone();
    }

} // End class definition for PersonalAssistive
