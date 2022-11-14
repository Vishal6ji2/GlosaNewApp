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


package com.example.glosanewapp.j2735.addgrpb;

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
 * Define the TimeMark ASN.1 type included in the AddGrpB ASN.1 module.
 * @see Sequence
 */

public class TimeMark extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public Year year;
    public Month month;
    public Day day;
    public SummerTime summerTime;
    public Holiday holiday;
    public DayOfWeek dayofWeek;
    public Hour hour;
    public Minute minute;
    public Second second;
    public TenthSecond tenthSecond;
    
    /**
     * The default constructor.
     */
    public TimeMark()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TimeMark(Year year, Month month, Day day, SummerTime summerTime, 
		    Holiday holiday, DayOfWeek dayofWeek, Hour hour, 
		    Minute minute, Second second, TenthSecond tenthSecond)
    {
	setYear(year);
	setMonth(month);
	setDay(day);
	setSummerTime(summerTime);
	setHoliday(holiday);
	setDayofWeek(dayofWeek);
	setHour(hour);
	setMinute(minute);
	setSecond(second);
	setTenthSecond(tenthSecond);
    }
    
    
    // Methods for field "year"
    public Year getYear()
    {
	return this.year;
    }
    
    public void setYear(Year year)
    {
	this.year = year;
    }
    
    
    // Methods for field "month"
    public Month getMonth()
    {
	return this.month;
    }
    
    public void setMonth(Month month)
    {
	this.month = month;
    }
    
    
    // Methods for field "day"
    public Day getDay()
    {
	return this.day;
    }
    
    public void setDay(Day day)
    {
	this.day = day;
    }
    
    
    // Methods for field "summerTime"
    public SummerTime getSummerTime()
    {
	return this.summerTime;
    }
    
    public void setSummerTime(SummerTime summerTime)
    {
	this.summerTime = summerTime;
    }
    
    
    // Methods for field "holiday"
    public Holiday getHoliday()
    {
	return this.holiday;
    }
    
    public void setHoliday(Holiday holiday)
    {
	this.holiday = holiday;
    }
    
    
    // Methods for field "dayofWeek"
    public DayOfWeek getDayofWeek()
    {
	return this.dayofWeek;
    }
    
    public void setDayofWeek(DayOfWeek dayofWeek)
    {
	this.dayofWeek = dayofWeek;
    }
    
    
    // Methods for field "hour"
    public Hour getHour()
    {
	return this.hour;
    }
    
    public void setHour(Hour hour)
    {
	this.hour = hour;
    }
    
    
    // Methods for field "minute"
    public Minute getMinute()
    {
	return this.minute;
    }
    
    public void setMinute(Minute minute)
    {
	this.minute = minute;
    }
    
    
    // Methods for field "second"
    public Second getSecond()
    {
	return this.second;
    }
    
    public void setSecond(Second second)
    {
	this.second = second;
    }
    
    
    // Methods for field "tenthSecond"
    public TenthSecond getTenthSecond()
    {
	return this.tenthSecond;
    }
    
    public void setTenthSecond(TenthSecond tenthSecond)
    {
	this.tenthSecond = tenthSecond;
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
	__summerTime("summerTime"),
	__holiday("holiday"),
	__dayofWeek("dayofWeek"),
	__hour("hour"),
	__minute("minute"),
	__second("second"),
	__tenthSecond("tenthSecond"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(11);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, TimeMark data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'year'
	try {
	    Year item1 = data.year;
	    long temp1 = item1.longValue();

	    if (temp1 < 1 || temp1 > 65535)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 1, 65535, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("year", "Year");
	    throw ee;
	}
	// Encode field 'month'
	try {
	    Month item1 = data.month;
	    long temp1 = item1.longValue();

	    if (temp1 < 1 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("month", "Month");
	    throw ee;
	}
	// Encode field 'day'
	try {
	    Day item1 = data.day;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("day", "Day");
	    throw ee;
	}
	// Encode field 'summerTime'
	try {
	    SummerTime item1 = data.summerTime;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 1, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("summerTime", "SummerTime");
	    throw ee;
	}
	// Encode field 'holiday'
	try {
	    Holiday item1 = data.holiday;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 1, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("holiday", "Holiday");
	    throw ee;
	}
	// Encode field 'dayofWeek'
	try {
	    DayOfWeek item1 = data.dayofWeek;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dayofWeek", "DayOfWeek");
	    throw ee;
	}
	// Encode field 'hour'
	try {
	    Hour item1 = data.hour;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("hour", "Hour");
	    throw ee;
	}
	// Encode field 'minute'
	try {
	    Minute item1 = data.minute;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minute", "Minute");
	    throw ee;
	}
	// Encode field 'second'
	try {
	    Second item1 = data.second;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 60)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 60, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("second", "Second");
	    throw ee;
	}
	// Encode field 'tenthSecond'
	try {
	    TenthSecond item1 = data.tenthSecond;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 9)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 9, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("tenthSecond", "TenthSecond");
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
	    ee.appendFieldContext(null, "TimeMark");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static TimeMark decodeValue(PerCoder coder, InputBitStream source, TimeMark data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'year'
	try {
	    long temp1;

	    if (data.year == null)
		data.year = new Year();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 1, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.year.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("year", "Year");
	    throw de;
	}
	// Decode field 'month'
	try {
	    long temp1;

	    if (data.month == null)
		data.month = new Month();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 1, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.month.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("month", "Month");
	    throw de;
	}
	// Decode field 'day'
	try {
	    long temp1;

	    if (data.day == null)
		data.day = new Day();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.day.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("day", "Day");
	    throw de;
	}
	// Decode field 'summerTime'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1);
	    if (idx1 < 0 || idx1 > 1)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.summerTime = SummerTime.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("summerTime", "SummerTime");
	    throw de;
	}
	// Decode field 'holiday'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1);
	    if (idx1 < 0 || idx1 > 1)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.holiday = Holiday.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("holiday", "Holiday");
	    throw de;
	}
	// Decode field 'dayofWeek'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx1 < 0 || idx1 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.dayofWeek = DayOfWeek.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("dayofWeek", "DayOfWeek");
	    throw de;
	}
	// Decode field 'hour'
	try {
	    long temp1;

	    if (data.hour == null)
		data.hour = new Hour();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.hour.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("hour", "Hour");
	    throw de;
	}
	// Decode field 'minute'
	try {
	    long temp1;

	    if (data.minute == null)
		data.minute = new Minute();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.minute.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("minute", "Minute");
	    throw de;
	}
	// Decode field 'second'
	try {
	    long temp1;

	    if (data.second == null)
		data.second = new Second();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 60);
	    if (temp1 > 60)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.second.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("second", "Second");
	    throw de;
	}
	// Decode field 'tenthSecond'
	try {
	    long temp1;

	    if (data.tenthSecond == null)
		data.tenthSecond = new TenthSecond();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 9);
	    if (temp1 > 9)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.tenthSecond.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("tenthSecond", "TenthSecond");
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
	    de.appendFieldContext(null, "TimeMark");
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
	    Year item1 = this.year;

	    {
		sink.encodeKey("year");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("year", "Year");
	    throw ee;
	}
	// Encode field 'month'
	try {
	    Month item1 = this.month;

	    {
		sink.writeSeparator();
		sink.encodeKey("month");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("month", "Month");
	    throw ee;
	}
	// Encode field 'day'
	try {
	    Day item1 = this.day;

	    {
		sink.writeSeparator();
		sink.encodeKey("day");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("day", "Day");
	    throw ee;
	}
	// Encode field 'summerTime'
	try {
	    SummerTime item1 = this.summerTime;

	    {
		sink.writeSeparator();
		sink.encodeKey("summerTime");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("summerTime", "SummerTime");
	    throw ee;
	}
	// Encode field 'holiday'
	try {
	    Holiday item1 = this.holiday;

	    {
		sink.writeSeparator();
		sink.encodeKey("holiday");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("holiday", "Holiday");
	    throw ee;
	}
	// Encode field 'dayofWeek'
	try {
	    DayOfWeek item1 = this.dayofWeek;

	    {
		sink.writeSeparator();
		sink.encodeKey("dayofWeek");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dayofWeek", "DayOfWeek");
	    throw ee;
	}
	// Encode field 'hour'
	try {
	    Hour item1 = this.hour;

	    {
		sink.writeSeparator();
		sink.encodeKey("hour");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("hour", "Hour");
	    throw ee;
	}
	// Encode field 'minute'
	try {
	    Minute item1 = this.minute;

	    {
		sink.writeSeparator();
		sink.encodeKey("minute");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minute", "Minute");
	    throw ee;
	}
	// Encode field 'second'
	try {
	    Second item1 = this.second;

	    {
		sink.writeSeparator();
		sink.encodeKey("second");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("second", "Second");
	    throw ee;
	}
	// Encode field 'tenthSecond'
	try {
	    TenthSecond item1 = this.tenthSecond;

	    {
		sink.writeSeparator();
		sink.encodeKey("tenthSecond");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("tenthSecond", "TenthSecond");
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
	    ee.appendFieldContext(null, "TimeMark");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public TimeMark decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[11];

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
			    this.year = new Year();
			this.year.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("year", "Year");
			throw de;
		    }
		    break;
		    case __month:
		    // Decode field 'month'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.month == null)
			    this.month = new Month();
			this.month.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("month", "Month");
			throw de;
		    }
		    break;
		    case __day:
		    // Decode field 'day'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.day == null)
			    this.day = new Day();
			this.day.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("day", "Day");
			throw de;
		    }
		    break;
		    case __summerTime:
		    // Decode field 'summerTime'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			SummerTime temp1;

			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(SummerTime.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = SummerTime.cNamedNumbers[idx1];
			this.summerTime = temp1;
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("summerTime", "SummerTime");
			throw de;
		    }
		    break;
		    case __holiday:
		    // Decode field 'holiday'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			Holiday temp1;

			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(Holiday.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = Holiday.cNamedNumbers[idx1];
			this.holiday = temp1;
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("holiday", "Holiday");
			throw de;
		    }
		    break;
		    case __dayofWeek:
		    // Decode field 'dayofWeek'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			DayOfWeek temp1;

			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(DayOfWeek.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = DayOfWeek.cNamedNumbers[idx1];
			this.dayofWeek = temp1;
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dayofWeek", "DayOfWeek");
			throw de;
		    }
		    break;
		    case __hour:
		    // Decode field 'hour'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.hour == null)
			    this.hour = new Hour();
			this.hour.setValue(coder.decodeInteger(source));
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("hour", "Hour");
			throw de;
		    }
		    break;
		    case __minute:
		    // Decode field 'minute'
		    try {
			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.minute == null)
			    this.minute = new Minute();
			this.minute.setValue(coder.decodeInteger(source));
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("minute", "Minute");
			throw de;
		    }
		    break;
		    case __second:
		    // Decode field 'second'
		    try {
			if (present0[8])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.second == null)
			    this.second = new Second();
			this.second.setValue(coder.decodeInteger(source));
			present0[8] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("second", "Second");
			throw de;
		    }
		    break;
		    case __tenthSecond:
		    // Decode field 'tenthSecond'
		    try {
			if (present0[9])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.tenthSecond == null)
			    this.tenthSecond = new TenthSecond();
			this.tenthSecond.setValue(coder.decodeInteger(source));
			present0[9] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("tenthSecond", "TenthSecond");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'summerTime'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'holiday'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'dayofWeek'");
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'hour'");
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'minute'");
	if (!present0[8])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'second'");
	if (!present0[9])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'tenthSecond'");
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
	    de.appendFieldContext(null, "TimeMark");
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
	    writer.print("summerTime ");
	    printer.print(this.summerTime, writer, this.summerTime.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("holiday ");
	    printer.print(this.holiday, writer, this.holiday.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("dayofWeek ");
	    printer.print(this.dayofWeek, writer, this.dayofWeek.cConstantNameList);
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
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("second ");
	    writer.print(this.second.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("tenthSecond ");
	    writer.print(this.tenthSecond.longValue());
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
	return "TimeMark";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((TimeMark)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((TimeMark)that);
    }
    
    public boolean equalTo(TimeMark that) {
	if (!this.year.equalTo(that.year))
	    return false;
	if (!this.month.equalTo(that.month))
	    return false;
	if (!this.day.equalTo(that.day))
	    return false;
	if (!this.summerTime.equalTo(that.summerTime))
	    return false;
	if (!this.holiday.equalTo(that.holiday))
	    return false;
	if (!this.dayofWeek.equalTo(that.dayofWeek))
	    return false;
	if (!this.hour.equalTo(that.hour))
	    return false;
	if (!this.minute.equalTo(that.minute))
	    return false;
	if (!this.second.equalTo(that.second))
	    return false;
	if (!this.tenthSecond.equalTo(that.tenthSecond))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public TimeMark clone() {
	TimeMark copy = (TimeMark)super.clone();
	copy.year = year.clone();
	copy.month = month.clone();
	copy.day = day.clone();
	copy.summerTime = summerTime.clone();
	copy.holiday = holiday.clone();
	copy.dayofWeek = dayofWeek.clone();
	copy.hour = hour.clone();
	copy.minute = minute.clone();
	copy.second = second.clone();
	copy.tenthSecond = tenthSecond.clone();
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
	hash = 41 * hash + (this.summerTime != null ? this.summerTime.hashCode() : 0);
	hash = 41 * hash + (this.holiday != null ? this.holiday.hashCode() : 0);
	hash = 41 * hash + (this.dayofWeek != null ? this.dayofWeek.hashCode() : 0);
	hash = 41 * hash + (this.hour != null ? this.hour.hashCode() : 0);
	hash = 41 * hash + (this.minute != null ? this.minute.hashCode() : 0);
	hash = 41 * hash + (this.second != null ? this.second.hashCode() : 0);
	hash = 41 * hash + (this.tenthSecond != null ? this.tenthSecond.hashCode() : 0);
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
	    return new TimeMark();
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
    
} // End class definition for TimeMark
