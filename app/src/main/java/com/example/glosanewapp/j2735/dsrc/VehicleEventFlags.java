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
 * Define the VehicleEventFlags ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class VehicleEventFlags extends BitString {
    
    /**
     * The default constructor.
     */
    public VehicleEventFlags()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public VehicleEventFlags(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public VehicleEventFlags(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int eventHazardLights = 0;
    public static final int eventStopLineViolation = 1;
    public static final int eventABSactivated = 2;
    public static final int eventTractionControlLoss = 3;
    public static final int eventStabilityControlactivated = 4;
    public static final int eventHazardousMaterials = 5;
    public static final int eventReserved1 = 6;
    public static final int eventHardBraking = 7;
    public static final int eventLightsChanged = 8;
    public static final int eventWipersChanged = 9;
    public static final int eventFlatTire = 10;
    public static final int eventDisabledVehicle = 11;
    public static final int eventAirBagDeployment = 12;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_ = 
	new Bounds (
	    Long.valueOf(13),
	    Long.valueOf(13)
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
		    "eventHazardLights",
		    0
		),
		new MemberListElement (
		    "eventStopLineViolation",
		    1
		),
		new MemberListElement (
		    "eventABSactivated",
		    2
		),
		new MemberListElement (
		    "eventTractionControlLoss",
		    3
		),
		new MemberListElement (
		    "eventStabilityControlactivated",
		    4
		),
		new MemberListElement (
		    "eventHazardousMaterials",
		    5
		),
		new MemberListElement (
		    "eventReserved1",
		    6
		),
		new MemberListElement (
		    "eventHardBraking",
		    7
		),
		new MemberListElement (
		    "eventLightsChanged",
		    8
		),
		new MemberListElement (
		    "eventWipersChanged",
		    9
		),
		new MemberListElement (
		    "eventFlatTire",
		    10
		),
		new MemberListElement (
		    "eventDisabledVehicle",
		    11
		),
		new MemberListElement (
		    "eventAirBagDeployment",
		    12
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
    public VehicleEventFlags clone() {
	return (VehicleEventFlags)super.clone();
    }

} // End class definition for VehicleEventFlags
