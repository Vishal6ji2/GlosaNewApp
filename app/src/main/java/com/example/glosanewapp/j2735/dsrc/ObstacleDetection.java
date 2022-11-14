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

import com.example.glosanewapp.j2735.itis.GenericLocations;
import com.example.glosanewapp.j2735.itis.ITIScodes;
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
 * Define the ObstacleDetection ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class ObstacleDetection extends Sequence {
    public ObstacleDistance obDist;
    public ObstacleDirection obDirect;
    public ITIScodes description;
    public GenericLocations locationDetails;
    public DDateTime dateTime;
    public VerticalAccelerationThreshold vertEvent;
    
    /**
     * The default constructor.
     */
    public ObstacleDetection()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ObstacleDetection(ObstacleDistance obDist, 
		    ObstacleDirection obDirect, 
		    ITIScodes description, 
		    GenericLocations locationDetails, 
		    DDateTime dateTime, 
		    VerticalAccelerationThreshold vertEvent)
    {
	setObDist(obDist);
	setObDirect(obDirect);
	setDescription(description);
	setLocationDetails(locationDetails);
	setDateTime(dateTime);
	setVertEvent(vertEvent);
    }
    
    /**
     * Construct with required components.
     */
    public ObstacleDetection(ObstacleDistance obDist, 
		    ObstacleDirection obDirect, DDateTime dateTime)
    {
	setObDist(obDist);
	setObDirect(obDirect);
	setDateTime(dateTime);
    }
    
    
    // Methods for field "obDist"
    public ObstacleDistance getObDist()
    {
	return this.obDist;
    }
    
    public void setObDist(ObstacleDistance obDist)
    {
	this.obDist = obDist;
    }
    
    
    // Methods for field "obDirect"
    public ObstacleDirection getObDirect()
    {
	return this.obDirect;
    }
    
    public void setObDirect(ObstacleDirection obDirect)
    {
	this.obDirect = obDirect;
    }
    
    
    // Methods for field "description"
    public ITIScodes getDescription()
    {
	return this.description;
    }
    
    public void setDescription(ITIScodes description)
    {
	this.description = description;
    }
    
    public boolean hasDescription()
    {
	return (description != null);
    }
    
    public void deleteDescription()
    {
	description = null;
    }
    
    
    // Methods for field "locationDetails"
    public GenericLocations getLocationDetails()
    {
	return this.locationDetails;
    }
    
    public void setLocationDetails(GenericLocations locationDetails)
    {
	this.locationDetails = locationDetails;
    }
    
    public boolean hasLocationDetails()
    {
	return (locationDetails != null);
    }
    
    public void deleteLocationDetails()
    {
	locationDetails = null;
    }
    
    
    // Methods for field "dateTime"
    public DDateTime getDateTime()
    {
	return this.dateTime;
    }
    
    public void setDateTime(DDateTime dateTime)
    {
	this.dateTime = dateTime;
    }
    
    
    // Methods for field "vertEvent"
    public VerticalAccelerationThreshold getVertEvent()
    {
	return this.vertEvent;
    }
    
    public void setVertEvent(VerticalAccelerationThreshold vertEvent)
    {
	this.vertEvent = vertEvent;
    }
    
    public boolean hasVertEvent()
    {
	return (vertEvent != null);
    }
    
    public void deleteVertEvent()
    {
	vertEvent = null;
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_vertEvent = 
	VerticalAccelerationThreshold._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__obDist("obDist"),
	__obDirect("obDirect"),
	__description("description"),
	__locationDetails("locationDetails"),
	__dateTime("dateTime"),
	__vertEvent("vertEvent"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ObstacleDetection data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.description != null);
	sink.writeBit(data.locationDetails != null);
	sink.writeBit(data.vertEvent != null);
	nbits += 4;
	// Encode field 'obDist'
	try {
	    ObstacleDistance item1 = data.obDist;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 32767)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("obDist", "ObstacleDistance");
	    throw ee;
	}
	// Encode field 'obDirect'
	try {
	    ObstacleDirection item1 = data.obDirect;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 28800)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("obDirect", "ObstacleDirection");
	    throw ee;
	}
	if (data.description != null) {
	    // Encode field 'description'
	    try {
		ITIScodes item1 = data.description;
		long temp1 = item1.longValue();

		if (temp1 < 523 || temp1 > 541)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 523, 541, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("description", "ITIScodes");
		throw ee;
	    }
	}
	if (data.locationDetails != null) {
	    // Encode field 'locationDetails'
	    try {
		GenericLocations item1 = data.locationDetails;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 96;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 95, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 96, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("locationDetails", "GenericLocations");
		throw ee;
	    }
	}
	// Encode field 'dateTime'
	try {
	    DDateTime item1 = data.dateTime;

	    nbits += DDateTime.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dateTime", "DDateTime");
	    throw ee;
	}
	if (data.vertEvent != null) {
	    // Encode field 'vertEvent'
	    try {
		VerticalAccelerationThreshold item1 = data.vertEvent;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, ObstacleDetection._cBounds_vertEvent);
		if (total_len1 != 5)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 5, 5, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vertEvent", "VerticalAccelerationThreshold");
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
    public static ObstacleDetection decodeValue(PerCoder coder, InputBitStream source, ObstacleDetection data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_description0 = source.readBit();
	boolean has_locationDetails0 = source.readBit();
	boolean has_vertEvent0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'obDist'
	try {
	    long temp1;

	    if (data.obDist == null)
		data.obDist = new ObstacleDistance();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.obDist.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("obDist", "ObstacleDistance");
	    throw de;
	}
	// Decode field 'obDirect'
	try {
	    long temp1;

	    if (data.obDirect == null)
		data.obDirect = new ObstacleDirection();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
	    if (temp1 > 28800)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.obDirect.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("obDirect", "ObstacleDirection");
	    throw de;
	}
	if (has_description0) {
	    // Decode field 'description'
	    try {
		long temp1;

		if (data.description == null)
		    data.description = new ITIScodes();
		temp1 = coder.decodeConstrainedWholeNumber(source, 523, 541);
		if (temp1 > 541)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.description.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("description", "ITIScodes");
		throw de;
	    }
	} else {
	    data.description = null;
	}
	if (has_locationDetails0) {
	    // Decode field 'locationDetails'
	    try {
		int idx1;
		GenericLocations temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 95);
		    if (idx1 < 0 || idx1 > 95)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = GenericLocations.valueAt(idx1);
		} else {
		    idx1 = 96 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = GenericLocations.unknownEnumerator();
		}
		data.locationDetails = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("locationDetails", "GenericLocations");
		throw de;
	    }
	} else {
	    data.locationDetails = null;
	}
	// Decode field 'dateTime'
	try {
	    if (data.dateTime == null)
		data.dateTime = new DDateTime();
	    data.dateTime.decodeValue(coder, source, data.dateTime);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("dateTime", "DDateTime");
	    throw de;
	}
	if (has_vertEvent0) {
	    // Decode field 'vertEvent'
	    try {
		if (data.vertEvent == null)
		    data.vertEvent = new VerticalAccelerationThreshold();
		com.oss.coders.per.PerBitstring.decode(coder, source, 5, 5, data.vertEvent);
		if (coder.isStrictCodingEnabled() && data.vertEvent.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.vertEvent, ObstacleDetection._cBounds_vertEvent))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vertEvent", "VerticalAccelerationThreshold");
		throw de;
	    }
	} else {
	    data.vertEvent = null;
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
	// Encode field 'obDist'
	try {
	    ObstacleDistance item1 = this.obDist;

	    {
		sink.encodeKey("obDist");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("obDist", "ObstacleDistance");
	    throw ee;
	}
	// Encode field 'obDirect'
	try {
	    ObstacleDirection item1 = this.obDirect;

	    {
		sink.writeSeparator();
		sink.encodeKey("obDirect");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("obDirect", "ObstacleDirection");
	    throw ee;
	}
	// Encode field 'description'
	try {
	    ITIScodes item1 = this.description;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("description");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "description");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("description", "ITIScodes");
	    throw ee;
	}
	// Encode field 'locationDetails'
	try {
	    GenericLocations item1 = this.locationDetails;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("locationDetails");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "locationDetails");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("locationDetails", "GenericLocations");
	    throw ee;
	}
	// Encode field 'dateTime'
	try {
	    DDateTime item1 = this.dateTime;

	    {
		sink.writeSeparator();
		sink.encodeKey("dateTime");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dateTime", "DDateTime");
	    throw ee;
	}
	// Encode field 'vertEvent'
	try {
	    VerticalAccelerationThreshold item1 = this.vertEvent;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("vertEvent");
		    coder.encodeBitStringWithNamedBits(temp1, len1, 5, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "vertEvent");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vertEvent", "VerticalAccelerationThreshold");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ObstacleDetection decodeValue(JsonCoder coder, JsonReader source)
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
		    case __obDist:
		    // Decode field 'obDist'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.obDist == null)
			    this.obDist = new ObstacleDistance();
			this.obDist.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("obDist", "ObstacleDistance");
			throw de;
		    }
		    break;
		    case __obDirect:
		    // Decode field 'obDirect'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.obDirect == null)
			    this.obDirect = new ObstacleDirection();
			this.obDirect.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("obDirect", "ObstacleDirection");
			throw de;
		    }
		    break;
		    case __description:
		    // Decode field 'description'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.description == null)
				this.description = new ITIScodes();
			    this.description.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("description", "ITIScodes");
			throw de;
		    }
		    break;
		    case __locationDetails:
		    // Decode field 'locationDetails'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    GenericLocations temp1;

			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(GenericLocations.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = GenericLocations.unknownEnumerator();
			    else
				temp1 = GenericLocations.cNamedNumbers[idx1];
			    this.locationDetails = temp1;
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("locationDetails", "GenericLocations");
			throw de;
		    }
		    break;
		    case __dateTime:
		    // Decode field 'dateTime'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.dateTime == null)
			    this.dateTime = new DDateTime();
			this.dateTime.decodeValue(coder, source);
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dateTime", "DDateTime");
			throw de;
		    }
		    break;
		    case __vertEvent:
		    // Decode field 'vertEvent'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.vertEvent == null)
				this.vertEvent = new VerticalAccelerationThreshold();
			    coder.decodeBitString(5, source, this.vertEvent);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vertEvent", "VerticalAccelerationThreshold");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'obDist'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'obDirect'");
	if (!present0[2])
	    this.description = null;
	if (!present0[3])
	    this.locationDetails = null;
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'dateTime'");
	if (!present0[5])
	    this.vertEvent = null;
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
	    writer.print("obDist ");
	    writer.print(this.obDist.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("obDirect ");
	    writer.print(this.obDirect.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.description != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("description ");
		writer.print(this.description.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.locationDetails != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("locationDetails ");
		printer.print(this.locationDetails, writer, this.locationDetails.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("dateTime ");
	    this.dateTime.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.vertEvent != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("vertEvent ");
		printer.print(this.vertEvent, writer);
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
	return equalTo((ObstacleDetection)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ObstacleDetection)that);
    }
    
    public boolean equalTo(ObstacleDetection that) {
	if (!this.obDist.equalTo(that.obDist))
	    return false;
	if (!this.obDirect.equalTo(that.obDirect))
	    return false;
	if (this.description != null) {
	    if (that.description == null || !this.description.equalTo(that.description))
		return false;
	} else if (that.description != null)
	    return false;
	if (this.locationDetails != null) {
	    if (that.locationDetails == null || !this.locationDetails.equalTo(that.locationDetails))
		return false;
	} else if (that.locationDetails != null)
	    return false;
	if (!this.dateTime.equalTo(that.dateTime))
	    return false;
	if (this.vertEvent != null) {
	    if (that.vertEvent == null || !this.vertEvent.equalTo(that.vertEvent))
		return false;
	} else if (that.vertEvent != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ObstacleDetection clone() {
	ObstacleDetection copy = (ObstacleDetection)super.clone();
	copy.obDist = obDist.clone();
	copy.obDirect = obDirect.clone();
	if (description != null) {
	    copy.description = description.clone();
	}
	if (locationDetails != null) {
	    copy.locationDetails = locationDetails.clone();
	}
	copy.dateTime = dateTime.clone();
	if (vertEvent != null) {
	    copy.vertEvent = vertEvent.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.obDist != null ? this.obDist.hashCode() : 0);
	hash = 41 * hash + (this.obDirect != null ? this.obDirect.hashCode() : 0);
	hash = 41 * hash + (this.description != null ? this.description.hashCode() : 0);
	hash = 41 * hash + (this.locationDetails != null ? this.locationDetails.hashCode() : 0);
	hash = 41 * hash + (this.dateTime != null ? this.dateTime.hashCode() : 0);
	hash = 41 * hash + (this.vertEvent != null ? this.vertEvent.hashCode() : 0);
	return hash;
    }
} // End class definition for ObstacleDetection
