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


package com.example.glosanewapp.j2735.addgrpc;

import com.example.glosanewapp.j2735.dsrc.NodeOffsetPointXY;
import com.example.glosanewapp.j2735.dsrc.SignalGroupID;
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
 * Define the SignalHeadLocation ASN.1 type included in the AddGrpC ASN.1 module.
 * @see Sequence
 */

public class SignalHeadLocation extends Sequence {
    public NodeOffsetPointXY node;
    public SignalGroupID signalGroupID;
    
    /**
     * The default constructor.
     */
    public SignalHeadLocation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalHeadLocation(NodeOffsetPointXY node, 
		    SignalGroupID signalGroupID)
    {
	setNode(node);
	setSignalGroupID(signalGroupID);
    }
    
    
    // Methods for field "node"
    public NodeOffsetPointXY getNode()
    {
	return this.node;
    }
    
    public void setNode(NodeOffsetPointXY node)
    {
	this.node = node;
    }
    
    
    // Methods for field "signalGroupID"
    public SignalGroupID getSignalGroupID()
    {
	return this.signalGroupID;
    }
    
    public void setSignalGroupID(SignalGroupID signalGroupID)
    {
	this.signalGroupID = signalGroupID;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__node("node"),
	__signalGroupID("signalGroupID"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SignalHeadLocation data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'node'
	try {
	    NodeOffsetPointXY item1 = data.node;

	    nbits += NodeOffsetPointXY.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("node", "NodeOffsetPointXY");
	    throw ee;
	}
	// Encode field 'signalGroupID'
	try {
	    SignalGroupID item1 = data.signalGroupID;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("signalGroupID", "SignalGroupID");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SignalHeadLocation decodeValue(PerCoder coder, InputBitStream source, SignalHeadLocation data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'node'
	try {
	    if (data.node == null)
		data.node = new NodeOffsetPointXY();
	    data.node.decodeValue(coder, source, data.node);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("node", "NodeOffsetPointXY");
	    throw de;
	}
	// Decode field 'signalGroupID'
	try {
	    long temp1;

	    if (data.signalGroupID == null)
		data.signalGroupID = new SignalGroupID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.signalGroupID.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("signalGroupID", "SignalGroupID");
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
	// Encode field 'node'
	try {
	    NodeOffsetPointXY item1 = this.node;

	    {
		sink.encodeKey("node");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("node", "NodeOffsetPointXY");
	    throw ee;
	}
	// Encode field 'signalGroupID'
	try {
	    SignalGroupID item1 = this.signalGroupID;

	    {
		sink.writeSeparator();
		sink.encodeKey("signalGroupID");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("signalGroupID", "SignalGroupID");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SignalHeadLocation decodeValue(JsonCoder coder, JsonReader source)
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
		    case __node:
		    // Decode field 'node'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.node == null)
			    this.node = new NodeOffsetPointXY();
			this.node.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("node", "NodeOffsetPointXY");
			throw de;
		    }
		    break;
		    case __signalGroupID:
		    // Decode field 'signalGroupID'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.signalGroupID == null)
			    this.signalGroupID = new SignalGroupID();
			this.signalGroupID.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("signalGroupID", "SignalGroupID");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'node'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'signalGroupID'");
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
	    writer.print("node ");
	    this.node.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("signalGroupID ");
	    writer.print(this.signalGroupID.longValue());
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
	return equalTo((SignalHeadLocation)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SignalHeadLocation)that);
    }
    
    public boolean equalTo(SignalHeadLocation that) {
	if (!this.node.equalTo(that.node))
	    return false;
	if (!this.signalGroupID.equalTo(that.signalGroupID))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SignalHeadLocation clone() {
	SignalHeadLocation copy = (SignalHeadLocation)super.clone();
	copy.node = node.clone();
	copy.signalGroupID = signalGroupID.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.node != null ? this.node.hashCode() : 0);
	hash = 41 * hash + (this.signalGroupID != null ? this.signalGroupID.hashCode() : 0);
	return hash;
    }
} // End class definition for SignalHeadLocation
