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
 * Define the BasicVehicleRole ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class BasicVehicleRole extends Enumerated {
    
    /**
     * The default constructor.
     */
    private BasicVehicleRole()
    {
	super(0);
    }
    
    private BasicVehicleRole(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long basicVehicle = 0;
	public static final long publicTransport = 1;
	public static final long specialTransport = 2;
	public static final long dangerousGoods = 3;
	public static final long roadWork = 4;
	public static final long roadRescue = 5;
	public static final long emergency = 6;
	public static final long safetyCar = 7;
	public static final long none_unknown = 8;
	public static final long truck = 9;
	public static final long motorcycle = 10;
	public static final long roadSideSource = 11;
	public static final long police = 12;
	public static final long fire = 13;
	public static final long ambulance = 14;
	public static final long dot = 15;
	public static final long transit = 16;
	public static final long slowMoving = 17;
	public static final long stopNgo = 18;
	public static final long cyclist = 19;
	public static final long pedestrian = 20;
	public static final long nonMotorized = 21;
	public static final long military = 22;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static BasicVehicleRole cNamedNumbers[] = {
	new BasicVehicleRole(), 
	new BasicVehicleRole(1), 
	new BasicVehicleRole(2), 
	new BasicVehicleRole(3), 
	new BasicVehicleRole(4), 
	new BasicVehicleRole(5), 
	new BasicVehicleRole(6), 
	new BasicVehicleRole(7), 
	new BasicVehicleRole(8), 
	new BasicVehicleRole(9), 
	new BasicVehicleRole(10), 
	new BasicVehicleRole(11), 
	new BasicVehicleRole(12), 
	new BasicVehicleRole(13), 
	new BasicVehicleRole(14), 
	new BasicVehicleRole(15), 
	new BasicVehicleRole(16), 
	new BasicVehicleRole(17), 
	new BasicVehicleRole(18), 
	new BasicVehicleRole(19), 
	new BasicVehicleRole(20), 
	new BasicVehicleRole(21), 
	new BasicVehicleRole(22)
    };
    public static final BasicVehicleRole basicVehicle = cNamedNumbers[0];
    public static final BasicVehicleRole publicTransport = cNamedNumbers[1];
    public static final BasicVehicleRole specialTransport = cNamedNumbers[2];
    public static final BasicVehicleRole dangerousGoods = cNamedNumbers[3];
    public static final BasicVehicleRole roadWork = cNamedNumbers[4];
    public static final BasicVehicleRole roadRescue = cNamedNumbers[5];
    public static final BasicVehicleRole emergency = cNamedNumbers[6];
    public static final BasicVehicleRole safetyCar = cNamedNumbers[7];
    public static final BasicVehicleRole none_unknown = cNamedNumbers[8];
    public static final BasicVehicleRole truck = cNamedNumbers[9];
    public static final BasicVehicleRole motorcycle = cNamedNumbers[10];
    public static final BasicVehicleRole roadSideSource = cNamedNumbers[11];
    public static final BasicVehicleRole police = cNamedNumbers[12];
    public static final BasicVehicleRole fire = cNamedNumbers[13];
    public static final BasicVehicleRole ambulance = cNamedNumbers[14];
    public static final BasicVehicleRole dot = cNamedNumbers[15];
    public static final BasicVehicleRole transit = cNamedNumbers[16];
    public static final BasicVehicleRole slowMoving = cNamedNumbers[17];
    public static final BasicVehicleRole stopNgo = cNamedNumbers[18];
    public static final BasicVehicleRole cyclist = cNamedNumbers[19];
    public static final BasicVehicleRole pedestrian = cNamedNumbers[20];
    public static final BasicVehicleRole nonMotorized = cNamedNumbers[21];
    public static final BasicVehicleRole military = cNamedNumbers[22];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"basicVehicle",
	"publicTransport",
	"specialTransport",
	"dangerousGoods",
	"roadWork",
	"roadRescue",
	"emergency",
	"safetyCar",
	"none-unknown",
	"truck",
	"motorcycle",
	"roadSideSource",
	"police",
	"fire",
	"ambulance",
	"dot",
	"transit",
	"slowMoving",
	"stopNgo",
	"cyclist",
	"pedestrian",
	"nonMotorized",
	"military"
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
	return (index < 0 || index >= 23 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 22)
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
    
    public static BasicVehicleRole valueOf(long value)
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
    public static BasicVehicleRole valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 23)
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
     * Clone 'this' object.
     */
    public BasicVehicleRole clone() {
	return (BasicVehicleRole)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final BasicVehicleRole cUnknownEnumerator = 
	new BasicVehicleRole(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static BasicVehicleRole unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public BasicVehicleRole getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for BasicVehicleRole
