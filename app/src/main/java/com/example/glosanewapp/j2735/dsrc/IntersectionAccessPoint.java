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
 * Define the IntersectionAccessPoint ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class IntersectionAccessPoint extends Choice {
    
    /**
     * The default constructor.
     */
    public IntersectionAccessPoint()
    {
    }
    
    public static final  int  lane_chosen = 1;
    public static final  int  approach_chosen = 2;
    public static final  int  connection_chosen = 3;
    
    // Methods for field "lane"
    public static IntersectionAccessPoint createIntersectionAccessPointWithLane(long lane)
    {
	return createIntersectionAccessPointWithLane(new LaneID(lane));
    }
    
    public static IntersectionAccessPoint createIntersectionAccessPointWithLane(LaneID lane)
    {
	IntersectionAccessPoint __object = new IntersectionAccessPoint();

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
    
    
    // Methods for field "approach"
    public static IntersectionAccessPoint createIntersectionAccessPointWithApproach(long approach)
    {
	return createIntersectionAccessPointWithApproach(new ApproachID(approach));
    }
    
    public static IntersectionAccessPoint createIntersectionAccessPointWithApproach(ApproachID approach)
    {
	IntersectionAccessPoint __object = new IntersectionAccessPoint();

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
    
    
    // Methods for field "connection"
    public static IntersectionAccessPoint createIntersectionAccessPointWithConnection(long connection)
    {
	return createIntersectionAccessPointWithConnection(new LaneConnectionID(connection));
    }
    
    public static IntersectionAccessPoint createIntersectionAccessPointWithConnection(LaneConnectionID connection)
    {
	IntersectionAccessPoint __object = new IntersectionAccessPoint();

	__object.setConnection(connection);
	return __object;
    }
    
    public boolean hasConnection()
    {
	return getChosenFlag() == connection_chosen;
    }
    
    public LaneConnectionID getConnection()
    {
	if (hasConnection())
	    return (LaneConnectionID)mChosenValue;
	else
	    return null;
    }
    
    public void setConnection(long connection)
    {
	setConnection(new LaneConnectionID(connection));
    }
    
    public void setConnection(LaneConnectionID connection)
    {
	setChosenValue(connection);
	setChosenFlag(connection_chosen);
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__lane("lane"),
	__approach("approach"),
	__connection("connection"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IntersectionAccessPoint data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	else if (idx0 > 3) {
	    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	}
	sink.writeBit(false); ++nbits;
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 2, sink);
	switch (idx0) {
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
	    case connection_chosen:
		// Encode alternative 'connection'
		try {
		    LaneConnectionID item1 = (LaneConnectionID)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 255)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("connection", "LaneConnectionID", 0);
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
    public static IntersectionAccessPoint decodeValue(PerCoder coder, InputBitStream source, IntersectionAccessPoint data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;
	boolean extroot0 = !source.readBit();;

	if (extroot0) {
	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2) + 1;
	    if (idx0 < 1 || idx0 > 3)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
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
		case connection_chosen:
		    // Decode alternative 'connection'
		    try {
			LaneConnectionID item1 = new LaneConnectionID();
			long temp1;

			// Decode alternative 'connection'
			temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
			if (temp1 > 255)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("connection", "LaneConnectionID", 0);
			throw de;
		    }
		    break;
	    }
	} else {
	    idx0 = (int)coder.decodeNormallySmallNumber(source) + 4;
	    if (idx0 < 1)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    else {
		data.mChosenFlag = idx0;
		data.mChosenValue = null;
		try {
		    com.oss.coders.per.PerOctets.skip(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendExtensionContext(null, idx0 - 3);
		    throw de;
		}
	    }
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
	case connection_chosen:
	    // Encode alternative 'connection'
	    try {
		LaneConnectionID item1 = (LaneConnectionID)this.mChosenValue;

		sink.encodeKey("connection");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("connection", "LaneConnectionID", 0);
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
    public IntersectionAccessPoint decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
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
	    case __connection:
		// Decode alternative 'connection'
		try {
		    LaneConnectionID item1 = new LaneConnectionID();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = connection_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("connection", "LaneConnectionID", 0);
		    throw de;
		}
		break;
	    default:
		try {
		  {
 // coder.setUnknownExtensionFound();
}
		    coder.skipValue(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("unknownExtension", "unknown", 0);
		    throw de;
		}
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
	case lane_chosen:
	    try {
		writer.print("lane : ");
		writer.print(((LaneID)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case approach_chosen:
	    try {
		writer.print("approach : ");
		writer.print(((ApproachID)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case connection_chosen:
	    try {
		writer.print("connection : ");
		writer.print(((LaneConnectionID)this.mChosenValue).longValue());
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
    public IntersectionAccessPoint clone() {
	return (IntersectionAccessPoint)super.clone();
    }

} // End class definition for IntersectionAccessPoint
