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
 * Define the RTCMPackage ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RTCMPackage extends Sequence {
    public RTCMheader rtcmHeader;
    public RTCMmessageList msgs;
    
    /**
     * The default constructor.
     */
    public RTCMPackage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RTCMPackage(RTCMheader rtcmHeader, RTCMmessageList msgs)
    {
	setRtcmHeader(rtcmHeader);
	setMsgs(msgs);
    }
    
    /**
     * Construct with required components.
     */
    public RTCMPackage(RTCMmessageList msgs)
    {
	setMsgs(msgs);
    }
    
    
    // Methods for field "rtcmHeader"
    public RTCMheader getRtcmHeader()
    {
	return this.rtcmHeader;
    }
    
    public void setRtcmHeader(RTCMheader rtcmHeader)
    {
	this.rtcmHeader = rtcmHeader;
    }
    
    public boolean hasRtcmHeader()
    {
	return (rtcmHeader != null);
    }
    
    public void deleteRtcmHeader()
    {
	rtcmHeader = null;
    }
    
    
    // Methods for field "msgs"
    public RTCMmessageList getMsgs()
    {
	return this.msgs;
    }
    
    public void setMsgs(RTCMmessageList msgs)
    {
	this.msgs = msgs;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__rtcmHeader("rtcmHeader"),
	__msgs("msgs"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RTCMPackage data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.rtcmHeader != null);
	nbits += 2;
	if (data.rtcmHeader != null) {
	    // Encode field 'rtcmHeader'
	    try {
		RTCMheader item1 = data.rtcmHeader;

		nbits += RTCMheader.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rtcmHeader", "RTCMheader");
		throw ee;
	    }
	}
	// Encode field 'msgs'
	try {
	    RTCMmessageList item1 = data.msgs;

	    nbits += RTCMmessageList.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgs", "RTCMmessageList");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static RTCMPackage decodeValue(PerCoder coder, InputBitStream source, RTCMPackage data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_rtcmHeader0 = source.readBit();
    /** Decode root fields **/
	if (has_rtcmHeader0) {
	    // Decode field 'rtcmHeader'
	    try {
		if (data.rtcmHeader == null)
		    data.rtcmHeader = new RTCMheader();
		data.rtcmHeader.decodeValue(coder, source, data.rtcmHeader);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rtcmHeader", "RTCMheader");
		throw de;
	    }
	} else {
	    data.rtcmHeader = null;
	}
	// Decode field 'msgs'
	try {
	    if (data.msgs == null)
		data.msgs = new RTCMmessageList();
	    data.msgs.decodeValue(coder, source, data.msgs);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgs", "RTCMmessageList");
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'rtcmHeader'
	try {
	    RTCMheader item1 = this.rtcmHeader;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("rtcmHeader");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "rtcmHeader");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rtcmHeader", "RTCMheader");
	    throw ee;
	}
	// Encode field 'msgs'
	try {
	    RTCMmessageList item1 = this.msgs;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("msgs");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgs", "RTCMmessageList");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RTCMPackage decodeValue(JsonCoder coder, JsonReader source)
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
		    case __rtcmHeader:
		    // Decode field 'rtcmHeader'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rtcmHeader == null)
				this.rtcmHeader = new RTCMheader();
			    this.rtcmHeader.decodeValue(coder, source);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rtcmHeader", "RTCMheader");
			throw de;
		    }
		    break;
		    case __msgs:
		    // Decode field 'msgs'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.msgs == null)
			    this.msgs = new RTCMmessageList();
			this.msgs.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgs", "RTCMmessageList");
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
	    this.rtcmHeader = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'msgs'");
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
	if (this.rtcmHeader != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("rtcmHeader ");
		this.rtcmHeader.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("msgs ");
	    this.msgs.printValue(printer, writer);
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
	return equalTo((RTCMPackage)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RTCMPackage)that);
    }
    
    public boolean equalTo(RTCMPackage that) {
	if (this.rtcmHeader != null) {
	    if (that.rtcmHeader == null || !this.rtcmHeader.equalTo(that.rtcmHeader))
		return false;
	} else if (that.rtcmHeader != null)
	    return false;
	if (!this.msgs.equalTo(that.msgs))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RTCMPackage clone() {
	RTCMPackage copy = (RTCMPackage)super.clone();
	if (rtcmHeader != null) {
	    copy.rtcmHeader = rtcmHeader.clone();
	}
	copy.msgs = msgs.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.rtcmHeader != null ? this.rtcmHeader.hashCode() : 0);
	hash = 41 * hash + (this.msgs != null ? this.msgs.hashCode() : 0);
	return hash;
    }
} // End class definition for RTCMPackage
