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
 * Define the NodeLL ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class NodeLL extends Sequence {
    public NodeOffsetPointLL delta;
    public NodeAttributeSetLL attributes;
    
    /**
     * The default constructor.
     */
    public NodeLL()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NodeLL(NodeOffsetPointLL delta, NodeAttributeSetLL attributes)
    {
	setDelta(delta);
	setAttributes(attributes);
    }
    
    /**
     * Construct with required components.
     */
    public NodeLL(NodeOffsetPointLL delta)
    {
	setDelta(delta);
    }
    
    
    // Methods for field "delta"
    public NodeOffsetPointLL getDelta()
    {
	return this.delta;
    }
    
    public void setDelta(NodeOffsetPointLL delta)
    {
	this.delta = delta;
    }
    
    
    // Methods for field "attributes"
    public NodeAttributeSetLL getAttributes()
    {
	return this.attributes;
    }
    
    public void setAttributes(NodeAttributeSetLL attributes)
    {
	this.attributes = attributes;
    }
    
    public boolean hasAttributes()
    {
	return (attributes != null);
    }
    
    public void deleteAttributes()
    {
	attributes = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__delta("delta"),
	__attributes("attributes"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, NodeLL data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.attributes != null);
	nbits += 2;
	// Encode field 'delta'
	try {
	    NodeOffsetPointLL item1 = data.delta;

	    nbits += NodeOffsetPointLL.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("delta", "NodeOffsetPointLL");
	    throw ee;
	}
	if (data.attributes != null) {
	    // Encode field 'attributes'
	    try {
		NodeAttributeSetLL item1 = data.attributes;

		nbits += NodeAttributeSetLL.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("attributes", "NodeAttributeSetLL");
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
    public static NodeLL decodeValue(PerCoder coder, InputBitStream source, NodeLL data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_attributes0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'delta'
	try {
	    if (data.delta == null)
		data.delta = new NodeOffsetPointLL();
	    data.delta.decodeValue(coder, source, data.delta);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("delta", "NodeOffsetPointLL");
	    throw de;
	}
	if (has_attributes0) {
	    // Decode field 'attributes'
	    try {
		if (data.attributes == null)
		    data.attributes = new NodeAttributeSetLL();
		data.attributes.decodeValue(coder, source, data.attributes);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("attributes", "NodeAttributeSetLL");
		throw de;
	    }
	} else {
	    data.attributes = null;
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
	// Encode field 'delta'
	try {
	    NodeOffsetPointLL item1 = this.delta;

	    {
		sink.encodeKey("delta");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("delta", "NodeOffsetPointLL");
	    throw ee;
	}
	// Encode field 'attributes'
	try {
	    NodeAttributeSetLL item1 = this.attributes;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("attributes");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "attributes");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("attributes", "NodeAttributeSetLL");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public NodeLL decodeValue(JsonCoder coder, JsonReader source)
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
		    case __delta:
		    // Decode field 'delta'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.delta == null)
			    this.delta = new NodeOffsetPointLL();
			this.delta.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("delta", "NodeOffsetPointLL");
			throw de;
		    }
		    break;
		    case __attributes:
		    // Decode field 'attributes'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.attributes == null)
				this.attributes = new NodeAttributeSetLL();
			    this.attributes.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("attributes", "NodeAttributeSetLL");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'delta'");
	if (!present0[1])
	    this.attributes = null;
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
	    writer.print("delta ");
	    this.delta.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.attributes != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("attributes ");
		this.attributes.printValue(printer, writer);
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
	return equalTo((NodeLL)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((NodeLL)that);
    }
    
    public boolean equalTo(NodeLL that) {
	if (!this.delta.equalTo(that.delta))
	    return false;
	if (this.attributes != null) {
	    if (that.attributes == null || !this.attributes.equalTo(that.attributes))
		return false;
	} else if (that.attributes != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public NodeLL clone() {
	NodeLL copy = (NodeLL)super.clone();
	copy.delta = delta.clone();
	if (attributes != null) {
	    copy.attributes = attributes.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.delta != null ? this.delta.hashCode() : 0);
	hash = 41 * hash + (this.attributes != null ? this.attributes.hashCode() : 0);
	return hash;
    }
} // End class definition for NodeLL
