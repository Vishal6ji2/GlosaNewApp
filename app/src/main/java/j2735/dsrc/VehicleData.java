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
 * Define the VehicleData ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class VehicleData extends Sequence {
    public VehicleHeight height;
    public BumperHeights bumpers;
    public VehicleMass mass;
    public TrailerWeight trailerWeight;
    
    /**
     * The default constructor.
     */
    public VehicleData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleData(VehicleHeight height, BumperHeights bumpers, 
		    VehicleMass mass, TrailerWeight trailerWeight)
    {
	setHeight(height);
	setBumpers(bumpers);
	setMass(mass);
	setTrailerWeight(trailerWeight);
    }
    
    
    // Methods for field "height"
    public VehicleHeight getHeight()
    {
	return this.height;
    }
    
    public void setHeight(VehicleHeight height)
    {
	this.height = height;
    }
    
    public boolean hasHeight()
    {
	return (height != null);
    }
    
    public void deleteHeight()
    {
	height = null;
    }
    
    
    // Methods for field "bumpers"
    public BumperHeights getBumpers()
    {
	return this.bumpers;
    }
    
    public void setBumpers(BumperHeights bumpers)
    {
	this.bumpers = bumpers;
    }
    
    public boolean hasBumpers()
    {
	return (bumpers != null);
    }
    
    public void deleteBumpers()
    {
	bumpers = null;
    }
    
    
    // Methods for field "mass"
    public VehicleMass getMass()
    {
	return this.mass;
    }
    
    public void setMass(VehicleMass mass)
    {
	this.mass = mass;
    }
    
    public boolean hasMass()
    {
	return (mass != null);
    }
    
    public void deleteMass()
    {
	mass = null;
    }
    
    
    // Methods for field "trailerWeight"
    public TrailerWeight getTrailerWeight()
    {
	return this.trailerWeight;
    }
    
    public void setTrailerWeight(TrailerWeight trailerWeight)
    {
	this.trailerWeight = trailerWeight;
    }
    
    public boolean hasTrailerWeight()
    {
	return (trailerWeight != null);
    }
    
    public void deleteTrailerWeight()
    {
	trailerWeight = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__height("height"),
	__bumpers("bumpers"),
	__mass("mass"),
	__trailerWeight("trailerWeight"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.height != null);
	sink.writeBit(data.bumpers != null);
	sink.writeBit(data.mass != null);
	sink.writeBit(data.trailerWeight != null);
	nbits += 5;
	if (data.height != null) {
	    // Encode field 'height'
	    try {
		VehicleHeight item1 = data.height;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("height", "VehicleHeight");
		throw ee;
	    }
	}
	if (data.bumpers != null) {
	    // Encode field 'bumpers'
	    try {
		BumperHeights item1 = data.bumpers;

		nbits += BumperHeights.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("bumpers", "BumperHeights");
		throw ee;
	    }
	}
	if (data.mass != null) {
	    // Encode field 'mass'
	    try {
		VehicleMass item1 = data.mass;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("mass", "VehicleMass");
		throw ee;
	    }
	}
	if (data.trailerWeight != null) {
	    // Encode field 'trailerWeight'
	    try {
		TrailerWeight item1 = data.trailerWeight;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 64255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 64255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trailerWeight", "TrailerWeight");
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
    public static VehicleData decodeValue(PerCoder coder, InputBitStream source, VehicleData data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_height0 = source.readBit();
	boolean has_bumpers0 = source.readBit();
	boolean has_mass0 = source.readBit();
	boolean has_trailerWeight0 = source.readBit();
    /** Decode root fields **/
	if (has_height0) {
	    // Decode field 'height'
	    try {
		long temp1;

		if (data.height == null)
		    data.height = new VehicleHeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.height.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("height", "VehicleHeight");
		throw de;
	    }
	} else {
	    data.height = null;
	}
	if (has_bumpers0) {
	    // Decode field 'bumpers'
	    try {
		if (data.bumpers == null)
		    data.bumpers = new BumperHeights();
		data.bumpers.decodeValue(coder, source, data.bumpers);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("bumpers", "BumperHeights");
		throw de;
	    }
	} else {
	    data.bumpers = null;
	}
	if (has_mass0) {
	    // Decode field 'mass'
	    try {
		long temp1;

		if (data.mass == null)
		    data.mass = new VehicleMass();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.mass.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("mass", "VehicleMass");
		throw de;
	    }
	} else {
	    data.mass = null;
	}
	if (has_trailerWeight0) {
	    // Decode field 'trailerWeight'
	    try {
		long temp1;

		if (data.trailerWeight == null)
		    data.trailerWeight = new TrailerWeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 64255);
		if (temp1 > 64255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.trailerWeight.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("trailerWeight", "TrailerWeight");
		throw de;
	    }
	} else {
	    data.trailerWeight = null;
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
	// Encode field 'height'
	try {
	    VehicleHeight item1 = this.height;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("height");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "height");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("height", "VehicleHeight");
	    throw ee;
	}
	// Encode field 'bumpers'
	try {
	    BumperHeights item1 = this.bumpers;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("bumpers");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "bumpers");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("bumpers", "BumperHeights");
	    throw ee;
	}
	// Encode field 'mass'
	try {
	    VehicleMass item1 = this.mass;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("mass");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "mass");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("mass", "VehicleMass");
	    throw ee;
	}
	// Encode field 'trailerWeight'
	try {
	    TrailerWeight item1 = this.trailerWeight;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("trailerWeight");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "trailerWeight");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("trailerWeight", "TrailerWeight");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleData decodeValue(JsonCoder coder, JsonReader source)
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
		    case __height:
		    // Decode field 'height'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.height == null)
				this.height = new VehicleHeight();
			    this.height.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("height", "VehicleHeight");
			throw de;
		    }
		    break;
		    case __bumpers:
		    // Decode field 'bumpers'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.bumpers == null)
				this.bumpers = new BumperHeights();
			    this.bumpers.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("bumpers", "BumperHeights");
			throw de;
		    }
		    break;
		    case __mass:
		    // Decode field 'mass'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.mass == null)
				this.mass = new VehicleMass();
			    this.mass.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("mass", "VehicleMass");
			throw de;
		    }
		    break;
		    case __trailerWeight:
		    // Decode field 'trailerWeight'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.trailerWeight == null)
				this.trailerWeight = new TrailerWeight();
			    this.trailerWeight.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("trailerWeight", "TrailerWeight");
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
	    this.height = null;
	if (!present0[1])
	    this.bumpers = null;
	if (!present0[2])
	    this.mass = null;
	if (!present0[3])
	    this.trailerWeight = null;
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
	if (this.height != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("height ");
		writer.print(this.height.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.bumpers != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("bumpers ");
		this.bumpers.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.mass != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("mass ");
		writer.print(this.mass.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.trailerWeight != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("trailerWeight ");
		writer.print(this.trailerWeight.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((VehicleData)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleData)that);
    }
    
    public boolean equalTo(VehicleData that) {
	if (this.height != null) {
	    if (that.height == null || !this.height.equalTo(that.height))
		return false;
	} else if (that.height != null)
	    return false;
	if (this.bumpers != null) {
	    if (that.bumpers == null || !this.bumpers.equalTo(that.bumpers))
		return false;
	} else if (that.bumpers != null)
	    return false;
	if (this.mass != null) {
	    if (that.mass == null || !this.mass.equalTo(that.mass))
		return false;
	} else if (that.mass != null)
	    return false;
	if (this.trailerWeight != null) {
	    if (that.trailerWeight == null || !this.trailerWeight.equalTo(that.trailerWeight))
		return false;
	} else if (that.trailerWeight != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleData clone() {
	VehicleData copy = (VehicleData)super.clone();
	if (height != null) {
	    copy.height = height.clone();
	}
	if (bumpers != null) {
	    copy.bumpers = bumpers.clone();
	}
	if (mass != null) {
	    copy.mass = mass.clone();
	}
	if (trailerWeight != null) {
	    copy.trailerWeight = trailerWeight.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.height != null ? this.height.hashCode() : 0);
	hash = 41 * hash + (this.bumpers != null ? this.bumpers.hashCode() : 0);
	hash = 41 * hash + (this.mass != null ? this.mass.hashCode() : 0);
	hash = 41 * hash + (this.trailerWeight != null ? this.trailerWeight.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleData
