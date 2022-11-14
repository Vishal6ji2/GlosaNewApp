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

import com.example.glosanewapp.j2735.region.REGION;
import com.oss.asn1.*;
import com.oss.asn1printer.DataPrinter;
import com.oss.coders.DecoderException;
import com.oss.coders.EncoderException;
import com.oss.coders.InputBitStream;
import com.oss.coders.OutputBitStream;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;
import com.oss.metadata.*;
import com.oss.util.ExceptionDescriptor;

import java.io.IOException;

/**
 * Define the SignalControlZone ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class SignalControlZone extends Sequence {
    public Zone zone;
    
    /**
     * The default constructor.
     */
    public SignalControlZone()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalControlZone(Zone zone)
    {
	setZone(zone);
    }
    
    
    // Methods for field "zone"
    public Zone getZone()
    {
	return this.zone;
    }
    
    public void setZone(Zone zone)
    {
	this.zone = zone;
    }
    
    
    
    /**
     * Define the Zone ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class Zone extends Sequence {
	public RegionId regionId;
	public OpenType regExtValue;
	
	/**
	 * The default constructor.
	 */
	public Zone()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Zone(RegionId regionId, OpenType regExtValue)
	{
	    setRegionId(regionId);
	    setRegExtValue(regExtValue);
	}
	
	
	// Methods for field "regionId"
	public RegionId getRegionId()
	{
	    return this.regionId;
	}
	
	public void setRegionId(RegionId regionId)
	{
	    this.regionId = regionId;
	}
	
	
	// Methods for field "regExtValue"
	public OpenType getRegExtValue()
	{
	    return this.regExtValue;
	}
	
	public void setRegExtValue(OpenType regExtValue)
	{
	    this.regExtValue = regExtValue;
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __regionId("regionId"),
	    __regExtValue("regExtValue"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Zone data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    // Encode field 'regionId'
	    try {
		RegionId item1 = data.regionId;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("regionId", "RegionId");
		throw ee;
	    }
	    // Encode field 'regExtValue'
	    try {
		OpenType item1 = data.regExtValue;

		nbits += com.oss.coders.per.PerOpenType.encode(coder, item1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("regExtValue", "OpenType");
		throw ee;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static Zone decodeValue(PerCoder coder, InputBitStream source, Zone data)
		throws IOException, DecoderException, DecodeFailedException
	{
	/** Decode root fields **/
	    // Decode field 'regionId'
	    try {
		long temp1;

		if (data.regionId == null)
		    data.regionId = new RegionId();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.regionId.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("regionId", "RegionId");
		throw de;
	    }
	    // Decode field 'regExtValue'
	    try {
		boolean processed1 = false;

		if (coder.getOption(com.oss.coders.Coder.cAUTOMATIC_ENCDEC)) {
		    ASN1Type otype_pdu1 = null;
		    REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_SignalControlZone;
		    REG_EXT_ID_AND_TYPE infoobj1 = null;

		    RegionId _ref_1_1 = data.regionId;
		    infoobj1 = oset1.getObject(_ref_1_1);
		    if (infoobj1 != null) { 
			otype_pdu1 = infoobj1.Type;
		    }
		    if (otype_pdu1 != null) 
		    {
			AbstractData otype1 = otype_pdu1.newInstance();

			if (otype1 instanceof PERDecodable) {
			    try {
				data.regExtValue = new OpenType(com.oss.coders.per.PerOpenType.decode(coder, source, (PERDecodable)otype1));
				processed1 = true;
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendFieldContext(null, otype1.getTypeName());
				throw de;
			    }
			}
		    }
		}
		if (!processed1) {
		    data.regExtValue = new OpenType(com.oss.coders.per.PerOctets.decode(coder, source, -1));
		}
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("regExtValue", "OpenType");
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
	    // Encode field 'regionId'
	    try {
		RegionId item1 = this.regionId;

		{
		    sink.encodeKey("regionId");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("regionId", "RegionId");
		throw ee;
	    }
	    // Encode field 'regExtValue'
	    try {
		OpenType item1 = this.regExtValue;

		{
		    sink.writeSeparator();
		    sink.encodeKey("regExtValue");
		    com.oss.coders.json.JsonOpenType.encode(coder, item1, sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("regExtValue", "OpenType");
		throw ee;
	    }
	    sink.endObject();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public Zone decodeValue(JsonCoder coder, JsonReader source)
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
			case __regionId:
			// Decode field 'regionId'
			try {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regionId == null)
				this.regionId = new RegionId();
			    this.regionId.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("regionId", "RegionId");
			    throw de;
			}
			break;
			case __regExtValue:
			// Decode field 'regExtValue'
			try {
			    boolean processed1 = false;

			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regExtValue == null)
				this.regExtValue = new OpenType();
			    if (coder.getOption(com.oss.coders.Coder.cAUTOMATIC_ENCDEC)) {
				ASN1Type otype_pdu1 = null;
				REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_SignalControlZone;
				REG_EXT_ID_AND_TYPE infoobj1 = null;

				RegionId _ref_1_1 = this.regionId;
				infoobj1 = oset1.getObject(_ref_1_1);
				if (infoobj1 != null) { 
				    otype_pdu1 = infoobj1.Type;
				}
				if (otype_pdu1 != null) 
				{
				    AbstractData otype1 = otype_pdu1.newInstance();

				    if (otype1 instanceof JSONDecodable) {
					try {
					    this.regExtValue.setDecodedValue(com.oss.coders.json.JsonOpenType.decode(coder, source, (JSONDecodable)otype1));
					    this.regExtValue.setEncodedValue(null);
					    processed1 = true;
					} catch (Exception e) {
					    DecoderException de = DecoderException.wrapException(e);
					    de.appendFieldContext(null, otype1.getTypeName());
					    throw de;
					}
				    }
				}
			    }
			    if (!processed1) {
				this.regExtValue.setEncodedValue(coder.captureRawValue(source));
				this.regExtValue.setDecodedValue(null);
			    }
			    present0[1] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("regExtValue", "OpenType");
			    throw de;
			}
			break;
			default:
			    throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		    }
		} while (coder.hasMoreProperties(source, false));
	    if (!present0[0])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'regionId'");
	    if (!present0[1])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'regExtValue'");
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
		writer.print("regionId ");
		writer.print(this.regionId.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("regExtValue ");
		printer.print(this.regExtValue, writer);
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
	    return equalTo((Zone)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Zone)that);
	}
	
	public boolean equalTo(Zone that) {
	    if (!this.regionId.equalTo(that.regionId))
		return false;
	    if (!this.regExtValue.equalTo(that.regExtValue))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Zone clone() {
	    Zone copy = (Zone)super.clone();
	    copy.regionId = regionId.clone();
	    copy.regExtValue = regExtValue.clone();
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 3;
	    hash = 41 * hash + (this.regionId != null ? this.regionId.hashCode() : 0);
	    hash = 41 * hash + (this.regExtValue != null ? this.regExtValue.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Zone

    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__zone("zone"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(2);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SignalControlZone data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'zone'
	try {
	    Zone item1 = data.zone;

	    nbits += Zone.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("zone", "SEQUENCE");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SignalControlZone decodeValue(PerCoder coder, InputBitStream source, SignalControlZone data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'zone'
	try {
	    if (data.zone == null)
		data.zone = new Zone();
	    data.zone.decodeValue(coder, source, data.zone);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("zone", "SEQUENCE");
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
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	sink.beginObject();
	// Encode field 'zone'
	try {
	    Zone item1 = this.zone;

	    {
		sink.encodeKey("zone");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("zone", "SEQUENCE");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SignalControlZone decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[2];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		if (tag0.equals("zone")) {
		    // Decode field 'zone'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.zone == null)
			    this.zone = new Zone();
			this.zone.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("zone", "SEQUENCE");
			throw de;
		    }
		} else {
			//coder.setUnknownExtensionFound();
			coder.skipValue(source);
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'zone'");
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
	    writer.print("zone ");
	    this.zone.printValue(printer, writer);
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
	return equalTo((SignalControlZone)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SignalControlZone)that);
    }
    
    public boolean equalTo(SignalControlZone that) {
	if (!this.zone.equalTo(that.zone))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SignalControlZone clone() {
	SignalControlZone copy = (SignalControlZone)super.clone();
	copy.zone = zone.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.zone != null ? this.zone.hashCode() : 0);
	return hash;
    }
} // End class definition for SignalControlZone
