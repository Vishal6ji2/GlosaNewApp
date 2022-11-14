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
 * Define the ConfidenceSet ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class ConfidenceSet extends Sequence {
    public AccelSteerYawRateConfidence accelConfidence;
    public SpeedandHeadingandThrottleConfidence speedConfidence;
    public TimeConfidence timeConfidence;
    public PositionConfidenceSet posConfidence;
    public SteeringWheelAngleConfidence steerConfidence;
    public HeadingConfidence headingConfidence;
    public ThrottleConfidence throttleConfidence;
    
    /**
     * The default constructor.
     */
    public ConfidenceSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConfidenceSet(AccelSteerYawRateConfidence accelConfidence, 
		    SpeedandHeadingandThrottleConfidence speedConfidence, 
		    TimeConfidence timeConfidence, 
		    PositionConfidenceSet posConfidence, 
		    SteeringWheelAngleConfidence steerConfidence, 
		    HeadingConfidence headingConfidence, 
		    ThrottleConfidence throttleConfidence)
    {
	setAccelConfidence(accelConfidence);
	setSpeedConfidence(speedConfidence);
	setTimeConfidence(timeConfidence);
	setPosConfidence(posConfidence);
	setSteerConfidence(steerConfidence);
	setHeadingConfidence(headingConfidence);
	setThrottleConfidence(throttleConfidence);
    }
    
    
    // Methods for field "accelConfidence"
    public AccelSteerYawRateConfidence getAccelConfidence()
    {
	return this.accelConfidence;
    }
    
    public void setAccelConfidence(AccelSteerYawRateConfidence accelConfidence)
    {
	this.accelConfidence = accelConfidence;
    }
    
    public boolean hasAccelConfidence()
    {
	return (accelConfidence != null);
    }
    
    public void deleteAccelConfidence()
    {
	accelConfidence = null;
    }
    
    
    // Methods for field "speedConfidence"
    public SpeedandHeadingandThrottleConfidence getSpeedConfidence()
    {
	return this.speedConfidence;
    }
    
    public void setSpeedConfidence(SpeedandHeadingandThrottleConfidence speedConfidence)
    {
	this.speedConfidence = speedConfidence;
    }
    
    public boolean hasSpeedConfidence()
    {
	return (speedConfidence != null);
    }
    
    public void deleteSpeedConfidence()
    {
	speedConfidence = null;
    }
    
    
    // Methods for field "timeConfidence"
    public TimeConfidence getTimeConfidence()
    {
	return this.timeConfidence;
    }
    
    public void setTimeConfidence(TimeConfidence timeConfidence)
    {
	this.timeConfidence = timeConfidence;
    }
    
    public boolean hasTimeConfidence()
    {
	return (timeConfidence != null);
    }
    
    public void deleteTimeConfidence()
    {
	timeConfidence = null;
    }
    
    
    // Methods for field "posConfidence"
    public PositionConfidenceSet getPosConfidence()
    {
	return this.posConfidence;
    }
    
    public void setPosConfidence(PositionConfidenceSet posConfidence)
    {
	this.posConfidence = posConfidence;
    }
    
    public boolean hasPosConfidence()
    {
	return (posConfidence != null);
    }
    
    public void deletePosConfidence()
    {
	posConfidence = null;
    }
    
    
    // Methods for field "steerConfidence"
    public SteeringWheelAngleConfidence getSteerConfidence()
    {
	return this.steerConfidence;
    }
    
    public void setSteerConfidence(SteeringWheelAngleConfidence steerConfidence)
    {
	this.steerConfidence = steerConfidence;
    }
    
    public boolean hasSteerConfidence()
    {
	return (steerConfidence != null);
    }
    
    public void deleteSteerConfidence()
    {
	steerConfidence = null;
    }
    
    
    // Methods for field "headingConfidence"
    public HeadingConfidence getHeadingConfidence()
    {
	return this.headingConfidence;
    }
    
    public void setHeadingConfidence(HeadingConfidence headingConfidence)
    {
	this.headingConfidence = headingConfidence;
    }
    
    public boolean hasHeadingConfidence()
    {
	return (headingConfidence != null);
    }
    
    public void deleteHeadingConfidence()
    {
	headingConfidence = null;
    }
    
    
    // Methods for field "throttleConfidence"
    public ThrottleConfidence getThrottleConfidence()
    {
	return this.throttleConfidence;
    }
    
    public void setThrottleConfidence(ThrottleConfidence throttleConfidence)
    {
	this.throttleConfidence = throttleConfidence;
    }
    
    public boolean hasThrottleConfidence()
    {
	return (throttleConfidence != null);
    }
    
    public void deleteThrottleConfidence()
    {
	throttleConfidence = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__accelConfidence("accelConfidence"),
	__speedConfidence("speedConfidence"),
	__timeConfidence("timeConfidence"),
	__posConfidence("posConfidence"),
	__steerConfidence("steerConfidence"),
	__headingConfidence("headingConfidence"),
	__throttleConfidence("throttleConfidence"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ConfidenceSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.accelConfidence != null);
	sink.writeBit(data.speedConfidence != null);
	sink.writeBit(data.timeConfidence != null);
	sink.writeBit(data.posConfidence != null);
	sink.writeBit(data.steerConfidence != null);
	sink.writeBit(data.headingConfidence != null);
	sink.writeBit(data.throttleConfidence != null);
	nbits += 8;
	if (data.accelConfidence != null) {
	    // Encode field 'accelConfidence'
	    try {
		AccelSteerYawRateConfidence item1 = data.accelConfidence;

		nbits += AccelSteerYawRateConfidence.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
		throw ee;
	    }
	}
	if (data.speedConfidence != null) {
	    // Encode field 'speedConfidence'
	    try {
		SpeedandHeadingandThrottleConfidence item1 = data.speedConfidence;

		nbits += SpeedandHeadingandThrottleConfidence.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (data.timeConfidence != null) {
	    // Encode field 'timeConfidence'
	    try {
		TimeConfidence item1 = data.timeConfidence;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 39, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeConfidence", "TimeConfidence");
		throw ee;
	    }
	}
	if (data.posConfidence != null) {
	    // Encode field 'posConfidence'
	    try {
		PositionConfidenceSet item1 = data.posConfidence;

		nbits += PositionConfidenceSet.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("posConfidence", "PositionConfidenceSet");
		throw ee;
	    }
	}
	if (data.steerConfidence != null) {
	    // Encode field 'steerConfidence'
	    try {
		SteeringWheelAngleConfidence item1 = data.steerConfidence;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
		throw ee;
	    }
	}
	if (data.headingConfidence != null) {
	    // Encode field 'headingConfidence'
	    try {
		HeadingConfidence item1 = data.headingConfidence;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("headingConfidence", "HeadingConfidence");
		throw ee;
	    }
	}
	if (data.throttleConfidence != null) {
	    // Encode field 'throttleConfidence'
	    try {
		ThrottleConfidence item1 = data.throttleConfidence;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttleConfidence", "ThrottleConfidence");
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
    public static ConfidenceSet decodeValue(PerCoder coder, InputBitStream source, ConfidenceSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_accelConfidence0 = source.readBit();
	boolean has_speedConfidence0 = source.readBit();
	boolean has_timeConfidence0 = source.readBit();
	boolean has_posConfidence0 = source.readBit();
	boolean has_steerConfidence0 = source.readBit();
	boolean has_headingConfidence0 = source.readBit();
	boolean has_throttleConfidence0 = source.readBit();
    /** Decode root fields **/
	if (has_accelConfidence0) {
	    // Decode field 'accelConfidence'
	    try {
		if (data.accelConfidence == null)
		    data.accelConfidence = new AccelSteerYawRateConfidence();
		data.accelConfidence.decodeValue(coder, source, data.accelConfidence);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
		throw de;
	    }
	} else {
	    data.accelConfidence = null;
	}
	if (has_speedConfidence0) {
	    // Decode field 'speedConfidence'
	    try {
		if (data.speedConfidence == null)
		    data.speedConfidence = new SpeedandHeadingandThrottleConfidence();
		data.speedConfidence.decodeValue(coder, source, data.speedConfidence);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
		throw de;
	    }
	} else {
	    data.speedConfidence = null;
	}
	if (has_timeConfidence0) {
	    // Decode field 'timeConfidence'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 39);
		if (idx1 < 0 || idx1 > 39)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.timeConfidence = TimeConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeConfidence", "TimeConfidence");
		throw de;
	    }
	} else {
	    data.timeConfidence = null;
	}
	if (has_posConfidence0) {
	    // Decode field 'posConfidence'
	    try {
		if (data.posConfidence == null)
		    data.posConfidence = new PositionConfidenceSet();
		data.posConfidence.decodeValue(coder, source, data.posConfidence);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("posConfidence", "PositionConfidenceSet");
		throw de;
	    }
	} else {
	    data.posConfidence = null;
	}
	if (has_steerConfidence0) {
	    // Decode field 'steerConfidence'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.steerConfidence = SteeringWheelAngleConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
		throw de;
	    }
	} else {
	    data.steerConfidence = null;
	}
	if (has_headingConfidence0) {
	    // Decode field 'headingConfidence'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.headingConfidence = HeadingConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("headingConfidence", "HeadingConfidence");
		throw de;
	    }
	} else {
	    data.headingConfidence = null;
	}
	if (has_throttleConfidence0) {
	    // Decode field 'throttleConfidence'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.throttleConfidence = ThrottleConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("throttleConfidence", "ThrottleConfidence");
		throw de;
	    }
	} else {
	    data.throttleConfidence = null;
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
	// Encode field 'accelConfidence'
	try {
	    AccelSteerYawRateConfidence item1 = this.accelConfidence;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("accelConfidence");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "accelConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
	    throw ee;
	}
	// Encode field 'speedConfidence'
	try {
	    SpeedandHeadingandThrottleConfidence item1 = this.speedConfidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("speedConfidence");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "speedConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
	    throw ee;
	}
	// Encode field 'timeConfidence'
	try {
	    TimeConfidence item1 = this.timeConfidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("timeConfidence");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "timeConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeConfidence", "TimeConfidence");
	    throw ee;
	}
	// Encode field 'posConfidence'
	try {
	    PositionConfidenceSet item1 = this.posConfidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("posConfidence");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "posConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("posConfidence", "PositionConfidenceSet");
	    throw ee;
	}
	// Encode field 'steerConfidence'
	try {
	    SteeringWheelAngleConfidence item1 = this.steerConfidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("steerConfidence");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "steerConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
	    throw ee;
	}
	// Encode field 'headingConfidence'
	try {
	    HeadingConfidence item1 = this.headingConfidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("headingConfidence");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "headingConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("headingConfidence", "HeadingConfidence");
	    throw ee;
	}
	// Encode field 'throttleConfidence'
	try {
	    ThrottleConfidence item1 = this.throttleConfidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("throttleConfidence");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "throttleConfidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("throttleConfidence", "ThrottleConfidence");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ConfidenceSet decodeValue(JsonCoder coder, JsonReader source)
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
		    case __accelConfidence:
		    // Decode field 'accelConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.accelConfidence == null)
				this.accelConfidence = new AccelSteerYawRateConfidence();
			    this.accelConfidence.decodeValue(coder, source);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("accelConfidence", "AccelSteerYawRateConfidence");
			throw de;
		    }
		    break;
		    case __speedConfidence:
		    // Decode field 'speedConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.speedConfidence == null)
				this.speedConfidence = new SpeedandHeadingandThrottleConfidence();
			    this.speedConfidence.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speedConfidence", "SpeedandHeadingandThrottleConfidence");
			throw de;
		    }
		    break;
		    case __timeConfidence:
		    // Decode field 'timeConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    TimeConfidence temp1;

			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(TimeConfidence.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = TimeConfidence.cNamedNumbers[idx1];
			    this.timeConfidence = temp1;
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeConfidence", "TimeConfidence");
			throw de;
		    }
		    break;
		    case __posConfidence:
		    // Decode field 'posConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.posConfidence == null)
				this.posConfidence = new PositionConfidenceSet();
			    this.posConfidence.decodeValue(coder, source);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("posConfidence", "PositionConfidenceSet");
			throw de;
		    }
		    break;
		    case __steerConfidence:
		    // Decode field 'steerConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    SteeringWheelAngleConfidence temp1;

			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(SteeringWheelAngleConfidence.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = SteeringWheelAngleConfidence.cNamedNumbers[idx1];
			    this.steerConfidence = temp1;
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("steerConfidence", "SteeringWheelAngleConfidence");
			throw de;
		    }
		    break;
		    case __headingConfidence:
		    // Decode field 'headingConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    HeadingConfidence temp1;

			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(HeadingConfidence.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = HeadingConfidence.cNamedNumbers[idx1];
			    this.headingConfidence = temp1;
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("headingConfidence", "HeadingConfidence");
			throw de;
		    }
		    break;
		    case __throttleConfidence:
		    // Decode field 'throttleConfidence'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    ThrottleConfidence temp1;

			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(ThrottleConfidence.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = ThrottleConfidence.cNamedNumbers[idx1];
			    this.throttleConfidence = temp1;
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("throttleConfidence", "ThrottleConfidence");
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
	    this.accelConfidence = null;
	if (!present0[1])
	    this.speedConfidence = null;
	if (!present0[2])
	    this.timeConfidence = null;
	if (!present0[3])
	    this.posConfidence = null;
	if (!present0[4])
	    this.steerConfidence = null;
	if (!present0[5])
	    this.headingConfidence = null;
	if (!present0[6])
	    this.throttleConfidence = null;
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
	if (this.accelConfidence != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("accelConfidence ");
		this.accelConfidence.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speedConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("speedConfidence ");
		this.speedConfidence.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.timeConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("timeConfidence ");
		printer.print(this.timeConfidence, writer, this.timeConfidence.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.posConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("posConfidence ");
		this.posConfidence.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.steerConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("steerConfidence ");
		printer.print(this.steerConfidence, writer, this.steerConfidence.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.headingConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("headingConfidence ");
		printer.print(this.headingConfidence, writer, this.headingConfidence.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.throttleConfidence != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("throttleConfidence ");
		printer.print(this.throttleConfidence, writer, this.throttleConfidence.cConstantNameList);
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
	return equalTo((ConfidenceSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ConfidenceSet)that);
    }
    
    public boolean equalTo(ConfidenceSet that) {
	if (this.accelConfidence != null) {
	    if (that.accelConfidence == null || !this.accelConfidence.equalTo(that.accelConfidence))
		return false;
	} else if (that.accelConfidence != null)
	    return false;
	if (this.speedConfidence != null) {
	    if (that.speedConfidence == null || !this.speedConfidence.equalTo(that.speedConfidence))
		return false;
	} else if (that.speedConfidence != null)
	    return false;
	if (this.timeConfidence != null) {
	    if (that.timeConfidence == null || !this.timeConfidence.equalTo(that.timeConfidence))
		return false;
	} else if (that.timeConfidence != null)
	    return false;
	if (this.posConfidence != null) {
	    if (that.posConfidence == null || !this.posConfidence.equalTo(that.posConfidence))
		return false;
	} else if (that.posConfidence != null)
	    return false;
	if (this.steerConfidence != null) {
	    if (that.steerConfidence == null || !this.steerConfidence.equalTo(that.steerConfidence))
		return false;
	} else if (that.steerConfidence != null)
	    return false;
	if (this.headingConfidence != null) {
	    if (that.headingConfidence == null || !this.headingConfidence.equalTo(that.headingConfidence))
		return false;
	} else if (that.headingConfidence != null)
	    return false;
	if (this.throttleConfidence != null) {
	    if (that.throttleConfidence == null || !this.throttleConfidence.equalTo(that.throttleConfidence))
		return false;
	} else if (that.throttleConfidence != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ConfidenceSet clone() {
	ConfidenceSet copy = (ConfidenceSet)super.clone();
	if (accelConfidence != null) {
	    copy.accelConfidence = accelConfidence.clone();
	}
	if (speedConfidence != null) {
	    copy.speedConfidence = speedConfidence.clone();
	}
	if (timeConfidence != null) {
	    copy.timeConfidence = timeConfidence.clone();
	}
	if (posConfidence != null) {
	    copy.posConfidence = posConfidence.clone();
	}
	if (steerConfidence != null) {
	    copy.steerConfidence = steerConfidence.clone();
	}
	if (headingConfidence != null) {
	    copy.headingConfidence = headingConfidence.clone();
	}
	if (throttleConfidence != null) {
	    copy.throttleConfidence = throttleConfidence.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.accelConfidence != null ? this.accelConfidence.hashCode() : 0);
	hash = 41 * hash + (this.speedConfidence != null ? this.speedConfidence.hashCode() : 0);
	hash = 41 * hash + (this.timeConfidence != null ? this.timeConfidence.hashCode() : 0);
	hash = 41 * hash + (this.posConfidence != null ? this.posConfidence.hashCode() : 0);
	hash = 41 * hash + (this.steerConfidence != null ? this.steerConfidence.hashCode() : 0);
	hash = 41 * hash + (this.headingConfidence != null ? this.headingConfidence.hashCode() : 0);
	hash = 41 * hash + (this.throttleConfidence != null ? this.throttleConfidence.hashCode() : 0);
	return hash;
    }
} // End class definition for ConfidenceSet
