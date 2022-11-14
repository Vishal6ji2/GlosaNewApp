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
 * Define the VehicleStatusRequest ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class VehicleStatusRequest extends Sequence {
    public VehicleStatusDeviceTypeTag dataType;
    public INTEGER subType;
    public INTEGER sendOnLessThenValue;
    public INTEGER sendOnMoreThenValue;
    public BOOLEAN sendAll;
    
    /**
     * The default constructor.
     */
    public VehicleStatusRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType, 
		    INTEGER subType, INTEGER sendOnLessThenValue, 
		    INTEGER sendOnMoreThenValue, BOOLEAN sendAll)
    {
	setDataType(dataType);
	setSubType(subType);
	setSendOnLessThenValue(sendOnLessThenValue);
	setSendOnMoreThenValue(sendOnMoreThenValue);
	setSendAll(sendAll);
    }
    
    /**
     * Construct with components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType, 
		    long subType, long sendOnLessThenValue, 
		    long sendOnMoreThenValue, boolean sendAll)
    {
	this(dataType, new INTEGER(subType), 
	     new INTEGER(sendOnLessThenValue), 
	     new INTEGER(sendOnMoreThenValue), new BOOLEAN(sendAll));
    }
    
    /**
     * Construct with required components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType)
    {
	setDataType(dataType);
    }
    
    
    // Methods for field "dataType"
    public VehicleStatusDeviceTypeTag getDataType()
    {
	return this.dataType;
    }
    
    public void setDataType(VehicleStatusDeviceTypeTag dataType)
    {
	this.dataType = dataType;
    }
    
    
    // Methods for field "subType"
    public long getSubType()
    {
	return (this.subType).longValue();
    }
    
    public void setSubType(long subType)
    {
	setSubType(new INTEGER(subType));
    }
    
    public void setSubType(INTEGER subType)
    {
	this.subType = subType;
    }
    
    public boolean hasSubType()
    {
	return (subType != null);
    }
    
    public void deleteSubType()
    {
	subType = null;
    }
    
    
    // Methods for field "sendOnLessThenValue"
    public long getSendOnLessThenValue()
    {
	return (this.sendOnLessThenValue).longValue();
    }
    
    public void setSendOnLessThenValue(long sendOnLessThenValue)
    {
	setSendOnLessThenValue(new INTEGER(sendOnLessThenValue));
    }
    
    public void setSendOnLessThenValue(INTEGER sendOnLessThenValue)
    {
	this.sendOnLessThenValue = sendOnLessThenValue;
    }
    
    public boolean hasSendOnLessThenValue()
    {
	return (sendOnLessThenValue != null);
    }
    
    public void deleteSendOnLessThenValue()
    {
	sendOnLessThenValue = null;
    }
    
    
    // Methods for field "sendOnMoreThenValue"
    public long getSendOnMoreThenValue()
    {
	return (this.sendOnMoreThenValue).longValue();
    }
    
    public void setSendOnMoreThenValue(long sendOnMoreThenValue)
    {
	setSendOnMoreThenValue(new INTEGER(sendOnMoreThenValue));
    }
    
    public void setSendOnMoreThenValue(INTEGER sendOnMoreThenValue)
    {
	this.sendOnMoreThenValue = sendOnMoreThenValue;
    }
    
    public boolean hasSendOnMoreThenValue()
    {
	return (sendOnMoreThenValue != null);
    }
    
    public void deleteSendOnMoreThenValue()
    {
	sendOnMoreThenValue = null;
    }
    
    
    // Methods for field "sendAll"
    public boolean getSendAll()
    {
	return (this.sendAll).booleanValue();
    }
    
    public void setSendAll(boolean sendAll)
    {
	setSendAll(new BOOLEAN(sendAll));
    }
    
    public void setSendAll(BOOLEAN sendAll)
    {
	this.sendAll = sendAll;
    }
    
    public boolean hasSendAll()
    {
	return (sendAll != null);
    }
    
    public void deleteSendAll()
    {
	sendAll = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__dataType("dataType"),
	__subType("subType"),
	__sendOnLessThenValue("sendOnLessThenValue"),
	__sendOnMoreThenValue("sendOnMoreThenValue"),
	__sendAll("sendAll"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(6);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleStatusRequest data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.subType != null);
	sink.writeBit(data.sendOnLessThenValue != null);
	sink.writeBit(data.sendOnMoreThenValue != null);
	sink.writeBit(data.sendAll != null);
	nbits += 5;
	// Encode field 'dataType'
	try {
	    VehicleStatusDeviceTypeTag item1 = data.dataType;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 29;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 28, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 29, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
	    throw ee;
	}
	if (data.subType != null) {
	    // Encode field 'subType'
	    try {
		INTEGER item1 = data.subType;
		long temp1 = item1.longValue();

		if (temp1 < 1 || temp1 > 15)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("subType", "INTEGER");
		throw ee;
	    }
	}
	if (data.sendOnLessThenValue != null) {
	    // Encode field 'sendOnLessThenValue'
	    try {
		INTEGER item1 = data.sendOnLessThenValue;
		long temp1 = item1.longValue();

		if (temp1 < -32767 || temp1 > 32767)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendOnLessThenValue", "INTEGER");
		throw ee;
	    }
	}
	if (data.sendOnMoreThenValue != null) {
	    // Encode field 'sendOnMoreThenValue'
	    try {
		INTEGER item1 = data.sendOnMoreThenValue;
		long temp1 = item1.longValue();

		if (temp1 < -32767 || temp1 > 32767)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendOnMoreThenValue", "INTEGER");
		throw ee;
	    }
	}
	if (data.sendAll != null) {
	    // Encode field 'sendAll'
	    try {
		BOOLEAN item1 = data.sendAll;

		sink.writeBit(item1.booleanValue());
		nbits += (1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sendAll", "BOOLEAN");
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
    public static VehicleStatusRequest decodeValue(PerCoder coder, InputBitStream source, VehicleStatusRequest data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_subType0 = source.readBit();
	boolean has_sendOnLessThenValue0 = source.readBit();
	boolean has_sendOnMoreThenValue0 = source.readBit();
	boolean has_sendAll0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'dataType'
	try {
	    int idx1;
	    VehicleStatusDeviceTypeTag temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 28);
		if (idx1 < 0 || idx1 > 28)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = VehicleStatusDeviceTypeTag.valueAt(idx1);
	    } else {
		idx1 = 29 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = VehicleStatusDeviceTypeTag.unknownEnumerator();
	    }
	    data.dataType = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
	    throw de;
	}
	if (has_subType0) {
	    // Decode field 'subType'
	    try {
		long temp1;

		if (data.subType == null)
		    data.subType = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, 1, 15);
		if (temp1 > 15)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.subType.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("subType", "INTEGER");
		throw de;
	    }
	} else {
	    data.subType = null;
	}
	if (has_sendOnLessThenValue0) {
	    // Decode field 'sendOnLessThenValue'
	    try {
		long temp1;

		if (data.sendOnLessThenValue == null)
		    data.sendOnLessThenValue = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.sendOnLessThenValue.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sendOnLessThenValue", "INTEGER");
		throw de;
	    }
	} else {
	    data.sendOnLessThenValue = null;
	}
	if (has_sendOnMoreThenValue0) {
	    // Decode field 'sendOnMoreThenValue'
	    try {
		long temp1;

		if (data.sendOnMoreThenValue == null)
		    data.sendOnMoreThenValue = new INTEGER();
		temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.sendOnMoreThenValue.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sendOnMoreThenValue", "INTEGER");
		throw de;
	    }
	} else {
	    data.sendOnMoreThenValue = null;
	}
	if (has_sendAll0) {
	    // Decode field 'sendAll'
	    try {
		if (data.sendAll == null)
		    data.sendAll = new BOOLEAN();
		data.sendAll.setValue(source.readBit());
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sendAll", "BOOLEAN");
		throw de;
	    }
	} else {
	    data.sendAll = null;
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
	// Encode field 'dataType'
	try {
	    VehicleStatusDeviceTypeTag item1 = this.dataType;

	    {
		sink.encodeKey("dataType");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
	    throw ee;
	}
	// Encode field 'subType'
	try {
	    INTEGER item1 = this.subType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("subType");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "subType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("subType", "INTEGER");
	    throw ee;
	}
	// Encode field 'sendOnLessThenValue'
	try {
	    INTEGER item1 = this.sendOnLessThenValue;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("sendOnLessThenValue");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "sendOnLessThenValue");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sendOnLessThenValue", "INTEGER");
	    throw ee;
	}
	// Encode field 'sendOnMoreThenValue'
	try {
	    INTEGER item1 = this.sendOnMoreThenValue;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("sendOnMoreThenValue");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "sendOnMoreThenValue");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sendOnMoreThenValue", "INTEGER");
	    throw ee;
	}
	// Encode field 'sendAll'
	try {
	    BOOLEAN item1 = this.sendAll;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("sendAll");
		    sink.writeBoolean(item1.booleanValue());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "sendAll");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sendAll", "BOOLEAN");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleStatusRequest decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[6];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __dataType:
		    // Decode field 'dataType'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			VehicleStatusDeviceTypeTag temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(VehicleStatusDeviceTypeTag.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = VehicleStatusDeviceTypeTag.unknownEnumerator();
			else
			    temp1 = VehicleStatusDeviceTypeTag.cNamedNumbers[idx1];
			this.dataType = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dataType", "VehicleStatusDeviceTypeTag");
			throw de;
		    }
		    break;
		    case __subType:
		    // Decode field 'subType'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.subType == null)
				this.subType = new INTEGER();
			    this.subType.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("subType", "INTEGER");
			throw de;
		    }
		    break;
		    case __sendOnLessThenValue:
		    // Decode field 'sendOnLessThenValue'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.sendOnLessThenValue == null)
				this.sendOnLessThenValue = new INTEGER();
			    this.sendOnLessThenValue.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sendOnLessThenValue", "INTEGER");
			throw de;
		    }
		    break;
		    case __sendOnMoreThenValue:
		    // Decode field 'sendOnMoreThenValue'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.sendOnMoreThenValue == null)
				this.sendOnMoreThenValue = new INTEGER();
			    this.sendOnMoreThenValue.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sendOnMoreThenValue", "INTEGER");
			throw de;
		    }
		    break;
		    case __sendAll:
		    // Decode field 'sendAll'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.sendAll == null)
				this.sendAll = new BOOLEAN();
			    this.sendAll.setValue(coder.decodeBoolean(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sendAll", "BOOLEAN");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'dataType'");
	if (!present0[1])
	    this.subType = null;
	if (!present0[2])
	    this.sendOnLessThenValue = null;
	if (!present0[3])
	    this.sendOnMoreThenValue = null;
	if (!present0[4])
	    this.sendAll = null;
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
	    writer.print("dataType ");
	    printer.print(this.dataType, writer, this.dataType.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.subType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("subType ");
		writer.print(this.subType.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sendOnLessThenValue != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("sendOnLessThenValue ");
		writer.print(this.sendOnLessThenValue.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sendOnMoreThenValue != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("sendOnMoreThenValue ");
		writer.print(this.sendOnMoreThenValue.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sendAll != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("sendAll ");
		printer.print(this.sendAll, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
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
	return equalTo((VehicleStatusRequest)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleStatusRequest)that);
    }
    
    public boolean equalTo(VehicleStatusRequest that) {
	if (!this.dataType.equalTo(that.dataType))
	    return false;
	if (this.subType != null) {
	    if (that.subType == null || !this.subType.equalTo(that.subType))
		return false;
	} else if (that.subType != null)
	    return false;
	if (this.sendOnLessThenValue != null) {
	    if (that.sendOnLessThenValue == null || !this.sendOnLessThenValue.equalTo(that.sendOnLessThenValue))
		return false;
	} else if (that.sendOnLessThenValue != null)
	    return false;
	if (this.sendOnMoreThenValue != null) {
	    if (that.sendOnMoreThenValue == null || !this.sendOnMoreThenValue.equalTo(that.sendOnMoreThenValue))
		return false;
	} else if (that.sendOnMoreThenValue != null)
	    return false;
	if (this.sendAll != null) {
	    if (that.sendAll == null || !this.sendAll.equalTo(that.sendAll))
		return false;
	} else if (that.sendAll != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleStatusRequest clone() {
	VehicleStatusRequest copy = (VehicleStatusRequest)super.clone();
	copy.dataType = dataType.clone();
	if (subType != null) {
	    copy.subType = subType.clone();
	}
	if (sendOnLessThenValue != null) {
	    copy.sendOnLessThenValue = sendOnLessThenValue.clone();
	}
	if (sendOnMoreThenValue != null) {
	    copy.sendOnMoreThenValue = sendOnMoreThenValue.clone();
	}
	if (sendAll != null) {
	    copy.sendAll = sendAll.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.dataType != null ? this.dataType.hashCode() : 0);
	hash = 41 * hash + (this.subType != null ? this.subType.hashCode() : 0);
	hash = 41 * hash + (this.sendOnLessThenValue != null ? this.sendOnLessThenValue.hashCode() : 0);
	hash = 41 * hash + (this.sendOnMoreThenValue != null ? this.sendOnMoreThenValue.hashCode() : 0);
	hash = 41 * hash + (this.sendAll != null ? this.sendAll.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleStatusRequest
