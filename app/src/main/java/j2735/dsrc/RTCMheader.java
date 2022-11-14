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
 * Define the RTCMheader ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RTCMheader extends Sequence {
    public GNSSstatus status;
    public AntennaOffsetSet offsetSet;
    
    /**
     * The default constructor.
     */
    public RTCMheader()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RTCMheader(GNSSstatus status, AntennaOffsetSet offsetSet)
    {
	setStatus(status);
	setOffsetSet(offsetSet);
    }
    
    
    // Methods for field "status"
    public GNSSstatus getStatus()
    {
	return this.status;
    }
    
    public void setStatus(GNSSstatus status)
    {
	this.status = status;
    }
    
    
    // Methods for field "offsetSet"
    public AntennaOffsetSet getOffsetSet()
    {
	return this.offsetSet;
    }
    
    public void setOffsetSet(AntennaOffsetSet offsetSet)
    {
	this.offsetSet = offsetSet;
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_status = 
	GNSSstatus._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__status("status"),
	__offsetSet("offsetSet"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RTCMheader data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'status'
	try {
	    GNSSstatus item1 = data.status;
	    int len1 = item1.getSize();
	    int total_len1;

	    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, RTCMheader._cBounds_status);
	    if (total_len1 != 8)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
	    nbits += (com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 8, 8, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "GNSSstatus");
	    throw ee;
	}
	// Encode field 'offsetSet'
	try {
	    AntennaOffsetSet item1 = data.offsetSet;

	    nbits += AntennaOffsetSet.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offsetSet", "AntennaOffsetSet");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static RTCMheader decodeValue(PerCoder coder, InputBitStream source, RTCMheader data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'status'
	try {
	    if (data.status == null)
		data.status = new GNSSstatus();
	    com.oss.coders.per.PerBitstring.decode(coder, source, 8, 8, data.status);
	    if (coder.isStrictCodingEnabled() && data.status.getSize() >
		com.oss.util.BitTool.computeMinimalLength(data.status, RTCMheader._cBounds_status))
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
		    "trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("status", "GNSSstatus");
	    throw de;
	}
	// Decode field 'offsetSet'
	try {
	    if (data.offsetSet == null)
		data.offsetSet = new AntennaOffsetSet();
	    data.offsetSet.decodeValue(coder, source, data.offsetSet);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("offsetSet", "AntennaOffsetSet");
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
	// Encode field 'status'
	try {
	    GNSSstatus item1 = this.status;

	    {
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("status");
		coder.encodeBitStringWithNamedBits(temp1, len1, 8, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "GNSSstatus");
	    throw ee;
	}
	// Encode field 'offsetSet'
	try {
	    AntennaOffsetSet item1 = this.offsetSet;

	    {
		sink.writeSeparator();
		sink.encodeKey("offsetSet");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offsetSet", "AntennaOffsetSet");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RTCMheader decodeValue(JsonCoder coder, JsonReader source)
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
		    case __status:
		    // Decode field 'status'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.status == null)
			    this.status = new GNSSstatus();
			coder.decodeBitString(8, source, this.status);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("status", "GNSSstatus");
			throw de;
		    }
		    break;
		    case __offsetSet:
		    // Decode field 'offsetSet'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.offsetSet == null)
			    this.offsetSet = new AntennaOffsetSet();
			this.offsetSet.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("offsetSet", "AntennaOffsetSet");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'status'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'offsetSet'");
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
	    writer.print("status ");
	    printer.print(this.status, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("offsetSet ");
	    this.offsetSet.printValue(printer, writer);
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
	return equalTo((RTCMheader)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RTCMheader)that);
    }
    
    public boolean equalTo(RTCMheader that) {
	if (!this.status.equalTo(that.status))
	    return false;
	if (!this.offsetSet.equalTo(that.offsetSet))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RTCMheader clone() {
	RTCMheader copy = (RTCMheader)super.clone();
	copy.status = status.clone();
	copy.offsetSet = offsetSet.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.status != null ? this.status.hashCode() : 0);
	hash = 41 * hash + (this.offsetSet != null ? this.offsetSet.hashCode() : 0);
	return hash;
    }
} // End class definition for RTCMheader
