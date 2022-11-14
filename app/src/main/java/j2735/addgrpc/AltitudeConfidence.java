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


package j2735.addgrpc;

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
 * Define the AltitudeConfidence ASN.1 type included in the AddGrpC ASN.1 module.
 * @see Enumerated
 */

public final class AltitudeConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private AltitudeConfidence()
    {
	super(0);
    }
    
    private AltitudeConfidence(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long alt_000_01 = 0;
	public static final long alt_000_02 = 1;
	public static final long alt_000_05 = 2;
	public static final long alt_000_10 = 3;
	public static final long alt_000_20 = 4;
	public static final long alt_000_50 = 5;
	public static final long alt_001_00 = 6;
	public static final long alt_002_00 = 7;
	public static final long alt_005_00 = 8;
	public static final long alt_010_00 = 9;
	public static final long alt_020_00 = 10;
	public static final long alt_050_00 = 11;
	public static final long alt_100_00 = 12;
	public static final long alt_200_00 = 13;
	public static final long outOfRange = 14;
	public static final long unavailable = 15;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static AltitudeConfidence cNamedNumbers[] = {
	new AltitudeConfidence(), 
	new AltitudeConfidence(1), 
	new AltitudeConfidence(2), 
	new AltitudeConfidence(3), 
	new AltitudeConfidence(4), 
	new AltitudeConfidence(5), 
	new AltitudeConfidence(6), 
	new AltitudeConfidence(7), 
	new AltitudeConfidence(8), 
	new AltitudeConfidence(9), 
	new AltitudeConfidence(10), 
	new AltitudeConfidence(11), 
	new AltitudeConfidence(12), 
	new AltitudeConfidence(13), 
	new AltitudeConfidence(14), 
	new AltitudeConfidence(15)
    };
    public static final AltitudeConfidence alt_000_01 = cNamedNumbers[0];
    public static final AltitudeConfidence alt_000_02 = cNamedNumbers[1];
    public static final AltitudeConfidence alt_000_05 = cNamedNumbers[2];
    public static final AltitudeConfidence alt_000_10 = cNamedNumbers[3];
    public static final AltitudeConfidence alt_000_20 = cNamedNumbers[4];
    public static final AltitudeConfidence alt_000_50 = cNamedNumbers[5];
    public static final AltitudeConfidence alt_001_00 = cNamedNumbers[6];
    public static final AltitudeConfidence alt_002_00 = cNamedNumbers[7];
    public static final AltitudeConfidence alt_005_00 = cNamedNumbers[8];
    public static final AltitudeConfidence alt_010_00 = cNamedNumbers[9];
    public static final AltitudeConfidence alt_020_00 = cNamedNumbers[10];
    public static final AltitudeConfidence alt_050_00 = cNamedNumbers[11];
    public static final AltitudeConfidence alt_100_00 = cNamedNumbers[12];
    public static final AltitudeConfidence alt_200_00 = cNamedNumbers[13];
    public static final AltitudeConfidence outOfRange = cNamedNumbers[14];
    public static final AltitudeConfidence unavailable = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"alt-000-01",
	"alt-000-02",
	"alt-000-05",
	"alt-000-10",
	"alt-000-20",
	"alt-000-50",
	"alt-001-00",
	"alt-002-00",
	"alt-005-00",
	"alt-010-00",
	"alt-020-00",
	"alt-050-00",
	"alt-100-00",
	"alt-200-00",
	"outOfRange",
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
    
    public static AltitudeConfidence valueOf(long value)
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
    public static AltitudeConfidence valueAt(int index)
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
    public AltitudeConfidence clone() {
	return (AltitudeConfidence)super.clone();
    }

} // End class definition for AltitudeConfidence
