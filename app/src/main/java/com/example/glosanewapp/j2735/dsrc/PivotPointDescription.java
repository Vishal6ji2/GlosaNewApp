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
 * Define the PivotPointDescription ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class PivotPointDescription extends Sequence {
    public Offset_B11 pivotOffset;
    public Angle pivotAngle;
    public PivotingAllowed pivots;
    
    /**
     * The default constructor.
     */
    public PivotPointDescription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PivotPointDescription(Offset_B11 pivotOffset, Angle pivotAngle, 
		    PivotingAllowed pivots)
    {
	setPivotOffset(pivotOffset);
	setPivotAngle(pivotAngle);
	setPivots(pivots);
    }
    
    
    // Methods for field "pivotOffset"
    public Offset_B11 getPivotOffset()
    {
	return this.pivotOffset;
    }
    
    public void setPivotOffset(Offset_B11 pivotOffset)
    {
	this.pivotOffset = pivotOffset;
    }
    
    
    // Methods for field "pivotAngle"
    public Angle getPivotAngle()
    {
	return this.pivotAngle;
    }
    
    public void setPivotAngle(Angle pivotAngle)
    {
	this.pivotAngle = pivotAngle;
    }
    
    
    // Methods for field "pivots"
    public PivotingAllowed getPivots()
    {
	return this.pivots;
    }
    
    public void setPivots(PivotingAllowed pivots)
    {
	this.pivots = pivots;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__pivotOffset("pivotOffset"),
	__pivotAngle("pivotAngle"),
	__pivots("pivots"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PivotPointDescription data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'pivotOffset'
	try {
	    Offset_B11 item1 = data.pivotOffset;
	    long temp1 = item1.longValue();

	    if (temp1 < -1024 || temp1 > 1023)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, -1024, 1023, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pivotOffset", "Offset-B11");
	    throw ee;
	}
	// Encode field 'pivotAngle'
	try {
	    Angle item1 = data.pivotAngle;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 28800)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pivotAngle", "Angle");
	    throw ee;
	}
	// Encode field 'pivots'
	try {
	    PivotingAllowed item1 = data.pivots;

	    sink.writeBit(item1.booleanValue());
	    nbits += (1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pivots", "PivotingAllowed");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static PivotPointDescription decodeValue(PerCoder coder, InputBitStream source, PivotPointDescription data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'pivotOffset'
	try {
	    long temp1;

	    if (data.pivotOffset == null)
		data.pivotOffset = new Offset_B11();
	    temp1 = coder.decodeConstrainedWholeNumber(source, -1024, 1023);
	    if (temp1 > 1023)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.pivotOffset.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("pivotOffset", "Offset-B11");
	    throw de;
	}
	// Decode field 'pivotAngle'
	try {
	    long temp1;

	    if (data.pivotAngle == null)
		data.pivotAngle = new Angle();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
	    if (temp1 > 28800)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.pivotAngle.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("pivotAngle", "Angle");
	    throw de;
	}
	// Decode field 'pivots'
	try {
	    if (data.pivots == null)
		data.pivots = new PivotingAllowed();
	    data.pivots.setValue(source.readBit());
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("pivots", "PivotingAllowed");
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
	// Encode field 'pivotOffset'
	try {
	    Offset_B11 item1 = this.pivotOffset;

	    {
		sink.encodeKey("pivotOffset");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pivotOffset", "Offset-B11");
	    throw ee;
	}
	// Encode field 'pivotAngle'
	try {
	    Angle item1 = this.pivotAngle;

	    {
		sink.writeSeparator();
		sink.encodeKey("pivotAngle");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pivotAngle", "Angle");
	    throw ee;
	}
	// Encode field 'pivots'
	try {
	    PivotingAllowed item1 = this.pivots;

	    {
		sink.writeSeparator();
		sink.encodeKey("pivots");
		sink.writeBoolean(item1.booleanValue());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pivots", "PivotingAllowed");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public PivotPointDescription decodeValue(JsonCoder coder, JsonReader source)
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
		    case __pivotOffset:
		    // Decode field 'pivotOffset'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.pivotOffset == null)
			    this.pivotOffset = new Offset_B11();
			this.pivotOffset.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pivotOffset", "Offset-B11");
			throw de;
		    }
		    break;
		    case __pivotAngle:
		    // Decode field 'pivotAngle'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.pivotAngle == null)
			    this.pivotAngle = new Angle();
			this.pivotAngle.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pivotAngle", "Angle");
			throw de;
		    }
		    break;
		    case __pivots:
		    // Decode field 'pivots'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.pivots == null)
			    this.pivots = new PivotingAllowed();
			this.pivots.setValue(coder.decodeBoolean(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pivots", "PivotingAllowed");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'pivotOffset'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'pivotAngle'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'pivots'");
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
	    writer.print("pivotOffset ");
	    writer.print(this.pivotOffset.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("pivotAngle ");
	    writer.print(this.pivotAngle.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("pivots ");
	    printer.print(this.pivots, writer);
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
	return equalTo((PivotPointDescription)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PivotPointDescription)that);
    }
    
    public boolean equalTo(PivotPointDescription that) {
	if (!this.pivotOffset.equalTo(that.pivotOffset))
	    return false;
	if (!this.pivotAngle.equalTo(that.pivotAngle))
	    return false;
	if (!this.pivots.equalTo(that.pivots))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public PivotPointDescription clone() {
	PivotPointDescription copy = (PivotPointDescription)super.clone();
	copy.pivotOffset = pivotOffset.clone();
	copy.pivotAngle = pivotAngle.clone();
	copy.pivots = pivots.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.pivotOffset != null ? this.pivotOffset.hashCode() : 0);
	hash = 41 * hash + (this.pivotAngle != null ? this.pivotAngle.hashCode() : 0);
	hash = 41 * hash + (this.pivots != null ? this.pivots.hashCode() : 0);
	return hash;
    }
} // End class definition for PivotPointDescription
