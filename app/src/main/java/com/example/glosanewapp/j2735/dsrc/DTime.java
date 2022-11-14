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

import java.io.IOException;

/**
 * Define the DTime ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class DTime extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public DHour hour;
    public DMinute minute;
    public DSecond second;
    public DOffset offset;
    
    /**
     * The default constructor.
     */
    public DTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DTime(DHour hour, DMinute minute, DSecond second, DOffset offset)
    {
	setHour(hour);
	setMinute(minute);
	setSecond(second);
	setOffset(offset);
    }
    
    /**
     * Construct with required components.
     */
    public DTime(DHour hour, DMinute minute, DSecond second)
    {
	setHour(hour);
	setMinute(minute);
	setSecond(second);
    }
    
    
    // Methods for field "hour"
    public DHour getHour()
    {
	return this.hour;
    }
    
    public void setHour(DHour hour)
    {
	this.hour = hour;
    }
    
    
    // Methods for field "minute"
    public DMinute getMinute()
    {
	return this.minute;
    }
    
    public void setMinute(DMinute minute)
    {
	this.minute = minute;
    }
    
    
    // Methods for field "second"
    public DSecond getSecond()
    {
	return this.second;
    }
    
    public void setSecond(DSecond second)
    {
	this.second = second;
    }
    
    
    // Methods for field "offset"
    public DOffset getOffset()
    {
	return this.offset;
    }
    
    public void setOffset(DOffset offset)
    {
	this.offset = offset;
    }
    
    public boolean hasOffset()
    {
	return (offset != null);
    }
    
    public void deleteOffset()
    {
	offset = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__hour("hour"),
	__minute("minute"),
	__second("second"),
	__offset("offset"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(5);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DTime data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.offset != null);
	++nbits;
	// Encode field 'hour'
	try {
	    DHour item1 = data.hour;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("hour", "DHour");
	    throw ee;
	}
	// Encode field 'minute'
	try {
	    DMinute item1 = data.minute;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 60)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 60, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minute", "DMinute");
	    throw ee;
	}
	// Encode field 'second'
	try {
	    DSecond item1 = data.second;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 65535)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("second", "DSecond");
	    throw ee;
	}
	if (data.offset != null) {
	    // Encode field 'offset'
	    try {
		DOffset item1 = data.offset;
		long temp1 = item1.longValue();

		if (temp1 < -840 || temp1 > 840)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -840, 840, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("offset", "DOffset");
		throw ee;
	    }
	}

	return nbits;
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
	    return this.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "DTime");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static DTime decodeValue(PerCoder coder, InputBitStream source, DTime data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_offset0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'hour'
	try {
	    long temp1;

	    if (data.hour == null)
		data.hour = new DHour();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.hour.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("hour", "DHour");
	    throw de;
	}
	// Decode field 'minute'
	try {
	    long temp1;

	    if (data.minute == null)
		data.minute = new DMinute();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 60);
	    if (temp1 > 60)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.minute.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("minute", "DMinute");
	    throw de;
	}
	// Decode field 'second'
	try {
	    long temp1;

	    if (data.second == null)
		data.second = new DSecond();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.second.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("second", "DSecond");
	    throw de;
	}
	if (has_offset0) {
	    // Decode field 'offset'
	    try {
		long temp1;

		if (data.offset == null)
		    data.offset = new DOffset();
		temp1 = coder.decodeConstrainedWholeNumber(source, -840, 840);
		if (temp1 > 840)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.offset.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("offset", "DOffset");
		throw de;
	    }
	} else {
	    data.offset = null;
	}
	return data;
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
	    this.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "DTime");
	    throw de;
	}
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
	// Encode field 'hour'
	try {
	    DHour item1 = this.hour;

	    {
		sink.encodeKey("hour");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("hour", "DHour");
	    throw ee;
	}
	// Encode field 'minute'
	try {
	    DMinute item1 = this.minute;

	    {
		sink.writeSeparator();
		sink.encodeKey("minute");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minute", "DMinute");
	    throw ee;
	}
	// Encode field 'second'
	try {
	    DSecond item1 = this.second;

	    {
		sink.writeSeparator();
		sink.encodeKey("second");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("second", "DSecond");
	    throw ee;
	}
	// Encode field 'offset'
	try {
	    DOffset item1 = this.offset;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("offset");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "offset");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offset", "DOffset");
	    throw ee;
	}
	sink.endObject();

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
	    this.encodeValue(coder, sink);

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "DTime");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public DTime decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[5];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __hour:
		    // Decode field 'hour'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.hour == null)
			    this.hour = new DHour();
			this.hour.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("hour", "DHour");
			throw de;
		    }
		    break;
		    case __minute:
		    // Decode field 'minute'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.minute == null)
			    this.minute = new DMinute();
			this.minute.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("minute", "DMinute");
			throw de;
		    }
		    break;
		    case __second:
		    // Decode field 'second'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.second == null)
			    this.second = new DSecond();
			this.second.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("second", "DSecond");
			throw de;
		    }
		    break;
		    case __offset:
		    // Decode field 'offset'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.offset == null)
				this.offset = new DOffset();
			    this.offset.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("offset", "DOffset");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'hour'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'minute'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'second'");
	if (!present0[3])
	    this.offset = null;
	return this;
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
	    this.decodeValue(coder, source);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "DTime");
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
	boolean comma0;
	comma0 = false;
	writer.print('{');
	printer.indent();
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("hour ");
	    writer.print(this.hour.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("minute ");
	    writer.print(this.minute.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("second ");
	    writer.print(this.second.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.offset != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("offset ");
		writer.print(this.offset.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "DTime";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((DTime)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DTime)that);
    }
    
    public boolean equalTo(DTime that) {
	if (!this.hour.equalTo(that.hour))
	    return false;
	if (!this.minute.equalTo(that.minute))
	    return false;
	if (!this.second.equalTo(that.second))
	    return false;
	if (this.offset != null) {
	    if (that.offset == null || !this.offset.equalTo(that.offset))
		return false;
	} else if (that.offset != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DTime clone() {
	DTime copy = (DTime)super.clone();
	copy.hour = hour.clone();
	copy.minute = minute.clone();
	copy.second = second.clone();
	if (offset != null) {
	    copy.offset = offset.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.hour != null ? this.hour.hashCode() : 0);
	hash = 41 * hash + (this.minute != null ? this.minute.hashCode() : 0);
	hash = 41 * hash + (this.second != null ? this.second.hashCode() : 0);
	hash = 41 * hash + (this.offset != null ? this.offset.hashCode() : 0);
	return hash;
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
	    return new DTime();
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
    
} // End class definition for DTime
