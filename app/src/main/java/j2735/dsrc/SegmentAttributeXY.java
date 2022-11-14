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
 * Define the SegmentAttributeXY ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class SegmentAttributeXY extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SegmentAttributeXY()
    {
	super(0);
    }
    
    private SegmentAttributeXY(long value)
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
    public final static SegmentAttributeXY cNamedNumbers[] = {
	new SegmentAttributeXY(), 
	new SegmentAttributeXY(1), 
	new SegmentAttributeXY(2), 
	new SegmentAttributeXY(3), 
	new SegmentAttributeXY(4), 
	new SegmentAttributeXY(5), 
	new SegmentAttributeXY(6), 
	new SegmentAttributeXY(7), 
	new SegmentAttributeXY(8), 
	new SegmentAttributeXY(9), 
	new SegmentAttributeXY(10), 
	new SegmentAttributeXY(11), 
	new SegmentAttributeXY(12), 
	new SegmentAttributeXY(13), 
	new SegmentAttributeXY(14), 
	new SegmentAttributeXY(15), 
	new SegmentAttributeXY(16), 
	new SegmentAttributeXY(17), 
	new SegmentAttributeXY(18), 
	new SegmentAttributeXY(19), 
	new SegmentAttributeXY(20), 
	new SegmentAttributeXY(21), 
	new SegmentAttributeXY(22), 
	new SegmentAttributeXY(23), 
	new SegmentAttributeXY(24), 
	new SegmentAttributeXY(25), 
	new SegmentAttributeXY(26), 
	new SegmentAttributeXY(27), 
	new SegmentAttributeXY(28), 
	new SegmentAttributeXY(29), 
	new SegmentAttributeXY(30), 
	new SegmentAttributeXY(31), 
	new SegmentAttributeXY(32), 
	new SegmentAttributeXY(33), 
	new SegmentAttributeXY(34), 
	new SegmentAttributeXY(35), 
	new SegmentAttributeXY(36), 
	new SegmentAttributeXY(37)
    };
    public static final SegmentAttributeXY reserved = cNamedNumbers[0];
    public static final SegmentAttributeXY doNotBlock = cNamedNumbers[1];
    public static final SegmentAttributeXY whiteLine = cNamedNumbers[2];
    public static final SegmentAttributeXY mergingLaneLeft = cNamedNumbers[3];
    public static final SegmentAttributeXY mergingLaneRight = cNamedNumbers[4];
    public static final SegmentAttributeXY curbOnLeft = cNamedNumbers[5];
    public static final SegmentAttributeXY curbOnRight = cNamedNumbers[6];
    public static final SegmentAttributeXY loadingzoneOnLeft = cNamedNumbers[7];
    public static final SegmentAttributeXY loadingzoneOnRight = cNamedNumbers[8];
    public static final SegmentAttributeXY turnOutPointOnLeft = cNamedNumbers[9];
    public static final SegmentAttributeXY turnOutPointOnRight = cNamedNumbers[10];
    public static final SegmentAttributeXY adjacentParkingOnLeft = cNamedNumbers[11];
    public static final SegmentAttributeXY adjacentParkingOnRight = cNamedNumbers[12];
    public static final SegmentAttributeXY adjacentBikeLaneOnLeft = cNamedNumbers[13];
    public static final SegmentAttributeXY adjacentBikeLaneOnRight = cNamedNumbers[14];
    public static final SegmentAttributeXY sharedBikeLane = cNamedNumbers[15];
    public static final SegmentAttributeXY bikeBoxInFront = cNamedNumbers[16];
    public static final SegmentAttributeXY transitStopOnLeft = cNamedNumbers[17];
    public static final SegmentAttributeXY transitStopOnRight = cNamedNumbers[18];
    public static final SegmentAttributeXY transitStopInLane = cNamedNumbers[19];
    public static final SegmentAttributeXY sharedWithTrackedVehicle = cNamedNumbers[20];
    public static final SegmentAttributeXY safeIsland = cNamedNumbers[21];
    public static final SegmentAttributeXY lowCurbsPresent = cNamedNumbers[22];
    public static final SegmentAttributeXY rumbleStripPresent = cNamedNumbers[23];
    public static final SegmentAttributeXY audibleSignalingPresent = cNamedNumbers[24];
    public static final SegmentAttributeXY adaptiveTimingPresent = cNamedNumbers[25];
    public static final SegmentAttributeXY rfSignalRequestPresent = cNamedNumbers[26];
    public static final SegmentAttributeXY partialCurbIntrusion = cNamedNumbers[27];
    public static final SegmentAttributeXY taperToLeft = cNamedNumbers[28];
    public static final SegmentAttributeXY taperToRight = cNamedNumbers[29];
    public static final SegmentAttributeXY taperToCenterLine = cNamedNumbers[30];
    public static final SegmentAttributeXY parallelParking = cNamedNumbers[31];
    public static final SegmentAttributeXY headInParking = cNamedNumbers[32];
    public static final SegmentAttributeXY freeParking = cNamedNumbers[33];
    public static final SegmentAttributeXY timeRestrictionsOnParking = cNamedNumbers[34];
    public static final SegmentAttributeXY costToPark = cNamedNumbers[35];
    public static final SegmentAttributeXY midBlockCurbPresent = cNamedNumbers[36];
    public static final SegmentAttributeXY unEvenPavementPresent = cNamedNumbers[37];
    
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
    
    public static SegmentAttributeXY valueOf(long value)
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
    public static SegmentAttributeXY valueAt(int index)
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
    public SegmentAttributeXY clone() {
	return (SegmentAttributeXY)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final SegmentAttributeXY cUnknownEnumerator = 
	new SegmentAttributeXY(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SegmentAttributeXY unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SegmentAttributeXY getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for SegmentAttributeXY
