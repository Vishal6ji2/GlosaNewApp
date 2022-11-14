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
 * Define the ValidRegion ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class ValidRegion extends Sequence {
    public HeadingSlice direction;
    public Extent extent;
    public Area area;
    
    /**
     * The default constructor.
     */
    public ValidRegion()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ValidRegion(HeadingSlice direction, Extent extent, Area area)
    {
	setDirection(direction);
	setExtent(extent);
	setArea(area);
    }
    
    /**
     * Construct with required components.
     */
    public ValidRegion(HeadingSlice direction, Area area)
    {
	setDirection(direction);
	setArea(area);
    }
    
    
    // Methods for field "direction"
    public HeadingSlice getDirection()
    {
	return this.direction;
    }
    
    public void setDirection(HeadingSlice direction)
    {
	this.direction = direction;
    }
    
    
    // Methods for field "extent"
    public Extent getExtent()
    {
	return this.extent;
    }
    
    public void setExtent(Extent extent)
    {
	this.extent = extent;
    }
    
    public boolean hasExtent()
    {
	return (extent != null);
    }
    
    public void deleteExtent()
    {
	extent = null;
    }
    
    
    // Methods for field "area"
    public Area getArea()
    {
	return this.area;
    }
    
    public void setArea(Area area)
    {
	this.area = area;
    }
    
    
    
    /**
     * Define the Area ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class Area extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Area()
	{
	}
	
	public static final  int  shapePointSet_chosen = 1;
	public static final  int  circle_chosen = 2;
	public static final  int  regionPointSet_chosen = 3;
	
	// Methods for field "shapePointSet"
	public static Area createAreaWithShapePointSet(ShapePointSet shapePointSet)
	{
	    Area __object = new Area();

	    __object.setShapePointSet(shapePointSet);
	    return __object;
	}
	
	public boolean hasShapePointSet()
	{
	    return getChosenFlag() == shapePointSet_chosen;
	}
	
	public ShapePointSet getShapePointSet()
	{
	    if (hasShapePointSet())
		return (ShapePointSet)mChosenValue;
	    else
		return null;
	}
	
	public void setShapePointSet(ShapePointSet shapePointSet)
	{
	    setChosenValue(shapePointSet);
	    setChosenFlag(shapePointSet_chosen);
	}
	
	
	// Methods for field "circle"
	public static Area createAreaWithCircle(Circle circle)
	{
	    Area __object = new Area();

	    __object.setCircle(circle);
	    return __object;
	}
	
	public boolean hasCircle()
	{
	    return getChosenFlag() == circle_chosen;
	}
	
	public Circle getCircle()
	{
	    if (hasCircle())
		return (Circle)mChosenValue;
	    else
		return null;
	}
	
	public void setCircle(Circle circle)
	{
	    setChosenValue(circle);
	    setChosenFlag(circle_chosen);
	}
	
	
	// Methods for field "regionPointSet"
	public static Area createAreaWithRegionPointSet(RegionPointSet regionPointSet)
	{
	    Area __object = new Area();

	    __object.setRegionPointSet(regionPointSet);
	    return __object;
	}
	
	public boolean hasRegionPointSet()
	{
	    return getChosenFlag() == regionPointSet_chosen;
	}
	
	public RegionPointSet getRegionPointSet()
	{
	    if (hasRegionPointSet())
		return (RegionPointSet)mChosenValue;
	    else
		return null;
	}
	
	public void setRegionPointSet(RegionPointSet regionPointSet)
	{
	    setChosenValue(regionPointSet);
	    setChosenFlag(regionPointSet_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __shapePointSet("shapePointSet"),
	    __circle("circle"),
	    __regionPointSet("regionPointSet"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Area data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 3)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 2, sink);
	    switch (idx0) {
		case shapePointSet_chosen:
		    // Encode alternative 'shapePointSet'
		    try {
			ShapePointSet item1 = (ShapePointSet)data.mChosenValue;

			nbits += ShapePointSet.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("shapePointSet", "ShapePointSet", 0);
			throw ee;
		    }
		    break;
		case circle_chosen:
		    // Encode alternative 'circle'
		    try {
			Circle item1 = (Circle)data.mChosenValue;

			nbits += Circle.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("circle", "Circle", 0);
			throw ee;
		    }
		    break;
		case regionPointSet_chosen:
		    // Encode alternative 'regionPointSet'
		    try {
			RegionPointSet item1 = (RegionPointSet)data.mChosenValue;

			nbits += RegionPointSet.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("regionPointSet", "RegionPointSet", 0);
			throw ee;
		    }
		    break;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static Area decodeValue(PerCoder coder, InputBitStream source, Area data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2) + 1;
	    if (idx0 < 1 || idx0 > 3)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case shapePointSet_chosen:
		    // Decode alternative 'shapePointSet'
		    try {
			ShapePointSet item1 = new ShapePointSet();

			// Decode alternative 'shapePointSet'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("shapePointSet", "ShapePointSet", 0);
			throw de;
		    }
		    break;
		case circle_chosen:
		    // Decode alternative 'circle'
		    try {
			Circle item1 = new Circle();

			// Decode alternative 'circle'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("circle", "Circle", 0);
			throw de;
		    }
		    break;
		case regionPointSet_chosen:
		    // Decode alternative 'regionPointSet'
		    try {
			RegionPointSet item1 = new RegionPointSet();

			// Decode alternative 'regionPointSet'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("regionPointSet", "RegionPointSet", 0);
			throw de;
		    }
		    break;
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
	    int idx0 = this.mChosenFlag;

	    sink.beginObject();
	    switch (idx0)
	    {
	    case shapePointSet_chosen:
		// Encode alternative 'shapePointSet'
		try {
		    ShapePointSet item1 = (ShapePointSet)this.mChosenValue;

		    sink.encodeKey("shapePointSet");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("shapePointSet", "ShapePointSet", 0);
		    throw ee;
		}
		break;
	    case circle_chosen:
		// Encode alternative 'circle'
		try {
		    Circle item1 = (Circle)this.mChosenValue;

		    sink.encodeKey("circle");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("circle", "Circle", 0);
		    throw ee;
		}
		break;
	    case regionPointSet_chosen:
		// Encode alternative 'regionPointSet'
		try {
		    RegionPointSet item1 = (RegionPointSet)this.mChosenValue;

		    sink.encodeKey("regionPointSet");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("regionPointSet", "RegionPointSet", 0);
		    throw ee;
		}
		break;
	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    }
	    sink.endObject();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public Area decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __shapePointSet:
		    // Decode alternative 'shapePointSet'
		    try {
			ShapePointSet item1 = new ShapePointSet();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = shapePointSet_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("shapePointSet", "ShapePointSet", 0);
			throw de;
		    }
		    break;
		case __circle:
		    // Decode alternative 'circle'
		    try {
			Circle item1 = new Circle();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = circle_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("circle", "Circle", 0);
			throw de;
		    }
		    break;
		case __regionPointSet:
		    // Decode alternative 'regionPointSet'
		    try {
			RegionPointSet item1 = new RegionPointSet();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = regionPointSet_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("regionPointSet", "RegionPointSet", 0);
			throw de;
		    }
		    break;
		default:
		    throw new DecoderException(ExceptionDescriptor._unknown_field, null, tag0);
	    }
	    if (coder.hasMoreProperties(source, false))
		throw new DecoderException(ExceptionDescriptor._json_unexpected_token, null, "expecting '}'");
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
	    switch (this.mChosenFlag) {
	    case shapePointSet_chosen:
		try {
		    writer.print("shapePointSet : ");
		    ((ShapePointSet)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case circle_chosen:
		try {
		    writer.print("circle : ");
		    ((Circle)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case regionPointSet_chosen:
		try {
		    writer.print("regionPointSet : ");
		    ((RegionPointSet)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    default:
		writer.print("-- unknown selection --");
	    }
	}

	/**
	 * Clone 'this' object.
	 */
	public Area clone() {
	    return (Area)super.clone();
	}

    } // End class definition for Area

    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_direction = 
	HeadingSlice._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__direction("direction"),
	__extent("extent"),
	__area("area"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ValidRegion data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.extent != null);
	++nbits;
	// Encode field 'direction'
	try {
	    HeadingSlice item1 = data.direction;
	    int len1 = item1.getSize();
	    int total_len1;

	    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, ValidRegion._cBounds_direction);
	    if (total_len1 != 16)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
	    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("direction", "HeadingSlice");
	    throw ee;
	}
	if (data.extent != null) {
	    // Encode field 'extent'
	    try {
		Extent item1 = data.extent;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("extent", "Extent");
		throw ee;
	    }
	}
	// Encode field 'area'
	try {
	    Area item1 = data.area;

	    nbits += Area.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("area", "CHOICE");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static ValidRegion decodeValue(PerCoder coder, InputBitStream source, ValidRegion data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_extent0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'direction'
	try {
	    if (data.direction == null)
		data.direction = new HeadingSlice();
	    com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, data.direction);
	    if (coder.isStrictCodingEnabled() && data.direction.getSize() >
		com.oss.util.BitTool.computeMinimalLength(data.direction, ValidRegion._cBounds_direction))
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
		    "trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("direction", "HeadingSlice");
	    throw de;
	}
	if (has_extent0) {
	    // Decode field 'extent'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.extent = Extent.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("extent", "Extent");
		throw de;
	    }
	} else {
	    data.extent = null;
	}
	// Decode field 'area'
	try {
	    if (data.area == null)
		data.area = new Area();
	    data.area.decodeValue(coder, source, data.area);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("area", "CHOICE");
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
	// Encode field 'direction'
	try {
	    HeadingSlice item1 = this.direction;

	    {
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("direction");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("direction", "HeadingSlice");
	    throw ee;
	}
	// Encode field 'extent'
	try {
	    Extent item1 = this.extent;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("extent");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "extent");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("extent", "Extent");
	    throw ee;
	}
	// Encode field 'area'
	try {
	    Area item1 = this.area;

	    {
		sink.writeSeparator();
		sink.encodeKey("area");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("area", "CHOICE");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ValidRegion decodeValue(JsonCoder coder, JsonReader source)
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
		    case __direction:
		    // Decode field 'direction'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.direction == null)
			    this.direction = new HeadingSlice();
			coder.decodeBitString(16, source, this.direction);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("direction", "HeadingSlice");
			throw de;
		    }
		    break;
		    case __extent:
		    // Decode field 'extent'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    Extent temp1;

			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(Extent.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = Extent.cNamedNumbers[idx1];
			    this.extent = temp1;
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("extent", "Extent");
			throw de;
		    }
		    break;
		    case __area:
		    // Decode field 'area'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.area == null)
			    this.area = new Area();
			this.area.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("area", "CHOICE");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'direction'");
	if (!present0[1])
	    this.extent = null;
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'area'");
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
	    writer.print("direction ");
	    printer.print(this.direction, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.extent != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("extent ");
		printer.print(this.extent, writer, this.extent.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("area ");
	    this.area.printValue(printer, writer);
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
	return equalTo((ValidRegion)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ValidRegion)that);
    }
    
    public boolean equalTo(ValidRegion that) {
	if (!this.direction.equalTo(that.direction))
	    return false;
	if (this.extent != null) {
	    if (that.extent == null || !this.extent.equalTo(that.extent))
		return false;
	} else if (that.extent != null)
	    return false;
	if (!this.area.equalTo(that.area))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ValidRegion clone() {
	ValidRegion copy = (ValidRegion)super.clone();
	copy.direction = direction.clone();
	if (extent != null) {
	    copy.extent = extent.clone();
	}
	copy.area = area.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.direction != null ? this.direction.hashCode() : 0);
	hash = 41 * hash + (this.extent != null ? this.extent.hashCode() : 0);
	hash = 41 * hash + (this.area != null ? this.area.hashCode() : 0);
	return hash;
    }
} // End class definition for ValidRegion
