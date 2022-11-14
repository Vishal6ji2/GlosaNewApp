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
 * Define the ExteriorLights ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class ExteriorLights extends BitString {
    
    /**
     * The default constructor.
     */
    public ExteriorLights()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public ExteriorLights(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public ExteriorLights(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int lowBeamHeadlightsOn = 0;
    public static final int highBeamHeadlightsOn = 1;
    public static final int leftTurnSignalOn = 2;
    public static final int rightTurnSignalOn = 3;
    public static final int hazardSignalOn = 4;
    public static final int automaticLightControlOn = 5;
    public static final int daytimeRunningLightsOn = 6;
    public static final int fogLightOn = 7;
    public static final int parkingLightsOn = 8;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_ = 
	new Bounds (
	    Long.valueOf(9),
	    Long.valueOf(9)
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
		    "lowBeamHeadlightsOn",
		    0
		),
		new MemberListElement (
		    "highBeamHeadlightsOn",
		    1
		),
		new MemberListElement (
		    "leftTurnSignalOn",
		    2
		),
		new MemberListElement (
		    "rightTurnSignalOn",
		    3
		),
		new MemberListElement (
		    "hazardSignalOn",
		    4
		),
		new MemberListElement (
		    "automaticLightControlOn",
		    5
		),
		new MemberListElement (
		    "daytimeRunningLightsOn",
		    6
		),
		new MemberListElement (
		    "fogLightOn",
		    7
		),
		new MemberListElement (
		    "parkingLightsOn",
		    8
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
    public ExteriorLights clone() {
	return (ExteriorLights)super.clone();
    }

} // End class definition for ExteriorLights
