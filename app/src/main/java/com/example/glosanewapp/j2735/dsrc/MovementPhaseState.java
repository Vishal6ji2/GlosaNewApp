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


package com.example.glosanewapp.j2735.dsrc;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the MovementPhaseState ASN.1 type included in the DSRC ASN.1 module.
 * @see Enumerated
 */

public final class MovementPhaseState extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MovementPhaseState()
    {
	super(0);
    }
    
    private MovementPhaseState(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long unavailable = 0;
	public static final long dark = 1;
	public static final long stop_Then_Proceed = 2;
	public static final long stop_And_Remain = 3;
	public static final long pre_Movement = 4;
	public static final long permissive_Movement_Allowed = 5;
	public static final long protected_Movement_Allowed = 6;
	public static final long permissive_clearance = 7;
	public static final long protected_clearance = 8;
	public static final long caution_Conflicting_Traffic = 9;
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static MovementPhaseState cNamedNumbers[] = {
	new MovementPhaseState(), 
	new MovementPhaseState(1), 
	new MovementPhaseState(2), 
	new MovementPhaseState(3), 
	new MovementPhaseState(4), 
	new MovementPhaseState(5), 
	new MovementPhaseState(6), 
	new MovementPhaseState(7), 
	new MovementPhaseState(8), 
	new MovementPhaseState(9)
    };
    public static final MovementPhaseState unavailable = cNamedNumbers[0];
    public static final MovementPhaseState dark = cNamedNumbers[1];
    public static final MovementPhaseState stop_Then_Proceed = cNamedNumbers[2];
    public static final MovementPhaseState stop_And_Remain = cNamedNumbers[3];
    public static final MovementPhaseState pre_Movement = cNamedNumbers[4];
    public static final MovementPhaseState permissive_Movement_Allowed = cNamedNumbers[5];
    public static final MovementPhaseState protected_Movement_Allowed = cNamedNumbers[6];
    public static final MovementPhaseState permissive_clearance = cNamedNumbers[7];
    public static final MovementPhaseState protected_clearance = cNamedNumbers[8];
    public static final MovementPhaseState caution_Conflicting_Traffic = cNamedNumbers[9];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"unavailable",
	"dark",
	"stop-Then-Proceed",
	"stop-And-Remain",
	"pre-Movement",
	"permissive-Movement-Allowed",
	"protected-Movement-Allowed",
	"permissive-clearance",
	"protected-clearance",
	"caution-Conflicting-Traffic"
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
    
    public static MovementPhaseState valueOf(long value)
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
    public static MovementPhaseState valueAt(int index)
    {
	if (index < 0 || index >= 10)
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
    public MovementPhaseState clone() {
	return (MovementPhaseState)super.clone();
    }

} // End class definition for MovementPhaseState
