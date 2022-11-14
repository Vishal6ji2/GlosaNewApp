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
 * Define the TrailerHistoryPoint ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class TrailerHistoryPoint extends Sequence {
    public Angle pivotAngle;
    public TimeOffset timeOffset;
    public Node_XY_24b positionOffset;
    public VertOffset_B07 elevationOffset;
    public CoarseHeading heading;
    
    /**
     * The default constructor.
     */
    public TrailerHistoryPoint()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrailerHistoryPoint(Angle pivotAngle, TimeOffset timeOffset, 
		    Node_XY_24b positionOffset, 
		    VertOffset_B07 elevationOffset, CoarseHeading heading)
    {
	setPivotAngle(pivotAngle);
	setTimeOffset(timeOffset);
	setPositionOffset(positionOffset);
	setElevationOffset(elevationOffset);
	setHeading(heading);
    }
    
    /**
     * Construct with required components.
     */
    public TrailerHistoryPoint(Angle pivotAngle, TimeOffset timeOffset, 
		    Node_XY_24b positionOffset)
    {
	setPivotAngle(pivotAngle);
	setTimeOffset(timeOffset);
	setPositionOffset(positionOffset);
    }
    
    
    // Methods for field "pivotAngle"
    public Angle getPivotAngle()
    {
	return this.pivotAngle;
    }
    
    public void setPivotAngle(Angle pivotAngle)
    {
	this.pivotAngle = pivotAngle;
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
	__pivotAngle("pivotAngle"),
	__timeOffset("timeOffset"),
	__positionOffset("positionOffset"),
	__elevationOffset("elevationOffset"),
	__heading("heading"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, TrailerHistoryPoint data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.elevationOffset != null);
	sink.writeBit(data.heading != null);
	nbits += 3;
	// Encode field 'pivotAngle'
	try {
	    Angle item1 = data.pivotAngle;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 28800)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pivotAngle", "Angle");
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
    public static TrailerHistoryPoint decodeValue(PerCoder coder, InputBitStream source, TrailerHistoryPoint data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_elevationOffset0 = source.readBit();
	boolean has_heading0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'pivotAngle'
	try {
	    long temp1;

	    if (data.pivotAngle == null)
		data.pivotAngle = new Angle();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
	    if (temp1 > 28800)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.pivotAngle.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("pivotAngle", "Angle");
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
	// Encode field 'pivotAngle'
	try {
	    Angle item1 = this.pivotAngle;

	    {
		sink.encodeKey("pivotAngle");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pivotAngle", "Angle");
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
    public TrailerHistoryPoint decodeValue(JsonCoder coder, JsonReader source)
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
		    case __pivotAngle:
		    // Decode field 'pivotAngle'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.pivotAngle == null)
			    this.pivotAngle = new Angle();
			this.pivotAngle.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pivotAngle", "Angle");
			throw de;
		    }
		    break;
		    case __timeOffset:
		    // Decode field 'timeOffset'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.timeOffset == null)
			    this.timeOffset = new TimeOffset();
			this.timeOffset.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeOffset", "TimeOffset");
			throw de;
		    }
		    break;
		    case __positionOffset:
		    // Decode field 'positionOffset'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.positionOffset == null)
			    this.positionOffset = new Node_XY_24b();
			this.positionOffset.decodeValue(coder, source);
			present0[2] = true;
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
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.elevationOffset == null)
				this.elevationOffset = new VertOffset_B07();
			    this.elevationOffset.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("elevationOffset", "VertOffset-B07");
			throw de;
		    }
		    break;
		    case __heading:
		    // Decode field 'heading'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.heading == null)
				this.heading = new CoarseHeading();
			    this.heading.setValue(coder.decodeInteger(source));
			    present0[4] = true;
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'pivotAngle'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'timeOffset'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'positionOffset'");
	if (!present0[3])
	    this.elevationOffset = null;
	if (!present0[4])
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
	    writer.print("pivotAngle ");
	    writer.print(this.pivotAngle.longValue());
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
	return equalTo((TrailerHistoryPoint)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((TrailerHistoryPoint)that);
    }
    
    public boolean equalTo(TrailerHistoryPoint that) {
	if (!this.pivotAngle.equalTo(that.pivotAngle))
	    return false;
	if (!this.timeOffset.equalTo(that.timeOffset))
	    return false;
	if (!this.positionOffset.equalTo(that.positionOffset))
	    return false;
	if (this.elevationOffset != null) {
	    if (that.elevationOffset == null || !this.elevationOffset.equalTo(that.elevationOffset))
		return false;
	} else if (that.elevationOffset != null)
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
    public TrailerHistoryPoint clone() {
	TrailerHistoryPoint copy = (TrailerHistoryPoint)super.clone();
	copy.pivotAngle = pivotAngle.clone();
	copy.timeOffset = timeOffset.clone();
	copy.positionOffset = positionOffset.clone();
	if (elevationOffset != null) {
	    copy.elevationOffset = elevationOffset.clone();
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
	hash = 41 * hash + (this.pivotAngle != null ? this.pivotAngle.hashCode() : 0);
	hash = 41 * hash + (this.timeOffset != null ? this.timeOffset.hashCode() : 0);
	hash = 41 * hash + (this.positionOffset != null ? this.positionOffset.hashCode() : 0);
	hash = 41 * hash + (this.elevationOffset != null ? this.elevationOffset.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	return hash;
    }
} // End class definition for TrailerHistoryPoint
