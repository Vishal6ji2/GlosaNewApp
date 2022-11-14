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
 * Define the IncidentResponseEquipment ASN.1 type included in the ITIS ASN.1 module.
 * @see Enumerated
 */

public final class IncidentResponseEquipment extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IncidentResponseEquipment()
    {
	super(9985);
    }
    
    private IncidentResponseEquipment(long value)
    {
	super(value);
    }
    
    /**
      An inner class that contains numeric values for ASN.1 ENUMERATED type.
      The values can be used in switch/case statements.
    */
    public static final class Value {
	public static final long ground_fire_suppression = 9985;
	public static final long heavy_ground_equipment = 9986;
	public static final long aircraft = 9988;
	public static final long marine_equipment = 9989;
	public static final long support_equipment = 9990;
	public static final long medical_rescue_unit = 9991;
	public static final long other = 9993;
	public static final long ground_fire_suppression_other = 9994;
	public static final long engine = 9995;
	public static final long truck_or_aerial = 9996;
	public static final long quint = 9997;
	public static final long tanker_pumper_combination = 9998;
	public static final long brush_truck = 10000;
	public static final long aircraft_rescue_firefighting = 10001;
	public static final long heavy_ground_equipment_other = 10004;
	public static final long dozer_or_plow = 10005;
	public static final long tractor = 10006;
	public static final long tanker_or_tender = 10008;
	public static final long aircraft_other = 10024;
	public static final long aircraft_fixed_wing_tanker = 10025;
	public static final long helitanker = 10026;
	public static final long helicopter = 10027;
	public static final long marine_equipment_other = 10034;
	public static final long fire_boat_with_pump = 10035;
	public static final long boat_no_pump = 10036;
	public static final long support_apparatus_other = 10044;
	public static final long breathing_apparatus_support = 10045;
	public static final long light_and_air_unit = 10046;
	public static final long medical_rescue_unit_other = 10054;
	public static final long rescue_unit = 10055;
	public static final long urban_search_rescue_unit = 10056;
	public static final long high_angle_rescue = 10057;
	public static final long crash_fire_rescue = 10058;
	public static final long bLS_unit = 10059;
	public static final long aLS_unit = 10060;
	public static final long mobile_command_post = 10075;
	public static final long chief_officer_car = 10076;
	public static final long hAZMAT_unit = 10077;
	public static final long type_i_hand_crew = 10078;
	public static final long type_ii_hand_crew = 10079;
	public static final long privately_owned_vehicle = 10083;
	public static final long other_apparatus_resource = 10084;
	public static final long ambulance = 10085;
	public static final long bomb_squad_van = 10086;
	public static final long combine_harvester = 10087;
	public static final long construction_vehicle = 10088;
	public static final long farm_tractor = 10089;
	public static final long grass_cutting_machines = 10090;
	public static final long hAZMAT_containment_tow = 10091;
	public static final long heavy_tow = 10092;
	public static final long hedge_cutting_machines = 10093;
	public static final long light_tow = 10094;
	public static final long mobile_crane = 10095;
	public static final long refuse_collection_vehicle = 10096;
	public static final long resurfacing_vehicle = 10097;
	public static final long road_sweeper = 10098;
	public static final long roadside_litter_collection_crews = 10099;
	public static final long salvage_vehicle = 10100;
	public static final long sand_truck = 10101;
	public static final long snowplow = 10102;
	public static final long steam_roller = 10103;
	public static final long swat_team_van = 10104;
	public static final long track_laying_vehicle = 10105;
	public static final long unknown_vehicle = 10106;
	public static final long white_lining_vehicle = 10107;
	public static final long dump_truck = 10108;
	public static final long supervisor_vehicle = 10109;
	public static final long snow_blower = 10110;
	public static final long rotary_snow_blower = 10111;
	public static final long road_grader = 10112;
	public static final long steam_truck = 10113;
	public static final long flatbed_tow = 10114;
	
    }
    // Named list definitions.
    
    /**
     * List of enumerators (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static IncidentResponseEquipment cNamedNumbers[] = {
	new IncidentResponseEquipment(), 
	new IncidentResponseEquipment(9986), 
	new IncidentResponseEquipment(9988), 
	new IncidentResponseEquipment(9989), 
	new IncidentResponseEquipment(9990), 
	new IncidentResponseEquipment(9991), 
	new IncidentResponseEquipment(9993), 
	new IncidentResponseEquipment(9994), 
	new IncidentResponseEquipment(9995), 
	new IncidentResponseEquipment(9996), 
	new IncidentResponseEquipment(9997), 
	new IncidentResponseEquipment(9998), 
	new IncidentResponseEquipment(10000), 
	new IncidentResponseEquipment(10001), 
	new IncidentResponseEquipment(10004), 
	new IncidentResponseEquipment(10005), 
	new IncidentResponseEquipment(10006), 
	new IncidentResponseEquipment(10008), 
	new IncidentResponseEquipment(10024), 
	new IncidentResponseEquipment(10025), 
	new IncidentResponseEquipment(10026), 
	new IncidentResponseEquipment(10027), 
	new IncidentResponseEquipment(10034), 
	new IncidentResponseEquipment(10035), 
	new IncidentResponseEquipment(10036), 
	new IncidentResponseEquipment(10044), 
	new IncidentResponseEquipment(10045), 
	new IncidentResponseEquipment(10046), 
	new IncidentResponseEquipment(10054), 
	new IncidentResponseEquipment(10055), 
	new IncidentResponseEquipment(10056), 
	new IncidentResponseEquipment(10057), 
	new IncidentResponseEquipment(10058), 
	new IncidentResponseEquipment(10059), 
	new IncidentResponseEquipment(10060), 
	new IncidentResponseEquipment(10075), 
	new IncidentResponseEquipment(10076), 
	new IncidentResponseEquipment(10077), 
	new IncidentResponseEquipment(10078), 
	new IncidentResponseEquipment(10079), 
	new IncidentResponseEquipment(10083), 
	new IncidentResponseEquipment(10084), 
	new IncidentResponseEquipment(10085), 
	new IncidentResponseEquipment(10086), 
	new IncidentResponseEquipment(10087), 
	new IncidentResponseEquipment(10088), 
	new IncidentResponseEquipment(10089), 
	new IncidentResponseEquipment(10090), 
	new IncidentResponseEquipment(10091), 
	new IncidentResponseEquipment(10092), 
	new IncidentResponseEquipment(10093), 
	new IncidentResponseEquipment(10094), 
	new IncidentResponseEquipment(10095), 
	new IncidentResponseEquipment(10096), 
	new IncidentResponseEquipment(10097), 
	new IncidentResponseEquipment(10098), 
	new IncidentResponseEquipment(10099), 
	new IncidentResponseEquipment(10100), 
	new IncidentResponseEquipment(10101), 
	new IncidentResponseEquipment(10102), 
	new IncidentResponseEquipment(10103), 
	new IncidentResponseEquipment(10104), 
	new IncidentResponseEquipment(10105), 
	new IncidentResponseEquipment(10106), 
	new IncidentResponseEquipment(10107), 
	new IncidentResponseEquipment(10108), 
	new IncidentResponseEquipment(10109), 
	new IncidentResponseEquipment(10110), 
	new IncidentResponseEquipment(10111), 
	new IncidentResponseEquipment(10112), 
	new IncidentResponseEquipment(10113), 
	new IncidentResponseEquipment(10114)
    };
    public static final IncidentResponseEquipment ground_fire_suppression = cNamedNumbers[0];
    public static final IncidentResponseEquipment heavy_ground_equipment = cNamedNumbers[1];
    public static final IncidentResponseEquipment aircraft = cNamedNumbers[2];
    public static final IncidentResponseEquipment marine_equipment = cNamedNumbers[3];
    public static final IncidentResponseEquipment support_equipment = cNamedNumbers[4];
    public static final IncidentResponseEquipment medical_rescue_unit = cNamedNumbers[5];
    public static final IncidentResponseEquipment other = cNamedNumbers[6];
    public static final IncidentResponseEquipment ground_fire_suppression_other = cNamedNumbers[7];
    public static final IncidentResponseEquipment engine = cNamedNumbers[8];
    public static final IncidentResponseEquipment truck_or_aerial = cNamedNumbers[9];
    public static final IncidentResponseEquipment quint = cNamedNumbers[10];
    public static final IncidentResponseEquipment tanker_pumper_combination = cNamedNumbers[11];
    public static final IncidentResponseEquipment brush_truck = cNamedNumbers[12];
    public static final IncidentResponseEquipment aircraft_rescue_firefighting = cNamedNumbers[13];
    public static final IncidentResponseEquipment heavy_ground_equipment_other = cNamedNumbers[14];
    public static final IncidentResponseEquipment dozer_or_plow = cNamedNumbers[15];
    public static final IncidentResponseEquipment tractor = cNamedNumbers[16];
    public static final IncidentResponseEquipment tanker_or_tender = cNamedNumbers[17];
    public static final IncidentResponseEquipment aircraft_other = cNamedNumbers[18];
    public static final IncidentResponseEquipment aircraft_fixed_wing_tanker = cNamedNumbers[19];
    public static final IncidentResponseEquipment helitanker = cNamedNumbers[20];
    public static final IncidentResponseEquipment helicopter = cNamedNumbers[21];
    public static final IncidentResponseEquipment marine_equipment_other = cNamedNumbers[22];
    public static final IncidentResponseEquipment fire_boat_with_pump = cNamedNumbers[23];
    public static final IncidentResponseEquipment boat_no_pump = cNamedNumbers[24];
    public static final IncidentResponseEquipment support_apparatus_other = cNamedNumbers[25];
    public static final IncidentResponseEquipment breathing_apparatus_support = cNamedNumbers[26];
    public static final IncidentResponseEquipment light_and_air_unit = cNamedNumbers[27];
    public static final IncidentResponseEquipment medical_rescue_unit_other = cNamedNumbers[28];
    public static final IncidentResponseEquipment rescue_unit = cNamedNumbers[29];
    public static final IncidentResponseEquipment urban_search_rescue_unit = cNamedNumbers[30];
    public static final IncidentResponseEquipment high_angle_rescue = cNamedNumbers[31];
    public static final IncidentResponseEquipment crash_fire_rescue = cNamedNumbers[32];
    public static final IncidentResponseEquipment bLS_unit = cNamedNumbers[33];
    public static final IncidentResponseEquipment aLS_unit = cNamedNumbers[34];
    public static final IncidentResponseEquipment mobile_command_post = cNamedNumbers[35];
    public static final IncidentResponseEquipment chief_officer_car = cNamedNumbers[36];
    public static final IncidentResponseEquipment hAZMAT_unit = cNamedNumbers[37];
    public static final IncidentResponseEquipment type_i_hand_crew = cNamedNumbers[38];
    public static final IncidentResponseEquipment type_ii_hand_crew = cNamedNumbers[39];
    public static final IncidentResponseEquipment privately_owned_vehicle = cNamedNumbers[40];
    public static final IncidentResponseEquipment other_apparatus_resource = cNamedNumbers[41];
    public static final IncidentResponseEquipment ambulance = cNamedNumbers[42];
    public static final IncidentResponseEquipment bomb_squad_van = cNamedNumbers[43];
    public static final IncidentResponseEquipment combine_harvester = cNamedNumbers[44];
    public static final IncidentResponseEquipment construction_vehicle = cNamedNumbers[45];
    public static final IncidentResponseEquipment farm_tractor = cNamedNumbers[46];
    public static final IncidentResponseEquipment grass_cutting_machines = cNamedNumbers[47];
    public static final IncidentResponseEquipment hAZMAT_containment_tow = cNamedNumbers[48];
    public static final IncidentResponseEquipment heavy_tow = cNamedNumbers[49];
    public static final IncidentResponseEquipment hedge_cutting_machines = cNamedNumbers[50];
    public static final IncidentResponseEquipment light_tow = cNamedNumbers[51];
    public static final IncidentResponseEquipment mobile_crane = cNamedNumbers[52];
    public static final IncidentResponseEquipment refuse_collection_vehicle = cNamedNumbers[53];
    public static final IncidentResponseEquipment resurfacing_vehicle = cNamedNumbers[54];
    public static final IncidentResponseEquipment road_sweeper = cNamedNumbers[55];
    public static final IncidentResponseEquipment roadside_litter_collection_crews = cNamedNumbers[56];
    public static final IncidentResponseEquipment salvage_vehicle = cNamedNumbers[57];
    public static final IncidentResponseEquipment sand_truck = cNamedNumbers[58];
    public static final IncidentResponseEquipment snowplow = cNamedNumbers[59];
    public static final IncidentResponseEquipment steam_roller = cNamedNumbers[60];
    public static final IncidentResponseEquipment swat_team_van = cNamedNumbers[61];
    public static final IncidentResponseEquipment track_laying_vehicle = cNamedNumbers[62];
    public static final IncidentResponseEquipment unknown_vehicle = cNamedNumbers[63];
    public static final IncidentResponseEquipment white_lining_vehicle = cNamedNumbers[64];
    public static final IncidentResponseEquipment dump_truck = cNamedNumbers[65];
    public static final IncidentResponseEquipment supervisor_vehicle = cNamedNumbers[66];
    public static final IncidentResponseEquipment snow_blower = cNamedNumbers[67];
    public static final IncidentResponseEquipment rotary_snow_blower = cNamedNumbers[68];
    public static final IncidentResponseEquipment road_grader = cNamedNumbers[69];
    public static final IncidentResponseEquipment steam_truck = cNamedNumbers[70];
    public static final IncidentResponseEquipment flatbed_tow = cNamedNumbers[71];
    
    /**
     * Constant name list definition (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public final static String cConstantNameList[] = {
	"ground-fire-suppression",
	"heavy-ground-equipment",
	"aircraft",
	"marine-equipment",
	"support-equipment",
	"medical-rescue-unit",
	"other",
	"ground-fire-suppression-other",
	"engine",
	"truck-or-aerial",
	"quint",
	"tanker-pumper-combination",
	"brush-truck",
	"aircraft-rescue-firefighting",
	"heavy-ground-equipment-other",
	"dozer-or-plow",
	"tractor",
	"tanker-or-tender",
	"aircraft-other",
	"aircraft-fixed-wing-tanker",
	"helitanker",
	"helicopter",
	"marine-equipment-other",
	"fire-boat-with-pump",
	"boat-no-pump",
	"support-apparatus-other",
	"breathing-apparatus-support",
	"light-and-air-unit",
	"medical-rescue-unit-other",
	"rescue-unit",
	"urban-search-rescue-unit",
	"high-angle-rescue",
	"crash-fire-rescue",
	"bLS-unit",
	"aLS-unit",
	"mobile-command-post",
	"chief-officer-car",
	"hAZMAT-unit",
	"type-i-hand-crew",
	"type-ii-hand-crew",
	"privately-owned-vehicle",
	"other-apparatus-resource",
	"ambulance",
	"bomb-squad-van",
	"combine-harvester",
	"construction-vehicle",
	"farm-tractor",
	"grass-cutting-machines",
	"hAZMAT-containment-tow",
	"heavy-tow",
	"hedge-cutting-machines",
	"light-tow",
	"mobile-crane",
	"refuse-collection-vehicle",
	"resurfacing-vehicle",
	"road-sweeper",
	"roadside-litter-collection-crews",
	"salvage-vehicle",
	"sand-truck",
	"snowplow",
	"steam-roller",
	"swat-team-van",
	"track-laying-vehicle",
	"unknown-vehicle",
	"white-lining-vehicle",
	"dump-truck",
	"supervisor-vehicle",
	"snow-blower",
	"rotary-snow-blower",
	"road-grader",
	"steam-truck",
	"flatbed-tow"
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
	return (index < 0 || index >= 72 || cConstantNameList == null) ? null : cConstantNameList[index];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int indexOfValue(long value)
    {
	return indexOfValue(value, cNamedNumbers, 0, 72);
    }
    
    /**
     * Returns an enumerator with a specified value or null if the value
     * is not associated with any enumerators.
     *  @param value the value of the enumerator to return.
     *  @return an enumerator with a specified value.
     */
    
    public static IncidentResponseEquipment valueOf(long value)
    {
	int inx = indexOfValue(value, cNamedNumbers, 0, 72);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static IncidentResponseEquipment valueAt(int index)
    {
	if (index < 0)
	    throw new IndexOutOfBoundsException();
	else if (index >= 72)
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
	return indexOfValue(mValue, cNamedNumbers, 0, 72);
    }
    
    /**
     * Clone 'this' object.
     */
    public IncidentResponseEquipment clone() {
	return (IncidentResponseEquipment)super.clone();
    }

    /**
     * Methods for "unknownEnumerator"
     */
    private static final IncidentResponseEquipment cUnknownEnumerator = 
	new IncidentResponseEquipment(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static IncidentResponseEquipment unknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public IncidentResponseEquipment getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for IncidentResponseEquipment
