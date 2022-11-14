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
 * Define the Node-XY-22b ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class Node_XY_22b extends Sequence {
    public Offset_B11 x;
    public Offset_B11 y;
    
    /**
     * The default constructor.
     */
    public Node_XY_22b()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node_XY_22b(Offset_B11 x, Offset_B11 y)
    {
	setX(x);
	setY(y);
    }
    
    
    // Methods for field "x"
    public Offset_B11 getX()
    {
	return this.x;
    }
    
    public void setX(Offset_B11 x)
    {
	this.x = x;
    }
    
    
    // Methods for field "y"
    public Offset_B11 getY()
    {
	return this.y;
    }
    
    public void setY(Offset_B11 y)
    {
	this.y = y;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__x("x"),
	__y("y"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Node_XY_22b data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'x'
	try {
	    Offset_B11 item1 = data.x;
	    long temp1 = item1.longValue();

	    if (temp1 < -1024 || temp1 > 1023)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, -1024, 1023, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("x", "Offset-B11");
	    throw ee;
	}
	// Encode field 'y'
	try {
	    Offset_B11 item1 = data.y;
	    long temp1 = item1.longValue();

	    if (temp1 < -1024 || temp1 > 1023)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -1024, 1023, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("y", "Offset-B11");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Node_XY_22b decodeValue(PerCoder coder, InputBitStream source, Node_XY_22b data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'x'
	try {
	    long temp1;

	    if (data.x == null)
		data.x = new Offset_B11();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -1024, 1023);
	    if (temp1 > 1023)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.x.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("x", "Offset-B11");
	    throw de;
	}
	// Decode field 'y'
	try {
	    long temp1;

	    if (data.y == null)
		data.y = new Offset_B11();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -1024, 1023);
	    if (temp1 > 1023)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.y.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("y", "Offset-B11");
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
	// Encode field 'x'
	try {
	    Offset_B11 item1 = this.x;

	    {
		sink.encodeKey("x");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("x", "Offset-B11");
	    throw ee;
	}
	// Encode field 'y'
	try {
	    Offset_B11 item1 = this.y;

	    {
		sink.writeSeparator();
		sink.encodeKey("y");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("y", "Offset-B11");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Node_XY_22b decodeValue(JsonCoder coder, JsonReader source)
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
		    case __x:
		    // Decode field 'x'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.x == null)
			    this.x = new Offset_B11();
			this.x.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("x", "Offset-B11");
			throw de;
		    }
		    break;
		    case __y:
		    // Decode field 'y'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.y == null)
			    this.y = new Offset_B11();
			this.y.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("y", "Offset-B11");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'x'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'y'");
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
	    writer.print("x ");
	    writer.print(this.x.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("y ");
	    writer.print(this.y.longValue());
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
	return equalTo((Node_XY_22b)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Node_XY_22b)that);
    }
    
    public boolean equalTo(Node_XY_22b that) {
	if (!this.x.equalTo(that.x))
	    return false;
	if (!this.y.equalTo(that.y))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Node_XY_22b clone() {
	Node_XY_22b copy = (Node_XY_22b)super.clone();
	copy.x = x.clone();
	copy.y = y.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.x != null ? this.x.hashCode() : 0);
	hash = 41 * hash + (this.y != null ? this.y.hashCode() : 0);
	return hash;
    }
} // End class definition for Node_XY_22b
