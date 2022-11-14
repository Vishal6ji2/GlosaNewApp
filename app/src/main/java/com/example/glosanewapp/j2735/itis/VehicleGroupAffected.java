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


package com.example.glosanewapp.j2735.itis;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the VehicleGroupAffected ASN.1 type included in the ITIS ASN.1 module.
 * @see Enumerated
 */

public final class VehicleGroupAffected extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleGroupAffected()
    {
	super(9217);
    }
    
    private VehicleGroupAffected(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long all_vehicles = 9217;
	public static final long bicycles = 9218;
	public static final long motorcycles = 9219;
	public static final long cars = 9220;
	public static final long light_vehicles = 9221;
	public static final long cars_and_light_vehicles = 9222;
	public static final long cars_with_trailers = 9223;
	public static final long cars_with_recreational_trailers = 9224;
	public static final long vehicles_with_trailers = 9225;
	public static final long heavy_vehicles = 9226;
	public static final long trucks = 9227;
	public static final long buses = 9228;
	public static final long articulated_buses = 9229;
	public static final long school_buses = 9230;
	public static final long vehicles_with_semi_trailers = 9231;
	public static final long vehicles_with_double_trailers = 9232;
	public static final long high_profile_vehicles = 9233;
	public static final long wide_vehicles = 9234;
	public static final long long_vehicles = 9235;
	public static final long hazardous_loads = 9236;
	public static final long exceptional_loads = 9237;
	public static final long abnormal_loads = 9238;
	public static final long convoys = 9239;
	public static final long maintenance_vehicles = 9240;
	public static final long delivery_vehicles = 9241;
	public static final long vehicles_with_even_numbered_license_plates = 9242;
	public static final long vehicles_with_odd_numbered_license_plates = 9243;
	public static final long vehicles_with_parking_permits = 9244;
	public static final long vehicles_with_catalytic_converters = 9245;
	public static final long vehicles_without_catalytic_converters = 9246;
	public static final long gas_powered_vehicles = 9247;
	public static final long diesel_powered_vehicles = 9248;
	public static final long lPG_vehicles = 9249;
	public static final long military_convoys = 9250;
	public static final long military_vehicles = 9251;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static VehicleGroupAffected cNamedNumbers[] = {
	new VehicleGroupAffected(), 
	new VehicleGroupAffected(9218), 
	new VehicleGroupAffected(9219), 
	new VehicleGroupAffected(9220), 
	new VehicleGroupAffected(9221), 
	new VehicleGroupAffected(9222), 
	new VehicleGroupAffected(9223), 
	new VehicleGroupAffected(9224), 
	new VehicleGroupAffected(9225), 
	new VehicleGroupAffected(9226), 
	new VehicleGroupAffected(9227), 
	new VehicleGroupAffected(9228), 
	new VehicleGroupAffected(9229), 
	new VehicleGroupAffected(9230), 
	new VehicleGroupAffected(9231), 
	new VehicleGroupAffected(9232), 
	new VehicleGroupAffected(9233), 
	new VehicleGroupAffected(9234), 
	new VehicleGroupAffected(9235), 
	new VehicleGroupAffected(9236), 
	new VehicleGroupAffected(9237), 
	new VehicleGroupAffected(9238), 
	new VehicleGroupAffected(9239), 
	new VehicleGroupAffected(9240), 
	new VehicleGroupAffected(9241), 
	new VehicleGroupAffected(9242), 
	new VehicleGroupAffected(9243), 
	new VehicleGroupAffected(9244), 
	new VehicleGroupAffected(9245), 
	new VehicleGroupAffected(9246), 
	new VehicleGroupAffected(9247), 
	new VehicleGroupAffected(9248), 
	new VehicleGroupAffected(9249), 
	new VehicleGroupAffected(9250), 
	new VehicleGroupAffected(9251)
    };
    public static final VehicleGroupAffected all_vehicles = cNamedNumbers[0];
    public static final VehicleGroupAffected bicycles = cNamedNumbers[1];
    public static final VehicleGroupAffected motorcycles = cNamedNumbers[2];
    public static final VehicleGroupAffected cars = cNamedNumbers[3];
    public static final VehicleGroupAffected light_vehicles = cNamedNumbers[4];
    public static final VehicleGroupAffected cars_and_light_vehicles = cNamedNumbers[5];
    public static final VehicleGroupAffected cars_with_trailers = cNamedNumbers[6];
    public static final VehicleGroupAffected cars_with_recreational_trailers = cNamedNumbers[7];
    public static final VehicleGroupAffected vehicles_with_trailers = cNamedNumbers[8];
    public static final VehicleGroupAffected heavy_vehicles = cNamedNumbers[9];
    public static final VehicleGroupAffected trucks = cNamedNumbers[10];
    public static final VehicleGroupAffected buses = cNamedNumbers[11];
    public static final VehicleGroupAffected articulated_buses = cNamedNumbers[12];
    public static final VehicleGroupAffected school_buses = cNamedNumbers[13];
    public static final VehicleGroupAffected vehicles_with_semi_trailers = cNamedNumbers[14];
    public static final VehicleGroupAffected vehicles_with_double_trailers = cNamedNumbers[15];
    public static final VehicleGroupAffected high_profile_vehicles = cNamedNumbers[16];
    public static final VehicleGroupAffected wide_vehicles = cNamedNumbers[17];
    public static final VehicleGroupAffected long_vehicles = cNamedNumbers[18];
    public static final VehicleGroupAffected hazardous_loads = cNamedNumbers[19];
    public static final VehicleGroupAffected exceptional_loads = cNamedNumbers[20];
    public static final VehicleGroupAffected abnormal_loads = cNamedNumbers[21];
    public static final VehicleGroupAffected convoys = cNamedNumbers[22];
    public static final VehicleGroupAffected maintenance_vehicles = cNamedNumbers[23];
    public static final VehicleGroupAffected delivery_vehicles = cNamedNumbers[24];
    public static final VehicleGroupAffected vehicles_with_even_numbered_license_plates = cNamedNumbers[25];
    public static final VehicleGroupAffected vehicles_with_odd_numbered_license_plates = cNamedNumbers[26];
    public static final VehicleGroupAffected vehicles_with_parking_permits = cNamedNumbers[27];
    public static final VehicleGroupAffected vehicles_with_catalytic_converters = cNamedNumbers[28];
    public static final VehicleGroupAffected vehicles_without_catalytic_converters = cNamedNumbers[29];
    public static final VehicleGroupAffected gas_powered_vehicles = cNamedNumbers[30];
    public static final VehicleGroupAffected diesel_powered_vehicles = cNamedNumbers[31];
    public static final VehicleGroupAffected lPG_vehicles = cNamedNumbers[32];
    public static final VehicleGroupAffected military_convoys = cNamedNumbers[33];
    public static final VehicleGroupAffected military_vehicles = cNamedNumbers[34];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"all-vehicles",
	"bicycles",
	"motorcycles",
	"cars",
	"light-vehicles",
	"cars-and-light-vehicles",
	"cars-with-trailers",
	"cars-with-recreational-trailers",
	"vehicles-with-trailers",
	"heavy-vehicles",
	"trucks",
	"buses",
	"articulated-buses",
	"school-buses",
	"vehicles-with-semi-trailers",
	"vehicles-with-double-trailers",
	"high-profile-vehicles",
	"wide-vehicles",
	"long-vehicles",
	"hazardous-loads",
	"exceptional-loads",
	"abnormal-loads",
	"convoys",
	"maintenance-vehicles",
	"delivery-vehicles",
	"vehicles-with-even-numbered-license-plates",
	"vehicles-with-odd-numbered-license-plates",
	"vehicles-with-parking-permits",
	"vehicles-with-catalytic-converters",
	"vehicles-without-catalytic-converters",
	"gas-powered-vehicles",
	"diesel-powered-vehicles",
	"lPG-vehicles",
	"military-convoys",
	"military-vehicles"
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
	return (index < 0 || index >= 35 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	if (value >= 9217 && value <= 9251)
	    return (int)(value - 9217);
	else
	    return -1;
    }
    
    /**
     * Returns an enumerator with a specified value or null if the value
     * is not associated with any enumerators.
     *  @param value the value of the enumerator to return.
     *  @return an enumerator with a specified value.
     */
    
    public static VehicleGroupAffected valueOf(long value)
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
    public static VehicleGroupAffected valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 35)
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
    public VehicleGroupAffected clone() {
	return (VehicleGroupAffected)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final VehicleGroupAffected cUnknownEnumerator = 
	new VehicleGroupAffected(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static VehicleGroupAffected unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleGroupAffected getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for VehicleGroupAffected
