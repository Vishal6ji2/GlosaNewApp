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
 * Define the WeatherReport ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class WeatherReport extends Sequence {
    public j2735.ntcip.EssPrecipYesNo isRaining;
    public j2735.ntcip.EssPrecipRate rainRate;
    public j2735.ntcip.EssPrecipSituation precipSituation;
    public j2735.ntcip.EssSolarRadiation solarRadiation;
    public j2735.ntcip.EssMobileFriction friction;
    public CoefficientOfFriction roadFriction;
    
    /**
     * The default constructor.
     */
    public WeatherReport()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public WeatherReport(j2735.ntcip.EssPrecipYesNo isRaining, 
		    j2735.ntcip.EssPrecipRate rainRate, 
		    j2735.ntcip.EssPrecipSituation precipSituation, 
		    j2735.ntcip.EssSolarRadiation solarRadiation, 
		    j2735.ntcip.EssMobileFriction friction, 
		    CoefficientOfFriction roadFriction)
    {
	setIsRaining(isRaining);
	setRainRate(rainRate);
	setPrecipSituation(precipSituation);
	setSolarRadiation(solarRadiation);
	setFriction(friction);
	setRoadFriction(roadFriction);
    }
    
    /**
     * Construct with required components.
     */
    public WeatherReport(j2735.ntcip.EssPrecipYesNo isRaining)
    {
	setIsRaining(isRaining);
    }
    
    
    // Methods for field "isRaining"
    public j2735.ntcip.EssPrecipYesNo getIsRaining()
    {
	return this.isRaining;
    }
    
    public void setIsRaining(j2735.ntcip.EssPrecipYesNo isRaining)
    {
	this.isRaining = isRaining;
    }
    
    
    // Methods for field "rainRate"
    public j2735.ntcip.EssPrecipRate getRainRate()
    {
	return this.rainRate;
    }
    
    public void setRainRate(j2735.ntcip.EssPrecipRate rainRate)
    {
	this.rainRate = rainRate;
    }
    
    public boolean hasRainRate()
    {
	return (rainRate != null);
    }
    
    public void deleteRainRate()
    {
	rainRate = null;
    }
    
    
    // Methods for field "precipSituation"
    public j2735.ntcip.EssPrecipSituation getPrecipSituation()
    {
	return this.precipSituation;
    }
    
    public void setPrecipSituation(j2735.ntcip.EssPrecipSituation precipSituation)
    {
	this.precipSituation = precipSituation;
    }
    
    public boolean hasPrecipSituation()
    {
	return (precipSituation != null);
    }
    
    public void deletePrecipSituation()
    {
	precipSituation = null;
    }
    
    
    // Methods for field "solarRadiation"
    public j2735.ntcip.EssSolarRadiation getSolarRadiation()
    {
	return this.solarRadiation;
    }
    
    public void setSolarRadiation(j2735.ntcip.EssSolarRadiation solarRadiation)
    {
	this.solarRadiation = solarRadiation;
    }
    
    public boolean hasSolarRadiation()
    {
	return (solarRadiation != null);
    }
    
    public void deleteSolarRadiation()
    {
	solarRadiation = null;
    }
    
    
    // Methods for field "friction"
    public j2735.ntcip.EssMobileFriction getFriction()
    {
	return this.friction;
    }
    
    public void setFriction(j2735.ntcip.EssMobileFriction friction)
    {
	this.friction = friction;
    }
    
    public boolean hasFriction()
    {
	return (friction != null);
    }
    
    public void deleteFriction()
    {
	friction = null;
    }
    
    
    // Methods for field "roadFriction"
    public CoefficientOfFriction getRoadFriction()
    {
	return this.roadFriction;
    }
    
    public void setRoadFriction(CoefficientOfFriction roadFriction)
    {
	this.roadFriction = roadFriction;
    }
    
    public boolean hasRoadFriction()
    {
	return (roadFriction != null);
    }
    
    public void deleteRoadFriction()
    {
	roadFriction = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__isRaining("isRaining"),
	__rainRate("rainRate"),
	__precipSituation("precipSituation"),
	__solarRadiation("solarRadiation"),
	__friction("friction"),
	__roadFriction("roadFriction"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(7);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, WeatherReport data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.rainRate != null);
	sink.writeBit(data.precipSituation != null);
	sink.writeBit(data.solarRadiation != null);
	sink.writeBit(data.friction != null);
	sink.writeBit(data.roadFriction != null);
	nbits += 6;
	// Encode field 'isRaining'
	try {
	    j2735.ntcip.EssPrecipYesNo item1 = data.isRaining;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 2, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("isRaining", "EssPrecipYesNo");
	    throw ee;
	}
	if (data.rainRate != null) {
	    // Encode field 'rainRate'
	    try {
		j2735.ntcip.EssPrecipRate item1 = data.rainRate;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rainRate", "EssPrecipRate");
		throw ee;
	    }
	}
	if (data.precipSituation != null) {
	    // Encode field 'precipSituation'
	    try {
		j2735.ntcip.EssPrecipSituation item1 = data.precipSituation;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 14, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("precipSituation", "EssPrecipSituation");
		throw ee;
	    }
	}
	if (data.solarRadiation != null) {
	    // Encode field 'solarRadiation'
	    try {
		j2735.ntcip.EssSolarRadiation item1 = data.solarRadiation;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
		throw ee;
	    }
	}
	if (data.friction != null) {
	    // Encode field 'friction'
	    try {
		j2735.ntcip.EssMobileFriction item1 = data.friction;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 101)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 101, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("friction", "EssMobileFriction");
		throw ee;
	    }
	}
	if (data.roadFriction != null) {
	    // Encode field 'roadFriction'
	    try {
		CoefficientOfFriction item1 = data.roadFriction;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 50)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 50, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("roadFriction", "CoefficientOfFriction");
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
    public static WeatherReport decodeValue(PerCoder coder, InputBitStream source, WeatherReport data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_rainRate0 = source.readBit();
	boolean has_precipSituation0 = source.readBit();
	boolean has_solarRadiation0 = source.readBit();
	boolean has_friction0 = source.readBit();
	boolean has_roadFriction0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'isRaining'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2);
	    if (idx1 < 0 || idx1 > 2)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.isRaining = j2735.ntcip.EssPrecipYesNo.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("isRaining", "EssPrecipYesNo");
	    throw de;
	}
	if (has_rainRate0) {
	    // Decode field 'rainRate'
	    try {
		long temp1;

		if (data.rainRate == null)
		    data.rainRate = new j2735.ntcip.EssPrecipRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.rainRate.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rainRate", "EssPrecipRate");
		throw de;
	    }
	} else {
	    data.rainRate = null;
	}
	if (has_precipSituation0) {
	    // Decode field 'precipSituation'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 14);
		if (idx1 < 0 || idx1 > 14)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.precipSituation = j2735.ntcip.EssPrecipSituation.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("precipSituation", "EssPrecipSituation");
		throw de;
	    }
	} else {
	    data.precipSituation = null;
	}
	if (has_solarRadiation0) {
	    // Decode field 'solarRadiation'
	    try {
		long temp1;

		if (data.solarRadiation == null)
		    data.solarRadiation = new j2735.ntcip.EssSolarRadiation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.solarRadiation.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("solarRadiation", "EssSolarRadiation");
		throw de;
	    }
	} else {
	    data.solarRadiation = null;
	}
	if (has_friction0) {
	    // Decode field 'friction'
	    try {
		long temp1;

		if (data.friction == null)
		    data.friction = new j2735.ntcip.EssMobileFriction();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 101);
		if (temp1 > 101)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.friction.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("friction", "EssMobileFriction");
		throw de;
	    }
	} else {
	    data.friction = null;
	}
	if (has_roadFriction0) {
	    // Decode field 'roadFriction'
	    try {
		long temp1;

		if (data.roadFriction == null)
		    data.roadFriction = new CoefficientOfFriction();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 50);
		if (temp1 > 50)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.roadFriction.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("roadFriction", "CoefficientOfFriction");
		throw de;
	    }
	} else {
	    data.roadFriction = null;
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
	// Encode field 'isRaining'
	try {
	    j2735.ntcip.EssPrecipYesNo item1 = this.isRaining;

	    {
		sink.encodeKey("isRaining");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("isRaining", "EssPrecipYesNo");
	    throw ee;
	}
	// Encode field 'rainRate'
	try {
	    j2735.ntcip.EssPrecipRate item1 = this.rainRate;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("rainRate");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "rainRate");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rainRate", "EssPrecipRate");
	    throw ee;
	}
	// Encode field 'precipSituation'
	try {
	    j2735.ntcip.EssPrecipSituation item1 = this.precipSituation;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("precipSituation");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "precipSituation");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("precipSituation", "EssPrecipSituation");
	    throw ee;
	}
	// Encode field 'solarRadiation'
	try {
	    j2735.ntcip.EssSolarRadiation item1 = this.solarRadiation;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("solarRadiation");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "solarRadiation");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("solarRadiation", "EssSolarRadiation");
	    throw ee;
	}
	// Encode field 'friction'
	try {
	    j2735.ntcip.EssMobileFriction item1 = this.friction;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("friction");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "friction");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("friction", "EssMobileFriction");
	    throw ee;
	}
	// Encode field 'roadFriction'
	try {
	    CoefficientOfFriction item1 = this.roadFriction;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("roadFriction");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "roadFriction");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("roadFriction", "CoefficientOfFriction");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public WeatherReport decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[7];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __isRaining:
		    // Decode field 'isRaining'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			j2735.ntcip.EssPrecipYesNo temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(j2735.ntcip.EssPrecipYesNo.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = j2735.ntcip.EssPrecipYesNo.cNamedNumbers[idx1];
			this.isRaining = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("isRaining", "EssPrecipYesNo");
			throw de;
		    }
		    break;
		    case __rainRate:
		    // Decode field 'rainRate'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rainRate == null)
				this.rainRate = new j2735.ntcip.EssPrecipRate();
			    this.rainRate.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rainRate", "EssPrecipRate");
			throw de;
		    }
		    break;
		    case __precipSituation:
		    // Decode field 'precipSituation'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    j2735.ntcip.EssPrecipSituation temp1;

			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(j2735.ntcip.EssPrecipSituation.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = j2735.ntcip.EssPrecipSituation.cNamedNumbers[idx1];
			    this.precipSituation = temp1;
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("precipSituation", "EssPrecipSituation");
			throw de;
		    }
		    break;
		    case __solarRadiation:
		    // Decode field 'solarRadiation'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.solarRadiation == null)
				this.solarRadiation = new j2735.ntcip.EssSolarRadiation();
			    this.solarRadiation.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("solarRadiation", "EssSolarRadiation");
			throw de;
		    }
		    break;
		    case __friction:
		    // Decode field 'friction'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.friction == null)
				this.friction = new j2735.ntcip.EssMobileFriction();
			    this.friction.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("friction", "EssMobileFriction");
			throw de;
		    }
		    break;
		    case __roadFriction:
		    // Decode field 'roadFriction'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.roadFriction == null)
				this.roadFriction = new CoefficientOfFriction();
			    this.roadFriction.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("roadFriction", "CoefficientOfFriction");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'isRaining'");
	if (!present0[1])
	    this.rainRate = null;
	if (!present0[2])
	    this.precipSituation = null;
	if (!present0[3])
	    this.solarRadiation = null;
	if (!present0[4])
	    this.friction = null;
	if (!present0[5])
	    this.roadFriction = null;
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
	    writer.print("isRaining ");
	    printer.print(this.isRaining, writer, this.isRaining.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.rainRate != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("rainRate ");
		writer.print(this.rainRate.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.precipSituation != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("precipSituation ");
		printer.print(this.precipSituation, writer, this.precipSituation.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.solarRadiation != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("solarRadiation ");
		writer.print(this.solarRadiation.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.friction != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("friction ");
		writer.print(this.friction.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.roadFriction != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("roadFriction ");
		writer.print(this.roadFriction.longValue());
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
	return equalTo((WeatherReport)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((WeatherReport)that);
    }
    
    public boolean equalTo(WeatherReport that) {
	if (!this.isRaining.equalTo(that.isRaining))
	    return false;
	if (this.rainRate != null) {
	    if (that.rainRate == null || !this.rainRate.equalTo(that.rainRate))
		return false;
	} else if (that.rainRate != null)
	    return false;
	if (this.precipSituation != null) {
	    if (that.precipSituation == null || !this.precipSituation.equalTo(that.precipSituation))
		return false;
	} else if (that.precipSituation != null)
	    return false;
	if (this.solarRadiation != null) {
	    if (that.solarRadiation == null || !this.solarRadiation.equalTo(that.solarRadiation))
		return false;
	} else if (that.solarRadiation != null)
	    return false;
	if (this.friction != null) {
	    if (that.friction == null || !this.friction.equalTo(that.friction))
		return false;
	} else if (that.friction != null)
	    return false;
	if (this.roadFriction != null) {
	    if (that.roadFriction == null || !this.roadFriction.equalTo(that.roadFriction))
		return false;
	} else if (that.roadFriction != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public WeatherReport clone() {
	WeatherReport copy = (WeatherReport)super.clone();
	copy.isRaining = isRaining.clone();
	if (rainRate != null) {
	    copy.rainRate = rainRate.clone();
	}
	if (precipSituation != null) {
	    copy.precipSituation = precipSituation.clone();
	}
	if (solarRadiation != null) {
	    copy.solarRadiation = solarRadiation.clone();
	}
	if (friction != null) {
	    copy.friction = friction.clone();
	}
	if (roadFriction != null) {
	    copy.roadFriction = roadFriction.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.isRaining != null ? this.isRaining.hashCode() : 0);
	hash = 41 * hash + (this.rainRate != null ? this.rainRate.hashCode() : 0);
	hash = 41 * hash + (this.precipSituation != null ? this.precipSituation.hashCode() : 0);
	hash = 41 * hash + (this.solarRadiation != null ? this.solarRadiation.hashCode() : 0);
	hash = 41 * hash + (this.friction != null ? this.friction.hashCode() : 0);
	hash = 41 * hash + (this.roadFriction != null ? this.roadFriction.hashCode() : 0);
	return hash;
    }
} // End class definition for WeatherReport
