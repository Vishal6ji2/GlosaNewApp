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
 * Define the LaneAttributes-TrackedVehicle ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class LaneAttributes_TrackedVehicle extends BitString {
    
    /**
     * The default constructor.
     */
    public LaneAttributes_TrackedVehicle()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public LaneAttributes_TrackedVehicle(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public LaneAttributes_TrackedVehicle(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int spec_RevocableLane = 0;
    public static final int spec_commuterRailRoadTrack = 1;
    public static final int spec_lightRailRoadTrack = 2;
    public static final int spec_heavyRailRoadTrack = 3;
    public static final int spec_otherRailType = 4;
    
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
		    "spec-RevocableLane",
		    0
		),
		new MemberListElement (
		    "spec-commuterRailRoadTrack",
		    1
		),
		new MemberListElement (
		    "spec-lightRailRoadTrack",
		    2
		),
		new MemberListElement (
		    "spec-heavyRailRoadTrack",
		    3
		),
		new MemberListElement (
		    "spec-otherRailType",
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
    public LaneAttributes_TrackedVehicle clone() {
	return (LaneAttributes_TrackedVehicle)super.clone();
    }

} // End class definition for LaneAttributes_TrackedVehicle
