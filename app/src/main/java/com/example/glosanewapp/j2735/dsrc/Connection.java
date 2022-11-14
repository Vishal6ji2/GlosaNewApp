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
 * Define the Connection ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class Connection extends Sequence {
    public ConnectingLane connectingLane;
    public IntersectionReferenceID remoteIntersection;
    public SignalGroupID signalGroup;
    public RestrictionClassID userClass;
    public LaneConnectionID connectionID;
    
    /**
     * The default constructor.
     */
    public Connection()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Connection(ConnectingLane connectingLane, 
		    IntersectionReferenceID remoteIntersection, 
		    SignalGroupID signalGroup, RestrictionClassID userClass, 
		    LaneConnectionID connectionID)
    {
	setConnectingLane(connectingLane);
	setRemoteIntersection(remoteIntersection);
	setSignalGroup(signalGroup);
	setUserClass(userClass);
	setConnectionID(connectionID);
    }
    
    /**
     * Construct with required components.
     */
    public Connection(ConnectingLane connectingLane)
    {
	setConnectingLane(connectingLane);
    }
    
    
    // Methods for field "connectingLane"
    public ConnectingLane getConnectingLane()
    {
	return this.connectingLane;
    }
    
    public void setConnectingLane(ConnectingLane connectingLane)
    {
	this.connectingLane = connectingLane;
    }
    
    
    // Methods for field "remoteIntersection"
    public IntersectionReferenceID getRemoteIntersection()
    {
	return this.remoteIntersection;
    }
    
    public void setRemoteIntersection(IntersectionReferenceID remoteIntersection)
    {
	this.remoteIntersection = remoteIntersection;
    }
    
    public boolean hasRemoteIntersection()
    {
	return (remoteIntersection != null);
    }
    
    public void deleteRemoteIntersection()
    {
	remoteIntersection = null;
    }
    
    
    // Methods for field "signalGroup"
    public SignalGroupID getSignalGroup()
    {
	return this.signalGroup;
    }
    
    public void setSignalGroup(SignalGroupID signalGroup)
    {
	this.signalGroup = signalGroup;
    }
    
    public boolean hasSignalGroup()
    {
	return (signalGroup != null);
    }
    
    public void deleteSignalGroup()
    {
	signalGroup = null;
    }
    
    
    // Methods for field "userClass"
    public RestrictionClassID getUserClass()
    {
	return this.userClass;
    }
    
    public void setUserClass(RestrictionClassID userClass)
    {
	this.userClass = userClass;
    }
    
    public boolean hasUserClass()
    {
	return (userClass != null);
    }
    
    public void deleteUserClass()
    {
	userClass = null;
    }
    
    
    // Methods for field "connectionID"
    public LaneConnectionID getConnectionID()
    {
	return this.connectionID;
    }
    
    public void setConnectionID(LaneConnectionID connectionID)
    {
	this.connectionID = connectionID;
    }
    
    public boolean hasConnectionID()
    {
	return (connectionID != null);
    }
    
    public void deleteConnectionID()
    {
	connectionID = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__connectingLane("connectingLane"),
	__remoteIntersection("remoteIntersection"),
	__signalGroup("signalGroup"),
	__userClass("userClass"),
	__connectionID("connectionID"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Connection data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.remoteIntersection != null);
	sink.writeBit(data.signalGroup != null);
	sink.writeBit(data.userClass != null);
	sink.writeBit(data.connectionID != null);
	nbits += 4;
	// Encode field 'connectingLane'
	try {
	    ConnectingLane item1 = data.connectingLane;

	    nbits += ConnectingLane.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectingLane", "ConnectingLane");
	    throw ee;
	}
	if (data.remoteIntersection != null) {
	    // Encode field 'remoteIntersection'
	    try {
		IntersectionReferenceID item1 = data.remoteIntersection;

		nbits += IntersectionReferenceID.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("remoteIntersection", "IntersectionReferenceID");
		throw ee;
	    }
	}
	if (data.signalGroup != null) {
	    // Encode field 'signalGroup'
	    try {
		SignalGroupID item1 = data.signalGroup;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("signalGroup", "SignalGroupID");
		throw ee;
	    }
	}
	if (data.userClass != null) {
	    // Encode field 'userClass'
	    try {
		RestrictionClassID item1 = data.userClass;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("userClass", "RestrictionClassID");
		throw ee;
	    }
	}
	if (data.connectionID != null) {
	    // Encode field 'connectionID'
	    try {
		LaneConnectionID item1 = data.connectionID;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("connectionID", "LaneConnectionID");
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
    public static Connection decodeValue(PerCoder coder, InputBitStream source, Connection data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_remoteIntersection0 = source.readBit();
	boolean has_signalGroup0 = source.readBit();
	boolean has_userClass0 = source.readBit();
	boolean has_connectionID0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'connectingLane'
	try {
	    if (data.connectingLane == null)
		data.connectingLane = new ConnectingLane();
	    data.connectingLane.decodeValue(coder, source, data.connectingLane);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("connectingLane", "ConnectingLane");
	    throw de;
	}
	if (has_remoteIntersection0) {
	    // Decode field 'remoteIntersection'
	    try {
		if (data.remoteIntersection == null)
		    data.remoteIntersection = new IntersectionReferenceID();
		data.remoteIntersection.decodeValue(coder, source, data.remoteIntersection);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("remoteIntersection", "IntersectionReferenceID");
		throw de;
	    }
	} else {
	    data.remoteIntersection = null;
	}
	if (has_signalGroup0) {
	    // Decode field 'signalGroup'
	    try {
		long temp1;

		if (data.signalGroup == null)
		    data.signalGroup = new SignalGroupID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.signalGroup.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("signalGroup", "SignalGroupID");
		throw de;
	    }
	} else {
	    data.signalGroup = null;
	}
	if (has_userClass0) {
	    // Decode field 'userClass'
	    try {
		long temp1;

		if (data.userClass == null)
		    data.userClass = new RestrictionClassID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.userClass.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("userClass", "RestrictionClassID");
		throw de;
	    }
	} else {
	    data.userClass = null;
	}
	if (has_connectionID0) {
	    // Decode field 'connectionID'
	    try {
		long temp1;

		if (data.connectionID == null)
		    data.connectionID = new LaneConnectionID();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.connectionID.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("connectionID", "LaneConnectionID");
		throw de;
	    }
	} else {
	    data.connectionID = null;
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
	// Encode field 'connectingLane'
	try {
	    ConnectingLane item1 = this.connectingLane;

	    {
		sink.encodeKey("connectingLane");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectingLane", "ConnectingLane");
	    throw ee;
	}
	// Encode field 'remoteIntersection'
	try {
	    IntersectionReferenceID item1 = this.remoteIntersection;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("remoteIntersection");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "remoteIntersection");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("remoteIntersection", "IntersectionReferenceID");
	    throw ee;
	}
	// Encode field 'signalGroup'
	try {
	    SignalGroupID item1 = this.signalGroup;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("signalGroup");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "signalGroup");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("signalGroup", "SignalGroupID");
	    throw ee;
	}
	// Encode field 'userClass'
	try {
	    RestrictionClassID item1 = this.userClass;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("userClass");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "userClass");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("userClass", "RestrictionClassID");
	    throw ee;
	}
	// Encode field 'connectionID'
	try {
	    LaneConnectionID item1 = this.connectionID;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("connectionID");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "connectionID");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connectionID", "LaneConnectionID");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Connection decodeValue(JsonCoder coder, JsonReader source)
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
		    case __connectingLane:
		    // Decode field 'connectingLane'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.connectingLane == null)
			    this.connectingLane = new ConnectingLane();
			this.connectingLane.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("connectingLane", "ConnectingLane");
			throw de;
		    }
		    break;
		    case __remoteIntersection:
		    // Decode field 'remoteIntersection'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.remoteIntersection == null)
				this.remoteIntersection = new IntersectionReferenceID();
			    this.remoteIntersection.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("remoteIntersection", "IntersectionReferenceID");
			throw de;
		    }
		    break;
		    case __signalGroup:
		    // Decode field 'signalGroup'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.signalGroup == null)
				this.signalGroup = new SignalGroupID();
			    this.signalGroup.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("signalGroup", "SignalGroupID");
			throw de;
		    }
		    break;
		    case __userClass:
		    // Decode field 'userClass'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.userClass == null)
				this.userClass = new RestrictionClassID();
			    this.userClass.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("userClass", "RestrictionClassID");
			throw de;
		    }
		    break;
		    case __connectionID:
		    // Decode field 'connectionID'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.connectionID == null)
				this.connectionID = new LaneConnectionID();
			    this.connectionID.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("connectionID", "LaneConnectionID");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'connectingLane'");
	if (!present0[1])
	    this.remoteIntersection = null;
	if (!present0[2])
	    this.signalGroup = null;
	if (!present0[3])
	    this.userClass = null;
	if (!present0[4])
	    this.connectionID = null;
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
	    writer.print("connectingLane ");
	    this.connectingLane.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.remoteIntersection != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("remoteIntersection ");
		this.remoteIntersection.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.signalGroup != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("signalGroup ");
		writer.print(this.signalGroup.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.userClass != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("userClass ");
		writer.print(this.userClass.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.connectionID != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("connectionID ");
		writer.print(this.connectionID.longValue());
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
	return equalTo((Connection)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Connection)that);
    }
    
    public boolean equalTo(Connection that) {
	if (!this.connectingLane.equalTo(that.connectingLane))
	    return false;
	if (this.remoteIntersection != null) {
	    if (that.remoteIntersection == null || !this.remoteIntersection.equalTo(that.remoteIntersection))
		return false;
	} else if (that.remoteIntersection != null)
	    return false;
	if (this.signalGroup != null) {
	    if (that.signalGroup == null || !this.signalGroup.equalTo(that.signalGroup))
		return false;
	} else if (that.signalGroup != null)
	    return false;
	if (this.userClass != null) {
	    if (that.userClass == null || !this.userClass.equalTo(that.userClass))
		return false;
	} else if (that.userClass != null)
	    return false;
	if (this.connectionID != null) {
	    if (that.connectionID == null || !this.connectionID.equalTo(that.connectionID))
		return false;
	} else if (that.connectionID != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Connection clone() {
	Connection copy = (Connection)super.clone();
	copy.connectingLane = connectingLane.clone();
	if (remoteIntersection != null) {
	    copy.remoteIntersection = remoteIntersection.clone();
	}
	if (signalGroup != null) {
	    copy.signalGroup = signalGroup.clone();
	}
	if (userClass != null) {
	    copy.userClass = userClass.clone();
	}
	if (connectionID != null) {
	    copy.connectionID = connectionID.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.connectingLane != null ? this.connectingLane.hashCode() : 0);
	hash = 41 * hash + (this.remoteIntersection != null ? this.remoteIntersection.hashCode() : 0);
	hash = 41 * hash + (this.signalGroup != null ? this.signalGroup.hashCode() : 0);
	hash = 41 * hash + (this.userClass != null ? this.userClass.hashCode() : 0);
	hash = 41 * hash + (this.connectionID != null ? this.connectionID.hashCode() : 0);
	return hash;
    }
} // End class definition for Connection
