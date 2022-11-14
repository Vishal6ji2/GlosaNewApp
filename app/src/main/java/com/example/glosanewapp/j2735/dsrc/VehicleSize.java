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
import com.oss.coders.json.JsonCoder;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.per.PerCoder;
import com.oss.metadata.*;
import com.oss.util.ExceptionDescriptor;

import java.io.IOException;

/**
 * Define the VehicleSize ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class VehicleSize extends Sequence {
    public VehicleWidth width;
    public VehicleLength length;
    
    /**
     * The default constructor.
     */
    public VehicleSize()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleSize(VehicleWidth width, VehicleLength length)
    {
	setWidth(width);
	setLength(length);
    }
    
    
    // Methods for field "width"
    public VehicleWidth getWidth()
    {
	return this.width;
    }
    
    public void setWidth(VehicleWidth width)
    {
	this.width = width;
    }
    
    
    // Methods for field "length"
    public VehicleLength getLength()
    {
	return this.length;
    }
    
    public void setLength(VehicleLength length)
    {
	this.length = length;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__width("width"),
	__length("length"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(3);
	private __Tag(String tag) {
	    this.tag = tag;
	}
	private String getTag() {
	    return tag;
	}
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static __Tag getTagSub(String tag) {
	    return map.get(tag);
	}
	static {
	    for (__Tag t:values())
		map.put(t.getTag(), t);
	}
    }
    
    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleSize data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'width'
	try {
	    VehicleWidth item1 = data.width;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 1023)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 1023, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("width", "VehicleWidth");
	    throw ee;
	}
	// Encode field 'length'
	try {
	    VehicleLength item1 = data.length;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 4095)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 4095, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("length", "VehicleLength");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static VehicleSize decodeValue(PerCoder coder, InputBitStream source, VehicleSize data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'width'
	try {
	    long temp1;

	    if (data.width == null)
		data.width = new VehicleWidth();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1023);
	    if (temp1 > 1023)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.width.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("width", "VehicleWidth");
	    throw de;
	}
	// Decode field 'length'
	try {
	    long temp1;

	    if (data.length == null)
		data.length = new VehicleLength();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 4095);
	    if (temp1 > 4095)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.length.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("length", "VehicleLength");
	    throw de;
	}
	return data;
    }

    /**
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	sink.beginObject();
	// Encode field 'width'
	try {
	    VehicleWidth item1 = this.width;

	    {
		sink.encodeKey("width");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("width", "VehicleWidth");
	    throw ee;
	}
	// Encode field 'length'
	try {
	    VehicleLength item1 = this.length;

	    {
		sink.writeSeparator();
		sink.encodeKey("length");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("length", "VehicleLength");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleSize decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[3];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __width:
		    // Decode field 'width'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.width == null)
			    this.width = new VehicleWidth();
			this.width.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("width", "VehicleWidth");
			throw de;
		    }
		    break;
		    case __length:
		    // Decode field 'length'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.length == null)
			    this.length = new VehicleLength();
			this.length.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("length", "VehicleLength");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'width'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'length'");
	return this;
    }

    /**
     * Implements value printer for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void printValue(DataPrinter printer, java.io.PrintWriter writer)
	    throws Exception
    {
	boolean comma0;
	comma0 = false;
	writer.print('{');
	printer.indent();
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("width ");
	    writer.print(this.width.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("length ");
	    writer.print(this.length.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((VehicleSize)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleSize)that);
    }
    
    public boolean equalTo(VehicleSize that) {
	if (!this.width.equalTo(that.width))
	    return false;
	if (!this.length.equalTo(that.length))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleSize clone() {
	VehicleSize copy = (VehicleSize)super.clone();
	copy.width = width.clone();
	copy.length = length.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.width != null ? this.width.hashCode() : 0);
	hash = 41 * hash + (this.length != null ? this.length.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleSize
