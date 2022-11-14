	
/* THIS SAMPLE PROGRAM IS PROVIDED AS IS. THE SAMPLE PROGRAM AND ANY RESULTS
 * OBTAINED FROM IT ARE PROVIDED WITHOUT ANY WARRANTIES OR REPRESENTATIONS,
 * EXPRESS, IMPLIED OR STATUTORY. */

package com.example.glosanewapp.util;


import j2735.J2735;
import j2735.dsrc.AccelerationSet4Way;
import j2735.dsrc.AnimalPropelledType;
import j2735.dsrc.DDateTime;
import j2735.dsrc.DSecond;
import j2735.dsrc.FullPositionVector;
import j2735.dsrc.Heading;
import j2735.dsrc.HumanPropelledType;
import j2735.dsrc.Latitude;
import j2735.dsrc.Longitude;
import j2735.dsrc.MotorizedPropelledType;
import j2735.dsrc.MsgCount;
import j2735.dsrc.PathHistory;
import j2735.dsrc.PathHistoryPoint;
import j2735.dsrc.PathHistoryPointList;
import j2735.dsrc.PathPrediction;
import j2735.dsrc.PersonalDeviceUserType;
import j2735.dsrc.PersonalSafetyMessage;
import j2735.dsrc.Position3D;
import j2735.dsrc.PositionConfidenceSet;
import j2735.dsrc.PositionalAccuracy;
import j2735.dsrc.PropelledInformation;
import j2735.dsrc.SemiMajorAxisAccuracy;
import j2735.dsrc.SemiMajorAxisOrientation;
import j2735.dsrc.SemiMinorAxisAccuracy;
import j2735.dsrc.SpeedandHeadingandThrottleConfidence;
import j2735.dsrc.TemporaryID;
import j2735.dsrc.TransmissionAndSpeed;
import j2735.dsrc.Velocity;
import com.oss.asn1.CXERCoder;
import com.oss.asn1.Coder;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.XERCoder;
import com.oss.util.HexTool;
import com.oss.util.SampleUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Define sample code for the PersonalSafetyMessage ASN.1 type included in the DSRC ASN.1 module.
 * @see PersonalSafetyMessage
 */

public class PersonalSafetyMessageSample extends SampleUtil {

    /**
     * The default constructor. The class is not instantiable.
     */
    private PersonalSafetyMessageSample() {}

