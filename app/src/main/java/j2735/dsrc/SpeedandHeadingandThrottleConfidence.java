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
 * Define the SpeedandHeadingandThrottleConfidence ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class SpeedandHeadingandThrottleConfidence extends Sequence {
    public HeadingConfidence heading;
    public SpeedConfidence speed;
    public ThrottleConfidence throttle;
    
    /**
     * The default constructor.
     */
    public SpeedandHeadingandThrottleConfidence()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SpeedandHeadingandThrottleConfidence(HeadingConfidence heading, 
		    SpeedConfidence speed, ThrottleConfidence throttle)
    {
	setHeading(heading);
	setSpeed(speed);
	setThrottle(throttle);
    }
    
    
    // Methods for field "heading"
    public HeadingConfidence getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(HeadingConfidence heading)
    {
	this.heading = heading;
    }
    
    
    // Methods for field "speed"
    public SpeedConfidence getSpeed()
    {
	return this.speed;
    }
    
    public void setSpeed(SpeedConfidence speed)
    {
	this.speed = speed;
    }
    
    
    // Methods for field "throttle"
    public ThrottleConfidence getThrottle()
    {
	return this.throttle;
    }
    
    public void setThrottle(ThrottleConfidence throttle)
    {
	this.throttle = throttle;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__heading("heading"),
	__speed("speed"),
	__throttle("throttle"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SpeedandHeadingandThrottleConfidence data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'heading'
	try {
	    HeadingConfidence item1 = data.heading;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "HeadingConfidence");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    SpeedConfidence item1 = data.speed;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "SpeedConfidence");
	    throw ee;
	}
	// Encode field 'throttle'
	try {
	    ThrottleConfidence item1 = data.throttle;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("throttle", "ThrottleConfidence");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SpeedandHeadingandThrottleConfidence decodeValue(PerCoder coder, InputBitStream source, SpeedandHeadingandThrottleConfidence data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'heading'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx1 < 0 || idx1 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.heading = HeadingConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("heading", "HeadingConfidence");
	    throw de;
	}
	// Decode field 'speed'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx1 < 0 || idx1 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.speed = SpeedConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("speed", "SpeedConfidence");
	    throw de;
	}
	// Decode field 'throttle'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
	    if (idx1 < 0 || idx1 > 3)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.throttle = ThrottleConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("throttle", "ThrottleConfidence");
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
	// Encode field 'heading'
	try {
	    HeadingConfidence item1 = this.heading;

	    {
		sink.encodeKey("heading");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "HeadingConfidence");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    SpeedConfidence item1 = this.speed;

	    {
		sink.writeSeparator();
		sink.encodeKey("speed");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "SpeedConfidence");
	    throw ee;
	}
	// Encode field 'throttle'
	try {
	    ThrottleConfidence item1 = this.throttle;

	    {
		sink.writeSeparator();
		sink.encodeKey("throttle");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("throttle", "ThrottleConfidence");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SpeedandHeadingandThrottleConfidence decodeValue(JsonCoder coder, JsonReader source)
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
		    case __heading:
		    // Decode field 'heading'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			HeadingConfidence temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(HeadingConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = HeadingConfidence.cNamedNumbers[idx1];
			this.heading = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("heading", "HeadingConfidence");
			throw de;
		    }
		    break;
		    case __speed:
		    // Decode field 'speed'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			SpeedConfidence temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(SpeedConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = SpeedConfidence.cNamedNumbers[idx1];
			this.speed = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed", "SpeedConfidence");
			throw de;
		    }
		    break;
		    case __throttle:
		    // Decode field 'throttle'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			ThrottleConfidence temp1;

			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(ThrottleConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = ThrottleConfidence.cNamedNumbers[idx1];
			this.throttle = temp1;
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("throttle", "ThrottleConfidence");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'heading'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'speed'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'throttle'");
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
	    writer.print("heading ");
	    printer.print(this.heading, writer, this.heading.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("speed ");
	    printer.print(this.speed, writer, this.speed.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("throttle ");
	    printer.print(this.throttle, writer, this.throttle.cConstantNameList);
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
	return equalTo((SpeedandHeadingandThrottleConfidence)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SpeedandHeadingandThrottleConfidence)that);
    }
    
    public boolean equalTo(SpeedandHeadingandThrottleConfidence that) {
	if (!this.heading.equalTo(that.heading))
	    return false;
	if (!this.speed.equalTo(that.speed))
	    return false;
	if (!this.throttle.equalTo(that.throttle))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SpeedandHeadingandThrottleConfidence clone() {
	SpeedandHeadingandThrottleConfidence copy = (SpeedandHeadingandThrottleConfidence)super.clone();
	copy.heading = heading.clone();
	copy.speed = speed.clone();
	copy.throttle = throttle.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	hash = 41 * hash + (this.throttle != null ? this.throttle.hashCode() : 0);
	return hash;
    }
} // End class definition for SpeedandHeadingandThrottleConfidence
