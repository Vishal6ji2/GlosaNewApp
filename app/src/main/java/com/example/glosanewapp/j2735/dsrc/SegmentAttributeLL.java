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
 * Define the SegmentAttributeLL ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class SegmentAttributeLL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SegmentAttributeLL()
    {
	super(0);
    }
    
    private SegmentAttributeLL(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long reserved = 0;
	public static final long doNotBlock = 1;
	public static final long whiteLine = 2;
	public static final long mergingLaneLeft = 3;
	public static final long mergingLaneRight = 4;
	public static final long curbOnLeft = 5;
	public static final long curbOnRight = 6;
	public static final long loadingzoneOnLeft = 7;
	public static final long loadingzoneOnRight = 8;
	public static final long turnOutPointOnLeft = 9;
	public static final long turnOutPointOnRight = 10;
	public static final long adjacentParkingOnLeft = 11;
	public static final long adjacentParkingOnRight = 12;
	public static final long adjacentBikeLaneOnLeft = 13;
	public static final long adjacentBikeLaneOnRight = 14;
	public static final long sharedBikeLane = 15;
	public static final long bikeBoxInFront = 16;
	public static final long transitStopOnLeft = 17;
	public static final long transitStopOnRight = 18;
	public static final long transitStopInLane = 19;
	public static final long sharedWithTrackedVehicle = 20;
	public static final long safeIsland = 21;
	public static final long lowCurbsPresent = 22;
	public static final long rumbleStripPresent = 23;
	public static final long audibleSignalingPresent = 24;
	public static final long adaptiveTimingPresent = 25;
	public static final long rfSignalRequestPresent = 26;
	public static final long partialCurbIntrusion = 27;
	public static final long taperToLeft = 28;
	public static final long taperToRight = 29;
	public static final long taperToCenterLine = 30;
	public static final long parallelParking = 31;
	public static final long headInParking = 32;
	public static final long freeParking = 33;
	public static final long timeRestrictionsOnParking = 34;
	public static final long costToPark = 35;
	public static final long midBlockCurbPresent = 36;
	public static final long unEvenPavementPresent = 37;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static SegmentAttributeLL cNamedNumbers[] = {
	new SegmentAttributeLL(), 
	new SegmentAttributeLL(1), 
	new SegmentAttributeLL(2), 
	new SegmentAttributeLL(3), 
	new SegmentAttributeLL(4), 
	new SegmentAttributeLL(5), 
	new SegmentAttributeLL(6), 
	new SegmentAttributeLL(7), 
	new SegmentAttributeLL(8), 
	new SegmentAttributeLL(9), 
	new SegmentAttributeLL(10), 
	new SegmentAttributeLL(11), 
	new SegmentAttributeLL(12), 
	new SegmentAttributeLL(13), 
	new SegmentAttributeLL(14), 
	new SegmentAttributeLL(15), 
	new SegmentAttributeLL(16), 
	new SegmentAttributeLL(17), 
	new SegmentAttributeLL(18), 
	new SegmentAttributeLL(19), 
	new SegmentAttributeLL(20), 
	new SegmentAttributeLL(21), 
	new SegmentAttributeLL(22), 
	new SegmentAttributeLL(23), 
	new SegmentAttributeLL(24), 
	new SegmentAttributeLL(25), 
	new SegmentAttributeLL(26), 
	new SegmentAttributeLL(27), 
	new SegmentAttributeLL(28), 
	new SegmentAttributeLL(29), 
	new SegmentAttributeLL(30), 
	new SegmentAttributeLL(31), 
	new SegmentAttributeLL(32), 
	new SegmentAttributeLL(33), 
	new SegmentAttributeLL(34), 
	new SegmentAttributeLL(35), 
	new SegmentAttributeLL(36), 
	new SegmentAttributeLL(37)
    };
    public static final SegmentAttributeLL reserved = cNamedNumbers[0];
    public static final SegmentAttributeLL doNotBlock = cNamedNumbers[1];
    public static final SegmentAttributeLL whiteLine = cNamedNumbers[2];
    public static final SegmentAttributeLL mergingLaneLeft = cNamedNumbers[3];
    public static final SegmentAttributeLL mergingLaneRight = cNamedNumbers[4];
    public static final SegmentAttributeLL curbOnLeft = cNamedNumbers[5];
    public static final SegmentAttributeLL curbOnRight = cNamedNumbers[6];
    public static final SegmentAttributeLL loadingzoneOnLeft = cNamedNumbers[7];
    public static final SegmentAttributeLL loadingzoneOnRight = cNamedNumbers[8];
    public static final SegmentAttributeLL turnOutPointOnLeft = cNamedNumbers[9];
    public static final SegmentAttributeLL turnOutPointOnRight = cNamedNumbers[10];
    public static final SegmentAttributeLL adjacentParkingOnLeft = cNamedNumbers[11];
    public static final SegmentAttributeLL adjacentParkingOnRight = cNamedNumbers[12];
    public static final SegmentAttributeLL adjacentBikeLaneOnLeft = cNamedNumbers[13];
    public static final SegmentAttributeLL adjacentBikeLaneOnRight = cNamedNumbers[14];
    public static final SegmentAttributeLL sharedBikeLane = cNamedNumbers[15];
    public static final SegmentAttributeLL bikeBoxInFront = cNamedNumbers[16];
    public static final SegmentAttributeLL transitStopOnLeft = cNamedNumbers[17];
    public static final SegmentAttributeLL transitStopOnRight = cNamedNumbers[18];
    public static final SegmentAttributeLL transitStopInLane = cNamedNumbers[19];
    public static final SegmentAttributeLL sharedWithTrackedVehicle = cNamedNumbers[20];
    public static final SegmentAttributeLL safeIsland = cNamedNumbers[21];
    public static final SegmentAttributeLL lowCurbsPresent = cNamedNumbers[22];
    public static final SegmentAttributeLL rumbleStripPresent = cNamedNumbers[23];
    public static final SegmentAttributeLL audibleSignalingPresent = cNamedNumbers[24];
    public static final SegmentAttributeLL adaptiveTimingPresent = cNamedNumbers[25];
    public static final SegmentAttributeLL rfSignalRequestPresent = cNamedNumbers[26];
    public static final SegmentAttributeLL partialCurbIntrusion = cNamedNumbers[27];
    public static final SegmentAttributeLL taperToLeft = cNamedNumbers[28];
    public static final SegmentAttributeLL taperToRight = cNamedNumbers[29];
    public static final SegmentAttributeLL taperToCenterLine = cNamedNumbers[30];
    public static final SegmentAttributeLL parallelParking = cNamedNumbers[31];
    public static final SegmentAttributeLL headInParking = cNamedNumbers[32];
    public static final SegmentAttributeLL freeParking = cNamedNumbers[33];
    public static final SegmentAttributeLL timeRestrictionsOnParking = cNamedNumbers[34];
    public static final SegmentAttributeLL costToPark = cNamedNumbers[35];
    public static final SegmentAttributeLL midBlockCurbPresent = cNamedNumbers[36];
    public static final SegmentAttributeLL unEvenPavementPresent = cNamedNumbers[37];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"reserved",
	"doNotBlock",
	"whiteLine",
	"mergingLaneLeft",
	"mergingLaneRight",
	"curbOnLeft",
	"curbOnRight",
	"loadingzoneOnLeft",
	"loadingzoneOnRight",
	"turnOutPointOnLeft",
	"turnOutPointOnRight",
	"adjacentParkingOnLeft",
	"adjacentParkingOnRight",
	"adjacentBikeLaneOnLeft",
	"adjacentBikeLaneOnRight",
	"sharedBikeLane",
	"bikeBoxInFront",
	"transitStopOnLeft",
	"transitStopOnRight",
	"transitStopInLane",
	"sharedWithTrackedVehicle",
	"safeIsland",
	"lowCurbsPresent",
	"rumbleStripPresent",
	"audibleSignalingPresent",
	"adaptiveTimingPresent",
	"rfSignalRequestPresent",
	"partialCurbIntrusion",
	"taperToLeft",
	"taperToRight",
	"taperToCenterLine",
	"parallelParking",
	"headInParking",
	"freeParking",
	"timeRestrictionsOnParking",
	"costToPark",
	"midBlockCurbPresent",
	"unEvenPavementPresent"
    };
    
    
    /**
     * Returns the array of enumerators (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    /**
     * Returns the name of this enumerator.
     */
    public String name()
    {
	int index = indexOf();
	return (index < 0 || index >= 38 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 37)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * Returns an enumerator with a specified value or null if the value
     * is not associated with any enumerators.
     *  @param value the value of the enumerator to return.
     *  @return an enumerator with a specified value.
     */
    
    public static SegmentAttributeLL valueOf(long value)
    {
	int inx = indexOfValue(value);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SegmentAttributeLL valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 38)
	    return null;
	
	return cNamedNumbers[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int indexOf()
    {
	if (isUnknownEnumerator())
	    return -1;
	return indexOfValue(mValue);
    }
    
    /**
     * Clone 'this' object.
     */
    public SegmentAttributeLL clone() {
	return (SegmentAttributeLL)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final SegmentAttributeLL cUnknownEnumerator = 
	new SegmentAttributeLL(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SegmentAttributeLL unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SegmentAttributeLL getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for SegmentAttributeLL
