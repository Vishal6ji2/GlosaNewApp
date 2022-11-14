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
 * Define the TrailerData ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class TrailerData extends Sequence {
    public SSPindex sspRights;
    public PivotPointDescription connection;
    public TrailerUnitDescriptionList units;
    
    /**
     * The default constructor.
     */
    public TrailerData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrailerData(SSPindex sspRights, PivotPointDescription connection, 
		    TrailerUnitDescriptionList units)
    {
	setSspRights(sspRights);
	setConnection(connection);
	setUnits(units);
    }
    
    
    // Methods for field "sspRights"
    public SSPindex getSspRights()
    {
	return this.sspRights;
    }
    
    public void setSspRights(SSPindex sspRights)
    {
	this.sspRights = sspRights;
    }
    
    
    // Methods for field "connection"
    public PivotPointDescription getConnection()
    {
	return this.connection;
    }
    
    public void setConnection(PivotPointDescription connection)
    {
	this.connection = connection;
    }
    
    
    // Methods for field "units"
    public TrailerUnitDescriptionList getUnits()
    {
	return this.units;
    }
    
    public void setUnits(TrailerUnitDescriptionList units)
    {
	this.units = units;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__sspRights("sspRights"),
	__connection("connection"),
	__units("units"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, TrailerData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	++nbits;
	// Encode field 'sspRights'
	try {
	    SSPindex item1 = data.sspRights;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspRights", "SSPindex");
	    throw ee;
	}
	// Encode field 'connection'
	try {
	    PivotPointDescription item1 = data.connection;

	    nbits += PivotPointDescription.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connection", "PivotPointDescription");
	    throw ee;
	}
	// Encode field 'units'
	try {
	    TrailerUnitDescriptionList item1 = data.units;

	    nbits += TrailerUnitDescriptionList.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("units", "TrailerUnitDescriptionList");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static TrailerData decodeValue(PerCoder coder, InputBitStream source, TrailerData data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

    /** Decode root fields **/
	// Decode field 'sspRights'
	try {
	    long temp1;

	    if (data.sspRights == null)
		data.sspRights = new SSPindex();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sspRights.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sspRights", "SSPindex");
	    throw de;
	}
	// Decode field 'connection'
	try {
	    if (data.connection == null)
		data.connection = new PivotPointDescription();
	    data.connection.decodeValue(coder, source, data.connection);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("connection", "PivotPointDescription");
	    throw de;
	}
	// Decode field 'units'
	try {
	    if (data.units == null)
		data.units = new TrailerUnitDescriptionList();
	    data.units.decodeValue(coder, source, data.units);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("units", "TrailerUnitDescriptionList");
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
	sink.beginObject();
	// Encode field 'sspRights'
	try {
	    SSPindex item1 = this.sspRights;

	    {
		sink.encodeKey("sspRights");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspRights", "SSPindex");
	    throw ee;
	}
	// Encode field 'connection'
	try {
	    PivotPointDescription item1 = this.connection;

	    {
		sink.writeSeparator();
		sink.encodeKey("connection");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("connection", "PivotPointDescription");
	    throw ee;
	}
	// Encode field 'units'
	try {
	    TrailerUnitDescriptionList item1 = this.units;

	    {
		sink.writeSeparator();
		sink.encodeKey("units");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("units", "TrailerUnitDescriptionList");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public TrailerData decodeValue(JsonCoder coder, JsonReader source)
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
		    case __sspRights:
		    // Decode field 'sspRights'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sspRights == null)
			    this.sspRights = new SSPindex();
			this.sspRights.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sspRights", "SSPindex");
			throw de;
		    }
		    break;
		    case __connection:
		    // Decode field 'connection'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.connection == null)
			    this.connection = new PivotPointDescription();
			this.connection.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("connection", "PivotPointDescription");
			throw de;
		    }
		    break;
		    case __units:
		    // Decode field 'units'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.units == null)
			    this.units = new TrailerUnitDescriptionList();
			this.units.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("units", "TrailerUnitDescriptionList");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sspRights'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'connection'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'units'");
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
	    writer.print("sspRights ");
	    writer.print(this.sspRights.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("connection ");
	    this.connection.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("units ");
	    this.units.printValue(printer, writer);
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
	return equalTo((TrailerData)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((TrailerData)that);
    }
    
    public boolean equalTo(TrailerData that) {
	if (!this.sspRights.equalTo(that.sspRights))
	    return false;
	if (!this.connection.equalTo(that.connection))
	    return false;
	if (!this.units.equalTo(that.units))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public TrailerData clone() {
	TrailerData copy = (TrailerData)super.clone();
	copy.sspRights = sspRights.clone();
	copy.connection = connection.clone();
	copy.units = units.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.sspRights != null ? this.sspRights.hashCode() : 0);
	hash = 41 * hash + (this.connection != null ? this.connection.hashCode() : 0);
	hash = 41 * hash + (this.units != null ? this.units.hashCode() : 0);
	return hash;
    }
} // End class definition for TrailerData
