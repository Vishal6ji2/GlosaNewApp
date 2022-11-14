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

import com.example.glosanewapp.j2735.region.REGION;
import com.oss.asn1.*;
import com.oss.asn1printer.DataPrinter;
import com.oss.coders.DecoderException;
import com.oss.coders.EncoderException;
import com.oss.coders.InputBitStream;
import com.oss.coders.OutputBitStream;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.per.PerCoder;
import com.oss.metadata.*;
import com.oss.util.ExceptionDescriptor;

import java.io.IOException;

/**
 * Define the SupplementalVehicleExtensions ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class SupplementalVehicleExtensions extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public BasicVehicleClass classification;
    public VehicleClassification classDetails;
    public VehicleData vehicleData;
    public WeatherReport weatherReport;
    public WeatherProbe weatherProbe;
    public ObstacleDetection obstacle;
    public DisabledVehicle status;
    public SpeedProfile speedProfile;
    public RTCMPackage theRTCM;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public SupplementalVehicleExtensions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SupplementalVehicleExtensions(BasicVehicleClass classification, 
		    VehicleClassification classDetails, 
		    VehicleData vehicleData, WeatherReport weatherReport, 
		    WeatherProbe weatherProbe, ObstacleDetection obstacle, 
		    DisabledVehicle status, SpeedProfile speedProfile, 
		    RTCMPackage theRTCM, Regional regional)
    {
	setClassification(classification);
	setClassDetails(classDetails);
	setVehicleData(vehicleData);
	setWeatherReport(weatherReport);
	setWeatherProbe(weatherProbe);
	setObstacle(obstacle);
	setStatus(status);
	setSpeedProfile(speedProfile);
	setTheRTCM(theRTCM);
	setRegional(regional);
    }
    
    
    // Methods for field "classification"
    public BasicVehicleClass getClassification()
    {
	return this.classification;
    }
    
    public void setClassification(BasicVehicleClass classification)
    {
	this.classification = classification;
    }
    
    public boolean hasClassification()
    {
	return (classification != null);
    }
    
    public void deleteClassification()
    {
	classification = null;
    }
    
    
    // Methods for field "classDetails"
    public VehicleClassification getClassDetails()
    {
	return this.classDetails;
    }
    
    public void setClassDetails(VehicleClassification classDetails)
    {
	this.classDetails = classDetails;
    }
    
    public boolean hasClassDetails()
    {
	return (classDetails != null);
    }
    
    public void deleteClassDetails()
    {
	classDetails = null;
    }
    
    
    // Methods for field "vehicleData"
    public VehicleData getVehicleData()
    {
	return this.vehicleData;
    }
    
    public void setVehicleData(VehicleData vehicleData)
    {
	this.vehicleData = vehicleData;
    }
    
    public boolean hasVehicleData()
    {
	return (vehicleData != null);
    }
    
    public void deleteVehicleData()
    {
	vehicleData = null;
    }
    
    
    // Methods for field "weatherReport"
    public WeatherReport getWeatherReport()
    {
	return this.weatherReport;
    }
    
    public void setWeatherReport(WeatherReport weatherReport)
    {
	this.weatherReport = weatherReport;
    }
    
    public boolean hasWeatherReport()
    {
	return (weatherReport != null);
    }
    
    public void deleteWeatherReport()
    {
	weatherReport = null;
    }
    
    
    // Methods for field "weatherProbe"
    public WeatherProbe getWeatherProbe()
    {
	return this.weatherProbe;
    }
    
    public void setWeatherProbe(WeatherProbe weatherProbe)
    {
	this.weatherProbe = weatherProbe;
    }
    
    public boolean hasWeatherProbe()
    {
	return (weatherProbe != null);
    }
    
    public void deleteWeatherProbe()
    {
	weatherProbe = null;
    }
    
    
    // Methods for field "obstacle"
    public ObstacleDetection getObstacle()
    {
	return this.obstacle;
    }
    
    public void setObstacle(ObstacleDetection obstacle)
    {
	this.obstacle = obstacle;
    }
    
    public boolean hasObstacle()
    {
	return (obstacle != null);
    }
    
    public void deleteObstacle()
    {
	obstacle = null;
    }
    
    
    // Methods for field "status"
    public DisabledVehicle getStatus()
    {
	return this.status;
    }
    
    public void setStatus(DisabledVehicle status)
    {
	this.status = status;
    }
    
    public boolean hasStatus()
    {
	return (status != null);
    }
    
    public void deleteStatus()
    {
	status = null;
    }
    
    
    // Methods for field "speedProfile"
    public SpeedProfile getSpeedProfile()
    {
	return this.speedProfile;
    }
    
    public void setSpeedProfile(SpeedProfile speedProfile)
    {
	this.speedProfile = speedProfile;
    }
    
    public boolean hasSpeedProfile()
    {
	return (speedProfile != null);
    }
    
    public void deleteSpeedProfile()
    {
	speedProfile = null;
    }
    
    
    // Methods for field "theRTCM"
    public RTCMPackage getTheRTCM()
    {
	return this.theRTCM;
    }
    
    public void setTheRTCM(RTCMPackage theRTCM)
    {
	this.theRTCM = theRTCM;
    }
    
    public boolean hasTheRTCM()
    {
	return (theRTCM != null);
    }
    
    public void deleteTheRTCM()
    {
	theRTCM = null;
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return this.regional;
    }
    
    public void setRegional(Regional regional)
    {
	this.regional = regional;
    }
    
    public boolean hasRegional()
    {
	return (regional != null);
    }
    
    public void deleteRegional()
    {
	regional = null;
    }
    
    
    
    /**
     * Define the Regional ASN.1 type included in the DSRC ASN.1 module.
     * @see SequenceOf
     */
    public static class Regional extends SequenceOf<Regional.Sequence_> {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regional(Sequence_[] elements)
	{
	    super(elements);
	}
	
	
	/**
	 * Define the _seq46 ASN.1 type included in the DSRC ASN.1 module.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    public RegionId regionId;
	    public OpenType regExtValue;
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(RegionId regionId, OpenType regExtValue)
	    {
		setRegionId(regionId);
		setRegExtValue(regExtValue);
	    }
	    
	    
	    // Methods for field "regionId"
	    public RegionId getRegionId()
	    {
		return this.regionId;
	    }
	    
	    public void setRegionId(RegionId regionId)
	    {
		this.regionId = regionId;
	    }
	    
	    
	    // Methods for field "regExtValue"
	    public OpenType getRegExtValue()
	    {
		return this.regExtValue;
	    }
	    
	    public void setRegExtValue(OpenType regExtValue)
	    {
		this.regExtValue = regExtValue;
	    }
	    
	    
	    /**
	     * Hashtable for tags (reserved for internal use).
	     * This class is reserved for internal use and must not be used in the application code.
	     * @exclude
	     */
	    public static enum __Tag
	    {
		__regionId("regionId"),
		__regExtValue("regExtValue"),
		_null_("_null_");
		private String tag;
		private static java.util.HashMap<String, __Tag> map =
		    new java.util.HashMap<String, __Tag>(3);
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
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Sequence_ data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int nbits = 0;

		// Encode field 'regionId'
		try {
		    RegionId item1 = data.regionId;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 255)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regionId", "RegionId");
		    throw ee;
		}
		// Encode field 'regExtValue'
		try {
		    OpenType item1 = data.regExtValue;

		    nbits += com.oss.coders.per.PerOpenType.encode(coder, item1, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regExtValue", "OpenType");
		    throw ee;
		}

		return nbits;
	    }

	    /**
	     * Implements PER value decoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     * @exclude
	     */
	    public static Sequence_ decodeValue(PerCoder coder, InputBitStream source, Sequence_ data)
		    throws IOException, DecoderException, DecodeFailedException
	    {
	    /** Decode root fields **/
		// Decode field 'regionId'
		try {
		    long temp1;

		    if (data.regionId == null)
			data.regionId = new RegionId();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		    if (temp1 > 255)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    data.regionId.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("regionId", "RegionId");
		    throw de;
		}
		// Decode field 'regExtValue'
		try {
		    boolean processed1 = false;

		    if (coder.getOption(com.oss.coders.Coder.cAUTOMATIC_ENCDEC)) {
			ASN1Type otype_pdu1 = null;
			REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_SupplementalVehicleExtensions;
			REG_EXT_ID_AND_TYPE infoobj1 = null;

			RegionId _ref_1_1 = data.regionId;
			infoobj1 = oset1.getObject(_ref_1_1);
			if (infoobj1 != null) { 
			    otype_pdu1 = infoobj1.Type;
			}
			if (otype_pdu1 != null) 
			{
			    AbstractData otype1 = otype_pdu1.newInstance();

			    if (otype1 instanceof PERDecodable) {
				try {
				    data.regExtValue = new OpenType(com.oss.coders.per.PerOpenType.decode(coder, source, (PERDecodable)otype1));
				    processed1 = true;
				} catch (Exception e) {
				    DecoderException de = DecoderException.wrapException(e);
				    de.appendFieldContext(null, otype1.getTypeName());
				    throw de;
				}
			    }
			}
		    }
		    if (!processed1) {
			data.regExtValue = new OpenType(com.oss.coders.per.PerOctets.decode(coder, source, -1));
		    }
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("regExtValue", "OpenType");
		    throw de;
		}
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
		// Encode field 'regionId'
		try {
		    RegionId item1 = this.regionId;

		    {
			sink.encodeKey("regionId");
			coder.encodeInteger(item1.longValue(), sink);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regionId", "RegionId");
		    throw ee;
		}
		// Encode field 'regExtValue'
		try {
		    OpenType item1 = this.regExtValue;

		    {
			sink.writeSeparator();
			sink.encodeKey("regExtValue");
			com.oss.coders.json.JsonOpenType.encode(coder, item1, sink);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regExtValue", "OpenType");
		    throw ee;
		}
		sink.endObject();

	    }

	    /**
	     * Implements JSON value decoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     * @exclude
	     */
	    public Sequence_ decodeValue(JsonCoder coder, JsonReader source)
		    throws IOException, DecoderException
	    {
		boolean[] present0 = new boolean[3];

		coder.decodeObject(source);
		if (coder.hasMoreProperties(source, true))
		    do {
			String tag0 = coder.nextProperty(source);
			__Tag t_tag0 = __Tag.getTagSub(tag0);
			if (t_tag0 == null) 
			    t_tag0 = __Tag._null_;
			switch (t_tag0) {
			    case __regionId:
			    // Decode field 'regionId'
			    try {
				if (present0[0])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.regionId == null)
				    this.regionId = new RegionId();
				this.regionId.setValue(coder.decodeInteger(source));
				present0[0] = true;
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendFieldContext("regionId", "RegionId");
				throw de;
			    }
			    break;
			    case __regExtValue:
			    // Decode field 'regExtValue'
			    try {
				boolean processed1 = false;

				if (present0[1])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.regExtValue == null)
				    this.regExtValue = new OpenType();
				if (coder.getOption(com.oss.coders.Coder.cAUTOMATIC_ENCDEC)) {
				    ASN1Type otype_pdu1 = null;
				    REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_SupplementalVehicleExtensions;
				    REG_EXT_ID_AND_TYPE infoobj1 = null;

				    RegionId _ref_1_1 = this.regionId;
				    infoobj1 = oset1.getObject(_ref_1_1);
				    if (infoobj1 != null) { 
					otype_pdu1 = infoobj1.Type;
				    }
				    if (otype_pdu1 != null) 
				    {
					AbstractData otype1 = otype_pdu1.newInstance();

					if (otype1 instanceof JSONDecodable) {
					    try {
						this.regExtValue.setDecodedValue(com.oss.coders.json.JsonOpenType.decode(coder, source, (JSONDecodable)otype1));
						this.regExtValue.setEncodedValue(null);
						processed1 = true;
					    } catch (Exception e) {
						DecoderException de = DecoderException.wrapException(e);
						de.appendFieldContext(null, otype1.getTypeName());
						throw de;
					    }
					}
				    }
				}
				if (!processed1) {
				    this.regExtValue.setEncodedValue(coder.captureRawValue(source));
				    this.regExtValue.setDecodedValue(null);
				}
				present0[1] = true;
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendFieldContext("regExtValue", "OpenType");
				throw de;
			    }
			    break;
			    default:
				throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
			}
		    } while (coder.hasMoreProperties(source, false));
		if (!present0[0])
		    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'regionId'");
		if (!present0[1])
		    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'regExtValue'");
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
		    writer.print("regionId ");
		    writer.print(this.regionId.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("regExtValue ");
		    printer.print(this.regExtValue, writer);
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
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence that)
	    {
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence_ that) {
		if (!this.regionId.equalTo(that.regionId))
		    return false;
		if (!this.regExtValue.equalTo(that.regExtValue))
		    return false;
		return true;
	    }

	    /**
	     * Clone 'this' object.
	     */
	    public Sequence_ clone() {
		Sequence_ copy = (Sequence_)super.clone();
		copy.regionId = regionId.clone();
		copy.regExtValue = regExtValue.clone();
		return copy;
	    }

	    /**
	     * Returns a hash code for 'this' object.
	     */
	    public int hashCode() {
		int hash = 3;
		hash = 41 * hash + (this.regionId != null ? this.regionId.hashCode() : 0);
		hash = 41 * hash + (this.regExtValue != null ? this.regExtValue.hashCode() : 0);
		return hash;
	    }
	} // End class definition for Sequence_

	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Regional data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 4)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 4, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    Sequence_ item1 = data.elements.get(idx0);

		    nbits += Sequence_.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE", idx0);
		    throw ee;
		}
		--total_len0; --fragmentLength0; ++idx0;
		if (fragmentLength0 == 0) {
		    if (moreFragments0) {
			nbits += coder.encodeLengthDeterminant(total_len0, sink);
			moreFragments0 = coder.moreFragments();
			fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		    }
		}
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static Regional decodeValue(PerCoder coder, InputBitStream source, Regional data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 4);
	    if (fragmentLength0 > 4)
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<Sequence_>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    Sequence_ item1 = new Sequence_();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SEQUENCE", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 4)
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		    }
		}
	    }
	    if (total_len0 < 1)
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
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
	    int total_len0 = this.elements.size();
	    int idx0 = 0;

	    sink.beginArray();
	    if (total_len0 > 0) {
		while (true) {
		    try {
			Sequence_ item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
			
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE", idx0);
			throw ee;
		    }
		    idx0++;
		    if (idx0 == total_len0) break;
		    sink.writeSeparator();
		}
	    }
	    sink.endArray();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public Regional decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    int total_len0 = 0;
	    int idx0 = 0;

	    if (this.elements != null)
		this.elements.clear();
	    else
		this.elements = new java.util.ArrayList<Sequence_>(total_len0);
	    coder.decodeArray(source);
	    if (coder.hasMoreElements(source, true))
		do {
		    try {
			Sequence_ item1 = new Sequence_();

			this.elements.add(item1);
			item1.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext(null, "SEQUENCE", idx0);
			throw de;
		    }
		    ++idx0;
		} while (coder.hasMoreElements(source, false));
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
	    java.util.ArrayList<Sequence_> temp0 = this.elements;
	    int len0 = temp0 != null ? temp0.size() : 0;
	    int idx0 = 0;

	    try {
		writer.print('{');
		printer.indent();
		for (idx0 = 0; idx0 < len0; idx0++){
		    if (idx0 > 0)
			writer.print(',');
		    printer.newLine(writer);
		    temp0.get(idx0).printValue(printer, writer);
		}
		printer.undent();
		if (len0 > 0)
		    printer.newLine(writer);
		writer.print('}');
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}

	/**
	 * Compare 'this' object to another object to see if their contents are the same.
	 */
	public boolean abstractEqualTo(AbstractData that)
	{
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(Regional that) {
	    int size = this.getSize();
	    if (size != that.getSize())
		return false;
	    for (int i = 0; i < size; i++) {
		if (!this.get(i).equalTo(that.get(i)))
		    return false;
	    }
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Regional clone() {
	    Regional copy = (Regional)super.clone();
	    copy.elements = new java.util.ArrayList<Sequence_>(elements.size());
	    for (Sequence_ element : elements) {
		copy.elements.add(element.clone());
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 7;
	    hash = 79 * hash + (this.elements != null ? this.elements.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Regional

    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__classification("classification"),
	__classDetails("classDetails"),
	__vehicleData("vehicleData"),
	__weatherReport("weatherReport"),
	__weatherProbe("weatherProbe"),
	__obstacle("obstacle"),
	__status("status"),
	__speedProfile("speedProfile"),
	__theRTCM("theRTCM"),
	__regional("regional"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, SupplementalVehicleExtensions data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.classification != null);
	sink.writeBit(data.classDetails != null);
	sink.writeBit(data.vehicleData != null);
	sink.writeBit(data.weatherReport != null);
	sink.writeBit(data.weatherProbe != null);
	sink.writeBit(data.obstacle != null);
	sink.writeBit(data.status != null);
	sink.writeBit(data.speedProfile != null);
	sink.writeBit(data.theRTCM != null);
	sink.writeBit(data.regional != null);
	nbits += 11;
	if (data.classification != null) {
	    // Encode field 'classification'
	    try {
		BasicVehicleClass item1 = data.classification;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("classification", "BasicVehicleClass");
		throw ee;
	    }
	}
	if (data.classDetails != null) {
	    // Encode field 'classDetails'
	    try {
		VehicleClassification item1 = data.classDetails;

		nbits += VehicleClassification.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("classDetails", "VehicleClassification");
		throw ee;
	    }
	}
	if (data.vehicleData != null) {
	    // Encode field 'vehicleData'
	    try {
		VehicleData item1 = data.vehicleData;

		nbits += VehicleData.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleData", "VehicleData");
		throw ee;
	    }
	}
	if (data.weatherReport != null) {
	    // Encode field 'weatherReport'
	    try {
		WeatherReport item1 = data.weatherReport;

		nbits += WeatherReport.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weatherReport", "WeatherReport");
		throw ee;
	    }
	}
	if (data.weatherProbe != null) {
	    // Encode field 'weatherProbe'
	    try {
		WeatherProbe item1 = data.weatherProbe;

		nbits += WeatherProbe.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("weatherProbe", "WeatherProbe");
		throw ee;
	    }
	}
	if (data.obstacle != null) {
	    // Encode field 'obstacle'
	    try {
		ObstacleDetection item1 = data.obstacle;

		nbits += ObstacleDetection.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("obstacle", "ObstacleDetection");
		throw ee;
	    }
	}
	if (data.status != null) {
	    // Encode field 'status'
	    try {
		DisabledVehicle item1 = data.status;

		nbits += DisabledVehicle.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("status", "DisabledVehicle");
		throw ee;
	    }
	}
	if (data.speedProfile != null) {
	    // Encode field 'speedProfile'
	    try {
		SpeedProfile item1 = data.speedProfile;

		nbits += SpeedProfile.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedProfile", "SpeedProfile");
		throw ee;
	    }
	}
	if (data.theRTCM != null) {
	    // Encode field 'theRTCM'
	    try {
		RTCMPackage item1 = data.theRTCM;

		nbits += RTCMPackage.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("theRTCM", "RTCMPackage");
		throw ee;
	    }
	}
	if (data.regional != null) {
	    // Encode field 'regional'
	    try {
		Regional item1 = data.regional;

		nbits += Regional.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("regional", "SEQUENCE OF");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Encode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int encode(PerCoder coder, OutputBitStream sink)
	    throws EncoderException
    {
	try {
	    return this.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "SupplementalVehicleExtensions");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static SupplementalVehicleExtensions decodeValue(PerCoder coder, InputBitStream source, SupplementalVehicleExtensions data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_classification0 = source.readBit();
	boolean has_classDetails0 = source.readBit();
	boolean has_vehicleData0 = source.readBit();
	boolean has_weatherReport0 = source.readBit();
	boolean has_weatherProbe0 = source.readBit();
	boolean has_obstacle0 = source.readBit();
	boolean has_status0 = source.readBit();
	boolean has_speedProfile0 = source.readBit();
	boolean has_theRTCM0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	if (has_classification0) {
	    // Decode field 'classification'
	    try {
		long temp1;

		if (data.classification == null)
		    data.classification = new BasicVehicleClass();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.classification.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("classification", "BasicVehicleClass");
		throw de;
	    }
	} else {
	    data.classification = null;
	}
	if (has_classDetails0) {
	    // Decode field 'classDetails'
	    try {
		if (data.classDetails == null)
		    data.classDetails = new VehicleClassification();
		data.classDetails.decodeValue(coder, source, data.classDetails);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("classDetails", "VehicleClassification");
		throw de;
	    }
	} else {
	    data.classDetails = null;
	}
	if (has_vehicleData0) {
	    // Decode field 'vehicleData'
	    try {
		if (data.vehicleData == null)
		    data.vehicleData = new VehicleData();
		data.vehicleData.decodeValue(coder, source, data.vehicleData);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleData", "VehicleData");
		throw de;
	    }
	} else {
	    data.vehicleData = null;
	}
	if (has_weatherReport0) {
	    // Decode field 'weatherReport'
	    try {
		if (data.weatherReport == null)
		    data.weatherReport = new WeatherReport();
		data.weatherReport.decodeValue(coder, source, data.weatherReport);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("weatherReport", "WeatherReport");
		throw de;
	    }
	} else {
	    data.weatherReport = null;
	}
	if (has_weatherProbe0) {
	    // Decode field 'weatherProbe'
	    try {
		if (data.weatherProbe == null)
		    data.weatherProbe = new WeatherProbe();
		data.weatherProbe.decodeValue(coder, source, data.weatherProbe);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("weatherProbe", "WeatherProbe");
		throw de;
	    }
	} else {
	    data.weatherProbe = null;
	}
	if (has_obstacle0) {
	    // Decode field 'obstacle'
	    try {
		if (data.obstacle == null)
		    data.obstacle = new ObstacleDetection();
		data.obstacle.decodeValue(coder, source, data.obstacle);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("obstacle", "ObstacleDetection");
		throw de;
	    }
	} else {
	    data.obstacle = null;
	}
	if (has_status0) {
	    // Decode field 'status'
	    try {
		if (data.status == null)
		    data.status = new DisabledVehicle();
		data.status.decodeValue(coder, source, data.status);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("status", "DisabledVehicle");
		throw de;
	    }
	} else {
	    data.status = null;
	}
	if (has_speedProfile0) {
	    // Decode field 'speedProfile'
	    try {
		if (data.speedProfile == null)
		    data.speedProfile = new SpeedProfile();
		data.speedProfile.decodeValue(coder, source, data.speedProfile);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speedProfile", "SpeedProfile");
		throw de;
	    }
	} else {
	    data.speedProfile = null;
	}
	if (has_theRTCM0) {
	    // Decode field 'theRTCM'
	    try {
		if (data.theRTCM == null)
		    data.theRTCM = new RTCMPackage();
		data.theRTCM.decodeValue(coder, source, data.theRTCM);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("theRTCM", "RTCMPackage");
		throw de;
	    }
	} else {
	    data.theRTCM = null;
	}
	if (has_regional0) {
	    // Decode field 'regional'
	    try {
		if (data.regional == null)
		    data.regional = new Regional();
		data.regional.decodeValue(coder, source, data.regional);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("regional", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.regional = null;
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "SupplementalVehicleExtensions");
	    throw de;
	}
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
	// Encode field 'classification'
	try {
	    BasicVehicleClass item1 = this.classification;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("classification");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "classification");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("classification", "BasicVehicleClass");
	    throw ee;
	}
	// Encode field 'classDetails'
	try {
	    VehicleClassification item1 = this.classDetails;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("classDetails");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "classDetails");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("classDetails", "VehicleClassification");
	    throw ee;
	}
	// Encode field 'vehicleData'
	try {
	    VehicleData item1 = this.vehicleData;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("vehicleData");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "vehicleData");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleData", "VehicleData");
	    throw ee;
	}
	// Encode field 'weatherReport'
	try {
	    WeatherReport item1 = this.weatherReport;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("weatherReport");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "weatherReport");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("weatherReport", "WeatherReport");
	    throw ee;
	}
	// Encode field 'weatherProbe'
	try {
	    WeatherProbe item1 = this.weatherProbe;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("weatherProbe");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "weatherProbe");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("weatherProbe", "WeatherProbe");
	    throw ee;
	}
	// Encode field 'obstacle'
	try {
	    ObstacleDetection item1 = this.obstacle;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("obstacle");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "obstacle");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("obstacle", "ObstacleDetection");
	    throw ee;
	}
	// Encode field 'status'
	try {
	    DisabledVehicle item1 = this.status;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("status");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "status");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "DisabledVehicle");
	    throw ee;
	}
	// Encode field 'speedProfile'
	try {
	    SpeedProfile item1 = this.speedProfile;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("speedProfile");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "speedProfile");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speedProfile", "SpeedProfile");
	    throw ee;
	}
	// Encode field 'theRTCM'
	try {
	    RTCMPackage item1 = this.theRTCM;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("theRTCM");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "theRTCM");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("theRTCM", "RTCMPackage");
	    throw ee;
	}
	// Encode field 'regional'
	try {
	    Regional item1 = this.regional;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("regional");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "regional");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("regional", "SEQUENCE OF");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Encode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encode(JsonCoder coder, JsonWriter sink)
	    throws EncoderException
    {
	try {
	    this.encodeValue(coder, sink);

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "SupplementalVehicleExtensions");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public SupplementalVehicleExtensions decodeValue(JsonCoder coder, JsonReader source)
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
		    case __classification:
		    // Decode field 'classification'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.classification == null)
				this.classification = new BasicVehicleClass();
			    this.classification.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("classification", "BasicVehicleClass");
			throw de;
		    }
		    break;
		    case __classDetails:
		    // Decode field 'classDetails'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.classDetails == null)
				this.classDetails = new VehicleClassification();
			    this.classDetails.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("classDetails", "VehicleClassification");
			throw de;
		    }
		    break;
		    case __vehicleData:
		    // Decode field 'vehicleData'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.vehicleData == null)
				this.vehicleData = new VehicleData();
			    this.vehicleData.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleData", "VehicleData");
			throw de;
		    }
		    break;
		    case __weatherReport:
		    // Decode field 'weatherReport'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.weatherReport == null)
				this.weatherReport = new WeatherReport();
			    this.weatherReport.decodeValue(coder, source);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("weatherReport", "WeatherReport");
			throw de;
		    }
		    break;
		    case __weatherProbe:
		    // Decode field 'weatherProbe'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.weatherProbe == null)
				this.weatherProbe = new WeatherProbe();
			    this.weatherProbe.decodeValue(coder, source);
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("weatherProbe", "WeatherProbe");
			throw de;
		    }
		    break;
		    case __obstacle:
		    // Decode field 'obstacle'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.obstacle == null)
				this.obstacle = new ObstacleDetection();
			    this.obstacle.decodeValue(coder, source);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("obstacle", "ObstacleDetection");
			throw de;
		    }
		    break;
		    case __status:
		    // Decode field 'status'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.status == null)
				this.status = new DisabledVehicle();
			    this.status.decodeValue(coder, source);
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("status", "DisabledVehicle");
			throw de;
		    }
		    break;
		    case __speedProfile:
		    // Decode field 'speedProfile'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.speedProfile == null)
				this.speedProfile = new SpeedProfile();
			    this.speedProfile.decodeValue(coder, source);
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speedProfile", "SpeedProfile");
			throw de;
		    }
		    break;
		    case __theRTCM:
		    // Decode field 'theRTCM'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.theRTCM == null)
				this.theRTCM = new RTCMPackage();
			    this.theRTCM.decodeValue(coder, source);
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("theRTCM", "RTCMPackage");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("regional", "SEQUENCE OF");
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
	    this.classification = null;
	if (!present0[1])
	    this.classDetails = null;
	if (!present0[2])
	    this.vehicleData = null;
	if (!present0[3])
	    this.weatherReport = null;
	if (!present0[4])
	    this.weatherProbe = null;
	if (!present0[5])
	    this.obstacle = null;
	if (!present0[6])
	    this.status = null;
	if (!present0[7])
	    this.speedProfile = null;
	if (!present0[8])
	    this.theRTCM = null;
	if (!present0[9])
	    this.regional = null;
	return this;
    }

    /**
     * Decode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(JsonCoder coder, JsonReader source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "SupplementalVehicleExtensions");
	    throw de;
	}
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
	if (this.classification != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("classification ");
		writer.print(this.classification.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.classDetails != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("classDetails ");
		this.classDetails.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleData != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehicleData ");
		this.vehicleData.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.weatherReport != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("weatherReport ");
		this.weatherReport.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.weatherProbe != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("weatherProbe ");
		this.weatherProbe.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.obstacle != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("obstacle ");
		this.obstacle.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.status != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("status ");
		this.status.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speedProfile != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("speedProfile ");
		this.speedProfile.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.theRTCM != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("theRTCM ");
		this.theRTCM.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.regional != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("regional ");
		this.regional.printValue(printer, writer);
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
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "SupplementalVehicleExtensions";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((SupplementalVehicleExtensions)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((SupplementalVehicleExtensions)that);
    }
    
    public boolean equalTo(SupplementalVehicleExtensions that) {
	if (this.classification != null) {
	    if (that.classification == null || !this.classification.equalTo(that.classification))
		return false;
	} else if (that.classification != null)
	    return false;
	if (this.classDetails != null) {
	    if (that.classDetails == null || !this.classDetails.equalTo(that.classDetails))
		return false;
	} else if (that.classDetails != null)
	    return false;
	if (this.vehicleData != null) {
	    if (that.vehicleData == null || !this.vehicleData.equalTo(that.vehicleData))
		return false;
	} else if (that.vehicleData != null)
	    return false;
	if (this.weatherReport != null) {
	    if (that.weatherReport == null || !this.weatherReport.equalTo(that.weatherReport))
		return false;
	} else if (that.weatherReport != null)
	    return false;
	if (this.weatherProbe != null) {
	    if (that.weatherProbe == null || !this.weatherProbe.equalTo(that.weatherProbe))
		return false;
	} else if (that.weatherProbe != null)
	    return false;
	if (this.obstacle != null) {
	    if (that.obstacle == null || !this.obstacle.equalTo(that.obstacle))
		return false;
	} else if (that.obstacle != null)
	    return false;
	if (this.status != null) {
	    if (that.status == null || !this.status.equalTo(that.status))
		return false;
	} else if (that.status != null)
	    return false;
	if (this.speedProfile != null) {
	    if (that.speedProfile == null || !this.speedProfile.equalTo(that.speedProfile))
		return false;
	} else if (that.speedProfile != null)
	    return false;
	if (this.theRTCM != null) {
	    if (that.theRTCM == null || !this.theRTCM.equalTo(that.theRTCM))
		return false;
	} else if (that.theRTCM != null)
	    return false;
	if (this.regional != null) {
	    if (that.regional == null || !this.regional.equalTo(that.regional))
		return false;
	} else if (that.regional != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public SupplementalVehicleExtensions clone() {
	SupplementalVehicleExtensions copy = (SupplementalVehicleExtensions)super.clone();
	if (classification != null) {
	    copy.classification = classification.clone();
	}
	if (classDetails != null) {
	    copy.classDetails = classDetails.clone();
	}
	if (vehicleData != null) {
	    copy.vehicleData = vehicleData.clone();
	}
	if (weatherReport != null) {
	    copy.weatherReport = weatherReport.clone();
	}
	if (weatherProbe != null) {
	    copy.weatherProbe = weatherProbe.clone();
	}
	if (obstacle != null) {
	    copy.obstacle = obstacle.clone();
	}
	if (status != null) {
	    copy.status = status.clone();
	}
	if (speedProfile != null) {
	    copy.speedProfile = speedProfile.clone();
	}
	if (theRTCM != null) {
	    copy.theRTCM = theRTCM.clone();
	}
	if (regional != null) {
	    copy.regional = regional.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.classification != null ? this.classification.hashCode() : 0);
	hash = 41 * hash + (this.classDetails != null ? this.classDetails.hashCode() : 0);
	hash = 41 * hash + (this.vehicleData != null ? this.vehicleData.hashCode() : 0);
	hash = 41 * hash + (this.weatherReport != null ? this.weatherReport.hashCode() : 0);
	hash = 41 * hash + (this.weatherProbe != null ? this.weatherProbe.hashCode() : 0);
	hash = 41 * hash + (this.obstacle != null ? this.obstacle.hashCode() : 0);
	hash = 41 * hash + (this.status != null ? this.status.hashCode() : 0);
	hash = 41 * hash + (this.speedProfile != null ? this.speedProfile.hashCode() : 0);
	hash = 41 * hash + (this.theRTCM != null ? this.theRTCM.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new SupplementalVehicleExtensions();
	}
    };
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ASN1Type get_ASN1Type()
    {
	return _type;
    }
    
} // End class definition for SupplementalVehicleExtensions
