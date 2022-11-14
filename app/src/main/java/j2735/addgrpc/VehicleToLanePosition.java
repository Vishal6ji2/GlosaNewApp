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


package j2735.addgrpc;

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
 * Define the VehicleToLanePosition ASN.1 type included in the AddGrpC ASN.1 module.
 * @see Sequence
 */

public class VehicleToLanePosition extends Sequence {
    public j2735.dsrc.StationID stationID;
    public j2735.dsrc.LaneID laneID;
    
    /**
     * The default constructor.
     */
    public VehicleToLanePosition()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleToLanePosition(j2735.dsrc.StationID stationID, 
		    j2735.dsrc.LaneID laneID)
    {
	setStationID(stationID);
	setLaneID(laneID);
    }
    
    
    // Methods for field "stationID"
    public j2735.dsrc.StationID getStationID()
    {
	return this.stationID;
    }
    
    public void setStationID(j2735.dsrc.StationID stationID)
    {
	this.stationID = stationID;
    }
    
    
    // Methods for field "laneID"
    public j2735.dsrc.LaneID getLaneID()
    {
	return this.laneID;
    }
    
    public void setLaneID(j2735.dsrc.LaneID laneID)
    {
	this.laneID = laneID;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__stationID("stationID"),
	__laneID("laneID"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleToLanePosition data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'stationID'
	try {
	    j2735.dsrc.StationID item1 = data.stationID;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 4294967295L)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 4294967295L, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("stationID", "StationID");
	    throw ee;
	}
	// Encode field 'laneID'
	try {
	    j2735.dsrc.LaneID item1 = data.laneID;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneID", "LaneID");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static VehicleToLanePosition decodeValue(PerCoder coder, InputBitStream source, VehicleToLanePosition data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'stationID'
	try {
	    long temp1;

	    if (data.stationID == null)
		data.stationID = new j2735.dsrc.StationID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 4294967295L);
	    if (temp1 > 4294967295L)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.stationID.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("stationID", "StationID");
	    throw de;
	}
	// Decode field 'laneID'
	try {
	    long temp1;

	    if (data.laneID == null)
		data.laneID = new j2735.dsrc.LaneID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.laneID.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("laneID", "LaneID");
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
	// Encode field 'stationID'
	try {
	    j2735.dsrc.StationID item1 = this.stationID;

	    {
		sink.encodeKey("stationID");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("stationID", "StationID");
	    throw ee;
	}
	// Encode field 'laneID'
	try {
	    j2735.dsrc.LaneID item1 = this.laneID;

	    {
		sink.writeSeparator();
		sink.encodeKey("laneID");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneID", "LaneID");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleToLanePosition decodeValue(JsonCoder coder, JsonReader source)
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
		    case __stationID:
		    // Decode field 'stationID'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.stationID == null)
			    this.stationID = new j2735.dsrc.StationID();
			this.stationID.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("stationID", "StationID");
			throw de;
		    }
		    break;
		    case __laneID:
		    // Decode field 'laneID'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.laneID == null)
			    this.laneID = new j2735.dsrc.LaneID();
			this.laneID.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneID", "LaneID");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'stationID'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'laneID'");
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
	    writer.print("stationID ");
	    writer.print(this.stationID.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("laneID ");
	    writer.print(this.laneID.longValue());
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
	return equalTo((VehicleToLanePosition)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleToLanePosition)that);
    }
    
    public boolean equalTo(VehicleToLanePosition that) {
	if (!this.stationID.equalTo(that.stationID))
	    return false;
	if (!this.laneID.equalTo(that.laneID))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleToLanePosition clone() {
	VehicleToLanePosition copy = (VehicleToLanePosition)super.clone();
	copy.stationID = stationID.clone();
	copy.laneID = laneID.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.stationID != null ? this.stationID.hashCode() : 0);
	hash = 41 * hash + (this.laneID != null ? this.laneID.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleToLanePosition
