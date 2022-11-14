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
 * Define the VehicleSafetyExtensions ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class VehicleSafetyExtensions extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public VehicleEventFlags events;
    public PathHistory pathHistory;
    public PathPrediction pathPrediction;
    public ExteriorLights lights;
    
    /**
     * The default constructor.
     */
    public VehicleSafetyExtensions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleSafetyExtensions(VehicleEventFlags events, 
		    PathHistory pathHistory, PathPrediction pathPrediction, 
		    ExteriorLights lights)
    {
	setEvents(events);
	setPathHistory(pathHistory);
	setPathPrediction(pathPrediction);
	setLights(lights);
    }
    
    
    // Methods for field "events"
    public VehicleEventFlags getEvents()
    {
	return this.events;
    }
    
    public void setEvents(VehicleEventFlags events)
    {
	this.events = events;
    }
    
    public boolean hasEvents()
    {
	return (events != null);
    }
    
    public void deleteEvents()
    {
	events = null;
    }
    
    
    // Methods for field "pathHistory"
    public PathHistory getPathHistory()
    {
	return this.pathHistory;
    }
    
    public void setPathHistory(PathHistory pathHistory)
    {
	this.pathHistory = pathHistory;
    }
    
    public boolean hasPathHistory()
    {
	return (pathHistory != null);
    }
    
    public void deletePathHistory()
    {
	pathHistory = null;
    }
    
    
    // Methods for field "pathPrediction"
    public PathPrediction getPathPrediction()
    {
	return this.pathPrediction;
    }
    
    public void setPathPrediction(PathPrediction pathPrediction)
    {
	this.pathPrediction = pathPrediction;
    }
    
    public boolean hasPathPrediction()
    {
	return (pathPrediction != null);
    }
    
    public void deletePathPrediction()
    {
	pathPrediction = null;
    }
    
    
    // Methods for field "lights"
    public ExteriorLights getLights()
    {
	return this.lights;
    }
    
    public void setLights(ExteriorLights lights)
    {
	this.lights = lights;
    }
    
    public boolean hasLights()
    {
	return (lights != null);
    }
    
    public void deleteLights()
    {
	lights = null;
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_events = 
	VehicleEventFlags._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_lights = 
	ExteriorLights._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__events("events"),
	__pathHistory("pathHistory"),
	__pathPrediction("pathPrediction"),
	__lights("lights"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleSafetyExtensions data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.events != null);
	sink.writeBit(data.pathHistory != null);
	sink.writeBit(data.pathPrediction != null);
	sink.writeBit(data.lights != null);
	nbits += 5;
	if (data.events != null) {
	    // Encode field 'events'
	    try {
		VehicleEventFlags item1 = data.events;
		int len1 = item1.getSize();
		int total_len1;
		boolean extroot1;
		byte[] temp1 = item1.byteArrayValue();

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, VehicleSafetyExtensions._cBounds_events);
		extroot1 = total_len1 == 13;
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 13, 13, sink);
		else
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("events", "VehicleEventFlags");
		throw ee;
	    }
	}
	if (data.pathHistory != null) {
	    // Encode field 'pathHistory'
	    try {
		PathHistory item1 = data.pathHistory;

		nbits += PathHistory.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathHistory", "PathHistory");
		throw ee;
	    }
	}
	if (data.pathPrediction != null) {
	    // Encode field 'pathPrediction'
	    try {
		PathPrediction item1 = data.pathPrediction;

		nbits += PathPrediction.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathPrediction", "PathPrediction");
		throw ee;
	    }
	}
	if (data.lights != null) {
	    // Encode field 'lights'
	    try {
		ExteriorLights item1 = data.lights;
		int len1 = item1.getSize();
		int total_len1;
		boolean extroot1;
		byte[] temp1 = item1.byteArrayValue();

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, VehicleSafetyExtensions._cBounds_lights);
		extroot1 = total_len1 == 9;
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 9, 9, sink);
		else
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lights", "ExteriorLights");
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
	    ee.appendFieldContext(null, "VehicleSafetyExtensions");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static VehicleSafetyExtensions decodeValue(PerCoder coder, InputBitStream source, VehicleSafetyExtensions data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_events0 = source.readBit();
	boolean has_pathHistory0 = source.readBit();
	boolean has_pathPrediction0 = source.readBit();
	boolean has_lights0 = source.readBit();
    /** Decode root fields **/
	if (has_events0) {
	    // Decode field 'events'
	    try {
		boolean extroot1 = !source.readBit();

		if (data.events == null)
		    data.events = new VehicleEventFlags();
		if (extroot1) {
		    com.oss.coders.per.PerBitstring.decode(coder, source, 13, 13, data.events);
		} else {
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.events);
		}
		if (coder.isStrictCodingEnabled()) {
		    boolean extroot1_range = data.events.getSize() == 13;
		    if (extroot1 != extroot1_range)
			throw new DecoderException(ExceptionDescriptor._inval_enc, null,
			!extroot1 ? "extension bit is set but the length is in the extension root"
			: "extension bit is not set but the length is not in the extension root");
		}
		if (coder.isStrictCodingEnabled() && data.events.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.events, VehicleSafetyExtensions._cBounds_events))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("events", "VehicleEventFlags");
		throw de;
	    }
	} else {
	    data.events = null;
	}
	if (has_pathHistory0) {
	    // Decode field 'pathHistory'
	    try {
		if (data.pathHistory == null)
		    data.pathHistory = new PathHistory();
		data.pathHistory.decodeValue(coder, source, data.pathHistory);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pathHistory", "PathHistory");
		throw de;
	    }
	} else {
	    data.pathHistory = null;
	}
	if (has_pathPrediction0) {
	    // Decode field 'pathPrediction'
	    try {
		if (data.pathPrediction == null)
		    data.pathPrediction = new PathPrediction();
		data.pathPrediction.decodeValue(coder, source, data.pathPrediction);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pathPrediction", "PathPrediction");
		throw de;
	    }
	} else {
	    data.pathPrediction = null;
	}
	if (has_lights0) {
	    // Decode field 'lights'
	    try {
		boolean extroot1 = !source.readBit();

		if (data.lights == null)
		    data.lights = new ExteriorLights();
		if (extroot1) {
		    com.oss.coders.per.PerBitstring.decode(coder, source, 9, 9, data.lights);
		} else {
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.lights);
		}
		if (coder.isStrictCodingEnabled()) {
		    boolean extroot1_range = data.lights.getSize() == 9;
		    if (extroot1 != extroot1_range)
			throw new DecoderException(ExceptionDescriptor._inval_enc, null,
			!extroot1 ? "extension bit is set but the length is in the extension root"
			: "extension bit is not set but the length is not in the extension root");
		}
		if (coder.isStrictCodingEnabled() && data.lights.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.lights, VehicleSafetyExtensions._cBounds_lights))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lights", "ExteriorLights");
		throw de;
	    }
	} else {
	    data.lights = null;
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
	    de.appendFieldContext(null, "VehicleSafetyExtensions");
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'events'
	try {
	    VehicleEventFlags item1 = this.events;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    separator0 = ",";
		    sink.encodeKey("events");
		    coder.encodeBitString(temp1, len1, -1, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "events");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("events", "VehicleEventFlags");
	    throw ee;
	}
	// Encode field 'pathHistory'
	try {
	    PathHistory item1 = this.pathHistory;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("pathHistory");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "pathHistory");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pathHistory", "PathHistory");
	    throw ee;
	}
	// Encode field 'pathPrediction'
	try {
	    PathPrediction item1 = this.pathPrediction;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("pathPrediction");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "pathPrediction");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pathPrediction", "PathPrediction");
	    throw ee;
	}
	// Encode field 'lights'
	try {
	    ExteriorLights item1 = this.lights;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("lights");
		    coder.encodeBitString(temp1, len1, -1, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "lights");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lights", "ExteriorLights");
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
	    ee.appendFieldContext(null, "VehicleSafetyExtensions");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleSafetyExtensions decodeValue(JsonCoder coder, JsonReader source)
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
		    case __events:
		    // Decode field 'events'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.events == null)
				this.events = new VehicleEventFlags();
			    coder.decodeBitString(-1, source, this.events);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("events", "VehicleEventFlags");
			throw de;
		    }
		    break;
		    case __pathHistory:
		    // Decode field 'pathHistory'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pathHistory == null)
				this.pathHistory = new PathHistory();
			    this.pathHistory.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pathHistory", "PathHistory");
			throw de;
		    }
		    break;
		    case __pathPrediction:
		    // Decode field 'pathPrediction'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pathPrediction == null)
				this.pathPrediction = new PathPrediction();
			    this.pathPrediction.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pathPrediction", "PathPrediction");
			throw de;
		    }
		    break;
		    case __lights:
		    // Decode field 'lights'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.lights == null)
				this.lights = new ExteriorLights();
			    coder.decodeBitString(-1, source, this.lights);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lights", "ExteriorLights");
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
	    this.events = null;
	if (!present0[1])
	    this.pathHistory = null;
	if (!present0[2])
	    this.pathPrediction = null;
	if (!present0[3])
	    this.lights = null;
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
	    de.appendFieldContext(null, "VehicleSafetyExtensions");
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
	if (this.events != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("events ");
		printer.print(this.events, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pathHistory != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("pathHistory ");
		this.pathHistory.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pathPrediction != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("pathPrediction ");
		this.pathPrediction.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.lights != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("lights ");
		printer.print(this.lights, writer);
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
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "VehicleSafetyExtensions";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((VehicleSafetyExtensions)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleSafetyExtensions)that);
    }
    
    public boolean equalTo(VehicleSafetyExtensions that) {
	if (this.events != null) {
	    if (that.events == null || !this.events.equalTo(that.events))
		return false;
	} else if (that.events != null)
	    return false;
	if (this.pathHistory != null) {
	    if (that.pathHistory == null || !this.pathHistory.equalTo(that.pathHistory))
		return false;
	} else if (that.pathHistory != null)
	    return false;
	if (this.pathPrediction != null) {
	    if (that.pathPrediction == null || !this.pathPrediction.equalTo(that.pathPrediction))
		return false;
	} else if (that.pathPrediction != null)
	    return false;
	if (this.lights != null) {
	    if (that.lights == null || !this.lights.equalTo(that.lights))
		return false;
	} else if (that.lights != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleSafetyExtensions clone() {
	VehicleSafetyExtensions copy = (VehicleSafetyExtensions)super.clone();
	if (events != null) {
	    copy.events = events.clone();
	}
	if (pathHistory != null) {
	    copy.pathHistory = pathHistory.clone();
	}
	if (pathPrediction != null) {
	    copy.pathPrediction = pathPrediction.clone();
	}
	if (lights != null) {
	    copy.lights = lights.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.events != null ? this.events.hashCode() : 0);
	hash = 41 * hash + (this.pathHistory != null ? this.pathHistory.hashCode() : 0);
	hash = 41 * hash + (this.pathPrediction != null ? this.pathPrediction.hashCode() : 0);
	hash = 41 * hash + (this.lights != null ? this.lights.hashCode() : 0);
	return hash;
    }
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new VehicleSafetyExtensions();
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
    
} // End class definition for VehicleSafetyExtensions
