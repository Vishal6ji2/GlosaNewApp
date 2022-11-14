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
 * Define the VehicleType ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class VehicleType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleType()
    {
	super(0);
    }
    
    private VehicleType(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long none = 0;
	public static final long unknown = 1;
	public static final long special = 2;
	public static final long moto = 3;
	public static final long car = 4;
	public static final long carOther = 5;
	public static final long bus = 6;
	public static final long axleCnt2 = 7;
	public static final long axleCnt3 = 8;
	public static final long axleCnt4 = 9;
	public static final long axleCnt4Trailer = 10;
	public static final long axleCnt5Trailer = 11;
	public static final long axleCnt6Trailer = 12;
	public static final long axleCnt5MultiTrailer = 13;
	public static final long axleCnt6MultiTrailer = 14;
	public static final long axleCnt7MultiTrailer = 15;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static VehicleType cNamedNumbers[] = {
	new VehicleType(), 
	new VehicleType(1), 
	new VehicleType(2), 
	new VehicleType(3), 
	new VehicleType(4), 
	new VehicleType(5), 
	new VehicleType(6), 
	new VehicleType(7), 
	new VehicleType(8), 
	new VehicleType(9), 
	new VehicleType(10), 
	new VehicleType(11), 
	new VehicleType(12), 
	new VehicleType(13), 
	new VehicleType(14), 
	new VehicleType(15)
    };
    public static final VehicleType none = cNamedNumbers[0];
    public static final VehicleType unknown = cNamedNumbers[1];
    public static final VehicleType special = cNamedNumbers[2];
    public static final VehicleType moto = cNamedNumbers[3];
    public static final VehicleType car = cNamedNumbers[4];
    public static final VehicleType carOther = cNamedNumbers[5];
    public static final VehicleType bus = cNamedNumbers[6];
    public static final VehicleType axleCnt2 = cNamedNumbers[7];
    public static final VehicleType axleCnt3 = cNamedNumbers[8];
    public static final VehicleType axleCnt4 = cNamedNumbers[9];
    public static final VehicleType axleCnt4Trailer = cNamedNumbers[10];
    public static final VehicleType axleCnt5Trailer = cNamedNumbers[11];
    public static final VehicleType axleCnt6Trailer = cNamedNumbers[12];
    public static final VehicleType axleCnt5MultiTrailer = cNamedNumbers[13];
    public static final VehicleType axleCnt6MultiTrailer = cNamedNumbers[14];
    public static final VehicleType axleCnt7MultiTrailer = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"none",
	"unknown",
	"special",
	"moto",
	"car",
	"carOther",
	"bus",
	"axleCnt2",
	"axleCnt3",
	"axleCnt4",
	"axleCnt4Trailer",
	"axleCnt5Trailer",
	"axleCnt6Trailer",
	"axleCnt5MultiTrailer",
	"axleCnt6MultiTrailer",
	"axleCnt7MultiTrailer"
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
	return (index < 0 || index >= 16 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 15)
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
    
    public static VehicleType valueOf(long value)
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
    public static VehicleType valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 16)
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
    public VehicleType clone() {
	return (VehicleType)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final VehicleType cUnknownEnumerator = 
	new VehicleType(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static VehicleType unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleType getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for VehicleType
