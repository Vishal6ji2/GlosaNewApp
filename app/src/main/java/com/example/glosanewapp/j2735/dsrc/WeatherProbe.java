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
 * Define the WeatherProbe ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class WeatherProbe extends Sequence {
    public AmbientAirTemperature airTemp;
    public AmbientAirPressure airPressure;
    public WiperSet rainRates;
    
    /**
     * The default constructor.
     */
    public WeatherProbe()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public WeatherProbe(AmbientAirTemperature airTemp, 
		    AmbientAirPressure airPressure, WiperSet rainRates)
    {
	setAirTemp(airTemp);
	setAirPressure(airPressure);
	setRainRates(rainRates);
    }
    
    
    // Methods for field "airTemp"
    public AmbientAirTemperature getAirTemp()
    {
	return this.airTemp;
    }
    
    public void setAirTemp(AmbientAirTemperature airTemp)
    {
	this.airTemp = airTemp;
    }
    
    public boolean hasAirTemp()
    {
	return (airTemp != null);
    }
    
    public void deleteAirTemp()
    {
	airTemp = null;
    }
    
    
    // Methods for field "airPressure"
    public AmbientAirPressure getAirPressure()
    {
	return this.airPressure;
    }
    
    public void setAirPressure(AmbientAirPressure airPressure)
    {
	this.airPressure = airPressure;
    }
    
    public boolean hasAirPressure()
    {
	return (airPressure != null);
    }
    
    public void deleteAirPressure()
    {
	airPressure = null;
    }
    
    
    // Methods for field "rainRates"
    public WiperSet getRainRates()
    {
	return this.rainRates;
    }
    
    public void setRainRates(WiperSet rainRates)
    {
	this.rainRates = rainRates;
    }
    
    public boolean hasRainRates()
    {
	return (rainRates != null);
    }
    
    public void deleteRainRates()
    {
	rainRates = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__airTemp("airTemp"),
	__airPressure("airPressure"),
	__rainRates("rainRates"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, WeatherProbe data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.airTemp != null);
	sink.writeBit(data.airPressure != null);
	sink.writeBit(data.rainRates != null);
	nbits += 4;
	if (data.airTemp != null) {
	    // Encode field 'airTemp'
	    try {
		AmbientAirTemperature item1 = data.airTemp;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 191)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 191, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airTemp", "AmbientAirTemperature");
		throw ee;
	    }
	}
	if (data.airPressure != null) {
	    // Encode field 'airPressure'
	    try {
		AmbientAirPressure item1 = data.airPressure;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airPressure", "AmbientAirPressure");
		throw ee;
	    }
	}
	if (data.rainRates != null) {
	    // Encode field 'rainRates'
	    try {
		WiperSet item1 = data.rainRates;

		nbits += WiperSet.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rainRates", "WiperSet");
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
    public static WeatherProbe decodeValue(PerCoder coder, InputBitStream source, WeatherProbe data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_airTemp0 = source.readBit();
	boolean has_airPressure0 = source.readBit();
	boolean has_rainRates0 = source.readBit();
    /** Decode root fields **/
	if (has_airTemp0) {
	    // Decode field 'airTemp'
	    try {
		long temp1;

		if (data.airTemp == null)
		    data.airTemp = new AmbientAirTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 191);
		if (temp1 > 191)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.airTemp.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("airTemp", "AmbientAirTemperature");
		throw de;
	    }
	} else {
	    data.airTemp = null;
	}
	if (has_airPressure0) {
	    // Decode field 'airPressure'
	    try {
		long temp1;

		if (data.airPressure == null)
		    data.airPressure = new AmbientAirPressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.airPressure.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("airPressure", "AmbientAirPressure");
		throw de;
	    }
	} else {
	    data.airPressure = null;
	}
	if (has_rainRates0) {
	    // Decode field 'rainRates'
	    try {
		if (data.rainRates == null)
		    data.rainRates = new WiperSet();
		data.rainRates.decodeValue(coder, source, data.rainRates);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rainRates", "WiperSet");
		throw de;
	    }
	} else {
	    data.rainRates = null;
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
	// Encode field 'airTemp'
	try {
	    AmbientAirTemperature item1 = this.airTemp;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("airTemp");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "airTemp");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("airTemp", "AmbientAirTemperature");
	    throw ee;
	}
	// Encode field 'airPressure'
	try {
	    AmbientAirPressure item1 = this.airPressure;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("airPressure");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "airPressure");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("airPressure", "AmbientAirPressure");
	    throw ee;
	}
	// Encode field 'rainRates'
	try {
	    WiperSet item1 = this.rainRates;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("rainRates");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "rainRates");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rainRates", "WiperSet");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public WeatherProbe decodeValue(JsonCoder coder, JsonReader source)
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
		    case __airTemp:
		    // Decode field 'airTemp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.airTemp == null)
				this.airTemp = new AmbientAirTemperature();
			    this.airTemp.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("airTemp", "AmbientAirTemperature");
			throw de;
		    }
		    break;
		    case __airPressure:
		    // Decode field 'airPressure'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.airPressure == null)
				this.airPressure = new AmbientAirPressure();
			    this.airPressure.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("airPressure", "AmbientAirPressure");
			throw de;
		    }
		    break;
		    case __rainRates:
		    // Decode field 'rainRates'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rainRates == null)
				this.rainRates = new WiperSet();
			    this.rainRates.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rainRates", "WiperSet");
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
	    this.airTemp = null;
	if (!present0[1])
	    this.airPressure = null;
	if (!present0[2])
	    this.rainRates = null;
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
	if (this.airTemp != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("airTemp ");
		writer.print(this.airTemp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.airPressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("airPressure ");
		writer.print(this.airPressure.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.rainRates != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("rainRates ");
		this.rainRates.printValue(printer, writer);
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
	return equalTo((WeatherProbe)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((WeatherProbe)that);
    }
    
    public boolean equalTo(WeatherProbe that) {
	if (this.airTemp != null) {
	    if (that.airTemp == null || !this.airTemp.equalTo(that.airTemp))
		return false;
	} else if (that.airTemp != null)
	    return false;
	if (this.airPressure != null) {
	    if (that.airPressure == null || !this.airPressure.equalTo(that.airPressure))
		return false;
	} else if (that.airPressure != null)
	    return false;
	if (this.rainRates != null) {
	    if (that.rainRates == null || !this.rainRates.equalTo(that.rainRates))
		return false;
	} else if (that.rainRates != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public WeatherProbe clone() {
	WeatherProbe copy = (WeatherProbe)super.clone();
	if (airTemp != null) {
	    copy.airTemp = airTemp.clone();
	}
	if (airPressure != null) {
	    copy.airPressure = airPressure.clone();
	}
	if (rainRates != null) {
	    copy.rainRates = rainRates.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.airTemp != null ? this.airTemp.hashCode() : 0);
	hash = 41 * hash + (this.airPressure != null ? this.airPressure.hashCode() : 0);
	hash = 41 * hash + (this.rainRates != null ? this.rainRates.hashCode() : 0);
	return hash;
    }
} // End class definition for WeatherProbe
