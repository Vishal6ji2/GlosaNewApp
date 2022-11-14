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
 * Define the Header ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class Header extends Sequence {
    public DYear year;
    public MinuteOfTheYear timeStamp;
    public DSecond secMark;
    public MsgCount msgIssueRevision;
    
    /**
     * The default constructor.
     */
    public Header()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Header(DYear year, MinuteOfTheYear timeStamp, DSecond secMark, 
		    MsgCount msgIssueRevision)
    {
	setYear(year);
	setTimeStamp(timeStamp);
	setSecMark(secMark);
	setMsgIssueRevision(msgIssueRevision);
    }
    
    
    // Methods for field "year"
    public DYear getYear()
    {
	return this.year;
    }
    
    public void setYear(DYear year)
    {
	this.year = year;
    }
    
    public boolean hasYear()
    {
	return (year != null);
    }
    
    public void deleteYear()
    {
	year = null;
    }
    
    
    // Methods for field "timeStamp"
    public MinuteOfTheYear getTimeStamp()
    {
	return this.timeStamp;
    }
    
    public void setTimeStamp(MinuteOfTheYear timeStamp)
    {
	this.timeStamp = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return (timeStamp != null);
    }
    
    public void deleteTimeStamp()
    {
	timeStamp = null;
    }
    
    
    // Methods for field "secMark"
    public DSecond getSecMark()
    {
	return this.secMark;
    }
    
    public void setSecMark(DSecond secMark)
    {
	this.secMark = secMark;
    }
    
    public boolean hasSecMark()
    {
	return (secMark != null);
    }
    
    public void deleteSecMark()
    {
	secMark = null;
    }
    
    
    // Methods for field "msgIssueRevision"
    public MsgCount getMsgIssueRevision()
    {
	return this.msgIssueRevision;
    }
    
    public void setMsgIssueRevision(MsgCount msgIssueRevision)
    {
	this.msgIssueRevision = msgIssueRevision;
    }
    
    public boolean hasMsgIssueRevision()
    {
	return (msgIssueRevision != null);
    }
    
    public void deleteMsgIssueRevision()
    {
	msgIssueRevision = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__year("year"),
	__timeStamp("timeStamp"),
	__secMark("secMark"),
	__msgIssueRevision("msgIssueRevision"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Header data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.year != null);
	sink.writeBit(data.timeStamp != null);
	sink.writeBit(data.secMark != null);
	sink.writeBit(data.msgIssueRevision != null);
	nbits += 5;
	if (data.year != null) {
	    // Encode field 'year'
	    try {
		DYear item1 = data.year;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 4095)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 4095, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("year", "DYear");
		throw ee;
	    }
	}
	if (data.timeStamp != null) {
	    // Encode field 'timeStamp'
	    try {
		MinuteOfTheYear item1 = data.timeStamp;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 527040)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 527040, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeStamp", "MinuteOfTheYear");
		throw ee;
	    }
	}
	if (data.secMark != null) {
	    // Encode field 'secMark'
	    try {
		DSecond item1 = data.secMark;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("secMark", "DSecond");
		throw ee;
	    }
	}
	if (data.msgIssueRevision != null) {
	    // Encode field 'msgIssueRevision'
	    try {
		MsgCount item1 = data.msgIssueRevision;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("msgIssueRevision", "MsgCount");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Header decodeValue(PerCoder coder, InputBitStream source, Header data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_year0 = source.readBit();
	boolean has_timeStamp0 = source.readBit();
	boolean has_secMark0 = source.readBit();
	boolean has_msgIssueRevision0 = source.readBit();
    /** Decode root fields **/
	if (has_year0) {
	    // Decode field 'year'
	    try {
		long temp1;

		if (data.year == null)
		    data.year = new DYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 4095);
		if (temp1 > 4095)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.year.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("year", "DYear");
		throw de;
	    }
	} else {
	    data.year = null;
	}
	if (has_timeStamp0) {
	    // Decode field 'timeStamp'
	    try {
		long temp1;

		if (data.timeStamp == null)
		    data.timeStamp = new MinuteOfTheYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 527040);
		if (temp1 > 527040)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.timeStamp.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeStamp", "MinuteOfTheYear");
		throw de;
	    }
	} else {
	    data.timeStamp = null;
	}
	if (has_secMark0) {
	    // Decode field 'secMark'
	    try {
		long temp1;

		if (data.secMark == null)
		    data.secMark = new DSecond();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.secMark.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("secMark", "DSecond");
		throw de;
	    }
	} else {
	    data.secMark = null;
	}
	if (has_msgIssueRevision0) {
	    // Decode field 'msgIssueRevision'
	    try {
		long temp1;

		if (data.msgIssueRevision == null)
		    data.msgIssueRevision = new MsgCount();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.msgIssueRevision.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("msgIssueRevision", "MsgCount");
		throw de;
	    }
	} else {
	    data.msgIssueRevision = null;
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
	// Encode field 'year'
	try {
	    DYear item1 = this.year;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("year");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "year");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("year", "DYear");
	    throw ee;
	}
	// Encode field 'timeStamp'
	try {
	    MinuteOfTheYear item1 = this.timeStamp;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("timeStamp");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "timeStamp");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeStamp", "MinuteOfTheYear");
	    throw ee;
	}
	// Encode field 'secMark'
	try {
	    DSecond item1 = this.secMark;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("secMark");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "secMark");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("secMark", "DSecond");
	    throw ee;
	}
	// Encode field 'msgIssueRevision'
	try {
	    MsgCount item1 = this.msgIssueRevision;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("msgIssueRevision");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "msgIssueRevision");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgIssueRevision", "MsgCount");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Header decodeValue(JsonCoder coder, JsonReader source)
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
		    case __year:
		    // Decode field 'year'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.year == null)
				this.year = new DYear();
			    this.year.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("year", "DYear");
			throw de;
		    }
		    break;
		    case __timeStamp:
		    // Decode field 'timeStamp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.timeStamp == null)
				this.timeStamp = new MinuteOfTheYear();
			    this.timeStamp.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeStamp", "MinuteOfTheYear");
			throw de;
		    }
		    break;
		    case __secMark:
		    // Decode field 'secMark'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.secMark == null)
				this.secMark = new DSecond();
			    this.secMark.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("secMark", "DSecond");
			throw de;
		    }
		    break;
		    case __msgIssueRevision:
		    // Decode field 'msgIssueRevision'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.msgIssueRevision == null)
				this.msgIssueRevision = new MsgCount();
			    this.msgIssueRevision.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgIssueRevision", "MsgCount");
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
	    this.year = null;
	if (!present0[1])
	    this.timeStamp = null;
	if (!present0[2])
	    this.secMark = null;
	if (!present0[3])
	    this.msgIssueRevision = null;
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
	if (this.year != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("year ");
		writer.print(this.year.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.timeStamp != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("timeStamp ");
		writer.print(this.timeStamp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.secMark != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("secMark ");
		writer.print(this.secMark.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.msgIssueRevision != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("msgIssueRevision ");
		writer.print(this.msgIssueRevision.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((Header)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Header)that);
    }
    
    public boolean equalTo(Header that) {
	if (this.year != null) {
	    if (that.year == null || !this.year.equalTo(that.year))
		return false;
	} else if (that.year != null)
	    return false;
	if (this.timeStamp != null) {
	    if (that.timeStamp == null || !this.timeStamp.equalTo(that.timeStamp))
		return false;
	} else if (that.timeStamp != null)
	    return false;
	if (this.secMark != null) {
	    if (that.secMark == null || !this.secMark.equalTo(that.secMark))
		return false;
	} else if (that.secMark != null)
	    return false;
	if (this.msgIssueRevision != null) {
	    if (that.msgIssueRevision == null || !this.msgIssueRevision.equalTo(that.msgIssueRevision))
		return false;
	} else if (that.msgIssueRevision != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Header clone() {
	Header copy = (Header)super.clone();
	if (year != null) {
	    copy.year = year.clone();
	}
	if (timeStamp != null) {
	    copy.timeStamp = timeStamp.clone();
	}
	if (secMark != null) {
	    copy.secMark = secMark.clone();
	}
	if (msgIssueRevision != null) {
	    copy.msgIssueRevision = msgIssueRevision.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.year != null ? this.year.hashCode() : 0);
	hash = 41 * hash + (this.timeStamp != null ? this.timeStamp.hashCode() : 0);
	hash = 41 * hash + (this.secMark != null ? this.secMark.hashCode() : 0);
	hash = 41 * hash + (this.msgIssueRevision != null ? this.msgIssueRevision.hashCode() : 0);
	return hash;
    }
} // End class definition for Header
