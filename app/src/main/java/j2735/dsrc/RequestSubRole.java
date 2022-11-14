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
 * Define the RequestSubRole ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class RequestSubRole extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RequestSubRole()
    {
	super(0);
    }
    
    private RequestSubRole(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long requestSubRoleUnKnown = 0;
	public static final long requestSubRole1 = 1;
	public static final long requestSubRole2 = 2;
	public static final long requestSubRole3 = 3;
	public static final long requestSubRole4 = 4;
	public static final long requestSubRole5 = 5;
	public static final long requestSubRole6 = 6;
	public static final long requestSubRole7 = 7;
	public static final long requestSubRole8 = 8;
	public static final long requestSubRole9 = 9;
	public static final long requestSubRole10 = 10;
	public static final long requestSubRole11 = 11;
	public static final long requestSubRole12 = 12;
	public static final long requestSubRole13 = 13;
	public static final long requestSubRole14 = 14;
	public static final long requestSubRoleReserved = 15;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static RequestSubRole cNamedNumbers[] = {
	new RequestSubRole(), 
	new RequestSubRole(1), 
	new RequestSubRole(2), 
	new RequestSubRole(3), 
	new RequestSubRole(4), 
	new RequestSubRole(5), 
	new RequestSubRole(6), 
	new RequestSubRole(7), 
	new RequestSubRole(8), 
	new RequestSubRole(9), 
	new RequestSubRole(10), 
	new RequestSubRole(11), 
	new RequestSubRole(12), 
	new RequestSubRole(13), 
	new RequestSubRole(14), 
	new RequestSubRole(15)
    };
    public static final RequestSubRole requestSubRoleUnKnown = cNamedNumbers[0];
    public static final RequestSubRole requestSubRole1 = cNamedNumbers[1];
    public static final RequestSubRole requestSubRole2 = cNamedNumbers[2];
    public static final RequestSubRole requestSubRole3 = cNamedNumbers[3];
    public static final RequestSubRole requestSubRole4 = cNamedNumbers[4];
    public static final RequestSubRole requestSubRole5 = cNamedNumbers[5];
    public static final RequestSubRole requestSubRole6 = cNamedNumbers[6];
    public static final RequestSubRole requestSubRole7 = cNamedNumbers[7];
    public static final RequestSubRole requestSubRole8 = cNamedNumbers[8];
    public static final RequestSubRole requestSubRole9 = cNamedNumbers[9];
    public static final RequestSubRole requestSubRole10 = cNamedNumbers[10];
    public static final RequestSubRole requestSubRole11 = cNamedNumbers[11];
    public static final RequestSubRole requestSubRole12 = cNamedNumbers[12];
    public static final RequestSubRole requestSubRole13 = cNamedNumbers[13];
    public static final RequestSubRole requestSubRole14 = cNamedNumbers[14];
    public static final RequestSubRole requestSubRoleReserved = cNamedNumbers[15];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"requestSubRoleUnKnown",
	"requestSubRole1",
	"requestSubRole2",
	"requestSubRole3",
	"requestSubRole4",
	"requestSubRole5",
	"requestSubRole6",
	"requestSubRole7",
	"requestSubRole8",
	"requestSubRole9",
	"requestSubRole10",
	"requestSubRole11",
	"requestSubRole12",
	"requestSubRole13",
	"requestSubRole14",
	"requestSubRoleReserved"
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
	return (index < 0 || index >= 16 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 15)
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
    
    public static RequestSubRole valueOf(long value)
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
    public static RequestSubRole valueAt(int index)
    {
	if (index < 0 || index >= 16)
	    throw new IndexOutOfBoundsException();
	
	return cNamedNumbers[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int indexOf()
    {
	return indexOfValue(mValue);
    }
    
    /**
     * Clone 'this' object.
     */
    public RequestSubRole clone() {
	return (RequestSubRole)super.clone();
    }

} // End class definition for RequestSubRole
