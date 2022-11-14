
/* THIS SAMPLE PROGRAM IS PROVIDED AS IS. THE SAMPLE PROGRAM AND ANY RESULTS
 * OBTAINED FROM IT ARE PROVIDED WITHOUT ANY WARRANTIES OR REPRESENTATIONS,
 * EXPRESS, IMPLIED OR STATUTORY. */

package com.example.glosanewapp.util;


import j2735.J2735;
import j2735.dsrc.DDateTime;
import j2735.dsrc.FullPositionVector;
import j2735.dsrc.MsgCount;
import j2735.dsrc.PositionConfidenceSet;
import j2735.dsrc.PositionalAccuracy;
import j2735.dsrc.RoadSideAlert;
import j2735.dsrc.SpeedandHeadingandThrottleConfidence;
import j2735.dsrc.TransmissionAndSpeed;
import j2735.itis.ITIScodes;
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
 * Define sample code for the RoadSideAlert ASN.1 type included in the DSRC ASN.1 module.
 * @see RoadSideAlert
 */

public class RoadSideAlertSample extends SampleUtil {

    /**
     * The default constructor. The class is not instantiable.
     */
    private RoadSideAlertSample() {}

    /**
     * Create samplevalue_RoadSideAlert_uper Value.
     */
    public static RoadSideAlert create_samplevalue_RoadSideAlert_uper_Value()
    {
	RoadSideAlert samplevalue_RoadSideAlert_uper_value = new RoadSideAlert();
	samplevalue_RoadSideAlert_uper_value.setMsgCnt(new MsgCount(27));
	samplevalue_RoadSideAlert_uper_value.setTimeStamp(null);
	samplevalue_RoadSideAlert_uper_value.setTypeEvent(new ITIScodes(9729));
	samplevalue_RoadSideAlert_uper_value.setDescription(null);
	samplevalue_RoadSideAlert_uper_value.setPriority(null);
	samplevalue_RoadSideAlert_uper_value.setHeading(null);
	samplevalue_RoadSideAlert_uper_value.setExtent(null);
	samplevalue_RoadSideAlert_uper_value.setPosition(null);
	samplevalue_RoadSideAlert_uper_value.setFurtherInfoID(null);
	samplevalue_RoadSideAlert_uper_value.setRegional(null);
	return samplevalue_RoadSideAlert_uper_value;
    }
    
    public static void printValue(RoadSideAlert value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("msgCnt ");
	    s.print(value.getMsgCnt().longValue());
	    if (value.hasTimeStamp()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("timeStamp ");
		s.print(value.getTimeStamp().longValue());
	    }
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("typeEvent ");
	    s.print(value.getTypeEvent().longValue());
	    if (value.hasDescription()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("description ");
		printValue(value.getDescription(), s);
	    }
	    if (value.hasPriority()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("priority ");
		s.print(value.getPriority());
	    }
	    if (value.hasHeading()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("heading ");
		s.print(value.getHeading());
	    }
	    if (value.hasExtent()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("extent ");
		s.print(value.getExtent().longValue());
	    }
	    if (value.hasPosition()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("position ");
		printValue(value.getPosition(), s);
	    }
	    if (value.hasFurtherInfoID()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("furtherInfoID ");
		s.print(value.getFurtherInfoID());
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
    public static void printValue(RoadSideAlert.Description value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    for (int _index = 0; _index < value.getSize(); _index++) {
		newline(s, indentlevel);
		s.print(value.get(_index).longValue());
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
    public static void printValue(RoadSideAlert.Regional value, PrintStream s)
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
    public static void printValue(RoadSideAlert.Regional.Sequence_ value, PrintStream s)
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
    
    public static int encodeDecodeAndPrint(RoadSideAlert value, int run)
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
	RoadSideAlert decoded = null;
	try {
	    System.out.print("\n\tTracing Information from Decoder...\n\n");
	    decoded = (RoadSideAlert)coder.decode(source, value);
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
	
	failures += encodeDecodeAndPrint(create_samplevalue_RoadSideAlert_uper_Value(), ++run);
	newline(System.out, 0);
	
	if (failures > 0)
	    System.out.println(failures + " values failed.");
	else
	    System.out.println("All values encoded and decoded successfully.");
    }
    
}
