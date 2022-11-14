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
 * Define the NodeAttributeSetLL ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class NodeAttributeSetLL extends Sequence {
    public NodeAttributeLLList localNode;
    public SegmentAttributeLLList disabled;
    public SegmentAttributeLLList enabled;
    public LaneDataAttributeList data;
    public Offset_B10 dWidth;
    public Offset_B10 dElevation;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public NodeAttributeSetLL()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NodeAttributeSetLL(NodeAttributeLLList localNode, 
		    SegmentAttributeLLList disabled, 
		    SegmentAttributeLLList enabled, 
		    LaneDataAttributeList data, Offset_B10 dWidth, 
		    Offset_B10 dElevation, Regional regional)
    {
	setLocalNode(localNode);
	setDisabled(disabled);
	setEnabled(enabled);
	setData(data);
	setDWidth(dWidth);
	setDElevation(dElevation);
	setRegional(regional);
    }
    
    
    // Methods for field "localNode"
    public NodeAttributeLLList getLocalNode()
    {
	return this.localNode;
    }
    
    public void setLocalNode(NodeAttributeLLList localNode)
    {
	this.localNode = localNode;
    }
    
    public boolean hasLocalNode()
    {
	return (localNode != null);
    }
    
    public void deleteLocalNode()
    {
	localNode = null;
    }
    
    
    // Methods for field "disabled"
    public SegmentAttributeLLList getDisabled()
    {
	return this.disabled;
    }
    
    public void setDisabled(SegmentAttributeLLList disabled)
    {
	this.disabled = disabled;
    }
    
    public boolean hasDisabled()
    {
	return (disabled != null);
    }
    
    public void deleteDisabled()
    {
	disabled = null;
    }
    
    
    // Methods for field "enabled"
    public SegmentAttributeLLList getEnabled()
    {
	return this.enabled;
    }
    
    public void setEnabled(SegmentAttributeLLList enabled)
    {
	this.enabled = enabled;
    }
    
    public boolean hasEnabled()
    {
	return (enabled != null);
    }
    
    public void deleteEnabled()
    {
	enabled = null;
    }
    
    
    // Methods for field "data"
    public LaneDataAttributeList getData()
    {
	return this.data;
    }
    
    public void setData(LaneDataAttributeList data)
    {
	this.data = data;
    }
    
    public boolean hasData()
    {
	return (data != null);
    }
    
    public void deleteData()
    {
	data = null;
    }
    
    
    // Methods for field "dWidth"
    public Offset_B10 getDWidth()
    {
	return this.dWidth;
    }
    
    public void setDWidth(Offset_B10 dWidth)
    {
	this.dWidth = dWidth;
    }
    
    public boolean hasDWidth()
    {
	return (dWidth != null);
    }
    
    public void deleteDWidth()
    {
	dWidth = null;
    }
    
    
    // Methods for field "dElevation"
    public Offset_B10 getDElevation()
    {
	return this.dElevation;
    }
    
    public void setDElevation(Offset_B10 dElevation)
    {
	this.dElevation = dElevation;
    }
    
    public boolean hasDElevation()
    {
	return (dElevation != null);
    }
    
    public void deleteDElevation()
    {
	dElevation = null;
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return this.regional;
    }
    
    public void setRegional(Regional regional)
    {
	this.regional = regional;
    }
    
    public boolean hasRegional()
    {
	return (regional != null);
    }
    
    public void deleteRegional()
    {
	regional = null;
    }
    
    
    
    /**
     * Define the Regional ASN.1 type included in the DSRC ASN.1 module.
     * @see SequenceOf
     */
    public static class Regional extends SequenceOf<Regional.Sequence_> {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regional(Sequence_[] elements)
	{
	    super(elements);
	}
	
	
	/**
	 * Define the _seq36 ASN.1 type included in the DSRC ASN.1 module.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    public RegionId regionId;
	    public OpenType regExtValue;
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(RegionId regionId, OpenType regExtValue)
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
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Sequence_ data)
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
	    public static Sequence_ decodeValue(PerCoder coder, InputBitStream source, Sequence_ data)
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_NodeAttributeSetLL;
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
	    public Sequence_ decodeValue(JsonCoder coder, JsonReader source)
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_NodeAttributeSetLL;
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
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence that)
	    {
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence_ that) {
		if (!this.regionId.equalTo(that.regionId))
		    return false;
		if (!this.regExtValue.equalTo(that.regExtValue))
		    return false;
		return true;
	    }

	    /**
	     * Clone 'this' object.
	     */
	    public Sequence_ clone() {
		Sequence_ copy = (Sequence_)super.clone();
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
	} // End class definition for Sequence_

	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Regional data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 4)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 4, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    Sequence_ item1 = data.elements.get(idx0);

		    nbits += Sequence_.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE", idx0);
		    throw ee;
		}
		--total_len0; --fragmentLength0; ++idx0;
		if (fragmentLength0 == 0) {
		    if (moreFragments0) {
			nbits += coder.encodeLengthDeterminant(total_len0, sink);
			moreFragments0 = coder.moreFragments();
			fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		    }
		}
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
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 4);
	    if (fragmentLength0 > 4)
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<Sequence_>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    Sequence_ item1 = new Sequence_();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SEQUENCE", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 4)
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		    }
		}
	    }
	    if (total_len0 < 1)
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
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
	    int total_len0 = this.elements.size();
	    int idx0 = 0;

	    sink.beginArray();
	    if (total_len0 > 0) {
		while (true) {
		    try {
			Sequence_ item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
			
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE", idx0);
			throw ee;
		    }
		    idx0++;
		    if (idx0 == total_len0) break;
		    sink.writeSeparator();
		}
	    }
	    sink.endArray();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public Regional decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    int total_len0 = 0;
	    int idx0 = 0;

	    if (this.elements != null)
		this.elements.clear();
	    else
		this.elements = new java.util.ArrayList<Sequence_>(total_len0);
	    coder.decodeArray(source);
	    if (coder.hasMoreElements(source, true))
		do {
		    try {
			Sequence_ item1 = new Sequence_();

			this.elements.add(item1);
			item1.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext(null, "SEQUENCE", idx0);
			throw de;
		    }
		    ++idx0;
		} while (coder.hasMoreElements(source, false));
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
	    java.util.ArrayList<Sequence_> temp0 = this.elements;
	    int len0 = temp0 != null ? temp0.size() : 0;
	    int idx0 = 0;

	    try {
		writer.print('{');
		printer.indent();
		for (idx0 = 0; idx0 < len0; idx0++){
		    if (idx0 > 0)
			writer.print(',');
		    printer.newLine(writer);
		    temp0.get(idx0).printValue(printer, writer);
		}
		printer.undent();
		if (len0 > 0)
		    printer.newLine(writer);
		writer.print('}');
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(Regional that) {
	    int size = this.getSize();
	    if (size != that.getSize())
		return false;
	    for (int i = 0; i < size; i++) {
		if (!this.get(i).equalTo(that.get(i)))
		    return false;
	    }
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Regional clone() {
	    Regional copy = (Regional)super.clone();
	    copy.elements = new java.util.ArrayList<Sequence_>(elements.size());
	    for (Sequence_ element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 7;
	    hash = 79 * hash + (this.elements != null ? this.elements.hashCode() : 0);
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
	__localNode("localNode"),
	__disabled("disabled"),
	__enabled("enabled"),
	__data("data"),
	__dWidth("dWidth"),
	__dElevation("dElevation"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(8);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, NodeAttributeSetLL data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.localNode != null);
	sink.writeBit(data.disabled != null);
	sink.writeBit(data.enabled != null);
	sink.writeBit(data.data != null);
	sink.writeBit(data.dWidth != null);
	sink.writeBit(data.dElevation != null);
	sink.writeBit(data.regional != null);
	nbits += 8;
	if (data.localNode != null) {
	    // Encode field 'localNode'
	    try {
		NodeAttributeLLList item1 = data.localNode;

		nbits += NodeAttributeLLList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("localNode", "NodeAttributeLLList");
		throw ee;
	    }
	}
	if (data.disabled != null) {
	    // Encode field 'disabled'
	    try {
		SegmentAttributeLLList item1 = data.disabled;

		nbits += SegmentAttributeLLList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("disabled", "SegmentAttributeLLList");
		throw ee;
	    }
	}
	if (data.enabled != null) {
	    // Encode field 'enabled'
	    try {
		SegmentAttributeLLList item1 = data.enabled;

		nbits += SegmentAttributeLLList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("enabled", "SegmentAttributeLLList");
		throw ee;
	    }
	}
	if (data.data != null) {
	    // Encode field 'data'
	    try {
		LaneDataAttributeList item1 = data.data;

		nbits += LaneDataAttributeList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("data", "LaneDataAttributeList");
		throw ee;
	    }
	}
	if (data.dWidth != null) {
	    // Encode field 'dWidth'
	    try {
		Offset_B10 item1 = data.dWidth;
		long temp1 = item1.longValue();

		if (temp1 < -512 || temp1 > 511)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -512, 511, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dWidth", "Offset-B10");
		throw ee;
	    }
	}
	if (data.dElevation != null) {
	    // Encode field 'dElevation'
	    try {
		Offset_B10 item1 = data.dElevation;
		long temp1 = item1.longValue();

		if (temp1 < -512 || temp1 > 511)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -512, 511, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dElevation", "Offset-B10");
		throw ee;
	    }
	}
	if (data.regional != null) {
	    // Encode field 'regional'
	    try {
		Regional item1 = data.regional;

		nbits += Regional.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("regional", "SEQUENCE OF");
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
    public static NodeAttributeSetLL decodeValue(PerCoder coder, InputBitStream source, NodeAttributeSetLL data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_localNode0 = source.readBit();
	boolean has_disabled0 = source.readBit();
	boolean has_enabled0 = source.readBit();
	boolean has_data0 = source.readBit();
	boolean has_dWidth0 = source.readBit();
	boolean has_dElevation0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	if (has_localNode0) {
	    // Decode field 'localNode'
	    try {
		if (data.localNode == null)
		    data.localNode = new NodeAttributeLLList();
		data.localNode.decodeValue(coder, source, data.localNode);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("localNode", "NodeAttributeLLList");
		throw de;
	    }
	} else {
	    data.localNode = null;
	}
	if (has_disabled0) {
	    // Decode field 'disabled'
	    try {
		if (data.disabled == null)
		    data.disabled = new SegmentAttributeLLList();
		data.disabled.decodeValue(coder, source, data.disabled);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("disabled", "SegmentAttributeLLList");
		throw de;
	    }
	} else {
	    data.disabled = null;
	}
	if (has_enabled0) {
	    // Decode field 'enabled'
	    try {
		if (data.enabled == null)
		    data.enabled = new SegmentAttributeLLList();
		data.enabled.decodeValue(coder, source, data.enabled);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("enabled", "SegmentAttributeLLList");
		throw de;
	    }
	} else {
	    data.enabled = null;
	}
	if (has_data0) {
	    // Decode field 'data'
	    try {
		if (data.data == null)
		    data.data = new LaneDataAttributeList();
		data.data.decodeValue(coder, source, data.data);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("data", "LaneDataAttributeList");
		throw de;
	    }
	} else {
	    data.data = null;
	}
	if (has_dWidth0) {
	    // Decode field 'dWidth'
	    try {
		long temp1;

		if (data.dWidth == null)
		    data.dWidth = new Offset_B10();
		temp1 = coder.decodeConstrainedWholeNumber(source, -512, 511);
		if (temp1 > 511)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.dWidth.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dWidth", "Offset-B10");
		throw de;
	    }
	} else {
	    data.dWidth = null;
	}
	if (has_dElevation0) {
	    // Decode field 'dElevation'
	    try {
		long temp1;

		if (data.dElevation == null)
		    data.dElevation = new Offset_B10();
		temp1 = coder.decodeConstrainedWholeNumber(source, -512, 511);
		if (temp1 > 511)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.dElevation.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dElevation", "Offset-B10");
		throw de;
	    }
	} else {
	    data.dElevation = null;
	}
	if (has_regional0) {
	    // Decode field 'regional'
	    try {
		if (data.regional == null)
		    data.regional = new Regional();
		data.regional.decodeValue(coder, source, data.regional);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("regional", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.regional = null;
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
	// Encode field 'localNode'
	try {
	    NodeAttributeLLList item1 = this.localNode;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("localNode");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "localNode");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("localNode", "NodeAttributeLLList");
	    throw ee;
	}
	// Encode field 'disabled'
	try {
	    SegmentAttributeLLList item1 = this.disabled;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("disabled");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "disabled");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("disabled", "SegmentAttributeLLList");
	    throw ee;
	}
	// Encode field 'enabled'
	try {
	    SegmentAttributeLLList item1 = this.enabled;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("enabled");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "enabled");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("enabled", "SegmentAttributeLLList");
	    throw ee;
	}
	// Encode field 'data'
	try {
	    LaneDataAttributeList item1 = this.data;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("data");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "data");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("data", "LaneDataAttributeList");
	    throw ee;
	}
	// Encode field 'dWidth'
	try {
	    Offset_B10 item1 = this.dWidth;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("dWidth");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "dWidth");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dWidth", "Offset-B10");
	    throw ee;
	}
	// Encode field 'dElevation'
	try {
	    Offset_B10 item1 = this.dElevation;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("dElevation");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "dElevation");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dElevation", "Offset-B10");
	    throw ee;
	}
	// Encode field 'regional'
	try {
	    Regional item1 = this.regional;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("regional");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "regional");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("regional", "SEQUENCE OF");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public NodeAttributeSetLL decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __localNode:
		    // Decode field 'localNode'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.localNode == null)
				this.localNode = new NodeAttributeLLList();
			    this.localNode.decodeValue(coder, source);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("localNode", "NodeAttributeLLList");
			throw de;
		    }
		    break;
		    case __disabled:
		    // Decode field 'disabled'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.disabled == null)
				this.disabled = new SegmentAttributeLLList();
			    this.disabled.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("disabled", "SegmentAttributeLLList");
			throw de;
		    }
		    break;
		    case __enabled:
		    // Decode field 'enabled'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.enabled == null)
				this.enabled = new SegmentAttributeLLList();
			    this.enabled.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("enabled", "SegmentAttributeLLList");
			throw de;
		    }
		    break;
		    case __data:
		    // Decode field 'data'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.data == null)
				this.data = new LaneDataAttributeList();
			    this.data.decodeValue(coder, source);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("data", "LaneDataAttributeList");
			throw de;
		    }
		    break;
		    case __dWidth:
		    // Decode field 'dWidth'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.dWidth == null)
				this.dWidth = new Offset_B10();
			    this.dWidth.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dWidth", "Offset-B10");
			throw de;
		    }
		    break;
		    case __dElevation:
		    // Decode field 'dElevation'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.dElevation == null)
				this.dElevation = new Offset_B10();
			    this.dElevation.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dElevation", "Offset-B10");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("regional", "SEQUENCE OF");
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
	    this.localNode = null;
	if (!present0[1])
	    this.disabled = null;
	if (!present0[2])
	    this.enabled = null;
	if (!present0[3])
	    this.data = null;
	if (!present0[4])
	    this.dWidth = null;
	if (!present0[5])
	    this.dElevation = null;
	if (!present0[6])
	    this.regional = null;
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
	if (this.localNode != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("localNode ");
		this.localNode.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.disabled != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("disabled ");
		this.disabled.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.enabled != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("enabled ");
		this.enabled.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.data != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("data ");
		this.data.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.dWidth != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("dWidth ");
		writer.print(this.dWidth.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.dElevation != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("dElevation ");
		writer.print(this.dElevation.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.regional != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("regional ");
		this.regional.printValue(printer, writer);
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
	return equalTo((NodeAttributeSetLL)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((NodeAttributeSetLL)that);
    }
    
    public boolean equalTo(NodeAttributeSetLL that) {
	if (this.localNode != null) {
	    if (that.localNode == null || !this.localNode.equalTo(that.localNode))
		return false;
	} else if (that.localNode != null)
	    return false;
	if (this.disabled != null) {
	    if (that.disabled == null || !this.disabled.equalTo(that.disabled))
		return false;
	} else if (that.disabled != null)
	    return false;
	if (this.enabled != null) {
	    if (that.enabled == null || !this.enabled.equalTo(that.enabled))
		return false;
	} else if (that.enabled != null)
	    return false;
	if (this.data != null) {
	    if (that.data == null || !this.data.equalTo(that.data))
		return false;
	} else if (that.data != null)
	    return false;
	if (this.dWidth != null) {
	    if (that.dWidth == null || !this.dWidth.equalTo(that.dWidth))
		return false;
	} else if (that.dWidth != null)
	    return false;
	if (this.dElevation != null) {
	    if (that.dElevation == null || !this.dElevation.equalTo(that.dElevation))
		return false;
	} else if (that.dElevation != null)
	    return false;
	if (this.regional != null) {
	    if (that.regional == null || !this.regional.equalTo(that.regional))
		return false;
	} else if (that.regional != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public NodeAttributeSetLL clone() {
	NodeAttributeSetLL copy = (NodeAttributeSetLL)super.clone();
	if (localNode != null) {
	    copy.localNode = localNode.clone();
	}
	if (disabled != null) {
	    copy.disabled = disabled.clone();
	}
	if (enabled != null) {
	    copy.enabled = enabled.clone();
	}
	if (data != null) {
	    copy.data = data.clone();
	}
	if (dWidth != null) {
	    copy.dWidth = dWidth.clone();
	}
	if (dElevation != null) {
	    copy.dElevation = dElevation.clone();
	}
	if (regional != null) {
	    copy.regional = regional.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.localNode != null ? this.localNode.hashCode() : 0);
	hash = 41 * hash + (this.disabled != null ? this.disabled.hashCode() : 0);
	hash = 41 * hash + (this.enabled != null ? this.enabled.hashCode() : 0);
	hash = 41 * hash + (this.data != null ? this.data.hashCode() : 0);
	hash = 41 * hash + (this.dWidth != null ? this.dWidth.hashCode() : 0);
	hash = 41 * hash + (this.dElevation != null ? this.dElevation.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
} // End class definition for NodeAttributeSetLL
