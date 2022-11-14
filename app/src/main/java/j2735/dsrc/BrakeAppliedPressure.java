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
 * Define the BrakeAppliedPressure ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class BrakeAppliedPressure extends Enumerated {
    
    /**
     * The default constructor.
     */
    private BrakeAppliedPressure()
    {
	super(0);
    }
    
    private BrakeAppliedPressure(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long unavailable = 0;
	public static final long minPressure = 1;
	public static final long bkLvl_2 = 2;
	public static final long bkLvl_3 = 3;
	public static final long bkLvl_4 = 4;
	public static final long bkLvl_5 = 5;
	public static final long bkLvl_6 = 6;
	public static final long bkLvl_7 = 7;
	public static final long bkLvl_8 = 8;
	public static final long bkLvl_9 = 9;
	public static final long bkLvl_10 = 10;
	public static final long bkLvl_11 = 11;
	public static final long bkLvl_12 = 12;
	public static final long bkLvl_13 = 13;
	public static final long bkLvl_14 = 14;
	public static final long maxPressure = 15;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static BrakeAppliedPressure cNamedNumbers[] = {
	new BrakeAppliedPressure(), 
	new BrakeAppliedPressure(1), 
	new BrakeAppliedPressure(2), 
	new BrakeAppliedPressure(3), 
	new BrakeAppliedPressure(4), 
	new BrakeAppliedPressure(5), 
	new BrakeAppliedPressure(6), 
	new BrakeAppliedPressure(7), 
	new BrakeAppliedPressure(8), 
	new BrakeAppliedPressure(9), 
	new BrakeAppliedPressure(10), 
	new BrakeAppliedPressure(11), 
	new BrakeAppliedPressure(12), 
	new BrakeAppliedPressure(13), 
	new BrakeAppliedPressure(14), 
	new BrakeAppliedPressure(15)
    };
    public static final BrakeAppliedPressure unavailable = cNamedNumbers[0];
    public static final BrakeAppliedPressure minPressure = cNamedNumbers[1];
    public static final BrakeAppliedPressure bkLvl_2 = cNamedNumbers[2];
    public static final BrakeAppliedPressure bkLvl_3 = cNamedNumbers[3];
    public static final BrakeAppliedPressure bkLvl_4 = cNamedNumbers[4];
    public static final BrakeAppliedPressure bkLvl_5 = cNamedNumbers[5];
    public static final BrakeAppliedPressure bkLvl_6 = cNamedNumbers[6];
    public static final BrakeAppliedPressure bkLvl_7 = cNamedNumbers[7];
    public static final BrakeAppliedPressure bkLvl_8 = cNamedNumbers[8];
    public static final BrakeAppliedPressure bkLvl_9 = cNamedNumbers[9];
    public static final BrakeAppliedPressure bkLvl_10 = cNamedNumbers[10];
    public static final BrakeAppliedPressure bkLvl_11 = cNamedNumbers[11];
    public static final BrakeAppliedPressure bkLvl_12 = cNamedNumbers[12];
    public static final BrakeAppliedPressure bkLvl_13 = cNamedNumbers[13];
    public static final BrakeAppliedPressure bkLvl_14 = cNamedNumbers[14];
    public static final BrakeAppliedPressure maxPressure = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"minPressure",
	"bkLvl-2",
	"bkLvl-3",
	"bkLvl-4",
	"bkLvl-5",
	"bkLvl-6",
	"bkLvl-7",
	"bkLvl-8",
	"bkLvl-9",
	"bkLvl-10",
	"bkLvl-11",
	"bkLvl-12",
	"bkLvl-13",
	"bkLvl-14",
	"maxPressure"
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
    
    public static BrakeAppliedPressure valueOf(long value)
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
    public static BrakeAppliedPressure valueAt(int index)
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
    public BrakeAppliedPressure clone() {
	return (BrakeAppliedPressure)super.clone();
    }

} // End class definition for BrakeAppliedPressure
