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
 * Define the DFullTime ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class DFullTime extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public DYear year;
    public DMonth month;
    public DDay day;
    public DHour hour;
    public DMinute minute;
    
    /**
     * The default constructor.
     */
    public DFullTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DFullTime(DYear year, DMonth month, DDay day, DHour hour, 
		    DMinute minute)
    {
	setYear(year);
	setMonth(month);
	setDay(day);
	setHour(hour);
	setMinute(minute);
    }
    
    
    // Methods for field "year"
    public DYear getYear()
    {
	return this.year;
    }
    
    public void setYear(DYear year)
    {
	this.year = year;
    }
    
    
    // Methods for field "month"
    public DMonth getMonth()
    {
	return this.month;
    }
    
    public void setMonth(DMonth month)
    {
	this.month = month;
    }
    
    
    // Methods for field "day"
    public DDay getDay()
    {
	return this.day;
    }
    
    public void setDay(DDay day)
    {
	this.day = day;
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
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__year("year"),
	__month("month"),
	__day("day"),
	__hour("hour"),
	__minute("minute"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(6);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DFullTime data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'year'
	try {
	    DYear item1 = data.year;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 4095)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 4095, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("year", "DYear");
	    throw ee;
	}
	// Encode field 'month'
	try {
	    DMonth item1 = data.month;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 12)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 12, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("month", "DMonth");
	    throw ee;
	}
	// Encode field 'day'
	try {
	    DDay item1 = data.day;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("day", "DDay");
	    throw ee;
	}
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
	    ee.appendFieldContext(null, "DFullTime");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static DFullTime decodeValue(PerCoder coder, InputBitStream source, DFullTime data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'year'
	try {
	    long temp1;

	    if (data.year == null)
		data.year = new DYear();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 4095);
	    if (temp1 > 4095)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.year.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("year", "DYear");
	    throw de;
	}
	// Decode field 'month'
	try {
	    long temp1;

	    if (data.month == null)
		data.month = new DMonth();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 12);
	    if (temp1 > 12)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.month.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("month", "DMonth");
	    throw de;
	}
	// Decode field 'day'
	try {
	    long temp1;

	    if (data.day == null)
		data.day = new DDay();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.day.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("day", "DDay");
	    throw de;
	}
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
	    de.appendFieldContext(null, "DFullTime");
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
	// Encode field 'year'
	try {
	    DYear item1 = this.year;

	    {
		sink.encodeKey("year");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("year", "DYear");
	    throw ee;
	}
	// Encode field 'month'
	try {
	    DMonth item1 = this.month;

	    {
		sink.writeSeparator();
		sink.encodeKey("month");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("month", "DMonth");
	    throw ee;
	}
	// Encode field 'day'
	try {
	    DDay item1 = this.day;

	    {
		sink.writeSeparator();
		sink.encodeKey("day");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("day", "DDay");
	    throw ee;
	}
	// Encode field 'hour'
	try {
	    DHour item1 = this.hour;

	    {
		sink.writeSeparator();
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
	    ee.appendFieldContext(null, "DFullTime");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public DFullTime decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[6];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __year:
		    // Decode field 'year'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.year == null)
			    this.year = new DYear();
			this.year.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("year", "DYear");
			throw de;
		    }
		    break;
		    case __month:
		    // Decode field 'month'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.month == null)
			    this.month = new DMonth();
			this.month.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("month", "DMonth");
			throw de;
		    }
		    break;
		    case __day:
		    // Decode field 'day'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.day == null)
			    this.day = new DDay();
			this.day.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("day", "DDay");
			throw de;
		    }
		    break;
		    case __hour:
		    // Decode field 'hour'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.hour == null)
			    this.hour = new DHour();
			this.hour.setValue(coder.decodeInteger(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("hour", "DHour");
			throw de;
		    }
		    break;
		    case __minute:
		    // Decode field 'minute'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.minute == null)
			    this.minute = new DMinute();
			this.minute.setValue(coder.decodeInteger(source));
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("minute", "DMinute");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'year'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'month'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'day'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'hour'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'minute'");
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
	    de.appendFieldContext(null, "DFullTime");
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
	    writer.print("year ");
	    writer.print(this.year.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("month ");
	    writer.print(this.month.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("day ");
	    writer.print(this.day.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
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
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "DFullTime";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((DFullTime)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DFullTime)that);
    }
    
    public boolean equalTo(DFullTime that) {
	if (!this.year.equalTo(that.year))
	    return false;
	if (!this.month.equalTo(that.month))
	    return false;
	if (!this.day.equalTo(that.day))
	    return false;
	if (!this.hour.equalTo(that.hour))
	    return false;
	if (!this.minute.equalTo(that.minute))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DFullTime clone() {
	DFullTime copy = (DFullTime)super.clone();
	copy.year = year.clone();
	copy.month = month.clone();
	copy.day = day.clone();
	copy.hour = hour.clone();
	copy.minute = minute.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.year != null ? this.year.hashCode() : 0);
	hash = 41 * hash + (this.month != null ? this.month.hashCode() : 0);
	hash = 41 * hash + (this.day != null ? this.day.hashCode() : 0);
	hash = 41 * hash + (this.hour != null ? this.hour.hashCode() : 0);
	hash = 41 * hash + (this.minute != null ? this.minute.hashCode() : 0);
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
	    return new DFullTime();
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
    
} // End class definition for DFullTime
