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
 * Define the RequestImportanceLevel ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class RequestImportanceLevel extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RequestImportanceLevel()
    {
	super(0);
    }
    
    private RequestImportanceLevel(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long requestImportanceLevelUnKnown = 0;
	public static final long requestImportanceLevel1 = 1;
	public static final long requestImportanceLevel2 = 2;
	public static final long requestImportanceLevel3 = 3;
	public static final long requestImportanceLevel4 = 4;
	public static final long requestImportanceLevel5 = 5;
	public static final long requestImportanceLevel6 = 6;
	public static final long requestImportanceLevel7 = 7;
	public static final long requestImportanceLevel8 = 8;
	public static final long requestImportanceLevel9 = 9;
	public static final long requestImportanceLevel10 = 10;
	public static final long requestImportanceLevel11 = 11;
	public static final long requestImportanceLevel12 = 12;
	public static final long requestImportanceLevel13 = 13;
	public static final long requestImportanceLevel14 = 14;
	public static final long requestImportanceReserved = 15;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static RequestImportanceLevel cNamedNumbers[] = {
	new RequestImportanceLevel(), 
	new RequestImportanceLevel(1), 
	new RequestImportanceLevel(2), 
	new RequestImportanceLevel(3), 
	new RequestImportanceLevel(4), 
	new RequestImportanceLevel(5), 
	new RequestImportanceLevel(6), 
	new RequestImportanceLevel(7), 
	new RequestImportanceLevel(8), 
	new RequestImportanceLevel(9), 
	new RequestImportanceLevel(10), 
	new RequestImportanceLevel(11), 
	new RequestImportanceLevel(12), 
	new RequestImportanceLevel(13), 
	new RequestImportanceLevel(14), 
	new RequestImportanceLevel(15)
    };
    public static final RequestImportanceLevel requestImportanceLevelUnKnown = cNamedNumbers[0];
    public static final RequestImportanceLevel requestImportanceLevel1 = cNamedNumbers[1];
    public static final RequestImportanceLevel requestImportanceLevel2 = cNamedNumbers[2];
    public static final RequestImportanceLevel requestImportanceLevel3 = cNamedNumbers[3];
    public static final RequestImportanceLevel requestImportanceLevel4 = cNamedNumbers[4];
    public static final RequestImportanceLevel requestImportanceLevel5 = cNamedNumbers[5];
    public static final RequestImportanceLevel requestImportanceLevel6 = cNamedNumbers[6];
    public static final RequestImportanceLevel requestImportanceLevel7 = cNamedNumbers[7];
    public static final RequestImportanceLevel requestImportanceLevel8 = cNamedNumbers[8];
    public static final RequestImportanceLevel requestImportanceLevel9 = cNamedNumbers[9];
    public static final RequestImportanceLevel requestImportanceLevel10 = cNamedNumbers[10];
    public static final RequestImportanceLevel requestImportanceLevel11 = cNamedNumbers[11];
    public static final RequestImportanceLevel requestImportanceLevel12 = cNamedNumbers[12];
    public static final RequestImportanceLevel requestImportanceLevel13 = cNamedNumbers[13];
    public static final RequestImportanceLevel requestImportanceLevel14 = cNamedNumbers[14];
    public static final RequestImportanceLevel requestImportanceReserved = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"requestImportanceLevelUnKnown",
	"requestImportanceLevel1",
	"requestImportanceLevel2",
	"requestImportanceLevel3",
	"requestImportanceLevel4",
	"requestImportanceLevel5",
	"requestImportanceLevel6",
	"requestImportanceLevel7",
	"requestImportanceLevel8",
	"requestImportanceLevel9",
	"requestImportanceLevel10",
	"requestImportanceLevel11",
	"requestImportanceLevel12",
	"requestImportanceLevel13",
	"requestImportanceLevel14",
	"requestImportanceReserved"
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
    
    public static RequestImportanceLevel valueOf(long value)
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
    public static RequestImportanceLevel valueAt(int index)
    {
	if (index < 0 || index >= 16)
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
    public RequestImportanceLevel clone() {
	return (RequestImportanceLevel)super.clone();
    }

} // End class definition for RequestImportanceLevel
