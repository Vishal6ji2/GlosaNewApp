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


package com.example.glosanewapp.j2735.addgrpc;

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
 * Define the Altitude ASN.1 type included in the AddGrpC ASN.1 module.
 * @see Sequence
 */

public class Altitude extends Sequence {
    public AltitudeValue value;
    public AltitudeConfidence confidence;
    
    /**
     * The default constructor.
     */
    public Altitude()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Altitude(AltitudeValue value, AltitudeConfidence confidence)
    {
	setValue(value);
	setConfidence(confidence);
    }
    
    
    // Methods for field "value"
    public AltitudeValue getValue()
    {
	return this.value;
    }
    
    public void setValue(AltitudeValue value)
    {
	this.value = value;
    }
    
    
    // Methods for field "confidence"
    public AltitudeConfidence getConfidence()
    {
	return this.confidence;
    }
    
    public void setConfidence(AltitudeConfidence confidence)
    {
	this.confidence = confidence;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__value("value"),
	__confidence("confidence"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Altitude data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'value'
	try {
	    AltitudeValue item1 = data.value;
	    long temp1 = item1.longValue();

	    if (temp1 < -100000 || temp1 > 800001)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, -100000, 800001, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("value", "AltitudeValue");
	    throw ee;
	}
	// Encode field 'confidence'
	try {
	    AltitudeConfidence item1 = data.confidence;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("confidence", "AltitudeConfidence");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Altitude decodeValue(PerCoder coder, InputBitStream source, Altitude data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'value'
	try {
	    long temp1;

	    if (data.value == null)
		data.value = new AltitudeValue();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -100000, 800001);
	    if (temp1 > 800001)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.value.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("value", "AltitudeValue");
	    throw de;
	}
	// Decode field 'confidence'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
	    if (idx1 < 0 || idx1 > 15)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.confidence = AltitudeConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("confidence", "AltitudeConfidence");
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
	// Encode field 'value'
	try {
	    AltitudeValue item1 = this.value;

	    {
		sink.encodeKey("value");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("value", "AltitudeValue");
	    throw ee;
	}
	// Encode field 'confidence'
	try {
	    AltitudeConfidence item1 = this.confidence;

	    {
		sink.writeSeparator();
		sink.encodeKey("confidence");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("confidence", "AltitudeConfidence");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Altitude decodeValue(JsonCoder coder, JsonReader source)
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
		    case __value:
		    // Decode field 'value'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.value == null)
			    this.value = new AltitudeValue();
			this.value.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("value", "AltitudeValue");
			throw de;
		    }
		    break;
		    case __confidence:
		    // Decode field 'confidence'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			AltitudeConfidence temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(AltitudeConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = AltitudeConfidence.cNamedNumbers[idx1];
			this.confidence = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("confidence", "AltitudeConfidence");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'value'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'confidence'");
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
	    writer.print("value ");
	    writer.print(this.value.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("confidence ");
	    printer.print(this.confidence, writer, this.confidence.cConstantNameList);
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
	return equalTo((Altitude)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Altitude)that);
    }
    
    public boolean equalTo(Altitude that) {
	if (!this.value.equalTo(that.value))
	    return false;
	if (!this.confidence.equalTo(that.confidence))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Altitude clone() {
	Altitude copy = (Altitude)super.clone();
	copy.value = value.clone();
	copy.confidence = confidence.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.value != null ? this.value.hashCode() : 0);
	hash = 41 * hash + (this.confidence != null ? this.confidence.hashCode() : 0);
	return hash;
    }
} // End class definition for Altitude
