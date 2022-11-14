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
 * Define the TrailerUnitDescription ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class TrailerUnitDescription extends Sequence {
    public IsDolly isDolly;
    public VehicleWidth width;
    public VehicleLength length;
    public VehicleHeight height;
    public TrailerMass mass;
    public BumperHeights bumperHeights;
    public VehicleHeight centerOfGravity;
    public PivotPointDescription frontPivot;
    public PivotPointDescription rearPivot;
    public Offset_B12 rearWheelOffset;
    public Node_XY_24b positionOffset;
    public VertOffset_B07 elevationOffset;
    public TrailerHistoryPointList crumbData;
    
    /**
     * The default constructor.
     */
    public TrailerUnitDescription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrailerUnitDescription(IsDolly isDolly, VehicleWidth width, 
		    VehicleLength length, VehicleHeight height, 
		    TrailerMass mass, BumperHeights bumperHeights, 
		    VehicleHeight centerOfGravity, 
		    PivotPointDescription frontPivot, 
		    PivotPointDescription rearPivot, 
		    Offset_B12 rearWheelOffset, Node_XY_24b positionOffset, 
		    VertOffset_B07 elevationOffset, 
		    TrailerHistoryPointList crumbData)
    {
	setIsDolly(isDolly);
	setWidth(width);
	setLength(length);
	setHeight(height);
	setMass(mass);
	setBumperHeights(bumperHeights);
	setCenterOfGravity(centerOfGravity);
	setFrontPivot(frontPivot);
	setRearPivot(rearPivot);
	setRearWheelOffset(rearWheelOffset);
	setPositionOffset(positionOffset);
	setElevationOffset(elevationOffset);
	setCrumbData(crumbData);
    }
    
    /**
     * Construct with required components.
     */
    public TrailerUnitDescription(IsDolly isDolly, VehicleWidth width, 
		    VehicleLength length, PivotPointDescription frontPivot, 
		    Node_XY_24b positionOffset)
    {
	setIsDolly(isDolly);
	setWidth(width);
	setLength(length);
	setFrontPivot(frontPivot);
	setPositionOffset(positionOffset);
    }
    
    
    // Methods for field "isDolly"
    public IsDolly getIsDolly()
    {
	return this.isDolly;
    }
    
    public void setIsDolly(IsDolly isDolly)
    {
	this.isDolly = isDolly;
    }
    
    
    // Methods for field "width"
    public VehicleWidth getWidth()
    {
	return this.width;
    }
    
    public void setWidth(VehicleWidth width)
    {
	this.width = width;
    }
    
    
    // Methods for field "length"
    public VehicleLength getLength()
    {
	return this.length;
    }
    
    public void setLength(VehicleLength length)
    {
	this.length = length;
    }
    
    
    // Methods for field "height"
    public VehicleHeight getHeight()
    {
	return this.height;
    }
    
    public void setHeight(VehicleHeight height)
    {
	this.height = height;
    }
    
    public boolean hasHeight()
    {
	return (height != null);
    }
    
    public void deleteHeight()
    {
	height = null;
    }
    
    
    // Methods for field "mass"
    public TrailerMass getMass()
    {
	return this.mass;
    }
    
    public void setMass(TrailerMass mass)
    {
	this.mass = mass;
    }
    
    public boolean hasMass()
    {
	return (mass != null);
    }
    
    public void deleteMass()
    {
	mass = null;
    }
    
    
    // Methods for field "bumperHeights"
    public BumperHeights getBumperHeights()
    {
	return this.bumperHeights;
    }
    
    public void setBumperHeights(BumperHeights bumperHeights)
    {
	this.bumperHeights = bumperHeights;
    }
    
    public boolean hasBumperHeights()
    {
	return (bumperHeights != null);
    }
    
    public void deleteBumperHeights()
    {
	bumperHeights = null;
    }
    
    
    // Methods for field "centerOfGravity"
    public VehicleHeight getCenterOfGravity()
    {
	return this.centerOfGravity;
    }
    
    public void setCenterOfGravity(VehicleHeight centerOfGravity)
    {
	this.centerOfGravity = centerOfGravity;
    }
    
    public boolean hasCenterOfGravity()
    {
	return (centerOfGravity != null);
    }
    
    public void deleteCenterOfGravity()
    {
	centerOfGravity = null;
    }
    
    
    // Methods for field "frontPivot"
    public PivotPointDescription getFrontPivot()
    {
	return this.frontPivot;
    }
    
    public void setFrontPivot(PivotPointDescription frontPivot)
    {
	this.frontPivot = frontPivot;
    }
    
    
    // Methods for field "rearPivot"
    public PivotPointDescription getRearPivot()
    {
	return this.rearPivot;
    }
    
    public void setRearPivot(PivotPointDescription rearPivot)
    {
	this.rearPivot = rearPivot;
    }
    
    public boolean hasRearPivot()
    {
	return (rearPivot != null);
    }
    
    public void deleteRearPivot()
    {
	rearPivot = null;
    }
    
    
    // Methods for field "rearWheelOffset"
    public Offset_B12 getRearWheelOffset()
    {
	return this.rearWheelOffset;
    }
    
    public void setRearWheelOffset(Offset_B12 rearWheelOffset)
    {
	this.rearWheelOffset = rearWheelOffset;
    }
    
    public boolean hasRearWheelOffset()
    {
	return (rearWheelOffset != null);
    }
    
    public void deleteRearWheelOffset()
    {
	rearWheelOffset = null;
    }
    
    
    // Methods for field "positionOffset"
    public Node_XY_24b getPositionOffset()
    {
	return this.positionOffset;
    }
    
    public void setPositionOffset(Node_XY_24b positionOffset)
    {
	this.positionOffset = positionOffset;
    }
    
    
    // Methods for field "elevationOffset"
    public VertOffset_B07 getElevationOffset()
    {
	return this.elevationOffset;
    }
    
    public void setElevationOffset(VertOffset_B07 elevationOffset)
    {
	this.elevationOffset = elevationOffset;
    }
    
    public boolean hasElevationOffset()
    {
	return (elevationOffset != null);
    }
    
    public void deleteElevationOffset()
    {
	elevationOffset = null;
    }
    
    
    // Methods for field "crumbData"
    public TrailerHistoryPointList getCrumbData()
    {
	return this.crumbData;
    }
    
    public void setCrumbData(TrailerHistoryPointList crumbData)
    {
	this.crumbData = crumbData;
    }
    
    public boolean hasCrumbData()
    {
	return (crumbData != null);
    }
    
    public void deleteCrumbData()
    {
	crumbData = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__isDolly("isDolly"),
	__width("width"),
	__length("length"),
	__height("height"),
	__mass("mass"),
	__bumperHeights("bumperHeights"),
	__centerOfGravity("centerOfGravity"),
	__frontPivot("frontPivot"),
	__rearPivot("rearPivot"),
	__rearWheelOffset("rearWheelOffset"),
	__positionOffset("positionOffset"),
	__elevationOffset("elevationOffset"),
	__crumbData("crumbData"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(14);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, TrailerUnitDescription data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.height != null);
	sink.writeBit(data.mass != null);
	sink.writeBit(data.bumperHeights != null);
	sink.writeBit(data.centerOfGravity != null);
	sink.writeBit(data.rearPivot != null);
	sink.writeBit(data.rearWheelOffset != null);
	sink.writeBit(data.elevationOffset != null);
	sink.writeBit(data.crumbData != null);
	nbits += 9;
	// Encode field 'isDolly'
	try {
	    IsDolly item1 = data.isDolly;

	    sink.writeBit(item1.booleanValue());
	    nbits += (1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("isDolly", "IsDolly");
	    throw ee;
	}
	// Encode field 'width'
	try {
	    VehicleWidth item1 = data.width;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 1023)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1023, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("width", "VehicleWidth");
	    throw ee;
	}
	// Encode field 'length'
	try {
	    VehicleLength item1 = data.length;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 4095)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 4095, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("length", "VehicleLength");
	    throw ee;
	}
	if (data.height != null) {
	    // Encode field 'height'
	    try {
		VehicleHeight item1 = data.height;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("height", "VehicleHeight");
		throw ee;
	    }
	}
	if (data.mass != null) {
	    // Encode field 'mass'
	    try {
		TrailerMass item1 = data.mass;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("mass", "TrailerMass");
		throw ee;
	    }
	}
	if (data.bumperHeights != null) {
	    // Encode field 'bumperHeights'
	    try {
		BumperHeights item1 = data.bumperHeights;

		nbits += BumperHeights.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("bumperHeights", "BumperHeights");
		throw ee;
	    }
	}
	if (data.centerOfGravity != null) {
	    // Encode field 'centerOfGravity'
	    try {
		VehicleHeight item1 = data.centerOfGravity;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("centerOfGravity", "VehicleHeight");
		throw ee;
	    }
	}
	// Encode field 'frontPivot'
	try {
	    PivotPointDescription item1 = data.frontPivot;

	    nbits += PivotPointDescription.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("frontPivot", "PivotPointDescription");
	    throw ee;
	}
	if (data.rearPivot != null) {
	    // Encode field 'rearPivot'
	    try {
		PivotPointDescription item1 = data.rearPivot;

		nbits += PivotPointDescription.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rearPivot", "PivotPointDescription");
		throw ee;
	    }
	}
	if (data.rearWheelOffset != null) {
	    // Encode field 'rearWheelOffset'
	    try {
		Offset_B12 item1 = data.rearWheelOffset;
		long temp1 = item1.longValue();

		if (temp1 < -2048 || temp1 > 2047)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -2048, 2047, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rearWheelOffset", "Offset-B12");
		throw ee;
	    }
	}
	// Encode field 'positionOffset'
	try {
	    Node_XY_24b item1 = data.positionOffset;

	    nbits += Node_XY_24b.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("positionOffset", "Node-XY-24b");
	    throw ee;
	}
	if (data.elevationOffset != null) {
	    // Encode field 'elevationOffset'
	    try {
		VertOffset_B07 item1 = data.elevationOffset;
		long temp1 = item1.longValue();

		if (temp1 < -64 || temp1 > 63)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -64, 63, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("elevationOffset", "VertOffset-B07");
		throw ee;
	    }
	}
	if (data.crumbData != null) {
	    // Encode field 'crumbData'
	    try {
		TrailerHistoryPointList item1 = data.crumbData;

		nbits += TrailerHistoryPointList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crumbData", "TrailerHistoryPointList");
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
    public static TrailerUnitDescription decodeValue(PerCoder coder, InputBitStream source, TrailerUnitDescription data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_height0 = source.readBit();
	boolean has_mass0 = source.readBit();
	boolean has_bumperHeights0 = source.readBit();
	boolean has_centerOfGravity0 = source.readBit();
	boolean has_rearPivot0 = source.readBit();
	boolean has_rearWheelOffset0 = source.readBit();
	boolean has_elevationOffset0 = source.readBit();
	boolean has_crumbData0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'isDolly'
	try {
	    if (data.isDolly == null)
		data.isDolly = new IsDolly();
	    data.isDolly.setValue(source.readBit());
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("isDolly", "IsDolly");
	    throw de;
	}
	// Decode field 'width'
	try {
	    long temp1;

	    if (data.width == null)
		data.width = new VehicleWidth();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1023);
	    if (temp1 > 1023)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.width.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("width", "VehicleWidth");
	    throw de;
	}
	// Decode field 'length'
	try {
	    long temp1;

	    if (data.length == null)
		data.length = new VehicleLength();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 4095);
	    if (temp1 > 4095)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.length.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("length", "VehicleLength");
	    throw de;
	}
	if (has_height0) {
	    // Decode field 'height'
	    try {
		long temp1;

		if (data.height == null)
		    data.height = new VehicleHeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.height.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("height", "VehicleHeight");
		throw de;
	    }
	} else {
	    data.height = null;
	}
	if (has_mass0) {
	    // Decode field 'mass'
	    try {
		long temp1;

		if (data.mass == null)
		    data.mass = new TrailerMass();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.mass.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("mass", "TrailerMass");
		throw de;
	    }
	} else {
	    data.mass = null;
	}
	if (has_bumperHeights0) {
	    // Decode field 'bumperHeights'
	    try {
		if (data.bumperHeights == null)
		    data.bumperHeights = new BumperHeights();
		data.bumperHeights.decodeValue(coder, source, data.bumperHeights);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("bumperHeights", "BumperHeights");
		throw de;
	    }
	} else {
	    data.bumperHeights = null;
	}
	if (has_centerOfGravity0) {
	    // Decode field 'centerOfGravity'
	    try {
		long temp1;

		if (data.centerOfGravity == null)
		    data.centerOfGravity = new VehicleHeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.centerOfGravity.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("centerOfGravity", "VehicleHeight");
		throw de;
	    }
	} else {
	    data.centerOfGravity = null;
	}
	// Decode field 'frontPivot'
	try {
	    if (data.frontPivot == null)
		data.frontPivot = new PivotPointDescription();
	    data.frontPivot.decodeValue(coder, source, data.frontPivot);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("frontPivot", "PivotPointDescription");
	    throw de;
	}
	if (has_rearPivot0) {
	    // Decode field 'rearPivot'
	    try {
		if (data.rearPivot == null)
		    data.rearPivot = new PivotPointDescription();
		data.rearPivot.decodeValue(coder, source, data.rearPivot);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rearPivot", "PivotPointDescription");
		throw de;
	    }
	} else {
	    data.rearPivot = null;
	}
	if (has_rearWheelOffset0) {
	    // Decode field 'rearWheelOffset'
	    try {
		long temp1;

		if (data.rearWheelOffset == null)
		    data.rearWheelOffset = new Offset_B12();
		temp1 = coder.decodeConstrainedWholeNumber(source, -2048, 2047);
		if (temp1 > 2047)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.rearWheelOffset.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rearWheelOffset", "Offset-B12");
		throw de;
	    }
	} else {
	    data.rearWheelOffset = null;
	}
	// Decode field 'positionOffset'
	try {
	    if (data.positionOffset == null)
		data.positionOffset = new Node_XY_24b();
	    data.positionOffset.decodeValue(coder, source, data.positionOffset);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("positionOffset", "Node-XY-24b");
	    throw de;
	}
	if (has_elevationOffset0) {
	    // Decode field 'elevationOffset'
	    try {
		long temp1;

		if (data.elevationOffset == null)
		    data.elevationOffset = new VertOffset_B07();
		temp1 = coder.decodeConstrainedWholeNumber(source, -64, 63);
		if (temp1 > 63)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.elevationOffset.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("elevationOffset", "VertOffset-B07");
		throw de;
	    }
	} else {
	    data.elevationOffset = null;
	}
	if (has_crumbData0) {
	    // Decode field 'crumbData'
	    try {
		if (data.crumbData == null)
		    data.crumbData = new TrailerHistoryPointList();
		data.crumbData.decodeValue(coder, source, data.crumbData);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("crumbData", "TrailerHistoryPointList");
		throw de;
	    }
	} else {
	    data.crumbData = null;
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
	// Encode field 'isDolly'
	try {
	    IsDolly item1 = this.isDolly;

	    {
		sink.encodeKey("isDolly");
		sink.writeBoolean(item1.booleanValue());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("isDolly", "IsDolly");
	    throw ee;
	}
	// Encode field 'width'
	try {
	    VehicleWidth item1 = this.width;

	    {
		sink.writeSeparator();
		sink.encodeKey("width");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("width", "VehicleWidth");
	    throw ee;
	}
	// Encode field 'length'
	try {
	    VehicleLength item1 = this.length;

	    {
		sink.writeSeparator();
		sink.encodeKey("length");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("length", "VehicleLength");
	    throw ee;
	}
	// Encode field 'height'
	try {
	    VehicleHeight item1 = this.height;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("height");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "height");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("height", "VehicleHeight");
	    throw ee;
	}
	// Encode field 'mass'
	try {
	    TrailerMass item1 = this.mass;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("mass");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "mass");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("mass", "TrailerMass");
	    throw ee;
	}
	// Encode field 'bumperHeights'
	try {
	    BumperHeights item1 = this.bumperHeights;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("bumperHeights");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "bumperHeights");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bumperHeights", "BumperHeights");
	    throw ee;
	}
	// Encode field 'centerOfGravity'
	try {
	    VehicleHeight item1 = this.centerOfGravity;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("centerOfGravity");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "centerOfGravity");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("centerOfGravity", "VehicleHeight");
	    throw ee;
	}
	// Encode field 'frontPivot'
	try {
	    PivotPointDescription item1 = this.frontPivot;

	    {
		sink.writeSeparator();
		sink.encodeKey("frontPivot");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("frontPivot", "PivotPointDescription");
	    throw ee;
	}
	// Encode field 'rearPivot'
	try {
	    PivotPointDescription item1 = this.rearPivot;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("rearPivot");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "rearPivot");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rearPivot", "PivotPointDescription");
	    throw ee;
	}
	// Encode field 'rearWheelOffset'
	try {
	    Offset_B12 item1 = this.rearWheelOffset;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("rearWheelOffset");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "rearWheelOffset");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rearWheelOffset", "Offset-B12");
	    throw ee;
	}
	// Encode field 'positionOffset'
	try {
	    Node_XY_24b item1 = this.positionOffset;

	    {
		sink.writeSeparator();
		sink.encodeKey("positionOffset");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("positionOffset", "Node-XY-24b");
	    throw ee;
	}
	// Encode field 'elevationOffset'
	try {
	    VertOffset_B07 item1 = this.elevationOffset;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("elevationOffset");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "elevationOffset");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elevationOffset", "VertOffset-B07");
	    throw ee;
	}
	// Encode field 'crumbData'
	try {
	    TrailerHistoryPointList item1 = this.crumbData;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("crumbData");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "crumbData");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crumbData", "TrailerHistoryPointList");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public TrailerUnitDescription decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[14];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __isDolly:
		    // Decode field 'isDolly'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.isDolly == null)
			    this.isDolly = new IsDolly();
			this.isDolly.setValue(coder.decodeBoolean(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("isDolly", "IsDolly");
			throw de;
		    }
		    break;
		    case __width:
		    // Decode field 'width'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.width == null)
			    this.width = new VehicleWidth();
			this.width.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("width", "VehicleWidth");
			throw de;
		    }
		    break;
		    case __length:
		    // Decode field 'length'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.length == null)
			    this.length = new VehicleLength();
			this.length.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("length", "VehicleLength");
			throw de;
		    }
		    break;
		    case __height:
		    // Decode field 'height'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.height == null)
				this.height = new VehicleHeight();
			    this.height.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("height", "VehicleHeight");
			throw de;
		    }
		    break;
		    case __mass:
		    // Decode field 'mass'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.mass == null)
				this.mass = new TrailerMass();
			    this.mass.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("mass", "TrailerMass");
			throw de;
		    }
		    break;
		    case __bumperHeights:
		    // Decode field 'bumperHeights'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.bumperHeights == null)
				this.bumperHeights = new BumperHeights();
			    this.bumperHeights.decodeValue(coder, source);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("bumperHeights", "BumperHeights");
			throw de;
		    }
		    break;
		    case __centerOfGravity:
		    // Decode field 'centerOfGravity'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.centerOfGravity == null)
				this.centerOfGravity = new VehicleHeight();
			    this.centerOfGravity.setValue(coder.decodeInteger(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("centerOfGravity", "VehicleHeight");
			throw de;
		    }
		    break;
		    case __frontPivot:
		    // Decode field 'frontPivot'
		    try {
			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.frontPivot == null)
			    this.frontPivot = new PivotPointDescription();
			this.frontPivot.decodeValue(coder, source);
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("frontPivot", "PivotPointDescription");
			throw de;
		    }
		    break;
		    case __rearPivot:
		    // Decode field 'rearPivot'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rearPivot == null)
				this.rearPivot = new PivotPointDescription();
			    this.rearPivot.decodeValue(coder, source);
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rearPivot", "PivotPointDescription");
			throw de;
		    }
		    break;
		    case __rearWheelOffset:
		    // Decode field 'rearWheelOffset'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rearWheelOffset == null)
				this.rearWheelOffset = new Offset_B12();
			    this.rearWheelOffset.setValue(coder.decodeInteger(source));
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rearWheelOffset", "Offset-B12");
			throw de;
		    }
		    break;
		    case __positionOffset:
		    // Decode field 'positionOffset'
		    try {
			if (present0[10])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.positionOffset == null)
			    this.positionOffset = new Node_XY_24b();
			this.positionOffset.decodeValue(coder, source);
			present0[10] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("positionOffset", "Node-XY-24b");
			throw de;
		    }
		    break;
		    case __elevationOffset:
		    // Decode field 'elevationOffset'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[11])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.elevationOffset == null)
				this.elevationOffset = new VertOffset_B07();
			    this.elevationOffset.setValue(coder.decodeInteger(source));
			    present0[11] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("elevationOffset", "VertOffset-B07");
			throw de;
		    }
		    break;
		    case __crumbData:
		    // Decode field 'crumbData'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[12])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.crumbData == null)
				this.crumbData = new TrailerHistoryPointList();
			    this.crumbData.decodeValue(coder, source);
			    present0[12] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("crumbData", "TrailerHistoryPointList");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'isDolly'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'width'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'length'");
	if (!present0[3])
	    this.height = null;
	if (!present0[4])
	    this.mass = null;
	if (!present0[5])
	    this.bumperHeights = null;
	if (!present0[6])
	    this.centerOfGravity = null;
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'frontPivot'");
	if (!present0[8])
	    this.rearPivot = null;
	if (!present0[9])
	    this.rearWheelOffset = null;
	if (!present0[10])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'positionOffset'");
	if (!present0[11])
	    this.elevationOffset = null;
	if (!present0[12])
	    this.crumbData = null;
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
	    writer.print("isDolly ");
	    printer.print(this.isDolly, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("width ");
	    writer.print(this.width.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("length ");
	    writer.print(this.length.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.height != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("height ");
		writer.print(this.height.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.mass != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("mass ");
		writer.print(this.mass.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.bumperHeights != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("bumperHeights ");
		this.bumperHeights.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.centerOfGravity != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("centerOfGravity ");
		writer.print(this.centerOfGravity.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("frontPivot ");
	    this.frontPivot.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.rearPivot != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("rearPivot ");
		this.rearPivot.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.rearWheelOffset != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("rearWheelOffset ");
		writer.print(this.rearWheelOffset.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("positionOffset ");
	    this.positionOffset.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.elevationOffset != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("elevationOffset ");
		writer.print(this.elevationOffset.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.crumbData != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("crumbData ");
		this.crumbData.printValue(printer, writer);
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
	return equalTo((TrailerUnitDescription)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((TrailerUnitDescription)that);
    }
    
    public boolean equalTo(TrailerUnitDescription that) {
	if (!this.isDolly.equalTo(that.isDolly))
	    return false;
	if (!this.width.equalTo(that.width))
	    return false;
	if (!this.length.equalTo(that.length))
	    return false;
	if (this.height != null) {
	    if (that.height == null || !this.height.equalTo(that.height))
		return false;
	} else if (that.height != null)
	    return false;
	if (this.mass != null) {
	    if (that.mass == null || !this.mass.equalTo(that.mass))
		return false;
	} else if (that.mass != null)
	    return false;
	if (this.bumperHeights != null) {
	    if (that.bumperHeights == null || !this.bumperHeights.equalTo(that.bumperHeights))
		return false;
	} else if (that.bumperHeights != null)
	    return false;
	if (this.centerOfGravity != null) {
	    if (that.centerOfGravity == null || !this.centerOfGravity.equalTo(that.centerOfGravity))
		return false;
	} else if (that.centerOfGravity != null)
	    return false;
	if (!this.frontPivot.equalTo(that.frontPivot))
	    return false;
	if (this.rearPivot != null) {
	    if (that.rearPivot == null || !this.rearPivot.equalTo(that.rearPivot))
		return false;
	} else if (that.rearPivot != null)
	    return false;
	if (this.rearWheelOffset != null) {
	    if (that.rearWheelOffset == null || !this.rearWheelOffset.equalTo(that.rearWheelOffset))
		return false;
	} else if (that.rearWheelOffset != null)
	    return false;
	if (!this.positionOffset.equalTo(that.positionOffset))
	    return false;
	if (this.elevationOffset != null) {
	    if (that.elevationOffset == null || !this.elevationOffset.equalTo(that.elevationOffset))
		return false;
	} else if (that.elevationOffset != null)
	    return false;
	if (this.crumbData != null) {
	    if (that.crumbData == null || !this.crumbData.equalTo(that.crumbData))
		return false;
	} else if (that.crumbData != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public TrailerUnitDescription clone() {
	TrailerUnitDescription copy = (TrailerUnitDescription)super.clone();
	copy.isDolly = isDolly.clone();
	copy.width = width.clone();
	copy.length = length.clone();
	if (height != null) {
	    copy.height = height.clone();
	}
	if (mass != null) {
	    copy.mass = mass.clone();
	}
	if (bumperHeights != null) {
	    copy.bumperHeights = bumperHeights.clone();
	}
	if (centerOfGravity != null) {
	    copy.centerOfGravity = centerOfGravity.clone();
	}
	copy.frontPivot = frontPivot.clone();
	if (rearPivot != null) {
	    copy.rearPivot = rearPivot.clone();
	}
	if (rearWheelOffset != null) {
	    copy.rearWheelOffset = rearWheelOffset.clone();
	}
	copy.positionOffset = positionOffset.clone();
	if (elevationOffset != null) {
	    copy.elevationOffset = elevationOffset.clone();
	}
	if (crumbData != null) {
	    copy.crumbData = crumbData.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.isDolly != null ? this.isDolly.hashCode() : 0);
	hash = 41 * hash + (this.width != null ? this.width.hashCode() : 0);
	hash = 41 * hash + (this.length != null ? this.length.hashCode() : 0);
	hash = 41 * hash + (this.height != null ? this.height.hashCode() : 0);
	hash = 41 * hash + (this.mass != null ? this.mass.hashCode() : 0);
	hash = 41 * hash + (this.bumperHeights != null ? this.bumperHeights.hashCode() : 0);
	hash = 41 * hash + (this.centerOfGravity != null ? this.centerOfGravity.hashCode() : 0);
	hash = 41 * hash + (this.frontPivot != null ? this.frontPivot.hashCode() : 0);
	hash = 41 * hash + (this.rearPivot != null ? this.rearPivot.hashCode() : 0);
	hash = 41 * hash + (this.rearWheelOffset != null ? this.rearWheelOffset.hashCode() : 0);
	hash = 41 * hash + (this.positionOffset != null ? this.positionOffset.hashCode() : 0);
	hash = 41 * hash + (this.elevationOffset != null ? this.elevationOffset.hashCode() : 0);
	hash = 41 * hash + (this.crumbData != null ? this.crumbData.hashCode() : 0);
	return hash;
    }
} // End class definition for TrailerUnitDescription
