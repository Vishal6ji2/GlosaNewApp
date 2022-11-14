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
 * Define the RequestedItem ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class RequestedItem extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RequestedItem()
    {
	super(0);
    }
    
    private RequestedItem(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long reserved = 0;
	public static final long itemA = 1;
	public static final long itemB = 2;
	public static final long itemC = 3;
	public static final long itemD = 4;
	public static final long itemE = 5;
	public static final long itemF = 6;
	public static final long itemG = 7;
	public static final long itemI = 8;
	public static final long itemJ = 9;
	public static final long itemK = 10;
	public static final long itemL = 11;
	public static final long itemM = 12;
	public static final long itemN = 13;
	public static final long itemO = 14;
	public static final long itemP = 15;
	public static final long itemQ = 16;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static RequestedItem cNamedNumbers[] = {
	new RequestedItem(), 
	new RequestedItem(1), 
	new RequestedItem(2), 
	new RequestedItem(3), 
	new RequestedItem(4), 
	new RequestedItem(5), 
	new RequestedItem(6), 
	new RequestedItem(7), 
	new RequestedItem(8), 
	new RequestedItem(9), 
	new RequestedItem(10), 
	new RequestedItem(11), 
	new RequestedItem(12), 
	new RequestedItem(13), 
	new RequestedItem(14), 
	new RequestedItem(15), 
	new RequestedItem(16)
    };
    public static final RequestedItem reserved = cNamedNumbers[0];
    public static final RequestedItem itemA = cNamedNumbers[1];
    public static final RequestedItem itemB = cNamedNumbers[2];
    public static final RequestedItem itemC = cNamedNumbers[3];
    public static final RequestedItem itemD = cNamedNumbers[4];
    public static final RequestedItem itemE = cNamedNumbers[5];
    public static final RequestedItem itemF = cNamedNumbers[6];
    public static final RequestedItem itemG = cNamedNumbers[7];
    public static final RequestedItem itemI = cNamedNumbers[8];
    public static final RequestedItem itemJ = cNamedNumbers[9];
    public static final RequestedItem itemK = cNamedNumbers[10];
    public static final RequestedItem itemL = cNamedNumbers[11];
    public static final RequestedItem itemM = cNamedNumbers[12];
    public static final RequestedItem itemN = cNamedNumbers[13];
    public static final RequestedItem itemO = cNamedNumbers[14];
    public static final RequestedItem itemP = cNamedNumbers[15];
    public static final RequestedItem itemQ = cNamedNumbers[16];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"reserved",
	"itemA",
	"itemB",
	"itemC",
	"itemD",
	"itemE",
	"itemF",
	"itemG",
	"itemI",
	"itemJ",
	"itemK",
	"itemL",
	"itemM",
	"itemN",
	"itemO",
	"itemP",
	"itemQ"
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
	return (index < 0 || index >= 17 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 16)
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
    
    public static RequestedItem valueOf(long value)
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
    public static RequestedItem valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 17)
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
    public RequestedItem clone() {
	return (RequestedItem)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final RequestedItem cUnknownEnumerator = 
	new RequestedItem(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static RequestedItem unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RequestedItem getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for RequestedItem
