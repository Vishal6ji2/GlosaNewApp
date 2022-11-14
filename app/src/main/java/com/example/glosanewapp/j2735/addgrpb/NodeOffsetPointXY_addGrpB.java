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


package com.example.glosanewapp.j2735.addgrpb;

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
 * Define the NodeOffsetPointXY-addGrpB ASN.1 type included in the AddGrpB ASN.1 module.
 * @see Choice
 */

public class NodeOffsetPointXY_addGrpB extends Choice implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    
    /**
     * The default constructor.
     */
    public NodeOffsetPointXY_addGrpB()
    {
    }
    
    public static final  int  posA_chosen = 1;
    public static final  int  posB_chosen = 2;
    
    // Methods for field "posA"
    public static NodeOffsetPointXY_addGrpB createNodeOffsetPointXY_addGrpBWithPosA(Node_LLdms_48b posA)
    {
	NodeOffsetPointXY_addGrpB __object = new NodeOffsetPointXY_addGrpB();

	__object.setPosA(posA);
	return __object;
    }
    
    public boolean hasPosA()
    {
	return getChosenFlag() == posA_chosen;
    }
    
    public Node_LLdms_48b getPosA()
    {
	if (hasPosA())
	    return (Node_LLdms_48b)mChosenValue;
	else
	    return null;
    }
    
    public void setPosA(Node_LLdms_48b posA)
    {
	setChosenValue(posA);
	setChosenFlag(posA_chosen);
    }
    
    
    // Methods for field "posB"
    public static NodeOffsetPointXY_addGrpB createNodeOffsetPointXY_addGrpBWithPosB(Node_LLdms_80b posB)
    {
	NodeOffsetPointXY_addGrpB __object = new NodeOffsetPointXY_addGrpB();

	__object.setPosB(posB);
	return __object;
    }
    
    public boolean hasPosB()
    {
	return getChosenFlag() == posB_chosen;
    }
    
    public Node_LLdms_80b getPosB()
    {
	if (hasPosB())
	    return (Node_LLdms_80b)mChosenValue;
	else
	    return null;
    }
    
    public void setPosB(Node_LLdms_80b posB)
    {
	setChosenValue(posB);
	setChosenFlag(posB_chosen);
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__posA("posA"),
	__posB("posB"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, NodeOffsetPointXY_addGrpB data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	else if (idx0 > 2) {
	    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	}
	sink.writeBit(false); ++nbits;
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	switch (idx0) {
	    case posA_chosen:
		// Encode alternative 'posA'
		try {
		    Node_LLdms_48b item1 = (Node_LLdms_48b)data.mChosenValue;

		    nbits += Node_LLdms_48b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("posA", "Node-LLdms-48b", 0);
		    throw ee;
		}
		break;
	    case posB_chosen:
		// Encode alternative 'posB'
		try {
		    Node_LLdms_80b item1 = (Node_LLdms_80b)data.mChosenValue;

		    nbits += Node_LLdms_80b.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("posB", "Node-LLdms-80b", 0);
		    throw ee;
		}
		break;
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
	    ee.appendFieldContext(null, "NodeOffsetPointXY-addGrpB");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static NodeOffsetPointXY_addGrpB decodeValue(PerCoder coder, InputBitStream source, NodeOffsetPointXY_addGrpB data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;
	boolean extroot0 = !source.readBit();;

	if (extroot0) {
	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case posA_chosen:
		    // Decode alternative 'posA'
		    try {
			Node_LLdms_48b item1 = new Node_LLdms_48b();

			// Decode alternative 'posA'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("posA", "Node-LLdms-48b", 0);
			throw de;
		    }
		    break;
		case posB_chosen:
		    // Decode alternative 'posB'
		    try {
			Node_LLdms_80b item1 = new Node_LLdms_80b();

			// Decode alternative 'posB'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("posB", "Node-LLdms-80b", 0);
			throw de;
		    }
		    break;
	    }
	} else {
	    idx0 = (int)coder.decodeNormallySmallNumber(source) + 3;
	    if (idx0 < 1)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    else {
		data.mChosenFlag = idx0;
		data.mChosenValue = null;
		try {
		    com.oss.coders.per.PerOctets.skip(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendExtensionContext(null, idx0 - 2);
		    throw de;
		}
	    }
	}
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
	    de.appendFieldContext(null, "NodeOffsetPointXY-addGrpB");
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
	int idx0 = this.mChosenFlag;

	sink.beginObject();
	switch (idx0)
	{
	case posA_chosen:
	    // Encode alternative 'posA'
	    try {
		Node_LLdms_48b item1 = (Node_LLdms_48b)this.mChosenValue;

		sink.encodeKey("posA");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("posA", "Node-LLdms-48b", 0);
		throw ee;
	    }
	    break;
	case posB_chosen:
	    // Encode alternative 'posB'
	    try {
		Node_LLdms_80b item1 = (Node_LLdms_80b)this.mChosenValue;

		sink.encodeKey("posB");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("posB", "Node-LLdms-80b", 0);
		throw ee;
	    }
	    break;
	default:
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
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
	    ee.appendFieldContext(null, "NodeOffsetPointXY-addGrpB");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public NodeOffsetPointXY_addGrpB decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __posA:
		// Decode alternative 'posA'
		try {
		    Node_LLdms_48b item1 = new Node_LLdms_48b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = posA_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("posA", "Node-LLdms-48b", 0);
		    throw de;
		}
		break;
	    case __posB:
		// Decode alternative 'posB'
		try {
		    Node_LLdms_80b item1 = new Node_LLdms_80b();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = posB_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("posB", "Node-LLdms-80b", 0);
		    throw de;
		}
		break;
	    default:
		try {
		  {
 // coder.setUnknownExtensionFound();
}
		    coder.skipValue(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("unknownExtension", "unknown", 0);
		    throw de;
		}
	}
	if (coder.hasMoreProperties(source, false))
	    throw new DecoderException(ExceptionDescriptor._json_unexpected_token, null, "expecting '}'");
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
	    de.appendFieldContext(null, "NodeOffsetPointXY-addGrpB");
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
	switch (this.mChosenFlag) {
	case posA_chosen:
	    try {
		writer.print("posA : ");
		((Node_LLdms_48b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case posB_chosen:
	    try {
		writer.print("posB : ");
		((Node_LLdms_80b)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	default:
	    writer.print("-- unknown selection --");
	}
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "NodeOffsetPointXY-addGrpB";
    }

    /**
     * Clone 'this' object.
     */
    public NodeOffsetPointXY_addGrpB clone() {
	return (NodeOffsetPointXY_addGrpB)super.clone();
    }

    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new NodeOffsetPointXY_addGrpB();
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
    
} // End class definition for NodeOffsetPointXY_addGrpB
