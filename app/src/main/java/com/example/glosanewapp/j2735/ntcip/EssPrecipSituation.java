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


package com.example.glosanewapp.j2735.ntcip;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the EssPrecipSituation ASN.1 type included in the NTCIP ASN.1 module.
 * @see Enumerated
 */

public final class EssPrecipSituation extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EssPrecipSituation()
    {
	super(1);
    }
    
    private EssPrecipSituation(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long other = 1;
	public static final long unknown = 2;
	public static final long noPrecipitation = 3;
	public static final long unidentifiedSlight = 4;
	public static final long unidentifiedModerate = 5;
	public static final long unidentifiedHeavy = 6;
	public static final long snowSlight = 7;
	public static final long snowModerate = 8;
	public static final long snowHeavy = 9;
	public static final long rainSlight = 10;
	public static final long rainModerate = 11;
	public static final long rainHeavy = 12;
	public static final long frozenPrecipitationSlight = 13;
	public static final long frozenPrecipitationModerate = 14;
	public static final long frozenPrecipitationHeavy = 15;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static EssPrecipSituation cNamedNumbers[] = {
	new EssPrecipSituation(), 
	new EssPrecipSituation(2), 
	new EssPrecipSituation(3), 
	new EssPrecipSituation(4), 
	new EssPrecipSituation(5), 
	new EssPrecipSituation(6), 
	new EssPrecipSituation(7), 
	new EssPrecipSituation(8), 
	new EssPrecipSituation(9), 
	new EssPrecipSituation(10), 
	new EssPrecipSituation(11), 
	new EssPrecipSituation(12), 
	new EssPrecipSituation(13), 
	new EssPrecipSituation(14), 
	new EssPrecipSituation(15)
    };
    public static final EssPrecipSituation other = cNamedNumbers[0];
    public static final EssPrecipSituation unknown = cNamedNumbers[1];
    public static final EssPrecipSituation noPrecipitation = cNamedNumbers[2];
    public static final EssPrecipSituation unidentifiedSlight = cNamedNumbers[3];
    public static final EssPrecipSituation unidentifiedModerate = cNamedNumbers[4];
    public static final EssPrecipSituation unidentifiedHeavy = cNamedNumbers[5];
    public static final EssPrecipSituation snowSlight = cNamedNumbers[6];
    public static final EssPrecipSituation snowModerate = cNamedNumbers[7];
    public static final EssPrecipSituation snowHeavy = cNamedNumbers[8];
    public static final EssPrecipSituation rainSlight = cNamedNumbers[9];
    public static final EssPrecipSituation rainModerate = cNamedNumbers[10];
    public static final EssPrecipSituation rainHeavy = cNamedNumbers[11];
    public static final EssPrecipSituation frozenPrecipitationSlight = cNamedNumbers[12];
    public static final EssPrecipSituation frozenPrecipitationModerate = cNamedNumbers[13];
    public static final EssPrecipSituation frozenPrecipitationHeavy = cNamedNumbers[14];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"other",
	"unknown",
	"noPrecipitation",
	"unidentifiedSlight",
	"unidentifiedModerate",
	"unidentifiedHeavy",
	"snowSlight",
	"snowModerate",
	"snowHeavy",
	"rainSlight",
	"rainModerate",
	"rainHeavy",
	"frozenPrecipitationSlight",
	"frozenPrecipitationModerate",
	"frozenPrecipitationHeavy"
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
	return (index < 0 || index >= 15 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 1 && value <= 15)
	    return (int)(value - 1);
	else
	    return -1;
    }
    
    /**
     * Returns an enumerator with a specified value or null if the value
     * is not associated with any enumerators.
     *  @param value the value of the enumerator to return.
     *  @return an enumerator with a specified value.
     */
    
    public static EssPrecipSituation valueOf(long value)
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
    public static EssPrecipSituation valueAt(int index)
    {
	if (index < 0 || index >= 15)
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
    public EssPrecipSituation clone() {
	return (EssPrecipSituation)super.clone();
    }

} // End class definition for EssPrecipSituation
