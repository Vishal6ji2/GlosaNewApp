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
 * Define the PositionConfidenceSet ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class PositionConfidenceSet extends Sequence {
    public PositionConfidence pos;
    public ElevationConfidence elevation;
    
    /**
     * The default constructor.
     */
    public PositionConfidenceSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PositionConfidenceSet(PositionConfidence pos, 
		    ElevationConfidence elevation)
    {
	setPos(pos);
	setElevation(elevation);
    }
    
    
    // Methods for field "pos"
    public PositionConfidence getPos()
    {
	return this.pos;
    }
    
    public void setPos(PositionConfidence pos)
    {
	this.pos = pos;
    }
    
    
    // Methods for field "elevation"
    public ElevationConfidence getElevation()
    {
	return this.elevation;
    }
    
    public void setElevation(ElevationConfidence elevation)
    {
	this.elevation = elevation;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__pos("pos"),
	__elevation("elevation"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PositionConfidenceSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'pos'
	try {
	    PositionConfidence item1 = data.pos;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pos", "PositionConfidence");
	    throw ee;
	}
	// Encode field 'elevation'
	try {
	    ElevationConfidence item1 = data.elevation;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elevation", "ElevationConfidence");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static PositionConfidenceSet decodeValue(PerCoder coder, InputBitStream source, PositionConfidenceSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'pos'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
	    if (idx1 < 0 || idx1 > 15)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.pos = PositionConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("pos", "PositionConfidence");
	    throw de;
	}
	// Decode field 'elevation'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
	    if (idx1 < 0 || idx1 > 15)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.elevation = ElevationConfidence.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("elevation", "ElevationConfidence");
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
	// Encode field 'pos'
	try {
	    PositionConfidence item1 = this.pos;

	    {
		sink.encodeKey("pos");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pos", "PositionConfidence");
	    throw ee;
	}
	// Encode field 'elevation'
	try {
	    ElevationConfidence item1 = this.elevation;

	    {
		sink.writeSeparator();
		sink.encodeKey("elevation");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("elevation", "ElevationConfidence");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public PositionConfidenceSet decodeValue(JsonCoder coder, JsonReader source)
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
		    case __pos:
		    // Decode field 'pos'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			PositionConfidence temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(PositionConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = PositionConfidence.cNamedNumbers[idx1];
			this.pos = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pos", "PositionConfidence");
			throw de;
		    }
		    break;
		    case __elevation:
		    // Decode field 'elevation'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			ElevationConfidence temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(ElevationConfidence.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = ElevationConfidence.cNamedNumbers[idx1];
			this.elevation = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("elevation", "ElevationConfidence");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'pos'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'elevation'");
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
	    writer.print("pos ");
	    printer.print(this.pos, writer, this.pos.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("elevation ");
	    printer.print(this.elevation, writer, this.elevation.cConstantNameList);
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
	return equalTo((PositionConfidenceSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PositionConfidenceSet)that);
    }
    
    public boolean equalTo(PositionConfidenceSet that) {
	if (!this.pos.equalTo(that.pos))
	    return false;
	if (!this.elevation.equalTo(that.elevation))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public PositionConfidenceSet clone() {
	PositionConfidenceSet copy = (PositionConfidenceSet)super.clone();
	copy.pos = pos.clone();
	copy.elevation = elevation.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.pos != null ? this.pos.hashCode() : 0);
	hash = 41 * hash + (this.elevation != null ? this.elevation.hashCode() : 0);
	return hash;
    }
} // End class definition for PositionConfidenceSet
