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
 * Define the PositionalAccuracy ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class PositionalAccuracy extends Sequence {
    public SemiMajorAxisAccuracy semiMajor;
    public SemiMinorAxisAccuracy semiMinor;
    public SemiMajorAxisOrientation orientation;
    
    /**
     * The default constructor.
     */
    public PositionalAccuracy()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PositionalAccuracy(SemiMajorAxisAccuracy semiMajor, 
		    SemiMinorAxisAccuracy semiMinor, 
		    SemiMajorAxisOrientation orientation)
    {
	setSemiMajor(semiMajor);
	setSemiMinor(semiMinor);
	setOrientation(orientation);
    }
    
    
    // Methods for field "semiMajor"
    public SemiMajorAxisAccuracy getSemiMajor()
    {
	return this.semiMajor;
    }
    
    public void setSemiMajor(SemiMajorAxisAccuracy semiMajor)
    {
	this.semiMajor = semiMajor;
    }
    
    
    // Methods for field "semiMinor"
    public SemiMinorAxisAccuracy getSemiMinor()
    {
	return this.semiMinor;
    }
    
    public void setSemiMinor(SemiMinorAxisAccuracy semiMinor)
    {
	this.semiMinor = semiMinor;
    }
    
    
    // Methods for field "orientation"
    public SemiMajorAxisOrientation getOrientation()
    {
	return this.orientation;
    }
    
    public void setOrientation(SemiMajorAxisOrientation orientation)
    {
	this.orientation = orientation;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__semiMajor("semiMajor"),
	__semiMinor("semiMinor"),
	__orientation("orientation"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PositionalAccuracy data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'semiMajor'
	try {
	    SemiMajorAxisAccuracy item1 = data.semiMajor;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("semiMajor", "SemiMajorAxisAccuracy");
	    throw ee;
	}
	// Encode field 'semiMinor'
	try {
	    SemiMinorAxisAccuracy item1 = data.semiMinor;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("semiMinor", "SemiMinorAxisAccuracy");
	    throw ee;
	}
	// Encode field 'orientation'
	try {
	    SemiMajorAxisOrientation item1 = data.orientation;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 65535)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("orientation", "SemiMajorAxisOrientation");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static PositionalAccuracy decodeValue(PerCoder coder, InputBitStream source, PositionalAccuracy data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'semiMajor'
	try {
	    long temp1;

	    if (data.semiMajor == null)
		data.semiMajor = new SemiMajorAxisAccuracy();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.semiMajor.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("semiMajor", "SemiMajorAxisAccuracy");
	    throw de;
	}
	// Decode field 'semiMinor'
	try {
	    long temp1;

	    if (data.semiMinor == null)
		data.semiMinor = new SemiMinorAxisAccuracy();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.semiMinor.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("semiMinor", "SemiMinorAxisAccuracy");
	    throw de;
	}
	// Decode field 'orientation'
	try {
	    long temp1;

	    if (data.orientation == null)
		data.orientation = new SemiMajorAxisOrientation();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.orientation.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("orientation", "SemiMajorAxisOrientation");
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
	// Encode field 'semiMajor'
	try {
	    SemiMajorAxisAccuracy item1 = this.semiMajor;

	    {
		sink.encodeKey("semiMajor");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("semiMajor", "SemiMajorAxisAccuracy");
	    throw ee;
	}
	// Encode field 'semiMinor'
	try {
	    SemiMinorAxisAccuracy item1 = this.semiMinor;

	    {
		sink.writeSeparator();
		sink.encodeKey("semiMinor");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("semiMinor", "SemiMinorAxisAccuracy");
	    throw ee;
	}
	// Encode field 'orientation'
	try {
	    SemiMajorAxisOrientation item1 = this.orientation;

	    {
		sink.writeSeparator();
		sink.encodeKey("orientation");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("orientation", "SemiMajorAxisOrientation");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public PositionalAccuracy decodeValue(JsonCoder coder, JsonReader source)
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
		    case __semiMajor:
		    // Decode field 'semiMajor'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.semiMajor == null)
			    this.semiMajor = new SemiMajorAxisAccuracy();
			this.semiMajor.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("semiMajor", "SemiMajorAxisAccuracy");
			throw de;
		    }
		    break;
		    case __semiMinor:
		    // Decode field 'semiMinor'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.semiMinor == null)
			    this.semiMinor = new SemiMinorAxisAccuracy();
			this.semiMinor.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("semiMinor", "SemiMinorAxisAccuracy");
			throw de;
		    }
		    break;
		    case __orientation:
		    // Decode field 'orientation'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.orientation == null)
			    this.orientation = new SemiMajorAxisOrientation();
			this.orientation.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("orientation", "SemiMajorAxisOrientation");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'semiMajor'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'semiMinor'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'orientation'");
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
	    writer.print("semiMajor ");
	    writer.print(this.semiMajor.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("semiMinor ");
	    writer.print(this.semiMinor.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("orientation ");
	    writer.print(this.orientation.longValue());
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
	return equalTo((PositionalAccuracy)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PositionalAccuracy)that);
    }
    
    public boolean equalTo(PositionalAccuracy that) {
	if (!this.semiMajor.equalTo(that.semiMajor))
	    return false;
	if (!this.semiMinor.equalTo(that.semiMinor))
	    return false;
	if (!this.orientation.equalTo(that.orientation))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public PositionalAccuracy clone() {
	PositionalAccuracy copy = (PositionalAccuracy)super.clone();
	copy.semiMajor = semiMajor.clone();
	copy.semiMinor = semiMinor.clone();
	copy.orientation = orientation.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.semiMajor != null ? this.semiMajor.hashCode() : 0);
	hash = 41 * hash + (this.semiMinor != null ? this.semiMinor.hashCode() : 0);
	hash = 41 * hash + (this.orientation != null ? this.orientation.hashCode() : 0);
	return hash;
    }
} // End class definition for PositionalAccuracy
