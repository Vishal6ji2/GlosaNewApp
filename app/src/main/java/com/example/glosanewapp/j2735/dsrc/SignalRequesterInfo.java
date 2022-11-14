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
 * Define the SignalRequesterInfo ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class SignalRequesterInfo extends Sequence {
    public VehicleID id;
    public RequestID request;
    public MsgCount sequenceNumber;
    public BasicVehicleRole role;
    public RequestorType typeData;
    
    /**
     * The default constructor.
     */
    public SignalRequesterInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalRequesterInfo(VehicleID id, RequestID request, 
		    MsgCount sequenceNumber, BasicVehicleRole role, 
		    RequestorType typeData)
    {
	setId(id);
	setRequest(request);
	setSequenceNumber(sequenceNumber);
	setRole(role);
	setTypeData(typeData);
    }
    
    /**
     * Construct with required components.
     */
    public SignalRequesterInfo(VehicleID id, RequestID request, 
		    MsgCount sequenceNumber)
    {
	setId(id);
	setRequest(request);
	setSequenceNumber(sequenceNumber);
    }
    
    
    // Methods for field "id"
    public VehicleID getId()
    {
	return this.id;
    }
    
    public void setId(VehicleID id)
    {
	this.id = id;
    }
    
    
    // Methods for field "request"
    public RequestID getRequest()
    {
	return this.request;
    }
    
    public void setRequest(RequestID request)
    {
	this.request = request;
    }
    
    
    // Methods for field "sequenceNumber"
    public MsgCount getSequenceNumber()
    {
	return this.sequenceNumber;
    }
    
    public void setSequenceNumber(MsgCount sequenceNumber)
    {
	this.sequenceNumber = sequenceNumber;
    }
    
    
    // Methods for field "role"
    public BasicVehicleRole getRole()
    {
	return this.role;
    }
    
    public void setRole(BasicVehicleRole role)
    {
	this.role = role;
    }
    
    public boolean hasRole()
    {
	return (role != null);
    }
    
    public void deleteRole()
    {
	role = null;
    }
    
    
    // Methods for field "typeData"
    public RequestorType getTypeData()
    {
	return this.typeData;
    }
    
    public void setTypeData(RequestorType typeData)
    {
	this.typeData = typeData;
    }
    
    public boolean hasTypeData()
    {
	return (typeData != null);
    }
    
    public void deleteTypeData()
    {
	typeData = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__id("id"),
	__request("request"),
	__sequenceNumber("sequenceNumber"),
	__role("role"),
	__typeData("typeData"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SignalRequesterInfo data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.role != null);
	sink.writeBit(data.typeData != null);
	nbits += 3;
	// Encode field 'id'
	try {
	    VehicleID item1 = data.id;

	    nbits += VehicleID.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "VehicleID");
	    throw ee;
	}
	// Encode field 'request'
	try {
	    RequestID item1 = data.request;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("request", "RequestID");
	    throw ee;
	}
	// Encode field 'sequenceNumber'
	try {
	    MsgCount item1 = data.sequenceNumber;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sequenceNumber", "MsgCount");
	    throw ee;
	}
	if (data.role != null) {
	    // Encode field 'role'
	    try {
		BasicVehicleRole item1 = data.role;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 23;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 22, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 23, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("role", "BasicVehicleRole");
		throw ee;
	    }
	}
	if (data.typeData != null) {
	    // Encode field 'typeData'
	    try {
		RequestorType item1 = data.typeData;

		nbits += RequestorType.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("typeData", "RequestorType");
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
    public static SignalRequesterInfo decodeValue(PerCoder coder, InputBitStream source, SignalRequesterInfo data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_role0 = source.readBit();
	boolean has_typeData0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'id'
	try {
	    if (data.id == null)
		data.id = new VehicleID();
	    data.id.decodeValue(coder, source, data.id);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "VehicleID");
	    throw de;
	}
	// Decode field 'request'
	try {
	    long temp1;

	    if (data.request == null)
		data.request = new RequestID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.request.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("request", "RequestID");
	    throw de;
	}
	// Decode field 'sequenceNumber'
	try {
	    long temp1;

	    if (data.sequenceNumber == null)
		data.sequenceNumber = new MsgCount();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sequenceNumber.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sequenceNumber", "MsgCount");
	    throw de;
	}
	if (has_role0) {
	    // Decode field 'role'
	    try {
		int idx1;
		BasicVehicleRole temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 22);
		    if (idx1 < 0 || idx1 > 22)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = BasicVehicleRole.valueAt(idx1);
		} else {
		    idx1 = 23 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = BasicVehicleRole.unknownEnumerator();
		}
		data.role = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("role", "BasicVehicleRole");
		throw de;
	    }
	} else {
	    data.role = null;
	}
	if (has_typeData0) {
	    // Decode field 'typeData'
	    try {
		if (data.typeData == null)
		    data.typeData = new RequestorType();
		data.typeData.decodeValue(coder, source, data.typeData);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("typeData", "RequestorType");
		throw de;
	    }
	} else {
	    data.typeData = null;
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
	// Encode field 'id'
	try {
	    VehicleID item1 = this.id;

	    {
		sink.encodeKey("id");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "VehicleID");
	    throw ee;
	}
	// Encode field 'request'
	try {
	    RequestID item1 = this.request;

	    {
		sink.writeSeparator();
		sink.encodeKey("request");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("request", "RequestID");
	    throw ee;
	}
	// Encode field 'sequenceNumber'
	try {
	    MsgCount item1 = this.sequenceNumber;

	    {
		sink.writeSeparator();
		sink.encodeKey("sequenceNumber");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sequenceNumber", "MsgCount");
	    throw ee;
	}
	// Encode field 'role'
	try {
	    BasicVehicleRole item1 = this.role;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("role");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "role");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("role", "BasicVehicleRole");
	    throw ee;
	}
	// Encode field 'typeData'
	try {
	    RequestorType item1 = this.typeData;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("typeData");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "typeData");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("typeData", "RequestorType");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SignalRequesterInfo decodeValue(JsonCoder coder, JsonReader source)
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
		    case __id:
		    // Decode field 'id'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.id == null)
			    this.id = new VehicleID();
			this.id.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "VehicleID");
			throw de;
		    }
		    break;
		    case __request:
		    // Decode field 'request'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.request == null)
			    this.request = new RequestID();
			this.request.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("request", "RequestID");
			throw de;
		    }
		    break;
		    case __sequenceNumber:
		    // Decode field 'sequenceNumber'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sequenceNumber == null)
			    this.sequenceNumber = new MsgCount();
			this.sequenceNumber.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sequenceNumber", "MsgCount");
			throw de;
		    }
		    break;
		    case __role:
		    // Decode field 'role'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    BasicVehicleRole temp1;

			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(BasicVehicleRole.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = BasicVehicleRole.unknownEnumerator();
			    else
				temp1 = BasicVehicleRole.cNamedNumbers[idx1];
			    this.role = temp1;
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("role", "BasicVehicleRole");
			throw de;
		    }
		    break;
		    case __typeData:
		    // Decode field 'typeData'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.typeData == null)
				this.typeData = new RequestorType();
			    this.typeData.decodeValue(coder, source);
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("typeData", "RequestorType");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'id'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'request'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sequenceNumber'");
	if (!present0[3])
	    this.role = null;
	if (!present0[4])
	    this.typeData = null;
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
	    writer.print("id ");
	    this.id.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("request ");
	    writer.print(this.request.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("sequenceNumber ");
	    writer.print(this.sequenceNumber.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.role != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("role ");
		printer.print(this.role, writer, this.role.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.typeData != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("typeData ");
		this.typeData.printValue(printer, writer);
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
	return equalTo((SignalRequesterInfo)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SignalRequesterInfo)that);
    }
    
    public boolean equalTo(SignalRequesterInfo that) {
	if (!this.id.equalTo(that.id))
	    return false;
	if (!this.request.equalTo(that.request))
	    return false;
	if (!this.sequenceNumber.equalTo(that.sequenceNumber))
	    return false;
	if (this.role != null) {
	    if (that.role == null || !this.role.equalTo(that.role))
		return false;
	} else if (that.role != null)
	    return false;
	if (this.typeData != null) {
	    if (that.typeData == null || !this.typeData.equalTo(that.typeData))
		return false;
	} else if (that.typeData != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SignalRequesterInfo clone() {
	SignalRequesterInfo copy = (SignalRequesterInfo)super.clone();
	copy.id = id.clone();
	copy.request = request.clone();
	copy.sequenceNumber = sequenceNumber.clone();
	if (role != null) {
	    copy.role = role.clone();
	}
	if (typeData != null) {
	    copy.typeData = typeData.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.request != null ? this.request.hashCode() : 0);
	hash = 41 * hash + (this.sequenceNumber != null ? this.sequenceNumber.hashCode() : 0);
	hash = 41 * hash + (this.role != null ? this.role.hashCode() : 0);
	hash = 41 * hash + (this.typeData != null ? this.typeData.hashCode() : 0);
	return hash;
    }
} // End class definition for SignalRequesterInfo
