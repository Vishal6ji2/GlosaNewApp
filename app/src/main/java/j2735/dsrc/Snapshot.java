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
 * Define the Snapshot ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class Snapshot extends Sequence {
    public FullPositionVector thePosition;
    public VehicleSafetyExtensions safetyExt;
    public VehicleStatus dataSet;
    
    /**
     * The default constructor.
     */
    public Snapshot()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Snapshot(FullPositionVector thePosition, 
		    VehicleSafetyExtensions safetyExt, VehicleStatus dataSet)
    {
	setThePosition(thePosition);
	setSafetyExt(safetyExt);
	setDataSet(dataSet);
    }
    
    /**
     * Construct with required components.
     */
    public Snapshot(FullPositionVector thePosition)
    {
	setThePosition(thePosition);
    }
    
    
    // Methods for field "thePosition"
    public FullPositionVector getThePosition()
    {
	return this.thePosition;
    }
    
    public void setThePosition(FullPositionVector thePosition)
    {
	this.thePosition = thePosition;
    }
    
    
    // Methods for field "safetyExt"
    public VehicleSafetyExtensions getSafetyExt()
    {
	return this.safetyExt;
    }
    
    public void setSafetyExt(VehicleSafetyExtensions safetyExt)
    {
	this.safetyExt = safetyExt;
    }
    
    public boolean hasSafetyExt()
    {
	return (safetyExt != null);
    }
    
    public void deleteSafetyExt()
    {
	safetyExt = null;
    }
    
    
    // Methods for field "dataSet"
    public VehicleStatus getDataSet()
    {
	return this.dataSet;
    }
    
    public void setDataSet(VehicleStatus dataSet)
    {
	this.dataSet = dataSet;
    }
    
    public boolean hasDataSet()
    {
	return (dataSet != null);
    }
    
    public void deleteDataSet()
    {
	dataSet = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__thePosition("thePosition"),
	__safetyExt("safetyExt"),
	__dataSet("dataSet"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, Snapshot data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.safetyExt != null);
	sink.writeBit(data.dataSet != null);
	nbits += 3;
	// Encode field 'thePosition'
	try {
	    FullPositionVector item1 = data.thePosition;

	    nbits += FullPositionVector.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("thePosition", "FullPositionVector");
	    throw ee;
	}
	if (data.safetyExt != null) {
	    // Encode field 'safetyExt'
	    try {
		VehicleSafetyExtensions item1 = data.safetyExt;

		nbits += VehicleSafetyExtensions.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("safetyExt", "VehicleSafetyExtensions");
		throw ee;
	    }
	}
	if (data.dataSet != null) {
	    // Encode field 'dataSet'
	    try {
		VehicleStatus item1 = data.dataSet;

		nbits += VehicleStatus.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dataSet", "VehicleStatus");
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
    public static Snapshot decodeValue(PerCoder coder, InputBitStream source, Snapshot data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_safetyExt0 = source.readBit();
	boolean has_dataSet0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'thePosition'
	try {
	    if (data.thePosition == null)
		data.thePosition = new FullPositionVector();
	    data.thePosition.decodeValue(coder, source, data.thePosition);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("thePosition", "FullPositionVector");
	    throw de;
	}
	if (has_safetyExt0) {
	    // Decode field 'safetyExt'
	    try {
		if (data.safetyExt == null)
		    data.safetyExt = new VehicleSafetyExtensions();
		data.safetyExt.decodeValue(coder, source, data.safetyExt);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("safetyExt", "VehicleSafetyExtensions");
		throw de;
	    }
	} else {
	    data.safetyExt = null;
	}
	if (has_dataSet0) {
	    // Decode field 'dataSet'
	    try {
		if (data.dataSet == null)
		    data.dataSet = new VehicleStatus();
		data.dataSet.decodeValue(coder, source, data.dataSet);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dataSet", "VehicleStatus");
		throw de;
	    }
	} else {
	    data.dataSet = null;
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
	// Encode field 'thePosition'
	try {
	    FullPositionVector item1 = this.thePosition;

	    {
		sink.encodeKey("thePosition");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("thePosition", "FullPositionVector");
	    throw ee;
	}
	// Encode field 'safetyExt'
	try {
	    VehicleSafetyExtensions item1 = this.safetyExt;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("safetyExt");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "safetyExt");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("safetyExt", "VehicleSafetyExtensions");
	    throw ee;
	}
	// Encode field 'dataSet'
	try {
	    VehicleStatus item1 = this.dataSet;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("dataSet");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "dataSet");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataSet", "VehicleStatus");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Snapshot decodeValue(JsonCoder coder, JsonReader source)
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
		    case __thePosition:
		    // Decode field 'thePosition'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.thePosition == null)
			    this.thePosition = new FullPositionVector();
			this.thePosition.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("thePosition", "FullPositionVector");
			throw de;
		    }
		    break;
		    case __safetyExt:
		    // Decode field 'safetyExt'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.safetyExt == null)
				this.safetyExt = new VehicleSafetyExtensions();
			    this.safetyExt.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("safetyExt", "VehicleSafetyExtensions");
			throw de;
		    }
		    break;
		    case __dataSet:
		    // Decode field 'dataSet'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.dataSet == null)
				this.dataSet = new VehicleStatus();
			    this.dataSet.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dataSet", "VehicleStatus");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'thePosition'");
	if (!present0[1])
	    this.safetyExt = null;
	if (!present0[2])
	    this.dataSet = null;
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
	    writer.print("thePosition ");
	    this.thePosition.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.safetyExt != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("safetyExt ");
		this.safetyExt.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.dataSet != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("dataSet ");
		this.dataSet.printValue(printer, writer);
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
	return equalTo((Snapshot)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((Snapshot)that);
    }
    
    public boolean equalTo(Snapshot that) {
	if (!this.thePosition.equalTo(that.thePosition))
	    return false;
	if (this.safetyExt != null) {
	    if (that.safetyExt == null || !this.safetyExt.equalTo(that.safetyExt))
		return false;
	} else if (that.safetyExt != null)
	    return false;
	if (this.dataSet != null) {
	    if (that.dataSet == null || !this.dataSet.equalTo(that.dataSet))
		return false;
	} else if (that.dataSet != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public Snapshot clone() {
	Snapshot copy = (Snapshot)super.clone();
	copy.thePosition = thePosition.clone();
	if (safetyExt != null) {
	    copy.safetyExt = safetyExt.clone();
	}
	if (dataSet != null) {
	    copy.dataSet = dataSet.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.thePosition != null ? this.thePosition.hashCode() : 0);
	hash = 41 * hash + (this.safetyExt != null ? this.safetyExt.hashCode() : 0);
	hash = 41 * hash + (this.dataSet != null ? this.dataSet.hashCode() : 0);
	return hash;
    }
} // End class definition for Snapshot
