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
 * Define the ShapePointSet ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class ShapePointSet extends Sequence {
    public Position3D anchor;
    public LaneWidth laneWidth;
    public DirectionOfUse directionality;
    public NodeListXY nodeList;
    
    /**
     * The default constructor.
     */
    public ShapePointSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ShapePointSet(Position3D anchor, LaneWidth laneWidth, 
		    DirectionOfUse directionality, NodeListXY nodeList)
    {
	setAnchor(anchor);
	setLaneWidth(laneWidth);
	setDirectionality(directionality);
	setNodeList(nodeList);
    }
    
    /**
     * Construct with required components.
     */
    public ShapePointSet(NodeListXY nodeList)
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
    
    
    // Methods for field "laneWidth"
    public LaneWidth getLaneWidth()
    {
	return this.laneWidth;
    }
    
    public void setLaneWidth(LaneWidth laneWidth)
    {
	this.laneWidth = laneWidth;
    }
    
    public boolean hasLaneWidth()
    {
	return (laneWidth != null);
    }
    
    public void deleteLaneWidth()
    {
	laneWidth = null;
    }
    
    
    // Methods for field "directionality"
    public DirectionOfUse getDirectionality()
    {
	return this.directionality;
    }
    
    public void setDirectionality(DirectionOfUse directionality)
    {
	this.directionality = directionality;
    }
    
    public boolean hasDirectionality()
    {
	return (directionality != null);
    }
    
    public void deleteDirectionality()
    {
	directionality = null;
    }
    
    
    // Methods for field "nodeList"
    public NodeListXY getNodeList()
    {
	return this.nodeList;
    }
    
    public void setNodeList(NodeListXY nodeList)
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
	__laneWidth("laneWidth"),
	__directionality("directionality"),
	__nodeList("nodeList"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ShapePointSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.anchor != null);
	sink.writeBit(data.laneWidth != null);
	sink.writeBit(data.directionality != null);
	nbits += 4;
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
	if (data.laneWidth != null) {
	    // Encode field 'laneWidth'
	    try {
		LaneWidth item1 = data.laneWidth;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneWidth", "LaneWidth");
		throw ee;
	    }
	}
	if (data.directionality != null) {
	    // Encode field 'directionality'
	    try {
		DirectionOfUse item1 = data.directionality;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("directionality", "DirectionOfUse");
		throw ee;
	    }
	}
	// Encode field 'nodeList'
	try {
	    NodeListXY item1 = data.nodeList;

	    nbits += NodeListXY.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeListXY");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static ShapePointSet decodeValue(PerCoder coder, InputBitStream source, ShapePointSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_anchor0 = source.readBit();
	boolean has_laneWidth0 = source.readBit();
	boolean has_directionality0 = source.readBit();
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
	if (has_laneWidth0) {
	    // Decode field 'laneWidth'
	    try {
		long temp1;

		if (data.laneWidth == null)
		    data.laneWidth = new LaneWidth();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.laneWidth.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("laneWidth", "LaneWidth");
		throw de;
	    }
	} else {
	    data.laneWidth = null;
	}
	if (has_directionality0) {
	    // Decode field 'directionality'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.directionality = DirectionOfUse.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("directionality", "DirectionOfUse");
		throw de;
	    }
	} else {
	    data.directionality = null;
	}
	// Decode field 'nodeList'
	try {
	    if (data.nodeList == null)
		data.nodeList = new NodeListXY();
	    data.nodeList.decodeValue(coder, source, data.nodeList);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("nodeList", "NodeListXY");
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
	// Encode field 'laneWidth'
	try {
	    LaneWidth item1 = this.laneWidth;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("laneWidth");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "laneWidth");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneWidth", "LaneWidth");
	    throw ee;
	}
	// Encode field 'directionality'
	try {
	    DirectionOfUse item1 = this.directionality;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("directionality");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "directionality");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("directionality", "DirectionOfUse");
	    throw ee;
	}
	// Encode field 'nodeList'
	try {
	    NodeListXY item1 = this.nodeList;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("nodeList");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("nodeList", "NodeListXY");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ShapePointSet decodeValue(JsonCoder coder, JsonReader source)
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
		    case __laneWidth:
		    // Decode field 'laneWidth'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.laneWidth == null)
				this.laneWidth = new LaneWidth();
			    this.laneWidth.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneWidth", "LaneWidth");
			throw de;
		    }
		    break;
		    case __directionality:
		    // Decode field 'directionality'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    DirectionOfUse temp1;

			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(DirectionOfUse.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = DirectionOfUse.cNamedNumbers[idx1];
			    this.directionality = temp1;
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("directionality", "DirectionOfUse");
			throw de;
		    }
		    break;
		    case __nodeList:
		    // Decode field 'nodeList'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.nodeList == null)
			    this.nodeList = new NodeListXY();
			this.nodeList.decodeValue(coder, source);
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("nodeList", "NodeListXY");
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
	    this.laneWidth = null;
	if (!present0[2])
	    this.directionality = null;
	if (!present0[3])
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
	if (this.laneWidth != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("laneWidth ");
		writer.print(this.laneWidth.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.directionality != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("directionality ");
		printer.print(this.directionality, writer, this.directionality.cConstantNameList);
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
	return equalTo((ShapePointSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ShapePointSet)that);
    }
    
    public boolean equalTo(ShapePointSet that) {
	if (this.anchor != null) {
	    if (that.anchor == null || !this.anchor.equalTo(that.anchor))
		return false;
	} else if (that.anchor != null)
	    return false;
	if (this.laneWidth != null) {
	    if (that.laneWidth == null || !this.laneWidth.equalTo(that.laneWidth))
		return false;
	} else if (that.laneWidth != null)
	    return false;
	if (this.directionality != null) {
	    if (that.directionality == null || !this.directionality.equalTo(that.directionality))
		return false;
	} else if (that.directionality != null)
	    return false;
	if (!this.nodeList.equalTo(that.nodeList))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public ShapePointSet clone() {
	ShapePointSet copy = (ShapePointSet)super.clone();
	if (anchor != null) {
	    copy.anchor = anchor.clone();
	}
	if (laneWidth != null) {
	    copy.laneWidth = laneWidth.clone();
	}
	if (directionality != null) {
	    copy.directionality = directionality.clone();
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
	hash = 41 * hash + (this.laneWidth != null ? this.laneWidth.hashCode() : 0);
	hash = 41 * hash + (this.directionality != null ? this.directionality.hashCode() : 0);
	hash = 41 * hash + (this.nodeList != null ? this.nodeList.hashCode() : 0);
	return hash;
    }
} // End class definition for ShapePointSet
