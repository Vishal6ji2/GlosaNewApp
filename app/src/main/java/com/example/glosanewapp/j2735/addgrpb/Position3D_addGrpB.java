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
 * Define the Position3D-addGrpB ASN.1 type included in the AddGrpB ASN.1 module.
 * @see Sequence
 */

public class Position3D_addGrpB extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public LatitudeDMS2 latitude;
    public LongitudeDMS2 longitude;
    public Elevation elevation;
    
    /**
     * The default constructor.
     */
    public Position3D_addGrpB()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Position3D_addGrpB(LatitudeDMS2 latitude, LongitudeDMS2 longitude, 
		    Elevation elevation)
    {
	setLatitude(latitude);
	setLongitude(longitude);
	setElevation(elevation);
    }
    
    
    // Methods for field "latitude"
    public LatitudeDMS2 getLatitude()
    {
	return this.latitude;
    }
    
    public void setLatitude(LatitudeDMS2 latitude)
    {
	this.latitude = latitude;
    }
    
    
    // Methods for field "longitude"
    public LongitudeDMS2 getLongitude()
    {
	return this.longitude;
    }
    
    public void setLongitude(LongitudeDMS2 longitude)
    {
	this.longitude = longitude;
    }
    
    
    // Methods for field "elevation"
    public Elevation getElevation()
    {
	return this.elevation;
    }
    
    public void setElevation(Elevation elevation)
    {
	this.elevation = elevation;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__latitude("latitude"),
	__longitude("longitude"),
	__elevation("elevation"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Position3D_addGrpB data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'latitude'
	try {
	    LatitudeDMS2 item1 = data.latitude;

	    nbits += LatitudeDMS2.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("latitude", "LatitudeDMS2");
	    throw ee;
	}
	// Encode field 'longitude'
	try {
	    LongitudeDMS2 item1 = data.longitude;

	    nbits += LongitudeDMS2.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("longitude", "LongitudeDMS2");
	    throw ee;
	}
	// Encode field 'elevation'
	try {
	    Elevation item1 = data.elevation;
	    long temp1 = item1.longValue();

	    if (temp1 < -32768 || temp1 > 32767)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -32768, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elevation", "Elevation");
	    throw ee;
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
	    ee.appendFieldContext(null, "Position3D-addGrpB");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Position3D_addGrpB decodeValue(PerCoder coder, InputBitStream source, Position3D_addGrpB data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'latitude'
	try {
	    if (data.latitude == null)
		data.latitude = new LatitudeDMS2();
	    data.latitude.decodeValue(coder, source, data.latitude);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("latitude", "LatitudeDMS2");
	    throw de;
	}
	// Decode field 'longitude'
	try {
	    if (data.longitude == null)
		data.longitude = new LongitudeDMS2();
	    data.longitude.decodeValue(coder, source, data.longitude);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("longitude", "LongitudeDMS2");
	    throw de;
	}
	// Decode field 'elevation'
	try {
	    long temp1;

	    if (data.elevation == null)
		data.elevation = new Elevation();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -32768, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.elevation.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("elevation", "Elevation");
	    throw de;
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
	    de.appendFieldContext(null, "Position3D-addGrpB");
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
	// Encode field 'latitude'
	try {
	    LatitudeDMS2 item1 = this.latitude;

	    {
		sink.encodeKey("latitude");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("latitude", "LatitudeDMS2");
	    throw ee;
	}
	// Encode field 'longitude'
	try {
	    LongitudeDMS2 item1 = this.longitude;

	    {
		sink.writeSeparator();
		sink.encodeKey("longitude");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("longitude", "LongitudeDMS2");
	    throw ee;
	}
	// Encode field 'elevation'
	try {
	    Elevation item1 = this.elevation;

	    {
		sink.writeSeparator();
		sink.encodeKey("elevation");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elevation", "Elevation");
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
	    ee.appendFieldContext(null, "Position3D-addGrpB");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Position3D_addGrpB decodeValue(JsonCoder coder, JsonReader source)
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
		    case __latitude:
		    // Decode field 'latitude'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.latitude == null)
			    this.latitude = new LatitudeDMS2();
			this.latitude.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("latitude", "LatitudeDMS2");
			throw de;
		    }
		    break;
		    case __longitude:
		    // Decode field 'longitude'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.longitude == null)
			    this.longitude = new LongitudeDMS2();
			this.longitude.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("longitude", "LongitudeDMS2");
			throw de;
		    }
		    break;
		    case __elevation:
		    // Decode field 'elevation'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.elevation == null)
			    this.elevation = new Elevation();
			this.elevation.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("elevation", "Elevation");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'latitude'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'longitude'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'elevation'");
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
	    de.appendFieldContext(null, "Position3D-addGrpB");
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
	    writer.print("latitude ");
	    this.latitude.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("longitude ");
	    this.longitude.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("elevation ");
	    writer.print(this.elevation.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
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
	return "Position3D-addGrpB";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((Position3D_addGrpB)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Position3D_addGrpB)that);
    }
    
    public boolean equalTo(Position3D_addGrpB that) {
	if (!this.latitude.equalTo(that.latitude))
	    return false;
	if (!this.longitude.equalTo(that.longitude))
	    return false;
	if (!this.elevation.equalTo(that.elevation))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Position3D_addGrpB clone() {
	Position3D_addGrpB copy = (Position3D_addGrpB)super.clone();
	copy.latitude = latitude.clone();
	copy.longitude = longitude.clone();
	copy.elevation = elevation.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.latitude != null ? this.latitude.hashCode() : 0);
	hash = 41 * hash + (this.longitude != null ? this.longitude.hashCode() : 0);
	hash = 41 * hash + (this.elevation != null ? this.elevation.hashCode() : 0);
	return hash;
    }
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new Position3D_addGrpB();
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
    
} // End class definition for Position3D_addGrpB