    /**
     * Create samplevalue_PersonalSafetyMessage_uper Value.
     */
    public static PersonalSafetyMessage create_samplevalue_PersonalSafetyMessage_uper_Value()
    {
	PersonalSafetyMessage samplevalue_PersonalSafetyMessage_uper_value = new PersonalSafetyMessage();
	samplevalue_PersonalSafetyMessage_uper_value.setBasicType(PersonalDeviceUserType.unavailable);
	samplevalue_PersonalSafetyMessage_uper_value.setSecMark(new DSecond(0));
	samplevalue_PersonalSafetyMessage_uper_value.setMsgCnt(new MsgCount(0));
	samplevalue_PersonalSafetyMessage_uper_value.setId(new TemporaryID(new byte[]
	{
	    (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00
	}));
	samplevalue_PersonalSafetyMessage_uper_value.setPosition(new Position3D());
	{
	    Position3D position_2 = samplevalue_PersonalSafetyMessage_uper_value.getPosition();
	    position_2.setLat(new Latitude(-900000000));
	    position_2.set_long(new Longitude(-1799999999));
	    position_2.setElevation(null);
	    position_2.setRegional(null);
	}
	samplevalue_PersonalSafetyMessage_uper_value.setAccuracy(new PositionalAccuracy());
	{
	    PositionalAccuracy accuracy_2 = samplevalue_PersonalSafetyMessage_uper_value.getAccuracy();
	    accuracy_2.setSemiMajor(new SemiMajorAxisAccuracy(0));
	    accuracy_2.setSemiMinor(new SemiMinorAxisAccuracy(0));
	    accuracy_2.setOrientation(new SemiMajorAxisOrientation(0));
	}
	samplevalue_PersonalSafetyMessage_uper_value.setSpeed(new Velocity(0));
	samplevalue_PersonalSafetyMessage_uper_value.setHeading(new Heading(0));
	samplevalue_PersonalSafetyMessage_uper_value.setAccelSet(null);
	samplevalue_PersonalSafetyMessage_uper_value.setPathHistory(null);
	samplevalue_PersonalSafetyMessage_uper_value.setPathPrediction(null);
	samplevalue_PersonalSafetyMessage_uper_value.setPropulsion(null);
	samplevalue_PersonalSafetyMessage_uper_value.setUseState(null);
	samplevalue_PersonalSafetyMessage_uper_value.setCrossRequest(null);
	samplevalue_PersonalSafetyMessage_uper_value.setCrossState(null);
	samplevalue_PersonalSafetyMessage_uper_value.setClusterSize(null);
	samplevalue_PersonalSafetyMessage_uper_value.setClusterRadius(null);
	samplevalue_PersonalSafetyMessage_uper_value.setEventResponderType(null);
	samplevalue_PersonalSafetyMessage_uper_value.setActivityType(null);
	samplevalue_PersonalSafetyMessage_uper_value.setActivitySubType(null);
	samplevalue_PersonalSafetyMessage_uper_value.setAssistType(null);
	samplevalue_PersonalSafetyMessage_uper_value.setSizing(null);
	samplevalue_PersonalSafetyMessage_uper_value.setAttachment(null);
	samplevalue_PersonalSafetyMessage_uper_value.setAttachmentRadius(null);
	samplevalue_PersonalSafetyMessage_uper_value.setAnimalType(null);
	samplevalue_PersonalSafetyMessage_uper_value.setRegional(null);
	return samplevalue_PersonalSafetyMessage_uper_value;
    }
    
    public static void printValue(PersonalSafetyMessage value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("basicType ");
	    s.print(value.getBasicType().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("secMark ");
	    s.print(value.getSecMark().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("msgCnt ");
	    s.print(value.getMsgCnt().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("id ");
	    s.print(value.getId());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("position ");
	    printValue(value.getPosition(), s);
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("accuracy ");
	    printValue(value.getAccuracy(), s);
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("speed ");
	    s.print(value.getSpeed().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("heading ");
	    s.print(value.getHeading().longValue());
	    if (value.hasAccelSet()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("accelSet ");
		printValue(value.getAccelSet(), s);
	    }
	    if (value.hasPathHistory()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("pathHistory ");
		printValue(value.getPathHistory(), s);
	    }
	    if (value.hasPathPrediction()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("pathPrediction ");
		printValue(value.getPathPrediction(), s);
	    }
	    if (value.hasPropulsion()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("propulsion ");
		printValue(value.getPropulsion(), s);
	    }
	    if (value.hasUseState()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("useState ");
		s.print(value.getUseState());
	    }
	    if (value.hasCrossRequest()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("crossRequest ");
		s.print(value.getCrossRequest().booleanValue());
	    }
	    if (value.hasCrossState()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("crossState ");
		s.print(value.getCrossState().booleanValue());
	    }
	    if (value.hasClusterSize()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("clusterSize ");
		s.print(value.getClusterSize().longValue());
	    }
	    if (value.hasClusterRadius()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("clusterRadius ");
		s.print(value.getClusterRadius().longValue());
	    }
	    if (value.hasEventResponderType()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("eventResponderType ");
		s.print(value.getEventResponderType().longValue());
	    }
	    if (value.hasActivityType()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("activityType ");
		s.print(value.getActivityType());
	    }
	    if (value.hasActivitySubType()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("activitySubType ");
		s.print(value.getActivitySubType());
	    }
	    if (value.hasAssistType()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("assistType ");
		s.print(value.getAssistType());
	    }
	    if (value.hasSizing()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("sizing ");
		s.print(value.getSizing());
	    }
	    if (value.hasAttachment()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("attachment ");
		s.print(value.getAttachment().longValue());
	    }
	    if (value.hasAttachmentRadius()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("attachmentRadius ");
		s.print(value.getAttachmentRadius().longValue());
	    }
	    if (value.hasAnimalType()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("animalType ");
		s.print(value.getAnimalType().longValue());
	    }
	    if (value.hasRegional()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("regional ");
		printValue(value.getRegional(), s);
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(Position3D value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("lat ");
	    s.print(value.getLat().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("long ");
	    s.print(value.get_long().longValue());
	    if (value.hasElevation()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("elevation ");
		s.print(value.getElevation().longValue());
	    }
	    if (value.hasRegional()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("regional ");
		printValue(value.getRegional(), s);
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(PositionalAccuracy value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("semiMajor ");
	    s.print(value.getSemiMajor().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("semiMinor ");
	    s.print(value.getSemiMinor().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("orientation ");
	    s.print(value.getOrientation().longValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(AccelerationSet4Way value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("long ");
	    s.print(value.get_long().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("lat ");
	    s.print(value.getLat().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("vert ");
	    s.print(value.getVert().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("yaw ");
	    s.print(value.getYaw().longValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(PathHistory value, PrintStream s)
    {
	{boolean _comma = false;

	    s.print("{");
	    ++indentlevel;
	    if (value.hasInitialPosition()) {
		newline(s, indentlevel);
		s.print("initialPosition ");
		printValue(value.getInitialPosition(), s);
		_comma = true;
	    }
	    if (value.hasCurrGNSSstatus()) {
		if (_comma) s.print(",");
		newline(s, indentlevel);
		s.print("currGNSSstatus ");
		s.print(value.getCurrGNSSstatus());
		_comma = true;
	    }
	    if (_comma) s.print(",");
	    newline(s, indentlevel);
	    s.print("crumbData ");
	    printValue(value.getCrumbData(), s);
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(PathPrediction value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("radiusOfCurve ");
	    s.print(value.getRadiusOfCurve().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("confidence ");
	    s.print(value.getConfidence().longValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(PropelledInformation value, PrintStream s)
    {
	
	switch (value.getChosenFlag()) {
	case PropelledInformation.human_chosen:
	    s.print("human : ");
	    s.print(((HumanPropelledType)value.getChosenValue()).longValue());
	    break;
	case PropelledInformation.animal_chosen:
	    s.print("animal : ");
	    s.print(((AnimalPropelledType)value.getChosenValue()).longValue());
	    break;
	case PropelledInformation.motor_chosen:
	    s.print("motor : ");
	    s.print(((MotorizedPropelledType)value.getChosenValue()).longValue());
	    break;
	default:
	    s.print("<unknown choice>");
	}
    }
    public static void printValue(PersonalSafetyMessage.Regional value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    for (int _index = 0; _index < value.getSize(); _index++) {
		newline(s, indentlevel);
		printValue(value.get(_index), s);
		if (_index + 1 < value.getSize())
		    s.print(",");
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(Position3D.Regional value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    for (int _index = 0; _index < value.getSize(); _index++) {
		newline(s, indentlevel);
		printValue(value.get(_index), s);
		if (_index + 1 < value.getSize())
		    s.print(",");
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(FullPositionVector value, PrintStream s)
    {
	{boolean _comma = false;

	    s.print("{");
	    ++indentlevel;
	    if (value.hasUtcTime()) {
		newline(s, indentlevel);
		s.print("utcTime ");
		printValue(value.getUtcTime(), s);
		_comma = true;
	    }
	    if (_comma) s.print(",");
	    newline(s, indentlevel);
	    s.print("long ");
	    s.print(value.get_long().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("lat ");
	    s.print(value.getLat().longValue());
	    if (value.hasElevation()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("elevation ");
		s.print(value.getElevation().longValue());
	    }
	    if (value.hasHeading()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("heading ");
		s.print(value.getHeading().longValue());
	    }
	    if (value.hasSpeed()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("speed ");
		printValue(value.getSpeed(), s);
	    }
	    if (value.hasPosAccuracy()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("posAccuracy ");
		printValue(value.getPosAccuracy(), s);
	    }
	    if (value.hasTimeConfidence()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("timeConfidence ");
		s.print(value.getTimeConfidence().longValue());
	    }
	    if (value.hasPosConfidence()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("posConfidence ");
		printValue(value.getPosConfidence(), s);
	    }
	    if (value.hasSpeedConfidence()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("speedConfidence ");
		printValue(value.getSpeedConfidence(), s);
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(PathHistoryPointList value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    for (int _index = 0; _index < value.getSize(); _index++) {
		newline(s, indentlevel);
		printValue(value.get(_index), s);
		if (_index + 1 < value.getSize())
		    s.print(",");
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(PersonalSafetyMessage.Regional.Sequence_ value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("regionId ");
	    s.print(value.getRegionId().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("regExtValue ");
	    s.print(value.getRegExtValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(Position3D.Regional.Sequence_ value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("regionId ");
	    s.print(value.getRegionId().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("regExtValue ");
	    s.print(value.getRegExtValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(DDateTime value, PrintStream s)
    {
	{boolean _comma = false;

	    s.print("{");
	    ++indentlevel;
	    if (value.hasYear()) {
		newline(s, indentlevel);
		s.print("year ");
		s.print(value.getYear().longValue());
		_comma = true;
	    }
	    if (value.hasMonth()) {
		if (_comma) s.print(",");
		newline(s, indentlevel);
		s.print("month ");
		s.print(value.getMonth().longValue());
		_comma = true;
	    }
	    if (value.hasDay()) {
		if (_comma) s.print(",");
		newline(s, indentlevel);
		s.print("day ");
		s.print(value.getDay().longValue());
		_comma = true;
	    }
	    if (value.hasHour()) {
		if (_comma) s.print(",");
		newline(s, indentlevel);
		s.print("hour ");
		s.print(value.getHour().longValue());
		_comma = true;
	    }
	    if (value.hasMinute()) {
		if (_comma) s.print(",");
		newline(s, indentlevel);
		s.print("minute ");
		s.print(value.getMinute().longValue());
		_comma = true;
	    }
	    if (value.hasSecond()) {
		if (_comma) s.print(",");
		newline(s, indentlevel);
		s.print("second ");
		s.print(value.getSecond().longValue());
		_comma = true;
	    }
	    if (value.hasOffset()) {
		if (_comma) s.print(",");
		newline(s, indentlevel);
		s.print("offset ");
		s.print(value.getOffset().longValue());
		_comma = true;
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(TransmissionAndSpeed value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("transmisson ");
	    s.print(value.getTransmisson().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("speed ");
	    s.print(value.getSpeed().longValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(PositionConfidenceSet value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("pos ");
	    s.print(value.getPos().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("elevation ");
	    s.print(value.getElevation().longValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(SpeedandHeadingandThrottleConfidence value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("heading ");
	    s.print(value.getHeading().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("speed ");
	    s.print(value.getSpeed().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("throttle ");
	    s.print(value.getThrottle().longValue());
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    public static void printValue(PathHistoryPoint value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("latOffset ");
	    s.print(value.getLatOffset().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("lonOffset ");
	    s.print(value.getLonOffset().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("elevationOffset ");
	    s.print(value.getElevationOffset().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("timeOffset ");
	    s.print(value.getTimeOffset().longValue());
	    if (value.hasSpeed()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("speed ");
		s.print(value.getSpeed().longValue());
	    }
	    if (value.hasPosAccuracy()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("posAccuracy ");
		printValue(value.getPosAccuracy(), s);
	    }
	    if (value.hasHeading()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("heading ");
		s.print(value.getHeading().longValue());
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }


    
    public static int encodeDecodeAndPrint(PersonalSafetyMessage value, int run)
    {
	Coder coder = J2735.getDefaultCoder();
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
	PersonalSafetyMessage decoded = null;
	try {
	    System.out.print("\n\tTracing Information from Decoder...\n\n");
	    decoded = (PersonalSafetyMessage)coder.decode(source, value);
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
	
	failures += encodeDecodeAndPrint(create_samplevalue_PersonalSafetyMessage_uper_Value(), ++run);
	newline(System.out, 0);
	
	if (failures > 0)
	    System.out.println(failures + " values failed.");
	else
	    System.out.println("All values encoded and decoded successfully.");
    }
    
}
