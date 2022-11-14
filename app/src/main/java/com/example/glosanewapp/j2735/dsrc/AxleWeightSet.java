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
 * Define the AxleWeightSet ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class AxleWeightSet extends Sequence {
    public AxleLocation location;
    public AxleWeight weight;
    
    /**
     * The default constructor.
     */
    public AxleWeightSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AxleWeightSet(AxleLocation location, AxleWeight weight)
    {
	setLocation(location);
	setWeight(weight);
    }
    
    
    // Methods for field "location"
    public AxleLocation getLocation()
    {
	return this.location;
    }
    
    public void setLocation(AxleLocation location)
    {
	this.location = location;
    }
    
    public boolean hasLocation()
    {
	return (location != null);
    }
    
    public void deleteLocation()
    {
	location = null;
    }
    
    
    // Methods for field "weight"
    public AxleWeight getWeight()
    {
	return this.weight;
    }
    
    public void setWeight(AxleWeight weight)
    {
	this.weight = weight;
    }
    
    public boolean hasWeight()
    {
	return (weight != null);
    }
    
    public void deleteWeight()
    {
	weight = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__location("location"),
	__weight("weight"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AxleWeightSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.location != null);
	sink.writeBit(data.weight != null);
	nbits += 3;
	if (data.location != null) {
	    // Encode field 'location'
	    try {
		AxleLocation item1 = data.location;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("location", "AxleLocation");
		throw ee;
	    }
	}
	if (data.weight != null) {
	    // Encode field 'weight'
	    try {
		AxleWeight item1 = data.weight;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 64255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 64255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weight", "AxleWeight");
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
    public static AxleWeightSet decodeValue(PerCoder coder, InputBitStream source, AxleWeightSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_location0 = source.readBit();
	boolean has_weight0 = source.readBit();
    /** Decode root fields **/
	if (has_location0) {
	    // Decode field 'location'
	    try {
		long temp1;

		if (data.location == null)
		    data.location = new AxleLocation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.location.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("location", "AxleLocation");
		throw de;
	    }
	} else {
	    data.location = null;
	}
	if (has_weight0) {
	    // Decode field 'weight'
	    try {
		long temp1;

		if (data.weight == null)
		    data.weight = new AxleWeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 64255);
		if (temp1 > 64255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.weight.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("weight", "AxleWeight");
		throw de;
	    }
	} else {
	    data.weight = null;
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'location'
	try {
	    AxleLocation item1 = this.location;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("location");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "location");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("location", "AxleLocation");
	    throw ee;
	}
	// Encode field 'weight'
	try {
	    AxleWeight item1 = this.weight;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("weight");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "weight");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("weight", "AxleWeight");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AxleWeightSet decodeValue(JsonCoder coder, JsonReader source)
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
		    case __location:
		    // Decode field 'location'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.location == null)
				this.location = new AxleLocation();
			    this.location.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("location", "AxleLocation");
			throw de;
		    }
		    break;
		    case __weight:
		    // Decode field 'weight'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.weight == null)
				this.weight = new AxleWeight();
			    this.weight.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("weight", "AxleWeight");
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
	    this.location = null;
	if (!present0[1])
	    this.weight = null;
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
	if (this.location != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("location ");
		writer.print(this.location.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.weight != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("weight ");
		writer.print(this.weight.longValue());
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
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((AxleWeightSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AxleWeightSet)that);
    }
    
    public boolean equalTo(AxleWeightSet that) {
	if (this.location != null) {
	    if (that.location == null || !this.location.equalTo(that.location))
		return false;
	} else if (that.location != null)
	    return false;
	if (this.weight != null) {
	    if (that.weight == null || !this.weight.equalTo(that.weight))
		return false;
	} else if (that.weight != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AxleWeightSet clone() {
	AxleWeightSet copy = (AxleWeightSet)super.clone();
	if (location != null) {
	    copy.location = location.clone();
	}
	if (weight != null) {
	    copy.weight = weight.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.location != null ? this.location.hashCode() : 0);
	hash = 41 * hash + (this.weight != null ? this.weight.hashCode() : 0);
	return hash;
    }
} // End class definition for AxleWeightSet
