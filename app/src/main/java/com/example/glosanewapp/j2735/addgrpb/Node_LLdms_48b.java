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


package com.example.glosanewapp.j2735.addgrpb;

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
 * Define the Node-LLdms-48b ASN.1 type included in the AddGrpB ASN.1 module.
 * @see Sequence
 */

public class Node_LLdms_48b extends Sequence {
    public LongitudeDMS lon;
    public LatitudeDMS lat;
    
    /**
     * The default constructor.
     */
    public Node_LLdms_48b()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node_LLdms_48b(LongitudeDMS lon, LatitudeDMS lat)
    {
	setLon(lon);
	setLat(lat);
    }
    
    
    // Methods for field "lon"
    public LongitudeDMS getLon()
    {
	return this.lon;
    }
    
    public void setLon(LongitudeDMS lon)
    {
	this.lon = lon;
    }
    
    
    // Methods for field "lat"
    public LatitudeDMS getLat()
    {
	return this.lat;
    }
    
    public void setLat(LatitudeDMS lat)
    {
	this.lat = lat;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__lon("lon"),
	__lat("lat"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Node_LLdms_48b data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'lon'
	try {
	    LongitudeDMS item1 = data.lon;
	    long temp1 = item1.longValue();

	    if (temp1 < -64800000 || temp1 > 64800000)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, -64800000, 64800000, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lon", "LongitudeDMS");
	    throw ee;
	}
	// Encode field 'lat'
	try {
	    LatitudeDMS item1 = data.lat;
	    long temp1 = item1.longValue();

	    if (temp1 < -32400000 || temp1 > 32400000)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -32400000, 32400000, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "LatitudeDMS");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Node_LLdms_48b decodeValue(PerCoder coder, InputBitStream source, Node_LLdms_48b data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'lon'
	try {
	    long temp1;

	    if (data.lon == null)
		data.lon = new LongitudeDMS();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -64800000, 64800000);
	    if (temp1 > 64800000)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.lon.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lon", "LongitudeDMS");
	    throw de;
	}
	// Decode field 'lat'
	try {
	    long temp1;

	    if (data.lat == null)
		data.lat = new LatitudeDMS();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -32400000, 32400000);
	    if (temp1 > 32400000)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.lat.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lat", "LatitudeDMS");
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
	// Encode field 'lon'
	try {
	    LongitudeDMS item1 = this.lon;

	    {
		sink.encodeKey("lon");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lon", "LongitudeDMS");
	    throw ee;
	}
	// Encode field 'lat'
	try {
	    LatitudeDMS item1 = this.lat;

	    {
		sink.writeSeparator();
		sink.encodeKey("lat");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "LatitudeDMS");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Node_LLdms_48b decodeValue(JsonCoder coder, JsonReader source)
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
		    case __lon:
		    // Decode field 'lon'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.lon == null)
			    this.lon = new LongitudeDMS();
			this.lon.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lon", "LongitudeDMS");
			throw de;
		    }
		    break;
		    case __lat:
		    // Decode field 'lat'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.lat == null)
			    this.lat = new LatitudeDMS();
			this.lat.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lat", "LatitudeDMS");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'lon'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'lat'");
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
	    writer.print("lon ");
	    writer.print(this.lon.longValue());
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
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((Node_LLdms_48b)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Node_LLdms_48b)that);
    }
    
    public boolean equalTo(Node_LLdms_48b that) {
	if (!this.lon.equalTo(that.lon))
	    return false;
	if (!this.lat.equalTo(that.lat))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Node_LLdms_48b clone() {
	Node_LLdms_48b copy = (Node_LLdms_48b)super.clone();
	copy.lon = lon.clone();
	copy.lat = lat.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.lon != null ? this.lon.hashCode() : 0);
	hash = 41 * hash + (this.lat != null ? this.lat.hashCode() : 0);
	return hash;
    }
} // End class definition for Node_LLdms_48b
