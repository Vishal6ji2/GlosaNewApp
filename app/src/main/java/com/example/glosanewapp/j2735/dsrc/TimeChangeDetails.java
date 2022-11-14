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
 * Define the TimeChangeDetails ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class TimeChangeDetails extends Sequence {
    public TimeMark startTime;
    public TimeMark minEndTime;
    public TimeMark maxEndTime;
    public TimeMark likelyTime;
    public TimeIntervalConfidence confidence;
    public TimeMark nextTime;
    
    /**
     * The default constructor.
     */
    public TimeChangeDetails()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TimeChangeDetails(TimeMark startTime, TimeMark minEndTime, 
		    TimeMark maxEndTime, TimeMark likelyTime, 
		    TimeIntervalConfidence confidence, TimeMark nextTime)
    {
	setStartTime(startTime);
	setMinEndTime(minEndTime);
	setMaxEndTime(maxEndTime);
	setLikelyTime(likelyTime);
	setConfidence(confidence);
	setNextTime(nextTime);
    }
    
    /**
     * Construct with required components.
     */
    public TimeChangeDetails(TimeMark minEndTime)
    {
	setMinEndTime(minEndTime);
    }
    
    
    // Methods for field "startTime"
    public TimeMark getStartTime()
    {
	return this.startTime;
    }
    
    public void setStartTime(TimeMark startTime)
    {
	this.startTime = startTime;
    }
    
    public boolean hasStartTime()
    {
	return (startTime != null);
    }
    
    public void deleteStartTime()
    {
	startTime = null;
    }
    
    
    // Methods for field "minEndTime"
    public TimeMark getMinEndTime()
    {
	return this.minEndTime;
    }
    
    public void setMinEndTime(TimeMark minEndTime)
    {
	this.minEndTime = minEndTime;
    }
    
    
    // Methods for field "maxEndTime"
    public TimeMark getMaxEndTime()
    {
	return this.maxEndTime;
    }
    
    public void setMaxEndTime(TimeMark maxEndTime)
    {
	this.maxEndTime = maxEndTime;
    }
    
    public boolean hasMaxEndTime()
    {
	return (maxEndTime != null);
    }
    
    public void deleteMaxEndTime()
    {
	maxEndTime = null;
    }
    
    
    // Methods for field "likelyTime"
    public TimeMark getLikelyTime()
    {
	return this.likelyTime;
    }
    
    public void setLikelyTime(TimeMark likelyTime)
    {
	this.likelyTime = likelyTime;
    }
    
    public boolean hasLikelyTime()
    {
	return (likelyTime != null);
    }
    
    public void deleteLikelyTime()
    {
	likelyTime = null;
    }
    
    
    // Methods for field "confidence"
    public TimeIntervalConfidence getConfidence()
    {
	return this.confidence;
    }
    
    public void setConfidence(TimeIntervalConfidence confidence)
    {
	this.confidence = confidence;
    }
    
    public boolean hasConfidence()
    {
	return (confidence != null);
    }
    
    public void deleteConfidence()
    {
	confidence = null;
    }
    
    
    // Methods for field "nextTime"
    public TimeMark getNextTime()
    {
	return this.nextTime;
    }
    
    public void setNextTime(TimeMark nextTime)
    {
	this.nextTime = nextTime;
    }
    
    public boolean hasNextTime()
    {
	return (nextTime != null);
    }
    
    public void deleteNextTime()
    {
	nextTime = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__startTime("startTime"),
	__minEndTime("minEndTime"),
	__maxEndTime("maxEndTime"),
	__likelyTime("likelyTime"),
	__confidence("confidence"),
	__nextTime("nextTime"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(7);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, TimeChangeDetails data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.startTime != null);
	sink.writeBit(data.maxEndTime != null);
	sink.writeBit(data.likelyTime != null);
	sink.writeBit(data.confidence != null);
	sink.writeBit(data.nextTime != null);
	nbits += 5;
	if (data.startTime != null) {
	    // Encode field 'startTime'
	    try {
		TimeMark item1 = data.startTime;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 36001)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 36001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("startTime", "TimeMark");
		throw ee;
	    }
	}
	// Encode field 'minEndTime'
	try {
	    TimeMark item1 = data.minEndTime;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 36001)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 36001, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minEndTime", "TimeMark");
	    throw ee;
	}
	if (data.maxEndTime != null) {
	    // Encode field 'maxEndTime'
	    try {
		TimeMark item1 = data.maxEndTime;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 36001)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 36001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("maxEndTime", "TimeMark");
		throw ee;
	    }
	}
	if (data.likelyTime != null) {
	    // Encode field 'likelyTime'
	    try {
		TimeMark item1 = data.likelyTime;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 36001)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 36001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("likelyTime", "TimeMark");
		throw ee;
	    }
	}
	if (data.confidence != null) {
	    // Encode field 'confidence'
	    try {
		TimeIntervalConfidence item1 = data.confidence;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 15)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("confidence", "TimeIntervalConfidence");
		throw ee;
	    }
	}
	if (data.nextTime != null) {
	    // Encode field 'nextTime'
	    try {
		TimeMark item1 = data.nextTime;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 36001)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 36001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("nextTime", "TimeMark");
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
    public static TimeChangeDetails decodeValue(PerCoder coder, InputBitStream source, TimeChangeDetails data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_startTime0 = source.readBit();
	boolean has_maxEndTime0 = source.readBit();
	boolean has_likelyTime0 = source.readBit();
	boolean has_confidence0 = source.readBit();
	boolean has_nextTime0 = source.readBit();
    /** Decode root fields **/
	if (has_startTime0) {
	    // Decode field 'startTime'
	    try {
		long temp1;

		if (data.startTime == null)
		    data.startTime = new TimeMark();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 36001);
		if (temp1 > 36001)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.startTime.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("startTime", "TimeMark");
		throw de;
	    }
	} else {
	    data.startTime = null;
	}
	// Decode field 'minEndTime'
	try {
	    long temp1;

	    if (data.minEndTime == null)
		data.minEndTime = new TimeMark();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 36001);
	    if (temp1 > 36001)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.minEndTime.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("minEndTime", "TimeMark");
	    throw de;
	}
	if (has_maxEndTime0) {
	    // Decode field 'maxEndTime'
	    try {
		long temp1;

		if (data.maxEndTime == null)
		    data.maxEndTime = new TimeMark();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 36001);
		if (temp1 > 36001)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.maxEndTime.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("maxEndTime", "TimeMark");
		throw de;
	    }
	} else {
	    data.maxEndTime = null;
	}
	if (has_likelyTime0) {
	    // Decode field 'likelyTime'
	    try {
		long temp1;

		if (data.likelyTime == null)
		    data.likelyTime = new TimeMark();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 36001);
		if (temp1 > 36001)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.likelyTime.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("likelyTime", "TimeMark");
		throw de;
	    }
	} else {
	    data.likelyTime = null;
	}
	if (has_confidence0) {
	    // Decode field 'confidence'
	    try {
		long temp1;

		if (data.confidence == null)
		    data.confidence = new TimeIntervalConfidence();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (temp1 > 15)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.confidence.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("confidence", "TimeIntervalConfidence");
		throw de;
	    }
	} else {
	    data.confidence = null;
	}
	if (has_nextTime0) {
	    // Decode field 'nextTime'
	    try {
		long temp1;

		if (data.nextTime == null)
		    data.nextTime = new TimeMark();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 36001);
		if (temp1 > 36001)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.nextTime.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("nextTime", "TimeMark");
		throw de;
	    }
	} else {
	    data.nextTime = null;
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
	// Encode field 'startTime'
	try {
	    TimeMark item1 = this.startTime;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("startTime");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "startTime");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("startTime", "TimeMark");
	    throw ee;
	}
	// Encode field 'minEndTime'
	try {
	    TimeMark item1 = this.minEndTime;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("minEndTime");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minEndTime", "TimeMark");
	    throw ee;
	}
	// Encode field 'maxEndTime'
	try {
	    TimeMark item1 = this.maxEndTime;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("maxEndTime");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "maxEndTime");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("maxEndTime", "TimeMark");
	    throw ee;
	}
	// Encode field 'likelyTime'
	try {
	    TimeMark item1 = this.likelyTime;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("likelyTime");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "likelyTime");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("likelyTime", "TimeMark");
	    throw ee;
	}
	// Encode field 'confidence'
	try {
	    TimeIntervalConfidence item1 = this.confidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("confidence");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "confidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("confidence", "TimeIntervalConfidence");
	    throw ee;
	}
	// Encode field 'nextTime'
	try {
	    TimeMark item1 = this.nextTime;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("nextTime");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "nextTime");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nextTime", "TimeMark");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public TimeChangeDetails decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[7];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __startTime:
		    // Decode field 'startTime'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.startTime == null)
				this.startTime = new TimeMark();
			    this.startTime.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("startTime", "TimeMark");
			throw de;
		    }
		    break;
		    case __minEndTime:
		    // Decode field 'minEndTime'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.minEndTime == null)
			    this.minEndTime = new TimeMark();
			this.minEndTime.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("minEndTime", "TimeMark");
			throw de;
		    }
		    break;
		    case __maxEndTime:
		    // Decode field 'maxEndTime'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.maxEndTime == null)
				this.maxEndTime = new TimeMark();
			    this.maxEndTime.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("maxEndTime", "TimeMark");
			throw de;
		    }
		    break;
		    case __likelyTime:
		    // Decode field 'likelyTime'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.likelyTime == null)
				this.likelyTime = new TimeMark();
			    this.likelyTime.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("likelyTime", "TimeMark");
			throw de;
		    }
		    break;
		    case __confidence:
		    // Decode field 'confidence'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.confidence == null)
				this.confidence = new TimeIntervalConfidence();
			    this.confidence.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("confidence", "TimeIntervalConfidence");
			throw de;
		    }
		    break;
		    case __nextTime:
		    // Decode field 'nextTime'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.nextTime == null)
				this.nextTime = new TimeMark();
			    this.nextTime.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("nextTime", "TimeMark");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.startTime = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'minEndTime'");
	if (!present0[2])
	    this.maxEndTime = null;
	if (!present0[3])
	    this.likelyTime = null;
	if (!present0[4])
	    this.confidence = null;
	if (!present0[5])
	    this.nextTime = null;
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
	if (this.startTime != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("startTime ");
		writer.print(this.startTime.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("minEndTime ");
	    writer.print(this.minEndTime.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.maxEndTime != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("maxEndTime ");
		writer.print(this.maxEndTime.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.likelyTime != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("likelyTime ");
		writer.print(this.likelyTime.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.confidence != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("confidence ");
		writer.print(this.confidence.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.nextTime != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("nextTime ");
		writer.print(this.nextTime.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
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
	return equalTo((TimeChangeDetails)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((TimeChangeDetails)that);
    }
    
    public boolean equalTo(TimeChangeDetails that) {
	if (this.startTime != null) {
	    if (that.startTime == null || !this.startTime.equalTo(that.startTime))
		return false;
	} else if (that.startTime != null)
	    return false;
	if (!this.minEndTime.equalTo(that.minEndTime))
	    return false;
	if (this.maxEndTime != null) {
	    if (that.maxEndTime == null || !this.maxEndTime.equalTo(that.maxEndTime))
		return false;
	} else if (that.maxEndTime != null)
	    return false;
	if (this.likelyTime != null) {
	    if (that.likelyTime == null || !this.likelyTime.equalTo(that.likelyTime))
		return false;
	} else if (that.likelyTime != null)
	    return false;
	if (this.confidence != null) {
	    if (that.confidence == null || !this.confidence.equalTo(that.confidence))
		return false;
	} else if (that.confidence != null)
	    return false;
	if (this.nextTime != null) {
	    if (that.nextTime == null || !this.nextTime.equalTo(that.nextTime))
		return false;
	} else if (that.nextTime != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public TimeChangeDetails clone() {
	TimeChangeDetails copy = (TimeChangeDetails)super.clone();
	if (startTime != null) {
	    copy.startTime = startTime.clone();
	}
	copy.minEndTime = minEndTime.clone();
	if (maxEndTime != null) {
	    copy.maxEndTime = maxEndTime.clone();
	}
	if (likelyTime != null) {
	    copy.likelyTime = likelyTime.clone();
	}
	if (confidence != null) {
	    copy.confidence = confidence.clone();
	}
	if (nextTime != null) {
	    copy.nextTime = nextTime.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.startTime != null ? this.startTime.hashCode() : 0);
	hash = 41 * hash + (this.minEndTime != null ? this.minEndTime.hashCode() : 0);
	hash = 41 * hash + (this.maxEndTime != null ? this.maxEndTime.hashCode() : 0);
	hash = 41 * hash + (this.likelyTime != null ? this.likelyTime.hashCode() : 0);
	hash = 41 * hash + (this.confidence != null ? this.confidence.hashCode() : 0);
	hash = 41 * hash + (this.nextTime != null ? this.nextTime.hashCode() : 0);
	return hash;
    }
} // End class definition for TimeChangeDetails
