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
 * Define the NMEA-Revision ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class NMEA_Revision extends Enumerated {
    
    /**
     * The default constructor.
     */
    private NMEA_Revision()
    {
	super(0);
    }
    
    private NMEA_Revision(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long unknown = 0;
	public static final long reserved = 1;
	public static final long rev1 = 2;
	public static final long rev2 = 3;
	public static final long rev3 = 4;
	public static final long rev4 = 5;
	public static final long rev5 = 6;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static NMEA_Revision cNamedNumbers[] = {
	new NMEA_Revision(), 
	new NMEA_Revision(1), 
	new NMEA_Revision(2), 
	new NMEA_Revision(3), 
	new NMEA_Revision(4), 
	new NMEA_Revision(5), 
	new NMEA_Revision(6)
    };
    public static final NMEA_Revision unknown = cNamedNumbers[0];
    public static final NMEA_Revision reserved = cNamedNumbers[1];
    public static final NMEA_Revision rev1 = cNamedNumbers[2];
    public static final NMEA_Revision rev2 = cNamedNumbers[3];
    public static final NMEA_Revision rev3 = cNamedNumbers[4];
    public static final NMEA_Revision rev4 = cNamedNumbers[5];
    public static final NMEA_Revision rev5 = cNamedNumbers[6];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"unknown",
	"reserved",
	"rev1",
	"rev2",
	"rev3",
	"rev4",
	"rev5"
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
	return (index < 0 || index >= 7 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 6)
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
    
    public static NMEA_Revision valueOf(long value)
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
    public static NMEA_Revision valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 7)
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
    public NMEA_Revision clone() {
	return (NMEA_Revision)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final NMEA_Revision cUnknownEnumerator = 
	new NMEA_Revision(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static NMEA_Revision unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public NMEA_Revision getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for NMEA_Revision
