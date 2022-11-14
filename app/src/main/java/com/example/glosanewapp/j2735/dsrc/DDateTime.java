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
 * Define the DDateTime ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class DDateTime extends Sequence {
    public DYear year;
    public DMonth month;
    public DDay day;
    public DHour hour;
    public DMinute minute;
    public DSecond second;
    public DOffset offset;
    
    /**
     * The default constructor.
     */
    public DDateTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DDateTime(DYear year, DMonth month, DDay day, DHour hour, 
		    DMinute minute, DSecond second, DOffset offset)
    {
	setYear(year);
	setMonth(month);
	setDay(day);
	setHour(hour);
	setMinute(minute);
	setSecond(second);
	setOffset(offset);
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
    
    public boolean hasYear()
    {
	return (year != null);
    }
    
    public void deleteYear()
    {
	year = null;
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
    
    public boolean hasMonth()
    {
	return (month != null);
    }
    
    public void deleteMonth()
    {
	month = null;
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
    
    public boolean hasDay()
    {
	return (day != null);
    }
    
    public void deleteDay()
    {
	day = null;
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
    
    public boolean hasHour()
    {
	return (hour != null);
    }
    
    public void deleteHour()
    {
	hour = null;
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
    
    public boolean hasMinute()
    {
	return (minute != null);
    }
    
    public void deleteMinute()
    {
	minute = null;
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
    
    public boolean hasSecond()
    {
	return (second != null);
    }
    
    public void deleteSecond()
    {
	second = null;
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
	__year("year"),
	__month("month"),
	__day("day"),
	__hour("hour"),
	__minute("minute"),
	__second("second"),
	__offset("offset"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(8);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DDateTime data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.year != null);
	sink.writeBit(data.month != null);
	sink.writeBit(data.day != null);
	sink.writeBit(data.hour != null);
	sink.writeBit(data.minute != null);
	sink.writeBit(data.second != null);
	sink.writeBit(data.offset != null);
	nbits += 7;
	if (data.year != null) {
	    // Encode field 'year'
	    try {
		DYear item1 = data.year;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 4095)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 4095, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("year", "DYear");
		throw ee;
	    }
	}
	if (data.month != null) {
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
	}
	if (data.day != null) {
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
	}
	if (data.hour != null) {
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
	}
	if (data.minute != null) {
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
	}
	if (data.second != null) {
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
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static DDateTime decodeValue(PerCoder coder, InputBitStream source, DDateTime data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_year0 = source.readBit();
	boolean has_month0 = source.readBit();
	boolean has_day0 = source.readBit();
	boolean has_hour0 = source.readBit();
	boolean has_minute0 = source.readBit();
	boolean has_second0 = source.readBit();
	boolean has_offset0 = source.readBit();
    /** Decode root fields **/
	if (has_year0) {
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
	} else {
	    data.year = null;
	}
	if (has_month0) {
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
	} else {
	    data.month = null;
	}
	if (has_day0) {
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
	} else {
	    data.day = null;
	}
	if (has_hour0) {
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
	} else {
	    data.hour = null;
	}
	if (has_minute0) {
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
	} else {
	    data.minute = null;
	}
	if (has_second0) {
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
	} else {
	    data.second = null;
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
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	String separator0 = null;

	sink.beginObject();
	// Encode field 'year'
	try {
	    DYear item1 = this.year;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("year");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "year");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("year", "DYear");
	    throw ee;
	}
	// Encode field 'month'
	try {
	    DMonth item1 = this.month;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("month");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "month");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("month", "DMonth");
	    throw ee;
	}
	// Encode field 'day'
	try {
	    DDay item1 = this.day;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("day");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "day");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("day", "DDay");
	    throw ee;
	}
	// Encode field 'hour'
	try {
	    DHour item1 = this.hour;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("hour");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "hour");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("hour", "DHour");
	    throw ee;
	}
	// Encode field 'minute'
	try {
	    DMinute item1 = this.minute;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("minute");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "minute");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minute", "DMinute");
	    throw ee;
	}
	// Encode field 'second'
	try {
	    DSecond item1 = this.second;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("second");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "second");
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
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("offset");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
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
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public DDateTime decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

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
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.year == null)
				this.year = new DYear();
			    this.year.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("year", "DYear");
			throw de;
		    }
		    break;
		    case __month:
		    // Decode field 'month'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.month == null)
				this.month = new DMonth();
			    this.month.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("month", "DMonth");
			throw de;
		    }
		    break;
		    case __day:
		    // Decode field 'day'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.day == null)
				this.day = new DDay();
			    this.day.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("day", "DDay");
			throw de;
		    }
		    break;
		    case __hour:
		    // Decode field 'hour'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.hour == null)
				this.hour = new DHour();
			    this.hour.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("hour", "DHour");
			throw de;
		    }
		    break;
		    case __minute:
		    // Decode field 'minute'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.minute == null)
				this.minute = new DMinute();
			    this.minute.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("minute", "DMinute");
			throw de;
		    }
		    break;
		    case __second:
		    // Decode field 'second'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.second == null)
				this.second = new DSecond();
			    this.second.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
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
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.offset == null)
				this.offset = new DOffset();
			    this.offset.setValue(coder.decodeInteger(source));
			    present0[6] = true;
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
	    this.year = null;
	if (!present0[1])
	    this.month = null;
	if (!present0[2])
	    this.day = null;
	if (!present0[3])
	    this.hour = null;
	if (!present0[4])
	    this.minute = null;
	if (!present0[5])
	    this.second = null;
	if (!present0[6])
	    this.offset = null;
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
	if (this.year != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("year ");
		writer.print(this.year.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.month != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("month ");
		writer.print(this.month.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.day != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("day ");
		writer.print(this.day.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.hour != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("hour ");
		writer.print(this.hour.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.minute != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("minute ");
		writer.print(this.minute.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.second != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("second ");
		writer.print(this.second.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.offset != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("offset ");
		writer.print(this.offset.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((DDateTime)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DDateTime)that);
    }
    
    public boolean equalTo(DDateTime that) {
	if (this.year != null) {
	    if (that.year == null || !this.year.equalTo(that.year))
		return false;
	} else if (that.year != null)
	    return false;
	if (this.month != null) {
	    if (that.month == null || !this.month.equalTo(that.month))
		return false;
	} else if (that.month != null)
	    return false;
	if (this.day != null) {
	    if (that.day == null || !this.day.equalTo(that.day))
		return false;
	} else if (that.day != null)
	    return false;
	if (this.hour != null) {
	    if (that.hour == null || !this.hour.equalTo(that.hour))
		return false;
	} else if (that.hour != null)
	    return false;
	if (this.minute != null) {
	    if (that.minute == null || !this.minute.equalTo(that.minute))
		return false;
	} else if (that.minute != null)
	    return false;
	if (this.second != null) {
	    if (that.second == null || !this.second.equalTo(that.second))
		return false;
	} else if (that.second != null)
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
    public DDateTime clone() {
	DDateTime copy = (DDateTime)super.clone();
	if (year != null) {
	    copy.year = year.clone();
	}
	if (month != null) {
	    copy.month = month.clone();
	}
	if (day != null) {
	    copy.day = day.clone();
	}
	if (hour != null) {
	    copy.hour = hour.clone();
	}
	if (minute != null) {
	    copy.minute = minute.clone();
	}
	if (second != null) {
	    copy.second = second.clone();
	}
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
	hash = 41 * hash + (this.year != null ? this.year.hashCode() : 0);
	hash = 41 * hash + (this.month != null ? this.month.hashCode() : 0);
	hash = 41 * hash + (this.day != null ? this.day.hashCode() : 0);
	hash = 41 * hash + (this.hour != null ? this.hour.hashCode() : 0);
	hash = 41 * hash + (this.minute != null ? this.minute.hashCode() : 0);
	hash = 41 * hash + (this.second != null ? this.second.hashCode() : 0);
	hash = 41 * hash + (this.offset != null ? this.offset.hashCode() : 0);
	return hash;
    }
} // End class definition for DDateTime
