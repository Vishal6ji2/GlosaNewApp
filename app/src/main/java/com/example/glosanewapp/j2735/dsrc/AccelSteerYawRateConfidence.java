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
 * Define the AccelSteerYawRateConfidence ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class AccelSteerYawRateConfidence extends Sequence {
    public YawRateConfidence yawRate;
    public AccelerationConfidence acceleration;
    public SteeringWheelAngleConfidence steeringWheelAngle;
    
    /**
     * The default constructor.
     */
    public AccelSteerYawRateConfidence()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AccelSteerYawRateConfidence(YawRateConfidence yawRate, 
		    AccelerationConfidence acceleration, 
		    SteeringWheelAngleConfidence steeringWheelAngle)
    {
	setYawRate(yawRate);
	setAcceleration(acceleration);
	setSteeringWheelAngle(steeringWheelAngle);
    }
    
    
    // Methods for field "yawRate"
    public YawRateConfidence getYawRate()
    {
	return this.yawRate;
    }
    
    public void setYawRate(YawRateConfidence yawRate)
    {
	this.yawRate = yawRate;
    }
    
    
    // Methods for field "acceleration"
    public AccelerationConfidence getAcceleration()
    {
	return this.acceleration;
    }
    
    public void setAcceleration(AccelerationConfidence acceleration)
    {
	this.acceleration = acceleration;
    }
    
    
    // Methods for field "steeringWheelAngle"
    public SteeringWheelAngleConfidence getSteeringWheelAngle()
    {
	return this.steeringWheelAngle;
    }
    
    public void setSteeringWheelAngle(SteeringWheelAngleConfidence steeringWheelAngle)
    {
	this.steeringWheelAngle = steeringWheelAngle;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__yawRate("yawRate"),
	__acceleration("acceleration"),
	__steeringWheelAngle("steeringWheelAngle"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, AccelSteerYawRateConfidence data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'yawRate'
	try {
	    YawRateConfidence item1 = data.yawRate;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yawRate", "YawRateConfidence");
	    throw ee;
	}
	// Encode field 'acceleration'
	try {
	    AccelerationConfidence item1 = data.acceleration;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("acceleration", "AccelerationConfidence");
	    throw ee;
	}
	// Encode field 'steeringWheelAngle'
	try {
	    SteeringWheelAngleConfidence item1 = data.steeringWheelAngle;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("steeringWheelAngle", "SteeringWheelAngleConfidence");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static AccelSteerYawRateConfidence decodeValue(PerCoder coder, InputBitStream source, AccelSteerYawRateConfidence data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'yawRate'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx1 < 0 || idx1 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.yawRate = YawRateConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("yawRate", "YawRateConfidence");
	    throw de;
	}
	// Decode field 'acceleration'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx1 < 0 || idx1 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.acceleration = AccelerationConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("acceleration", "AccelerationConfidence");
	    throw de;
	}
	// Decode field 'steeringWheelAngle'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
	    if (idx1 < 0 || idx1 > 3)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.steeringWheelAngle = SteeringWheelAngleConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("steeringWheelAngle", "SteeringWheelAngleConfidence");
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
	// Encode field 'yawRate'
	try {
	    YawRateConfidence item1 = this.yawRate;

	    {
		sink.encodeKey("yawRate");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("yawRate", "YawRateConfidence");
	    throw ee;
	}
	// Encode field 'acceleration'
	try {
	    AccelerationConfidence item1 = this.acceleration;

	    {
		sink.writeSeparator();
		sink.encodeKey("acceleration");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("acceleration", "AccelerationConfidence");
	    throw ee;
	}
	// Encode field 'steeringWheelAngle'
	try {
	    SteeringWheelAngleConfidence item1 = this.steeringWheelAngle;

	    {
		sink.writeSeparator();
		sink.encodeKey("steeringWheelAngle");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("steeringWheelAngle", "SteeringWheelAngleConfidence");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AccelSteerYawRateConfidence decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __yawRate:
		    // Decode field 'yawRate'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			YawRateConfidence temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(YawRateConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = YawRateConfidence.cNamedNumbers[idx1];
			this.yawRate = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("yawRate", "YawRateConfidence");
			throw de;
		    }
		    break;
		    case __acceleration:
		    // Decode field 'acceleration'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			AccelerationConfidence temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(AccelerationConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = AccelerationConfidence.cNamedNumbers[idx1];
			this.acceleration = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("acceleration", "AccelerationConfidence");
			throw de;
		    }
		    break;
		    case __steeringWheelAngle:
		    // Decode field 'steeringWheelAngle'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			SteeringWheelAngleConfidence temp1;

			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(SteeringWheelAngleConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = SteeringWheelAngleConfidence.cNamedNumbers[idx1];
			this.steeringWheelAngle = temp1;
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("steeringWheelAngle", "SteeringWheelAngleConfidence");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'yawRate'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'acceleration'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'steeringWheelAngle'");
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
	    writer.print("yawRate ");
	    printer.print(this.yawRate, writer, this.yawRate.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("acceleration ");
	    printer.print(this.acceleration, writer, this.acceleration.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("steeringWheelAngle ");
	    printer.print(this.steeringWheelAngle, writer, this.steeringWheelAngle.cConstantNameList);
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
	return equalTo((AccelSteerYawRateConfidence)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((AccelSteerYawRateConfidence)that);
    }
    
    public boolean equalTo(AccelSteerYawRateConfidence that) {
	if (!this.yawRate.equalTo(that.yawRate))
	    return false;
	if (!this.acceleration.equalTo(that.acceleration))
	    return false;
	if (!this.steeringWheelAngle.equalTo(that.steeringWheelAngle))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public AccelSteerYawRateConfidence clone() {
	AccelSteerYawRateConfidence copy = (AccelSteerYawRateConfidence)super.clone();
	copy.yawRate = yawRate.clone();
	copy.acceleration = acceleration.clone();
	copy.steeringWheelAngle = steeringWheelAngle.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.yawRate != null ? this.yawRate.hashCode() : 0);
	hash = 41 * hash + (this.acceleration != null ? this.acceleration.hashCode() : 0);
	hash = 41 * hash + (this.steeringWheelAngle != null ? this.steeringWheelAngle.hashCode() : 0);
	return hash;
    }
} // End class definition for AccelSteerYawRateConfidence
