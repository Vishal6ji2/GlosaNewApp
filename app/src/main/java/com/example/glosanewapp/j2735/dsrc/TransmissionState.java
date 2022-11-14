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
 * Define the TransmissionState ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class TransmissionState extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TransmissionState()
    {
	super(0);
    }
    
    private TransmissionState(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long neutral = 0;
	public static final long park = 1;
	public static final long forwardGears = 2;
	public static final long reverseGears = 3;
	public static final long reserved1 = 4;
	public static final long reserved2 = 5;
	public static final long reserved3 = 6;
	public static final long unavailable = 7;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static TransmissionState cNamedNumbers[] = {
	new TransmissionState(), 
	new TransmissionState(1), 
	new TransmissionState(2), 
	new TransmissionState(3), 
	new TransmissionState(4), 
	new TransmissionState(5), 
	new TransmissionState(6), 
	new TransmissionState(7)
    };
    public static final TransmissionState neutral = cNamedNumbers[0];
    public static final TransmissionState park = cNamedNumbers[1];
    public static final TransmissionState forwardGears = cNamedNumbers[2];
    public static final TransmissionState reverseGears = cNamedNumbers[3];
    public static final TransmissionState reserved1 = cNamedNumbers[4];
    public static final TransmissionState reserved2 = cNamedNumbers[5];
    public static final TransmissionState reserved3 = cNamedNumbers[6];
    public static final TransmissionState unavailable = cNamedNumbers[7];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"neutral",
	"park",
	"forwardGears",
	"reverseGears",
	"reserved1",
	"reserved2",
	"reserved3",
	"unavailable"
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
    
    public static TransmissionState valueOf(long value)
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
    public static TransmissionState valueAt(int index)
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
    public TransmissionState clone() {
	return (TransmissionState)super.clone();
    }

} // End class definition for TransmissionState
