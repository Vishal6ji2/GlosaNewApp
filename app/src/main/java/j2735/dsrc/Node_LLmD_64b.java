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


package j2735.dsrc;

import com.oss.asn1.*;
import com.oss.metadata.*;
import java.io.IOException;
import com.oss.coders.EncoderException;
import com.oss.coders.DecoderException;
import com.oss.util.ExceptionDescriptor;
import com.oss.asn1printer.DataPrinter;
import com.oss.asn1printer.DataPrinterException;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the Node-LLmD-64b ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class Node_LLmD_64b extends Sequence {
    public Longitude lon;
    public Latitude lat;
    
    /**
     * The default constructor.
     */
    public Node_LLmD_64b()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node_LLmD_64b(Longitude lon, Latitude lat)
    {
	setLon(lon);
	setLat(lat);
    }
    
    
    // Methods for field "lon"
    public Longitude getLon()
    {
	return this.lon;
    }
    
    public void setLon(Longitude lon)
    {
	this.lon = lon;
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Node_LLmD_64b data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'lon'
	try {
	    Longitude item1 = data.lon;
	    long temp1 = item1.longValue();

	    if (temp1 < -1799999999 || temp1 > 1800000001)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, -1799999999, 1800000001, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lon", "Longitude");
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

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Node_LLmD_64b decodeValue(PerCoder coder, InputBitStream source, Node_LLmD_64b data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'lon'
	try {
	    long temp1;

	    if (data.lon == null)
		data.lon = new Longitude();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -1799999999, 1800000001);
	    if (temp1 > 1800000001)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.lon.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lon", "Longitude");
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
	    Longitude item1 = this.lon;

	    {
		sink.encodeKey("lon");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lon", "Longitude");
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
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Node_LLmD_64b decodeValue(JsonCoder coder, JsonReader source)
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
			    this.lon = new Longitude();
			this.lon.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lon", "Longitude");
			throw de;
		    }
		    break;
		    case __lat:
		    // Decode field 'lat'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.lat == null)
			    this.lat = new Latitude();
			this.lat.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lat", "Latitude");
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
	return equalTo((Node_LLmD_64b)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Node_LLmD_64b)that);
    }
    
    public boolean equalTo(Node_LLmD_64b that) {
	if (!this.lon.equalTo(that.lon))
	    return false;
	if (!this.lat.equalTo(that.lat))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Node_LLmD_64b clone() {
	Node_LLmD_64b copy = (Node_LLmD_64b)super.clone();
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
} // End class definition for Node_LLmD_64b
