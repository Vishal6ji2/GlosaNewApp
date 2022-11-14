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
 * Define the NodeOffsetPointLL ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class NodeOffsetPointLL extends Choice {
    
    /**
     * The default constructor.
     */
    public NodeOffsetPointLL()
    {
    }
    
    public static final  int  node_LL1_chosen = 1;
    public static final  int  node_LL2_chosen = 2;
    public static final  int  node_LL3_chosen = 3;
    public static final  int  node_LL4_chosen = 4;
    public static final  int  node_LL5_chosen = 5;
    public static final  int  node_LL6_chosen = 6;
    public static final  int  node_LatLon_chosen = 7;
    public static final  int  regional_chosen = 8;
    
    // Methods for field "node_LL1"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL1(Node_LL_24B node_LL1)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL1(node_LL1);
	return __object;
    }
    
    public boolean hasNode_LL1()
    {
	return getChosenFlag() == node_LL1_chosen;
    }
    
    public Node_LL_24B getNode_LL1()
    {
	if (hasNode_LL1())
	    return (Node_LL_24B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL1(Node_LL_24B node_LL1)
    {
	setChosenValue(node_LL1);
	setChosenFlag(node_LL1_chosen);
    }
    
    
    // Methods for field "node_LL2"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL2(Node_LL_28B node_LL2)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL2(node_LL2);
	return __object;
    }
    
    public boolean hasNode_LL2()
    {
	return getChosenFlag() == node_LL2_chosen;
    }
    
    public Node_LL_28B getNode_LL2()
    {
	if (hasNode_LL2())
	    return (Node_LL_28B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL2(Node_LL_28B node_LL2)
    {
	setChosenValue(node_LL2);
	setChosenFlag(node_LL2_chosen);
    }
    
    
    // Methods for field "node_LL3"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL3(Node_LL_32B node_LL3)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL3(node_LL3);
	return __object;
    }
    
    public boolean hasNode_LL3()
    {
	return getChosenFlag() == node_LL3_chosen;
    }
    
    public Node_LL_32B getNode_LL3()
    {
	if (hasNode_LL3())
	    return (Node_LL_32B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL3(Node_LL_32B node_LL3)
    {
	setChosenValue(node_LL3);
	setChosenFlag(node_LL3_chosen);
    }
    
    
    // Methods for field "node_LL4"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL4(Node_LL_36B node_LL4)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL4(node_LL4);
	return __object;
    }
    
    public boolean hasNode_LL4()
    {
	return getChosenFlag() == node_LL4_chosen;
    }
    
    public Node_LL_36B getNode_LL4()
    {
	if (hasNode_LL4())
	    return (Node_LL_36B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL4(Node_LL_36B node_LL4)
    {
	setChosenValue(node_LL4);
	setChosenFlag(node_LL4_chosen);
    }
    
    
    // Methods for field "node_LL5"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL5(Node_LL_44B node_LL5)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL5(node_LL5);
	return __object;
    }
    
    public boolean hasNode_LL5()
    {
	return getChosenFlag() == node_LL5_chosen;
    }
    
    public Node_LL_44B getNode_LL5()
    {
	if (hasNode_LL5())
	    return (Node_LL_44B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL5(Node_LL_44B node_LL5)
    {
	setChosenValue(node_LL5);
	setChosenFlag(node_LL5_chosen);
    }
    
    
    // Methods for field "node_LL6"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL6(Node_LL_48B node_LL6)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL6(node_LL6);
	return __object;
    }
    
    public boolean hasNode_LL6()
    {
	return getChosenFlag() == node_LL6_chosen;
    }
    
    public Node_LL_48B getNode_LL6()
    {
	if (hasNode_LL6())
	    return (Node_LL_48B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL6(Node_LL_48B node_LL6)
    {
	setChosenValue(node_LL6);
	setChosenFlag(node_LL6_chosen);
    }
    
    
    // Methods for field "node_LatLon"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LatLon(Node_LLmD_64b node_LatLon)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

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
    public static NodeOffsetPointLL createNodeOffsetPointLLWithRegional(Regional regional)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

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
     * Define the _seq38 ASN.1 type included in the DSRC ASN.1 module.
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
		    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_NodeOffsetPointLL;
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
				REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_NodeOffsetPointLL;
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
	__node_LL1("node-LL1"),
	__node_LL2("node-LL2"),
	__node_LL3("node-LL3"),
	__node_LL4("node-LL4"),
	__node_LL5("node-LL5"),
	__node_LL6("node-LL6"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, NodeOffsetPointLL data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1 || idx0 > 8)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 7, sink);
	switch (idx0) {
	    case node_LL1_chosen:
		// Encode alternative 'node-LL1'
		try {
		    Node_LL_24B item1 = (Node_LL_24B)data.mChosenValue;

		    nbits += Node_LL_24B.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-LL1", "Node-LL-24B", 0);
		    throw ee;
		}
		break;
	    case node_LL2_chosen:
		// Encode alternative 'node-LL2'
		try {
		    Node_LL_28B item1 = (Node_LL_28B)data.mChosenValue;

		    nbits += Node_LL_28B.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-LL2", "Node-LL-28B", 0);
		    throw ee;
		}
		break;
	    case node_LL3_chosen:
		// Encode alternative 'node-LL3'
		try {
		    Node_LL_32B item1 = (Node_LL_32B)data.mChosenValue;

		    nbits += Node_LL_32B.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-LL3", "Node-LL-32B", 0);
		    throw ee;
		}
		break;
	    case node_LL4_chosen:
		// Encode alternative 'node-LL4'
		try {
		    Node_LL_36B item1 = (Node_LL_36B)data.mChosenValue;

		    nbits += Node_LL_36B.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-LL4", "Node-LL-36B", 0);
		    throw ee;
		}
		break;
	    case node_LL5_chosen:
		// Encode alternative 'node-LL5'
		try {
		    Node_LL_44B item1 = (Node_LL_44B)data.mChosenValue;

		    nbits += Node_LL_44B.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-LL5", "Node-LL-44B", 0);
		    throw ee;
		}
		break;
	    case node_LL6_chosen:
		// Encode alternative 'node-LL6'
		try {
		    Node_LL_48B item1 = (Node_LL_48B)data.mChosenValue;

		    nbits += Node_LL_48B.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("node-LL6", "Node-LL-48B", 0);
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
    public static NodeOffsetPointLL decodeValue(PerCoder coder, InputBitStream source, NodeOffsetPointLL data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;

	idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7) + 1;
	if (idx0 < 1 || idx0 > 8)
	    throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	data.mChosenFlag = idx0;
	switch (idx0) {
	    case node_LL1_chosen:
		// Decode alternative 'node-LL1'
		try {
		    Node_LL_24B item1 = new Node_LL_24B();

		    // Decode alternative 'node-LL1'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL1", "Node-LL-24B", 0);
		    throw de;
		}
		break;
	    case node_LL2_chosen:
		// Decode alternative 'node-LL2'
		try {
		    Node_LL_28B item1 = new Node_LL_28B();

		    // Decode alternative 'node-LL2'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL2", "Node-LL-28B", 0);
		    throw de;
		}
		break;
	    case node_LL3_chosen:
		// Decode alternative 'node-LL3'
		try {
		    Node_LL_32B item1 = new Node_LL_32B();

		    // Decode alternative 'node-LL3'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL3", "Node-LL-32B", 0);
		    throw de;
		}
		break;
	    case node_LL4_chosen:
		// Decode alternative 'node-LL4'
		try {
		    Node_LL_36B item1 = new Node_LL_36B();

		    // Decode alternative 'node-LL4'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL4", "Node-LL-36B", 0);
		    throw de;
		}
		break;
	    case node_LL5_chosen:
		// Decode alternative 'node-LL5'
		try {
		    Node_LL_44B item1 = new Node_LL_44B();

		    // Decode alternative 'node-LL5'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL5", "Node-LL-44B", 0);
		    throw de;
		}
		break;
	    case node_LL6_chosen:
		// Decode alternative 'node-LL6'
		try {
		    Node_LL_48B item1 = new Node_LL_48B();

		    // Decode alternative 'node-LL6'
		    data.mChosenValue = item1;
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL6", "Node-LL-48B", 0);
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
	case node_LL1_chosen:
	    // Encode alternative 'node-LL1'
	    try {
		Node_LL_24B item1 = (Node_LL_24B)this.mChosenValue;

		sink.encodeKey("node-LL1");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-LL1", "Node-LL-24B", 0);
		throw ee;
	    }
	    break;
	case node_LL2_chosen:
	    // Encode alternative 'node-LL2'
	    try {
		Node_LL_28B item1 = (Node_LL_28B)this.mChosenValue;

		sink.encodeKey("node-LL2");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-LL2", "Node-LL-28B", 0);
		throw ee;
	    }
	    break;
	case node_LL3_chosen:
	    // Encode alternative 'node-LL3'
	    try {
		Node_LL_32B item1 = (Node_LL_32B)this.mChosenValue;

		sink.encodeKey("node-LL3");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-LL3", "Node-LL-32B", 0);
		throw ee;
	    }
	    break;
	case node_LL4_chosen:
	    // Encode alternative 'node-LL4'
	    try {
		Node_LL_36B item1 = (Node_LL_36B)this.mChosenValue;

		sink.encodeKey("node-LL4");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-LL4", "Node-LL-36B", 0);
		throw ee;
	    }
	    break;
	case node_LL5_chosen:
	    // Encode alternative 'node-LL5'
	    try {
		Node_LL_44B item1 = (Node_LL_44B)this.mChosenValue;

		sink.encodeKey("node-LL5");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-LL5", "Node-LL-44B", 0);
		throw ee;
	    }
	    break;
	case node_LL6_chosen:
	    // Encode alternative 'node-LL6'
	    try {
		Node_LL_48B item1 = (Node_LL_48B)this.mChosenValue;

		sink.encodeKey("node-LL6");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("node-LL6", "Node-LL-48B", 0);
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
    public NodeOffsetPointLL decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __node_LL1:
		// Decode alternative 'node-LL1'
		try {
		    Node_LL_24B item1 = new Node_LL_24B();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_LL1_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL1", "Node-LL-24B", 0);
		    throw de;
		}
		break;
	    case __node_LL2:
		// Decode alternative 'node-LL2'
		try {
		    Node_LL_28B item1 = new Node_LL_28B();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_LL2_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL2", "Node-LL-28B", 0);
		    throw de;
		}
		break;
	    case __node_LL3:
		// Decode alternative 'node-LL3'
		try {
		    Node_LL_32B item1 = new Node_LL_32B();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_LL3_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL3", "Node-LL-32B", 0);
		    throw de;
		}
		break;
	    case __node_LL4:
		// Decode alternative 'node-LL4'
		try {
		    Node_LL_36B item1 = new Node_LL_36B();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_LL4_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL4", "Node-LL-36B", 0);
		    throw de;
		}
		break;
	    case __node_LL5:
		// Decode alternative 'node-LL5'
		try {
		    Node_LL_44B item1 = new Node_LL_44B();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_LL5_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL5", "Node-LL-44B", 0);
		    throw de;
		}
		break;
	    case __node_LL6:
		// Decode alternative 'node-LL6'
		try {
		    Node_LL_48B item1 = new Node_LL_48B();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = node_LL6_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("node-LL6", "Node-LL-48B", 0);
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
	case node_LL1_chosen:
	    try {
		writer.print("node-LL1 : ");
		((Node_LL_24B)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_LL2_chosen:
	    try {
		writer.print("node-LL2 : ");
		((Node_LL_28B)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_LL3_chosen:
	    try {
		writer.print("node-LL3 : ");
		((Node_LL_32B)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_LL4_chosen:
	    try {
		writer.print("node-LL4 : ");
		((Node_LL_36B)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_LL5_chosen:
	    try {
		writer.print("node-LL5 : ");
		((Node_LL_44B)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case node_LL6_chosen:
	    try {
		writer.print("node-LL6 : ");
		((Node_LL_48B)this.mChosenValue).printValue(printer, writer);
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
    public NodeOffsetPointLL clone() {
	return (NodeOffsetPointLL)super.clone();
    }

} // End class definition for NodeOffsetPointLL
