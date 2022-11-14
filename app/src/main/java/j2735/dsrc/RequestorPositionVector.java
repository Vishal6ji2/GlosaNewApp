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
 * Define the RequestorPositionVector ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RequestorPositionVector extends Sequence {
    public Position3D position;
    public Angle heading;
    public TransmissionAndSpeed speed;
    
    /**
     * The default constructor.
     */
    public RequestorPositionVector()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RequestorPositionVector(Position3D position, Angle heading, 
		    TransmissionAndSpeed speed)
    {
	setPosition(position);
	setHeading(heading);
	setSpeed(speed);
    }
    
    /**
     * Construct with required components.
     */
    public RequestorPositionVector(Position3D position)
    {
	setPosition(position);
    }
    
    
    // Methods for field "position"
    public Position3D getPosition()
    {
	return this.position;
    }
    
    public void setPosition(Position3D position)
    {
	this.position = position;
    }
    
    
    // Methods for field "heading"
    public Angle getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(Angle heading)
    {
	this.heading = heading;
    }
    
    public boolean hasHeading()
    {
	return (heading != null);
    }
    
    public void deleteHeading()
    {
	heading = null;
    }
    
    
    // Methods for field "speed"
    public TransmissionAndSpeed getSpeed()
    {
	return this.speed;
    }
    
    public void setSpeed(TransmissionAndSpeed speed)
    {
	this.speed = speed;
    }
    
    public boolean hasSpeed()
    {
	return (speed != null);
    }
    
    public void deleteSpeed()
    {
	speed = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__position("position"),
	__heading("heading"),
	__speed("speed"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RequestorPositionVector data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.heading != null);
	sink.writeBit(data.speed != null);
	nbits += 3;
	// Encode field 'position'
	try {
	    Position3D item1 = data.position;

	    nbits += Position3D.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("position", "Position3D");
	    throw ee;
	}
	if (data.heading != null) {
	    // Encode field 'heading'
	    try {
		Angle item1 = data.heading;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 28800)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("heading", "Angle");
		throw ee;
	    }
	}
	if (data.speed != null) {
	    // Encode field 'speed'
	    try {
		TransmissionAndSpeed item1 = data.speed;

		nbits += TransmissionAndSpeed.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speed", "TransmissionAndSpeed");
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
    public static RequestorPositionVector decodeValue(PerCoder coder, InputBitStream source, RequestorPositionVector data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_heading0 = source.readBit();
	boolean has_speed0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'position'
	try {
	    if (data.position == null)
		data.position = new Position3D();
	    data.position.decodeValue(coder, source, data.position);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("position", "Position3D");
	    throw de;
	}
	if (has_heading0) {
	    // Decode field 'heading'
	    try {
		long temp1;

		if (data.heading == null)
		    data.heading = new Angle();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
		if (temp1 > 28800)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.heading.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("heading", "Angle");
		throw de;
	    }
	} else {
	    data.heading = null;
	}
	if (has_speed0) {
	    // Decode field 'speed'
	    try {
		if (data.speed == null)
		    data.speed = new TransmissionAndSpeed();
		data.speed.decodeValue(coder, source, data.speed);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speed", "TransmissionAndSpeed");
		throw de;
	    }
	} else {
	    data.speed = null;
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
	// Encode field 'position'
	try {
	    Position3D item1 = this.position;

	    {
		sink.encodeKey("position");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("position", "Position3D");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    Angle item1 = this.heading;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("heading");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "heading");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "Angle");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    TransmissionAndSpeed item1 = this.speed;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("speed");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "speed");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "TransmissionAndSpeed");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RequestorPositionVector decodeValue(JsonCoder coder, JsonReader source)
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
		    case __position:
		    // Decode field 'position'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.position == null)
			    this.position = new Position3D();
			this.position.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("position", "Position3D");
			throw de;
		    }
		    break;
		    case __heading:
		    // Decode field 'heading'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.heading == null)
				this.heading = new Angle();
			    this.heading.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("heading", "Angle");
			throw de;
		    }
		    break;
		    case __speed:
		    // Decode field 'speed'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.speed == null)
				this.speed = new TransmissionAndSpeed();
			    this.speed.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed", "TransmissionAndSpeed");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'position'");
	if (!present0[1])
	    this.heading = null;
	if (!present0[2])
	    this.speed = null;
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
	    writer.print("position ");
	    this.position.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.heading != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("heading ");
		writer.print(this.heading.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speed != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("speed ");
		this.speed.printValue(printer, writer);
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
	return equalTo((RequestorPositionVector)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RequestorPositionVector)that);
    }
    
    public boolean equalTo(RequestorPositionVector that) {
	if (!this.position.equalTo(that.position))
	    return false;
	if (this.heading != null) {
	    if (that.heading == null || !this.heading.equalTo(that.heading))
		return false;
	} else if (that.heading != null)
	    return false;
	if (this.speed != null) {
	    if (that.speed == null || !this.speed.equalTo(that.speed))
		return false;
	} else if (that.speed != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RequestorPositionVector clone() {
	RequestorPositionVector copy = (RequestorPositionVector)super.clone();
	copy.position = position.clone();
	if (heading != null) {
	    copy.heading = heading.clone();
	}
	if (speed != null) {
	    copy.speed = speed.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.position != null ? this.position.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	return hash;
    }
} // End class definition for RequestorPositionVector
