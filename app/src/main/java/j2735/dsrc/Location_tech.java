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
 * Define the Location-tech ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class Location_tech extends Enumerated implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    
    /**
     * The default constructor.
     */
    private Location_tech()
    {
	super(0);
    }
    
    private Location_tech(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long loc_tech_unknown = 0;
	public static final long loc_tech_GNSS = 1;
	public static final long loc_tech_DGPS = 2;
	public static final long loc_tech_RTK = 3;
	public static final long loc_tech_PPP = 4;
	public static final long loc_tech_drGPS = 5;
	public static final long loc_tech_drDGPS = 6;
	public static final long loc_tech_dr = 7;
	public static final long loc_tech_nav = 8;
	public static final long loc_tech_fault = 9;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static Location_tech cNamedNumbers[] = {
	new Location_tech(), 
	new Location_tech(1), 
	new Location_tech(2), 
	new Location_tech(3), 
	new Location_tech(4), 
	new Location_tech(5), 
	new Location_tech(6), 
	new Location_tech(7), 
	new Location_tech(8), 
	new Location_tech(9)
    };
    public static final Location_tech loc_tech_unknown = cNamedNumbers[0];
    public static final Location_tech loc_tech_GNSS = cNamedNumbers[1];
    public static final Location_tech loc_tech_DGPS = cNamedNumbers[2];
    public static final Location_tech loc_tech_RTK = cNamedNumbers[3];
    public static final Location_tech loc_tech_PPP = cNamedNumbers[4];
    public static final Location_tech loc_tech_drGPS = cNamedNumbers[5];
    public static final Location_tech loc_tech_drDGPS = cNamedNumbers[6];
    public static final Location_tech loc_tech_dr = cNamedNumbers[7];
    public static final Location_tech loc_tech_nav = cNamedNumbers[8];
    public static final Location_tech loc_tech_fault = cNamedNumbers[9];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"loc-tech-unknown",
	"loc-tech-GNSS",
	"loc-tech-DGPS",
	"loc-tech-RTK",
	"loc-tech-PPP",
	"loc-tech-drGPS",
	"loc-tech-drDGPS",
	"loc-tech-dr",
	"loc-tech-nav",
	"loc-tech-fault"
    };
    
    
    /**
     * Returns the array of enumerators (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    /**
     * Returns the name of this enumerator.
     */
    public String name()
    {
	int index = indexOf();
	return (index < 0 || index >= 10 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 9)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * Returns an enumerator with a specified value or null if the value
     * is not associated with any enumerators.
     *  @param value the value of the enumerator to return.
     *  @return an enumerator with a specified value.
     */
    
    public static Location_tech valueOf(long value)
    {
	int inx = indexOfValue(value);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Location_tech valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 10)
	    return null;
	
	return cNamedNumbers[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int indexOf()
    {
	if (isUnknownEnumerator())
	    return -1;
	return indexOfValue(mValue);
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
	    int idx0;
	    boolean extroot0 = true;
	    int nbits = 0;

	    if (this.isUnknownEnumerator()) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx0 = this.indexOf();
		if (idx0 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + this.mValue);
		extroot0 = idx0 < 10;
	    }
	    sink.writeBit(!extroot0); ++nbits;
	    if (extroot0)
		nbits += coder.encodeConstrainedWholeNumber(idx0, 0, 9, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx0 - 10, sink);
	    return nbits;
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "Location-tech");
	    throw ee;
	}
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
	    int idx0;
	    Location_tech temp0;
	    boolean extroot0 = !source.readBit();

	    if (extroot0) {
		idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 9);
		if (idx0 < 0 || idx0 > 9)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx0);
		temp0 = Location_tech.valueAt(idx0);
	    } else {
		idx0 = 10 + (int)coder.decodeNormallySmallNumber(source);
		if (idx0 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx0);
		temp0 = Location_tech.unknownEnumerator();
	    }
	    return temp0;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "Location-tech");
	    throw de;
	}
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
	    if (this.isUnknownEnumerator()) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else 
		sink.writeString(this.name());

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "Location-tech");
	    throw ee;
	}
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
	    String content0 = coder.decodeString(source);
	    int idx0;
	    Location_tech temp0;

	    idx0 = coder.resolveName(Location_tech.cConstantNameList, content0);
	    if (idx0 < 0 )
		temp0 = Location_tech.unknownEnumerator();
	    else
		temp0 = Location_tech.cNamedNumbers[idx0];
	    return temp0;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "Location-tech");
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
	printer.print(this, writer, this.cConstantNameList);
    }

    /**
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "Location-tech";
    }

    /**
     * Clone 'this' object.
     */
    public Location_tech clone() {
	return (Location_tech)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final Location_tech cUnknownEnumerator = 
	new Location_tech(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static Location_tech unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public Location_tech getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return Location_tech.loc_tech_unknown;
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
    
} // End class definition for Location_tech
