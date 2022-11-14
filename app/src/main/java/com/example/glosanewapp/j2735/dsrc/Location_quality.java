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
import com.oss.asn1printer.DataPrinter;
import com.oss.coders.DecoderException;
import com.oss.coders.EncoderException;
import com.oss.coders.InputBitStream;
import com.oss.coders.OutputBitStream;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.per.PerCoder;
import com.oss.metadata.*;
import com.oss.util.ExceptionDescriptor;

/**
 * Define the Location-quality ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class Location_quality extends Enumerated implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    
    /**
     * The default constructor.
     */
    private Location_quality()
    {
	super(0);
    }
    
    private Location_quality(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long loc_qual_bt1m = 0;
	public static final long loc_qual_bt5m = 1;
	public static final long loc_qual_bt12m = 2;
	public static final long loc_qual_bt50m = 3;
	public static final long loc_qual_bt125m = 4;
	public static final long loc_qual_bt500m = 5;
	public static final long loc_qual_bt1250m = 6;
	public static final long loc_qual_unknown = 7;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static Location_quality cNamedNumbers[] = {
	new Location_quality(), 
	new Location_quality(1), 
	new Location_quality(2), 
	new Location_quality(3), 
	new Location_quality(4), 
	new Location_quality(5), 
	new Location_quality(6), 
	new Location_quality(7)
    };
    public static final Location_quality loc_qual_bt1m = cNamedNumbers[0];
    public static final Location_quality loc_qual_bt5m = cNamedNumbers[1];
    public static final Location_quality loc_qual_bt12m = cNamedNumbers[2];
    public static final Location_quality loc_qual_bt50m = cNamedNumbers[3];
    public static final Location_quality loc_qual_bt125m = cNamedNumbers[4];
    public static final Location_quality loc_qual_bt500m = cNamedNumbers[5];
    public static final Location_quality loc_qual_bt1250m = cNamedNumbers[6];
    public static final Location_quality loc_qual_unknown = cNamedNumbers[7];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"loc-qual-bt1m",
	"loc-qual-bt5m",
	"loc-qual-bt12m",
	"loc-qual-bt50m",
	"loc-qual-bt125m",
	"loc-qual-bt500m",
	"loc-qual-bt1250m",
	"loc-qual-unknown"
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
    
    public static Location_quality valueOf(long value)
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
    public static Location_quality valueAt(int index)
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
     * Encode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int encode(PerCoder coder, OutputBitStream sink)
	    throws EncoderException
    {
	try {
	    int idx0 = this.indexOf();

	    if (idx0 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + this.mValue);
	    return coder.encodeConstrainedWholeNumber(idx0, 0, 7, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "Location-quality");
	    throw ee;
	}
    }

    /**
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    int idx0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx0 < 0 || idx0 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx0);
	    return Location_quality.valueAt(idx0);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "Location-quality");
	    throw de;
	}
    }

    /**
     * Encode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encode(JsonCoder coder, JsonWriter sink)
	    throws EncoderException
    {
	try {
	    sink.writeString(this.name());

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "Location-quality");
	    throw ee;
	}
    }

    /**
     * Decode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(JsonCoder coder, JsonReader source)
	    throws DecoderException
    {
	try {
	    String content0 = coder.decodeString(source);
	    int idx0;
	    Location_quality temp0;

	    idx0 = coder.resolveName(Location_quality.cConstantNameList, content0);
	    if (idx0 < 0 )
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content0);
	    else
		temp0 = Location_quality.cNamedNumbers[idx0];
	    return temp0;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "Location-quality");
	    throw de;
	}
    }

    /**
     * Implements value printer for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void printValue(DataPrinter printer, java.io.PrintWriter writer)
	    throws Exception
    {
	printer.print(this, writer, this.cConstantNameList);
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "Location-quality";
    }

    /**
     * Clone 'this' object.
     */
    public Location_quality clone() {
	return (Location_quality)super.clone();
    }

    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return Location_quality.loc_qual_bt1m;
	}
    };
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ASN1Type get_ASN1Type()
    {
	return _type;
    }
    
} // End class definition for Location_quality
