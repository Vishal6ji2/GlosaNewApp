
/* THIS SAMPLE PROGRAM IS PROVIDED AS IS. THE SAMPLE PROGRAM AND ANY RESULTS
 * OBTAINED FROM IT ARE PROVIDED WITHOUT ANY WARRANTIES OR REPRESENTATIONS,
 * EXPRESS, IMPLIED OR STATUTORY. */

package com.example.glosanewapp.j2735.samples.dsrc;

import com.example.glosanewapp.j2735.J2735;
import com.example.glosanewapp.j2735.dsrc.Elevation;
import com.example.glosanewapp.j2735.dsrc.VertOffset_B07;
import com.example.glosanewapp.j2735.dsrc.VertOffset_B08;
import com.example.glosanewapp.j2735.dsrc.VertOffset_B09;
import com.example.glosanewapp.j2735.dsrc.VertOffset_B10;
import com.example.glosanewapp.j2735.dsrc.VertOffset_B11;
import com.example.glosanewapp.j2735.dsrc.VertOffset_B12;
import com.example.glosanewapp.j2735.dsrc.VerticalOffset;
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
 * Define sample code for the VerticalOffset ASN.1 type included in the DSRC ASN.1 module.
 * @see VerticalOffset
 */

public class VerticalOffsetSample extends SampleUtil {

    /**
     * The default constructor. The class is not instantiable.
     */
    private VerticalOffsetSample() {}

    /**
     * Create Sample Value.
     */
    public static VerticalOffset createSampleValue()
    {
	VerticalOffset value = VerticalOffset.createVerticalOffsetWithOffset1(new VertOffset_B07(63));
	return value;
    }
    
    public static void printValue(VerticalOffset value, PrintStream s)
    {
	
	switch (value.getChosenFlag()) {
	case VerticalOffset.offset1_chosen:
	    s.print("offset1 : ");
	    s.print(((VertOffset_B07)value.getChosenValue()).longValue());
	    break;
	case VerticalOffset.offset2_chosen:
	    s.print("offset2 : ");
	    s.print(((VertOffset_B08)value.getChosenValue()).longValue());
	    break;
	case VerticalOffset.offset3_chosen:
	    s.print("offset3 : ");
	    s.print(((VertOffset_B09)value.getChosenValue()).longValue());
	    break;
	case VerticalOffset.offset4_chosen:
	    s.print("offset4 : ");
	    s.print(((VertOffset_B10)value.getChosenValue()).longValue());
	    break;
	case VerticalOffset.offset5_chosen:
	    s.print("offset5 : ");
	    s.print(((VertOffset_B11)value.getChosenValue()).longValue());
	    break;
	case VerticalOffset.offset6_chosen:
	    s.print("offset6 : ");
	    s.print(((VertOffset_B12)value.getChosenValue()).longValue());
	    break;
	case VerticalOffset.elevation_chosen:
	    s.print("elevation : ");
	    s.print(((Elevation)value.getChosenValue()).longValue());
	    break;
	case VerticalOffset.regional_chosen:
	    s.print("regional : ");
	    printValue(((VerticalOffset.Regional)value.getChosenValue()), s);
	    break;
	default:
	    s.print("<unknown choice>");
	}
    }
    public static void printValue(VerticalOffset.Regional value, PrintStream s)
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
    
    public static int encodeDecodeAndPrint(VerticalOffset value, int run)
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
	VerticalOffset decoded = null;
	try {
	    System.out.print("\n\tTracing Information from Decoder...\n\n");
	    decoded = (VerticalOffset)coder.decode(source, value);
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
