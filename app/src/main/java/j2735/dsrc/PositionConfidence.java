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
 * Define the PositionConfidence ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class PositionConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PositionConfidence()
    {
	super(0);
    }
    
    private PositionConfidence(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long unavailable = 0;
	public static final long a500m = 1;
	public static final long a200m = 2;
	public static final long a100m = 3;
	public static final long a50m = 4;
	public static final long a20m = 5;
	public static final long a10m = 6;
	public static final long a5m = 7;
	public static final long a2m = 8;
	public static final long a1m = 9;
	public static final long a50cm = 10;
	public static final long a20cm = 11;
	public static final long a10cm = 12;
	public static final long a5cm = 13;
	public static final long a2cm = 14;
	public static final long a1cm = 15;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static PositionConfidence cNamedNumbers[] = {
	new PositionConfidence(), 
	new PositionConfidence(1), 
	new PositionConfidence(2), 
	new PositionConfidence(3), 
	new PositionConfidence(4), 
	new PositionConfidence(5), 
	new PositionConfidence(6), 
	new PositionConfidence(7), 
	new PositionConfidence(8), 
	new PositionConfidence(9), 
	new PositionConfidence(10), 
	new PositionConfidence(11), 
	new PositionConfidence(12), 
	new PositionConfidence(13), 
	new PositionConfidence(14), 
	new PositionConfidence(15)
    };
    public static final PositionConfidence unavailable = cNamedNumbers[0];
    public static final PositionConfidence a500m = cNamedNumbers[1];
    public static final PositionConfidence a200m = cNamedNumbers[2];
    public static final PositionConfidence a100m = cNamedNumbers[3];
    public static final PositionConfidence a50m = cNamedNumbers[4];
    public static final PositionConfidence a20m = cNamedNumbers[5];
    public static final PositionConfidence a10m = cNamedNumbers[6];
    public static final PositionConfidence a5m = cNamedNumbers[7];
    public static final PositionConfidence a2m = cNamedNumbers[8];
    public static final PositionConfidence a1m = cNamedNumbers[9];
    public static final PositionConfidence a50cm = cNamedNumbers[10];
    public static final PositionConfidence a20cm = cNamedNumbers[11];
    public static final PositionConfidence a10cm = cNamedNumbers[12];
    public static final PositionConfidence a5cm = cNamedNumbers[13];
    public static final PositionConfidence a2cm = cNamedNumbers[14];
    public static final PositionConfidence a1cm = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"a500m",
	"a200m",
	"a100m",
	"a50m",
	"a20m",
	"a10m",
	"a5m",
	"a2m",
	"a1m",
	"a50cm",
	"a20cm",
	"a10cm",
	"a5cm",
	"a2cm",
	"a1cm"
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
    
    public static PositionConfidence valueOf(long value)
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
    public static PositionConfidence valueAt(int index)
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
    public PositionConfidence clone() {
	return (PositionConfidence)super.clone();
    }

} // End class definition for PositionConfidence
