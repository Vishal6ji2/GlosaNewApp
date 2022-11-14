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
 * Define the J1939data ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class J1939data extends Sequence {
    public TireDataList tires;
    public AxleWeightList axles;
    public TrailerWeight trailerWeight;
    public CargoWeight cargoWeight;
    public SteeringAxleTemperature steeringAxleTemperature;
    public DriveAxleLocation driveAxleLocation;
    public DriveAxleLiftAirPressure driveAxleLiftAirPressure;
    public DriveAxleTemperature driveAxleTemperature;
    public DriveAxleLubePressure driveAxleLubePressure;
    public SteeringAxleLubePressure steeringAxleLubePressure;
    
    /**
     * The default constructor.
     */
    public J1939data()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public J1939data(TireDataList tires, AxleWeightList axles, 
		    TrailerWeight trailerWeight, CargoWeight cargoWeight, 
		    SteeringAxleTemperature steeringAxleTemperature, 
		    DriveAxleLocation driveAxleLocation, 
		    DriveAxleLiftAirPressure driveAxleLiftAirPressure, 
		    DriveAxleTemperature driveAxleTemperature, 
		    DriveAxleLubePressure driveAxleLubePressure, 
		    SteeringAxleLubePressure steeringAxleLubePressure)
    {
	setTires(tires);
	setAxles(axles);
	setTrailerWeight(trailerWeight);
	setCargoWeight(cargoWeight);
	setSteeringAxleTemperature(steeringAxleTemperature);
	setDriveAxleLocation(driveAxleLocation);
	setDriveAxleLiftAirPressure(driveAxleLiftAirPressure);
	setDriveAxleTemperature(driveAxleTemperature);
	setDriveAxleLubePressure(driveAxleLubePressure);
	setSteeringAxleLubePressure(steeringAxleLubePressure);
    }
    
    
    // Methods for field "tires"
    public TireDataList getTires()
    {
	return this.tires;
    }
    
    public void setTires(TireDataList tires)
    {
	this.tires = tires;
    }
    
    public boolean hasTires()
    {
	return (tires != null);
    }
    
    public void deleteTires()
    {
	tires = null;
    }
    
    
    // Methods for field "axles"
    public AxleWeightList getAxles()
    {
	return this.axles;
    }
    
    public void setAxles(AxleWeightList axles)
    {
	this.axles = axles;
    }
    
    public boolean hasAxles()
    {
	return (axles != null);
    }
    
    public void deleteAxles()
    {
	axles = null;
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
    
    
    // Methods for field "cargoWeight"
    public CargoWeight getCargoWeight()
    {
	return this.cargoWeight;
    }
    
    public void setCargoWeight(CargoWeight cargoWeight)
    {
	this.cargoWeight = cargoWeight;
    }
    
    public boolean hasCargoWeight()
    {
	return (cargoWeight != null);
    }
    
    public void deleteCargoWeight()
    {
	cargoWeight = null;
    }
    
    
    // Methods for field "steeringAxleTemperature"
    public SteeringAxleTemperature getSteeringAxleTemperature()
    {
	return this.steeringAxleTemperature;
    }
    
    public void setSteeringAxleTemperature(SteeringAxleTemperature steeringAxleTemperature)
    {
	this.steeringAxleTemperature = steeringAxleTemperature;
    }
    
    public boolean hasSteeringAxleTemperature()
    {
	return (steeringAxleTemperature != null);
    }
    
    public void deleteSteeringAxleTemperature()
    {
	steeringAxleTemperature = null;
    }
    
    
    // Methods for field "driveAxleLocation"
    public DriveAxleLocation getDriveAxleLocation()
    {
	return this.driveAxleLocation;
    }
    
    public void setDriveAxleLocation(DriveAxleLocation driveAxleLocation)
    {
	this.driveAxleLocation = driveAxleLocation;
    }
    
    public boolean hasDriveAxleLocation()
    {
	return (driveAxleLocation != null);
    }
    
    public void deleteDriveAxleLocation()
    {
	driveAxleLocation = null;
    }
    
    
    // Methods for field "driveAxleLiftAirPressure"
    public DriveAxleLiftAirPressure getDriveAxleLiftAirPressure()
    {
	return this.driveAxleLiftAirPressure;
    }
    
    public void setDriveAxleLiftAirPressure(DriveAxleLiftAirPressure driveAxleLiftAirPressure)
    {
	this.driveAxleLiftAirPressure = driveAxleLiftAirPressure;
    }
    
    public boolean hasDriveAxleLiftAirPressure()
    {
	return (driveAxleLiftAirPressure != null);
    }
    
    public void deleteDriveAxleLiftAirPressure()
    {
	driveAxleLiftAirPressure = null;
    }
    
    
    // Methods for field "driveAxleTemperature"
    public DriveAxleTemperature getDriveAxleTemperature()
    {
	return this.driveAxleTemperature;
    }
    
    public void setDriveAxleTemperature(DriveAxleTemperature driveAxleTemperature)
    {
	this.driveAxleTemperature = driveAxleTemperature;
    }
    
    public boolean hasDriveAxleTemperature()
    {
	return (driveAxleTemperature != null);
    }
    
    public void deleteDriveAxleTemperature()
    {
	driveAxleTemperature = null;
    }
    
    
    // Methods for field "driveAxleLubePressure"
    public DriveAxleLubePressure getDriveAxleLubePressure()
    {
	return this.driveAxleLubePressure;
    }
    
    public void setDriveAxleLubePressure(DriveAxleLubePressure driveAxleLubePressure)
    {
	this.driveAxleLubePressure = driveAxleLubePressure;
    }
    
    public boolean hasDriveAxleLubePressure()
    {
	return (driveAxleLubePressure != null);
    }
    
    public void deleteDriveAxleLubePressure()
    {
	driveAxleLubePressure = null;
    }
    
    
    // Methods for field "steeringAxleLubePressure"
    public SteeringAxleLubePressure getSteeringAxleLubePressure()
    {
	return this.steeringAxleLubePressure;
    }
    
    public void setSteeringAxleLubePressure(SteeringAxleLubePressure steeringAxleLubePressure)
    {
	this.steeringAxleLubePressure = steeringAxleLubePressure;
    }
    
    public boolean hasSteeringAxleLubePressure()
    {
	return (steeringAxleLubePressure != null);
    }
    
    public void deleteSteeringAxleLubePressure()
    {
	steeringAxleLubePressure = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__tires("tires"),
	__axles("axles"),
	__trailerWeight("trailerWeight"),
	__cargoWeight("cargoWeight"),
	__steeringAxleTemperature("steeringAxleTemperature"),
	__driveAxleLocation("driveAxleLocation"),
	__driveAxleLiftAirPressure("driveAxleLiftAirPressure"),
	__driveAxleTemperature("driveAxleTemperature"),
	__driveAxleLubePressure("driveAxleLubePressure"),
	__steeringAxleLubePressure("steeringAxleLubePressure"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(11);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, J1939data data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.tires != null);
	sink.writeBit(data.axles != null);
	sink.writeBit(data.trailerWeight != null);
	sink.writeBit(data.cargoWeight != null);
	sink.writeBit(data.steeringAxleTemperature != null);
	sink.writeBit(data.driveAxleLocation != null);
	sink.writeBit(data.driveAxleLiftAirPressure != null);
	sink.writeBit(data.driveAxleTemperature != null);
	sink.writeBit(data.driveAxleLubePressure != null);
	sink.writeBit(data.steeringAxleLubePressure != null);
	nbits += 11;
	if (data.tires != null) {
	    // Encode field 'tires'
	    try {
		TireDataList item1 = data.tires;

		nbits += TireDataList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("tires", "TireDataList");
		throw ee;
	    }
	}
	if (data.axles != null) {
	    // Encode field 'axles'
	    try {
		AxleWeightList item1 = data.axles;

		nbits += AxleWeightList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("axles", "AxleWeightList");
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
	if (data.cargoWeight != null) {
	    // Encode field 'cargoWeight'
	    try {
		CargoWeight item1 = data.cargoWeight;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 64255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 64255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("cargoWeight", "CargoWeight");
		throw ee;
	    }
	}
	if (data.steeringAxleTemperature != null) {
	    // Encode field 'steeringAxleTemperature'
	    try {
		SteeringAxleTemperature item1 = data.steeringAxleTemperature;
		long temp1 = item1.longValue();

		if (temp1 < -40 || temp1 > 210)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -40, 210, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
		throw ee;
	    }
	}
	if (data.driveAxleLocation != null) {
	    // Encode field 'driveAxleLocation'
	    try {
		DriveAxleLocation item1 = data.driveAxleLocation;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
		throw ee;
	    }
	}
	if (data.driveAxleLiftAirPressure != null) {
	    // Encode field 'driveAxleLiftAirPressure'
	    try {
		DriveAxleLiftAirPressure item1 = data.driveAxleLiftAirPressure;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
		throw ee;
	    }
	}
	if (data.driveAxleTemperature != null) {
	    // Encode field 'driveAxleTemperature'
	    try {
		DriveAxleTemperature item1 = data.driveAxleTemperature;
		long temp1 = item1.longValue();

		if (temp1 < -40 || temp1 > 210)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -40, 210, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
		throw ee;
	    }
	}
	if (data.driveAxleLubePressure != null) {
	    // Encode field 'driveAxleLubePressure'
	    try {
		DriveAxleLubePressure item1 = data.driveAxleLubePressure;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 250)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 250, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
		throw ee;
	    }
	}
	if (data.steeringAxleLubePressure != null) {
	    // Encode field 'steeringAxleLubePressure'
	    try {
		SteeringAxleLubePressure item1 = data.steeringAxleLubePressure;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 250)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 250, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
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
    public static J1939data decodeValue(PerCoder coder, InputBitStream source, J1939data data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_tires0 = source.readBit();
	boolean has_axles0 = source.readBit();
	boolean has_trailerWeight0 = source.readBit();
	boolean has_cargoWeight0 = source.readBit();
	boolean has_steeringAxleTemperature0 = source.readBit();
	boolean has_driveAxleLocation0 = source.readBit();
	boolean has_driveAxleLiftAirPressure0 = source.readBit();
	boolean has_driveAxleTemperature0 = source.readBit();
	boolean has_driveAxleLubePressure0 = source.readBit();
	boolean has_steeringAxleLubePressure0 = source.readBit();
    /** Decode root fields **/
	if (has_tires0) {
	    // Decode field 'tires'
	    try {
		if (data.tires == null)
		    data.tires = new TireDataList();
		data.tires.decodeValue(coder, source, data.tires);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("tires", "TireDataList");
		throw de;
	    }
	} else {
	    data.tires = null;
	}
	if (has_axles0) {
	    // Decode field 'axles'
	    try {
		if (data.axles == null)
		    data.axles = new AxleWeightList();
		data.axles.decodeValue(coder, source, data.axles);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("axles", "AxleWeightList");
		throw de;
	    }
	} else {
	    data.axles = null;
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
	if (has_cargoWeight0) {
	    // Decode field 'cargoWeight'
	    try {
		long temp1;

		if (data.cargoWeight == null)
		    data.cargoWeight = new CargoWeight();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 64255);
		if (temp1 > 64255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.cargoWeight.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("cargoWeight", "CargoWeight");
		throw de;
	    }
	} else {
	    data.cargoWeight = null;
	}
	if (has_steeringAxleTemperature0) {
	    // Decode field 'steeringAxleTemperature'
	    try {
		long temp1;

		if (data.steeringAxleTemperature == null)
		    data.steeringAxleTemperature = new SteeringAxleTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, -40, 210);
		if (temp1 > 210)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.steeringAxleTemperature.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
		throw de;
	    }
	} else {
	    data.steeringAxleTemperature = null;
	}
	if (has_driveAxleLocation0) {
	    // Decode field 'driveAxleLocation'
	    try {
		long temp1;

		if (data.driveAxleLocation == null)
		    data.driveAxleLocation = new DriveAxleLocation();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.driveAxleLocation.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
		throw de;
	    }
	} else {
	    data.driveAxleLocation = null;
	}
	if (has_driveAxleLiftAirPressure0) {
	    // Decode field 'driveAxleLiftAirPressure'
	    try {
		long temp1;

		if (data.driveAxleLiftAirPressure == null)
		    data.driveAxleLiftAirPressure = new DriveAxleLiftAirPressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.driveAxleLiftAirPressure.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
		throw de;
	    }
	} else {
	    data.driveAxleLiftAirPressure = null;
	}
	if (has_driveAxleTemperature0) {
	    // Decode field 'driveAxleTemperature'
	    try {
		long temp1;

		if (data.driveAxleTemperature == null)
		    data.driveAxleTemperature = new DriveAxleTemperature();
		temp1 = coder.decodeConstrainedWholeNumber(source, -40, 210);
		if (temp1 > 210)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.driveAxleTemperature.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
		throw de;
	    }
	} else {
	    data.driveAxleTemperature = null;
	}
	if (has_driveAxleLubePressure0) {
	    // Decode field 'driveAxleLubePressure'
	    try {
		long temp1;

		if (data.driveAxleLubePressure == null)
		    data.driveAxleLubePressure = new DriveAxleLubePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 250);
		if (temp1 > 250)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.driveAxleLubePressure.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
		throw de;
	    }
	} else {
	    data.driveAxleLubePressure = null;
	}
	if (has_steeringAxleLubePressure0) {
	    // Decode field 'steeringAxleLubePressure'
	    try {
		long temp1;

		if (data.steeringAxleLubePressure == null)
		    data.steeringAxleLubePressure = new SteeringAxleLubePressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 250);
		if (temp1 > 250)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.steeringAxleLubePressure.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
		throw de;
	    }
	} else {
	    data.steeringAxleLubePressure = null;
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
	// Encode field 'tires'
	try {
	    TireDataList item1 = this.tires;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("tires");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "tires");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("tires", "TireDataList");
	    throw ee;
	}
	// Encode field 'axles'
	try {
	    AxleWeightList item1 = this.axles;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("axles");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "axles");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("axles", "AxleWeightList");
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
	// Encode field 'cargoWeight'
	try {
	    CargoWeight item1 = this.cargoWeight;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("cargoWeight");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "cargoWeight");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("cargoWeight", "CargoWeight");
	    throw ee;
	}
	// Encode field 'steeringAxleTemperature'
	try {
	    SteeringAxleTemperature item1 = this.steeringAxleTemperature;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("steeringAxleTemperature");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "steeringAxleTemperature");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
	    throw ee;
	}
	// Encode field 'driveAxleLocation'
	try {
	    DriveAxleLocation item1 = this.driveAxleLocation;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("driveAxleLocation");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "driveAxleLocation");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
	    throw ee;
	}
	// Encode field 'driveAxleLiftAirPressure'
	try {
	    DriveAxleLiftAirPressure item1 = this.driveAxleLiftAirPressure;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("driveAxleLiftAirPressure");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "driveAxleLiftAirPressure");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
	    throw ee;
	}
	// Encode field 'driveAxleTemperature'
	try {
	    DriveAxleTemperature item1 = this.driveAxleTemperature;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("driveAxleTemperature");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "driveAxleTemperature");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
	    throw ee;
	}
	// Encode field 'driveAxleLubePressure'
	try {
	    DriveAxleLubePressure item1 = this.driveAxleLubePressure;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("driveAxleLubePressure");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "driveAxleLubePressure");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
	    throw ee;
	}
	// Encode field 'steeringAxleLubePressure'
	try {
	    SteeringAxleLubePressure item1 = this.steeringAxleLubePressure;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("steeringAxleLubePressure");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "steeringAxleLubePressure");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public J1939data decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[11];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __tires:
		    // Decode field 'tires'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.tires == null)
				this.tires = new TireDataList();
			    this.tires.decodeValue(coder, source);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("tires", "TireDataList");
			throw de;
		    }
		    break;
		    case __axles:
		    // Decode field 'axles'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.axles == null)
				this.axles = new AxleWeightList();
			    this.axles.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("axles", "AxleWeightList");
			throw de;
		    }
		    break;
		    case __trailerWeight:
		    // Decode field 'trailerWeight'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.trailerWeight == null)
				this.trailerWeight = new TrailerWeight();
			    this.trailerWeight.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("trailerWeight", "TrailerWeight");
			throw de;
		    }
		    break;
		    case __cargoWeight:
		    // Decode field 'cargoWeight'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.cargoWeight == null)
				this.cargoWeight = new CargoWeight();
			    this.cargoWeight.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("cargoWeight", "CargoWeight");
			throw de;
		    }
		    break;
		    case __steeringAxleTemperature:
		    // Decode field 'steeringAxleTemperature'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.steeringAxleTemperature == null)
				this.steeringAxleTemperature = new SteeringAxleTemperature();
			    this.steeringAxleTemperature.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("steeringAxleTemperature", "SteeringAxleTemperature");
			throw de;
		    }
		    break;
		    case __driveAxleLocation:
		    // Decode field 'driveAxleLocation'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.driveAxleLocation == null)
				this.driveAxleLocation = new DriveAxleLocation();
			    this.driveAxleLocation.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("driveAxleLocation", "DriveAxleLocation");
			throw de;
		    }
		    break;
		    case __driveAxleLiftAirPressure:
		    // Decode field 'driveAxleLiftAirPressure'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.driveAxleLiftAirPressure == null)
				this.driveAxleLiftAirPressure = new DriveAxleLiftAirPressure();
			    this.driveAxleLiftAirPressure.setValue(coder.decodeInteger(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("driveAxleLiftAirPressure", "DriveAxleLiftAirPressure");
			throw de;
		    }
		    break;
		    case __driveAxleTemperature:
		    // Decode field 'driveAxleTemperature'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.driveAxleTemperature == null)
				this.driveAxleTemperature = new DriveAxleTemperature();
			    this.driveAxleTemperature.setValue(coder.decodeInteger(source));
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("driveAxleTemperature", "DriveAxleTemperature");
			throw de;
		    }
		    break;
		    case __driveAxleLubePressure:
		    // Decode field 'driveAxleLubePressure'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.driveAxleLubePressure == null)
				this.driveAxleLubePressure = new DriveAxleLubePressure();
			    this.driveAxleLubePressure.setValue(coder.decodeInteger(source));
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("driveAxleLubePressure", "DriveAxleLubePressure");
			throw de;
		    }
		    break;
		    case __steeringAxleLubePressure:
		    // Decode field 'steeringAxleLubePressure'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.steeringAxleLubePressure == null)
				this.steeringAxleLubePressure = new SteeringAxleLubePressure();
			    this.steeringAxleLubePressure.setValue(coder.decodeInteger(source));
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("steeringAxleLubePressure", "SteeringAxleLubePressure");
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
	    this.tires = null;
	if (!present0[1])
	    this.axles = null;
	if (!present0[2])
	    this.trailerWeight = null;
	if (!present0[3])
	    this.cargoWeight = null;
	if (!present0[4])
	    this.steeringAxleTemperature = null;
	if (!present0[5])
	    this.driveAxleLocation = null;
	if (!present0[6])
	    this.driveAxleLiftAirPressure = null;
	if (!present0[7])
	    this.driveAxleTemperature = null;
	if (!present0[8])
	    this.driveAxleLubePressure = null;
	if (!present0[9])
	    this.steeringAxleLubePressure = null;
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
	if (this.tires != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("tires ");
		this.tires.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.axles != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("axles ");
		this.axles.printValue(printer, writer);
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
	if (this.cargoWeight != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("cargoWeight ");
		writer.print(this.cargoWeight.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.steeringAxleTemperature != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("steeringAxleTemperature ");
		writer.print(this.steeringAxleTemperature.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.driveAxleLocation != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("driveAxleLocation ");
		writer.print(this.driveAxleLocation.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.driveAxleLiftAirPressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("driveAxleLiftAirPressure ");
		writer.print(this.driveAxleLiftAirPressure.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.driveAxleTemperature != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("driveAxleTemperature ");
		writer.print(this.driveAxleTemperature.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.driveAxleLubePressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("driveAxleLubePressure ");
		writer.print(this.driveAxleLubePressure.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.steeringAxleLubePressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("steeringAxleLubePressure ");
		writer.print(this.steeringAxleLubePressure.longValue());
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
	return equalTo((J1939data)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((J1939data)that);
    }
    
    public boolean equalTo(J1939data that) {
	if (this.tires != null) {
	    if (that.tires == null || !this.tires.equalTo(that.tires))
		return false;
	} else if (that.tires != null)
	    return false;
	if (this.axles != null) {
	    if (that.axles == null || !this.axles.equalTo(that.axles))
		return false;
	} else if (that.axles != null)
	    return false;
	if (this.trailerWeight != null) {
	    if (that.trailerWeight == null || !this.trailerWeight.equalTo(that.trailerWeight))
		return false;
	} else if (that.trailerWeight != null)
	    return false;
	if (this.cargoWeight != null) {
	    if (that.cargoWeight == null || !this.cargoWeight.equalTo(that.cargoWeight))
		return false;
	} else if (that.cargoWeight != null)
	    return false;
	if (this.steeringAxleTemperature != null) {
	    if (that.steeringAxleTemperature == null || !this.steeringAxleTemperature.equalTo(that.steeringAxleTemperature))
		return false;
	} else if (that.steeringAxleTemperature != null)
	    return false;
	if (this.driveAxleLocation != null) {
	    if (that.driveAxleLocation == null || !this.driveAxleLocation.equalTo(that.driveAxleLocation))
		return false;
	} else if (that.driveAxleLocation != null)
	    return false;
	if (this.driveAxleLiftAirPressure != null) {
	    if (that.driveAxleLiftAirPressure == null || !this.driveAxleLiftAirPressure.equalTo(that.driveAxleLiftAirPressure))
		return false;
	} else if (that.driveAxleLiftAirPressure != null)
	    return false;
	if (this.driveAxleTemperature != null) {
	    if (that.driveAxleTemperature == null || !this.driveAxleTemperature.equalTo(that.driveAxleTemperature))
		return false;
	} else if (that.driveAxleTemperature != null)
	    return false;
	if (this.driveAxleLubePressure != null) {
	    if (that.driveAxleLubePressure == null || !this.driveAxleLubePressure.equalTo(that.driveAxleLubePressure))
		return false;
	} else if (that.driveAxleLubePressure != null)
	    return false;
	if (this.steeringAxleLubePressure != null) {
	    if (that.steeringAxleLubePressure == null || !this.steeringAxleLubePressure.equalTo(that.steeringAxleLubePressure))
		return false;
	} else if (that.steeringAxleLubePressure != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public J1939data clone() {
	J1939data copy = (J1939data)super.clone();
	if (tires != null) {
	    copy.tires = tires.clone();
	}
	if (axles != null) {
	    copy.axles = axles.clone();
	}
	if (trailerWeight != null) {
	    copy.trailerWeight = trailerWeight.clone();
	}
	if (cargoWeight != null) {
	    copy.cargoWeight = cargoWeight.clone();
	}
	if (steeringAxleTemperature != null) {
	    copy.steeringAxleTemperature = steeringAxleTemperature.clone();
	}
	if (driveAxleLocation != null) {
	    copy.driveAxleLocation = driveAxleLocation.clone();
	}
	if (driveAxleLiftAirPressure != null) {
	    copy.driveAxleLiftAirPressure = driveAxleLiftAirPressure.clone();
	}
	if (driveAxleTemperature != null) {
	    copy.driveAxleTemperature = driveAxleTemperature.clone();
	}
	if (driveAxleLubePressure != null) {
	    copy.driveAxleLubePressure = driveAxleLubePressure.clone();
	}
	if (steeringAxleLubePressure != null) {
	    copy.steeringAxleLubePressure = steeringAxleLubePressure.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.tires != null ? this.tires.hashCode() : 0);
	hash = 41 * hash + (this.axles != null ? this.axles.hashCode() : 0);
	hash = 41 * hash + (this.trailerWeight != null ? this.trailerWeight.hashCode() : 0);
	hash = 41 * hash + (this.cargoWeight != null ? this.cargoWeight.hashCode() : 0);
	hash = 41 * hash + (this.steeringAxleTemperature != null ? this.steeringAxleTemperature.hashCode() : 0);
	hash = 41 * hash + (this.driveAxleLocation != null ? this.driveAxleLocation.hashCode() : 0);
	hash = 41 * hash + (this.driveAxleLiftAirPressure != null ? this.driveAxleLiftAirPressure.hashCode() : 0);
	hash = 41 * hash + (this.driveAxleTemperature != null ? this.driveAxleTemperature.hashCode() : 0);
	hash = 41 * hash + (this.driveAxleLubePressure != null ? this.driveAxleLubePressure.hashCode() : 0);
	hash = 41 * hash + (this.steeringAxleLubePressure != null ? this.steeringAxleLubePressure.hashCode() : 0);
	return hash;
    }
} // End class definition for J1939data
