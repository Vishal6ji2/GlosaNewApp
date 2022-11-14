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
 * Define the RoadSegmentReferenceID ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RoadSegmentReferenceID extends Sequence {
    public RoadRegulatorID region;
    public RoadSegmentID id;
    
    /**
     * The default constructor.
     */
    public RoadSegmentReferenceID()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RoadSegmentReferenceID(RoadRegulatorID region, RoadSegmentID id)
    {
	setRegion(region);
	setId(id);
    }
    
    /**
     * Construct with required components.
     */
    public RoadSegmentReferenceID(RoadSegmentID id)
    {
	setId(id);
    }
    
    
    // Methods for field "region"
    public RoadRegulatorID getRegion()
    {
	return this.region;
    }
    
    public void setRegion(RoadRegulatorID region)
    {
	this.region = region;
    }
    
    public boolean hasRegion()
    {
	return (region != null);
    }
    
    public void deleteRegion()
    {
	region = null;
    }
    
    
    // Methods for field "id"
    public RoadSegmentID getId()
    {
	return this.id;
    }
    
    public void setId(RoadSegmentID id)
    {
	this.id = id;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__region("region"),
	__id("id"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RoadSegmentReferenceID data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.region != null);
	++nbits;
	if (data.region != null) {
	    // Encode field 'region'
	    try {
		RoadRegulatorID item1 = data.region;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("region", "RoadRegulatorID");
		throw ee;
	    }
	}
	// Encode field 'id'
	try {
	    RoadSegmentID item1 = data.id;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 65535)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "RoadSegmentID");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static RoadSegmentReferenceID decodeValue(PerCoder coder, InputBitStream source, RoadSegmentReferenceID data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_region0 = source.readBit();
    /** Decode root fields **/
	if (has_region0) {
	    // Decode field 'region'
	    try {
		long temp1;

		if (data.region == null)
		    data.region = new RoadRegulatorID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.region.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("region", "RoadRegulatorID");
		throw de;
	    }
	} else {
	    data.region = null;
	}
	// Decode field 'id'
	try {
	    long temp1;

	    if (data.id == null)
		data.id = new RoadSegmentID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.id.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "RoadSegmentID");
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'region'
	try {
	    RoadRegulatorID item1 = this.region;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("region");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "region");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("region", "RoadRegulatorID");
	    throw ee;
	}
	// Encode field 'id'
	try {
	    RoadSegmentID item1 = this.id;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("id");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "RoadSegmentID");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RoadSegmentReferenceID decodeValue(JsonCoder coder, JsonReader source)
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
		    case __region:
		    // Decode field 'region'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.region == null)
				this.region = new RoadRegulatorID();
			    this.region.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("region", "RoadRegulatorID");
			throw de;
		    }
		    break;
		    case __id:
		    // Decode field 'id'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.id == null)
			    this.id = new RoadSegmentID();
			this.id.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "RoadSegmentID");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.region = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'id'");
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
	if (this.region != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("region ");
		writer.print(this.region.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("id ");
	    writer.print(this.id.longValue());
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
	return equalTo((RoadSegmentReferenceID)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RoadSegmentReferenceID)that);
    }
    
    public boolean equalTo(RoadSegmentReferenceID that) {
	if (this.region != null) {
	    if (that.region == null || !this.region.equalTo(that.region))
		return false;
	} else if (that.region != null)
	    return false;
	if (!this.id.equalTo(that.id))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RoadSegmentReferenceID clone() {
	RoadSegmentReferenceID copy = (RoadSegmentReferenceID)super.clone();
	if (region != null) {
	    copy.region = region.clone();
	}
	copy.id = id.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.region != null ? this.region.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	return hash;
    }
} // End class definition for RoadSegmentReferenceID
