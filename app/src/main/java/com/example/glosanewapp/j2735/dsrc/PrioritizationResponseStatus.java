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
 * Define the PrioritizationResponseStatus ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class PrioritizationResponseStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PrioritizationResponseStatus()
    {
	super(0);
    }
    
    private PrioritizationResponseStatus(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long unknown = 0;
	public static final long requested = 1;
	public static final long processing = 2;
	public static final long watchOtherTraffic = 3;
	public static final long granted = 4;
	public static final long rejected = 5;
	public static final long maxPresence = 6;
	public static final long reserviceLocked = 7;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static PrioritizationResponseStatus cNamedNumbers[] = {
	new PrioritizationResponseStatus(), 
	new PrioritizationResponseStatus(1), 
	new PrioritizationResponseStatus(2), 
	new PrioritizationResponseStatus(3), 
	new PrioritizationResponseStatus(4), 
	new PrioritizationResponseStatus(5), 
	new PrioritizationResponseStatus(6), 
	new PrioritizationResponseStatus(7)
    };
    public static final PrioritizationResponseStatus unknown = cNamedNumbers[0];
    public static final PrioritizationResponseStatus requested = cNamedNumbers[1];
    public static final PrioritizationResponseStatus processing = cNamedNumbers[2];
    public static final PrioritizationResponseStatus watchOtherTraffic = cNamedNumbers[3];
    public static final PrioritizationResponseStatus granted = cNamedNumbers[4];
    public static final PrioritizationResponseStatus rejected = cNamedNumbers[5];
    public static final PrioritizationResponseStatus maxPresence = cNamedNumbers[6];
    public static final PrioritizationResponseStatus reserviceLocked = cNamedNumbers[7];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"unknown",
	"requested",
	"processing",
	"watchOtherTraffic",
	"granted",
	"rejected",
	"maxPresence",
	"reserviceLocked"
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
    
    public static PrioritizationResponseStatus valueOf(long value)
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
    public static PrioritizationResponseStatus valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 8)
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
    public PrioritizationResponseStatus clone() {
	return (PrioritizationResponseStatus)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final PrioritizationResponseStatus cUnknownEnumerator = 
	new PrioritizationResponseStatus(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static PrioritizationResponseStatus unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public PrioritizationResponseStatus getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for PrioritizationResponseStatus
