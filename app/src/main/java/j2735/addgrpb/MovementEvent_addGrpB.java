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


package j2735.addgrpb;

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
 * Define the MovementEvent-addGrpB ASN.1 type included in the AddGrpB ASN.1 module.
 * @see Sequence
 */

public class MovementEvent_addGrpB extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public TimeRemaining startTime;
    public MinTimetoChange minEndTime;
    public MaxTimetoChange maxEndTime;
    public TimeRemaining likelyTime;
    public j2735.dsrc.TimeIntervalConfidence confidence;
    public TimeRemaining nextTime;
    
    /**
     * The default constructor.
     */
    public MovementEvent_addGrpB()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MovementEvent_addGrpB(TimeRemaining startTime, 
		    MinTimetoChange minEndTime, MaxTimetoChange maxEndTime, 
		    TimeRemaining likelyTime, 
		    j2735.dsrc.TimeIntervalConfidence confidence, 
		    TimeRemaining nextTime)
    {
	setStartTime(startTime);
	setMinEndTime(minEndTime);
	setMaxEndTime(maxEndTime);
	setLikelyTime(likelyTime);
	setConfidence(confidence);
	setNextTime(nextTime);
    }
    
    /**
     * Construct with required components.
     */
    public MovementEvent_addGrpB(MinTimetoChange minEndTime)
    {
	setMinEndTime(minEndTime);
    }
    
    
    // Methods for field "startTime"
    public TimeRemaining getStartTime()
    {
	return this.startTime;
    }
    
    public void setStartTime(TimeRemaining startTime)
    {
	this.startTime = startTime;
    }
    
    public boolean hasStartTime()
    {
	return (startTime != null);
    }
    
    public void deleteStartTime()
    {
	startTime = null;
    }
    
    
    // Methods for field "minEndTime"
    public MinTimetoChange getMinEndTime()
    {
	return this.minEndTime;
    }
    
    public void setMinEndTime(MinTimetoChange minEndTime)
    {
	this.minEndTime = minEndTime;
    }
    
    
    // Methods for field "maxEndTime"
    public MaxTimetoChange getMaxEndTime()
    {
	return this.maxEndTime;
    }
    
    public void setMaxEndTime(MaxTimetoChange maxEndTime)
    {
	this.maxEndTime = maxEndTime;
    }
    
    public boolean hasMaxEndTime()
    {
	return (maxEndTime != null);
    }
    
    public void deleteMaxEndTime()
    {
	maxEndTime = null;
    }
    
    
    // Methods for field "likelyTime"
    public TimeRemaining getLikelyTime()
    {
	return this.likelyTime;
    }
    
    public void setLikelyTime(TimeRemaining likelyTime)
    {
	this.likelyTime = likelyTime;
    }
    
    public boolean hasLikelyTime()
    {
	return (likelyTime != null);
    }
    
    public void deleteLikelyTime()
    {
	likelyTime = null;
    }
    
    
    // Methods for field "confidence"
    public j2735.dsrc.TimeIntervalConfidence getConfidence()
    {
	return this.confidence;
    }
    
    public void setConfidence(j2735.dsrc.TimeIntervalConfidence confidence)
    {
	this.confidence = confidence;
    }
    
    public boolean hasConfidence()
    {
	return (confidence != null);
    }
    
    public void deleteConfidence()
    {
	confidence = null;
    }
    
    
    // Methods for field "nextTime"
    public TimeRemaining getNextTime()
    {
	return this.nextTime;
    }
    
    public void setNextTime(TimeRemaining nextTime)
    {
	this.nextTime = nextTime;
    }
    
    public boolean hasNextTime()
    {
	return (nextTime != null);
    }
    
    public void deleteNextTime()
    {
	nextTime = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__startTime("startTime"),
	__minEndTime("minEndTime"),
	__maxEndTime("maxEndTime"),
	__likelyTime("likelyTime"),
	__confidence("confidence"),
	__nextTime("nextTime"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(7);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, MovementEvent_addGrpB data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.startTime != null);
	sink.writeBit(data.maxEndTime != null);
	sink.writeBit(data.likelyTime != null);
	sink.writeBit(data.confidence != null);
	sink.writeBit(data.nextTime != null);
	nbits += 6;
	if (data.startTime != null) {
	    // Encode field 'startTime'
	    try {
		TimeRemaining item1 = data.startTime;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 9001)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 9001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("startTime", "TimeRemaining");
		throw ee;
	    }
	}
	// Encode field 'minEndTime'
	try {
	    MinTimetoChange item1 = data.minEndTime;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 2402)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 2402, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minEndTime", "MinTimetoChange");
	    throw ee;
	}
	if (data.maxEndTime != null) {
	    // Encode field 'maxEndTime'
	    try {
		MaxTimetoChange item1 = data.maxEndTime;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 2402)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 2402, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("maxEndTime", "MaxTimetoChange");
		throw ee;
	    }
	}
	if (data.likelyTime != null) {
	    // Encode field 'likelyTime'
	    try {
		TimeRemaining item1 = data.likelyTime;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 9001)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 9001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("likelyTime", "TimeRemaining");
		throw ee;
	    }
	}
	if (data.confidence != null) {
	    // Encode field 'confidence'
	    try {
		j2735.dsrc.TimeIntervalConfidence item1 = data.confidence;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 15)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("confidence", "TimeIntervalConfidence");
		throw ee;
	    }
	}
	if (data.nextTime != null) {
	    // Encode field 'nextTime'
	    try {
		TimeRemaining item1 = data.nextTime;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 9001)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 9001, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("nextTime", "TimeRemaining");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Encode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int encode(PerCoder coder, OutputBitStream sink)
	    throws EncoderException
    {
	try {
	    return this.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "MovementEvent-addGrpB");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static MovementEvent_addGrpB decodeValue(PerCoder coder, InputBitStream source, MovementEvent_addGrpB data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_startTime0 = source.readBit();
	boolean has_maxEndTime0 = source.readBit();
	boolean has_likelyTime0 = source.readBit();
	boolean has_confidence0 = source.readBit();
	boolean has_nextTime0 = source.readBit();
    /** Decode root fields **/
	if (has_startTime0) {
	    // Decode field 'startTime'
	    try {
		long temp1;

		if (data.startTime == null)
		    data.startTime = new TimeRemaining();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 9001);
		if (temp1 > 9001)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.startTime.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("startTime", "TimeRemaining");
		throw de;
	    }
	} else {
	    data.startTime = null;
	}
	// Decode field 'minEndTime'
	try {
	    long temp1;

	    if (data.minEndTime == null)
		data.minEndTime = new MinTimetoChange();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 2402);
	    if (temp1 > 2402)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.minEndTime.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("minEndTime", "MinTimetoChange");
	    throw de;
	}
	if (has_maxEndTime0) {
	    // Decode field 'maxEndTime'
	    try {
		long temp1;

		if (data.maxEndTime == null)
		    data.maxEndTime = new MaxTimetoChange();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 2402);
		if (temp1 > 2402)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.maxEndTime.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("maxEndTime", "MaxTimetoChange");
		throw de;
	    }
	} else {
	    data.maxEndTime = null;
	}
	if (has_likelyTime0) {
	    // Decode field 'likelyTime'
	    try {
		long temp1;

		if (data.likelyTime == null)
		    data.likelyTime = new TimeRemaining();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 9001);
		if (temp1 > 9001)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.likelyTime.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("likelyTime", "TimeRemaining");
		throw de;
	    }
	} else {
	    data.likelyTime = null;
	}
	if (has_confidence0) {
	    // Decode field 'confidence'
	    try {
		long temp1;

		if (data.confidence == null)
		    data.confidence = new j2735.dsrc.TimeIntervalConfidence();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (temp1 > 15)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.confidence.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("confidence", "TimeIntervalConfidence");
		throw de;
	    }
	} else {
	    data.confidence = null;
	}
	if (has_nextTime0) {
	    // Decode field 'nextTime'
	    try {
		long temp1;

		if (data.nextTime == null)
		    data.nextTime = new TimeRemaining();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 9001);
		if (temp1 > 9001)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.nextTime.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("nextTime", "TimeRemaining");
		throw de;
	    }
	} else {
	    data.nextTime = null;
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "MovementEvent-addGrpB");
	    throw de;
	}
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
	// Encode field 'startTime'
	try {
	    TimeRemaining item1 = this.startTime;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("startTime");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "startTime");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("startTime", "TimeRemaining");
	    throw ee;
	}
	// Encode field 'minEndTime'
	try {
	    MinTimetoChange item1 = this.minEndTime;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("minEndTime");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("minEndTime", "MinTimetoChange");
	    throw ee;
	}
	// Encode field 'maxEndTime'
	try {
	    MaxTimetoChange item1 = this.maxEndTime;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("maxEndTime");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "maxEndTime");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("maxEndTime", "MaxTimetoChange");
	    throw ee;
	}
	// Encode field 'likelyTime'
	try {
	    TimeRemaining item1 = this.likelyTime;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("likelyTime");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "likelyTime");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("likelyTime", "TimeRemaining");
	    throw ee;
	}
	// Encode field 'confidence'
	try {
	    j2735.dsrc.TimeIntervalConfidence item1 = this.confidence;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("confidence");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "confidence");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("confidence", "TimeIntervalConfidence");
	    throw ee;
	}
	// Encode field 'nextTime'
	try {
	    TimeRemaining item1 = this.nextTime;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("nextTime");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "nextTime");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nextTime", "TimeRemaining");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Encode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encode(JsonCoder coder, JsonWriter sink)
	    throws EncoderException
    {
	try {
	    this.encodeValue(coder, sink);

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "MovementEvent-addGrpB");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public MovementEvent_addGrpB decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[7];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __startTime:
		    // Decode field 'startTime'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.startTime == null)
				this.startTime = new TimeRemaining();
			    this.startTime.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("startTime", "TimeRemaining");
			throw de;
		    }
		    break;
		    case __minEndTime:
		    // Decode field 'minEndTime'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.minEndTime == null)
			    this.minEndTime = new MinTimetoChange();
			this.minEndTime.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("minEndTime", "MinTimetoChange");
			throw de;
		    }
		    break;
		    case __maxEndTime:
		    // Decode field 'maxEndTime'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.maxEndTime == null)
				this.maxEndTime = new MaxTimetoChange();
			    this.maxEndTime.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("maxEndTime", "MaxTimetoChange");
			throw de;
		    }
		    break;
		    case __likelyTime:
		    // Decode field 'likelyTime'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.likelyTime == null)
				this.likelyTime = new TimeRemaining();
			    this.likelyTime.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("likelyTime", "TimeRemaining");
			throw de;
		    }
		    break;
		    case __confidence:
		    // Decode field 'confidence'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.confidence == null)
				this.confidence = new j2735.dsrc.TimeIntervalConfidence();
			    this.confidence.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("confidence", "TimeIntervalConfidence");
			throw de;
		    }
		    break;
		    case __nextTime:
		    // Decode field 'nextTime'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.nextTime == null)
				this.nextTime = new TimeRemaining();
			    this.nextTime.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("nextTime", "TimeRemaining");
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
	    this.startTime = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'minEndTime'");
	if (!present0[2])
	    this.maxEndTime = null;
	if (!present0[3])
	    this.likelyTime = null;
	if (!present0[4])
	    this.confidence = null;
	if (!present0[5])
	    this.nextTime = null;
	return this;
    }

    /**
     * Decode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(JsonCoder coder, JsonReader source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "MovementEvent-addGrpB");
	    throw de;
	}
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
	if (this.startTime != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("startTime ");
		writer.print(this.startTime.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("minEndTime ");
	    writer.print(this.minEndTime.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.maxEndTime != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("maxEndTime ");
		writer.print(this.maxEndTime.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.likelyTime != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("likelyTime ");
		writer.print(this.likelyTime.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.confidence != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("confidence ");
		writer.print(this.confidence.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.nextTime != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("nextTime ");
		writer.print(this.nextTime.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "MovementEvent-addGrpB";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((MovementEvent_addGrpB)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((MovementEvent_addGrpB)that);
    }
    
    public boolean equalTo(MovementEvent_addGrpB that) {
	if (this.startTime != null) {
	    if (that.startTime == null || !this.startTime.equalTo(that.startTime))
		return false;
	} else if (that.startTime != null)
	    return false;
	if (!this.minEndTime.equalTo(that.minEndTime))
	    return false;
	if (this.maxEndTime != null) {
	    if (that.maxEndTime == null || !this.maxEndTime.equalTo(that.maxEndTime))
		return false;
	} else if (that.maxEndTime != null)
	    return false;
	if (this.likelyTime != null) {
	    if (that.likelyTime == null || !this.likelyTime.equalTo(that.likelyTime))
		return false;
	} else if (that.likelyTime != null)
	    return false;
	if (this.confidence != null) {
	    if (that.confidence == null || !this.confidence.equalTo(that.confidence))
		return false;
	} else if (that.confidence != null)
	    return false;
	if (this.nextTime != null) {
	    if (that.nextTime == null || !this.nextTime.equalTo(that.nextTime))
		return false;
	} else if (that.nextTime != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public MovementEvent_addGrpB clone() {
	MovementEvent_addGrpB copy = (MovementEvent_addGrpB)super.clone();
	if (startTime != null) {
	    copy.startTime = startTime.clone();
	}
	copy.minEndTime = minEndTime.clone();
	if (maxEndTime != null) {
	    copy.maxEndTime = maxEndTime.clone();
	}
	if (likelyTime != null) {
	    copy.likelyTime = likelyTime.clone();
	}
	if (confidence != null) {
	    copy.confidence = confidence.clone();
	}
	if (nextTime != null) {
	    copy.nextTime = nextTime.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.startTime != null ? this.startTime.hashCode() : 0);
	hash = 41 * hash + (this.minEndTime != null ? this.minEndTime.hashCode() : 0);
	hash = 41 * hash + (this.maxEndTime != null ? this.maxEndTime.hashCode() : 0);
	hash = 41 * hash + (this.likelyTime != null ? this.likelyTime.hashCode() : 0);
	hash = 41 * hash + (this.confidence != null ? this.confidence.hashCode() : 0);
	hash = 41 * hash + (this.nextTime != null ? this.nextTime.hashCode() : 0);
	return hash;
    }
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new MovementEvent_addGrpB();
	}
    };
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ASN1Type get_ASN1Type()
    {
	return _type;
    }
    
} // End class definition for MovementEvent_addGrpB
