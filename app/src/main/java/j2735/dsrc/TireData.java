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
 * Define the TireData ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class TireData extends Sequence {
    public TireLocation location;
    public TirePressure pressure;
    public TireTemp temp;
    public WheelSensorStatus wheelSensorStatus;
    public WheelEndElectFault wheelEndElectFault;
    public TireLeakageRate leakageRate;
    public TirePressureThresholdDetection detection;
    
    /**
     * The default constructor.
     */
    public TireData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TireData(TireLocation location, TirePressure pressure, 
		    TireTemp temp, WheelSensorStatus wheelSensorStatus, 
		    WheelEndElectFault wheelEndElectFault, 
		    TireLeakageRate leakageRate, 
		    TirePressureThresholdDetection detection)
    {
	setLocation(location);
	setPressure(pressure);
	setTemp(temp);
	setWheelSensorStatus(wheelSensorStatus);
	setWheelEndElectFault(wheelEndElectFault);
	setLeakageRate(leakageRate);
	setDetection(detection);
    }
    
    
    // Methods for field "location"
    public TireLocation getLocation()
    {
	return this.location;
    }
    
    public void setLocation(TireLocation location)
    {
	this.location = location;
    }
    
    public boolean hasLocation()
    {
	return (location != null);
    }
    
    public void deleteLocation()
    {
	location = null;
    }
    
    
    // Methods for field "pressure"
    public TirePressure getPressure()
    {
	return this.pressure;
    }
    
    public void setPressure(TirePressure pressure)
    {
	this.pressure = pressure;
    }
    
    public boolean hasPressure()
    {
	return (pressure != null);
    }
    
    public void deletePressure()
    {
	pressure = null;
    }
    
    
    // Methods for field "temp"
    public TireTemp getTemp()
    {
	return this.temp;
    }
    
    public void setTemp(TireTemp temp)
    {
	this.temp = temp;
    }
    
    public boolean hasTemp()
    {
	return (temp != null);
    }
    
    public void deleteTemp()
    {
	temp = null;
    }
    
    
    // Methods for field "wheelSensorStatus"
    public WheelSensorStatus getWheelSensorStatus()
    {
	return this.wheelSensorStatus;
    }
    
    public void setWheelSensorStatus(WheelSensorStatus wheelSensorStatus)
    {
	this.wheelSensorStatus = wheelSensorStatus;
    }
    
    public boolean hasWheelSensorStatus()
    {
	return (wheelSensorStatus != null);
    }
    
    public void deleteWheelSensorStatus()
    {
	wheelSensorStatus = null;
    }
    
    
    // Methods for field "wheelEndElectFault"
    public WheelEndElectFault getWheelEndElectFault()
    {
	return this.wheelEndElectFault;
    }
    
    public void setWheelEndElectFault(WheelEndElectFault wheelEndElectFault)
    {
	this.wheelEndElectFault = wheelEndElectFault;
    }
    
    public boolean hasWheelEndElectFault()
    {
	return (wheelEndElectFault != null);
    }
    
    public void deleteWheelEndElectFault()
    {
	wheelEndElectFault = null;
    }
    
    
    // Methods for field "leakageRate"
    public TireLeakageRate getLeakageRate()
    {
	return this.leakageRate;
    }
    
    public void setLeakageRate(TireLeakageRate leakageRate)
    {
	this.leakageRate = leakageRate;
    }
    
    public boolean hasLeakageRate()
    {
	return (leakageRate != null);
    }
    
    public void deleteLeakageRate()
    {
	leakageRate = null;
    }
    
    
    // Methods for field "detection"
    public TirePressureThresholdDetection getDetection()
    {
	return this.detection;
    }
    
    public void setDetection(TirePressureThresholdDetection detection)
    {
	this.detection = detection;
    }
    
    public boolean hasDetection()
    {
	return (detection != null);
    }
    
    public void deleteDetection()
    {
	detection = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__location("location"),
	__pressure("pressure"),
	__temp("temp"),
	__wheelSensorStatus("wheelSensorStatus"),
	__wheelEndElectFault("wheelEndElectFault"),
	__leakageRate("leakageRate"),
	__detection("detection"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(8);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, TireData data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.location != null);
	sink.writeBit(data.pressure != null);
	sink.writeBit(data.temp != null);
	sink.writeBit(data.wheelSensorStatus != null);
	sink.writeBit(data.wheelEndElectFault != null);
	sink.writeBit(data.leakageRate != null);
	sink.writeBit(data.detection != null);
	nbits += 8;
	if (data.location != null) {
	    // Encode field 'location'
	    try {
		TireLocation item1 = data.location;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("location", "TireLocation");
		throw ee;
	    }
	}
	if (data.pressure != null) {
	    // Encode field 'pressure'
	    try {
		TirePressure item1 = data.pressure;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 250)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 250, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pressure", "TirePressure");
		throw ee;
	    }
	}
	if (data.temp != null) {
	    // Encode field 'temp'
	    try {
		TireTemp item1 = data.temp;
		long temp1 = item1.longValue();

		if (temp1 < -8736 || temp1 > 55519)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -8736, 55519, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("temp", "TireTemp");
		throw ee;
	    }
	}
	if (data.wheelSensorStatus != null) {
	    // Encode field 'wheelSensorStatus'
	    try {
		WheelSensorStatus item1 = data.wheelSensorStatus;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
		throw ee;
	    }
	}
	if (data.wheelEndElectFault != null) {
	    // Encode field 'wheelEndElectFault'
	    try {
		WheelEndElectFault item1 = data.wheelEndElectFault;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
		throw ee;
	    }
	}
	if (data.leakageRate != null) {
	    // Encode field 'leakageRate'
	    try {
		TireLeakageRate item1 = data.leakageRate;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 64255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 64255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("leakageRate", "TireLeakageRate");
		throw ee;
	    }
	}
	if (data.detection != null) {
	    // Encode field 'detection'
	    try {
		TirePressureThresholdDetection item1 = data.detection;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("detection", "TirePressureThresholdDetection");
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
    public static TireData decodeValue(PerCoder coder, InputBitStream source, TireData data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_location0 = source.readBit();
	boolean has_pressure0 = source.readBit();
	boolean has_temp0 = source.readBit();
	boolean has_wheelSensorStatus0 = source.readBit();
	boolean has_wheelEndElectFault0 = source.readBit();
	boolean has_leakageRate0 = source.readBit();
	boolean has_detection0 = source.readBit();
    /** Decode root fields **/
	if (has_location0) {
	    // Decode field 'location'
	    try {
		long temp1;

		if (data.location == null)
		    data.location = new TireLocation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.location.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("location", "TireLocation");
		throw de;
	    }
	} else {
	    data.location = null;
	}
	if (has_pressure0) {
	    // Decode field 'pressure'
	    try {
		long temp1;

		if (data.pressure == null)
		    data.pressure = new TirePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 250);
		if (temp1 > 250)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.pressure.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pressure", "TirePressure");
		throw de;
	    }
	} else {
	    data.pressure = null;
	}
	if (has_temp0) {
	    // Decode field 'temp'
	    try {
		long temp1;

		if (data.temp == null)
		    data.temp = new TireTemp();
		temp1 = coder.decodeConstrainedWholeNumber(source, -8736, 55519);
		if (temp1 > 55519)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.temp.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("temp", "TireTemp");
		throw de;
	    }
	} else {
	    data.temp = null;
	}
	if (has_wheelSensorStatus0) {
	    // Decode field 'wheelSensorStatus'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.wheelSensorStatus = WheelSensorStatus.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
		throw de;
	    }
	} else {
	    data.wheelSensorStatus = null;
	}
	if (has_wheelEndElectFault0) {
	    // Decode field 'wheelEndElectFault'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.wheelEndElectFault = WheelEndElectFault.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
		throw de;
	    }
	} else {
	    data.wheelEndElectFault = null;
	}
	if (has_leakageRate0) {
	    // Decode field 'leakageRate'
	    try {
		long temp1;

		if (data.leakageRate == null)
		    data.leakageRate = new TireLeakageRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 64255);
		if (temp1 > 64255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.leakageRate.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("leakageRate", "TireLeakageRate");
		throw de;
	    }
	} else {
	    data.leakageRate = null;
	}
	if (has_detection0) {
	    // Decode field 'detection'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.detection = TirePressureThresholdDetection.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("detection", "TirePressureThresholdDetection");
		throw de;
	    }
	} else {
	    data.detection = null;
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
	// Encode field 'location'
	try {
	    TireLocation item1 = this.location;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("location");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "location");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("location", "TireLocation");
	    throw ee;
	}
	// Encode field 'pressure'
	try {
	    TirePressure item1 = this.pressure;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("pressure");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "pressure");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pressure", "TirePressure");
	    throw ee;
	}
	// Encode field 'temp'
	try {
	    TireTemp item1 = this.temp;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("temp");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "temp");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("temp", "TireTemp");
	    throw ee;
	}
	// Encode field 'wheelSensorStatus'
	try {
	    WheelSensorStatus item1 = this.wheelSensorStatus;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("wheelSensorStatus");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "wheelSensorStatus");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
	    throw ee;
	}
	// Encode field 'wheelEndElectFault'
	try {
	    WheelEndElectFault item1 = this.wheelEndElectFault;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("wheelEndElectFault");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "wheelEndElectFault");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
	    throw ee;
	}
	// Encode field 'leakageRate'
	try {
	    TireLeakageRate item1 = this.leakageRate;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("leakageRate");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "leakageRate");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("leakageRate", "TireLeakageRate");
	    throw ee;
	}
	// Encode field 'detection'
	try {
	    TirePressureThresholdDetection item1 = this.detection;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("detection");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "detection");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("detection", "TirePressureThresholdDetection");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public TireData decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __location:
		    // Decode field 'location'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.location == null)
				this.location = new TireLocation();
			    this.location.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("location", "TireLocation");
			throw de;
		    }
		    break;
		    case __pressure:
		    // Decode field 'pressure'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pressure == null)
				this.pressure = new TirePressure();
			    this.pressure.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pressure", "TirePressure");
			throw de;
		    }
		    break;
		    case __temp:
		    // Decode field 'temp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.temp == null)
				this.temp = new TireTemp();
			    this.temp.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("temp", "TireTemp");
			throw de;
		    }
		    break;
		    case __wheelSensorStatus:
		    // Decode field 'wheelSensorStatus'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    WheelSensorStatus temp1;

			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(WheelSensorStatus.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = WheelSensorStatus.cNamedNumbers[idx1];
			    this.wheelSensorStatus = temp1;
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("wheelSensorStatus", "WheelSensorStatus");
			throw de;
		    }
		    break;
		    case __wheelEndElectFault:
		    // Decode field 'wheelEndElectFault'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    WheelEndElectFault temp1;

			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(WheelEndElectFault.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = WheelEndElectFault.cNamedNumbers[idx1];
			    this.wheelEndElectFault = temp1;
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("wheelEndElectFault", "WheelEndElectFault");
			throw de;
		    }
		    break;
		    case __leakageRate:
		    // Decode field 'leakageRate'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.leakageRate == null)
				this.leakageRate = new TireLeakageRate();
			    this.leakageRate.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("leakageRate", "TireLeakageRate");
			throw de;
		    }
		    break;
		    case __detection:
		    // Decode field 'detection'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    TirePressureThresholdDetection temp1;

			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(TirePressureThresholdDetection.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = TirePressureThresholdDetection.cNamedNumbers[idx1];
			    this.detection = temp1;
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("detection", "TirePressureThresholdDetection");
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
	    this.location = null;
	if (!present0[1])
	    this.pressure = null;
	if (!present0[2])
	    this.temp = null;
	if (!present0[3])
	    this.wheelSensorStatus = null;
	if (!present0[4])
	    this.wheelEndElectFault = null;
	if (!present0[5])
	    this.leakageRate = null;
	if (!present0[6])
	    this.detection = null;
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
	if (this.location != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("location ");
		writer.print(this.location.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("pressure ");
		writer.print(this.pressure.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.temp != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("temp ");
		writer.print(this.temp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.wheelSensorStatus != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("wheelSensorStatus ");
		printer.print(this.wheelSensorStatus, writer, this.wheelSensorStatus.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.wheelEndElectFault != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("wheelEndElectFault ");
		printer.print(this.wheelEndElectFault, writer, this.wheelEndElectFault.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.leakageRate != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("leakageRate ");
		writer.print(this.leakageRate.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.detection != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("detection ");
		printer.print(this.detection, writer, this.detection.cConstantNameList);
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
	return equalTo((TireData)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((TireData)that);
    }
    
    public boolean equalTo(TireData that) {
	if (this.location != null) {
	    if (that.location == null || !this.location.equalTo(that.location))
		return false;
	} else if (that.location != null)
	    return false;
	if (this.pressure != null) {
	    if (that.pressure == null || !this.pressure.equalTo(that.pressure))
		return false;
	} else if (that.pressure != null)
	    return false;
	if (this.temp != null) {
	    if (that.temp == null || !this.temp.equalTo(that.temp))
		return false;
	} else if (that.temp != null)
	    return false;
	if (this.wheelSensorStatus != null) {
	    if (that.wheelSensorStatus == null || !this.wheelSensorStatus.equalTo(that.wheelSensorStatus))
		return false;
	} else if (that.wheelSensorStatus != null)
	    return false;
	if (this.wheelEndElectFault != null) {
	    if (that.wheelEndElectFault == null || !this.wheelEndElectFault.equalTo(that.wheelEndElectFault))
		return false;
	} else if (that.wheelEndElectFault != null)
	    return false;
	if (this.leakageRate != null) {
	    if (that.leakageRate == null || !this.leakageRate.equalTo(that.leakageRate))
		return false;
	} else if (that.leakageRate != null)
	    return false;
	if (this.detection != null) {
	    if (that.detection == null || !this.detection.equalTo(that.detection))
		return false;
	} else if (that.detection != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public TireData clone() {
	TireData copy = (TireData)super.clone();
	if (location != null) {
	    copy.location = location.clone();
	}
	if (pressure != null) {
	    copy.pressure = pressure.clone();
	}
	if (temp != null) {
	    copy.temp = temp.clone();
	}
	if (wheelSensorStatus != null) {
	    copy.wheelSensorStatus = wheelSensorStatus.clone();
	}
	if (wheelEndElectFault != null) {
	    copy.wheelEndElectFault = wheelEndElectFault.clone();
	}
	if (leakageRate != null) {
	    copy.leakageRate = leakageRate.clone();
	}
	if (detection != null) {
	    copy.detection = detection.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.location != null ? this.location.hashCode() : 0);
	hash = 41 * hash + (this.pressure != null ? this.pressure.hashCode() : 0);
	hash = 41 * hash + (this.temp != null ? this.temp.hashCode() : 0);
	hash = 41 * hash + (this.wheelSensorStatus != null ? this.wheelSensorStatus.hashCode() : 0);
	hash = 41 * hash + (this.wheelEndElectFault != null ? this.wheelEndElectFault.hashCode() : 0);
	hash = 41 * hash + (this.leakageRate != null ? this.leakageRate.hashCode() : 0);
	hash = 41 * hash + (this.detection != null ? this.detection.hashCode() : 0);
	return hash;
    }
} // End class definition for TireData
