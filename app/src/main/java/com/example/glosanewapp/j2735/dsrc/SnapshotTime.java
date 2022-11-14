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
 * Define the SnapshotTime ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class SnapshotTime extends Sequence {
    public GrossSpeed speed1;
    public SecondOfTime time1;
    public GrossSpeed speed2;
    public SecondOfTime time2;
    
    /**
     * The default constructor.
     */
    public SnapshotTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SnapshotTime(GrossSpeed speed1, SecondOfTime time1, 
		    GrossSpeed speed2, SecondOfTime time2)
    {
	setSpeed1(speed1);
	setTime1(time1);
	setSpeed2(speed2);
	setTime2(time2);
    }
    
    
    // Methods for field "speed1"
    public GrossSpeed getSpeed1()
    {
	return this.speed1;
    }
    
    public void setSpeed1(GrossSpeed speed1)
    {
	this.speed1 = speed1;
    }
    
    
    // Methods for field "time1"
    public SecondOfTime getTime1()
    {
	return this.time1;
    }
    
    public void setTime1(SecondOfTime time1)
    {
	this.time1 = time1;
    }
    
    
    // Methods for field "speed2"
    public GrossSpeed getSpeed2()
    {
	return this.speed2;
    }
    
    public void setSpeed2(GrossSpeed speed2)
    {
	this.speed2 = speed2;
    }
    
    
    // Methods for field "time2"
    public SecondOfTime getTime2()
    {
	return this.time2;
    }
    
    public void setTime2(SecondOfTime time2)
    {
	this.time2 = time2;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__speed1("speed1"),
	__time1("time1"),
	__speed2("speed2"),
	__time2("time2"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(5);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SnapshotTime data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'speed1'
	try {
	    GrossSpeed item1 = data.speed1;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed1", "GrossSpeed");
	    throw ee;
	}
	// Encode field 'time1'
	try {
	    SecondOfTime item1 = data.time1;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 61)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 61, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("time1", "SecondOfTime");
	    throw ee;
	}
	// Encode field 'speed2'
	try {
	    GrossSpeed item1 = data.speed2;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed2", "GrossSpeed");
	    throw ee;
	}
	// Encode field 'time2'
	try {
	    SecondOfTime item1 = data.time2;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 61)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 61, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("time2", "SecondOfTime");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SnapshotTime decodeValue(PerCoder coder, InputBitStream source, SnapshotTime data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'speed1'
	try {
	    long temp1;

	    if (data.speed1 == null)
		data.speed1 = new GrossSpeed();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.speed1.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("speed1", "GrossSpeed");
	    throw de;
	}
	// Decode field 'time1'
	try {
	    long temp1;

	    if (data.time1 == null)
		data.time1 = new SecondOfTime();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 61);
	    if (temp1 > 61)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.time1.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("time1", "SecondOfTime");
	    throw de;
	}
	// Decode field 'speed2'
	try {
	    long temp1;

	    if (data.speed2 == null)
		data.speed2 = new GrossSpeed();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.speed2.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("speed2", "GrossSpeed");
	    throw de;
	}
	// Decode field 'time2'
	try {
	    long temp1;

	    if (data.time2 == null)
		data.time2 = new SecondOfTime();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 61);
	    if (temp1 > 61)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.time2.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("time2", "SecondOfTime");
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
	// Encode field 'speed1'
	try {
	    GrossSpeed item1 = this.speed1;

	    {
		sink.encodeKey("speed1");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed1", "GrossSpeed");
	    throw ee;
	}
	// Encode field 'time1'
	try {
	    SecondOfTime item1 = this.time1;

	    {
		sink.writeSeparator();
		sink.encodeKey("time1");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("time1", "SecondOfTime");
	    throw ee;
	}
	// Encode field 'speed2'
	try {
	    GrossSpeed item1 = this.speed2;

	    {
		sink.writeSeparator();
		sink.encodeKey("speed2");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed2", "GrossSpeed");
	    throw ee;
	}
	// Encode field 'time2'
	try {
	    SecondOfTime item1 = this.time2;

	    {
		sink.writeSeparator();
		sink.encodeKey("time2");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("time2", "SecondOfTime");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SnapshotTime decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[5];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __speed1:
		    // Decode field 'speed1'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.speed1 == null)
			    this.speed1 = new GrossSpeed();
			this.speed1.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed1", "GrossSpeed");
			throw de;
		    }
		    break;
		    case __time1:
		    // Decode field 'time1'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.time1 == null)
			    this.time1 = new SecondOfTime();
			this.time1.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("time1", "SecondOfTime");
			throw de;
		    }
		    break;
		    case __speed2:
		    // Decode field 'speed2'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.speed2 == null)
			    this.speed2 = new GrossSpeed();
			this.speed2.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed2", "GrossSpeed");
			throw de;
		    }
		    break;
		    case __time2:
		    // Decode field 'time2'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.time2 == null)
			    this.time2 = new SecondOfTime();
			this.time2.setValue(coder.decodeInteger(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("time2", "SecondOfTime");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'speed1'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'time1'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'speed2'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'time2'");
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
	    writer.print("speed1 ");
	    writer.print(this.speed1.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("time1 ");
	    writer.print(this.time1.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("speed2 ");
	    writer.print(this.speed2.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("time2 ");
	    writer.print(this.time2.longValue());
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
	return equalTo((SnapshotTime)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SnapshotTime)that);
    }
    
    public boolean equalTo(SnapshotTime that) {
	if (!this.speed1.equalTo(that.speed1))
	    return false;
	if (!this.time1.equalTo(that.time1))
	    return false;
	if (!this.speed2.equalTo(that.speed2))
	    return false;
	if (!this.time2.equalTo(that.time2))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SnapshotTime clone() {
	SnapshotTime copy = (SnapshotTime)super.clone();
	copy.speed1 = speed1.clone();
	copy.time1 = time1.clone();
	copy.speed2 = speed2.clone();
	copy.time2 = time2.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.speed1 != null ? this.speed1.hashCode() : 0);
	hash = 41 * hash + (this.time1 != null ? this.time1.hashCode() : 0);
	hash = 41 * hash + (this.speed2 != null ? this.speed2.hashCode() : 0);
	hash = 41 * hash + (this.time2 != null ? this.time2.hashCode() : 0);
	return hash;
    }
} // End class definition for SnapshotTime
