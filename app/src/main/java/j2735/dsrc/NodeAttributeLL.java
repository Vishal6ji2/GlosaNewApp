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
 * Define the NodeAttributeLL ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class NodeAttributeLL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private NodeAttributeLL()
    {
	super(0);
    }
    
    private NodeAttributeLL(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long reserved = 0;
	public static final long stopLine = 1;
	public static final long roundedCapStyleA = 2;
	public static final long roundedCapStyleB = 3;
	public static final long mergePoint = 4;
	public static final long divergePoint = 5;
	public static final long downstreamStopLine = 6;
	public static final long downstreamStartNode = 7;
	public static final long closedToTraffic = 8;
	public static final long safeIsland = 9;
	public static final long curbPresentAtStepOff = 10;
	public static final long hydrantPresent = 11;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static NodeAttributeLL cNamedNumbers[] = {
	new NodeAttributeLL(), 
	new NodeAttributeLL(1), 
	new NodeAttributeLL(2), 
	new NodeAttributeLL(3), 
	new NodeAttributeLL(4), 
	new NodeAttributeLL(5), 
	new NodeAttributeLL(6), 
	new NodeAttributeLL(7), 
	new NodeAttributeLL(8), 
	new NodeAttributeLL(9), 
	new NodeAttributeLL(10), 
	new NodeAttributeLL(11)
    };
    public static final NodeAttributeLL reserved = cNamedNumbers[0];
    public static final NodeAttributeLL stopLine = cNamedNumbers[1];
    public static final NodeAttributeLL roundedCapStyleA = cNamedNumbers[2];
    public static final NodeAttributeLL roundedCapStyleB = cNamedNumbers[3];
    public static final NodeAttributeLL mergePoint = cNamedNumbers[4];
    public static final NodeAttributeLL divergePoint = cNamedNumbers[5];
    public static final NodeAttributeLL downstreamStopLine = cNamedNumbers[6];
    public static final NodeAttributeLL downstreamStartNode = cNamedNumbers[7];
    public static final NodeAttributeLL closedToTraffic = cNamedNumbers[8];
    public static final NodeAttributeLL safeIsland = cNamedNumbers[9];
    public static final NodeAttributeLL curbPresentAtStepOff = cNamedNumbers[10];
    public static final NodeAttributeLL hydrantPresent = cNamedNumbers[11];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"reserved",
	"stopLine",
	"roundedCapStyleA",
	"roundedCapStyleB",
	"mergePoint",
	"divergePoint",
	"downstreamStopLine",
	"downstreamStartNode",
	"closedToTraffic",
	"safeIsland",
	"curbPresentAtStepOff",
	"hydrantPresent"
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
	return (index < 0 || index >= 12 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 11)
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
    
    public static NodeAttributeLL valueOf(long value)
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
    public static NodeAttributeLL valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 12)
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
    public NodeAttributeLL clone() {
	return (NodeAttributeLL)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final NodeAttributeLL cUnknownEnumerator = 
	new NodeAttributeLL(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static NodeAttributeLL unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public NodeAttributeLL getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for NodeAttributeLL
