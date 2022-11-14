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
 * Define the VehicleStatus ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class VehicleStatus extends Sequence {
    public ExteriorLights lights;
    public LightbarInUse lightBar;
    public WiperSet wipers;
    public BrakeSystemStatus brakeStatus;
    public BrakeAppliedPressure brakePressure;
    public CoefficientOfFriction roadFriction;
    public SunSensor sunData;
    public RainSensor rainData;
    public AmbientAirTemperature airTemp;
    public AmbientAirPressure airPres;
    public Steering steering;
    public AccelSets accelSets;
    public Object object;
    public FullPositionVector fullPos;
    public ThrottlePosition throttlePos;
    public SpeedandHeadingandThrottleConfidence speedHeadC;
    public SpeedConfidence speedC;
    public VehicleData vehicleData;
    public VehicleIdent vehicleIdent;
    public J1939data j1939data;
    public WeatherReport weatherReport;
    public GNSSstatus gnssStatus;
    
    /**
     * The default constructor.
     */
    public VehicleStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleStatus(ExteriorLights lights, LightbarInUse lightBar, 
		    WiperSet wipers, BrakeSystemStatus brakeStatus, 
		    BrakeAppliedPressure brakePressure, 
		    CoefficientOfFriction roadFriction, SunSensor sunData, 
		    RainSensor rainData, AmbientAirTemperature airTemp, 
		    AmbientAirPressure airPres, Steering steering, 
		    AccelSets accelSets, Object object, 
		    FullPositionVector fullPos, ThrottlePosition throttlePos, 
		    SpeedandHeadingandThrottleConfidence speedHeadC, 
		    SpeedConfidence speedC, VehicleData vehicleData, 
		    VehicleIdent vehicleIdent, J1939data j1939data, 
		    WeatherReport weatherReport, GNSSstatus gnssStatus)
    {
	setLights(lights);
	setLightBar(lightBar);
	setWipers(wipers);
	setBrakeStatus(brakeStatus);
	setBrakePressure(brakePressure);
	setRoadFriction(roadFriction);
	setSunData(sunData);
	setRainData(rainData);
	setAirTemp(airTemp);
	setAirPres(airPres);
	setSteering(steering);
	setAccelSets(accelSets);
	setObject(object);
	setFullPos(fullPos);
	setThrottlePos(throttlePos);
	setSpeedHeadC(speedHeadC);
	setSpeedC(speedC);
	setVehicleData(vehicleData);
	setVehicleIdent(vehicleIdent);
	setJ1939data(j1939data);
	setWeatherReport(weatherReport);
	setGnssStatus(gnssStatus);
    }
    
    
    // Methods for field "lights"
    public ExteriorLights getLights()
    {
	return this.lights;
    }
    
    public void setLights(ExteriorLights lights)
    {
	this.lights = lights;
    }
    
    public boolean hasLights()
    {
	return (lights != null);
    }
    
    public void deleteLights()
    {
	lights = null;
    }
    
    
    // Methods for field "lightBar"
    public LightbarInUse getLightBar()
    {
	return this.lightBar;
    }
    
    public void setLightBar(LightbarInUse lightBar)
    {
	this.lightBar = lightBar;
    }
    
    public boolean hasLightBar()
    {
	return (lightBar != null);
    }
    
    public void deleteLightBar()
    {
	lightBar = null;
    }
    
    
    // Methods for field "wipers"
    public WiperSet getWipers()
    {
	return this.wipers;
    }
    
    public void setWipers(WiperSet wipers)
    {
	this.wipers = wipers;
    }
    
    public boolean hasWipers()
    {
	return (wipers != null);
    }
    
    public void deleteWipers()
    {
	wipers = null;
    }
    
    
    // Methods for field "brakeStatus"
    public BrakeSystemStatus getBrakeStatus()
    {
	return this.brakeStatus;
    }
    
    public void setBrakeStatus(BrakeSystemStatus brakeStatus)
    {
	this.brakeStatus = brakeStatus;
    }
    
    public boolean hasBrakeStatus()
    {
	return (brakeStatus != null);
    }
    
    public void deleteBrakeStatus()
    {
	brakeStatus = null;
    }
    
    
    // Methods for field "brakePressure"
    public BrakeAppliedPressure getBrakePressure()
    {
	return this.brakePressure;
    }
    
    public void setBrakePressure(BrakeAppliedPressure brakePressure)
    {
	this.brakePressure = brakePressure;
    }
    
    public boolean hasBrakePressure()
    {
	return (brakePressure != null);
    }
    
    public void deleteBrakePressure()
    {
	brakePressure = null;
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
    
    
    // Methods for field "sunData"
    public SunSensor getSunData()
    {
	return this.sunData;
    }
    
    public void setSunData(SunSensor sunData)
    {
	this.sunData = sunData;
    }
    
    public boolean hasSunData()
    {
	return (sunData != null);
    }
    
    public void deleteSunData()
    {
	sunData = null;
    }
    
    
    // Methods for field "rainData"
    public RainSensor getRainData()
    {
	return this.rainData;
    }
    
    public void setRainData(RainSensor rainData)
    {
	this.rainData = rainData;
    }
    
    public boolean hasRainData()
    {
	return (rainData != null);
    }
    
    public void deleteRainData()
    {
	rainData = null;
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
    
    
    // Methods for field "airPres"
    public AmbientAirPressure getAirPres()
    {
	return this.airPres;
    }
    
    public void setAirPres(AmbientAirPressure airPres)
    {
	this.airPres = airPres;
    }
    
    public boolean hasAirPres()
    {
	return (airPres != null);
    }
    
    public void deleteAirPres()
    {
	airPres = null;
    }
    
    
    // Methods for field "steering"
    public Steering getSteering()
    {
	return this.steering;
    }
    
    public void setSteering(Steering steering)
    {
	this.steering = steering;
    }
    
    public boolean hasSteering()
    {
	return (steering != null);
    }
    
    public void deleteSteering()
    {
	steering = null;
    }
    
    
    
    /**
     * Define the Steering ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class Steering extends Sequence {
	public SteeringWheelAngle angle;
	public SteeringWheelAngleConfidence confidence;
	public SteeringWheelAngleRateOfChange rate;
	public DrivingWheelAngle wheels;
	
	/**
	 * The default constructor.
	 */
	public Steering()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Steering(SteeringWheelAngle angle, 
			SteeringWheelAngleConfidence confidence, 
			SteeringWheelAngleRateOfChange rate, 
			DrivingWheelAngle wheels)
	{
	    setAngle(angle);
	    setConfidence(confidence);
	    setRate(rate);
	    setWheels(wheels);
	}
	
	/**
	 * Construct with required components.
	 */
	public Steering(SteeringWheelAngle angle)
	{
	    setAngle(angle);
	}
	
	
	// Methods for field "angle"
	public SteeringWheelAngle getAngle()
	{
	    return this.angle;
	}
	
	public void setAngle(SteeringWheelAngle angle)
	{
	    this.angle = angle;
	}
	
	
	// Methods for field "confidence"
	public SteeringWheelAngleConfidence getConfidence()
	{
	    return this.confidence;
	}
	
	public void setConfidence(SteeringWheelAngleConfidence confidence)
	{
	    this.confidence = confidence;
	}
	
	public boolean hasConfidence()
	{
	    return (confidence != null);
	}
	
	public void deleteConfidence()
	{
	    confidence = null;
	}
	
	
	// Methods for field "rate"
	public SteeringWheelAngleRateOfChange getRate()
	{
	    return this.rate;
	}
	
	public void setRate(SteeringWheelAngleRateOfChange rate)
	{
	    this.rate = rate;
	}
	
	public boolean hasRate()
	{
	    return (rate != null);
	}
	
	public void deleteRate()
	{
	    rate = null;
	}
	
	
	// Methods for field "wheels"
	public DrivingWheelAngle getWheels()
	{
	    return this.wheels;
	}
	
	public void setWheels(DrivingWheelAngle wheels)
	{
	    this.wheels = wheels;
	}
	
	public boolean hasWheels()
	{
	    return (wheels != null);
	}
	
	public void deleteWheels()
	{
	    wheels = null;
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __angle("angle"),
	    __confidence("confidence"),
	    __rate("rate"),
	    __wheels("wheels"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Steering data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    sink.writeBit(data.confidence != null);
	    sink.writeBit(data.rate != null);
	    sink.writeBit(data.wheels != null);
	    nbits += 3;
	    // Encode field 'angle'
	    try {
		SteeringWheelAngle item1 = data.angle;
		long temp1 = item1.longValue();

		if (temp1 < -126 || temp1 > 127)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -126, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("angle", "SteeringWheelAngle");
		throw ee;
	    }
	    if (data.confidence != null) {
		// Encode field 'confidence'
		try {
		    SteeringWheelAngleConfidence item1 = data.confidence;
		    int idx1 = item1.indexOf();

		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
		    throw ee;
		}
	    }
	    if (data.rate != null) {
		// Encode field 'rate'
		try {
		    SteeringWheelAngleRateOfChange item1 = data.rate;
		    long temp1 = item1.longValue();

		    if (temp1 < -127 || temp1 > 127)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -127, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
		    throw ee;
		}
	    }
	    if (data.wheels != null) {
		// Encode field 'wheels'
		try {
		    DrivingWheelAngle item1 = data.wheels;
		    long temp1 = item1.longValue();

		    if (temp1 < -128 || temp1 > 127)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -128, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("wheels", "DrivingWheelAngle");
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
	public static Steering decodeValue(PerCoder coder, InputBitStream source, Steering data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    boolean has_confidence0 = source.readBit();
	    boolean has_rate0 = source.readBit();
	    boolean has_wheels0 = source.readBit();
	/** Decode root fields **/
	    // Decode field 'angle'
	    try {
		long temp1;

		if (data.angle == null)
		    data.angle = new SteeringWheelAngle();
		temp1 = coder.decodeConstrainedWholeNumber(source, -126, 127);
		if (temp1 > 127)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.angle.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("angle", "SteeringWheelAngle");
		throw de;
	    }
	    if (has_confidence0) {
		// Decode field 'confidence'
		try {
		    int idx1;

		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    data.confidence = SteeringWheelAngleConfidence.valueAt(idx1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
		    throw de;
		}
	    } else {
		data.confidence = null;
	    }
	    if (has_rate0) {
		// Decode field 'rate'
		try {
		    long temp1;

		    if (data.rate == null)
			data.rate = new SteeringWheelAngleRateOfChange();
		    temp1 = coder.decodeConstrainedWholeNumber(source, -127, 127);
		    if (temp1 > 127)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    data.rate.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
		    throw de;
		}
	    } else {
		data.rate = null;
	    }
	    if (has_wheels0) {
		// Decode field 'wheels'
		try {
		    long temp1;

		    if (data.wheels == null)
			data.wheels = new DrivingWheelAngle();
		    temp1 = coder.decodeConstrainedWholeNumber(source, -128, 127);
		    if (temp1 > 127)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    data.wheels.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("wheels", "DrivingWheelAngle");
		    throw de;
		}
	    } else {
		data.wheels = null;
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
	    // Encode field 'angle'
	    try {
		SteeringWheelAngle item1 = this.angle;

		{
		    sink.encodeKey("angle");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("angle", "SteeringWheelAngle");
		throw ee;
	    }
	    // Encode field 'confidence'
	    try {
		SteeringWheelAngleConfidence item1 = this.confidence;

		if (item1 != null) {
		    {
			sink.writeSeparator();
			sink.encodeKey("confidence");
			sink.writeString(item1.name());
		    }
		} else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		    sink.writeSeparator();
		    coder.encodeAbsentComponent(sink, "confidence");
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
		throw ee;
	    }
	    // Encode field 'rate'
	    try {
		SteeringWheelAngleRateOfChange item1 = this.rate;

		if (item1 != null) {
		    {
			sink.writeSeparator();
			sink.encodeKey("rate");
			coder.encodeInteger(item1.longValue(), sink);
		    }
		} else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		    sink.writeSeparator();
		    coder.encodeAbsentComponent(sink, "rate");
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
		throw ee;
	    }
	    // Encode field 'wheels'
	    try {
		DrivingWheelAngle item1 = this.wheels;

		if (item1 != null) {
		    {
			sink.writeSeparator();
			sink.encodeKey("wheels");
			coder.encodeInteger(item1.longValue(), sink);
		    }
		} else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		    sink.writeSeparator();
		    coder.encodeAbsentComponent(sink, "wheels");
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wheels", "DrivingWheelAngle");
		throw ee;
	    }
	    sink.endObject();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public Steering decodeValue(JsonCoder coder, JsonReader source)
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
			case __angle:
			// Decode field 'angle'
			try {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.angle == null)
				this.angle = new SteeringWheelAngle();
			    this.angle.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("angle", "SteeringWheelAngle");
			    throw de;
			}
			break;
			case __confidence:
			// Decode field 'confidence'
			try {
			    if (!coder.isNullValue(source)) {
				String content1 = coder.decodeString(source);
				int idx1;
				SteeringWheelAngleConfidence temp1;

				if (present0[1])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				idx1 = coder.resolveName(SteeringWheelAngleConfidence.cConstantNameList, content1);
				if (idx1 < 0 )
				    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
				else
				    temp1 = SteeringWheelAngleConfidence.cNamedNumbers[idx1];
				this.confidence = temp1;
				present0[1] = true;
			    }
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("confidence", "SteeringWheelAngleConfidence");
			    throw de;
			}
			break;
			case __rate:
			// Decode field 'rate'
			try {
			    if (!coder.isNullValue(source)) {
				if (present0[2])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.rate == null)
				    this.rate = new SteeringWheelAngleRateOfChange();
				this.rate.setValue(coder.decodeInteger(source));
				present0[2] = true;
			    }
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("rate", "SteeringWheelAngleRateOfChange");
			    throw de;
			}
			break;
			case __wheels:
			// Decode field 'wheels'
			try {
			    if (!coder.isNullValue(source)) {
				if (present0[3])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.wheels == null)
				    this.wheels = new DrivingWheelAngle();
				this.wheels.setValue(coder.decodeInteger(source));
				present0[3] = true;
			    }
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("wheels", "DrivingWheelAngle");
			    throw de;
			}
			break;
			default:
			    throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		    }
		} while (coder.hasMoreProperties(source, false));
	    if (!present0[0])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'angle'");
	    if (!present0[1])
		this.confidence = null;
	    if (!present0[2])
		this.rate = null;
	    if (!present0[3])
		this.wheels = null;
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
		writer.print("angle ");
		writer.print(this.angle.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    if (this.confidence != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("confidence ");
		    printer.print(this.confidence, writer, this.confidence.cConstantNameList);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.rate != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("rate ");
		    writer.print(this.rate.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.wheels != null) {
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("wheels ");
		    writer.print(this.wheels.longValue());
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
	    return equalTo((Steering)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Steering)that);
	}
	
	public boolean equalTo(Steering that) {
	    if (!this.angle.equalTo(that.angle))
		return false;
	    if (this.confidence != null) {
		if (that.confidence == null || !this.confidence.equalTo(that.confidence))
		    return false;
	    } else if (that.confidence != null)
		return false;
	    if (this.rate != null) {
		if (that.rate == null || !this.rate.equalTo(that.rate))
		    return false;
	    } else if (that.rate != null)
		return false;
	    if (this.wheels != null) {
		if (that.wheels == null || !this.wheels.equalTo(that.wheels))
		    return false;
	    } else if (that.wheels != null)
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Steering clone() {
	    Steering copy = (Steering)super.clone();
	    copy.angle = angle.clone();
	    if (confidence != null) {
		copy.confidence = confidence.clone();
	    }
	    if (rate != null) {
		copy.rate = rate.clone();
	    }
	    if (wheels != null) {
		copy.wheels = wheels.clone();
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 3;
	    hash = 41 * hash + (this.angle != null ? this.angle.hashCode() : 0);
	    hash = 41 * hash + (this.confidence != null ? this.confidence.hashCode() : 0);
	    hash = 41 * hash + (this.rate != null ? this.rate.hashCode() : 0);
	    hash = 41 * hash + (this.wheels != null ? this.wheels.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Steering

    // Methods for field "accelSets"
    public AccelSets getAccelSets()
    {
	return this.accelSets;
    }
    
    public void setAccelSets(AccelSets accelSets)
    {
	this.accelSets = accelSets;
    }
    
    public boolean hasAccelSets()
    {
	return (accelSets != null);
    }
    
    public void deleteAccelSets()
    {
	accelSets = null;
    }
    
    
    
    /**
     * Define the AccelSets ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class AccelSets extends Sequence {
	public AccelerationSet4Way accel4way;
	public VerticalAccelerationThreshold vertAccelThres;
	public YawRateConfidence yawRateCon;
	public AccelerationConfidence hozAccelCon;
	public ConfidenceSet confidenceSet;
	
	/**
	 * The default constructor.
	 */
	public AccelSets()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public AccelSets(AccelerationSet4Way accel4way, 
			VerticalAccelerationThreshold vertAccelThres, 
			YawRateConfidence yawRateCon, 
			AccelerationConfidence hozAccelCon, 
			ConfidenceSet confidenceSet)
	{
	    setAccel4way(accel4way);
	    setVertAccelThres(vertAccelThres);
	    setYawRateCon(yawRateCon);
	    setHozAccelCon(hozAccelCon);
	    setConfidenceSet(confidenceSet);
	}
	
	
	// Methods for field "accel4way"
	public AccelerationSet4Way getAccel4way()
	{
	    return this.accel4way;
	}
	
	public void setAccel4way(AccelerationSet4Way accel4way)
	{
	    this.accel4way = accel4way;
	}
	
	public boolean hasAccel4way()
	{
	    return (accel4way != null);
	}
	
	public void deleteAccel4way()
	{
	    accel4way = null;
	}
	
	
	// Methods for field "vertAccelThres"
	public VerticalAccelerationThreshold getVertAccelThres()
	{
	    return this.vertAccelThres;
	}
	
	public void setVertAccelThres(VerticalAccelerationThreshold vertAccelThres)
	{
	    this.vertAccelThres = vertAccelThres;
	}
	
	public boolean hasVertAccelThres()
	{
	    return (vertAccelThres != null);
	}
	
	public void deleteVertAccelThres()
	{
	    vertAccelThres = null;
	}
	
	
	// Methods for field "yawRateCon"
	public YawRateConfidence getYawRateCon()
	{
	    return this.yawRateCon;
	}
	
	public void setYawRateCon(YawRateConfidence yawRateCon)
	{
	    this.yawRateCon = yawRateCon;
	}
	
	public boolean hasYawRateCon()
	{
	    return (yawRateCon != null);
	}
	
	public void deleteYawRateCon()
	{
	    yawRateCon = null;
	}
	
	
	// Methods for field "hozAccelCon"
	public AccelerationConfidence getHozAccelCon()
	{
	    return this.hozAccelCon;
	}
	
	public void setHozAccelCon(AccelerationConfidence hozAccelCon)
	{
	    this.hozAccelCon = hozAccelCon;
	}
	
	public boolean hasHozAccelCon()
	{
	    return (hozAccelCon != null);
	}
	
	public void deleteHozAccelCon()
	{
	    hozAccelCon = null;
	}
	
	
	// Methods for field "confidenceSet"
	public ConfidenceSet getConfidenceSet()
	{
	    return this.confidenceSet;
	}
	
	public void setConfidenceSet(ConfidenceSet confidenceSet)
	{
	    this.confidenceSet = confidenceSet;
	}
	
	public boolean hasConfidenceSet()
	{
	    return (confidenceSet != null);
	}
	
	public void deleteConfidenceSet()
	{
	    confidenceSet = null;
	}
	
	
	/**
	 * Effective size constraint (reserved for internal use).
	 * This member is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static final Bounds _cBounds_vertAccelThres = 
	    VerticalAccelerationThreshold._cBounds_;
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __accel4way("accel4way"),
	    __vertAccelThres("vertAccelThres"),
	    __yawRateCon("yawRateCon"),
	    __hozAccelCon("hozAccelCon"),
	    __confidenceSet("confidenceSet"),
	    _null_("_null_");
	    private String tag;
	    private static java.util.HashMap<String, __Tag> map =
		new java.util.HashMap<String, __Tag>(6);
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, AccelSets data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    sink.writeBit(data.accel4way != null);
	    sink.writeBit(data.vertAccelThres != null);
	    sink.writeBit(data.yawRateCon != null);
	    sink.writeBit(data.hozAccelCon != null);
	    sink.writeBit(data.confidenceSet != null);
	    nbits += 5;
	    if (data.accel4way != null) {
		// Encode field 'accel4way'
		try {
		    AccelerationSet4Way item1 = data.accel4way;

		    nbits += AccelerationSet4Way.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("accel4way", "AccelerationSet4Way");
		    throw ee;
		}
	    }
	    if (data.vertAccelThres != null) {
		// Encode field 'vertAccelThres'
		try {
		    VerticalAccelerationThreshold item1 = data.vertAccelThres;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, AccelSets._cBounds_vertAccelThres);
		    if (total_len1 != 5)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 5, 5, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
		    throw ee;
		}
	    }
	    if (data.yawRateCon != null) {
		// Encode field 'yawRateCon'
		try {
		    YawRateConfidence item1 = data.yawRateCon;
		    int idx1 = item1.indexOf();

		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("yawRateCon", "YawRateConfidence");
		    throw ee;
		}
	    }
	    if (data.hozAccelCon != null) {
		// Encode field 'hozAccelCon'
		try {
		    AccelerationConfidence item1 = data.hozAccelCon;
		    int idx1 = item1.indexOf();

		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("hozAccelCon", "AccelerationConfidence");
		    throw ee;
		}
	    }
	    if (data.confidenceSet != null) {
		// Encode field 'confidenceSet'
		try {
		    ConfidenceSet item1 = data.confidenceSet;

		    nbits += ConfidenceSet.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("confidenceSet", "ConfidenceSet");
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
	public static AccelSets decodeValue(PerCoder coder, InputBitStream source, AccelSets data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    boolean has_accel4way0 = source.readBit();
	    boolean has_vertAccelThres0 = source.readBit();
	    boolean has_yawRateCon0 = source.readBit();
	    boolean has_hozAccelCon0 = source.readBit();
	    boolean has_confidenceSet0 = source.readBit();
	/** Decode root fields **/
	    if (has_accel4way0) {
		// Decode field 'accel4way'
		try {
		    if (data.accel4way == null)
			data.accel4way = new AccelerationSet4Way();
		    data.accel4way.decodeValue(coder, source, data.accel4way);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("accel4way", "AccelerationSet4Way");
		    throw de;
		}
	    } else {
		data.accel4way = null;
	    }
	    if (has_vertAccelThres0) {
		// Decode field 'vertAccelThres'
		try {
		    if (data.vertAccelThres == null)
			data.vertAccelThres = new VerticalAccelerationThreshold();
		    com.oss.coders.per.PerBitstring.decode(coder, source, 5, 5, data.vertAccelThres);
		    if (coder.isStrictCodingEnabled() && data.vertAccelThres.getSize() >
			com.oss.util.BitTool.computeMinimalLength(data.vertAccelThres, AccelSets._cBounds_vertAccelThres))
			throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			    "trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
		    throw de;
		}
	    } else {
		data.vertAccelThres = null;
	    }
	    if (has_yawRateCon0) {
		// Decode field 'yawRateCon'
		try {
		    int idx1;

		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (idx1 < 0 || idx1 > 7)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    data.yawRateCon = YawRateConfidence.valueAt(idx1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("yawRateCon", "YawRateConfidence");
		    throw de;
		}
	    } else {
		data.yawRateCon = null;
	    }
	    if (has_hozAccelCon0) {
		// Decode field 'hozAccelCon'
		try {
		    int idx1;

		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (idx1 < 0 || idx1 > 7)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    data.hozAccelCon = AccelerationConfidence.valueAt(idx1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("hozAccelCon", "AccelerationConfidence");
		    throw de;
		}
	    } else {
		data.hozAccelCon = null;
	    }
	    if (has_confidenceSet0) {
		// Decode field 'confidenceSet'
		try {
		    if (data.confidenceSet == null)
			data.confidenceSet = new ConfidenceSet();
		    data.confidenceSet.decodeValue(coder, source, data.confidenceSet);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("confidenceSet", "ConfidenceSet");
		    throw de;
		}
	    } else {
		data.confidenceSet = null;
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
	    String separator0 = null;

	    sink.beginObject();
	    // Encode field 'accel4way'
	    try {
		AccelerationSet4Way item1 = this.accel4way;

		if (item1 != null) {
		    {
			separator0 = ",";
			sink.encodeKey("accel4way");
			item1.encodeValue(coder, sink);
		    }
		} else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		    separator0 = ",";
		    coder.encodeAbsentComponent(sink, "accel4way");
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accel4way", "AccelerationSet4Way");
		throw ee;
	    }
	    // Encode field 'vertAccelThres'
	    try {
		VerticalAccelerationThreshold item1 = this.vertAccelThres;

		if (item1 != null) {
		    {
			int len1 = item1.getSize();
			byte[] temp1 = item1.byteArrayValue();

			sink.writeSeparator(separator0);
			separator0 = ",";
			sink.encodeKey("vertAccelThres");
			coder.encodeBitStringWithNamedBits(temp1, len1, 5, sink);
		    }
		} else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    coder.encodeAbsentComponent(sink, "vertAccelThres");
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
		throw ee;
	    }
	    // Encode field 'yawRateCon'
	    try {
		YawRateConfidence item1 = this.yawRateCon;

		if (item1 != null) {
		    {
			sink.writeSeparator(separator0);
			separator0 = ",";
			sink.encodeKey("yawRateCon");
			sink.writeString(item1.name());
		    }
		} else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    coder.encodeAbsentComponent(sink, "yawRateCon");
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("yawRateCon", "YawRateConfidence");
		throw ee;
	    }
	    // Encode field 'hozAccelCon'
	    try {
		AccelerationConfidence item1 = this.hozAccelCon;

		if (item1 != null) {
		    {
			sink.writeSeparator(separator0);
			separator0 = ",";
			sink.encodeKey("hozAccelCon");
			sink.writeString(item1.name());
		    }
		} else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    coder.encodeAbsentComponent(sink, "hozAccelCon");
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("hozAccelCon", "AccelerationConfidence");
		throw ee;
	    }
	    // Encode field 'confidenceSet'
	    try {
		ConfidenceSet item1 = this.confidenceSet;

		if (item1 != null) {
		    {
			sink.writeSeparator(separator0);
			separator0 = ",";
			sink.encodeKey("confidenceSet");
			item1.encodeValue(coder, sink);
		    }
		} else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    coder.encodeAbsentComponent(sink, "confidenceSet");
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("confidenceSet", "ConfidenceSet");
		throw ee;
	    }
	    sink.endObject();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public AccelSets decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    boolean[] present0 = new boolean[6];

	    coder.decodeObject(source);
	    if (coder.hasMoreProperties(source, true))
		do {
		    String tag0 = coder.nextProperty(source);
		    __Tag t_tag0 = __Tag.getTagSub(tag0);
		    if (t_tag0 == null) 
			t_tag0 = __Tag._null_;
		    switch (t_tag0) {
			case __accel4way:
			// Decode field 'accel4way'
			try {
			    if (!coder.isNullValue(source)) {
				if (present0[0])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.accel4way == null)
				    this.accel4way = new AccelerationSet4Way();
				this.accel4way.decodeValue(coder, source);
				present0[0] = true;
			    }
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("accel4way", "AccelerationSet4Way");
			    throw de;
			}
			break;
			case __vertAccelThres:
			// Decode field 'vertAccelThres'
			try {
			    if (!coder.isNullValue(source)) {
				if (present0[1])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.vertAccelThres == null)
				    this.vertAccelThres = new VerticalAccelerationThreshold();
				coder.decodeBitString(5, source, this.vertAccelThres);
				present0[1] = true;
			    }
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("vertAccelThres", "VerticalAccelerationThreshold");
			    throw de;
			}
			break;
			case __yawRateCon:
			// Decode field 'yawRateCon'
			try {
			    if (!coder.isNullValue(source)) {
				String content1 = coder.decodeString(source);
				int idx1;
				YawRateConfidence temp1;

				if (present0[2])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				idx1 = coder.resolveName(YawRateConfidence.cConstantNameList, content1);
				if (idx1 < 0 )
				    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
				else
				    temp1 = YawRateConfidence.cNamedNumbers[idx1];
				this.yawRateCon = temp1;
				present0[2] = true;
			    }
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("yawRateCon", "YawRateConfidence");
			    throw de;
			}
			break;
			case __hozAccelCon:
			// Decode field 'hozAccelCon'
			try {
			    if (!coder.isNullValue(source)) {
				String content1 = coder.decodeString(source);
				int idx1;
				AccelerationConfidence temp1;

				if (present0[3])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				idx1 = coder.resolveName(AccelerationConfidence.cConstantNameList, content1);
				if (idx1 < 0 )
				    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
				else
				    temp1 = AccelerationConfidence.cNamedNumbers[idx1];
				this.hozAccelCon = temp1;
				present0[3] = true;
			    }
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("hozAccelCon", "AccelerationConfidence");
			    throw de;
			}
			break;
			case __confidenceSet:
			// Decode field 'confidenceSet'
			try {
			    if (!coder.isNullValue(source)) {
				if (present0[4])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.confidenceSet == null)
				    this.confidenceSet = new ConfidenceSet();
				this.confidenceSet.decodeValue(coder, source);
				present0[4] = true;
			    }
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("confidenceSet", "ConfidenceSet");
			    throw de;
			}
			break;
			default:
			    throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		    }
		} while (coder.hasMoreProperties(source, false));
	    if (!present0[0])
		this.accel4way = null;
	    if (!present0[1])
		this.vertAccelThres = null;
	    if (!present0[2])
		this.yawRateCon = null;
	    if (!present0[3])
		this.hozAccelCon = null;
	    if (!present0[4])
		this.confidenceSet = null;
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
	    if (this.accel4way != null) {
		try {
		    comma0 = true;
		    printer.newLine(writer);
		    writer.print("accel4way ");
		    this.accel4way.printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.vertAccelThres != null) {
		try {
		    if (comma0)
			writer.print(',');
		    comma0 = true;
		    printer.newLine(writer);
		    writer.print("vertAccelThres ");
		    printer.print(this.vertAccelThres, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.yawRateCon != null) {
		try {
		    if (comma0)
			writer.print(',');
		    comma0 = true;
		    printer.newLine(writer);
		    writer.print("yawRateCon ");
		    printer.print(this.yawRateCon, writer, this.yawRateCon.cConstantNameList);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.hozAccelCon != null) {
		try {
		    if (comma0)
			writer.print(',');
		    comma0 = true;
		    printer.newLine(writer);
		    writer.print("hozAccelCon ");
		    printer.print(this.hozAccelCon, writer, this.hozAccelCon.cConstantNameList);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
	    }
	    if (this.confidenceSet != null) {
		try {
		    if (comma0)
			writer.print(',');
		    comma0 = true;
		    printer.newLine(writer);
		    writer.print("confidenceSet ");
		    this.confidenceSet.printValue(printer, writer);
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
	    return equalTo((AccelSets)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((AccelSets)that);
	}
	
	public boolean equalTo(AccelSets that) {
	    if (this.accel4way != null) {
		if (that.accel4way == null || !this.accel4way.equalTo(that.accel4way))
		    return false;
	    } else if (that.accel4way != null)
		return false;
	    if (this.vertAccelThres != null) {
		if (that.vertAccelThres == null || !this.vertAccelThres.equalTo(that.vertAccelThres))
		    return false;
	    } else if (that.vertAccelThres != null)
		return false;
	    if (this.yawRateCon != null) {
		if (that.yawRateCon == null || !this.yawRateCon.equalTo(that.yawRateCon))
		    return false;
	    } else if (that.yawRateCon != null)
		return false;
	    if (this.hozAccelCon != null) {
		if (that.hozAccelCon == null || !this.hozAccelCon.equalTo(that.hozAccelCon))
		    return false;
	    } else if (that.hozAccelCon != null)
		return false;
	    if (this.confidenceSet != null) {
		if (that.confidenceSet == null || !this.confidenceSet.equalTo(that.confidenceSet))
		    return false;
	    } else if (that.confidenceSet != null)
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public AccelSets clone() {
	    AccelSets copy = (AccelSets)super.clone();
	    if (accel4way != null) {
		copy.accel4way = accel4way.clone();
	    }
	    if (vertAccelThres != null) {
		copy.vertAccelThres = vertAccelThres.clone();
	    }
	    if (yawRateCon != null) {
		copy.yawRateCon = yawRateCon.clone();
	    }
	    if (hozAccelCon != null) {
		copy.hozAccelCon = hozAccelCon.clone();
	    }
	    if (confidenceSet != null) {
		copy.confidenceSet = confidenceSet.clone();
	    }
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 3;
	    hash = 41 * hash + (this.accel4way != null ? this.accel4way.hashCode() : 0);
	    hash = 41 * hash + (this.vertAccelThres != null ? this.vertAccelThres.hashCode() : 0);
	    hash = 41 * hash + (this.yawRateCon != null ? this.yawRateCon.hashCode() : 0);
	    hash = 41 * hash + (this.hozAccelCon != null ? this.hozAccelCon.hashCode() : 0);
	    hash = 41 * hash + (this.confidenceSet != null ? this.confidenceSet.hashCode() : 0);
	    return hash;
	}
    } // End class definition for AccelSets

    // Methods for field "object"
    public Object getObject()
    {
	return this.object;
    }
    
    public void setObject(Object object)
    {
	this.object = object;
    }
    
    public boolean hasObject()
    {
	return (object != null);
    }
    
    public void deleteObject()
    {
	object = null;
    }
    
    
    
    /**
     * Define the Object ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class Object extends Sequence {
	public ObstacleDistance obDist;
	public Angle obDirect;
	public DDateTime dateTime;
	
	/**
	 * The default constructor.
	 */
	public Object()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Object(ObstacleDistance obDist, Angle obDirect, 
			DDateTime dateTime)
	{
	    setObDist(obDist);
	    setObDirect(obDirect);
	    setDateTime(dateTime);
	}
	
	
	// Methods for field "obDist"
	public ObstacleDistance getObDist()
	{
	    return this.obDist;
	}
	
	public void setObDist(ObstacleDistance obDist)
	{
	    this.obDist = obDist;
	}
	
	
	// Methods for field "obDirect"
	public Angle getObDirect()
	{
	    return this.obDirect;
	}
	
	public void setObDirect(Angle obDirect)
	{
	    this.obDirect = obDirect;
	}
	
	
	// Methods for field "dateTime"
	public DDateTime getDateTime()
	{
	    return this.dateTime;
	}
	
	public void setDateTime(DDateTime dateTime)
	{
	    this.dateTime = dateTime;
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __obDist("obDist"),
	    __obDirect("obDirect"),
	    __dateTime("dateTime"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Object data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int nbits = 0;

	    // Encode field 'obDist'
	    try {
		ObstacleDistance item1 = data.obDist;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("obDist", "ObstacleDistance");
		throw ee;
	    }
	    // Encode field 'obDirect'
	    try {
		Angle item1 = data.obDirect;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 28800)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("obDirect", "Angle");
		throw ee;
	    }
	    // Encode field 'dateTime'
	    try {
		DDateTime item1 = data.dateTime;

		nbits += DDateTime.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dateTime", "DDateTime");
		throw ee;
	    }

	    return nbits;
	}

	/**
	 * Implements PER value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static Object decodeValue(PerCoder coder, InputBitStream source, Object data)
		throws IOException, DecoderException, DecodeFailedException
	{
	/** Decode root fields **/
	    // Decode field 'obDist'
	    try {
		long temp1;

		if (data.obDist == null)
		    data.obDist = new ObstacleDistance();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.obDist.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("obDist", "ObstacleDistance");
		throw de;
	    }
	    // Decode field 'obDirect'
	    try {
		long temp1;

		if (data.obDirect == null)
		    data.obDirect = new Angle();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
		if (temp1 > 28800)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.obDirect.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("obDirect", "Angle");
		throw de;
	    }
	    // Decode field 'dateTime'
	    try {
		if (data.dateTime == null)
		    data.dateTime = new DDateTime();
		data.dateTime.decodeValue(coder, source, data.dateTime);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dateTime", "DDateTime");
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
	    // Encode field 'obDist'
	    try {
		ObstacleDistance item1 = this.obDist;

		{
		    sink.encodeKey("obDist");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("obDist", "ObstacleDistance");
		throw ee;
	    }
	    // Encode field 'obDirect'
	    try {
		Angle item1 = this.obDirect;

		{
		    sink.writeSeparator();
		    sink.encodeKey("obDirect");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("obDirect", "Angle");
		throw ee;
	    }
	    // Encode field 'dateTime'
	    try {
		DDateTime item1 = this.dateTime;

		{
		    sink.writeSeparator();
		    sink.encodeKey("dateTime");
		    item1.encodeValue(coder, sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dateTime", "DDateTime");
		throw ee;
	    }
	    sink.endObject();

	}

	/**
	 * Implements JSON value decoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public Object decodeValue(JsonCoder coder, JsonReader source)
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
			case __obDist:
			// Decode field 'obDist'
			try {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.obDist == null)
				this.obDist = new ObstacleDistance();
			    this.obDist.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("obDist", "ObstacleDistance");
			    throw de;
			}
			break;
			case __obDirect:
			// Decode field 'obDirect'
			try {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.obDirect == null)
				this.obDirect = new Angle();
			    this.obDirect.setValue(coder.decodeInteger(source));
			    present0[1] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("obDirect", "Angle");
			    throw de;
			}
			break;
			case __dateTime:
			// Decode field 'dateTime'
			try {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.dateTime == null)
				this.dateTime = new DDateTime();
			    this.dateTime.decodeValue(coder, source);
			    present0[2] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("dateTime", "DDateTime");
			    throw de;
			}
			break;
			default:
			    throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		    }
		} while (coder.hasMoreProperties(source, false));
	    if (!present0[0])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'obDist'");
	    if (!present0[1])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'obDirect'");
	    if (!present0[2])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'dateTime'");
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
		writer.print("obDist ");
		writer.print(this.obDist.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("obDirect ");
		writer.print(this.obDirect.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("dateTime ");
		this.dateTime.printValue(printer, writer);
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
	    return equalTo((Object)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Object)that);
	}
	
	public boolean equalTo(Object that) {
	    if (!this.obDist.equalTo(that.obDist))
		return false;
	    if (!this.obDirect.equalTo(that.obDirect))
		return false;
	    if (!this.dateTime.equalTo(that.dateTime))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Object clone() {
	    Object copy = (Object)super.clone();
	    copy.obDist = obDist.clone();
	    copy.obDirect = obDirect.clone();
	    copy.dateTime = dateTime.clone();
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 3;
	    hash = 41 * hash + (this.obDist != null ? this.obDist.hashCode() : 0);
	    hash = 41 * hash + (this.obDirect != null ? this.obDirect.hashCode() : 0);
	    hash = 41 * hash + (this.dateTime != null ? this.dateTime.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Object

    // Methods for field "fullPos"
    public FullPositionVector getFullPos()
    {
	return this.fullPos;
    }
    
    public void setFullPos(FullPositionVector fullPos)
    {
	this.fullPos = fullPos;
    }
    
    public boolean hasFullPos()
    {
	return (fullPos != null);
    }
    
    public void deleteFullPos()
    {
	fullPos = null;
    }
    
    
    // Methods for field "throttlePos"
    public ThrottlePosition getThrottlePos()
    {
	return this.throttlePos;
    }
    
    public void setThrottlePos(ThrottlePosition throttlePos)
    {
	this.throttlePos = throttlePos;
    }
    
    public boolean hasThrottlePos()
    {
	return (throttlePos != null);
    }
    
    public void deleteThrottlePos()
    {
	throttlePos = null;
    }
    
    
    // Methods for field "speedHeadC"
    public SpeedandHeadingandThrottleConfidence getSpeedHeadC()
    {
	return this.speedHeadC;
    }
    
    public void setSpeedHeadC(SpeedandHeadingandThrottleConfidence speedHeadC)
    {
	this.speedHeadC = speedHeadC;
    }
    
    public boolean hasSpeedHeadC()
    {
	return (speedHeadC != null);
    }
    
    public void deleteSpeedHeadC()
    {
	speedHeadC = null;
    }
    
    
    // Methods for field "speedC"
    public SpeedConfidence getSpeedC()
    {
	return this.speedC;
    }
    
    public void setSpeedC(SpeedConfidence speedC)
    {
	this.speedC = speedC;
    }
    
    public boolean hasSpeedC()
    {
	return (speedC != null);
    }
    
    public void deleteSpeedC()
    {
	speedC = null;
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
    
    
    
    /**
     * Define the VehicleData ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class VehicleData extends Sequence {
	public VehicleHeight height;
	public BumperHeights bumpers;
	public VehicleMass mass;
	public TrailerWeight trailerWeight;
	public VehicleType type;
	
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
			VehicleMass mass, TrailerWeight trailerWeight, 
			VehicleType type)
	{
	    setHeight(height);
	    setBumpers(bumpers);
	    setMass(mass);
	    setTrailerWeight(trailerWeight);
	    setType(type);
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
	
	
	// Methods for field "bumpers"
	public BumperHeights getBumpers()
	{
	    return this.bumpers;
	}
	
	public void setBumpers(BumperHeights bumpers)
	{
	    this.bumpers = bumpers;
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
	
	
	// Methods for field "trailerWeight"
	public TrailerWeight getTrailerWeight()
	{
	    return this.trailerWeight;
	}
	
	public void setTrailerWeight(TrailerWeight trailerWeight)
	{
	    this.trailerWeight = trailerWeight;
	}
	
	
	// Methods for field "type"
	public VehicleType getType()
	{
	    return this.type;
	}
	
	public void setType(VehicleType type)
	{
	    this.type = type;
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
	    __type("type"),
	    _null_("_null_");
	    private String tag;
	    private static java.util.HashMap<String, __Tag> map =
		new java.util.HashMap<String, __Tag>(6);
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

	    // Encode field 'height'
	    try {
		VehicleHeight item1 = data.height;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("height", "VehicleHeight");
		throw ee;
	    }
	    // Encode field 'bumpers'
	    try {
		BumperHeights item1 = data.bumpers;

		nbits += BumperHeights.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("bumpers", "BumperHeights");
		throw ee;
	    }
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
	    // Encode field 'type'
	    try {
		VehicleType item1 = data.type;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 16;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "VehicleType");
		throw ee;
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
	/** Decode root fields **/
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
	    // Decode field 'type'
	    try {
		int idx1;
		VehicleType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		    if (idx1 < 0 || idx1 > 15)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = VehicleType.valueAt(idx1);
		} else {
		    idx1 = 16 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = VehicleType.unknownEnumerator();
		}
		data.type = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("type", "VehicleType");
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
	    // Encode field 'height'
	    try {
		VehicleHeight item1 = this.height;

		{
		    sink.encodeKey("height");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("height", "VehicleHeight");
		throw ee;
	    }
	    // Encode field 'bumpers'
	    try {
		BumperHeights item1 = this.bumpers;

		{
		    sink.writeSeparator();
		    sink.encodeKey("bumpers");
		    item1.encodeValue(coder, sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("bumpers", "BumperHeights");
		throw ee;
	    }
	    // Encode field 'mass'
	    try {
		VehicleMass item1 = this.mass;

		{
		    sink.writeSeparator();
		    sink.encodeKey("mass");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("mass", "VehicleMass");
		throw ee;
	    }
	    // Encode field 'trailerWeight'
	    try {
		TrailerWeight item1 = this.trailerWeight;

		{
		    sink.writeSeparator();
		    sink.encodeKey("trailerWeight");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("trailerWeight", "TrailerWeight");
		throw ee;
	    }
	    // Encode field 'type'
	    try {
		VehicleType item1 = this.type;

		{
		    sink.writeSeparator();
		    sink.encodeKey("type");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "VehicleType");
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
	    boolean[] present0 = new boolean[6];

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
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.height == null)
				this.height = new VehicleHeight();
			    this.height.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("height", "VehicleHeight");
			    throw de;
			}
			break;
			case __bumpers:
			// Decode field 'bumpers'
			try {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.bumpers == null)
				this.bumpers = new BumperHeights();
			    this.bumpers.decodeValue(coder, source);
			    present0[1] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("bumpers", "BumperHeights");
			    throw de;
			}
			break;
			case __mass:
			// Decode field 'mass'
			try {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.mass == null)
				this.mass = new VehicleMass();
			    this.mass.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("mass", "VehicleMass");
			    throw de;
			}
			break;
			case __trailerWeight:
			// Decode field 'trailerWeight'
			try {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.trailerWeight == null)
				this.trailerWeight = new TrailerWeight();
			    this.trailerWeight.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("trailerWeight", "TrailerWeight");
			    throw de;
			}
			break;
			case __type:
			// Decode field 'type'
			try {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    VehicleType temp1;

			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(VehicleType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = VehicleType.unknownEnumerator();
			    else
				temp1 = VehicleType.cNamedNumbers[idx1];
			    this.type = temp1;
			    present0[4] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("type", "VehicleType");
			    throw de;
			}
			break;
			default:
			    throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		    }
		} while (coder.hasMoreProperties(source, false));
	    if (!present0[0])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'height'");
	    if (!present0[1])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'bumpers'");
	    if (!present0[2])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'mass'");
	    if (!present0[3])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'trailerWeight'");
	    if (!present0[4])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'type'");
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
		writer.print("height ");
		writer.print(this.height.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("bumpers ");
		this.bumpers.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("mass ");
		writer.print(this.mass.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("trailerWeight ");
		writer.print(this.trailerWeight.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("type ");
		printer.print(this.type, writer, this.type.cConstantNameList);
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
	    return equalTo((VehicleData)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((VehicleData)that);
	}
	
	public boolean equalTo(VehicleData that) {
	    if (!this.height.equalTo(that.height))
		return false;
	    if (!this.bumpers.equalTo(that.bumpers))
		return false;
	    if (!this.mass.equalTo(that.mass))
		return false;
	    if (!this.trailerWeight.equalTo(that.trailerWeight))
		return false;
	    if (!this.type.equalTo(that.type))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public VehicleData clone() {
	    VehicleData copy = (VehicleData)super.clone();
	    copy.height = height.clone();
	    copy.bumpers = bumpers.clone();
	    copy.mass = mass.clone();
	    copy.trailerWeight = trailerWeight.clone();
	    copy.type = type.clone();
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
	    hash = 41 * hash + (this.type != null ? this.type.hashCode() : 0);
	    return hash;
	}
    } // End class definition for VehicleData

    // Methods for field "vehicleIdent"
    public VehicleIdent getVehicleIdent()
    {
	return this.vehicleIdent;
    }
    
    public void setVehicleIdent(VehicleIdent vehicleIdent)
    {
	this.vehicleIdent = vehicleIdent;
    }
    
    public boolean hasVehicleIdent()
    {
	return (vehicleIdent != null);
    }
    
    public void deleteVehicleIdent()
    {
	vehicleIdent = null;
    }
    
    
    // Methods for field "j1939data"
    public J1939data getJ1939data()
    {
	return this.j1939data;
    }
    
    public void setJ1939data(J1939data j1939data)
    {
	this.j1939data = j1939data;
    }
    
    public boolean hasJ1939data()
    {
	return (j1939data != null);
    }
    
    public void deleteJ1939data()
    {
	j1939data = null;
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
    
    
    
    /**
     * Define the WeatherReport ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class WeatherReport extends Sequence {
	public j2735.ntcip.EssPrecipYesNo isRaining;
	public j2735.ntcip.EssPrecipRate rainRate;
	public j2735.ntcip.EssPrecipSituation precipSituation;
	public j2735.ntcip.EssSolarRadiation solarRadiation;
	public j2735.ntcip.EssMobileFriction friction;
	
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
			j2735.ntcip.EssMobileFriction friction)
	{
	    setIsRaining(isRaining);
	    setRainRate(rainRate);
	    setPrecipSituation(precipSituation);
	    setSolarRadiation(solarRadiation);
	    setFriction(friction);
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
	    _null_("_null_");
	    private String tag;
	    private static java.util.HashMap<String, __Tag> map =
		new java.util.HashMap<String, __Tag>(6);
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

	    sink.writeBit(data.rainRate != null);
	    sink.writeBit(data.precipSituation != null);
	    sink.writeBit(data.solarRadiation != null);
	    sink.writeBit(data.friction != null);
	    nbits += 4;
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
	    boolean has_rainRate0 = source.readBit();
	    boolean has_precipSituation0 = source.readBit();
	    boolean has_solarRadiation0 = source.readBit();
	    boolean has_friction0 = source.readBit();
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
	    boolean[] present0 = new boolean[6];

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
			default:
			    throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
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
	    return hash;
	}
    } // End class definition for WeatherReport

    // Methods for field "gnssStatus"
    public GNSSstatus getGnssStatus()
    {
	return this.gnssStatus;
    }
    
    public void setGnssStatus(GNSSstatus gnssStatus)
    {
	this.gnssStatus = gnssStatus;
    }
    
    public boolean hasGnssStatus()
    {
	return (gnssStatus != null);
    }
    
    public void deleteGnssStatus()
    {
	gnssStatus = null;
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_lights = 
	ExteriorLights._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_gnssStatus = 
	GNSSstatus._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__lights("lights"),
	__lightBar("lightBar"),
	__wipers("wipers"),
	__brakeStatus("brakeStatus"),
	__brakePressure("brakePressure"),
	__roadFriction("roadFriction"),
	__sunData("sunData"),
	__rainData("rainData"),
	__airTemp("airTemp"),
	__airPres("airPres"),
	__steering("steering"),
	__accelSets("accelSets"),
	__object("object"),
	__fullPos("fullPos"),
	__throttlePos("throttlePos"),
	__speedHeadC("speedHeadC"),
	__speedC("speedC"),
	__vehicleData("vehicleData"),
	__vehicleIdent("vehicleIdent"),
	__j1939data("j1939data"),
	__weatherReport("weatherReport"),
	__gnssStatus("gnssStatus"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(23);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleStatus data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.lights != null);
	sink.writeBit(data.lightBar != null);
	sink.writeBit(data.wipers != null);
	sink.writeBit(data.brakeStatus != null);
	sink.writeBit(data.brakePressure != null);
	sink.writeBit(data.roadFriction != null);
	sink.writeBit(data.sunData != null);
	sink.writeBit(data.rainData != null);
	sink.writeBit(data.airTemp != null);
	sink.writeBit(data.airPres != null);
	sink.writeBit(data.steering != null);
	sink.writeBit(data.accelSets != null);
	sink.writeBit(data.object != null);
	sink.writeBit(data.fullPos != null);
	sink.writeBit(data.throttlePos != null);
	sink.writeBit(data.speedHeadC != null);
	sink.writeBit(data.speedC != null);
	sink.writeBit(data.vehicleData != null);
	sink.writeBit(data.vehicleIdent != null);
	sink.writeBit(data.j1939data != null);
	sink.writeBit(data.weatherReport != null);
	sink.writeBit(data.gnssStatus != null);
	nbits += 23;
	if (data.lights != null) {
	    // Encode field 'lights'
	    try {
		ExteriorLights item1 = data.lights;
		int len1 = item1.getSize();
		int total_len1;
		boolean extroot1;
		byte[] temp1 = item1.byteArrayValue();

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, VehicleStatus._cBounds_lights);
		extroot1 = total_len1 == 9;
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 9, 9, sink);
		else
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lights", "ExteriorLights");
		throw ee;
	    }
	}
	if (data.lightBar != null) {
	    // Encode field 'lightBar'
	    try {
		LightbarInUse item1 = data.lightBar;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lightBar", "LightbarInUse");
		throw ee;
	    }
	}
	if (data.wipers != null) {
	    // Encode field 'wipers'
	    try {
		WiperSet item1 = data.wipers;

		nbits += WiperSet.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("wipers", "WiperSet");
		throw ee;
	    }
	}
	if (data.brakeStatus != null) {
	    // Encode field 'brakeStatus'
	    try {
		BrakeSystemStatus item1 = data.brakeStatus;

		nbits += BrakeSystemStatus.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakeStatus", "BrakeSystemStatus");
		throw ee;
	    }
	}
	if (data.brakePressure != null) {
	    // Encode field 'brakePressure'
	    try {
		BrakeAppliedPressure item1 = data.brakePressure;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("brakePressure", "BrakeAppliedPressure");
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
	if (data.sunData != null) {
	    // Encode field 'sunData'
	    try {
		SunSensor item1 = data.sunData;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 1000)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 1000, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sunData", "SunSensor");
		throw ee;
	    }
	}
	if (data.rainData != null) {
	    // Encode field 'rainData'
	    try {
		RainSensor item1 = data.rainData;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rainData", "RainSensor");
		throw ee;
	    }
	}
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
	if (data.airPres != null) {
	    // Encode field 'airPres'
	    try {
		AmbientAirPressure item1 = data.airPres;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("airPres", "AmbientAirPressure");
		throw ee;
	    }
	}
	if (data.steering != null) {
	    // Encode field 'steering'
	    try {
		Steering item1 = data.steering;

		nbits += Steering.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("steering", "SEQUENCE");
		throw ee;
	    }
	}
	if (data.accelSets != null) {
	    // Encode field 'accelSets'
	    try {
		AccelSets item1 = data.accelSets;

		nbits += AccelSets.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSets", "SEQUENCE");
		throw ee;
	    }
	}
	if (data.object != null) {
	    // Encode field 'object'
	    try {
		Object item1 = data.object;

		nbits += Object.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("object", "SEQUENCE");
		throw ee;
	    }
	}
	if (data.fullPos != null) {
	    // Encode field 'fullPos'
	    try {
		FullPositionVector item1 = data.fullPos;

		nbits += FullPositionVector.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("fullPos", "FullPositionVector");
		throw ee;
	    }
	}
	if (data.throttlePos != null) {
	    // Encode field 'throttlePos'
	    try {
		ThrottlePosition item1 = data.throttlePos;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 200)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 200, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("throttlePos", "ThrottlePosition");
		throw ee;
	    }
	}
	if (data.speedHeadC != null) {
	    // Encode field 'speedHeadC'
	    try {
		SpeedandHeadingandThrottleConfidence item1 = data.speedHeadC;

		nbits += SpeedandHeadingandThrottleConfidence.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
		throw ee;
	    }
	}
	if (data.speedC != null) {
	    // Encode field 'speedC'
	    try {
		SpeedConfidence item1 = data.speedC;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("speedC", "SpeedConfidence");
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
		ee.appendFieldContext("vehicleData", "SEQUENCE");
		throw ee;
	    }
	}
	if (data.vehicleIdent != null) {
	    // Encode field 'vehicleIdent'
	    try {
		VehicleIdent item1 = data.vehicleIdent;

		nbits += VehicleIdent.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleIdent", "VehicleIdent");
		throw ee;
	    }
	}
	if (data.j1939data != null) {
	    // Encode field 'j1939data'
	    try {
		J1939data item1 = data.j1939data;

		nbits += J1939data.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("j1939data", "J1939data");
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
		ee.appendFieldContext("weatherReport", "SEQUENCE");
		throw ee;
	    }
	}
	if (data.gnssStatus != null) {
	    // Encode field 'gnssStatus'
	    try {
		GNSSstatus item1 = data.gnssStatus;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, VehicleStatus._cBounds_gnssStatus);
		if (total_len1 != 8)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 8, 8, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("gnssStatus", "GNSSstatus");
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
    public static VehicleStatus decodeValue(PerCoder coder, InputBitStream source, VehicleStatus data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_lights0 = source.readBit();
	boolean has_lightBar0 = source.readBit();
	boolean has_wipers0 = source.readBit();
	boolean has_brakeStatus0 = source.readBit();
	boolean has_brakePressure0 = source.readBit();
	boolean has_roadFriction0 = source.readBit();
	boolean has_sunData0 = source.readBit();
	boolean has_rainData0 = source.readBit();
	boolean has_airTemp0 = source.readBit();
	boolean has_airPres0 = source.readBit();
	boolean has_steering0 = source.readBit();
	boolean has_accelSets0 = source.readBit();
	boolean has_object0 = source.readBit();
	boolean has_fullPos0 = source.readBit();
	boolean has_throttlePos0 = source.readBit();
	boolean has_speedHeadC0 = source.readBit();
	boolean has_speedC0 = source.readBit();
	boolean has_vehicleData0 = source.readBit();
	boolean has_vehicleIdent0 = source.readBit();
	boolean has_j1939data0 = source.readBit();
	boolean has_weatherReport0 = source.readBit();
	boolean has_gnssStatus0 = source.readBit();
    /** Decode root fields **/
	if (has_lights0) {
	    // Decode field 'lights'
	    try {
		boolean extroot1 = !source.readBit();

		if (data.lights == null)
		    data.lights = new ExteriorLights();
		if (extroot1) {
		    com.oss.coders.per.PerBitstring.decode(coder, source, 9, 9, data.lights);
		} else {
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.lights);
		}
		if (coder.isStrictCodingEnabled()) {
		    boolean extroot1_range = data.lights.getSize() == 9;
		    if (extroot1 != extroot1_range)
			throw new DecoderException(ExceptionDescriptor._inval_enc, null,
			!extroot1 ? "extension bit is set but the length is in the extension root"
			: "extension bit is not set but the length is not in the extension root");
		}
		if (coder.isStrictCodingEnabled() && data.lights.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.lights, VehicleStatus._cBounds_lights))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lights", "ExteriorLights");
		throw de;
	    }
	} else {
	    data.lights = null;
	}
	if (has_lightBar0) {
	    // Decode field 'lightBar'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.lightBar = LightbarInUse.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lightBar", "LightbarInUse");
		throw de;
	    }
	} else {
	    data.lightBar = null;
	}
	if (has_wipers0) {
	    // Decode field 'wipers'
	    try {
		if (data.wipers == null)
		    data.wipers = new WiperSet();
		data.wipers.decodeValue(coder, source, data.wipers);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("wipers", "WiperSet");
		throw de;
	    }
	} else {
	    data.wipers = null;
	}
	if (has_brakeStatus0) {
	    // Decode field 'brakeStatus'
	    try {
		if (data.brakeStatus == null)
		    data.brakeStatus = new BrakeSystemStatus();
		data.brakeStatus.decodeValue(coder, source, data.brakeStatus);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("brakeStatus", "BrakeSystemStatus");
		throw de;
	    }
	} else {
	    data.brakeStatus = null;
	}
	if (has_brakePressure0) {
	    // Decode field 'brakePressure'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.brakePressure = BrakeAppliedPressure.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("brakePressure", "BrakeAppliedPressure");
		throw de;
	    }
	} else {
	    data.brakePressure = null;
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
	if (has_sunData0) {
	    // Decode field 'sunData'
	    try {
		long temp1;

		if (data.sunData == null)
		    data.sunData = new SunSensor();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 1000);
		if (temp1 > 1000)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.sunData.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sunData", "SunSensor");
		throw de;
	    }
	} else {
	    data.sunData = null;
	}
	if (has_rainData0) {
	    // Decode field 'rainData'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.rainData = RainSensor.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rainData", "RainSensor");
		throw de;
	    }
	} else {
	    data.rainData = null;
	}
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
	if (has_airPres0) {
	    // Decode field 'airPres'
	    try {
		long temp1;

		if (data.airPres == null)
		    data.airPres = new AmbientAirPressure();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.airPres.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("airPres", "AmbientAirPressure");
		throw de;
	    }
	} else {
	    data.airPres = null;
	}
	if (has_steering0) {
	    // Decode field 'steering'
	    try {
		if (data.steering == null)
		    data.steering = new Steering();
		data.steering.decodeValue(coder, source, data.steering);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("steering", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.steering = null;
	}
	if (has_accelSets0) {
	    // Decode field 'accelSets'
	    try {
		if (data.accelSets == null)
		    data.accelSets = new AccelSets();
		data.accelSets.decodeValue(coder, source, data.accelSets);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("accelSets", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.accelSets = null;
	}
	if (has_object0) {
	    // Decode field 'object'
	    try {
		if (data.object == null)
		    data.object = new Object();
		data.object.decodeValue(coder, source, data.object);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("object", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.object = null;
	}
	if (has_fullPos0) {
	    // Decode field 'fullPos'
	    try {
		if (data.fullPos == null)
		    data.fullPos = new FullPositionVector();
		data.fullPos.decodeValue(coder, source, data.fullPos);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("fullPos", "FullPositionVector");
		throw de;
	    }
	} else {
	    data.fullPos = null;
	}
	if (has_throttlePos0) {
	    // Decode field 'throttlePos'
	    try {
		long temp1;

		if (data.throttlePos == null)
		    data.throttlePos = new ThrottlePosition();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 200);
		if (temp1 > 200)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.throttlePos.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("throttlePos", "ThrottlePosition");
		throw de;
	    }
	} else {
	    data.throttlePos = null;
	}
	if (has_speedHeadC0) {
	    // Decode field 'speedHeadC'
	    try {
		if (data.speedHeadC == null)
		    data.speedHeadC = new SpeedandHeadingandThrottleConfidence();
		data.speedHeadC.decodeValue(coder, source, data.speedHeadC);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
		throw de;
	    }
	} else {
	    data.speedHeadC = null;
	}
	if (has_speedC0) {
	    // Decode field 'speedC'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.speedC = SpeedConfidence.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("speedC", "SpeedConfidence");
		throw de;
	    }
	} else {
	    data.speedC = null;
	}
	if (has_vehicleData0) {
	    // Decode field 'vehicleData'
	    try {
		if (data.vehicleData == null)
		    data.vehicleData = new VehicleData();
		data.vehicleData.decodeValue(coder, source, data.vehicleData);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleData", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.vehicleData = null;
	}
	if (has_vehicleIdent0) {
	    // Decode field 'vehicleIdent'
	    try {
		if (data.vehicleIdent == null)
		    data.vehicleIdent = new VehicleIdent();
		data.vehicleIdent.decodeValue(coder, source, data.vehicleIdent);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleIdent", "VehicleIdent");
		throw de;
	    }
	} else {
	    data.vehicleIdent = null;
	}
	if (has_j1939data0) {
	    // Decode field 'j1939data'
	    try {
		if (data.j1939data == null)
		    data.j1939data = new J1939data();
		data.j1939data.decodeValue(coder, source, data.j1939data);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("j1939data", "J1939data");
		throw de;
	    }
	} else {
	    data.j1939data = null;
	}
	if (has_weatherReport0) {
	    // Decode field 'weatherReport'
	    try {
		if (data.weatherReport == null)
		    data.weatherReport = new WeatherReport();
		data.weatherReport.decodeValue(coder, source, data.weatherReport);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("weatherReport", "SEQUENCE");
		throw de;
	    }
	} else {
	    data.weatherReport = null;
	}
	if (has_gnssStatus0) {
	    // Decode field 'gnssStatus'
	    try {
		if (data.gnssStatus == null)
		    data.gnssStatus = new GNSSstatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, 8, 8, data.gnssStatus);
		if (coder.isStrictCodingEnabled() && data.gnssStatus.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.gnssStatus, VehicleStatus._cBounds_gnssStatus))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("gnssStatus", "GNSSstatus");
		throw de;
	    }
	} else {
	    data.gnssStatus = null;
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
	// Encode field 'lights'
	try {
	    ExteriorLights item1 = this.lights;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    separator0 = ",";
		    sink.encodeKey("lights");
		    coder.encodeBitString(temp1, len1, -1, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "lights");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lights", "ExteriorLights");
	    throw ee;
	}
	// Encode field 'lightBar'
	try {
	    LightbarInUse item1 = this.lightBar;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("lightBar");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "lightBar");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lightBar", "LightbarInUse");
	    throw ee;
	}
	// Encode field 'wipers'
	try {
	    WiperSet item1 = this.wipers;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("wipers");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "wipers");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("wipers", "WiperSet");
	    throw ee;
	}
	// Encode field 'brakeStatus'
	try {
	    BrakeSystemStatus item1 = this.brakeStatus;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("brakeStatus");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "brakeStatus");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakeStatus", "BrakeSystemStatus");
	    throw ee;
	}
	// Encode field 'brakePressure'
	try {
	    BrakeAppliedPressure item1 = this.brakePressure;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("brakePressure");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "brakePressure");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakePressure", "BrakeAppliedPressure");
	    throw ee;
	}
	// Encode field 'roadFriction'
	try {
	    CoefficientOfFriction item1 = this.roadFriction;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("roadFriction");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "roadFriction");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("roadFriction", "CoefficientOfFriction");
	    throw ee;
	}
	// Encode field 'sunData'
	try {
	    SunSensor item1 = this.sunData;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("sunData");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "sunData");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sunData", "SunSensor");
	    throw ee;
	}
	// Encode field 'rainData'
	try {
	    RainSensor item1 = this.rainData;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("rainData");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "rainData");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rainData", "RainSensor");
	    throw ee;
	}
	// Encode field 'airTemp'
	try {
	    AmbientAirTemperature item1 = this.airTemp;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("airTemp");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "airTemp");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("airTemp", "AmbientAirTemperature");
	    throw ee;
	}
	// Encode field 'airPres'
	try {
	    AmbientAirPressure item1 = this.airPres;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("airPres");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "airPres");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("airPres", "AmbientAirPressure");
	    throw ee;
	}
	// Encode field 'steering'
	try {
	    Steering item1 = this.steering;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("steering");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "steering");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("steering", "SEQUENCE");
	    throw ee;
	}
	// Encode field 'accelSets'
	try {
	    AccelSets item1 = this.accelSets;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("accelSets");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "accelSets");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accelSets", "SEQUENCE");
	    throw ee;
	}
	// Encode field 'object'
	try {
	    Object item1 = this.object;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("object");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "object");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("object", "SEQUENCE");
	    throw ee;
	}
	// Encode field 'fullPos'
	try {
	    FullPositionVector item1 = this.fullPos;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("fullPos");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "fullPos");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("fullPos", "FullPositionVector");
	    throw ee;
	}
	// Encode field 'throttlePos'
	try {
	    ThrottlePosition item1 = this.throttlePos;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("throttlePos");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "throttlePos");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("throttlePos", "ThrottlePosition");
	    throw ee;
	}
	// Encode field 'speedHeadC'
	try {
	    SpeedandHeadingandThrottleConfidence item1 = this.speedHeadC;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("speedHeadC");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "speedHeadC");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
	    throw ee;
	}
	// Encode field 'speedC'
	try {
	    SpeedConfidence item1 = this.speedC;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("speedC");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "speedC");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speedC", "SpeedConfidence");
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
	    ee.appendFieldContext("vehicleData", "SEQUENCE");
	    throw ee;
	}
	// Encode field 'vehicleIdent'
	try {
	    VehicleIdent item1 = this.vehicleIdent;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("vehicleIdent");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "vehicleIdent");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleIdent", "VehicleIdent");
	    throw ee;
	}
	// Encode field 'j1939data'
	try {
	    J1939data item1 = this.j1939data;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("j1939data");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "j1939data");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("j1939data", "J1939data");
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
	    ee.appendFieldContext("weatherReport", "SEQUENCE");
	    throw ee;
	}
	// Encode field 'gnssStatus'
	try {
	    GNSSstatus item1 = this.gnssStatus;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("gnssStatus");
		    coder.encodeBitStringWithNamedBits(temp1, len1, 8, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "gnssStatus");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("gnssStatus", "GNSSstatus");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleStatus decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[23];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __lights:
		    // Decode field 'lights'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.lights == null)
				this.lights = new ExteriorLights();
			    coder.decodeBitString(-1, source, this.lights);
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lights", "ExteriorLights");
			throw de;
		    }
		    break;
		    case __lightBar:
		    // Decode field 'lightBar'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    LightbarInUse temp1;

			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(LightbarInUse.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = LightbarInUse.cNamedNumbers[idx1];
			    this.lightBar = temp1;
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lightBar", "LightbarInUse");
			throw de;
		    }
		    break;
		    case __wipers:
		    // Decode field 'wipers'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.wipers == null)
				this.wipers = new WiperSet();
			    this.wipers.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("wipers", "WiperSet");
			throw de;
		    }
		    break;
		    case __brakeStatus:
		    // Decode field 'brakeStatus'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.brakeStatus == null)
				this.brakeStatus = new BrakeSystemStatus();
			    this.brakeStatus.decodeValue(coder, source);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("brakeStatus", "BrakeSystemStatus");
			throw de;
		    }
		    break;
		    case __brakePressure:
		    // Decode field 'brakePressure'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    BrakeAppliedPressure temp1;

			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(BrakeAppliedPressure.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = BrakeAppliedPressure.cNamedNumbers[idx1];
			    this.brakePressure = temp1;
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("brakePressure", "BrakeAppliedPressure");
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
		    case __sunData:
		    // Decode field 'sunData'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.sunData == null)
				this.sunData = new SunSensor();
			    this.sunData.setValue(coder.decodeInteger(source));
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sunData", "SunSensor");
			throw de;
		    }
		    break;
		    case __rainData:
		    // Decode field 'rainData'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    RainSensor temp1;

			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(RainSensor.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = RainSensor.cNamedNumbers[idx1];
			    this.rainData = temp1;
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rainData", "RainSensor");
			throw de;
		    }
		    break;
		    case __airTemp:
		    // Decode field 'airTemp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.airTemp == null)
				this.airTemp = new AmbientAirTemperature();
			    this.airTemp.setValue(coder.decodeInteger(source));
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("airTemp", "AmbientAirTemperature");
			throw de;
		    }
		    break;
		    case __airPres:
		    // Decode field 'airPres'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.airPres == null)
				this.airPres = new AmbientAirPressure();
			    this.airPres.setValue(coder.decodeInteger(source));
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("airPres", "AmbientAirPressure");
			throw de;
		    }
		    break;
		    case __steering:
		    // Decode field 'steering'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[10])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.steering == null)
				this.steering = new Steering();
			    this.steering.decodeValue(coder, source);
			    present0[10] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("steering", "SEQUENCE");
			throw de;
		    }
		    break;
		    case __accelSets:
		    // Decode field 'accelSets'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[11])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.accelSets == null)
				this.accelSets = new AccelSets();
			    this.accelSets.decodeValue(coder, source);
			    present0[11] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("accelSets", "SEQUENCE");
			throw de;
		    }
		    break;
		    case __object:
		    // Decode field 'object'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[12])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.object == null)
				this.object = new Object();
			    this.object.decodeValue(coder, source);
			    present0[12] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("object", "SEQUENCE");
			throw de;
		    }
		    break;
		    case __fullPos:
		    // Decode field 'fullPos'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[13])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.fullPos == null)
				this.fullPos = new FullPositionVector();
			    this.fullPos.decodeValue(coder, source);
			    present0[13] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("fullPos", "FullPositionVector");
			throw de;
		    }
		    break;
		    case __throttlePos:
		    // Decode field 'throttlePos'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[14])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.throttlePos == null)
				this.throttlePos = new ThrottlePosition();
			    this.throttlePos.setValue(coder.decodeInteger(source));
			    present0[14] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("throttlePos", "ThrottlePosition");
			throw de;
		    }
		    break;
		    case __speedHeadC:
		    // Decode field 'speedHeadC'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[15])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.speedHeadC == null)
				this.speedHeadC = new SpeedandHeadingandThrottleConfidence();
			    this.speedHeadC.decodeValue(coder, source);
			    present0[15] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speedHeadC", "SpeedandHeadingandThrottleConfidence");
			throw de;
		    }
		    break;
		    case __speedC:
		    // Decode field 'speedC'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    SpeedConfidence temp1;

			    if (present0[16])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(SpeedConfidence.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = SpeedConfidence.cNamedNumbers[idx1];
			    this.speedC = temp1;
			    present0[16] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speedC", "SpeedConfidence");
			throw de;
		    }
		    break;
		    case __vehicleData:
		    // Decode field 'vehicleData'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[17])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.vehicleData == null)
				this.vehicleData = new VehicleData();
			    this.vehicleData.decodeValue(coder, source);
			    present0[17] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleData", "SEQUENCE");
			throw de;
		    }
		    break;
		    case __vehicleIdent:
		    // Decode field 'vehicleIdent'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[18])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.vehicleIdent == null)
				this.vehicleIdent = new VehicleIdent();
			    this.vehicleIdent.decodeValue(coder, source);
			    present0[18] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleIdent", "VehicleIdent");
			throw de;
		    }
		    break;
		    case __j1939data:
		    // Decode field 'j1939data'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[19])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.j1939data == null)
				this.j1939data = new J1939data();
			    this.j1939data.decodeValue(coder, source);
			    present0[19] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("j1939data", "J1939data");
			throw de;
		    }
		    break;
		    case __weatherReport:
		    // Decode field 'weatherReport'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[20])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.weatherReport == null)
				this.weatherReport = new WeatherReport();
			    this.weatherReport.decodeValue(coder, source);
			    present0[20] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("weatherReport", "SEQUENCE");
			throw de;
		    }
		    break;
		    case __gnssStatus:
		    // Decode field 'gnssStatus'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[21])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.gnssStatus == null)
				this.gnssStatus = new GNSSstatus();
			    coder.decodeBitString(8, source, this.gnssStatus);
			    present0[21] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("gnssStatus", "GNSSstatus");
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
	    this.lights = null;
	if (!present0[1])
	    this.lightBar = null;
	if (!present0[2])
	    this.wipers = null;
	if (!present0[3])
	    this.brakeStatus = null;
	if (!present0[4])
	    this.brakePressure = null;
	if (!present0[5])
	    this.roadFriction = null;
	if (!present0[6])
	    this.sunData = null;
	if (!present0[7])
	    this.rainData = null;
	if (!present0[8])
	    this.airTemp = null;
	if (!present0[9])
	    this.airPres = null;
	if (!present0[10])
	    this.steering = null;
	if (!present0[11])
	    this.accelSets = null;
	if (!present0[12])
	    this.object = null;
	if (!present0[13])
	    this.fullPos = null;
	if (!present0[14])
	    this.throttlePos = null;
	if (!present0[15])
	    this.speedHeadC = null;
	if (!present0[16])
	    this.speedC = null;
	if (!present0[17])
	    this.vehicleData = null;
	if (!present0[18])
	    this.vehicleIdent = null;
	if (!present0[19])
	    this.j1939data = null;
	if (!present0[20])
	    this.weatherReport = null;
	if (!present0[21])
	    this.gnssStatus = null;
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
	if (this.lights != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("lights ");
		printer.print(this.lights, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.lightBar != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("lightBar ");
		printer.print(this.lightBar, writer, this.lightBar.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.wipers != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("wipers ");
		this.wipers.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.brakeStatus != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("brakeStatus ");
		this.brakeStatus.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.brakePressure != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("brakePressure ");
		printer.print(this.brakePressure, writer, this.brakePressure.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.roadFriction != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("roadFriction ");
		writer.print(this.roadFriction.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sunData != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("sunData ");
		writer.print(this.sunData.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.rainData != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("rainData ");
		printer.print(this.rainData, writer, this.rainData.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.airTemp != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("airTemp ");
		writer.print(this.airTemp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.airPres != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("airPres ");
		writer.print(this.airPres.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.steering != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("steering ");
		this.steering.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.accelSets != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("accelSets ");
		this.accelSets.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.object != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("object ");
		this.object.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.fullPos != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("fullPos ");
		this.fullPos.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.throttlePos != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("throttlePos ");
		writer.print(this.throttlePos.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speedHeadC != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("speedHeadC ");
		this.speedHeadC.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.speedC != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("speedC ");
		printer.print(this.speedC, writer, this.speedC.cConstantNameList);
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
	if (this.vehicleIdent != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("vehicleIdent ");
		this.vehicleIdent.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.j1939data != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("j1939data ");
		this.j1939data.printValue(printer, writer);
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
	if (this.gnssStatus != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("gnssStatus ");
		printer.print(this.gnssStatus, writer);
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
	return equalTo((VehicleStatus)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((VehicleStatus)that);
    }
    
    public boolean equalTo(VehicleStatus that) {
	if (this.lights != null) {
	    if (that.lights == null || !this.lights.equalTo(that.lights))
		return false;
	} else if (that.lights != null)
	    return false;
	if (this.lightBar != null) {
	    if (that.lightBar == null || !this.lightBar.equalTo(that.lightBar))
		return false;
	} else if (that.lightBar != null)
	    return false;
	if (this.wipers != null) {
	    if (that.wipers == null || !this.wipers.equalTo(that.wipers))
		return false;
	} else if (that.wipers != null)
	    return false;
	if (this.brakeStatus != null) {
	    if (that.brakeStatus == null || !this.brakeStatus.equalTo(that.brakeStatus))
		return false;
	} else if (that.brakeStatus != null)
	    return false;
	if (this.brakePressure != null) {
	    if (that.brakePressure == null || !this.brakePressure.equalTo(that.brakePressure))
		return false;
	} else if (that.brakePressure != null)
	    return false;
	if (this.roadFriction != null) {
	    if (that.roadFriction == null || !this.roadFriction.equalTo(that.roadFriction))
		return false;
	} else if (that.roadFriction != null)
	    return false;
	if (this.sunData != null) {
	    if (that.sunData == null || !this.sunData.equalTo(that.sunData))
		return false;
	} else if (that.sunData != null)
	    return false;
	if (this.rainData != null) {
	    if (that.rainData == null || !this.rainData.equalTo(that.rainData))
		return false;
	} else if (that.rainData != null)
	    return false;
	if (this.airTemp != null) {
	    if (that.airTemp == null || !this.airTemp.equalTo(that.airTemp))
		return false;
	} else if (that.airTemp != null)
	    return false;
	if (this.airPres != null) {
	    if (that.airPres == null || !this.airPres.equalTo(that.airPres))
		return false;
	} else if (that.airPres != null)
	    return false;
	if (this.steering != null) {
	    if (that.steering == null || !this.steering.equalTo(that.steering))
		return false;
	} else if (that.steering != null)
	    return false;
	if (this.accelSets != null) {
	    if (that.accelSets == null || !this.accelSets.equalTo(that.accelSets))
		return false;
	} else if (that.accelSets != null)
	    return false;
	if (this.object != null) {
	    if (that.object == null || !this.object.equalTo(that.object))
		return false;
	} else if (that.object != null)
	    return false;
	if (this.fullPos != null) {
	    if (that.fullPos == null || !this.fullPos.equalTo(that.fullPos))
		return false;
	} else if (that.fullPos != null)
	    return false;
	if (this.throttlePos != null) {
	    if (that.throttlePos == null || !this.throttlePos.equalTo(that.throttlePos))
		return false;
	} else if (that.throttlePos != null)
	    return false;
	if (this.speedHeadC != null) {
	    if (that.speedHeadC == null || !this.speedHeadC.equalTo(that.speedHeadC))
		return false;
	} else if (that.speedHeadC != null)
	    return false;
	if (this.speedC != null) {
	    if (that.speedC == null || !this.speedC.equalTo(that.speedC))
		return false;
	} else if (that.speedC != null)
	    return false;
	if (this.vehicleData != null) {
	    if (that.vehicleData == null || !this.vehicleData.equalTo(that.vehicleData))
		return false;
	} else if (that.vehicleData != null)
	    return false;
	if (this.vehicleIdent != null) {
	    if (that.vehicleIdent == null || !this.vehicleIdent.equalTo(that.vehicleIdent))
		return false;
	} else if (that.vehicleIdent != null)
	    return false;
	if (this.j1939data != null) {
	    if (that.j1939data == null || !this.j1939data.equalTo(that.j1939data))
		return false;
	} else if (that.j1939data != null)
	    return false;
	if (this.weatherReport != null) {
	    if (that.weatherReport == null || !this.weatherReport.equalTo(that.weatherReport))
		return false;
	} else if (that.weatherReport != null)
	    return false;
	if (this.gnssStatus != null) {
	    if (that.gnssStatus == null || !this.gnssStatus.equalTo(that.gnssStatus))
		return false;
	} else if (that.gnssStatus != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleStatus clone() {
	VehicleStatus copy = (VehicleStatus)super.clone();
	if (lights != null) {
	    copy.lights = lights.clone();
	}
	if (lightBar != null) {
	    copy.lightBar = lightBar.clone();
	}
	if (wipers != null) {
	    copy.wipers = wipers.clone();
	}
	if (brakeStatus != null) {
	    copy.brakeStatus = brakeStatus.clone();
	}
	if (brakePressure != null) {
	    copy.brakePressure = brakePressure.clone();
	}
	if (roadFriction != null) {
	    copy.roadFriction = roadFriction.clone();
	}
	if (sunData != null) {
	    copy.sunData = sunData.clone();
	}
	if (rainData != null) {
	    copy.rainData = rainData.clone();
	}
	if (airTemp != null) {
	    copy.airTemp = airTemp.clone();
	}
	if (airPres != null) {
	    copy.airPres = airPres.clone();
	}
	if (steering != null) {
	    copy.steering = steering.clone();
	}
	if (accelSets != null) {
	    copy.accelSets = accelSets.clone();
	}
	if (object != null) {
	    copy.object = object.clone();
	}
	if (fullPos != null) {
	    copy.fullPos = fullPos.clone();
	}
	if (throttlePos != null) {
	    copy.throttlePos = throttlePos.clone();
	}
	if (speedHeadC != null) {
	    copy.speedHeadC = speedHeadC.clone();
	}
	if (speedC != null) {
	    copy.speedC = speedC.clone();
	}
	if (vehicleData != null) {
	    copy.vehicleData = vehicleData.clone();
	}
	if (vehicleIdent != null) {
	    copy.vehicleIdent = vehicleIdent.clone();
	}
	if (j1939data != null) {
	    copy.j1939data = j1939data.clone();
	}
	if (weatherReport != null) {
	    copy.weatherReport = weatherReport.clone();
	}
	if (gnssStatus != null) {
	    copy.gnssStatus = gnssStatus.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.lights != null ? this.lights.hashCode() : 0);
	hash = 41 * hash + (this.lightBar != null ? this.lightBar.hashCode() : 0);
	hash = 41 * hash + (this.wipers != null ? this.wipers.hashCode() : 0);
	hash = 41 * hash + (this.brakeStatus != null ? this.brakeStatus.hashCode() : 0);
	hash = 41 * hash + (this.brakePressure != null ? this.brakePressure.hashCode() : 0);
	hash = 41 * hash + (this.roadFriction != null ? this.roadFriction.hashCode() : 0);
	hash = 41 * hash + (this.sunData != null ? this.sunData.hashCode() : 0);
	hash = 41 * hash + (this.rainData != null ? this.rainData.hashCode() : 0);
	hash = 41 * hash + (this.airTemp != null ? this.airTemp.hashCode() : 0);
	hash = 41 * hash + (this.airPres != null ? this.airPres.hashCode() : 0);
	hash = 41 * hash + (this.steering != null ? this.steering.hashCode() : 0);
	hash = 41 * hash + (this.accelSets != null ? this.accelSets.hashCode() : 0);
	hash = 41 * hash + (this.object != null ? this.object.hashCode() : 0);
	hash = 41 * hash + (this.fullPos != null ? this.fullPos.hashCode() : 0);
	hash = 41 * hash + (this.throttlePos != null ? this.throttlePos.hashCode() : 0);
	hash = 41 * hash + (this.speedHeadC != null ? this.speedHeadC.hashCode() : 0);
	hash = 41 * hash + (this.speedC != null ? this.speedC.hashCode() : 0);
	hash = 41 * hash + (this.vehicleData != null ? this.vehicleData.hashCode() : 0);
	hash = 41 * hash + (this.vehicleIdent != null ? this.vehicleIdent.hashCode() : 0);
	hash = 41 * hash + (this.j1939data != null ? this.j1939data.hashCode() : 0);
	hash = 41 * hash + (this.weatherReport != null ? this.weatherReport.hashCode() : 0);
	hash = 41 * hash + (this.gnssStatus != null ? this.gnssStatus.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleStatus
