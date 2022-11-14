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
 * Define the ApproachOrLane ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class ApproachOrLane extends Choice {
    
    /**
     * The default constructor.
     */
    public ApproachOrLane()
    {
    }
    
    public static final  int  approach_chosen = 1;
    public static final  int  lane_chosen = 2;
    
    // Methods for field "approach"
    public static ApproachOrLane createApproachOrLaneWithApproach(long approach)
    {
	return createApproachOrLaneWithApproach(new ApproachID(approach));
    }
    
    public static ApproachOrLane createApproachOrLaneWithApproach(ApproachID approach)
    {
	ApproachOrLane __object = new ApproachOrLane();

	__object.setApproach(approach);
	return __object;
    }
    
    public boolean hasApproach()
    {
	return getChosenFlag() == approach_chosen;
    }
    
    public ApproachID getApproach()
    {
	if (hasApproach())
	    return (ApproachID)mChosenValue;
	else
	    return null;
    }
    
    public void setApproach(long approach)
    {
	setApproach(new ApproachID(approach));
    }
    
    public void setApproach(ApproachID approach)
    {
	setChosenValue(approach);
	setChosenFlag(approach_chosen);
    }
    
    
    // Methods for field "lane"
    public static ApproachOrLane createApproachOrLaneWithLane(long lane)
    {
	return createApproachOrLaneWithLane(new LaneID(lane));
    }
    
    public static ApproachOrLane createApproachOrLaneWithLane(LaneID lane)
    {
	ApproachOrLane __object = new ApproachOrLane();

	__object.setLane(lane);
	return __object;
    }
    
    public boolean hasLane()
    {
	return getChosenFlag() == lane_chosen;
    }
    
    public LaneID getLane()
    {
	if (hasLane())
	    return (LaneID)mChosenValue;
	else
	    return null;
    }
    
    public void setLane(long lane)
    {
	setLane(new LaneID(lane));
    }
    
    public void setLane(LaneID lane)
    {
	setChosenValue(lane);
	setChosenFlag(lane_chosen);
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__approach("approach"),
	__lane("lane"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ApproachOrLane data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1 || idx0 > 2)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	switch (idx0) {
	    case approach_chosen:
		// Encode alternative 'approach'
		try {
		    ApproachID item1 = (ApproachID)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 15)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("approach", "ApproachID", 0);
		    throw ee;
		}
		break;
	    case lane_chosen:
		// Encode alternative 'lane'
		try {
		    LaneID item1 = (LaneID)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 255)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("lane", "LaneID", 0);
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
    public static ApproachOrLane decodeValue(PerCoder coder, InputBitStream source, ApproachOrLane data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;

	idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	if (idx0 < 1 || idx0 > 2)
	    throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	data.mChosenFlag = idx0;
	switch (idx0) {
	    case approach_chosen:
		// Decode alternative 'approach'
		try {
		    ApproachID item1 = new ApproachID();
		    long temp1;

		    // Decode alternative 'approach'
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		    if (temp1 > 15)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("approach", "ApproachID", 0);
		    throw de;
		}
		break;
	    case lane_chosen:
		// Decode alternative 'lane'
		try {
		    LaneID item1 = new LaneID();
		    long temp1;

		    // Decode alternative 'lane'
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		    if (temp1 > 255)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("lane", "LaneID", 0);
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
	case approach_chosen:
	    // Encode alternative 'approach'
	    try {
		ApproachID item1 = (ApproachID)this.mChosenValue;

		sink.encodeKey("approach");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("approach", "ApproachID", 0);
		throw ee;
	    }
	    break;
	case lane_chosen:
	    // Encode alternative 'lane'
	    try {
		LaneID item1 = (LaneID)this.mChosenValue;

		sink.encodeKey("lane");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("lane", "LaneID", 0);
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
    public ApproachOrLane decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __approach:
		// Decode alternative 'approach'
		try {
		    ApproachID item1 = new ApproachID();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = approach_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("approach", "ApproachID", 0);
		    throw de;
		}
		break;
	    case __lane:
		// Decode alternative 'lane'
		try {
		    LaneID item1 = new LaneID();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = lane_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("lane", "LaneID", 0);
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
	case approach_chosen:
	    try {
		writer.print("approach : ");
		writer.print(((ApproachID)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case lane_chosen:
	    try {
		writer.print("lane : ");
		writer.print(((LaneID)this.mChosenValue).longValue());
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
    public ApproachOrLane clone() {
	return (ApproachOrLane)super.clone();
    }

} // End class definition for ApproachOrLane
