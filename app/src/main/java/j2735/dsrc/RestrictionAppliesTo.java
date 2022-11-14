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


package j2735.dsrc;

import com.oss.asn1.*;
import com.oss.metadata.*;
import java.io.IOException;
import com.oss.coders.EncoderException;
import com.oss.coders.DecoderException;
import com.oss.util.ExceptionDescriptor;
import com.oss.asn1printer.DataPrinter;
import com.oss.asn1printer.DataPrinterException;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the RestrictionAppliesTo ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class RestrictionAppliesTo extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RestrictionAppliesTo()
    {
	super(0);
    }
    
    private RestrictionAppliesTo(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long none = 0;
	public static final long equippedTransit = 1;
	public static final long equippedTaxis = 2;
	public static final long equippedOther = 3;
	public static final long emissionCompliant = 4;
	public static final long equippedBicycle = 5;
	public static final long weightCompliant = 6;
	public static final long heightCompliant = 7;
	public static final long pedestrians = 8;
	public static final long slowMovingPersons = 9;
	public static final long wheelchairUsers = 10;
	public static final long visualDisabilities = 11;
	public static final long audioDisabilities = 12;
	public static final long otherUnknownDisabilities = 13;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static RestrictionAppliesTo cNamedNumbers[] = {
	new RestrictionAppliesTo(), 
	new RestrictionAppliesTo(1), 
	new RestrictionAppliesTo(2), 
	new RestrictionAppliesTo(3), 
	new RestrictionAppliesTo(4), 
	new RestrictionAppliesTo(5), 
	new RestrictionAppliesTo(6), 
	new RestrictionAppliesTo(7), 
	new RestrictionAppliesTo(8), 
	new RestrictionAppliesTo(9), 
	new RestrictionAppliesTo(10), 
	new RestrictionAppliesTo(11), 
	new RestrictionAppliesTo(12), 
	new RestrictionAppliesTo(13)
    };
    public static final RestrictionAppliesTo none = cNamedNumbers[0];
    public static final RestrictionAppliesTo equippedTransit = cNamedNumbers[1];
    public static final RestrictionAppliesTo equippedTaxis = cNamedNumbers[2];
    public static final RestrictionAppliesTo equippedOther = cNamedNumbers[3];
    public static final RestrictionAppliesTo emissionCompliant = cNamedNumbers[4];
    public static final RestrictionAppliesTo equippedBicycle = cNamedNumbers[5];
    public static final RestrictionAppliesTo weightCompliant = cNamedNumbers[6];
    public static final RestrictionAppliesTo heightCompliant = cNamedNumbers[7];
    public static final RestrictionAppliesTo pedestrians = cNamedNumbers[8];
    public static final RestrictionAppliesTo slowMovingPersons = cNamedNumbers[9];
    public static final RestrictionAppliesTo wheelchairUsers = cNamedNumbers[10];
    public static final RestrictionAppliesTo visualDisabilities = cNamedNumbers[11];
    public static final RestrictionAppliesTo audioDisabilities = cNamedNumbers[12];
    public static final RestrictionAppliesTo otherUnknownDisabilities = cNamedNumbers[13];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"none",
	"equippedTransit",
	"equippedTaxis",
	"equippedOther",
	"emissionCompliant",
	"equippedBicycle",
	"weightCompliant",
	"heightCompliant",
	"pedestrians",
	"slowMovingPersons",
	"wheelchairUsers",
	"visualDisabilities",
	"audioDisabilities",
	"otherUnknownDisabilities"
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
	return (index < 0 || index >= 14 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 13)
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
    
    public static RestrictionAppliesTo valueOf(long value)
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
    public static RestrictionAppliesTo valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 14)
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
    public RestrictionAppliesTo clone() {
	return (RestrictionAppliesTo)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final RestrictionAppliesTo cUnknownEnumerator = 
	new RestrictionAppliesTo(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static RestrictionAppliesTo unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RestrictionAppliesTo getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for RestrictionAppliesTo
