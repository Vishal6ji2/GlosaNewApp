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
 * Define the NumberOfParticipantsInCluster ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class NumberOfParticipantsInCluster extends Enumerated {
    
    /**
     * The default constructor.
     */
    private NumberOfParticipantsInCluster()
    {
	super(0);
    }
    
    private NumberOfParticipantsInCluster(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long unavailable = 0;
	public static final long small = 1;
	public static final long medium = 2;
	public static final long large = 3;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static NumberOfParticipantsInCluster cNamedNumbers[] = {
	new NumberOfParticipantsInCluster(), 
	new NumberOfParticipantsInCluster(1), 
	new NumberOfParticipantsInCluster(2), 
	new NumberOfParticipantsInCluster(3)
    };
    public static final NumberOfParticipantsInCluster unavailable = cNamedNumbers[0];
    public static final NumberOfParticipantsInCluster small = cNamedNumbers[1];
    public static final NumberOfParticipantsInCluster medium = cNamedNumbers[2];
    public static final NumberOfParticipantsInCluster large = cNamedNumbers[3];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"small",
	"medium",
	"large"
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
	return (index < 0 || index >= 4 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 3)
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
    
    public static NumberOfParticipantsInCluster valueOf(long value)
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
    public static NumberOfParticipantsInCluster valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 4)
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
    public NumberOfParticipantsInCluster clone() {
	return (NumberOfParticipantsInCluster)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final NumberOfParticipantsInCluster cUnknownEnumerator = 
	new NumberOfParticipantsInCluster(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static NumberOfParticipantsInCluster unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public NumberOfParticipantsInCluster getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for NumberOfParticipantsInCluster
