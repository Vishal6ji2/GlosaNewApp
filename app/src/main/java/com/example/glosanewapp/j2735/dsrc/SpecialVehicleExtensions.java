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
 * Define the SpecialVehicleExtensions ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class SpecialVehicleExtensions extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public EmergencyDetails vehicleAlerts;
    public EventDescription description;
    public TrailerData trailers;
    
    /**
     * The default constructor.
     */
    public SpecialVehicleExtensions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SpecialVehicleExtensions(EmergencyDetails vehicleAlerts, 
		    EventDescription description, TrailerData trailers)
    {
	setVehicleAlerts(vehicleAlerts);
	setDescription(description);
	setTrailers(trailers);
    }
    
    
    // Methods for field "vehicleAlerts"
    public EmergencyDetails getVehicleAlerts()
    {
	return this.vehicleAlerts;
    }
    
    public void setVehicleAlerts(EmergencyDetails vehicleAlerts)
    {
	this.vehicleAlerts = vehicleAlerts;
    }
    
    public boolean hasVehicleAlerts()
    {
	return (vehicleAlerts != null);
    }
    
    public void deleteVehicleAlerts()
    {
	vehicleAlerts = null;
    }
    
    
    // Methods for field "description"
    public EventDescription getDescription()
    {
	return this.description;
    }
    
    public void setDescription(EventDescription description)
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
    
    
    // Methods for field "trailers"
    public TrailerData getTrailers()
    {
	return this.trailers;
    }
    
    public void setTrailers(TrailerData trailers)
    {
	this.trailers = trailers;
    }
    
    public boolean hasTrailers()
    {
	return (trailers != null);
    }
    
    public void deleteTrailers()
    {
	trailers = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__vehicleAlerts("vehicleAlerts"),
	__description("description"),
	__trailers("trailers"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SpecialVehicleExtensions data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.vehicleAlerts != null);
	sink.writeBit(data.description != null);
	sink.writeBit(data.trailers != null);
	nbits += 4;
	if (data.vehicleAlerts != null) {
	    // Encode field 'vehicleAlerts'
	    try {
		EmergencyDetails item1 = data.vehicleAlerts;

		nbits += EmergencyDetails.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleAlerts", "EmergencyDetails");
		throw ee;
	    }
	}
	if (data.description != null) {
	    // Encode field 'description'
	    try {
		EventDescription item1 = data.description;

		nbits += EventDescription.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("description", "EventDescription");
		throw ee;
	    }
	}
	if (data.trailers != null) {
	    // Encode field 'trailers'
	    try {
		TrailerData item1 = data.trailers;

		nbits += TrailerData.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trailers", "TrailerData");
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
	    ee.appendFieldContext(null, "SpecialVehicleExtensions");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SpecialVehicleExtensions decodeValue(PerCoder coder, InputBitStream source, SpecialVehicleExtensions data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_vehicleAlerts0 = source.readBit();
	boolean has_description0 = source.readBit();
	boolean has_trailers0 = source.readBit();
    /** Decode root fields **/
	if (has_vehicleAlerts0) {
	    // Decode field 'vehicleAlerts'
	    try {
		if (data.vehicleAlerts == null)
		    data.vehicleAlerts = new EmergencyDetails();
		data.vehicleAlerts.decodeValue(coder, source, data.vehicleAlerts);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleAlerts", "EmergencyDetails");
		throw de;
	    }
	} else {
	    data.vehicleAlerts = null;
	}
	if (has_description0) {
	    // Decode field 'description'
	    try {
		if (data.description == null)
		    data.description = new EventDescription();
		data.description.decodeValue(coder, source, data.description);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("description", "EventDescription");
		throw de;
	    }
	} else {
	    data.description = null;
	}
	if (has_trailers0) {
	    // Decode field 'trailers'
	    try {
		if (data.trailers == null)
		    data.trailers = new TrailerData();
		data.trailers.decodeValue(coder, source, data.trailers);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("trailers", "TrailerData");
		throw de;
	    }
	} else {
	    data.trailers = null;
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
	    de.appendFieldContext(null, "SpecialVehicleExtensions");
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
	// Encode field 'vehicleAlerts'
	try {
	    EmergencyDetails item1 = this.vehicleAlerts;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("vehicleAlerts");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "vehicleAlerts");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleAlerts", "EmergencyDetails");
	    throw ee;
	}
	// Encode field 'description'
	try {
	    EventDescription item1 = this.description;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("description");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "description");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("description", "EventDescription");
	    throw ee;
	}
	// Encode field 'trailers'
	try {
	    TrailerData item1 = this.trailers;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("trailers");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "trailers");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("trailers", "TrailerData");
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
	    ee.appendFieldContext(null, "SpecialVehicleExtensions");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SpecialVehicleExtensions decodeValue(JsonCoder coder, JsonReader source)
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
		    case __vehicleAlerts:
		    // Decode field 'vehicleAlerts'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.vehicleAlerts == null)
				this.vehicleAlerts = new EmergencyDetails();
			    this.vehicleAlerts.decodeValue(coder, source);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleAlerts", "EmergencyDetails");
			throw de;
		    }
		    break;
		    case __description:
		    // Decode field 'description'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.description == null)
				this.description = new EventDescription();
			    this.description.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("description", "EventDescription");
			throw de;
		    }
		    break;
		    case __trailers:
		    // Decode field 'trailers'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.trailers == null)
				this.trailers = new TrailerData();
			    this.trailers.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("trailers", "TrailerData");
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
	    this.vehicleAlerts = null;
	if (!present0[1])
	    this.description = null;
	if (!present0[2])
	    this.trailers = null;
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
	    de.appendFieldContext(null, "SpecialVehicleExtensions");
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
	if (this.vehicleAlerts != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehicleAlerts ");
		this.vehicleAlerts.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.description != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("description ");
		this.description.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.trailers != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("trailers ");
		this.trailers.printValue(printer, writer);
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
	return "SpecialVehicleExtensions";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((SpecialVehicleExtensions)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SpecialVehicleExtensions)that);
    }
    
    public boolean equalTo(SpecialVehicleExtensions that) {
	if (this.vehicleAlerts != null) {
	    if (that.vehicleAlerts == null || !this.vehicleAlerts.equalTo(that.vehicleAlerts))
		return false;
	} else if (that.vehicleAlerts != null)
	    return false;
	if (this.description != null) {
	    if (that.description == null || !this.description.equalTo(that.description))
		return false;
	} else if (that.description != null)
	    return false;
	if (this.trailers != null) {
	    if (that.trailers == null || !this.trailers.equalTo(that.trailers))
		return false;
	} else if (that.trailers != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SpecialVehicleExtensions clone() {
	SpecialVehicleExtensions copy = (SpecialVehicleExtensions)super.clone();
	if (vehicleAlerts != null) {
	    copy.vehicleAlerts = vehicleAlerts.clone();
	}
	if (description != null) {
	    copy.description = description.clone();
	}
	if (trailers != null) {
	    copy.trailers = trailers.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.vehicleAlerts != null ? this.vehicleAlerts.hashCode() : 0);
	hash = 41 * hash + (this.description != null ? this.description.hashCode() : 0);
	hash = 41 * hash + (this.trailers != null ? this.trailers.hashCode() : 0);
	return hash;
    }
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new SpecialVehicleExtensions();
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
    
} // End class definition for SpecialVehicleExtensions
