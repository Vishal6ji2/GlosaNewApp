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
 * Define the Circle ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class Circle extends Sequence {
    public Position3D center;
    public Radius_B12 radius;
    public DistanceUnits units;
    
    /**
     * The default constructor.
     */
    public Circle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Circle(Position3D center, Radius_B12 radius, DistanceUnits units)
    {
	setCenter(center);
	setRadius(radius);
	setUnits(units);
    }
    
    
    // Methods for field "center"
    public Position3D getCenter()
    {
	return this.center;
    }
    
    public void setCenter(Position3D center)
    {
	this.center = center;
    }
    
    
    // Methods for field "radius"
    public Radius_B12 getRadius()
    {
	return this.radius;
    }
    
    public void setRadius(Radius_B12 radius)
    {
	this.radius = radius;
    }
    
    
    // Methods for field "units"
    public DistanceUnits getUnits()
    {
	return this.units;
    }
    
    public void setUnits(DistanceUnits units)
    {
	this.units = units;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__center("center"),
	__radius("radius"),
	__units("units"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Circle data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'center'
	try {
	    Position3D item1 = data.center;

	    nbits += (item1.encodeValue(coder, sink, item1));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("center", "Position3D");
	    throw ee;
	}
	// Encode field 'radius'
	try {
	    Radius_B12 item1 = data.radius;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 4095)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 4095, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("radius", "Radius-B12");
	    throw ee;
	}
	// Encode field 'units'
	try {
	    DistanceUnits item1 = data.units;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("units", "DistanceUnits");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Circle decodeValue(PerCoder coder, InputBitStream source, Circle data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'center'
	try {
	    if (data.center == null)
		data.center = new Position3D();
	    data.center.decodeValue(coder, source, data.center);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("center", "Position3D");
	    throw de;
	}
	// Decode field 'radius'
	try {
	    long temp1;

	    if (data.radius == null)
		data.radius = new Radius_B12();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 4095);
	    if (temp1 > 4095)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.radius.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("radius", "Radius-B12");
	    throw de;
	}
	// Decode field 'units'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx1 < 0 || idx1 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.units = DistanceUnits.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("units", "DistanceUnits");
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
	// Encode field 'center'
	try {
	    Position3D item1 = this.center;

	    {
		sink.encodeKey("center");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("center", "Position3D");
	    throw ee;
	}
	// Encode field 'radius'
	try {
	    Radius_B12 item1 = this.radius;

	    {
		sink.writeSeparator();
		sink.encodeKey("radius");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("radius", "Radius-B12");
	    throw ee;
	}
	// Encode field 'units'
	try {
	    DistanceUnits item1 = this.units;

	    {
		sink.writeSeparator();
		sink.encodeKey("units");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("units", "DistanceUnits");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Circle decodeValue(JsonCoder coder, JsonReader source)
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
		    case __center:
		    // Decode field 'center'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.center == null)
			    this.center = new Position3D();
			this.center.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("center", "Position3D");
			throw de;
		    }
		    break;
		    case __radius:
		    // Decode field 'radius'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.radius == null)
			    this.radius = new Radius_B12();
			this.radius.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("radius", "Radius-B12");
			throw de;
		    }
		    break;
		    case __units:
		    // Decode field 'units'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			DistanceUnits temp1;

			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(DistanceUnits.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = DistanceUnits.cNamedNumbers[idx1];
			this.units = temp1;
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("units", "DistanceUnits");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'center'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'radius'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'units'");
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
	    writer.print("center ");
	    this.center.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("radius ");
	    writer.print(this.radius.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("units ");
	    printer.print(this.units, writer, this.units.cConstantNameList);
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
	return equalTo((Circle)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Circle)that);
    }
    
    public boolean equalTo(Circle that) {
	if (!this.center.equalTo(that.center))
	    return false;
	if (!this.radius.equalTo(that.radius))
	    return false;
	if (!this.units.equalTo(that.units))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Circle clone() {
	Circle copy = (Circle)super.clone();
	copy.center = center.clone();
	copy.radius = radius.clone();
	copy.units = units.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.center != null ? this.center.hashCode() : 0);
	hash = 41 * hash + (this.radius != null ? this.radius.hashCode() : 0);
	hash = 41 * hash + (this.units != null ? this.units.hashCode() : 0);
	return hash;
    }
} // End class definition for Circle
