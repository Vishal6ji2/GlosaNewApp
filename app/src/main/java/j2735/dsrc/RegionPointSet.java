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
 * Define the RegionPointSet ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RegionPointSet extends Sequence {
    public Position3D anchor;
    public Zoom scale;
    public RegionList nodeList;
    
    /**
     * The default constructor.
     */
    public RegionPointSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RegionPointSet(Position3D anchor, Zoom scale, RegionList nodeList)
    {
	setAnchor(anchor);
	setScale(scale);
	setNodeList(nodeList);
    }
    
    /**
     * Construct with required components.
     */
    public RegionPointSet(RegionList nodeList)
    {
	setNodeList(nodeList);
    }
    
    
    // Methods for field "anchor"
    public Position3D getAnchor()
    {
	return this.anchor;
    }
    
    public void setAnchor(Position3D anchor)
    {
	this.anchor = anchor;
    }
    
    public boolean hasAnchor()
    {
	return (anchor != null);
    }
    
    public void deleteAnchor()
    {
	anchor = null;
    }
    
    
    // Methods for field "scale"
    public Zoom getScale()
    {
	return this.scale;
    }
    
    public void setScale(Zoom scale)
    {
	this.scale = scale;
    }
    
    public boolean hasScale()
    {
	return (scale != null);
    }
    
    public void deleteScale()
    {
	scale = null;
    }
    
    
    // Methods for field "nodeList"
    public RegionList getNodeList()
    {
	return this.nodeList;
    }
    
    public void setNodeList(RegionList nodeList)
    {
	this.nodeList = nodeList;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__anchor("anchor"),
	__scale("scale"),
	__nodeList("nodeList"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(4);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RegionPointSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.anchor != null);
	sink.writeBit(data.scale != null);
	nbits += 3;
	if (data.anchor != null) {
	    // Encode field 'anchor'
	    try {
		Position3D item1 = data.anchor;

		nbits += Position3D.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("anchor", "Position3D");
		throw ee;
	    }
	}
	if (data.scale != null) {
	    // Encode field 'scale'
	    try {
		Zoom item1 = data.scale;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 15)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 15, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("scale", "Zoom");
		throw ee;
	    }
	}
	// Encode field 'nodeList'
	try {
	    RegionList item1 = data.nodeList;

	    nbits += RegionList.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "RegionList");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static RegionPointSet decodeValue(PerCoder coder, InputBitStream source, RegionPointSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_anchor0 = source.readBit();
	boolean has_scale0 = source.readBit();
    /** Decode root fields **/
	if (has_anchor0) {
	    // Decode field 'anchor'
	    try {
		if (data.anchor == null)
		    data.anchor = new Position3D();
		data.anchor.decodeValue(coder, source, data.anchor);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("anchor", "Position3D");
		throw de;
	    }
	} else {
	    data.anchor = null;
	}
	if (has_scale0) {
	    // Decode field 'scale'
	    try {
		long temp1;

		if (data.scale == null)
		    data.scale = new Zoom();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (temp1 > 15)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.scale.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("scale", "Zoom");
		throw de;
	    }
	} else {
	    data.scale = null;
	}
	// Decode field 'nodeList'
	try {
	    if (data.nodeList == null)
		data.nodeList = new RegionList();
	    data.nodeList.decodeValue(coder, source, data.nodeList);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("nodeList", "RegionList");
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
	// Encode field 'anchor'
	try {
	    Position3D item1 = this.anchor;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("anchor");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "anchor");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("anchor", "Position3D");
	    throw ee;
	}
	// Encode field 'scale'
	try {
	    Zoom item1 = this.scale;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("scale");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "scale");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("scale", "Zoom");
	    throw ee;
	}
	// Encode field 'nodeList'
	try {
	    RegionList item1 = this.nodeList;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("nodeList");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "RegionList");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RegionPointSet decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[4];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __anchor:
		    // Decode field 'anchor'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.anchor == null)
				this.anchor = new Position3D();
			    this.anchor.decodeValue(coder, source);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("anchor", "Position3D");
			throw de;
		    }
		    break;
		    case __scale:
		    // Decode field 'scale'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.scale == null)
				this.scale = new Zoom();
			    this.scale.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("scale", "Zoom");
			throw de;
		    }
		    break;
		    case __nodeList:
		    // Decode field 'nodeList'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.nodeList == null)
			    this.nodeList = new RegionList();
			this.nodeList.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("nodeList", "RegionList");
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
	    this.anchor = null;
	if (!present0[1])
	    this.scale = null;
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'nodeList'");
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
	if (this.anchor != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("anchor ");
		this.anchor.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.scale != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("scale ");
		writer.print(this.scale.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("nodeList ");
	    this.nodeList.printValue(printer, writer);
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
	return equalTo((RegionPointSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RegionPointSet)that);
    }
    
    public boolean equalTo(RegionPointSet that) {
	if (this.anchor != null) {
	    if (that.anchor == null || !this.anchor.equalTo(that.anchor))
		return false;
	} else if (that.anchor != null)
	    return false;
	if (this.scale != null) {
	    if (that.scale == null || !this.scale.equalTo(that.scale))
		return false;
	} else if (that.scale != null)
	    return false;
	if (!this.nodeList.equalTo(that.nodeList))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RegionPointSet clone() {
	RegionPointSet copy = (RegionPointSet)super.clone();
	if (anchor != null) {
	    copy.anchor = anchor.clone();
	}
	if (scale != null) {
	    copy.scale = scale.clone();
	}
	copy.nodeList = nodeList.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.anchor != null ? this.anchor.hashCode() : 0);
	hash = 41 * hash + (this.scale != null ? this.scale.hashCode() : 0);
	hash = 41 * hash + (this.nodeList != null ? this.nodeList.hashCode() : 0);
	return hash;
    }
} // End class definition for RegionPointSet
