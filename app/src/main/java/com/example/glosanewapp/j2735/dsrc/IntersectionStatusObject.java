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
 * Define the IntersectionStatusObject ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class IntersectionStatusObject extends BitString {
    
    /**
     * The default constructor.
     */
    public IntersectionStatusObject()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public IntersectionStatusObject(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public IntersectionStatusObject(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int manualControlIsEnabled = 0;
    public static final int stopTimeIsActivated = 1;
    public static final int failureFlash = 2;
    public static final int preemptIsActive = 3;
    public static final int signalPriorityIsActive = 4;
    public static final int fixedTimeOperation = 5;
    public static final int trafficDependentOperation = 6;
    public static final int standbyOperation = 7;
    public static final int failureMode = 8;
    public static final int off = 9;
    public static final int recentMAPmessageUpdate = 10;
    public static final int recentChangeInMAPassignedLanesIDsUsed = 11;
    public static final int noValidMAPisAvailableAtThisTime = 12;
    public static final int noValidSPATisAvailableAtThisTime = 13;
    
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
		    "manualControlIsEnabled",
		    0
		),
		new MemberListElement (
		    "stopTimeIsActivated",
		    1
		),
		new MemberListElement (
		    "failureFlash",
		    2
		),
		new MemberListElement (
		    "preemptIsActive",
		    3
		),
		new MemberListElement (
		    "signalPriorityIsActive",
		    4
		),
		new MemberListElement (
		    "fixedTimeOperation",
		    5
		),
		new MemberListElement (
		    "trafficDependentOperation",
		    6
		),
		new MemberListElement (
		    "standbyOperation",
		    7
		),
		new MemberListElement (
		    "failureMode",
		    8
		),
		new MemberListElement (
		    "off",
		    9
		),
		new MemberListElement (
		    "recentMAPmessageUpdate",
		    10
		),
		new MemberListElement (
		    "recentChangeInMAPassignedLanesIDsUsed",
		    11
		),
		new MemberListElement (
		    "noValidMAPisAvailableAtThisTime",
		    12
		),
		new MemberListElement (
		    "noValidSPATisAvailableAtThisTime",
		    13
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
    public IntersectionStatusObject clone() {
	return (IntersectionStatusObject)super.clone();
    }

} // End class definition for IntersectionStatusObject
