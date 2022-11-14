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
 * Define the LaneSharing ASN.1 type included in the DSRC ASN.1 module.
 * @see BitString
 */

public class LaneSharing extends BitString {
    
    /**
     * The default constructor.
     */
    public LaneSharing()
    {
    }
    
    /**
     * Construct a BIT STRING from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public LaneSharing(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct a BIT STRING from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public LaneSharing(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int overlappingLaneDescriptionProvided = 0;
    public static final int multipleLanesTreatedAsOneLane = 1;
    public static final int otherNonMotorizedTrafficTypes = 2;
    public static final int individualMotorizedVehicleTraffic = 3;
    public static final int busVehicleTraffic = 4;
    public static final int taxiVehicleTraffic = 5;
    public static final int pedestriansTraffic = 6;
    public static final int cyclistVehicleTraffic = 7;
    public static final int trackedVehicleTraffic = 8;
    public static final int pedestrianTraffic = 9;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_ = 
	new Bounds (
	    Long.valueOf(10),
	    Long.valueOf(10)
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
		    "overlappingLaneDescriptionProvided",
		    0
		),
		new MemberListElement (
		    "multipleLanesTreatedAsOneLane",
		    1
		),
		new MemberListElement (
		    "otherNonMotorizedTrafficTypes",
		    2
		),
		new MemberListElement (
		    "individualMotorizedVehicleTraffic",
		    3
		),
		new MemberListElement (
		    "busVehicleTraffic",
		    4
		),
		new MemberListElement (
		    "taxiVehicleTraffic",
		    5
		),
		new MemberListElement (
		    "pedestriansTraffic",
		    6
		),
		new MemberListElement (
		    "cyclistVehicleTraffic",
		    7
		),
		new MemberListElement (
		    "trackedVehicleTraffic",
		    8
		),
		new MemberListElement (
		    "pedestrianTraffic",
		    9
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
    public LaneSharing clone() {
	return (LaneSharing)super.clone();
    }

} // End class definition for LaneSharing
