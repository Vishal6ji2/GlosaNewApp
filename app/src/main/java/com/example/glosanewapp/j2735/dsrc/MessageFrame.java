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
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.per.PerCoder;
import com.oss.metadata.*;
import com.oss.util.ExceptionDescriptor;

import java.io.IOException;

/**
 * Define the MessageFrame ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class MessageFrame extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public DSRCmsgID messageId;
    public OpenType value;
    
    /**
     * The default constructor.
     */
    public MessageFrame()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MessageFrame(DSRCmsgID messageId, OpenType value)
    {
	setMessageId(messageId);
	setValue(value);
    }
    
    
    // Methods for field "messageId"
    public DSRCmsgID getMessageId()
    {
	return this.messageId;
    }
    
    public void setMessageId(DSRCmsgID messageId)
    {
	this.messageId = messageId;
    }
    
    
    // Methods for field "value"
    public OpenType getValue()
    {
	return this.value;
    }
    
    public void setValue(OpenType value)
    {
	this.value = value;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__messageId("messageId"),
	__value("value"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, MessageFrame data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'messageId'
	try {
	    DSRCmsgID item1 = data.messageId;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 32767)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("messageId", "DSRCmsgID");
	    throw ee;
	}
	// Encode field 'value'
	try {
	    OpenType item1 = data.value;

	    nbits += com.oss.coders.per.PerOpenType.encode(coder, item1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("value", "OpenType");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Encode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int encode(PerCoder coder, OutputBitStream sink)
	    throws EncoderException
    {
	try {
	    return this.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "MessageFrame");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static MessageFrame decodeValue(PerCoder coder, InputBitStream source, MessageFrame data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	AbstractData outermost0;
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	outermost0 = coder.setScope(data);
    /** Decode root fields **/
	// Decode field 'messageId'
	try {
	    long temp1;

	    if (data.messageId == null)
		data.messageId = new DSRCmsgID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
	    if (temp1 > 32767)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.messageId.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("messageId", "DSRCmsgID");
	    throw de;
	}
	// Decode field 'value'
	try {
	    boolean processed1 = false;

	    if (coder.getOption(com.oss.coders.Coder.cAUTOMATIC_ENCDEC)) {
		ASN1Type otype_pdu1 = null;
		MESSAGE_ID_AND_TYPE_OSET oset1 = DSRC.messageTypes;
		MESSAGE_ID_AND_TYPE infoobj1 = null;

		DSRCmsgID _ref_1_1 = data.messageId;
		infoobj1 = oset1.getObject(_ref_1_1);
		if (infoobj1 != null) { 
		    otype_pdu1 = infoobj1.Type;
		}
		if (otype_pdu1 != null) 
		{
		    AbstractData otype1 = otype_pdu1.newInstance();

		    if (otype1 instanceof PERDecodable) {
			try {
			    data.value = new OpenType(com.oss.coders.per.PerOpenType.decode(coder, source, (PERDecodable)otype1));
			    processed1 = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext(null, otype1.getTypeName());
			    throw de;
			}
		    }
		}
	    }
	    if (!processed1) {
		data.value = new OpenType(com.oss.coders.per.PerOctets.decode(coder, source, -1));
	    }
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("value", "OpenType");
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
	coder.setScope(outermost0);
	return data;
    }

    /**
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "MessageFrame");
	    throw de;
	}
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
	// Encode field 'messageId'
	try {
	    DSRCmsgID item1 = this.messageId;

	    {
		sink.encodeKey("messageId");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("messageId", "DSRCmsgID");
	    throw ee;
	}
	// Encode field 'value'
	try {
	    OpenType item1 = this.value;

	    {
		sink.writeSeparator();
		sink.encodeKey("value");
		com.oss.coders.json.JsonOpenType.encode(coder, item1, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("value", "OpenType");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Encode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encode(JsonCoder coder, JsonWriter sink)
	    throws EncoderException
    {
	try {
	    this.encodeValue(coder, sink);

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "MessageFrame");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public MessageFrame decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[3];
	AbstractData outermost0;

	outermost0 = coder.setScope(this);
	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __messageId:
		    // Decode field 'messageId'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.messageId == null)
			    this.messageId = new DSRCmsgID();
			this.messageId.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("messageId", "DSRCmsgID");
			throw de;
		    }
		    break;
		    case __value:
		    // Decode field 'value'
		    try {
			boolean processed1 = false;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.value == null)
			    this.value = new OpenType();
			if (coder.getOption(com.oss.coders.Coder.cAUTOMATIC_ENCDEC)) {
			    ASN1Type otype_pdu1 = null;
			    MESSAGE_ID_AND_TYPE_OSET oset1 = DSRC.messageTypes;
			    MESSAGE_ID_AND_TYPE infoobj1 = null;

			    DSRCmsgID _ref_1_1 = this.messageId;
			    infoobj1 = oset1.getObject(_ref_1_1);
			    if (infoobj1 != null) { 
				otype_pdu1 = infoobj1.Type;
			    }
			    if (otype_pdu1 != null) 
			    {
				AbstractData otype1 = otype_pdu1.newInstance();

				if (otype1 instanceof JSONDecodable) {
				    try {
					this.value.setDecodedValue(com.oss.coders.json.JsonOpenType.decode(coder, source, (JSONDecodable)otype1));
					this.value.setEncodedValue(null);
					processed1 = true;
				    } catch (Exception e) {
					DecoderException de = DecoderException.wrapException(e);
					de.appendFieldContext(null, otype1.getTypeName());
					throw de;
				    }
				}
			    }
			}
			if (!processed1) {
			    this.value.setEncodedValue(coder.captureRawValue(source));
			    this.value.setDecodedValue(null);
			}
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("value", "OpenType");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'messageId'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'value'");
	coder.setScope(outermost0);
	return this;
    }

    /**
     * Decode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(JsonCoder coder, JsonReader source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "MessageFrame");
	    throw de;
	}
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
	    writer.print("messageId ");
	    writer.print(this.messageId.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("value ");
	    printer.print(this.value, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "MessageFrame";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((MessageFrame)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((MessageFrame)that);
    }
    
    public boolean equalTo(MessageFrame that) {
	if (!this.messageId.equalTo(that.messageId))
	    return false;
	if (!this.value.equalTo(that.value))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public MessageFrame clone() {
	MessageFrame copy = (MessageFrame)super.clone();
	copy.messageId = messageId.clone();
	copy.value = value.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.messageId != null ? this.messageId.hashCode() : 0);
	hash = 41 * hash + (this.value != null ? this.value.hashCode() : 0);
	return hash;
    }
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new MessageFrame();
	}
    };
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ASN1Type get_ASN1Type()
    {
	return _type;
    }
    
} // End class definition for MessageFrame
