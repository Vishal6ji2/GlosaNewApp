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
 * Define the ConnectingLane ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class ConnectingLane extends Sequence {
    public LaneID lane;
    public AllowedManeuvers maneuver;
    
    /**
     * The default constructor.
     */
    public ConnectingLane()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConnectingLane(LaneID lane, AllowedManeuvers maneuver)
    {
	setLane(lane);
	setManeuver(maneuver);
    }
    
    /**
     * Construct with required components.
     */
    public ConnectingLane(LaneID lane)
    {
	setLane(lane);
    }
    
    
    // Methods for field "lane"
    public LaneID getLane()
    {
	return this.lane;
    }
    
    public void setLane(LaneID lane)
    {
	this.lane = lane;
    }
    
    
    // Methods for field "maneuver"
    public AllowedManeuvers getManeuver()
    {
	return this.maneuver;
    }
    
    public void setManeuver(AllowedManeuvers maneuver)
    {
	this.maneuver = maneuver;
    }
    
    public boolean hasManeuver()
    {
	return (maneuver != null);
    }
    
    public void deleteManeuver()
    {
	maneuver = null;
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_maneuver = 
	AllowedManeuvers._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__lane("lane"),
	__maneuver("maneuver"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ConnectingLane data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.maneuver != null);
	++nbits;
	// Encode field 'lane'
	try {
	    LaneID item1 = data.lane;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lane", "LaneID");
	    throw ee;
	}
	if (data.maneuver != null) {
	    // Encode field 'maneuver'
	    try {
		AllowedManeuvers item1 = data.maneuver;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, ConnectingLane._cBounds_maneuver);
		if (total_len1 != 12)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 12, 12, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("maneuver", "AllowedManeuvers");
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
    public static ConnectingLane decodeValue(PerCoder coder, InputBitStream source, ConnectingLane data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_maneuver0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'lane'
	try {
	    long temp1;

	    if (data.lane == null)
		data.lane = new LaneID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.lane.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lane", "LaneID");
	    throw de;
	}
	if (has_maneuver0) {
	    // Decode field 'maneuver'
	    try {
		if (data.maneuver == null)
		    data.maneuver = new AllowedManeuvers();
		com.oss.coders.per.PerBitstring.decode(coder, source, 12, 12, data.maneuver);
		if (coder.isStrictCodingEnabled() && data.maneuver.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.maneuver, ConnectingLane._cBounds_maneuver))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("maneuver", "AllowedManeuvers");
		throw de;
	    }
	} else {
	    data.maneuver = null;
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
	// Encode field 'lane'
	try {
	    LaneID item1 = this.lane;

	    {
		sink.encodeKey("lane");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lane", "LaneID");
	    throw ee;
	}
	// Encode field 'maneuver'
	try {
	    AllowedManeuvers item1 = this.maneuver;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("maneuver");
		    coder.encodeBitStringWithNamedBits(temp1, len1, 12, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "maneuver");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("maneuver", "AllowedManeuvers");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ConnectingLane decodeValue(JsonCoder coder, JsonReader source)
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
		    case __lane:
		    // Decode field 'lane'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.lane == null)
			    this.lane = new LaneID();
			this.lane.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lane", "LaneID");
			throw de;
		    }
		    break;
		    case __maneuver:
		    // Decode field 'maneuver'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.maneuver == null)
				this.maneuver = new AllowedManeuvers();
			    coder.decodeBitString(12, source, this.maneuver);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("maneuver", "AllowedManeuvers");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'lane'");
	if (!present0[1])
	    this.maneuver = null;
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
	    writer.print("lane ");
	    writer.print(this.lane.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.maneuver != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("maneuver ");
		printer.print(this.maneuver, writer);
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
	return equalTo((ConnectingLane)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ConnectingLane)that);
    }
    
    public boolean equalTo(ConnectingLane that) {
	if (!this.lane.equalTo(that.lane))
	    return false;
	if (this.maneuver != null) {
	    if (that.maneuver == null || !this.maneuver.equalTo(that.maneuver))
		return false;
	} else if (that.maneuver != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ConnectingLane clone() {
	ConnectingLane copy = (ConnectingLane)super.clone();
	copy.lane = lane.clone();
	if (maneuver != null) {
	    copy.maneuver = maneuver.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.lane != null ? this.lane.hashCode() : 0);
	hash = 41 * hash + (this.maneuver != null ? this.maneuver.hashCode() : 0);
	return hash;
    }
} // End class definition for ConnectingLane
