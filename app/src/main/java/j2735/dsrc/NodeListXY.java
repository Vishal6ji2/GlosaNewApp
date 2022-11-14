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
 * Define the NodeListXY ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class NodeListXY extends Choice {
    
    /**
     * The default constructor.
     */
    public NodeListXY()
    {
    }
    
    public static final  int  nodes_chosen = 1;
    public static final  int  computed_chosen = 2;
    
    // Methods for field "nodes"
    public static NodeListXY createNodeListXYWithNodes(NodeSetXY nodes)
    {
	NodeListXY __object = new NodeListXY();

	__object.setNodes(nodes);
	return __object;
    }
    
    public boolean hasNodes()
    {
	return getChosenFlag() == nodes_chosen;
    }
    
    public NodeSetXY getNodes()
    {
	if (hasNodes())
	    return (NodeSetXY)mChosenValue;
	else
	    return null;
    }
    
    public void setNodes(NodeSetXY nodes)
    {
	setChosenValue(nodes);
	setChosenFlag(nodes_chosen);
    }
    
    
    // Methods for field "computed"
    public static NodeListXY createNodeListXYWithComputed(ComputedLane computed)
    {
	NodeListXY __object = new NodeListXY();

	__object.setComputed(computed);
	return __object;
    }
    
    public boolean hasComputed()
    {
	return getChosenFlag() == computed_chosen;
    }
    
    public ComputedLane getComputed()
    {
	if (hasComputed())
	    return (ComputedLane)mChosenValue;
	else
	    return null;
    }
    
    public void setComputed(ComputedLane computed)
    {
	setChosenValue(computed);
	setChosenFlag(computed_chosen);
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__nodes("nodes"),
	__computed("computed"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, NodeListXY data)
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
	    case nodes_chosen:
		// Encode alternative 'nodes'
		try {
		    NodeSetXY item1 = (NodeSetXY)data.mChosenValue;

		    nbits += NodeSetXY.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("nodes", "NodeSetXY", 0);
		    throw ee;
		}
		break;
	    case computed_chosen:
		// Encode alternative 'computed'
		try {
		    ComputedLane item1 = (ComputedLane)data.mChosenValue;

		    nbits += ComputedLane.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("computed", "ComputedLane", 0);
		    throw ee;
		}
		break;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static NodeListXY decodeValue(PerCoder coder, InputBitStream source, NodeListXY data)
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
		case nodes_chosen:
		    // Decode alternative 'nodes'
		    try {
			NodeSetXY item1 = new NodeSetXY();

			// Decode alternative 'nodes'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("nodes", "NodeSetXY", 0);
			throw de;
		    }
		    break;
		case computed_chosen:
		    // Decode alternative 'computed'
		    try {
			ComputedLane item1 = new ComputedLane();

			// Decode alternative 'computed'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("computed", "ComputedLane", 0);
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
	case nodes_chosen:
	    // Encode alternative 'nodes'
	    try {
		NodeSetXY item1 = (NodeSetXY)this.mChosenValue;

		sink.encodeKey("nodes");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("nodes", "NodeSetXY", 0);
		throw ee;
	    }
	    break;
	case computed_chosen:
	    // Encode alternative 'computed'
	    try {
		ComputedLane item1 = (ComputedLane)this.mChosenValue;

		sink.encodeKey("computed");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("computed", "ComputedLane", 0);
		throw ee;
	    }
	    break;
	default:
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public NodeListXY decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __nodes:
		// Decode alternative 'nodes'
		try {
		    NodeSetXY item1 = new NodeSetXY();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = nodes_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("nodes", "NodeSetXY", 0);
		    throw de;
		}
		break;
	    case __computed:
		// Decode alternative 'computed'
		try {
		    ComputedLane item1 = new ComputedLane();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = computed_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("computed", "ComputedLane", 0);
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
     * Implements value printer for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void printValue(DataPrinter printer, java.io.PrintWriter writer)
	    throws Exception
    {
	switch (this.mChosenFlag) {
	case nodes_chosen:
	    try {
		writer.print("nodes : ");
		((NodeSetXY)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case computed_chosen:
	    try {
		writer.print("computed : ");
		((ComputedLane)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	default:
	    writer.print("-- unknown selection --");
	}
    }

    /**
     * Clone 'this' object.
     */
    public NodeListXY clone() {
	return (NodeListXY)super.clone();
    }

} // End class definition for NodeListXY
