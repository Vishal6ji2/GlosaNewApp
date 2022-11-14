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
 * Define the GenericLane ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class GenericLane extends Sequence {
    public LaneID laneID;
    public DescriptiveName name;
    public ApproachID ingressApproach;
    public ApproachID egressApproach;
    public LaneAttributes laneAttributes;
    public AllowedManeuvers maneuvers;
    public NodeListXY nodeList;
    public ConnectsToList connectsTo;
    public OverlayLaneList overlays;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public GenericLane()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GenericLane(LaneID laneID, DescriptiveName name, 
		    ApproachID ingressApproach, ApproachID egressApproach, 
		    LaneAttributes laneAttributes, AllowedManeuvers maneuvers, 
		    NodeListXY nodeList, ConnectsToList connectsTo, 
		    OverlayLaneList overlays, Regional regional)
    {
	setLaneID(laneID);
	setName(name);
	setIngressApproach(ingressApproach);
	setEgressApproach(egressApproach);
	setLaneAttributes(laneAttributes);
	setManeuvers(maneuvers);
	setNodeList(nodeList);
	setConnectsTo(connectsTo);
	setOverlays(overlays);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public GenericLane(LaneID laneID, LaneAttributes laneAttributes, 
		    NodeListXY nodeList)
    {
	setLaneID(laneID);
	setLaneAttributes(laneAttributes);
	setNodeList(nodeList);
    }
    
    
    // Methods for field "laneID"
    public LaneID getLaneID()
    {
	return this.laneID;
    }
    
    public void setLaneID(LaneID laneID)
    {
	this.laneID = laneID;
    }
    
    
    // Methods for field "name"
    public DescriptiveName getName()
    {
	return this.name;
    }
    
    public void setName(DescriptiveName name)
    {
	this.name = name;
    }
    
    public boolean hasName()
    {
	return (name != null);
    }
    
    public void deleteName()
    {
	name = null;
    }
    
    
    // Methods for field "ingressApproach"
    public ApproachID getIngressApproach()
    {
	return this.ingressApproach;
    }
    
    public void setIngressApproach(ApproachID ingressApproach)
    {
	this.ingressApproach = ingressApproach;
    }
    
    public boolean hasIngressApproach()
    {
	return (ingressApproach != null);
    }
    
    public void deleteIngressApproach()
    {
	ingressApproach = null;
    }
    
    
    // Methods for field "egressApproach"
    public ApproachID getEgressApproach()
    {
	return this.egressApproach;
    }
    
    public void setEgressApproach(ApproachID egressApproach)
    {
	this.egressApproach = egressApproach;
    }
    
    public boolean hasEgressApproach()
    {
	return (egressApproach != null);
    }
    
    public void deleteEgressApproach()
    {
	egressApproach = null;
    }
    
    
    // Methods for field "laneAttributes"
    public LaneAttributes getLaneAttributes()
    {
	return this.laneAttributes;
    }
    
    public void setLaneAttributes(LaneAttributes laneAttributes)
    {
	this.laneAttributes = laneAttributes;
    }
    
    
    // Methods for field "maneuvers"
    public AllowedManeuvers getManeuvers()
    {
	return this.maneuvers;
    }
    
    public void setManeuvers(AllowedManeuvers maneuvers)
    {
	this.maneuvers = maneuvers;
    }
    
    public boolean hasManeuvers()
    {
	return (maneuvers != null);
    }
    
    public void deleteManeuvers()
    {
	maneuvers = null;
    }
    
    
    // Methods for field "nodeList"
    public NodeListXY getNodeList()
    {
	return this.nodeList;
    }
    
    public void setNodeList(NodeListXY nodeList)
    {
	this.nodeList = nodeList;
    }
    
    
    // Methods for field "connectsTo"
    public ConnectsToList getConnectsTo()
    {
	return this.connectsTo;
    }
    
    public void setConnectsTo(ConnectsToList connectsTo)
    {
	this.connectsTo = connectsTo;
    }
    
    public boolean hasConnectsTo()
    {
	return (connectsTo != null);
    }
    
    public void deleteConnectsTo()
    {
	connectsTo = null;
    }
    
    
    // Methods for field "overlays"
    public OverlayLaneList getOverlays()
    {
	return this.overlays;
    }
    
    public void setOverlays(OverlayLaneList overlays)
    {
	this.overlays = overlays;
    }
    
    public boolean hasOverlays()
    {
	return (overlays != null);
    }
    
    public void deleteOverlays()
    {
	overlays = null;
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
	 * Define the _seq24 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_GenericLane;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_GenericLane;
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
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final EPAInfo _cEPAInfo_name = 
	DescriptiveName._cEPAInfo_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_maneuvers = 
	AllowedManeuvers._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__laneID("laneID"),
	__name("name"),
	__ingressApproach("ingressApproach"),
	__egressApproach("egressApproach"),
	__laneAttributes("laneAttributes"),
	__maneuvers("maneuvers"),
	__nodeList("nodeList"),
	__connectsTo("connectsTo"),
	__overlays("overlays"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(11);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, GenericLane data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.name != null);
	sink.writeBit(data.ingressApproach != null);
	sink.writeBit(data.egressApproach != null);
	sink.writeBit(data.maneuvers != null);
	sink.writeBit(data.connectsTo != null);
	sink.writeBit(data.overlays != null);
	sink.writeBit(data.regional != null);
	nbits += 8;
	// Encode field 'laneID'
	try {
	    LaneID item1 = data.laneID;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneID", "LaneID");
	    throw ee;
	}
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, GenericLane._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	if (data.ingressApproach != null) {
	    // Encode field 'ingressApproach'
	    try {
		ApproachID item1 = data.ingressApproach;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 15)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("ingressApproach", "ApproachID");
		throw ee;
	    }
	}
	if (data.egressApproach != null) {
	    // Encode field 'egressApproach'
	    try {
		ApproachID item1 = data.egressApproach;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 15)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("egressApproach", "ApproachID");
		throw ee;
	    }
	}
	// Encode field 'laneAttributes'
	try {
	    LaneAttributes item1 = data.laneAttributes;

	    nbits += LaneAttributes.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneAttributes", "LaneAttributes");
	    throw ee;
	}
	if (data.maneuvers != null) {
	    // Encode field 'maneuvers'
	    try {
		AllowedManeuvers item1 = data.maneuvers;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, GenericLane._cBounds_maneuvers);
		if (total_len1 != 12)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 12, 12, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("maneuvers", "AllowedManeuvers");
		throw ee;
	    }
	}
	// Encode field 'nodeList'
	try {
	    NodeListXY item1 = data.nodeList;

	    nbits += NodeListXY.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeListXY");
	    throw ee;
	}
	if (data.connectsTo != null) {
	    // Encode field 'connectsTo'
	    try {
		ConnectsToList item1 = data.connectsTo;

		nbits += ConnectsToList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("connectsTo", "ConnectsToList");
		throw ee;
	    }
	}
	if (data.overlays != null) {
	    // Encode field 'overlays'
	    try {
		OverlayLaneList item1 = data.overlays;

		nbits += OverlayLaneList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("overlays", "OverlayLaneList");
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
    public static GenericLane decodeValue(PerCoder coder, InputBitStream source, GenericLane data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_ingressApproach0 = source.readBit();
	boolean has_egressApproach0 = source.readBit();
	boolean has_maneuvers0 = source.readBit();
	boolean has_connectsTo0 = source.readBit();
	boolean has_overlays0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'laneID'
	try {
	    long temp1;

	    if (data.laneID == null)
		data.laneID = new LaneID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.laneID.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("laneID", "LaneID");
	    throw de;
	}
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, GenericLane._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	if (has_ingressApproach0) {
	    // Decode field 'ingressApproach'
	    try {
		long temp1;

		if (data.ingressApproach == null)
		    data.ingressApproach = new ApproachID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (temp1 > 15)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.ingressApproach.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("ingressApproach", "ApproachID");
		throw de;
	    }
	} else {
	    data.ingressApproach = null;
	}
	if (has_egressApproach0) {
	    // Decode field 'egressApproach'
	    try {
		long temp1;

		if (data.egressApproach == null)
		    data.egressApproach = new ApproachID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (temp1 > 15)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.egressApproach.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("egressApproach", "ApproachID");
		throw de;
	    }
	} else {
	    data.egressApproach = null;
	}
	// Decode field 'laneAttributes'
	try {
	    if (data.laneAttributes == null)
		data.laneAttributes = new LaneAttributes();
	    data.laneAttributes.decodeValue(coder, source, data.laneAttributes);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("laneAttributes", "LaneAttributes");
	    throw de;
	}
	if (has_maneuvers0) {
	    // Decode field 'maneuvers'
	    try {
		if (data.maneuvers == null)
		    data.maneuvers = new AllowedManeuvers();
		com.oss.coders.per.PerBitstring.decode(coder, source, 12, 12, data.maneuvers);
		if (coder.isStrictCodingEnabled() && data.maneuvers.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.maneuvers, GenericLane._cBounds_maneuvers))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("maneuvers", "AllowedManeuvers");
		throw de;
	    }
	} else {
	    data.maneuvers = null;
	}
	// Decode field 'nodeList'
	try {
	    if (data.nodeList == null)
		data.nodeList = new NodeListXY();
	    data.nodeList.decodeValue(coder, source, data.nodeList);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("nodeList", "NodeListXY");
	    throw de;
	}
	if (has_connectsTo0) {
	    // Decode field 'connectsTo'
	    try {
		if (data.connectsTo == null)
		    data.connectsTo = new ConnectsToList();
		data.connectsTo.decodeValue(coder, source, data.connectsTo);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("connectsTo", "ConnectsToList");
		throw de;
	    }
	} else {
	    data.connectsTo = null;
	}
	if (has_overlays0) {
	    // Decode field 'overlays'
	    try {
		if (data.overlays == null)
		    data.overlays = new OverlayLaneList();
		data.overlays.decodeValue(coder, source, data.overlays);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("overlays", "OverlayLaneList");
		throw de;
	    }
	} else {
	    data.overlays = null;
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
	sink.beginObject();
	// Encode field 'laneID'
	try {
	    LaneID item1 = this.laneID;

	    {
		sink.encodeKey("laneID");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneID", "LaneID");
	    throw ee;
	}
	// Encode field 'name'
	try {
	    DescriptiveName item1 = this.name;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("name");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "name");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("name", "DescriptiveName");
	    throw ee;
	}
	// Encode field 'ingressApproach'
	try {
	    ApproachID item1 = this.ingressApproach;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("ingressApproach");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "ingressApproach");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("ingressApproach", "ApproachID");
	    throw ee;
	}
	// Encode field 'egressApproach'
	try {
	    ApproachID item1 = this.egressApproach;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("egressApproach");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "egressApproach");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("egressApproach", "ApproachID");
	    throw ee;
	}
	// Encode field 'laneAttributes'
	try {
	    LaneAttributes item1 = this.laneAttributes;

	    {
		sink.writeSeparator();
		sink.encodeKey("laneAttributes");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneAttributes", "LaneAttributes");
	    throw ee;
	}
	// Encode field 'maneuvers'
	try {
	    AllowedManeuvers item1 = this.maneuvers;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("maneuvers");
		    coder.encodeBitStringWithNamedBits(temp1, len1, 12, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "maneuvers");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("maneuvers", "AllowedManeuvers");
	    throw ee;
	}
	// Encode field 'nodeList'
	try {
	    NodeListXY item1 = this.nodeList;

	    {
		sink.writeSeparator();
		sink.encodeKey("nodeList");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeListXY");
	    throw ee;
	}
	// Encode field 'connectsTo'
	try {
	    ConnectsToList item1 = this.connectsTo;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("connectsTo");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "connectsTo");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectsTo", "ConnectsToList");
	    throw ee;
	}
	// Encode field 'overlays'
	try {
	    OverlayLaneList item1 = this.overlays;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("overlays");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "overlays");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("overlays", "OverlayLaneList");
	    throw ee;
	}
	// Encode field 'regional'
	try {
	    Regional item1 = this.regional;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("regional");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
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
    public GenericLane decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[11];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __laneID:
		    // Decode field 'laneID'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.laneID == null)
			    this.laneID = new LaneID();
			this.laneID.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneID", "LaneID");
			throw de;
		    }
		    break;
		    case __name:
		    // Decode field 'name'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.name = new DescriptiveName(coder.decodeString(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("name", "DescriptiveName");
			throw de;
		    }
		    break;
		    case __ingressApproach:
		    // Decode field 'ingressApproach'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.ingressApproach == null)
				this.ingressApproach = new ApproachID();
			    this.ingressApproach.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("ingressApproach", "ApproachID");
			throw de;
		    }
		    break;
		    case __egressApproach:
		    // Decode field 'egressApproach'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.egressApproach == null)
				this.egressApproach = new ApproachID();
			    this.egressApproach.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("egressApproach", "ApproachID");
			throw de;
		    }
		    break;
		    case __laneAttributes:
		    // Decode field 'laneAttributes'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.laneAttributes == null)
			    this.laneAttributes = new LaneAttributes();
			this.laneAttributes.decodeValue(coder, source);
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneAttributes", "LaneAttributes");
			throw de;
		    }
		    break;
		    case __maneuvers:
		    // Decode field 'maneuvers'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.maneuvers == null)
				this.maneuvers = new AllowedManeuvers();
			    coder.decodeBitString(12, source, this.maneuvers);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("maneuvers", "AllowedManeuvers");
			throw de;
		    }
		    break;
		    case __nodeList:
		    // Decode field 'nodeList'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.nodeList == null)
			    this.nodeList = new NodeListXY();
			this.nodeList.decodeValue(coder, source);
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("nodeList", "NodeListXY");
			throw de;
		    }
		    break;
		    case __connectsTo:
		    // Decode field 'connectsTo'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.connectsTo == null)
				this.connectsTo = new ConnectsToList();
			    this.connectsTo.decodeValue(coder, source);
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("connectsTo", "ConnectsToList");
			throw de;
		    }
		    break;
		    case __overlays:
		    // Decode field 'overlays'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.overlays == null)
				this.overlays = new OverlayLaneList();
			    this.overlays.decodeValue(coder, source);
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("overlays", "OverlayLaneList");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[9] = true;
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'laneID'");
	if (!present0[1])
	    this.name = null;
	if (!present0[2])
	    this.ingressApproach = null;
	if (!present0[3])
	    this.egressApproach = null;
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'laneAttributes'");
	if (!present0[5])
	    this.maneuvers = null;
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'nodeList'");
	if (!present0[7])
	    this.connectsTo = null;
	if (!present0[8])
	    this.overlays = null;
	if (!present0[9])
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
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("laneID ");
	    writer.print(this.laneID.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.name != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("name ");
		printer.print(this.name, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.ingressApproach != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("ingressApproach ");
		writer.print(this.ingressApproach.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.egressApproach != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("egressApproach ");
		writer.print(this.egressApproach.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("laneAttributes ");
	    this.laneAttributes.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.maneuvers != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("maneuvers ");
		printer.print(this.maneuvers, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("nodeList ");
	    this.nodeList.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.connectsTo != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("connectsTo ");
		this.connectsTo.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.overlays != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("overlays ");
		this.overlays.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.regional != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("regional ");
		this.regional.printValue(printer, writer);
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
	return equalTo((GenericLane)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((GenericLane)that);
    }
    
    public boolean equalTo(GenericLane that) {
	if (!this.laneID.equalTo(that.laneID))
	    return false;
	if (this.name != null) {
	    if (that.name == null || !this.name.equalTo(that.name))
		return false;
	} else if (that.name != null)
	    return false;
	if (this.ingressApproach != null) {
	    if (that.ingressApproach == null || !this.ingressApproach.equalTo(that.ingressApproach))
		return false;
	} else if (that.ingressApproach != null)
	    return false;
	if (this.egressApproach != null) {
	    if (that.egressApproach == null || !this.egressApproach.equalTo(that.egressApproach))
		return false;
	} else if (that.egressApproach != null)
	    return false;
	if (!this.laneAttributes.equalTo(that.laneAttributes))
	    return false;
	if (this.maneuvers != null) {
	    if (that.maneuvers == null || !this.maneuvers.equalTo(that.maneuvers))
		return false;
	} else if (that.maneuvers != null)
	    return false;
	if (!this.nodeList.equalTo(that.nodeList))
	    return false;
	if (this.connectsTo != null) {
	    if (that.connectsTo == null || !this.connectsTo.equalTo(that.connectsTo))
		return false;
	} else if (that.connectsTo != null)
	    return false;
	if (this.overlays != null) {
	    if (that.overlays == null || !this.overlays.equalTo(that.overlays))
		return false;
	} else if (that.overlays != null)
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
    public GenericLane clone() {
	GenericLane copy = (GenericLane)super.clone();
	copy.laneID = laneID.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	if (ingressApproach != null) {
	    copy.ingressApproach = ingressApproach.clone();
	}
	if (egressApproach != null) {
	    copy.egressApproach = egressApproach.clone();
	}
	copy.laneAttributes = laneAttributes.clone();
	if (maneuvers != null) {
	    copy.maneuvers = maneuvers.clone();
	}
	copy.nodeList = nodeList.clone();
	if (connectsTo != null) {
	    copy.connectsTo = connectsTo.clone();
	}
	if (overlays != null) {
	    copy.overlays = overlays.clone();
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
	hash = 41 * hash + (this.laneID != null ? this.laneID.hashCode() : 0);
	hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
	hash = 41 * hash + (this.ingressApproach != null ? this.ingressApproach.hashCode() : 0);
	hash = 41 * hash + (this.egressApproach != null ? this.egressApproach.hashCode() : 0);
	hash = 41 * hash + (this.laneAttributes != null ? this.laneAttributes.hashCode() : 0);
	hash = 41 * hash + (this.maneuvers != null ? this.maneuvers.hashCode() : 0);
	hash = 41 * hash + (this.nodeList != null ? this.nodeList.hashCode() : 0);
	hash = 41 * hash + (this.connectsTo != null ? this.connectsTo.hashCode() : 0);
	hash = 41 * hash + (this.overlays != null ? this.overlays.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
} // End class definition for GenericLane
