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
 * Define the AccelerationSet4Way ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class AccelerationSet4Way extends Sequence {
    public Acceleration _long;
    public Acceleration lat;
    public VerticalAcceleration vert;
    public YawRate yaw;
    
    /**
     * The default constructor.
     */
    public AccelerationSet4Way()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AccelerationSet4Way(Acceleration _long, Acceleration lat, 
		    VerticalAcceleration vert, YawRate yaw)
    {
	set_long(_long);
	setLat(lat);
	setVert(vert);
	setYaw(yaw);
    }
    
    
    // Methods for field "_long"
    public Acceleration get_long()
    {
	return this._long;
    }
    
    public void set_long(Acceleration _long)
    {
	this._long = _long;
    }
    
    
    // Methods for field "lat"
    public Acceleration getLat()
    {
	return this.lat;
    }
    
    public void setLat(Acceleration lat)
    {
	this.lat = lat;
    }
    
    
    // Methods for field "vert"
    public VerticalAcceleration getVert()
    {
	return this.vert;
    }
    
    public void setVert(VerticalAcceleration vert)
    {
	this.vert = vert;
    }
    
    
    // Methods for field "yaw"
    public YawRate getYaw()
    {
	return this.yaw;
    }
    
    public void setYaw(YawRate yaw)
    {
	this.yaw = yaw;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	___long("long"),
	__lat("lat"),
	__vert("vert"),
	__yaw("yaw"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AccelerationSet4Way data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'long'
	try {
	    Acceleration item1 = data._long;
	    long temp1 = item1.longValue();

	    if (temp1 < -2000 || temp1 > 2001)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, -2000, 2001, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Acceleration");
	    throw ee;
	}
	// Encode field 'lat'
	try {
	    Acceleration item1 = data.lat;
	    long temp1 = item1.longValue();

	    if (temp1 < -2000 || temp1 > 2001)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -2000, 2001, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Acceleration");
	    throw ee;
	}
	// Encode field 'vert'
	try {
	    VerticalAcceleration item1 = data.vert;
	    long temp1 = item1.longValue();

	    if (temp1 < -127 || temp1 > 127)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -127, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vert", "VerticalAcceleration");
	    throw ee;
	}
	// Encode field 'yaw'
	try {
	    YawRate item1 = data.yaw;
	    long temp1 = item1.longValue();

	    if (temp1 < -32767 || temp1 > 32767)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yaw", "YawRate");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static AccelerationSet4Way decodeValue(PerCoder coder, InputBitStream source, AccelerationSet4Way data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'long'
	try {
	    long temp1;

	    if (data._long == null)
		data._long = new Acceleration();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -2000, 2001);
	    if (temp1 > 2001)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data._long.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("long", "Acceleration");
	    throw de;
	}
	// Decode field 'lat'
	try {
	    long temp1;

	    if (data.lat == null)
		data.lat = new Acceleration();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -2000, 2001);
	    if (temp1 > 2001)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.lat.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lat", "Acceleration");
	    throw de;
	}
	// Decode field 'vert'
	try {
	    long temp1;

	    if (data.vert == null)
		data.vert = new VerticalAcceleration();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -127, 127);
	    if (temp1 > 127)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.vert.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("vert", "VerticalAcceleration");
	    throw de;
	}
	// Decode field 'yaw'
	try {
	    long temp1;

	    if (data.yaw == null)
		data.yaw = new YawRate();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.yaw.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("yaw", "YawRate");
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
	// Encode field 'long'
	try {
	    Acceleration item1 = this._long;

	    {
		sink.encodeKey("long");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("long", "Acceleration");
	    throw ee;
	}
	// Encode field 'lat'
	try {
	    Acceleration item1 = this.lat;

	    {
		sink.writeSeparator();
		sink.encodeKey("lat");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lat", "Acceleration");
	    throw ee;
	}
	// Encode field 'vert'
	try {
	    VerticalAcceleration item1 = this.vert;

	    {
		sink.writeSeparator();
		sink.encodeKey("vert");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vert", "VerticalAcceleration");
	    throw ee;
	}
	// Encode field 'yaw'
	try {
	    YawRate item1 = this.yaw;

	    {
		sink.writeSeparator();
		sink.encodeKey("yaw");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yaw", "YawRate");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AccelerationSet4Way decodeValue(JsonCoder coder, JsonReader source)
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
		    case ___long:
		    // Decode field 'long'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this._long == null)
			    this._long = new Acceleration();
			this._long.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("long", "Acceleration");
			throw de;
		    }
		    break;
		    case __lat:
		    // Decode field 'lat'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.lat == null)
			    this.lat = new Acceleration();
			this.lat.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lat", "Acceleration");
			throw de;
		    }
		    break;
		    case __vert:
		    // Decode field 'vert'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.vert == null)
			    this.vert = new VerticalAcceleration();
			this.vert.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vert", "VerticalAcceleration");
			throw de;
		    }
		    break;
		    case __yaw:
		    // Decode field 'yaw'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.yaw == null)
			    this.yaw = new YawRate();
			this.yaw.setValue(coder.decodeInteger(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("yaw", "YawRate");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'long'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'lat'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'vert'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'yaw'");
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
	    writer.print("long ");
	    writer.print(this._long.longValue());
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
	    writer.print("vert ");
	    writer.print(this.vert.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("yaw ");
	    writer.print(this.yaw.longValue());
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
	return equalTo((AccelerationSet4Way)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AccelerationSet4Way)that);
    }
    
    public boolean equalTo(AccelerationSet4Way that) {
	if (!this._long.equalTo(that._long))
	    return false;
	if (!this.lat.equalTo(that.lat))
	    return false;
	if (!this.vert.equalTo(that.vert))
	    return false;
	if (!this.yaw.equalTo(that.yaw))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AccelerationSet4Way clone() {
	AccelerationSet4Way copy = (AccelerationSet4Way)super.clone();
	copy._long = _long.clone();
	copy.lat = lat.clone();
	copy.vert = vert.clone();
	copy.yaw = yaw.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this._long != null ? this._long.hashCode() : 0);
	hash = 41 * hash + (this.lat != null ? this.lat.hashCode() : 0);
	hash = 41 * hash + (this.vert != null ? this.vert.hashCode() : 0);
	hash = 41 * hash + (this.yaw != null ? this.yaw.hashCode() : 0);
	return hash;
    }
} // End class definition for AccelerationSet4Way
