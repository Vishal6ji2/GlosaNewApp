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
 * Define the PathHistory ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class PathHistory extends Sequence {
    public FullPositionVector initialPosition;
    public GNSSstatus currGNSSstatus;
    public PathHistoryPointList crumbData;
    
    /**
     * The default constructor.
     */
    public PathHistory()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PathHistory(FullPositionVector initialPosition, 
		    GNSSstatus currGNSSstatus, PathHistoryPointList crumbData)
    {
	setInitialPosition(initialPosition);
	setCurrGNSSstatus(currGNSSstatus);
	setCrumbData(crumbData);
    }
    
    /**
     * Construct with required components.
     */
    public PathHistory(PathHistoryPointList crumbData)
    {
	setCrumbData(crumbData);
    }
    
    
    // Methods for field "initialPosition"
    public FullPositionVector getInitialPosition()
    {
	return this.initialPosition;
    }
    
    public void setInitialPosition(FullPositionVector initialPosition)
    {
	this.initialPosition = initialPosition;
    }
    
    public boolean hasInitialPosition()
    {
	return (initialPosition != null);
    }
    
    public void deleteInitialPosition()
    {
	initialPosition = null;
    }
    
    
    // Methods for field "currGNSSstatus"
    public GNSSstatus getCurrGNSSstatus()
    {
	return this.currGNSSstatus;
    }
    
    public void setCurrGNSSstatus(GNSSstatus currGNSSstatus)
    {
	this.currGNSSstatus = currGNSSstatus;
    }
    
    public boolean hasCurrGNSSstatus()
    {
	return (currGNSSstatus != null);
    }
    
    public void deleteCurrGNSSstatus()
    {
	currGNSSstatus = null;
    }
    
    
    // Methods for field "crumbData"
    public PathHistoryPointList getCrumbData()
    {
	return this.crumbData;
    }
    
    public void setCrumbData(PathHistoryPointList crumbData)
    {
	this.crumbData = crumbData;
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_currGNSSstatus = 
	GNSSstatus._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__initialPosition("initialPosition"),
	__currGNSSstatus("currGNSSstatus"),
	__crumbData("crumbData"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PathHistory data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.initialPosition != null);
	sink.writeBit(data.currGNSSstatus != null);
	nbits += 3;
	if (data.initialPosition != null) {
	    // Encode field 'initialPosition'
	    try {
		FullPositionVector item1 = data.initialPosition;

		nbits += FullPositionVector.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("initialPosition", "FullPositionVector");
		throw ee;
	    }
	}
	if (data.currGNSSstatus != null) {
	    // Encode field 'currGNSSstatus'
	    try {
		GNSSstatus item1 = data.currGNSSstatus;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, PathHistory._cBounds_currGNSSstatus);
		if (total_len1 != 8)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 8, 8, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("currGNSSstatus", "GNSSstatus");
		throw ee;
	    }
	}
	// Encode field 'crumbData'
	try {
	    PathHistoryPointList item1 = data.crumbData;

	    nbits += PathHistoryPointList.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crumbData", "PathHistoryPointList");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static PathHistory decodeValue(PerCoder coder, InputBitStream source, PathHistory data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_initialPosition0 = source.readBit();
	boolean has_currGNSSstatus0 = source.readBit();
    /** Decode root fields **/
	if (has_initialPosition0) {
	    // Decode field 'initialPosition'
	    try {
		if (data.initialPosition == null)
		    data.initialPosition = new FullPositionVector();
		data.initialPosition.decodeValue(coder, source, data.initialPosition);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("initialPosition", "FullPositionVector");
		throw de;
	    }
	} else {
	    data.initialPosition = null;
	}
	if (has_currGNSSstatus0) {
	    // Decode field 'currGNSSstatus'
	    try {
		if (data.currGNSSstatus == null)
		    data.currGNSSstatus = new GNSSstatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, 8, 8, data.currGNSSstatus);
		if (coder.isStrictCodingEnabled() && data.currGNSSstatus.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.currGNSSstatus, PathHistory._cBounds_currGNSSstatus))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("currGNSSstatus", "GNSSstatus");
		throw de;
	    }
	} else {
	    data.currGNSSstatus = null;
	}
	// Decode field 'crumbData'
	try {
	    if (data.crumbData == null)
		data.crumbData = new PathHistoryPointList();
	    data.crumbData.decodeValue(coder, source, data.crumbData);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("crumbData", "PathHistoryPointList");
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
	// Encode field 'initialPosition'
	try {
	    FullPositionVector item1 = this.initialPosition;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("initialPosition");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "initialPosition");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("initialPosition", "FullPositionVector");
	    throw ee;
	}
	// Encode field 'currGNSSstatus'
	try {
	    GNSSstatus item1 = this.currGNSSstatus;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("currGNSSstatus");
		    coder.encodeBitStringWithNamedBits(temp1, len1, 8, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "currGNSSstatus");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("currGNSSstatus", "GNSSstatus");
	    throw ee;
	}
	// Encode field 'crumbData'
	try {
	    PathHistoryPointList item1 = this.crumbData;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("crumbData");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crumbData", "PathHistoryPointList");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public PathHistory decodeValue(JsonCoder coder, JsonReader source)
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
		    case __initialPosition:
		    // Decode field 'initialPosition'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.initialPosition == null)
				this.initialPosition = new FullPositionVector();
			    this.initialPosition.decodeValue(coder, source);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("initialPosition", "FullPositionVector");
			throw de;
		    }
		    break;
		    case __currGNSSstatus:
		    // Decode field 'currGNSSstatus'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.currGNSSstatus == null)
				this.currGNSSstatus = new GNSSstatus();
			    coder.decodeBitString(8, source, this.currGNSSstatus);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("currGNSSstatus", "GNSSstatus");
			throw de;
		    }
		    break;
		    case __crumbData:
		    // Decode field 'crumbData'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.crumbData == null)
			    this.crumbData = new PathHistoryPointList();
			this.crumbData.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("crumbData", "PathHistoryPointList");
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
	    this.initialPosition = null;
	if (!present0[1])
	    this.currGNSSstatus = null;
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'crumbData'");
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
	if (this.initialPosition != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("initialPosition ");
		this.initialPosition.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.currGNSSstatus != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("currGNSSstatus ");
		printer.print(this.currGNSSstatus, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("crumbData ");
	    this.crumbData.printValue(printer, writer);
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
	return equalTo((PathHistory)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PathHistory)that);
    }
    
    public boolean equalTo(PathHistory that) {
	if (this.initialPosition != null) {
	    if (that.initialPosition == null || !this.initialPosition.equalTo(that.initialPosition))
		return false;
	} else if (that.initialPosition != null)
	    return false;
	if (this.currGNSSstatus != null) {
	    if (that.currGNSSstatus == null || !this.currGNSSstatus.equalTo(that.currGNSSstatus))
		return false;
	} else if (that.currGNSSstatus != null)
	    return false;
	if (!this.crumbData.equalTo(that.crumbData))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public PathHistory clone() {
	PathHistory copy = (PathHistory)super.clone();
	if (initialPosition != null) {
	    copy.initialPosition = initialPosition.clone();
	}
	if (currGNSSstatus != null) {
	    copy.currGNSSstatus = currGNSSstatus.clone();
	}
	copy.crumbData = crumbData.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.initialPosition != null ? this.initialPosition.hashCode() : 0);
	hash = 41 * hash + (this.currGNSSstatus != null ? this.currGNSSstatus.hashCode() : 0);
	hash = 41 * hash + (this.crumbData != null ? this.crumbData.hashCode() : 0);
	return hash;
    }
} // End class definition for PathHistory
