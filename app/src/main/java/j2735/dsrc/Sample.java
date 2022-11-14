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
 * Define the Sample ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class Sample extends Sequence {
    public INTEGER sampleStart;
    public INTEGER sampleEnd;
    
    /**
     * The default constructor.
     */
    public Sample()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Sample(INTEGER sampleStart, INTEGER sampleEnd)
    {
	setSampleStart(sampleStart);
	setSampleEnd(sampleEnd);
    }
    
    /**
     * Construct with components.
     */
    public Sample(long sampleStart, long sampleEnd)
    {
	this(new INTEGER(sampleStart), new INTEGER(sampleEnd));
    }
    
    
    // Methods for field "sampleStart"
    public long getSampleStart()
    {
	return (this.sampleStart).longValue();
    }
    
    public void setSampleStart(long sampleStart)
    {
	setSampleStart(new INTEGER(sampleStart));
    }
    
    public void setSampleStart(INTEGER sampleStart)
    {
	this.sampleStart = sampleStart;
    }
    
    
    // Methods for field "sampleEnd"
    public long getSampleEnd()
    {
	return (this.sampleEnd).longValue();
    }
    
    public void setSampleEnd(long sampleEnd)
    {
	setSampleEnd(new INTEGER(sampleEnd));
    }
    
    public void setSampleEnd(INTEGER sampleEnd)
    {
	this.sampleEnd = sampleEnd;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__sampleStart("sampleStart"),
	__sampleEnd("sampleEnd"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Sample data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'sampleStart'
	try {
	    INTEGER item1 = data.sampleStart;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleStart", "INTEGER");
	    throw ee;
	}
	// Encode field 'sampleEnd'
	try {
	    INTEGER item1 = data.sampleEnd;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleEnd", "INTEGER");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Sample decodeValue(PerCoder coder, InputBitStream source, Sample data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'sampleStart'
	try {
	    long temp1;

	    if (data.sampleStart == null)
		data.sampleStart = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sampleStart.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sampleStart", "INTEGER");
	    throw de;
	}
	// Decode field 'sampleEnd'
	try {
	    long temp1;

	    if (data.sampleEnd == null)
		data.sampleEnd = new INTEGER();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sampleEnd.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sampleEnd", "INTEGER");
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
	// Encode field 'sampleStart'
	try {
	    INTEGER item1 = this.sampleStart;

	    {
		sink.encodeKey("sampleStart");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleStart", "INTEGER");
	    throw ee;
	}
	// Encode field 'sampleEnd'
	try {
	    INTEGER item1 = this.sampleEnd;

	    {
		sink.writeSeparator();
		sink.encodeKey("sampleEnd");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sampleEnd", "INTEGER");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Sample decodeValue(JsonCoder coder, JsonReader source)
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
		    case __sampleStart:
		    // Decode field 'sampleStart'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sampleStart == null)
			    this.sampleStart = new INTEGER();
			this.sampleStart.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sampleStart", "INTEGER");
			throw de;
		    }
		    break;
		    case __sampleEnd:
		    // Decode field 'sampleEnd'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sampleEnd == null)
			    this.sampleEnd = new INTEGER();
			this.sampleEnd.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sampleEnd", "INTEGER");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sampleStart'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sampleEnd'");
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
	    writer.print("sampleStart ");
	    writer.print(this.sampleStart.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("sampleEnd ");
	    writer.print(this.sampleEnd.longValue());
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
	return equalTo((Sample)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Sample)that);
    }
    
    public boolean equalTo(Sample that) {
	if (!this.sampleStart.equalTo(that.sampleStart))
	    return false;
	if (!this.sampleEnd.equalTo(that.sampleEnd))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Sample clone() {
	Sample copy = (Sample)super.clone();
	copy.sampleStart = sampleStart.clone();
	copy.sampleEnd = sampleEnd.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.sampleStart != null ? this.sampleStart.hashCode() : 0);
	hash = 41 * hash + (this.sampleEnd != null ? this.sampleEnd.hashCode() : 0);
	return hash;
    }
} // End class definition for Sample
