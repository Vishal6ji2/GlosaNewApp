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
 * Define the TirePressureThresholdDetection ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class TirePressureThresholdDetection extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TirePressureThresholdDetection()
    {
	super(0);
    }
    
    private TirePressureThresholdDetection(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long noData = 0;
	public static final long overPressure = 1;
	public static final long noWarningPressure = 2;
	public static final long underPressure = 3;
	public static final long extremeUnderPressure = 4;
	public static final long undefined = 5;
	public static final long errorIndicator = 6;
	public static final long notAvailable = 7;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static TirePressureThresholdDetection cNamedNumbers[] = {
	new TirePressureThresholdDetection(), 
	new TirePressureThresholdDetection(1), 
	new TirePressureThresholdDetection(2), 
	new TirePressureThresholdDetection(3), 
	new TirePressureThresholdDetection(4), 
	new TirePressureThresholdDetection(5), 
	new TirePressureThresholdDetection(6), 
	new TirePressureThresholdDetection(7)
    };
    public static final TirePressureThresholdDetection noData = cNamedNumbers[0];
    public static final TirePressureThresholdDetection overPressure = cNamedNumbers[1];
    public static final TirePressureThresholdDetection noWarningPressure = cNamedNumbers[2];
    public static final TirePressureThresholdDetection underPressure = cNamedNumbers[3];
    public static final TirePressureThresholdDetection extremeUnderPressure = cNamedNumbers[4];
    public static final TirePressureThresholdDetection undefined = cNamedNumbers[5];
    public static final TirePressureThresholdDetection errorIndicator = cNamedNumbers[6];
    public static final TirePressureThresholdDetection notAvailable = cNamedNumbers[7];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"noData",
	"overPressure",
	"noWarningPressure",
	"underPressure",
	"extremeUnderPressure",
	"undefined",
	"errorIndicator",
	"notAvailable"
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
	return (index < 0 || index >= 8 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 7)
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
    
    public static TirePressureThresholdDetection valueOf(long value)
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
    public static TirePressureThresholdDetection valueAt(int index)
    {
	if (index < 0 || index >= 8)
	    throw new IndexOutOfBoundsException();
	
	return cNamedNumbers[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int indexOf()
    {
	return indexOfValue(mValue);
    }
    
    /**
     * Clone 'this' object.
     */
    public TirePressureThresholdDetection clone() {
	return (TirePressureThresholdDetection)super.clone();
    }

} // End class definition for TirePressureThresholdDetection
