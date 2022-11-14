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
 * Define the AntennaOffsetSet ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class AntennaOffsetSet extends Sequence {
    public Offset_B12 antOffsetX;
    public Offset_B09 antOffsetY;
    public Offset_B10 antOffsetZ;
    
    /**
     * The default constructor.
     */
    public AntennaOffsetSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AntennaOffsetSet(Offset_B12 antOffsetX, Offset_B09 antOffsetY, 
		    Offset_B10 antOffsetZ)
    {
	setAntOffsetX(antOffsetX);
	setAntOffsetY(antOffsetY);
	setAntOffsetZ(antOffsetZ);
    }
    
    
    // Methods for field "antOffsetX"
    public Offset_B12 getAntOffsetX()
    {
	return this.antOffsetX;
    }
    
    public void setAntOffsetX(Offset_B12 antOffsetX)
    {
	this.antOffsetX = antOffsetX;
    }
    
    
    // Methods for field "antOffsetY"
    public Offset_B09 getAntOffsetY()
    {
	return this.antOffsetY;
    }
    
    public void setAntOffsetY(Offset_B09 antOffsetY)
    {
	this.antOffsetY = antOffsetY;
    }
    
    
    // Methods for field "antOffsetZ"
    public Offset_B10 getAntOffsetZ()
    {
	return this.antOffsetZ;
    }
    
    public void setAntOffsetZ(Offset_B10 antOffsetZ)
    {
	this.antOffsetZ = antOffsetZ;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__antOffsetX("antOffsetX"),
	__antOffsetY("antOffsetY"),
	__antOffsetZ("antOffsetZ"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(4);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AntennaOffsetSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'antOffsetX'
	try {
	    Offset_B12 item1 = data.antOffsetX;
	    long temp1 = item1.longValue();

	    if (temp1 < -2048 || temp1 > 2047)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, -2048, 2047, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("antOffsetX", "Offset-B12");
	    throw ee;
	}
	// Encode field 'antOffsetY'
	try {
	    Offset_B09 item1 = data.antOffsetY;
	    long temp1 = item1.longValue();

	    if (temp1 < -256 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -256, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("antOffsetY", "Offset-B09");
	    throw ee;
	}
	// Encode field 'antOffsetZ'
	try {
	    Offset_B10 item1 = data.antOffsetZ;
	    long temp1 = item1.longValue();

	    if (temp1 < -512 || temp1 > 511)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -512, 511, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("antOffsetZ", "Offset-B10");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static AntennaOffsetSet decodeValue(PerCoder coder, InputBitStream source, AntennaOffsetSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'antOffsetX'
	try {
	    long temp1;

	    if (data.antOffsetX == null)
		data.antOffsetX = new Offset_B12();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -2048, 2047);
	    if (temp1 > 2047)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.antOffsetX.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("antOffsetX", "Offset-B12");
	    throw de;
	}
	// Decode field 'antOffsetY'
	try {
	    long temp1;

	    if (data.antOffsetY == null)
		data.antOffsetY = new Offset_B09();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -256, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.antOffsetY.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("antOffsetY", "Offset-B09");
	    throw de;
	}
	// Decode field 'antOffsetZ'
	try {
	    long temp1;

	    if (data.antOffsetZ == null)
		data.antOffsetZ = new Offset_B10();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -512, 511);
	    if (temp1 > 511)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.antOffsetZ.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("antOffsetZ", "Offset-B10");
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
	// Encode field 'antOffsetX'
	try {
	    Offset_B12 item1 = this.antOffsetX;

	    {
		sink.encodeKey("antOffsetX");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("antOffsetX", "Offset-B12");
	    throw ee;
	}
	// Encode field 'antOffsetY'
	try {
	    Offset_B09 item1 = this.antOffsetY;

	    {
		sink.writeSeparator();
		sink.encodeKey("antOffsetY");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("antOffsetY", "Offset-B09");
	    throw ee;
	}
	// Encode field 'antOffsetZ'
	try {
	    Offset_B10 item1 = this.antOffsetZ;

	    {
		sink.writeSeparator();
		sink.encodeKey("antOffsetZ");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("antOffsetZ", "Offset-B10");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AntennaOffsetSet decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __antOffsetX:
		    // Decode field 'antOffsetX'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.antOffsetX == null)
			    this.antOffsetX = new Offset_B12();
			this.antOffsetX.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("antOffsetX", "Offset-B12");
			throw de;
		    }
		    break;
		    case __antOffsetY:
		    // Decode field 'antOffsetY'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.antOffsetY == null)
			    this.antOffsetY = new Offset_B09();
			this.antOffsetY.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("antOffsetY", "Offset-B09");
			throw de;
		    }
		    break;
		    case __antOffsetZ:
		    // Decode field 'antOffsetZ'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.antOffsetZ == null)
			    this.antOffsetZ = new Offset_B10();
			this.antOffsetZ.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("antOffsetZ", "Offset-B10");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'antOffsetX'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'antOffsetY'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'antOffsetZ'");
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
	    writer.print("antOffsetX ");
	    writer.print(this.antOffsetX.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("antOffsetY ");
	    writer.print(this.antOffsetY.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("antOffsetZ ");
	    writer.print(this.antOffsetZ.longValue());
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
	return equalTo((AntennaOffsetSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AntennaOffsetSet)that);
    }
    
    public boolean equalTo(AntennaOffsetSet that) {
	if (!this.antOffsetX.equalTo(that.antOffsetX))
	    return false;
	if (!this.antOffsetY.equalTo(that.antOffsetY))
	    return false;
	if (!this.antOffsetZ.equalTo(that.antOffsetZ))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AntennaOffsetSet clone() {
	AntennaOffsetSet copy = (AntennaOffsetSet)super.clone();
	copy.antOffsetX = antOffsetX.clone();
	copy.antOffsetY = antOffsetY.clone();
	copy.antOffsetZ = antOffsetZ.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.antOffsetX != null ? this.antOffsetX.hashCode() : 0);
	hash = 41 * hash + (this.antOffsetY != null ? this.antOffsetY.hashCode() : 0);
	hash = 41 * hash + (this.antOffsetZ != null ? this.antOffsetZ.hashCode() : 0);
	return hash;
    }
} // End class definition for AntennaOffsetSet
