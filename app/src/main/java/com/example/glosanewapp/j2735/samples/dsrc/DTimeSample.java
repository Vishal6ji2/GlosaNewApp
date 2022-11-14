
/* THIS SAMPLE PROGRAM IS PROVIDED AS IS. THE SAMPLE PROGRAM AND ANY RESULTS
 * OBTAINED FROM IT ARE PROVIDED WITHOUT ANY WARRANTIES OR REPRESENTATIONS,
 * EXPRESS, IMPLIED OR STATUTORY. */

package com.example.glosanewapp.j2735.samples.dsrc;

import com.example.glosanewapp.j2735.J2735;
import com.example.glosanewapp.j2735.dsrc.DHour;
import com.example.glosanewapp.j2735.dsrc.DMinute;
import com.example.glosanewapp.j2735.dsrc.DOffset;
import com.example.glosanewapp.j2735.dsrc.DSecond;
import com.example.glosanewapp.j2735.dsrc.DTime;
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
 * Define sample code for the DTime ASN.1 type included in the DSRC ASN.1 module.
 * @see DTime
 */

public class DTimeSample extends SampleUtil {

    /**
     * The default constructor. The class is not instantiable.
     */
    private DTimeSample() {}

    /**
     * Create Sample Value.
     */
    public static DTime createSampleValue()
    {
	DTime value = new DTime();
	value.setHour(new DHour(0));
	value.setMinute(new DMinute(0));
	value.setSecond(new DSecond(0));
	value.setOffset(new DOffset(840));
	return value;
    }
    
    public static void printValue(DTime value, PrintStream s)
    {
	{
	    s.print("{");
	    ++indentlevel;
	    newline(s, indentlevel);
	    s.print("hour ");
	    s.print(value.getHour().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("minute ");
	    s.print(value.getMinute().longValue());
	    s.print(",");
	    newline(s, indentlevel);
	    s.print("second ");
	    s.print(value.getSecond().longValue());
	    if (value.hasOffset()) {
		s.print(",");
		newline(s, indentlevel);
		s.print("offset ");
		s.print(value.getOffset().longValue());
	    }
	    newline(s, --indentlevel);
	    s.print("}");
	}
    }
    
    public static int encodeDecodeAndPrint(DTime value, int run)
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
	DTime decoded = null;
	try {
	    System.out.print("\n\tTracing Information from Decoder...\n\n");
	    decoded = (DTime)coder.decode(source, value);
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
