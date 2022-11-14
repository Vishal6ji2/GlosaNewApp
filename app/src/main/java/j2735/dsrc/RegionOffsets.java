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
 * Define the RegionOffsets ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RegionOffsets extends Sequence {
    public OffsetLL_B16 xOffset;
    public OffsetLL_B16 yOffset;
    public OffsetLL_B16 zOffset;
    
    /**
     * The default constructor.
     */
    public RegionOffsets()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RegionOffsets(OffsetLL_B16 xOffset, OffsetLL_B16 yOffset, 
		    OffsetLL_B16 zOffset)
    {
	setXOffset(xOffset);
	setYOffset(yOffset);
	setZOffset(zOffset);
    }
    
    /**
     * Construct with required components.
     */
    public RegionOffsets(OffsetLL_B16 xOffset, OffsetLL_B16 yOffset)
    {
	setXOffset(xOffset);
	setYOffset(yOffset);
    }
    
    
    // Methods for field "xOffset"
    public OffsetLL_B16 getXOffset()
    {
	return this.xOffset;
    }
    
    public void setXOffset(OffsetLL_B16 xOffset)
    {
	this.xOffset = xOffset;
    }
    
    
    // Methods for field "yOffset"
    public OffsetLL_B16 getYOffset()
    {
	return this.yOffset;
    }
    
    public void setYOffset(OffsetLL_B16 yOffset)
    {
	this.yOffset = yOffset;
    }
    
    
    // Methods for field "zOffset"
    public OffsetLL_B16 getZOffset()
    {
	return this.zOffset;
    }
    
    public void setZOffset(OffsetLL_B16 zOffset)
    {
	this.zOffset = zOffset;
    }
    
    public boolean hasZOffset()
    {
	return (zOffset != null);
    }
    
    public void deleteZOffset()
    {
	zOffset = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__xOffset("xOffset"),
	__yOffset("yOffset"),
	__zOffset("zOffset"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RegionOffsets data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.zOffset != null);
	++nbits;
	// Encode field 'xOffset'
	try {
	    OffsetLL_B16 item1 = data.xOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -32768 || temp1 > 32767)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -32768, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("xOffset", "OffsetLL-B16");
	    throw ee;
	}
	// Encode field 'yOffset'
	try {
	    OffsetLL_B16 item1 = data.yOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -32768 || temp1 > 32767)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -32768, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yOffset", "OffsetLL-B16");
	    throw ee;
	}
	if (data.zOffset != null) {
	    // Encode field 'zOffset'
	    try {
		OffsetLL_B16 item1 = data.zOffset;
		long temp1 = item1.longValue();

		if (temp1 < -32768 || temp1 > 32767)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -32768, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("zOffset", "OffsetLL-B16");
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
    public static RegionOffsets decodeValue(PerCoder coder, InputBitStream source, RegionOffsets data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_zOffset0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'xOffset'
	try {
	    long temp1;

	    if (data.xOffset == null)
		data.xOffset = new OffsetLL_B16();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -32768, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.xOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("xOffset", "OffsetLL-B16");
	    throw de;
	}
	// Decode field 'yOffset'
	try {
	    long temp1;

	    if (data.yOffset == null)
		data.yOffset = new OffsetLL_B16();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -32768, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.yOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("yOffset", "OffsetLL-B16");
	    throw de;
	}
	if (has_zOffset0) {
	    // Decode field 'zOffset'
	    try {
		long temp1;

		if (data.zOffset == null)
		    data.zOffset = new OffsetLL_B16();
		temp1 = coder.decodeConstrainedWholeNumber(source, -32768, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.zOffset.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("zOffset", "OffsetLL-B16");
		throw de;
	    }
	} else {
	    data.zOffset = null;
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
	// Encode field 'xOffset'
	try {
	    OffsetLL_B16 item1 = this.xOffset;

	    {
		sink.encodeKey("xOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("xOffset", "OffsetLL-B16");
	    throw ee;
	}
	// Encode field 'yOffset'
	try {
	    OffsetLL_B16 item1 = this.yOffset;

	    {
		sink.writeSeparator();
		sink.encodeKey("yOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yOffset", "OffsetLL-B16");
	    throw ee;
	}
	// Encode field 'zOffset'
	try {
	    OffsetLL_B16 item1 = this.zOffset;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("zOffset");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "zOffset");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("zOffset", "OffsetLL-B16");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RegionOffsets decodeValue(JsonCoder coder, JsonReader source)
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
		    case __xOffset:
		    // Decode field 'xOffset'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.xOffset == null)
			    this.xOffset = new OffsetLL_B16();
			this.xOffset.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("xOffset", "OffsetLL-B16");
			throw de;
		    }
		    break;
		    case __yOffset:
		    // Decode field 'yOffset'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.yOffset == null)
			    this.yOffset = new OffsetLL_B16();
			this.yOffset.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("yOffset", "OffsetLL-B16");
			throw de;
		    }
		    break;
		    case __zOffset:
		    // Decode field 'zOffset'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.zOffset == null)
				this.zOffset = new OffsetLL_B16();
			    this.zOffset.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("zOffset", "OffsetLL-B16");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'xOffset'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'yOffset'");
	if (!present0[2])
	    this.zOffset = null;
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
	    writer.print("xOffset ");
	    writer.print(this.xOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("yOffset ");
	    writer.print(this.yOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.zOffset != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("zOffset ");
		writer.print(this.zOffset.longValue());
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
	return equalTo((RegionOffsets)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RegionOffsets)that);
    }
    
    public boolean equalTo(RegionOffsets that) {
	if (!this.xOffset.equalTo(that.xOffset))
	    return false;
	if (!this.yOffset.equalTo(that.yOffset))
	    return false;
	if (this.zOffset != null) {
	    if (that.zOffset == null || !this.zOffset.equalTo(that.zOffset))
		return false;
	} else if (that.zOffset != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RegionOffsets clone() {
	RegionOffsets copy = (RegionOffsets)super.clone();
	copy.xOffset = xOffset.clone();
	copy.yOffset = yOffset.clone();
	if (zOffset != null) {
	    copy.zOffset = zOffset.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.xOffset != null ? this.xOffset.hashCode() : 0);
	hash = 41 * hash + (this.yOffset != null ? this.yOffset.hashCode() : 0);
	hash = 41 * hash + (this.zOffset != null ? this.zOffset.hashCode() : 0);
	return hash;
    }
} // End class definition for RegionOffsets
