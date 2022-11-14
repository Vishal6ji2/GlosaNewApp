
/* THIS SAMPLE PROGRAM IS PROVIDED AS IS. THE SAMPLE PROGRAM AND ANY RESULTS
 * OBTAINED FROM IT ARE PROVIDED WITHOUT ANY WARRANTIES OR REPRESENTATIONS,
 * EXPRESS, IMPLIED OR STATUTORY. */

package j2735.samples.dsrc;

import java.util.Enumeration;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import com.oss.asn1.*;
import com.oss.util.*;
import j2735.dsrc.*;

/**
 * Define sample code for the MessageFrame ASN.1 type included in the DSRC ASN.1 module.
 * @see MessageFrame
 */

public class MessageFrameSample extends SampleUtil {

    /**
     * The default constructor. The class is not instantiable.
     */
    private MessageFrameSample() {}

    /**
     * Create Sample Value.
     */
    public static MessageFrame createSampleValue()
    {
	MessageFrame value = new MessageFrame();
	value.setMessageId(new DSRCmsgID(20));
	value.setValue(new OpenType(
	new BasicSafetyMessage()));
	{
	    BasicSafetyMessage basicSafetyMessage_2 = (BasicSafetyMessage)(value.getValue().getDecodedValue());
	    basicSafetyMessage_2.setCoreData(new BSMcoreData());
	    {
		BSMcoreData coreData_3 = basicSafetyMessage_2.getCoreData();
		coreData_3.setMsgCnt(new MsgCount(0));
		coreData_3.setId(new TemporaryID(new byte[]
		{
		    (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00
		}));
		coreData_3.setSecMark(new DSecond(0));
		coreData_3.setLat(new Latitude(-900000000));
		coreData_3.set_long(new Longitude(-1799999999));
		coreData_3.setElev(new Elevation(-4096));
		coreData_3.setAccuracy(new PositionalAccuracy());
		{
		    PositionalAccuracy accuracy_4 = coreData_3.getAccuracy();
		    accuracy_4.setSemiMajor(new SemiMajorAxisAccuracy(0));
		    accuracy_4.setSemiMinor(new SemiMinorAxisAccuracy(0));
		    accuracy_4.setOrientation(new SemiMajorAxisOrientation(0));
		}
		coreData_3.setTransmission(TransmissionState.neutral);
		coreData_3.setSpeed(new Speed(0));
		coreData_3.setHeading(new Heading(0));
		coreData_3.setAngle(new SteeringWheelAngle(-126));
		coreData_3.setAccelSet(new AccelerationSet4Way());
		{
		    AccelerationSet4Way accelSet_4 = coreData_3.getAccelSet();
		    accelSet_4.set_long(new Acceleration(-2000));
		    accelSet_4.setLat(new Acceleration(-2000));
		    accelSet_4.setVert(new VerticalAcceleration(127));
		    accelSet_4.setYaw(new YawRate(32767));
		}
		coreData_3.setBrakes(new BrakeSystemStatus());
		{
		    BrakeSystemStatus brakes_4 = coreData_3.getBrakes();
		    brakes_4.setWheelBrakes(new BrakeAppliedStatus(new byte[]
		    {
			(byte)0xC0
		    },
		    2));
		    brakes_4.setTraction(TractionControlStatus.unavailable);
		    brakes_4.setAbs(AntiLockBrakeStatus.unavailable);
		    brakes_4.setScs(StabilityControlStatus.unavailable);
		    brakes_4.setBrakeBoost(BrakeBoostApplied.unavailable);
		    brakes_4.setAuxBrakes(AuxiliaryBrakeStatus.unavailable);
		}
		coreData_3.setSize(new VehicleSize());
		{
		    VehicleSize size_4 = coreData_3.getSize();
		    size_4.setWidth(new VehicleWidth(0));
		    size_4.setLength(new VehicleLength(0));
		}
	    }
	    basicSafetyMessage_2.setPartII(new BasicSafetyMessage.PartII());
	    {
		BasicSafetyMessage.PartII partII_3 = basicSafetyMessage_2.getPartII();
		{
		    BasicSafetyMessage.PartII.Sequence_ element_3 = new BasicSafetyMessage.PartII.Sequence_();
		    element_3.setPartII_Id(new PartII_Id(0));
		    element_3.setPartII_Value(new OpenType(
		    new VehicleSafetyExtensions()));
		    {
			VehicleSafetyExtensions vehicleSafetyExtensions_5 = (VehicleSafetyExtensions)(element_3.getPartII_Value().getDecodedValue());
			vehicleSafetyExtensions_5.setEvents(new VehicleEventFlags(new byte[]
			{
			    (byte)0xC0
			},
			2));
			vehicleSafetyExtensions_5.setPathHistory(new PathHistory());
			{
			    PathHistory pathHistory_6 = vehicleSafetyExtensions_5.getPathHistory();
			    pathHistory_6.setInitialPosition(new FullPositionVector());
			    {
				FullPositionVector initialPosition_7 = pathHistory_6.getInitialPosition();
				initialPosition_7.setUtcTime(new DDateTime());
				{
				    DDateTime utcTime_8 = initialPosition_7.getUtcTime();
				    utcTime_8.setYear(new DYear(0));
				    utcTime_8.setMonth(new DMonth(0));
				    utcTime_8.setDay(new DDay(0));
				    utcTime_8.setHour(new DHour(0));
				    utcTime_8.setMinute(new DMinute(0));
				    utcTime_8.setSecond(new DSecond(0));
				    utcTime_8.setOffset(new DOffset(840));
				}
				initialPosition_7.set_long(new Longitude(-1799999999));
				initialPosition_7.setLat(new Latitude(-900000000));
				initialPosition_7.setElevation(new Elevation(-4096));
				initialPosition_7.setHeading(new Heading(0));
				initialPosition_7.setSpeed(new TransmissionAndSpeed());
				{
				    TransmissionAndSpeed speed_8 = initialPosition_7.getSpeed();
				    speed_8.setTransmisson(TransmissionState.neutral);
				    speed_8.setSpeed(new Velocity(0));
				}
				initialPosition_7.setPosAccuracy(new PositionalAccuracy());
				{
				    PositionalAccuracy posAccuracy_8 = initialPosition_7.getPosAccuracy();
				    posAccuracy_8.setSemiMajor(new SemiMajorAxisAccuracy(0));
				    posAccuracy_8.setSemiMinor(new SemiMinorAxisAccuracy(0));
				    posAccuracy_8.setOrientation(new SemiMajorAxisOrientation(0));
				}
				initialPosition_7.setTimeConfidence(TimeConfidence.unavailable);
				initialPosition_7.setPosConfidence(new PositionConfidenceSet());
				{
				    PositionConfidenceSet posConfidence_8 = initialPosition_7.getPosConfidence();
				    posConfidence_8.setPos(PositionConfidence.unavailable);
				    posConfidence_8.setElevation(ElevationConfidence.unavailable);
				}
				initialPosition_7.setSpeedConfidence(new SpeedandHeadingandThrottleConfidence());
				{
				    SpeedandHeadingandThrottleConfidence speedConfidence_8 = initialPosition_7.getSpeedConfidence();
				    speedConfidence_8.setHeading(HeadingConfidence.unavailable);
				    speedConfidence_8.setSpeed(SpeedConfidence.unavailable);
				    speedConfidence_8.setThrottle(ThrottleConfidence.unavailable);
				}
			    }
			    pathHistory_6.setCurrGNSSstatus(new GNSSstatus(new byte[]
			    {
				(byte)0xC0
			    },
			    2));
			    pathHistory_6.setCrumbData(new PathHistoryPointList());
			    {
				PathHistoryPointList crumbData_7 = pathHistory_6.getCrumbData();
				{
				    PathHistoryPoint element_7 = new PathHistoryPoint();
				    element_7.setLatOffset(new OffsetLL_B18(131071));
				    element_7.setLonOffset(new OffsetLL_B18(131071));
				    element_7.setElevationOffset(new VertOffset_B12(2047));
				    element_7.setTimeOffset(new TimeOffset(1));
				    element_7.setSpeed(new Speed(0));
				    element_7.setPosAccuracy(new PositionalAccuracy());
				    {
					PositionalAccuracy posAccuracy_9 = element_7.getPosAccuracy();
					posAccuracy_9.setSemiMajor(new SemiMajorAxisAccuracy(0));
					posAccuracy_9.setSemiMinor(new SemiMinorAxisAccuracy(0));
					posAccuracy_9.setOrientation(new SemiMajorAxisOrientation(0));
				    }
				    element_7.setHeading(new CoarseHeading(0));
				    crumbData_7.add(element_7);
				}
				{
				    PathHistoryPoint element_7 = new PathHistoryPoint();
				    element_7.setLatOffset(new OffsetLL_B18(131071));
				    element_7.setLonOffset(new OffsetLL_B18(131071));
				    element_7.setElevationOffset(new VertOffset_B12(2047));
				    element_7.setTimeOffset(new TimeOffset(1));
				    element_7.setSpeed(new Speed(0));
				    element_7.setPosAccuracy(new PositionalAccuracy());
				    {
					PositionalAccuracy posAccuracy_9 = element_7.getPosAccuracy();
					posAccuracy_9.setSemiMajor(new SemiMajorAxisAccuracy(0));
					posAccuracy_9.setSemiMinor(new SemiMinorAxisAccuracy(0));
					posAccuracy_9.setOrientation(new SemiMajorAxisOrientation(0));
				    }
				    element_7.setHeading(new CoarseHeading(0));
				    crumbData_7.add(element_7);
				}
			    }
			}
			vehicleSafetyExtensions_5.setPathPrediction(new PathPrediction());
			{
			    PathPrediction pathPrediction_6 = vehicleSafetyExtensions_5.getPathPrediction();
			    pathPrediction_6.setRadiusOfCurve(new RadiusOfCurvature(32767));
			    pathPrediction_6.setConfidence(new Confidence(0));
			}
			vehicleSafetyExtensions_5.setLights(new ExteriorLights(new byte[]
			{
			    (byte)0xC0
			},
			2));
		    };
		    partII_3.add(element_3);
		}
		{
		    BasicSafetyMessage.PartII.Sequence_ element_3 = new BasicSafetyMessage.PartII.Sequence_();
		    element_3.setPartII_Id(new PartII_Id(0));
		    element_3.setPartII_Value(new OpenType(
		    new VehicleSafetyExtensions()));
		    {
			VehicleSafetyExtensions vehicleSafetyExtensions_5 = (VehicleSafetyExtensions)(element_3.getPartII_Value().getDecodedValue());
			vehicleSafetyExtensions_5.setEvents(new VehicleEventFlags(new byte[]
			{
			    (byte)0xC0
			},
			2));
			vehicleSafetyExtensions_5.setPathHistory(new PathHistory());
			{
			    PathHistory pathHistory_6 = vehicleSafetyExtensions_5.getPathHistory();
			    pathHistory_6.setInitialPosition(new FullPositionVector());
			    {
				FullPositionVector initialPosition_7 = pathHistory_6.getInitialPosition();
				initialPosition_7.setUtcTime(new DDateTime());
				{
				    DDateTime utcTime_8 = initialPosition_7.getUtcTime();
				    utcTime_8.setYear(new DYear(0));
				    utcTime_8.setMonth(new DMonth(0));
				    utcTime_8.setDay(new DDay(0));
				    utcTime_8.setHour(new DHour(0));
				    utcTime_8.setMinute(new DMinute(0));
				    utcTime_8.setSecond(new DSecond(0));
				    utcTime_8.setOffset(new DOffset(840));
				}
				initialPosition_7.set_long(new Longitude(-1799999999));
				initialPosition_7.setLat(new Latitude(-900000000));
				initialPosition_7.setElevation(new Elevation(-4096));
				initialPosition_7.setHeading(new Heading(0));
				initialPosition_7.setSpeed(new TransmissionAndSpeed());
				{
				    TransmissionAndSpeed speed_8 = initialPosition_7.getSpeed();
				    speed_8.setTransmisson(TransmissionState.neutral);
				    speed_8.setSpeed(new Velocity(0));
				}
				initialPosition_7.setPosAccuracy(new PositionalAccuracy());
				{
				    PositionalAccuracy posAccuracy_8 = initialPosition_7.getPosAccuracy();
				    posAccuracy_8.setSemiMajor(new SemiMajorAxisAccuracy(0));
				    posAccuracy_8.setSemiMinor(new SemiMinorAxisAccuracy(0));
				    posAccuracy_8.setOrientation(new SemiMajorAxisOrientation(0));
				}
				initialPosition_7.setTimeConfidence(TimeConfidence.unavailable);
				initialPosition_7.setPosConfidence(new PositionConfidenceSet());
				{
				    PositionConfidenceSet posConfidence_8 = initialPosition_7.getPosConfidence();
				    posConfidence_8.setPos(PositionConfidence.unavailable);
				    posConfidence_8.setElevation(ElevationConfidence.unavailable);
				}
				initialPosition_7.setSpeedConfidence(new SpeedandHeadingandThrottleConfidence());
				{
				    SpeedandHeadingandThrottleConfidence speedConfidence_8 = initialPosition_7.getSpeedConfidence();
				    speedConfidence_8.setHeading(HeadingConfidence.unavailable);
				    speedConfidence_8.setSpeed(SpeedConfidence.unavailable);
				    speedConfidence_8.setThrottle(ThrottleConfidence.unavailable);
				}
			    }
			    pathHistory_6.setCurrGNSSstatus(new GNSSstatus(new byte[]
			    {
				(byte)0xC0
			    },
			    2));
			    pathHistory_6.setCrumbData(new PathHistoryPointList());
			    {
				PathHistoryPointList crumbData_7 = pathHistory_6.getCrumbData();
				{
				    PathHistoryPoint element_7 = new PathHistoryPoint();
				    element_7.setLatOffset(new OffsetLL_B18(131071));
				    element_7.setLonOffset(new OffsetLL_B18(131071));
				    element_7.setElevationOffset(new VertOffset_B12(2047));
				    element_7.setTimeOffset(new TimeOffset(1));
				    element_7.setSpeed(new Speed(0));
				    element_7.setPosAccuracy(new PositionalAccuracy());
				    {
					PositionalAccuracy posAccuracy_9 = element_7.getPosAccuracy();
					posAccuracy_9.setSemiMajor(new SemiMajorAxisAccuracy(0));
					posAccuracy_9.setSemiMinor(new SemiMinorAxisAccuracy(0));
					posAccuracy_9.setOrientation(new SemiMajorAxisOrientation(0));
				    }
				    element_7.setHeading(new CoarseHeading(0));
				    crumbData_7.add(element_7);
				}
				{
				    PathHistoryPoint element_7 = new PathHistoryPoint();
				    element_7.setLatOffset(new OffsetLL_B18(131071));
				    element_7.setLonOffset(new OffsetLL_B18(131071));
				    element_7.setElevationOffset(new VertOffset_B12(2047));
				    element_7.setTimeOffset(new TimeOffset(1));
				    element_7.setSpeed(new Speed(0));
				    element_7.setPosAccuracy(new PositionalAccuracy());
				    {
					PositionalAccuracy posAccuracy_9 = element_7.getPosAccuracy();
					posAccuracy_9.setSemiMajor(new SemiMajorAxisAccuracy(0));
					posAccuracy_9.setSemiMinor(new SemiMinorAxisAccuracy(0));
					posAccuracy_9.setOrientation(new SemiMajorAxisOrientation(0));
				    }
				    element_7.setHeading(new CoarseHeading(0));
				    crumbData_7.add(element_7);
				}
			    }
			}
			vehicleSafetyExtensions_5.setPathPrediction(new PathPrediction());
			{
			    PathPrediction pathPrediction_6 = vehicleSafetyExtensions_5.getPathPrediction();
			    pathPrediction_6.setRadiusOfCurve(new RadiusOfCurvature(32767));
			    pathPrediction_6.setConfidence(new Confidence(0));
			}
			vehicleSafetyExtensions_5.setLights(new ExteriorLights(new byte[]
			{
			    (byte)0xC0
			},
			2));
		    };
		    partII_3.add(element_3);
		}
	    }
	    basicSafetyMessage_2.setRegional(new BasicSafetyMessage.Regional());
	    {
		BasicSafetyMessage.Regional regional_3 = basicSafetyMessage_2.getRegional();
		{
		    BasicSafetyMessage.Regional.Sequence_ element_3 = new BasicSafetyMessage.Regional.Sequence_();
		    element_3.setRegionId(new RegionId(0));
		    element_3.setRegExtValue(new OpenType(
		    new BasicSafetyMessage()));
		    {
			BasicSafetyMessage basicSafetyMessage_5 = (BasicSafetyMessage)(element_3.getRegExtValue().getDecodedValue());
			basicSafetyMessage_5.setCoreData(new BSMcoreData());
			{
			    BSMcoreData coreData_6 = basicSafetyMessage_5.getCoreData();
			    coreData_6.setMsgCnt(new MsgCount(0));
			    coreData_6.setId(new TemporaryID(new byte[]
			    {
				(byte)0x00, (byte)0x00, (byte)0x00, 
				(byte)0x00
			    }));
			    coreData_6.setSecMark(new DSecond(0));
			    coreData_6.setLat(new Latitude(-900000000));
			    coreData_6.set_long(new Longitude(-1799999999));
			    coreData_6.setElev(new Elevation(-4096));
			    coreData_6.setAccuracy(new PositionalAccuracy());
			    {
				PositionalAccuracy accuracy_7 = coreData_6.getAccuracy();
				accuracy_7.setSemiMajor(new SemiMajorAxisAccuracy(0));
				accuracy_7.setSemiMinor(new SemiMinorAxisAccuracy(0));
				accuracy_7.setOrientation(new SemiMajorAxisOrientation(0));
			    }
			    coreData_6.setTransmission(TransmissionState.neutral);
			    coreData_6.setSpeed(new Speed(0));
			    coreData_6.setHeading(new Heading(0));
			    coreData_6.setAngle(new SteeringWheelAngle(-126));
			    coreData_6.setAccelSet(new AccelerationSet4Way());
			    {
				AccelerationSet4Way accelSet_7 = coreData_6.getAccelSet();
				accelSet_7.set_long(new Acceleration(-2000));
				accelSet_7.setLat(new Acceleration(-2000));
				accelSet_7.setVert(new VerticalAcceleration(127));
				accelSet_7.setYaw(new YawRate(32767));
			    }
			    coreData_6.setBrakes(new BrakeSystemStatus());
			    {
				BrakeSystemStatus brakes_7 = coreData_6.getBrakes();
				brakes_7.setWheelBrakes(new BrakeAppliedStatus(new byte[]
				{
				    (byte)0xC0
				},
				2));
				brakes_7.setTraction(TractionControlStatus.unavailable);
				brakes_7.setAbs(AntiLockBrakeStatus.unavailable);
				brakes_7.setScs(StabilityControlStatus.unavailable);
				brakes_7.setBrakeBoost(BrakeBoostApplied.unavailable);
				brakes_7.setAuxBrakes(AuxiliaryBrakeStatus.unavailable);
			    }
			    coreData_6.setSize(new VehicleSize());
			    {
				VehicleSize size_7 = coreData_6.getSize();
				size_7.setWidth(new VehicleWidth(0));
				size_7.setLength(new VehicleLength(0));
			    }
			}
			basicSafetyMessage_5.setPartII(null);
			basicSafetyMessage_5.setRegional(null);
		    };
		    regional_3.add(element_3);
		}
		{
		    BasicSafetyMessage.Regional.Sequence_ element_3 = new BasicSafetyMessage.Regional.Sequence_();
		    element_3.setRegionId(new RegionId(0));
		    element_3.setRegExtValue(new OpenType(
		    new BasicSafetyMessage()));
		    {
			BasicSafetyMessage basicSafetyMessage_5 = (BasicSafetyMessage)(element_3.getRegExtValue().getDecodedValue());
			basicSafetyMessage_5.setCoreData(new BSMcoreData());
			{
			    BSMcoreData coreData_6 = basicSafetyMessage_5.getCoreData();
			    coreData_6.setMsgCnt(new MsgCount(0));
			    coreData_6.setId(new TemporaryID(new byte[]
			    {
				(byte)0x00, (byte)0x00, (byte)0x00, 
				(byte)0x00
			    }));
			    coreData_6.setSecMark(new DSecond(0));
			    coreData_6.setLat(new Latitude(-900000000));
			    coreData_6.set_long(new Longitude(-1799999999));
			    coreData_6.setElev(new Elevation(-4096));
			    coreData_6.setAccuracy(new PositionalAccuracy());
			    {
				PositionalAccuracy accuracy_7 = coreData_6.getAccuracy();
				accuracy_7.setSemiMajor(new SemiMajorAxisAccuracy(0));
				accuracy_7.setSemiMinor(new SemiMinorAxisAccuracy(0));
				accuracy_7.setOrientation(new SemiMajorAxisOrientation(0));
			    }
			    coreData_6.setTransmission(TransmissionState.neutral);
			    coreData_6.setSpeed(new Speed(0));
			    coreData_6.setHeading(new Heading(0));
			    coreData_6.setAngle(new SteeringWheelAngle(-126));
			    coreData_6.setAccelSet(new AccelerationSet4Way());
			    {
				AccelerationSet4Way accelSet_7 = coreData_6.getAccelSet();
				accelSet_7.set_long(new Acceleration(-2000));
				accelSet_7.setLat(new Acceleration(-2000));
				accelSet_7.setVert(new VerticalAcceleration(127));
				accelSet_7.setYaw(new YawRate(32767));
			    }
			    coreData_6.setBrakes(new BrakeSystemStatus());
			    {
				BrakeSystemStatus brakes_7 = coreData_6.getBrakes();
				brakes_7.setWheelBrakes(new BrakeAppliedStatus(new byte[]
				{
				    (byte)0xC0
				},
				2));
				brakes_7.setTraction(TractionControlStatus.unavailable);
				brakes_7.setAbs(AntiLockBrakeStatus.unavailable);
				brakes_7.setScs(StabilityControlStatus.unavailable);
				brakes_7.setBrakeBoost(BrakeBoostApplied.unavailable);
				brakes_7.setAuxBrakes(AuxiliaryBrakeStatus.unavailable);
			    }
			    coreData_6.setSize(new VehicleSize());
			    {
				VehicleSize size_7 = coreData_6.getSize();
				size_7.setWidth(new VehicleWidth(0));
				size_7.setLength(new VehicleLength(0));
			    }
			}
			basicSafetyMessage_5.setPartII(null);
			basicSafetyMessage_5.setRegional(null);
		    };
		    regional_3.add(element_3);
		}
	    }
	};
	return value;
    }
    
    public static void printValue(MessageFrame value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("messageId ");
	    s.print(value.getMessageId().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("value ");
	    s.print(value.getValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    
    public static int encodeDecodeAndPrint(MessageFrame value, int run)
    {
	Coder coder = j2735.J2735.getDefaultCoder();
	ByteArrayInputStream source;
	ByteArrayOutputStream sink;
	byte[] encoding = null;
	boolean passed = true;
	
	/* Print input value using AbstractData.toString() method*/
	System.out.println("\n--------------- Test run " + run + "---------------");
	System.out.println("\nEncoder input value:\n");
	System.out.print(value);
	
	/* Set coder properties */
	coder.enableEncoderDebugging();
	coder.enableDecoderDebugging();
	coder.enableEncoderConstraints();
	coder.enableDecoderConstraints();
	coder.enableAutomaticEncoding();
	coder.enableAutomaticDecoding();
	coder.enableContainedValueEncoding();
	coder.enableContainedValueDecoding();
	
	/* Encode the value */
	sink = new ByteArrayOutputStream();
	try {
	    System.out.print("\n\tTracing Information from Encoder...\n\n");
	    coder.encode(value, sink);
	    encoding = sink.toByteArray();
	    System.out.print("\nPDU successfully encoded, in " + encoding.length + " bytes:\n");
	    
	    if ((coder instanceof XERCoder)
		|| (coder instanceof CXERCoder)) {
		System.out.write(encoding, 0, encoding.length);
	    } else {
		HexTool.printHex(encoding);
	    }
	} catch(EncodeFailedException e) {
	    System.out.println("Encoding failed with return code = " + e.getReason());
	    System.out.print(e);
	    passed = false;
	} catch(EncodeNotSupportedException e) {
	    System.out.println("Encoding not supported for the value");
	    System.out.print(e);
	    passed = false;
	}
	
	if (!passed)
	    return 1;
	
	/* Decode the PDU that was just encoded */
	source = new ByteArrayInputStream(encoding);
	MessageFrame decoded = null;
	try {
	    System.out.print("\n\tTracing Information from Decoder...\n\n");
	    decoded = (MessageFrame)coder.decode(source, value);
	    System.out.print("\nPDU successfully decoded.\n");
	} catch (DecodeFailedException e) {
	    System.out.println("Decoding failed with return code = " + e.getReason());
	    System.out.print(e);
	    passed = false;
	} catch (DecodeNotSupportedException e) {
	    System.out.println("Decoding not supported for the value");
	    System.out.print(e);
	    passed = false;
	}
	
	if (!passed)
	    return 1;
	/* Print decoded value using sample printValue() method */
	System.out.print("\n\tDecoded PDU...\n\n");
	printValue(decoded, System.out);
	System.out.print("\n");
	
	return 0;
    }
    
    public static void main(String[] arg)
    {
	int run = 0;
	int failures = 0;
	
	failures += encodeDecodeAndPrint(createSampleValue(), ++run);
	newline(System.out, 0);
	
	if (failures > 0)
	    System.out.println(failures + " values failed.");
	else
	    System.out.println("All values encoded and decoded successfully.");
    }
    
}
