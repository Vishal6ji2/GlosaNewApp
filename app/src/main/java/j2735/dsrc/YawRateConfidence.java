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
 * Define the YawRateConfidence ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class YawRateConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private YawRateConfidence()
    {
	super(0);
    }
    
    private YawRateConfidence(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long unavailable = 0;
	public static final long degSec_100_00 = 1;
	public static final long degSec_010_00 = 2;
	public static final long degSec_005_00 = 3;
	public static final long degSec_001_00 = 4;
	public static final long degSec_000_10 = 5;
	public static final long degSec_000_05 = 6;
	public static final long degSec_000_01 = 7;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static YawRateConfidence cNamedNumbers[] = {
	new YawRateConfidence(), 
	new YawRateConfidence(1), 
	new YawRateConfidence(2), 
	new YawRateConfidence(3), 
	new YawRateConfidence(4), 
	new YawRateConfidence(5), 
	new YawRateConfidence(6), 
	new YawRateConfidence(7)
    };
    public static final YawRateConfidence unavailable = cNamedNumbers[0];
    public static final YawRateConfidence degSec_100_00 = cNamedNumbers[1];
    public static final YawRateConfidence degSec_010_00 = cNamedNumbers[2];
    public static final YawRateConfidence degSec_005_00 = cNamedNumbers[3];
    public static final YawRateConfidence degSec_001_00 = cNamedNumbers[4];
    public static final YawRateConfidence degSec_000_10 = cNamedNumbers[5];
    public static final YawRateConfidence degSec_000_05 = cNamedNumbers[6];
    public static final YawRateConfidence degSec_000_01 = cNamedNumbers[7];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"degSec-100-00",
	"degSec-010-00",
	"degSec-005-00",
	"degSec-001-00",
	"degSec-000-10",
	"degSec-000-05",
	"degSec-000-01"
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
    
    public static YawRateConfidence valueOf(long value)
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
    public static YawRateConfidence valueAt(int index)
    {
	if (index < 0 || index >= 8)
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
    public YawRateConfidence clone() {
	return (YawRateConfidence)super.clone();
    }

} // End class definition for YawRateConfidence
