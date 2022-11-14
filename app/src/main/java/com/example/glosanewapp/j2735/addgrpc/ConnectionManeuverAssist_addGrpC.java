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


package com.example.glosanewapp.j2735.addgrpc;

import com.example.glosanewapp.j2735.dsrc.NodeOffsetPointXY;
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
 * Define the ConnectionManeuverAssist-addGrpC ASN.1 type included in the AddGrpC ASN.1 module.
 * @see Sequence
 */

public class ConnectionManeuverAssist_addGrpC extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public VehicleToLanePositionList vehicleToLanePositions;
    public NodeOffsetPointXY rsuDistanceFromAnchor;
    
    /**
     * The default constructor.
     */
    public ConnectionManeuverAssist_addGrpC()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConnectionManeuverAssist_addGrpC(VehicleToLanePositionList vehicleToLanePositions, 
		    NodeOffsetPointXY rsuDistanceFromAnchor)
    {
	setVehicleToLanePositions(vehicleToLanePositions);
	setRsuDistanceFromAnchor(rsuDistanceFromAnchor);
    }
    
    /**
     * Construct with required components.
     */
    public ConnectionManeuverAssist_addGrpC(VehicleToLanePositionList vehicleToLanePositions)
    {
	setVehicleToLanePositions(vehicleToLanePositions);
    }
    
    
    // Methods for field "vehicleToLanePositions"
    public VehicleToLanePositionList getVehicleToLanePositions()
    {
	return this.vehicleToLanePositions;
    }
    
    public void setVehicleToLanePositions(VehicleToLanePositionList vehicleToLanePositions)
    {
	this.vehicleToLanePositions = vehicleToLanePositions;
    }
    
    
    // Methods for field "rsuDistanceFromAnchor"
    public NodeOffsetPointXY getRsuDistanceFromAnchor()
    {
	return this.rsuDistanceFromAnchor;
    }
    
    public void setRsuDistanceFromAnchor(NodeOffsetPointXY rsuDistanceFromAnchor)
    {
	this.rsuDistanceFromAnchor = rsuDistanceFromAnchor;
    }
    
    public boolean hasRsuDistanceFromAnchor()
    {
	return (rsuDistanceFromAnchor != null);
    }
    
    public void deleteRsuDistanceFromAnchor()
    {
	rsuDistanceFromAnchor = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__vehicleToLanePositions("vehicleToLanePositions"),
	__rsuDistanceFromAnchor("rsuDistanceFromAnchor"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(3);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ConnectionManeuverAssist_addGrpC data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.rsuDistanceFromAnchor != null);
	++nbits;
	// Encode field 'vehicleToLanePositions'
	try {
	    VehicleToLanePositionList item1 = data.vehicleToLanePositions;

	    nbits += VehicleToLanePositionList.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleToLanePositions", "VehicleToLanePositionList");
	    throw ee;
	}
	if (data.rsuDistanceFromAnchor != null) {
	    // Encode field 'rsuDistanceFromAnchor'
	    try {
		NodeOffsetPointXY item1 = data.rsuDistanceFromAnchor;

		nbits += NodeOffsetPointXY.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rsuDistanceFromAnchor", "NodeOffsetPointXY");
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
	    ee.appendFieldContext(null, "ConnectionManeuverAssist-addGrpC");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static ConnectionManeuverAssist_addGrpC decodeValue(PerCoder coder, InputBitStream source, ConnectionManeuverAssist_addGrpC data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_rsuDistanceFromAnchor0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'vehicleToLanePositions'
	try {
	    if (data.vehicleToLanePositions == null)
		data.vehicleToLanePositions = new VehicleToLanePositionList();
	    data.vehicleToLanePositions.decodeValue(coder, source, data.vehicleToLanePositions);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("vehicleToLanePositions", "VehicleToLanePositionList");
	    throw de;
	}
	if (has_rsuDistanceFromAnchor0) {
	    // Decode field 'rsuDistanceFromAnchor'
	    try {
		if (data.rsuDistanceFromAnchor == null)
		    data.rsuDistanceFromAnchor = new NodeOffsetPointXY();
		data.rsuDistanceFromAnchor.decodeValue(coder, source, data.rsuDistanceFromAnchor);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rsuDistanceFromAnchor", "NodeOffsetPointXY");
		throw de;
	    }
	} else {
	    data.rsuDistanceFromAnchor = null;
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
	    de.appendFieldContext(null, "ConnectionManeuverAssist-addGrpC");
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
	// Encode field 'vehicleToLanePositions'
	try {
	    VehicleToLanePositionList item1 = this.vehicleToLanePositions;

	    {
		sink.encodeKey("vehicleToLanePositions");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleToLanePositions", "VehicleToLanePositionList");
	    throw ee;
	}
	// Encode field 'rsuDistanceFromAnchor'
	try {
	    NodeOffsetPointXY item1 = this.rsuDistanceFromAnchor;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("rsuDistanceFromAnchor");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "rsuDistanceFromAnchor");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rsuDistanceFromAnchor", "NodeOffsetPointXY");
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
	    ee.appendFieldContext(null, "ConnectionManeuverAssist-addGrpC");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ConnectionManeuverAssist_addGrpC decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[3];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __vehicleToLanePositions:
		    // Decode field 'vehicleToLanePositions'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.vehicleToLanePositions == null)
			    this.vehicleToLanePositions = new VehicleToLanePositionList();
			this.vehicleToLanePositions.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleToLanePositions", "VehicleToLanePositionList");
			throw de;
		    }
		    break;
		    case __rsuDistanceFromAnchor:
		    // Decode field 'rsuDistanceFromAnchor'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rsuDistanceFromAnchor == null)
				this.rsuDistanceFromAnchor = new NodeOffsetPointXY();
			    this.rsuDistanceFromAnchor.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rsuDistanceFromAnchor", "NodeOffsetPointXY");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'vehicleToLanePositions'");
	if (!present0[1])
	    this.rsuDistanceFromAnchor = null;
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
	    de.appendFieldContext(null, "ConnectionManeuverAssist-addGrpC");
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
	    writer.print("vehicleToLanePositions ");
	    this.vehicleToLanePositions.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.rsuDistanceFromAnchor != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("rsuDistanceFromAnchor ");
		this.rsuDistanceFromAnchor.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
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
	return "ConnectionManeuverAssist-addGrpC";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((ConnectionManeuverAssist_addGrpC)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ConnectionManeuverAssist_addGrpC)that);
    }
    
    public boolean equalTo(ConnectionManeuverAssist_addGrpC that) {
	if (!this.vehicleToLanePositions.equalTo(that.vehicleToLanePositions))
	    return false;
	if (this.rsuDistanceFromAnchor != null) {
	    if (that.rsuDistanceFromAnchor == null || !this.rsuDistanceFromAnchor.equalTo(that.rsuDistanceFromAnchor))
		return false;
	} else if (that.rsuDistanceFromAnchor != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ConnectionManeuverAssist_addGrpC clone() {
	ConnectionManeuverAssist_addGrpC copy = (ConnectionManeuverAssist_addGrpC)super.clone();
	copy.vehicleToLanePositions = vehicleToLanePositions.clone();
	if (rsuDistanceFromAnchor != null) {
	    copy.rsuDistanceFromAnchor = rsuDistanceFromAnchor.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.vehicleToLanePositions != null ? this.vehicleToLanePositions.hashCode() : 0);
	hash = 41 * hash + (this.rsuDistanceFromAnchor != null ? this.rsuDistanceFromAnchor.hashCode() : 0);
	return hash;
    }
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new ConnectionManeuverAssist_addGrpC();
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
    
} // End class definition for ConnectionManeuverAssist_addGrpC
