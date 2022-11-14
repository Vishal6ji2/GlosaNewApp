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
 * Define the NodeOffsetPointXY ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class NodeOffsetPointXY extends Choice {
    
    /**
     * The default constructor.
     */
    public NodeOffsetPointXY()
    {
    }
    
    public static final  int  node_XY1_chosen = 1;
    public static final  int  node_XY2_chosen = 2;
    public static final  int  node_XY3_chosen = 3;
    public static final  int  node_XY4_chosen = 4;
    public static final  int  node_XY5_chosen = 5;
    public static final  int  node_XY6_chosen = 6;
    public static final  int  node_LatLon_chosen = 7;
    public static final  int  regional_chosen = 8;
    
    // Methods for field "node_XY1"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY1(Node_XY_20b node_XY1)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY1(node_XY1);
	return __object;
    }
    
    public boolean hasNode_XY1()
    {
	return getChosenFlag() == node_XY1_chosen;
    }
    
    public Node_XY_20b getNode_XY1()
    {
	if (hasNode_XY1())
	    return (Node_XY_20b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY1(Node_XY_20b node_XY1)
    {
	setChosenValue(node_XY1);
	setChosenFlag(node_XY1_chosen);
    }
    
    
    // Methods for field "node_XY2"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY2(Node_XY_22b node_XY2)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY2(node_XY2);
	return __object;
    }
    
    public boolean hasNode_XY2()
    {
	return getChosenFlag() == node_XY2_chosen;
    }
    
    public Node_XY_22b getNode_XY2()
    {
	if (hasNode_XY2())
	    return (Node_XY_22b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY2(Node_XY_22b node_XY2)
    {
	setChosenValue(node_XY2);
	setChosenFlag(node_XY2_chosen);
    }
    
    
    // Methods for field "node_XY3"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY3(Node_XY_24b node_XY3)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY3(node_XY3);
	return __object;
    }
    
    public boolean hasNode_XY3()
    {
	return getChosenFlag() == node_XY3_chosen;
    }
    
    public Node_XY_24b getNode_XY3()
    {
	if (hasNode_XY3())
	    return (Node_XY_24b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY3(Node_XY_24b node_XY3)
    {
	setChosenValue(node_XY3);
	setChosenFlag(node_XY3_chosen);
    }
    
    
    // Methods for field "node_XY4"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY4(Node_XY_26b node_XY4)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY4(node_XY4);
	return __object;
    }
    
    public boolean hasNode_XY4()
    {
	return getChosenFlag() == node_XY4_chosen;
    }
    
    public Node_XY_26b getNode_XY4()
    {
	if (hasNode_XY4())
	    return (Node_XY_26b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY4(Node_XY_26b node_XY4)
    {
	setChosenValue(node_XY4);
	setChosenFlag(node_XY4_chosen);
    }
    
    
    // Methods for field "node_XY5"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY5(Node_XY_28b node_XY5)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY5(node_XY5);
	return __object;
    }
    
    public boolean hasNode_XY5()
    {
	return getChosenFlag() == node_XY5_chosen;
    }
    
    public Node_XY_28b getNode_XY5()
    {
	if (hasNode_XY5())
	    return (Node_XY_28b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY5(Node_XY_28b node_XY5)
    {
	setChosenValue(node_XY5);
	setChosenFlag(node_XY5_chosen);
    }
    
    
    // Methods for field "node_XY6"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY6(Node_XY_32b node_XY6)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY6(node_XY6);
	return __object;
    }
    
    public boolean hasNode_XY6()
    {
	return getChosenFlag() == node_XY6_chosen;
    }
    
    public Node_XY_32b getNode_XY6()
    {
	if (hasNode_XY6())
	    return (Node_XY_32b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY6(Node_XY_32b node_XY6)
    {
	setChosenValue(node_XY6);
	setChosenFlag(node_XY6_chosen);
    }
    
    
    // Methods for field "node_LatLon"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_LatLon(Node_LLmD_64b node_LatLon)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_LatLon(node_LatLon);
	return __object;
    }
    
    public boolean hasNode_LatLon()
    {
	return getChosenFlag() == node_LatLon_chosen;
    }
    
    public Node_LLmD_64b getNode_LatLon()
    {
	if (hasNode_LatLon())
	    return (Node_LLmD_64b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LatLon(Node_LLmD_64b node_LatLon)
    {
	setChosenValue(node_LatLon);
	setChosenFlag(node_LatLon_chosen);
    }
    
    
    // Methods for field "regional"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithRegional(Regional regional)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setRegional(regional);
	return __object;
    }
    
    public boolean hasRegional()
    {
	return getChosenFlag() == regional_chosen;
    }
    
    public Regional getRegional()
    {
	if (hasRegional())
	    return (Regional)mChosenValue;
	else
	    return null;
    }
    
    public void setRegional(Regional regional)
    {
	setChosenValue(regional);
	setChosenFlag(regional_chosen);
    }
    
    
    
    /**
     * Define the _seq39 ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class Regional extends Sequence {
	public RegionId regionId;
	public OpenType regExtValue;
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Regional(RegionId regionId, OpenType regExtValue)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Regional data)
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
	public static Regional decodeValue(PerCoder coder, InputBitStream source, Regional data)
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
		    REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_NodeOffsetPointXY;
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
	public Regional decodeValue(JsonCoder coder, JsonReader source)
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
				REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_NodeOffsetPointXY;
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
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(Regional that) {
	    if (!this.regionId.equalTo(that.regionId))
		return false;
	    if (!this.regExtValue.equalTo(that.regExtValue))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Regional clone() {
	    Regional copy = (Regional)super.clone();
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
    } // End class definition for Regional

    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__node_XY1("node-XY1"),
	__node_XY2("node-XY2"),
	__node_XY3("node-XY3"),
	__node_XY4("node-XY4"),
	__node_XY5("node-XY5"),
	__node_XY6("node-XY6"),
	__node_LatLon("node-LatLon"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(9);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, NodeOffsetPointXY data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1 || idx0 > 8)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 7, sink);
	switch (idx0) {
	    case node_XY1_chosen:
		// Encode alternative 'node-XY1'
		try {
		    Node_XY_20b item1 = (Node_XY_20b)data.mChosenValue;

		    nbits += Node_XY_20b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-XY1", "Node-XY-20b", 0);
		    throw ee;
		}
		break;
	    case node_XY2_chosen:
		// Encode alternative 'node-XY2'
		try {
		    Node_XY_22b item1 = (Node_XY_22b)data.mChosenValue;

		    nbits += Node_XY_22b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-XY2", "Node-XY-22b", 0);
		    throw ee;
		}
		break;
	    case node_XY3_chosen:
		// Encode alternative 'node-XY3'
		try {
		    Node_XY_24b item1 = (Node_XY_24b)data.mChosenValue;

		    nbits += Node_XY_24b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-XY3", "Node-XY-24b", 0);
		    throw ee;
		}
		break;
	    case node_XY4_chosen:
		// Encode alternative 'node-XY4'
		try {
		    Node_XY_26b item1 = (Node_XY_26b)data.mChosenValue;

		    nbits += Node_XY_26b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-XY4", "Node-XY-26b", 0);
		    throw ee;
		}
		break;
	    case node_XY5_chosen:
		// Encode alternative 'node-XY5'
		try {
		    Node_XY_28b item1 = (Node_XY_28b)data.mChosenValue;

		    nbits += Node_XY_28b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-XY5", "Node-XY-28b", 0);
		    throw ee;
		}
		break;
	    case node_XY6_chosen:
		// Encode alternative 'node-XY6'
		try {
		    Node_XY_32b item1 = (Node_XY_32b)data.mChosenValue;

		    nbits += Node_XY_32b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-XY6", "Node-XY-32b", 0);
		    throw ee;
		}
		break;
	    case node_LatLon_chosen:
		// Encode alternative 'node-LatLon'
		try {
		    Node_LLmD_64b item1 = (Node_LLmD_64b)data.mChosenValue;

		    nbits += Node_LLmD_64b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-LatLon", "Node-LLmD-64b", 0);
		    throw ee;
		}
		break;
	    case regional_chosen:
		// Encode alternative 'regional'
		try {
		    Regional item1 = (Regional)data.mChosenValue;

		    nbits += Regional.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("regional", "SEQUENCE", 0);
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
    public static NodeOffsetPointXY decodeValue(PerCoder coder, InputBitStream source, NodeOffsetPointXY data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;

	idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7) + 1;
	if (idx0 < 1 || idx0 > 8)
	    throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	data.mChosenFlag = idx0;
	switch (idx0) {
	    case node_XY1_chosen:
		// Decode alternative 'node-XY1'
		try {
		    Node_XY_20b item1 = new Node_XY_20b();

		    // Decode alternative 'node-XY1'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY1", "Node-XY-20b", 0);
		    throw de;
		}
		break;
	    case node_XY2_chosen:
		// Decode alternative 'node-XY2'
		try {
		    Node_XY_22b item1 = new Node_XY_22b();

		    // Decode alternative 'node-XY2'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY2", "Node-XY-22b", 0);
		    throw de;
		}
		break;
	    case node_XY3_chosen:
		// Decode alternative 'node-XY3'
		try {
		    Node_XY_24b item1 = new Node_XY_24b();

		    // Decode alternative 'node-XY3'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY3", "Node-XY-24b", 0);
		    throw de;
		}
		break;
	    case node_XY4_chosen:
		// Decode alternative 'node-XY4'
		try {
		    Node_XY_26b item1 = new Node_XY_26b();

		    // Decode alternative 'node-XY4'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY4", "Node-XY-26b", 0);
		    throw de;
		}
		break;
	    case node_XY5_chosen:
		// Decode alternative 'node-XY5'
		try {
		    Node_XY_28b item1 = new Node_XY_28b();

		    // Decode alternative 'node-XY5'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY5", "Node-XY-28b", 0);
		    throw de;
		}
		break;
	    case node_XY6_chosen:
		// Decode alternative 'node-XY6'
		try {
		    Node_XY_32b item1 = new Node_XY_32b();

		    // Decode alternative 'node-XY6'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY6", "Node-XY-32b", 0);
		    throw de;
		}
		break;
	    case node_LatLon_chosen:
		// Decode alternative 'node-LatLon'
		try {
		    Node_LLmD_64b item1 = new Node_LLmD_64b();

		    // Decode alternative 'node-LatLon'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LatLon", "Node-LLmD-64b", 0);
		    throw de;
		}
		break;
	    case regional_chosen:
		// Decode alternative 'regional'
		try {
		    Regional item1 = new Regional();

		    // Decode alternative 'regional'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("regional", "SEQUENCE", 0);
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
	case node_XY1_chosen:
	    // Encode alternative 'node-XY1'
	    try {
		Node_XY_20b item1 = (Node_XY_20b)this.mChosenValue;

		sink.encodeKey("node-XY1");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-XY1", "Node-XY-20b", 0);
		throw ee;
	    }
	    break;
	case node_XY2_chosen:
	    // Encode alternative 'node-XY2'
	    try {
		Node_XY_22b item1 = (Node_XY_22b)this.mChosenValue;

		sink.encodeKey("node-XY2");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-XY2", "Node-XY-22b", 0);
		throw ee;
	    }
	    break;
	case node_XY3_chosen:
	    // Encode alternative 'node-XY3'
	    try {
		Node_XY_24b item1 = (Node_XY_24b)this.mChosenValue;

		sink.encodeKey("node-XY3");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-XY3", "Node-XY-24b", 0);
		throw ee;
	    }
	    break;
	case node_XY4_chosen:
	    // Encode alternative 'node-XY4'
	    try {
		Node_XY_26b item1 = (Node_XY_26b)this.mChosenValue;

		sink.encodeKey("node-XY4");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-XY4", "Node-XY-26b", 0);
		throw ee;
	    }
	    break;
	case node_XY5_chosen:
	    // Encode alternative 'node-XY5'
	    try {
		Node_XY_28b item1 = (Node_XY_28b)this.mChosenValue;

		sink.encodeKey("node-XY5");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-XY5", "Node-XY-28b", 0);
		throw ee;
	    }
	    break;
	case node_XY6_chosen:
	    // Encode alternative 'node-XY6'
	    try {
		Node_XY_32b item1 = (Node_XY_32b)this.mChosenValue;

		sink.encodeKey("node-XY6");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-XY6", "Node-XY-32b", 0);
		throw ee;
	    }
	    break;
	case node_LatLon_chosen:
	    // Encode alternative 'node-LatLon'
	    try {
		Node_LLmD_64b item1 = (Node_LLmD_64b)this.mChosenValue;

		sink.encodeKey("node-LatLon");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-LatLon", "Node-LLmD-64b", 0);
		throw ee;
	    }
	    break;
	case regional_chosen:
	    // Encode alternative 'regional'
	    try {
		Regional item1 = (Regional)this.mChosenValue;

		sink.encodeKey("regional");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("regional", "SEQUENCE", 0);
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
    public NodeOffsetPointXY decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __node_XY1:
		// Decode alternative 'node-XY1'
		try {
		    Node_XY_20b item1 = new Node_XY_20b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_XY1_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY1", "Node-XY-20b", 0);
		    throw de;
		}
		break;
	    case __node_XY2:
		// Decode alternative 'node-XY2'
		try {
		    Node_XY_22b item1 = new Node_XY_22b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_XY2_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY2", "Node-XY-22b", 0);
		    throw de;
		}
		break;
	    case __node_XY3:
		// Decode alternative 'node-XY3'
		try {
		    Node_XY_24b item1 = new Node_XY_24b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_XY3_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY3", "Node-XY-24b", 0);
		    throw de;
		}
		break;
	    case __node_XY4:
		// Decode alternative 'node-XY4'
		try {
		    Node_XY_26b item1 = new Node_XY_26b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_XY4_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY4", "Node-XY-26b", 0);
		    throw de;
		}
		break;
	    case __node_XY5:
		// Decode alternative 'node-XY5'
		try {
		    Node_XY_28b item1 = new Node_XY_28b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_XY5_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY5", "Node-XY-28b", 0);
		    throw de;
		}
		break;
	    case __node_XY6:
		// Decode alternative 'node-XY6'
		try {
		    Node_XY_32b item1 = new Node_XY_32b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_XY6_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-XY6", "Node-XY-32b", 0);
		    throw de;
		}
		break;
	    case __node_LatLon:
		// Decode alternative 'node-LatLon'
		try {
		    Node_LLmD_64b item1 = new Node_LLmD_64b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_LatLon_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LatLon", "Node-LLmD-64b", 0);
		    throw de;
		}
		break;
	    case __regional:
		// Decode alternative 'regional'
		try {
		    Regional item1 = new Regional();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = regional_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("regional", "SEQUENCE", 0);
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
	case node_XY1_chosen:
	    try {
		writer.print("node-XY1 : ");
		((Node_XY_20b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_XY2_chosen:
	    try {
		writer.print("node-XY2 : ");
		((Node_XY_22b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_XY3_chosen:
	    try {
		writer.print("node-XY3 : ");
		((Node_XY_24b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_XY4_chosen:
	    try {
		writer.print("node-XY4 : ");
		((Node_XY_26b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_XY5_chosen:
	    try {
		writer.print("node-XY5 : ");
		((Node_XY_28b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_XY6_chosen:
	    try {
		writer.print("node-XY6 : ");
		((Node_XY_32b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_LatLon_chosen:
	    try {
		writer.print("node-LatLon : ");
		((Node_LLmD_64b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case regional_chosen:
	    try {
		writer.print("regional : ");
		((Regional)this.mChosenValue).printValue(printer, writer);
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
    public NodeOffsetPointXY clone() {
	return (NodeOffsetPointXY)super.clone();
    }

} // End class definition for NodeOffsetPointXY
