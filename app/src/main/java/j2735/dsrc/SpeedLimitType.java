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
 * Define the SpeedLimitType ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class SpeedLimitType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SpeedLimitType()
    {
	super(0);
    }
    
    private SpeedLimitType(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long unknown = 0;
	public static final long maxSpeedInSchoolZone = 1;
	public static final long maxSpeedInSchoolZoneWhenChildrenArePresent = 2;
	public static final long maxSpeedInConstructionZone = 3;
	public static final long vehicleMinSpeed = 4;
	public static final long vehicleMaxSpeed = 5;
	public static final long vehicleNightMaxSpeed = 6;
	public static final long truckMinSpeed = 7;
	public static final long truckMaxSpeed = 8;
	public static final long truckNightMaxSpeed = 9;
	public static final long vehiclesWithTrailersMinSpeed = 10;
	public static final long vehiclesWithTrailersMaxSpeed = 11;
	public static final long vehiclesWithTrailersNightMaxSpeed = 12;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static SpeedLimitType cNamedNumbers[] = {
	new SpeedLimitType(), 
	new SpeedLimitType(1), 
	new SpeedLimitType(2), 
	new SpeedLimitType(3), 
	new SpeedLimitType(4), 
	new SpeedLimitType(5), 
	new SpeedLimitType(6), 
	new SpeedLimitType(7), 
	new SpeedLimitType(8), 
	new SpeedLimitType(9), 
	new SpeedLimitType(10), 
	new SpeedLimitType(11), 
	new SpeedLimitType(12)
    };
    public static final SpeedLimitType unknown = cNamedNumbers[0];
    public static final SpeedLimitType maxSpeedInSchoolZone = cNamedNumbers[1];
    public static final SpeedLimitType maxSpeedInSchoolZoneWhenChildrenArePresent = cNamedNumbers[2];
    public static final SpeedLimitType maxSpeedInConstructionZone = cNamedNumbers[3];
    public static final SpeedLimitType vehicleMinSpeed = cNamedNumbers[4];
    public static final SpeedLimitType vehicleMaxSpeed = cNamedNumbers[5];
    public static final SpeedLimitType vehicleNightMaxSpeed = cNamedNumbers[6];
    public static final SpeedLimitType truckMinSpeed = cNamedNumbers[7];
    public static final SpeedLimitType truckMaxSpeed = cNamedNumbers[8];
    public static final SpeedLimitType truckNightMaxSpeed = cNamedNumbers[9];
    public static final SpeedLimitType vehiclesWithTrailersMinSpeed = cNamedNumbers[10];
    public static final SpeedLimitType vehiclesWithTrailersMaxSpeed = cNamedNumbers[11];
    public static final SpeedLimitType vehiclesWithTrailersNightMaxSpeed = cNamedNumbers[12];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"unknown",
	"maxSpeedInSchoolZone",
	"maxSpeedInSchoolZoneWhenChildrenArePresent",
	"maxSpeedInConstructionZone",
	"vehicleMinSpeed",
	"vehicleMaxSpeed",
	"vehicleNightMaxSpeed",
	"truckMinSpeed",
	"truckMaxSpeed",
	"truckNightMaxSpeed",
	"vehiclesWithTrailersMinSpeed",
	"vehiclesWithTrailersMaxSpeed",
	"vehiclesWithTrailersNightMaxSpeed"
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
	return (index < 0 || index >= 13 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 12)
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
    
    public static SpeedLimitType valueOf(long value)
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
    public static SpeedLimitType valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 13)
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
    public SpeedLimitType clone() {
	return (SpeedLimitType)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final SpeedLimitType cUnknownEnumerator = 
	new SpeedLimitType(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SpeedLimitType unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SpeedLimitType getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for SpeedLimitType
