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
 * Define the PathHistoryPoint ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class PathHistoryPoint extends Sequence {
    public OffsetLL_B18 latOffset;
    public OffsetLL_B18 lonOffset;
    public VertOffset_B12 elevationOffset;
    public TimeOffset timeOffset;
    public Speed speed;
    public PositionalAccuracy posAccuracy;
    public CoarseHeading heading;
    
    /**
     * The default constructor.
     */
    public PathHistoryPoint()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PathHistoryPoint(OffsetLL_B18 latOffset, OffsetLL_B18 lonOffset, 
		    VertOffset_B12 elevationOffset, TimeOffset timeOffset, 
		    Speed speed, PositionalAccuracy posAccuracy, 
		    CoarseHeading heading)
    {
	setLatOffset(latOffset);
	setLonOffset(lonOffset);
	setElevationOffset(elevationOffset);
	setTimeOffset(timeOffset);
	setSpeed(speed);
	setPosAccuracy(posAccuracy);
	setHeading(heading);
    }
    
    /**
     * Construct with required components.
     */
    public PathHistoryPoint(OffsetLL_B18 latOffset, OffsetLL_B18 lonOffset, 
		    VertOffset_B12 elevationOffset, TimeOffset timeOffset)
    {
	setLatOffset(latOffset);
	setLonOffset(lonOffset);
	setElevationOffset(elevationOffset);
	setTimeOffset(timeOffset);
    }
    
    
    // Methods for field "latOffset"
    public OffsetLL_B18 getLatOffset()
    {
	return this.latOffset;
    }
    
    public void setLatOffset(OffsetLL_B18 latOffset)
    {
	this.latOffset = latOffset;
    }
    
    
    // Methods for field "lonOffset"
    public OffsetLL_B18 getLonOffset()
    {
	return this.lonOffset;
    }
    
    public void setLonOffset(OffsetLL_B18 lonOffset)
    {
	this.lonOffset = lonOffset;
    }
    
    
    // Methods for field "elevationOffset"
    public VertOffset_B12 getElevationOffset()
    {
	return this.elevationOffset;
    }
    
    public void setElevationOffset(VertOffset_B12 elevationOffset)
    {
	this.elevationOffset = elevationOffset;
    }
    
    
    // Methods for field "timeOffset"
    public TimeOffset getTimeOffset()
    {
	return this.timeOffset;
    }
    
    public void setTimeOffset(TimeOffset timeOffset)
    {
	this.timeOffset = timeOffset;
    }
    
    
    // Methods for field "speed"
    public Speed getSpeed()
    {
	return this.speed;
    }
    
    public void setSpeed(Speed speed)
    {
	this.speed = speed;
    }
    
    public boolean hasSpeed()
    {
	return (speed != null);
    }
    
    public void deleteSpeed()
    {
	speed = null;
    }
    
    
    // Methods for field "posAccuracy"
    public PositionalAccuracy getPosAccuracy()
    {
	return this.posAccuracy;
    }
    
    public void setPosAccuracy(PositionalAccuracy posAccuracy)
    {
	this.posAccuracy = posAccuracy;
    }
    
    public boolean hasPosAccuracy()
    {
	return (posAccuracy != null);
    }
    
    public void deletePosAccuracy()
    {
	posAccuracy = null;
    }
    
    
    // Methods for field "heading"
    public CoarseHeading getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(CoarseHeading heading)
    {
	this.heading = heading;
    }
    
    public boolean hasHeading()
    {
	return (heading != null);
    }
    
    public void deleteHeading()
    {
	heading = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__latOffset("latOffset"),
	__lonOffset("lonOffset"),
	__elevationOffset("elevationOffset"),
	__timeOffset("timeOffset"),
	__speed("speed"),
	__posAccuracy("posAccuracy"),
	__heading("heading"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PathHistoryPoint data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.speed != null);
	sink.writeBit(data.posAccuracy != null);
	sink.writeBit(data.heading != null);
	nbits += 4;
	// Encode field 'latOffset'
	try {
	    OffsetLL_B18 item1 = data.latOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -131072 || temp1 > 131071)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -131072, 131071, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("latOffset", "OffsetLL-B18");
	    throw ee;
	}
	// Encode field 'lonOffset'
	try {
	    OffsetLL_B18 item1 = data.lonOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -131072 || temp1 > 131071)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -131072, 131071, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lonOffset", "OffsetLL-B18");
	    throw ee;
	}
	// Encode field 'elevationOffset'
	try {
	    VertOffset_B12 item1 = data.elevationOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -2048 || temp1 > 2047)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -2048, 2047, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elevationOffset", "VertOffset-B12");
	    throw ee;
	}
	// Encode field 'timeOffset'
	try {
	    TimeOffset item1 = data.timeOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < 1 || temp1 > 65535)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 65535, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeOffset", "TimeOffset");
	    throw ee;
	}
	if (data.speed != null) {
	    // Encode field 'speed'
	    try {
		Speed item1 = data.speed;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 8191)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 8191, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "Speed");
		throw ee;
	    }
	}
	if (data.posAccuracy != null) {
	    // Encode field 'posAccuracy'
	    try {
		PositionalAccuracy item1 = data.posAccuracy;

		nbits += PositionalAccuracy.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
		throw ee;
	    }
	}
	if (data.heading != null) {
	    // Encode field 'heading'
	    try {
		CoarseHeading item1 = data.heading;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 240)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 240, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "CoarseHeading");
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
    public static PathHistoryPoint decodeValue(PerCoder coder, InputBitStream source, PathHistoryPoint data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_speed0 = source.readBit();
	boolean has_posAccuracy0 = source.readBit();
	boolean has_heading0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'latOffset'
	try {
	    long temp1;

	    if (data.latOffset == null)
		data.latOffset = new OffsetLL_B18();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -131072, 131071);
	    if (temp1 > 131071)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.latOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("latOffset", "OffsetLL-B18");
	    throw de;
	}
	// Decode field 'lonOffset'
	try {
	    long temp1;

	    if (data.lonOffset == null)
		data.lonOffset = new OffsetLL_B18();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -131072, 131071);
	    if (temp1 > 131071)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.lonOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lonOffset", "OffsetLL-B18");
	    throw de;
	}
	// Decode field 'elevationOffset'
	try {
	    long temp1;

	    if (data.elevationOffset == null)
		data.elevationOffset = new VertOffset_B12();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -2048, 2047);
	    if (temp1 > 2047)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.elevationOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("elevationOffset", "VertOffset-B12");
	    throw de;
	}
	// Decode field 'timeOffset'
	try {
	    long temp1;

	    if (data.timeOffset == null)
		data.timeOffset = new TimeOffset();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 1, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.timeOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("timeOffset", "TimeOffset");
	    throw de;
	}
	if (has_speed0) {
	    // Decode field 'speed'
	    try {
		long temp1;

		if (data.speed == null)
		    data.speed = new Speed();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 8191);
		if (temp1 > 8191)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.speed.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speed", "Speed");
		throw de;
	    }
	} else {
	    data.speed = null;
	}
	if (has_posAccuracy0) {
	    // Decode field 'posAccuracy'
	    try {
		if (data.posAccuracy == null)
		    data.posAccuracy = new PositionalAccuracy();
		data.posAccuracy.decodeValue(coder, source, data.posAccuracy);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("posAccuracy", "PositionalAccuracy");
		throw de;
	    }
	} else {
	    data.posAccuracy = null;
	}
	if (has_heading0) {
	    // Decode field 'heading'
	    try {
		long temp1;

		if (data.heading == null)
		    data.heading = new CoarseHeading();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 240);
		if (temp1 > 240)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.heading.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("heading", "CoarseHeading");
		throw de;
	    }
	} else {
	    data.heading = null;
	}
    /** Decode extensions **/
	if (!_has_extensions0) {
	    return data;
	}
	_has_extensions0 = false;
	len0 = coder.decodeNormallySmallLength(source);
	if (coder.moreFragments())
	    throw new DecoderException(ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	int unknown_exts0 = 0;
	if (len0 > 0)
	    for (int idx0 = 0; idx0 < len0 - 0; idx0++) {
		if (source.readBit())
		    ++unknown_exts0;
	    }
    /** Decode extension fields **/
	bitstream0 = source;
	source = coder.createNestedStream(bitstream0);
	try {
	} finally {
	    source.close();
	}
	source = bitstream0;
	if (unknown_exts0 > 0)
	  {
 // coder.setUnknownExtensionFound();
}
	for (int idx0 = 0; idx0 < unknown_exts0; idx0++) {
	    try {
		com.oss.coders.per.PerOctets.skip(coder, source);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendExtensionContext(null, idx0);
		throw de;
	    }
	}
	if (coder.isStrictCodingEnabled() && !_has_extensions0)
	    throw new DecoderException(ExceptionDescriptor._inval_enc, null,
		"the extension preamble contains only zero bits");
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
	// Encode field 'latOffset'
	try {
	    OffsetLL_B18 item1 = this.latOffset;

	    {
		sink.encodeKey("latOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("latOffset", "OffsetLL-B18");
	    throw ee;
	}
	// Encode field 'lonOffset'
	try {
	    OffsetLL_B18 item1 = this.lonOffset;

	    {
		sink.writeSeparator();
		sink.encodeKey("lonOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lonOffset", "OffsetLL-B18");
	    throw ee;
	}
	// Encode field 'elevationOffset'
	try {
	    VertOffset_B12 item1 = this.elevationOffset;

	    {
		sink.writeSeparator();
		sink.encodeKey("elevationOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elevationOffset", "VertOffset-B12");
	    throw ee;
	}
	// Encode field 'timeOffset'
	try {
	    TimeOffset item1 = this.timeOffset;

	    {
		sink.writeSeparator();
		sink.encodeKey("timeOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeOffset", "TimeOffset");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    Speed item1 = this.speed;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("speed");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "speed");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "Speed");
	    throw ee;
	}
	// Encode field 'posAccuracy'
	try {
	    PositionalAccuracy item1 = this.posAccuracy;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("posAccuracy");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "posAccuracy");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("posAccuracy", "PositionalAccuracy");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    CoarseHeading item1 = this.heading;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("heading");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "heading");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "CoarseHeading");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public PathHistoryPoint decodeValue(JsonCoder coder, JsonReader source)
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
		    case __latOffset:
		    // Decode field 'latOffset'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.latOffset == null)
			    this.latOffset = new OffsetLL_B18();
			this.latOffset.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("latOffset", "OffsetLL-B18");
			throw de;
		    }
		    break;
		    case __lonOffset:
		    // Decode field 'lonOffset'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.lonOffset == null)
			    this.lonOffset = new OffsetLL_B18();
			this.lonOffset.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lonOffset", "OffsetLL-B18");
			throw de;
		    }
		    break;
		    case __elevationOffset:
		    // Decode field 'elevationOffset'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.elevationOffset == null)
			    this.elevationOffset = new VertOffset_B12();
			this.elevationOffset.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("elevationOffset", "VertOffset-B12");
			throw de;
		    }
		    break;
		    case __timeOffset:
		    // Decode field 'timeOffset'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.timeOffset == null)
			    this.timeOffset = new TimeOffset();
			this.timeOffset.setValue(coder.decodeInteger(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeOffset", "TimeOffset");
			throw de;
		    }
		    break;
		    case __speed:
		    // Decode field 'speed'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.speed == null)
				this.speed = new Speed();
			    this.speed.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed", "Speed");
			throw de;
		    }
		    break;
		    case __posAccuracy:
		    // Decode field 'posAccuracy'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.posAccuracy == null)
				this.posAccuracy = new PositionalAccuracy();
			    this.posAccuracy.decodeValue(coder, source);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("posAccuracy", "PositionalAccuracy");
			throw de;
		    }
		    break;
		    case __heading:
		    // Decode field 'heading'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.heading == null)
				this.heading = new CoarseHeading();
			    this.heading.setValue(coder.decodeInteger(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("heading", "CoarseHeading");
			throw de;
		    }
		    break;
		    default:
			//coder.setUnknownExtensionFound();
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'latOffset'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'lonOffset'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'elevationOffset'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'timeOffset'");
	if (!present0[4])
	    this.speed = null;
	if (!present0[5])
	    this.posAccuracy = null;
	if (!present0[6])
	    this.heading = null;
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
	    writer.print("latOffset ");
	    writer.print(this.latOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("lonOffset ");
	    writer.print(this.lonOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("elevationOffset ");
	    writer.print(this.elevationOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("timeOffset ");
	    writer.print(this.timeOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.speed != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("speed ");
		writer.print(this.speed.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.posAccuracy != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("posAccuracy ");
		this.posAccuracy.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.heading != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("heading ");
		writer.print(this.heading.longValue());
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
	return equalTo((PathHistoryPoint)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PathHistoryPoint)that);
    }
    
    public boolean equalTo(PathHistoryPoint that) {
	if (!this.latOffset.equalTo(that.latOffset))
	    return false;
	if (!this.lonOffset.equalTo(that.lonOffset))
	    return false;
	if (!this.elevationOffset.equalTo(that.elevationOffset))
	    return false;
	if (!this.timeOffset.equalTo(that.timeOffset))
	    return false;
	if (this.speed != null) {
	    if (that.speed == null || !this.speed.equalTo(that.speed))
		return false;
	} else if (that.speed != null)
	    return false;
	if (this.posAccuracy != null) {
	    if (that.posAccuracy == null || !this.posAccuracy.equalTo(that.posAccuracy))
		return false;
	} else if (that.posAccuracy != null)
	    return false;
	if (this.heading != null) {
	    if (that.heading == null || !this.heading.equalTo(that.heading))
		return false;
	} else if (that.heading != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public PathHistoryPoint clone() {
	PathHistoryPoint copy = (PathHistoryPoint)super.clone();
	copy.latOffset = latOffset.clone();
	copy.lonOffset = lonOffset.clone();
	copy.elevationOffset = elevationOffset.clone();
	copy.timeOffset = timeOffset.clone();
	if (speed != null) {
	    copy.speed = speed.clone();
	}
	if (posAccuracy != null) {
	    copy.posAccuracy = posAccuracy.clone();
	}
	if (heading != null) {
	    copy.heading = heading.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.latOffset != null ? this.latOffset.hashCode() : 0);
	hash = 41 * hash + (this.lonOffset != null ? this.lonOffset.hashCode() : 0);
	hash = 41 * hash + (this.elevationOffset != null ? this.elevationOffset.hashCode() : 0);
	hash = 41 * hash + (this.timeOffset != null ? this.timeOffset.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	hash = 41 * hash + (this.posAccuracy != null ? this.posAccuracy.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	return hash;
    }
} // End class definition for PathHistoryPoint
