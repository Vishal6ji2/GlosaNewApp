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
 * Define the LongitudeDMS2 ASN.1 type included in the AddGrpB ASN.1 module.
 * @see Sequence
 */

public class LongitudeDMS2 extends Sequence {
    public DegreesLong d;
    public MinutesAngle m;
    public SecondsAngle s;
    
    /**
     * The default constructor.
     */
    public LongitudeDMS2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LongitudeDMS2(DegreesLong d, MinutesAngle m, SecondsAngle s)
    {
	setD(d);
	setM(m);
	setS(s);
    }
    
    
    // Methods for field "d"
    public DegreesLong getD()
    {
	return this.d;
    }
    
    public void setD(DegreesLong d)
    {
	this.d = d;
    }
    
    
    // Methods for field "m"
    public MinutesAngle getM()
    {
	return this.m;
    }
    
    public void setM(MinutesAngle m)
    {
	this.m = m;
    }
    
    
    // Methods for field "s"
    public SecondsAngle getS()
    {
	return this.s;
    }
    
    public void setS(SecondsAngle s)
    {
	this.s = s;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__d("d"),
	__m("m"),
	__s("s"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, LongitudeDMS2 data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'd'
	try {
	    DegreesLong item1 = data.d;
	    long temp1 = item1.longValue();

	    if (temp1 < -180 || temp1 > 180)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += (coder.encodeConstrainedWholeNumber(temp1, -180, 180, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("d", "DegreesLong");
	    throw ee;
	}
	// Encode field 'm'
	try {
	    MinutesAngle item1 = data.m;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 59)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 59, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("m", "MinutesAngle");
	    throw ee;
	}
	// Encode field 's'
	try {
	    SecondsAngle item1 = data.s;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 5999)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 5999, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("s", "SecondsAngle");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static LongitudeDMS2 decodeValue(PerCoder coder, InputBitStream source, LongitudeDMS2 data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'd'
	try {
	    long temp1;

	    if (data.d == null)
		data.d = new DegreesLong();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -180, 180);
	    if (temp1 > 180)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.d.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("d", "DegreesLong");
	    throw de;
	}
	// Decode field 'm'
	try {
	    long temp1;

	    if (data.m == null)
		data.m = new MinutesAngle();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 59);
	    if (temp1 > 59)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.m.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("m", "MinutesAngle");
	    throw de;
	}
	// Decode field 's'
	try {
	    long temp1;

	    if (data.s == null)
		data.s = new SecondsAngle();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 5999);
	    if (temp1 > 5999)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.s.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("s", "SecondsAngle");
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
	// Encode field 'd'
	try {
	    DegreesLong item1 = this.d;

	    {
		sink.encodeKey("d");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("d", "DegreesLong");
	    throw ee;
	}
	// Encode field 'm'
	try {
	    MinutesAngle item1 = this.m;

	    {
		sink.writeSeparator();
		sink.encodeKey("m");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("m", "MinutesAngle");
	    throw ee;
	}
	// Encode field 's'
	try {
	    SecondsAngle item1 = this.s;

	    {
		sink.writeSeparator();
		sink.encodeKey("s");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("s", "SecondsAngle");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public LongitudeDMS2 decodeValue(JsonCoder coder, JsonReader source)
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
		    case __d:
		    // Decode field 'd'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.d == null)
			    this.d = new DegreesLong();
			this.d.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("d", "DegreesLong");
			throw de;
		    }
		    break;
		    case __m:
		    // Decode field 'm'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.m == null)
			    this.m = new MinutesAngle();
			this.m.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("m", "MinutesAngle");
			throw de;
		    }
		    break;
		    case __s:
		    // Decode field 's'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.s == null)
			    this.s = new SecondsAngle();
			this.s.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("s", "SecondsAngle");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'d'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'m'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'s'");
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
	    writer.print("d ");
	    writer.print(this.d.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("m ");
	    writer.print(this.m.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("s ");
	    writer.print(this.s.longValue());
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
	return equalTo((LongitudeDMS2)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((LongitudeDMS2)that);
    }
    
    public boolean equalTo(LongitudeDMS2 that) {
	if (!this.d.equalTo(that.d))
	    return false;
	if (!this.m.equalTo(that.m))
	    return false;
	if (!this.s.equalTo(that.s))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public LongitudeDMS2 clone() {
	LongitudeDMS2 copy = (LongitudeDMS2)super.clone();
	copy.d = d.clone();
	copy.m = m.clone();
	copy.s = s.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.d != null ? this.d.hashCode() : 0);
	hash = 41 * hash + (this.m != null ? this.m.hashCode() : 0);
	hash = 41 * hash + (this.s != null ? this.s.hashCode() : 0);
	return hash;
    }
} // End class definition for LongitudeDMS2
