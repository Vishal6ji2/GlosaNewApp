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
 * Define the RegulatorySpeedLimit ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RegulatorySpeedLimit extends Sequence {
    public SpeedLimitType type;
    public Velocity speed;
    
    /**
     * The default constructor.
     */
    public RegulatorySpeedLimit()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RegulatorySpeedLimit(SpeedLimitType type, Velocity speed)
    {
	setType(type);
	setSpeed(speed);
    }
    
    
    // Methods for field "type"
    public SpeedLimitType getType()
    {
	return this.type;
    }
    
    public void setType(SpeedLimitType type)
    {
	this.type = type;
    }
    
    
    // Methods for field "speed"
    public Velocity getSpeed()
    {
	return this.speed;
    }
    
    public void setSpeed(Velocity speed)
    {
	this.speed = speed;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__type("type"),
	__speed("speed"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RegulatorySpeedLimit data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'type'
	try {
	    SpeedLimitType item1 = data.type;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 13;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 12, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 13, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("type", "SpeedLimitType");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    Velocity item1 = data.speed;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 8191)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 8191, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "Velocity");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static RegulatorySpeedLimit decodeValue(PerCoder coder, InputBitStream source, RegulatorySpeedLimit data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'type'
	try {
	    int idx1;
	    SpeedLimitType temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 12);
		if (idx1 < 0 || idx1 > 12)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SpeedLimitType.valueAt(idx1);
	    } else {
		idx1 = 13 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = SpeedLimitType.unknownEnumerator();
	    }
	    data.type = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("type", "SpeedLimitType");
	    throw de;
	}
	// Decode field 'speed'
	try {
	    long temp1;

	    if (data.speed == null)
		data.speed = new Velocity();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 8191);
	    if (temp1 > 8191)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.speed.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("speed", "Velocity");
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
	// Encode field 'type'
	try {
	    SpeedLimitType item1 = this.type;

	    {
		sink.encodeKey("type");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("type", "SpeedLimitType");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    Velocity item1 = this.speed;

	    {
		sink.writeSeparator();
		sink.encodeKey("speed");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "Velocity");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RegulatorySpeedLimit decodeValue(JsonCoder coder, JsonReader source)
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
		    case __type:
		    // Decode field 'type'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			SpeedLimitType temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(SpeedLimitType.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = SpeedLimitType.unknownEnumerator();
			else
			    temp1 = SpeedLimitType.cNamedNumbers[idx1];
			this.type = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("type", "SpeedLimitType");
			throw de;
		    }
		    break;
		    case __speed:
		    // Decode field 'speed'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.speed == null)
			    this.speed = new Velocity();
			this.speed.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed", "Velocity");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'type'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'speed'");
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
	    writer.print("type ");
	    printer.print(this.type, writer, this.type.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("speed ");
	    writer.print(this.speed.longValue());
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
	return equalTo((RegulatorySpeedLimit)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RegulatorySpeedLimit)that);
    }
    
    public boolean equalTo(RegulatorySpeedLimit that) {
	if (!this.type.equalTo(that.type))
	    return false;
	if (!this.speed.equalTo(that.speed))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RegulatorySpeedLimit clone() {
	RegulatorySpeedLimit copy = (RegulatorySpeedLimit)super.clone();
	copy.type = type.clone();
	copy.speed = speed.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.type != null ? this.type.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	return hash;
    }
} // End class definition for RegulatorySpeedLimit
