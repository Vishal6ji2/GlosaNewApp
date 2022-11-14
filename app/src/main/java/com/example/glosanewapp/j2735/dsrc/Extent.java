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
 * Define the Extent ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class Extent extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Extent()
    {
	super(0);
    }
    
    private Extent(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long useInstantlyOnly = 0;
	public static final long useFor3meters = 1;
	public static final long useFor10meters = 2;
	public static final long useFor50meters = 3;
	public static final long useFor100meters = 4;
	public static final long useFor500meters = 5;
	public static final long useFor1000meters = 6;
	public static final long useFor5000meters = 7;
	public static final long useFor10000meters = 8;
	public static final long useFor50000meters = 9;
	public static final long useFor100000meters = 10;
	public static final long useFor500000meters = 11;
	public static final long useFor1000000meters = 12;
	public static final long useFor5000000meters = 13;
	public static final long useFor10000000meters = 14;
	public static final long forever = 15;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static Extent cNamedNumbers[] = {
	new Extent(), 
	new Extent(1), 
	new Extent(2), 
	new Extent(3), 
	new Extent(4), 
	new Extent(5), 
	new Extent(6), 
	new Extent(7), 
	new Extent(8), 
	new Extent(9), 
	new Extent(10), 
	new Extent(11), 
	new Extent(12), 
	new Extent(13), 
	new Extent(14), 
	new Extent(15)
    };
    public static final Extent useInstantlyOnly = cNamedNumbers[0];
    public static final Extent useFor3meters = cNamedNumbers[1];
    public static final Extent useFor10meters = cNamedNumbers[2];
    public static final Extent useFor50meters = cNamedNumbers[3];
    public static final Extent useFor100meters = cNamedNumbers[4];
    public static final Extent useFor500meters = cNamedNumbers[5];
    public static final Extent useFor1000meters = cNamedNumbers[6];
    public static final Extent useFor5000meters = cNamedNumbers[7];
    public static final Extent useFor10000meters = cNamedNumbers[8];
    public static final Extent useFor50000meters = cNamedNumbers[9];
    public static final Extent useFor100000meters = cNamedNumbers[10];
    public static final Extent useFor500000meters = cNamedNumbers[11];
    public static final Extent useFor1000000meters = cNamedNumbers[12];
    public static final Extent useFor5000000meters = cNamedNumbers[13];
    public static final Extent useFor10000000meters = cNamedNumbers[14];
    public static final Extent forever = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"useInstantlyOnly",
	"useFor3meters",
	"useFor10meters",
	"useFor50meters",
	"useFor100meters",
	"useFor500meters",
	"useFor1000meters",
	"useFor5000meters",
	"useFor10000meters",
	"useFor50000meters",
	"useFor100000meters",
	"useFor500000meters",
	"useFor1000000meters",
	"useFor5000000meters",
	"useFor10000000meters",
	"forever"
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
    
    public static Extent valueOf(long value)
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
    public static Extent valueAt(int index)
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
    public Extent clone() {
	return (Extent)super.clone();
    }

} // End class definition for Extent
