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
 * Define the BSMcoreData ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class BSMcoreData extends Sequence {
    public MsgCount msgCnt;
    public TemporaryID id;
    public DSecond secMark;
    public Latitude lat;
    public Longitude _long;
    public Elevation elev;
    public PositionalAccuracy accuracy;
    public TransmissionState transmission;
    public Speed speed;
    public Heading heading;
    public SteeringWheelAngle angle;
    public AccelerationSet4Way accelSet;
    public BrakeSystemStatus brakes;
    public VehicleSize size;
    
    /**
     * The default constructor.
     */
    public BSMcoreData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BSMcoreData(MsgCount msgCnt, TemporaryID id, DSecond secMark, 
		    Latitude lat, Longitude _long, Elevation elev, 
		    PositionalAccuracy accuracy, 
		    TransmissionState transmission, Speed speed, 
		    Heading heading, SteeringWheelAngle angle, 
		    AccelerationSet4Way accelSet, BrakeSystemStatus brakes, 
		    VehicleSize size)
    {
	setMsgCnt(msgCnt);
	setId(id);
	setSecMark(secMark);
	setLat(lat);
	set_long(_long);
	setElev(elev);
	setAccuracy(accuracy);
	setTransmission(transmission);
	setSpeed(speed);
	setHeading(heading);
	setAngle(angle);
	setAccelSet(accelSet);
	setBrakes(brakes);
	setSize(size);
    }
    
    
    // Methods for field "msgCnt"
    public MsgCount getMsgCnt()
    {
	return this.msgCnt;
    }
    
    public void setMsgCnt(MsgCount msgCnt)
    {
	this.msgCnt = msgCnt;
    }
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return this.id;
    }
    
    public void setId(TemporaryID id)
    {
	this.id = id;
    }
    
    
    // Methods for field "secMark"
    public DSecond getSecMark()
    {
	return this.secMark;
    }
    
    public void setSecMark(DSecond secMark)
    {
	this.secMark = secMark;
    }
    
    
    // Methods for field "lat"
    public Latitude getLat()
    {
	return this.lat;
    }
    
    public void setLat(Latitude lat)
    {
	this.lat = lat;
    }
    
    
    // Methods for field "_long"
    public Longitude get_long()
    {
	return this._long;
    }
    
    public void set_long(Longitude _long)
    {
	this._long = _long;
    }
    
    
    // Methods for field "elev"
    public Elevation getElev()
    {
	return this.elev;
    }
    
    public void setElev(Elevation elev)
    {
	this.elev = elev;
    }
    
    
    // Methods for field "accuracy"
    public PositionalAccuracy getAccuracy()
    {
	return this.accuracy;
    }
    
    public void setAccuracy(PositionalAccuracy accuracy)
    {
	this.accuracy = accuracy;
    }
    
    
    // Methods for field "transmission"
    public TransmissionState getTransmission()
    {
	return this.transmission;
    }
    
    public void setTransmission(TransmissionState transmission)
    {
	this.transmission = transmission;
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
    
    
    // Methods for field "heading"
    public Heading getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(Heading heading)
    {
	this.heading = heading;
    }
    
    
    // Methods for field "angle"
    public SteeringWheelAngle getAngle()
    {
	return this.angle;
    }
    
    public void setAngle(SteeringWheelAngle angle)
    {
	this.angle = angle;
    }
    
    
    // Methods for field "accelSet"
    public AccelerationSet4Way getAccelSet()
    {
	return this.accelSet;
    }
    
    public void setAccelSet(AccelerationSet4Way accelSet)
    {
	this.accelSet = accelSet;
    }
    
    
    // Methods for field "brakes"
    public BrakeSystemStatus getBrakes()
    {
	return this.brakes;
    }
    
    public void setBrakes(BrakeSystemStatus brakes)
    {
	this.brakes = brakes;
    }
    
    
    // Methods for field "size"
    public VehicleSize getSize()
    {
	return this.size;
    }
    
    public void setSize(VehicleSize size)
    {
	this.size = size;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__msgCnt("msgCnt"),
	__id("id"),
	__secMark("secMark"),
	__lat("lat"),
	___long("long"),
	__elev("elev"),
	__accuracy("accuracy"),
	__transmission("transmission"),
	__speed("speed"),
	__heading("heading"),
	__angle("angle"),
	__accelSet("accelSet"),
	__brakes("brakes"),
	__size("size"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(15);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, BSMcoreData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = data.msgCnt;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgCnt", "MsgCount");
	    throw ee;
	}
	// Encode field 'id'
	try {
	    TemporaryID item1 = data.id;
	    int len1 = item1.getSize();

	    if (len1 != 4)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
	    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "TemporaryID");
	    throw ee;
	}
	// Encode field 'secMark'
	try {
	    DSecond item1 = data.secMark;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 65535)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("secMark", "DSecond");
	    throw ee;
	}
	// Encode field 'lat'
	try {
	    Latitude item1 = data.lat;
	    long temp1 = item1.longValue();

	    if (temp1 < -900000000 || temp1 > 900000001)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -900000000, 900000001, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Latitude");
	    throw ee;
	}
	// Encode field 'long'
	try {
	    Longitude item1 = data._long;
	    long temp1 = item1.longValue();

	    if (temp1 < -1799999999 || temp1 > 1800000001)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -1799999999, 1800000001, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Longitude");
	    throw ee;
	}
	// Encode field 'elev'
	try {
	    Elevation item1 = data.elev;
	    long temp1 = item1.longValue();

	    if (temp1 < -4096 || temp1 > 61439)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -4096, 61439, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elev", "Elevation");
	    throw ee;
	}
	// Encode field 'accuracy'
	try {
	    PositionalAccuracy item1 = data.accuracy;

	    nbits += PositionalAccuracy.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accuracy", "PositionalAccuracy");
	    throw ee;
	}
	// Encode field 'transmission'
	try {
	    TransmissionState item1 = data.transmission;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("transmission", "TransmissionState");
	    throw ee;
	}
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
	// Encode field 'heading'
	try {
	    Heading item1 = data.heading;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 28800)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "Heading");
	    throw ee;
	}
	// Encode field 'angle'
	try {
	    SteeringWheelAngle item1 = data.angle;
	    long temp1 = item1.longValue();

	    if (temp1 < -126 || temp1 > 127)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -126, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("angle", "SteeringWheelAngle");
	    throw ee;
	}
	// Encode field 'accelSet'
	try {
	    AccelerationSet4Way item1 = data.accelSet;

	    nbits += AccelerationSet4Way.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw ee;
	}
	// Encode field 'brakes'
	try {
	    BrakeSystemStatus item1 = data.brakes;

	    nbits += BrakeSystemStatus.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakes", "BrakeSystemStatus");
	    throw ee;
	}
	// Encode field 'size'
	try {
	    VehicleSize item1 = data.size;

	    nbits += VehicleSize.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("size", "VehicleSize");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static BSMcoreData decodeValue(PerCoder coder, InputBitStream source, BSMcoreData data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'msgCnt'
	try {
	    long temp1;

	    if (data.msgCnt == null)
		data.msgCnt = new MsgCount();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.msgCnt.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgCnt", "MsgCount");
	    throw de;
	}
	// Decode field 'id'
	try {
	    data.id = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "TemporaryID");
	    throw de;
	}
	// Decode field 'secMark'
	try {
	    long temp1;

	    if (data.secMark == null)
		data.secMark = new DSecond();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.secMark.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("secMark", "DSecond");
	    throw de;
	}
	// Decode field 'lat'
	try {
	    long temp1;

	    if (data.lat == null)
		data.lat = new Latitude();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -900000000, 900000001);
	    if (temp1 > 900000001)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.lat.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lat", "Latitude");
	    throw de;
	}
	// Decode field 'long'
	try {
	    long temp1;

	    if (data._long == null)
		data._long = new Longitude();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -1799999999, 1800000001);
	    if (temp1 > 1800000001)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data._long.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("long", "Longitude");
	    throw de;
	}
	// Decode field 'elev'
	try {
	    long temp1;

	    if (data.elev == null)
		data.elev = new Elevation();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -4096, 61439);
	    if (temp1 > 61439)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.elev.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("elev", "Elevation");
	    throw de;
	}
	// Decode field 'accuracy'
	try {
	    if (data.accuracy == null)
		data.accuracy = new PositionalAccuracy();
	    data.accuracy.decodeValue(coder, source, data.accuracy);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("accuracy", "PositionalAccuracy");
	    throw de;
	}
	// Decode field 'transmission'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx1 < 0 || idx1 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.transmission = TransmissionState.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("transmission", "TransmissionState");
	    throw de;
	}
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
	// Decode field 'heading'
	try {
	    long temp1;

	    if (data.heading == null)
		data.heading = new Heading();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
	    if (temp1 > 28800)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.heading.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("heading", "Heading");
	    throw de;
	}
	// Decode field 'angle'
	try {
	    long temp1;

	    if (data.angle == null)
		data.angle = new SteeringWheelAngle();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -126, 127);
	    if (temp1 > 127)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.angle.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("angle", "SteeringWheelAngle");
	    throw de;
	}
	// Decode field 'accelSet'
	try {
	    if (data.accelSet == null)
		data.accelSet = new AccelerationSet4Way();
	    data.accelSet.decodeValue(coder, source, data.accelSet);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw de;
	}
	// Decode field 'brakes'
	try {
	    if (data.brakes == null)
		data.brakes = new BrakeSystemStatus();
	    data.brakes.decodeValue(coder, source, data.brakes);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("brakes", "BrakeSystemStatus");
	    throw de;
	}
	// Decode field 'size'
	try {
	    if (data.size == null)
		data.size = new VehicleSize();
	    data.size.decodeValue(coder, source, data.size);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("size", "VehicleSize");
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
	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = this.msgCnt;

	    {
		sink.encodeKey("msgCnt");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgCnt", "MsgCount");
	    throw ee;
	}
	// Encode field 'id'
	try {
	    TemporaryID item1 = this.id;

	    {
		sink.writeSeparator();
		sink.encodeKey("id");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "TemporaryID");
	    throw ee;
	}
	// Encode field 'secMark'
	try {
	    DSecond item1 = this.secMark;

	    {
		sink.writeSeparator();
		sink.encodeKey("secMark");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("secMark", "DSecond");
	    throw ee;
	}
	// Encode field 'lat'
	try {
	    Latitude item1 = this.lat;

	    {
		sink.writeSeparator();
		sink.encodeKey("lat");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Latitude");
	    throw ee;
	}
	// Encode field 'long'
	try {
	    Longitude item1 = this._long;

	    {
		sink.writeSeparator();
		sink.encodeKey("long");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Longitude");
	    throw ee;
	}
	// Encode field 'elev'
	try {
	    Elevation item1 = this.elev;

	    {
		sink.writeSeparator();
		sink.encodeKey("elev");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elev", "Elevation");
	    throw ee;
	}
	// Encode field 'accuracy'
	try {
	    PositionalAccuracy item1 = this.accuracy;

	    {
		sink.writeSeparator();
		sink.encodeKey("accuracy");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accuracy", "PositionalAccuracy");
	    throw ee;
	}
	// Encode field 'transmission'
	try {
	    TransmissionState item1 = this.transmission;

	    {
		sink.writeSeparator();
		sink.encodeKey("transmission");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("transmission", "TransmissionState");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    Speed item1 = this.speed;

	    {
		sink.writeSeparator();
		sink.encodeKey("speed");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "Speed");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    Heading item1 = this.heading;

	    {
		sink.writeSeparator();
		sink.encodeKey("heading");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "Heading");
	    throw ee;
	}
	// Encode field 'angle'
	try {
	    SteeringWheelAngle item1 = this.angle;

	    {
		sink.writeSeparator();
		sink.encodeKey("angle");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("angle", "SteeringWheelAngle");
	    throw ee;
	}
	// Encode field 'accelSet'
	try {
	    AccelerationSet4Way item1 = this.accelSet;

	    {
		sink.writeSeparator();
		sink.encodeKey("accelSet");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw ee;
	}
	// Encode field 'brakes'
	try {
	    BrakeSystemStatus item1 = this.brakes;

	    {
		sink.writeSeparator();
		sink.encodeKey("brakes");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakes", "BrakeSystemStatus");
	    throw ee;
	}
	// Encode field 'size'
	try {
	    VehicleSize item1 = this.size;

	    {
		sink.writeSeparator();
		sink.encodeKey("size");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("size", "VehicleSize");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public BSMcoreData decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[15];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __msgCnt:
		    // Decode field 'msgCnt'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.msgCnt == null)
			    this.msgCnt = new MsgCount();
			this.msgCnt.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgCnt", "MsgCount");
			throw de;
		    }
		    break;
		    case __id:
		    // Decode field 'id'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.id = new TemporaryID(coder.decodeOctetString(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "TemporaryID");
			throw de;
		    }
		    break;
		    case __secMark:
		    // Decode field 'secMark'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.secMark == null)
			    this.secMark = new DSecond();
			this.secMark.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("secMark", "DSecond");
			throw de;
		    }
		    break;
		    case __lat:
		    // Decode field 'lat'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.lat == null)
			    this.lat = new Latitude();
			this.lat.setValue(coder.decodeInteger(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lat", "Latitude");
			throw de;
		    }
		    break;
		    case ___long:
		    // Decode field 'long'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this._long == null)
			    this._long = new Longitude();
			this._long.setValue(coder.decodeInteger(source));
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("long", "Longitude");
			throw de;
		    }
		    break;
		    case __elev:
		    // Decode field 'elev'
		    try {
			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.elev == null)
			    this.elev = new Elevation();
			this.elev.setValue(coder.decodeInteger(source));
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("elev", "Elevation");
			throw de;
		    }
		    break;
		    case __accuracy:
		    // Decode field 'accuracy'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.accuracy == null)
			    this.accuracy = new PositionalAccuracy();
			this.accuracy.decodeValue(coder, source);
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("accuracy", "PositionalAccuracy");
			throw de;
		    }
		    break;
		    case __transmission:
		    // Decode field 'transmission'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			TransmissionState temp1;

			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(TransmissionState.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = TransmissionState.cNamedNumbers[idx1];
			this.transmission = temp1;
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("transmission", "TransmissionState");
			throw de;
		    }
		    break;
		    case __speed:
		    // Decode field 'speed'
		    try {
			if (present0[8])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.speed == null)
			    this.speed = new Speed();
			this.speed.setValue(coder.decodeInteger(source));
			present0[8] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed", "Speed");
			throw de;
		    }
		    break;
		    case __heading:
		    // Decode field 'heading'
		    try {
			if (present0[9])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.heading == null)
			    this.heading = new Heading();
			this.heading.setValue(coder.decodeInteger(source));
			present0[9] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("heading", "Heading");
			throw de;
		    }
		    break;
		    case __angle:
		    // Decode field 'angle'
		    try {
			if (present0[10])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.angle == null)
			    this.angle = new SteeringWheelAngle();
			this.angle.setValue(coder.decodeInteger(source));
			present0[10] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("angle", "SteeringWheelAngle");
			throw de;
		    }
		    break;
		    case __accelSet:
		    // Decode field 'accelSet'
		    try {
			if (present0[11])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.accelSet == null)
			    this.accelSet = new AccelerationSet4Way();
			this.accelSet.decodeValue(coder, source);
			present0[11] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("accelSet", "AccelerationSet4Way");
			throw de;
		    }
		    break;
		    case __brakes:
		    // Decode field 'brakes'
		    try {
			if (present0[12])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.brakes == null)
			    this.brakes = new BrakeSystemStatus();
			this.brakes.decodeValue(coder, source);
			present0[12] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("brakes", "BrakeSystemStatus");
			throw de;
		    }
		    break;
		    case __size:
		    // Decode field 'size'
		    try {
			if (present0[13])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.size == null)
			    this.size = new VehicleSize();
			this.size.decodeValue(coder, source);
			present0[13] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("size", "VehicleSize");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'msgCnt'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'id'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'secMark'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'lat'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'long'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'elev'");
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'accuracy'");
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'transmission'");
	if (!present0[8])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'speed'");
	if (!present0[9])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'heading'");
	if (!present0[10])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'angle'");
	if (!present0[11])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'accelSet'");
	if (!present0[12])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'brakes'");
	if (!present0[13])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'size'");
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
	    writer.print("msgCnt ");
	    writer.print(this.msgCnt.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("id ");
	    printer.print(this.id, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("secMark ");
	    writer.print(this.secMark.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("lat ");
	    writer.print(this.lat.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("long ");
	    writer.print(this._long.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("elev ");
	    writer.print(this.elev.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("accuracy ");
	    this.accuracy.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("transmission ");
	    printer.print(this.transmission, writer, this.transmission.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("speed ");
	    writer.print(this.speed.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("heading ");
	    writer.print(this.heading.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("angle ");
	    writer.print(this.angle.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("accelSet ");
	    this.accelSet.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("brakes ");
	    this.brakes.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("size ");
	    this.size.printValue(printer, writer);
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
	return equalTo((BSMcoreData)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((BSMcoreData)that);
    }
    
    public boolean equalTo(BSMcoreData that) {
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (!this.id.equalTo(that.id))
	    return false;
	if (!this.secMark.equalTo(that.secMark))
	    return false;
	if (!this.lat.equalTo(that.lat))
	    return false;
	if (!this._long.equalTo(that._long))
	    return false;
	if (!this.elev.equalTo(that.elev))
	    return false;
	if (!this.accuracy.equalTo(that.accuracy))
	    return false;
	if (!this.transmission.equalTo(that.transmission))
	    return false;
	if (!this.speed.equalTo(that.speed))
	    return false;
	if (!this.heading.equalTo(that.heading))
	    return false;
	if (!this.angle.equalTo(that.angle))
	    return false;
	if (!this.accelSet.equalTo(that.accelSet))
	    return false;
	if (!this.brakes.equalTo(that.brakes))
	    return false;
	if (!this.size.equalTo(that.size))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public BSMcoreData clone() {
	BSMcoreData copy = (BSMcoreData)super.clone();
	copy.msgCnt = msgCnt.clone();
	copy.id = id.clone();
	copy.secMark = secMark.clone();
	copy.lat = lat.clone();
	copy._long = _long.clone();
	copy.elev = elev.clone();
	copy.accuracy = accuracy.clone();
	copy.transmission = transmission.clone();
	copy.speed = speed.clone();
	copy.heading = heading.clone();
	copy.angle = angle.clone();
	copy.accelSet = accelSet.clone();
	copy.brakes = brakes.clone();
	copy.size = size.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.msgCnt != null ? this.msgCnt.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.secMark != null ? this.secMark.hashCode() : 0);
	hash = 41 * hash + (this.lat != null ? this.lat.hashCode() : 0);
	hash = 41 * hash + (this._long != null ? this._long.hashCode() : 0);
	hash = 41 * hash + (this.elev != null ? this.elev.hashCode() : 0);
	hash = 41 * hash + (this.accuracy != null ? this.accuracy.hashCode() : 0);
	hash = 41 * hash + (this.transmission != null ? this.transmission.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.angle != null ? this.angle.hashCode() : 0);
	hash = 41 * hash + (this.accelSet != null ? this.accelSet.hashCode() : 0);
	hash = 41 * hash + (this.brakes != null ? this.brakes.hashCode() : 0);
	hash = 41 * hash + (this.size != null ? this.size.hashCode() : 0);
	return hash;
    }
} // End class definition for BSMcoreData
