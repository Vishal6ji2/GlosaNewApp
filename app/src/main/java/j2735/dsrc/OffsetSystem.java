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
 * Define the OffsetSystem ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class OffsetSystem extends Sequence {
    public Zoom scale;
    public Offset offset;
    
    /**
     * The default constructor.
     */
    public OffsetSystem()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public OffsetSystem(Zoom scale, Offset offset)
    {
	setScale(scale);
	setOffset(offset);
    }
    
    /**
     * Construct with required components.
     */
    public OffsetSystem(Offset offset)
    {
	setOffset(offset);
    }
    
    
    // Methods for field "scale"
    public Zoom getScale()
    {
	return this.scale;
    }
    
    public void setScale(Zoom scale)
    {
	this.scale = scale;
    }
    
    public boolean hasScale()
    {
	return (scale != null);
    }
    
    public void deleteScale()
    {
	scale = null;
    }
    
    
    // Methods for field "offset"
    public Offset getOffset()
    {
	return this.offset;
    }
    
    public void setOffset(Offset offset)
    {
	this.offset = offset;
    }
    
    
    
    /**
     * Define the Offset ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class Offset extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Offset()
	{
	}
	
	public static final  int  xy_chosen = 1;
	public static final  int  ll_chosen = 2;
	
	// Methods for field "xy"
	public static Offset createOffsetWithXy(NodeListXY xy)
	{
	    Offset __object = new Offset();

	    __object.setXy(xy);
	    return __object;
	}
	
	public boolean hasXy()
	{
	    return getChosenFlag() == xy_chosen;
	}
	
	public NodeListXY getXy()
	{
	    if (hasXy())
		return (NodeListXY)mChosenValue;
	    else
		return null;
	}
	
	public void setXy(NodeListXY xy)
	{
	    setChosenValue(xy);
	    setChosenFlag(xy_chosen);
	}
	
	
	// Methods for field "ll"
	public static Offset createOffsetWithLl(NodeListLL ll)
	{
	    Offset __object = new Offset();

	    __object.setLl(ll);
	    return __object;
	}
	
	public boolean hasLl()
	{
	    return getChosenFlag() == ll_chosen;
	}
	
	public NodeListLL getLl()
	{
	    if (hasLl())
		return (NodeListLL)mChosenValue;
	    else
		return null;
	}
	
	public void setLl(NodeListLL ll)
	{
	    setChosenValue(ll);
	    setChosenFlag(ll_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __xy("xy"),
	    __ll("ll"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Offset data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case xy_chosen:
		    // Encode alternative 'xy'
		    try {
			NodeListXY item1 = (NodeListXY)data.mChosenValue;

			nbits += NodeListXY.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("xy", "NodeListXY", 0);
			throw ee;
		    }
		    break;
		case ll_chosen:
		    // Encode alternative 'll'
		    try {
			NodeListLL item1 = (NodeListLL)data.mChosenValue;

			nbits += NodeListLL.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("ll", "NodeListLL", 0);
			throw ee;
		    }
		    break;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static Offset decodeValue(PerCoder coder, InputBitStream source, Offset data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case xy_chosen:
		    // Decode alternative 'xy'
		    try {
			NodeListXY item1 = new NodeListXY();

			// Decode alternative 'xy'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("xy", "NodeListXY", 0);
			throw de;
		    }
		    break;
		case ll_chosen:
		    // Decode alternative 'll'
		    try {
			NodeListLL item1 = new NodeListLL();

			// Decode alternative 'll'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("ll", "NodeListLL", 0);
			throw de;
		    }
		    break;
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
	    int idx0 = this.mChosenFlag;

	    sink.beginObject();
	    switch (idx0)
	    {
	    case xy_chosen:
		// Encode alternative 'xy'
		try {
		    NodeListXY item1 = (NodeListXY)this.mChosenValue;

		    sink.encodeKey("xy");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("xy", "NodeListXY", 0);
		    throw ee;
		}
		break;
	    case ll_chosen:
		// Encode alternative 'll'
		try {
		    NodeListLL item1 = (NodeListLL)this.mChosenValue;

		    sink.encodeKey("ll");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("ll", "NodeListLL", 0);
		    throw ee;
		}
		break;
	    default:
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    }
	    sink.endObject();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public Offset decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __xy:
		    // Decode alternative 'xy'
		    try {
			NodeListXY item1 = new NodeListXY();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = xy_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("xy", "NodeListXY", 0);
			throw de;
		    }
		    break;
		case __ll:
		    // Decode alternative 'll'
		    try {
			NodeListLL item1 = new NodeListLL();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = ll_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("ll", "NodeListLL", 0);
			throw de;
		    }
		    break;
		default:
		    throw new DecoderException(ExceptionDescriptor._unknown_field, null, tag0);
	    }
	    if (coder.hasMoreProperties(source, false))
		throw new DecoderException(ExceptionDescriptor._json_unexpected_token, null, "expecting '}'");
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
	    switch (this.mChosenFlag) {
	    case xy_chosen:
		try {
		    writer.print("xy : ");
		    ((NodeListXY)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case ll_chosen:
		try {
		    writer.print("ll : ");
		    ((NodeListLL)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    default:
		writer.print("-- unknown selection --");
	    }
	}

	/**
	 * Clone 'this' object.
	 */
	public Offset clone() {
	    return (Offset)super.clone();
	}

    } // End class definition for Offset

    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__scale("scale"),
	__offset("offset"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, OffsetSystem data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.scale != null);
	++nbits;
	if (data.scale != null) {
	    // Encode field 'scale'
	    try {
		Zoom item1 = data.scale;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 15)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("scale", "Zoom");
		throw ee;
	    }
	}
	// Encode field 'offset'
	try {
	    Offset item1 = data.offset;

	    nbits += Offset.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offset", "CHOICE");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static OffsetSystem decodeValue(PerCoder coder, InputBitStream source, OffsetSystem data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_scale0 = source.readBit();
    /** Decode root fields **/
	if (has_scale0) {
	    // Decode field 'scale'
	    try {
		long temp1;

		if (data.scale == null)
		    data.scale = new Zoom();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (temp1 > 15)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.scale.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("scale", "Zoom");
		throw de;
	    }
	} else {
	    data.scale = null;
	}
	// Decode field 'offset'
	try {
	    if (data.offset == null)
		data.offset = new Offset();
	    data.offset.decodeValue(coder, source, data.offset);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("offset", "CHOICE");
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
	// Encode field 'scale'
	try {
	    Zoom item1 = this.scale;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("scale");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "scale");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("scale", "Zoom");
	    throw ee;
	}
	// Encode field 'offset'
	try {
	    Offset item1 = this.offset;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("offset");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offset", "CHOICE");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public OffsetSystem decodeValue(JsonCoder coder, JsonReader source)
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
		    case __scale:
		    // Decode field 'scale'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.scale == null)
				this.scale = new Zoom();
			    this.scale.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("scale", "Zoom");
			throw de;
		    }
		    break;
		    case __offset:
		    // Decode field 'offset'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.offset == null)
			    this.offset = new Offset();
			this.offset.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("offset", "CHOICE");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.scale = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'offset'");
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
	if (this.scale != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("scale ");
		writer.print(this.scale.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("offset ");
	    this.offset.printValue(printer, writer);
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
	return equalTo((OffsetSystem)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((OffsetSystem)that);
    }
    
    public boolean equalTo(OffsetSystem that) {
	if (this.scale != null) {
	    if (that.scale == null || !this.scale.equalTo(that.scale))
		return false;
	} else if (that.scale != null)
	    return false;
	if (!this.offset.equalTo(that.offset))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public OffsetSystem clone() {
	OffsetSystem copy = (OffsetSystem)super.clone();
	if (scale != null) {
	    copy.scale = scale.clone();
	}
	copy.offset = offset.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.scale != null ? this.scale.hashCode() : 0);
	hash = 41 * hash + (this.offset != null ? this.offset.hashCode() : 0);
	return hash;
    }
} // End class definition for OffsetSystem
