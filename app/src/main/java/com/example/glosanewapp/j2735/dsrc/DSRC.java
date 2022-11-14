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

/**
  Abstract class for the DSRC ASN.1 module.
  It contains statically initialized objects that represent ASN.1 values.
*/

public abstract class DSRC extends ASN1Module {

    
    
    // Information object sets
    public static final MESSAGE_ID_AND_TYPE[] _messageTypes = 
	new MESSAGE_ID_AND_TYPE[] {
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(20),
		BasicSafetyMessage._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(18),
		MapData._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(19),
		SPAT._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(21),
		CommonSafetyRequest._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(22),
		EmergencyVehicleAlert._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(23),
		IntersectionCollision._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(24),
		NMEAcorrections._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(25),
		ProbeDataManagement._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(26),
		ProbeVehicleData._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(27),
		RoadSideAlert._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(28),
		RTCMcorrections._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(29),
		SignalRequestMessage._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(30),
		SignalStatusMessage._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(31),
		TravelerInformation._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(32),
		PersonalSafetyMessage._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(240),
		TestMessage00._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(241),
		TestMessage01._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(242),
		TestMessage02._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(243),
		TestMessage03._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(244),
		TestMessage04._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(245),
		TestMessage05._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(246),
		TestMessage06._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(247),
		TestMessage07._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(248),
		TestMessage08._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(249),
		TestMessage09._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(250),
		TestMessage10._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(251),
		TestMessage11._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(252),
		TestMessage12._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(253),
		TestMessage13._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(254),
		TestMessage14._type
	    ),
	    new MESSAGE_ID_AND_TYPE (
		new DSRCmsgID(255),
		TestMessage15._type
	    )
	};
    public static MESSAGE_ID_AND_TYPE_OSET messageTypes = 
	new MESSAGE_ID_AND_TYPE_OSET (
	    _messageTypes,
	    1,
	    "DSRC",
	    "MessageTypes"
	);
    public static final PARTII_EXT_ID_AND_TYPE[] _bSMpartIIExtension = 
	new PARTII_EXT_ID_AND_TYPE[] {
	    new PARTII_EXT_ID_AND_TYPE (
		new PartII_Id(0),
		VehicleSafetyExtensions._type
	    ),
	    new PARTII_EXT_ID_AND_TYPE (
		new PartII_Id(1),
		SpecialVehicleExtensions._type
	    ),
	    new PARTII_EXT_ID_AND_TYPE (
		new PartII_Id(2),
		SupplementalVehicleExtensions._type
	    )
	};
    public static PARTII_EXT_ID_AND_TYPE_OSET bSMpartIIExtension = 
	new PARTII_EXT_ID_AND_TYPE_OSET (
	    _bSMpartIIExtension,
	    1,
	    "DSRC",
	    "BSMpartIIExtension"
	);
    
    // Value references
    public static final PartII_Id vehicleSafetyExt = 
	new PartII_Id(0);
    public static final PartII_Id specialVehicleExt = 
	new PartII_Id(1);
    public static final PartII_Id supplementalVehicleExt = 
	new PartII_Id(2);
    public static final BasicVehicleClass unknownVehicleClass = 
	new BasicVehicleClass(0);
    public static final BasicVehicleClass specialVehicleClass = 
	new BasicVehicleClass(1);
    public static final BasicVehicleClass passenger_Vehicle_TypeUnknown = 
	new BasicVehicleClass(10);
    public static final BasicVehicleClass passenger_Vehicle_TypeOther = 
	new BasicVehicleClass(11);
    public static final BasicVehicleClass lightTruck_Vehicle_TypeUnknown = 
	new BasicVehicleClass(20);
    public static final BasicVehicleClass lightTruck_Vehicle_TypeOther = 
	new BasicVehicleClass(21);
    public static final BasicVehicleClass truck_Vehicle_TypeUnknown = 
	new BasicVehicleClass(25);
    public static final BasicVehicleClass truck_Vehicle_TypeOther = 
	new BasicVehicleClass(26);
    public static final BasicVehicleClass truck_axleCnt2 = 
	new BasicVehicleClass(27);
    public static final BasicVehicleClass truck_axleCnt3 = 
	new BasicVehicleClass(28);
    public static final BasicVehicleClass truck_axleCnt4 = 
	new BasicVehicleClass(29);
    public static final BasicVehicleClass truck_axleCnt4Trailer = 
	new BasicVehicleClass(30);
    public static final BasicVehicleClass truck_axleCnt5Trailer = 
	new BasicVehicleClass(31);
    public static final BasicVehicleClass truck_axleCnt6Trailer = 
	new BasicVehicleClass(32);
    public static final BasicVehicleClass truck_axleCnt5MultiTrailer = 
	new BasicVehicleClass(33);
    public static final BasicVehicleClass truck_axleCnt6MultiTrailer = 
	new BasicVehicleClass(34);
    public static final BasicVehicleClass truck_axleCnt7MultiTrailer = 
	new BasicVehicleClass(35);
    public static final BasicVehicleClass motorcycle_TypeUnknown = 
	new BasicVehicleClass(40);
    public static final BasicVehicleClass motorcycle_TypeOther = 
	new BasicVehicleClass(41);
    public static final BasicVehicleClass motorcycle_Cruiser_Standard = 
	new BasicVehicleClass(42);
    public static final BasicVehicleClass motorcycle_SportUnclad = 
	new BasicVehicleClass(43);
    public static final BasicVehicleClass motorcycle_SportTouring = 
	new BasicVehicleClass(44);
    public static final BasicVehicleClass motorcycle_SuperSport = 
	new BasicVehicleClass(45);
    public static final BasicVehicleClass motorcycle_Touring = 
	new BasicVehicleClass(46);
    public static final BasicVehicleClass motorcycle_Trike = 
	new BasicVehicleClass(47);
    public static final BasicVehicleClass motorcycle_wPassengers = 
	new BasicVehicleClass(48);
    public static final BasicVehicleClass transit_TypeUnknown = 
	new BasicVehicleClass(50);
    public static final BasicVehicleClass transit_TypeOther = 
	new BasicVehicleClass(51);
    public static final BasicVehicleClass transit_BRT = 
	new BasicVehicleClass(52);
    public static final BasicVehicleClass transit_ExpressBus = 
	new BasicVehicleClass(53);
    public static final BasicVehicleClass transit_LocalBus = 
	new BasicVehicleClass(54);
    public static final BasicVehicleClass transit_SchoolBus = 
	new BasicVehicleClass(55);
    public static final BasicVehicleClass transit_FixedGuideway = 
	new BasicVehicleClass(56);
    public static final BasicVehicleClass transit_Paratransit = 
	new BasicVehicleClass(57);
    public static final BasicVehicleClass transit_Paratransit_Ambulance = 
	new BasicVehicleClass(58);
    public static final BasicVehicleClass emergency_TypeUnknown = 
	new BasicVehicleClass(60);
    public static final BasicVehicleClass emergency_TypeOther = 
	new BasicVehicleClass(61);
    public static final BasicVehicleClass emergency_Fire_Light_Vehicle = 
	new BasicVehicleClass(62);
    public static final BasicVehicleClass emergency_Fire_Heavy_Vehicle = 
	new BasicVehicleClass(63);
    public static final BasicVehicleClass emergency_Fire_Paramedic_Vehicle = 
	new BasicVehicleClass(64);
    public static final BasicVehicleClass emergency_Fire_Ambulance_Vehicle = 
	new BasicVehicleClass(65);
    public static final BasicVehicleClass emergency_Police_Light_Vehicle = 
	new BasicVehicleClass(66);
    public static final BasicVehicleClass emergency_Police_Heavy_Vehicle = 
	new BasicVehicleClass(67);
    public static final BasicVehicleClass emergency_Other_Responder = 
	new BasicVehicleClass(68);
    public static final BasicVehicleClass emergency_Other_Ambulance = 
	new BasicVehicleClass(69);
    public static final BasicVehicleClass otherTraveler_TypeUnknown = 
	new BasicVehicleClass(80);
    public static final BasicVehicleClass otherTraveler_TypeOther = 
	new BasicVehicleClass(81);
    public static final BasicVehicleClass otherTraveler_Pedestrian = 
	new BasicVehicleClass(82);
    public static final BasicVehicleClass otherTraveler_Visually_Disabled = 
	new BasicVehicleClass(83);
    public static final BasicVehicleClass otherTraveler_Physically_Disabled = 
	new BasicVehicleClass(84);
    public static final BasicVehicleClass otherTraveler_Bicycle = 
	new BasicVehicleClass(85);
    public static final BasicVehicleClass otherTraveler_Vulnerable_Roadworker = 
	new BasicVehicleClass(86);
    public static final BasicVehicleClass infrastructure_TypeUnknown = 
	new BasicVehicleClass(90);
    public static final BasicVehicleClass infrastructure_Fixed = 
	new BasicVehicleClass(91);
    public static final BasicVehicleClass infrastructure_Movable = 
	new BasicVehicleClass(92);
    public static final BasicVehicleClass equipped_CargoTrailer = 
	new BasicVehicleClass(93);
    public static final DSRCmsgID reservedMessageId_D = 
	new DSRCmsgID(0);
    public static final DSRCmsgID alaCarteMessage_D = 
	new DSRCmsgID(1);
    public static final DSRCmsgID basicSafetyMessage_D = 
	new DSRCmsgID(2);
    public static final DSRCmsgID basicSafetyMessageVerbose_D = 
	new DSRCmsgID(3);
    public static final DSRCmsgID commonSafetyRequest_D = 
	new DSRCmsgID(4);
    public static final DSRCmsgID emergencyVehicleAlert_D = 
	new DSRCmsgID(5);
    public static final DSRCmsgID intersectionCollision_D = 
	new DSRCmsgID(6);
    public static final DSRCmsgID mapData_D = 
	new DSRCmsgID(7);
    public static final DSRCmsgID nmeaCorrections_D = 
	new DSRCmsgID(8);
    public static final DSRCmsgID probeDataManagement_D = 
	new DSRCmsgID(9);
    public static final DSRCmsgID probeVehicleData_D = 
	new DSRCmsgID(10);
    public static final DSRCmsgID roadSideAlert_D = 
	new DSRCmsgID(11);
    public static final DSRCmsgID rtcmCorrections_D = 
	new DSRCmsgID(12);
    public static final DSRCmsgID signalPhaseAndTimingMessage_D = 
	new DSRCmsgID(13);
    public static final DSRCmsgID signalRequestMessage_D = 
	new DSRCmsgID(14);
    public static final DSRCmsgID signalStatusMessage_D = 
	new DSRCmsgID(15);
    public static final DSRCmsgID travelerInformation_D = 
	new DSRCmsgID(16);
    public static final DSRCmsgID uperFrame_D = 
	new DSRCmsgID(17);
    public static final DSRCmsgID mapData = 
	new DSRCmsgID(18);
    public static final DSRCmsgID signalPhaseAndTimingMessage = 
	new DSRCmsgID(19);
    public static final DSRCmsgID basicSafetyMessage = 
	new DSRCmsgID(20);
    public static final DSRCmsgID commonSafetyRequest = 
	new DSRCmsgID(21);
    public static final DSRCmsgID emergencyVehicleAlert = 
	new DSRCmsgID(22);
    public static final DSRCmsgID intersectionCollision = 
	new DSRCmsgID(23);
    public static final DSRCmsgID nmeaCorrections = 
	new DSRCmsgID(24);
    public static final DSRCmsgID probeDataManagement = 
	new DSRCmsgID(25);
    public static final DSRCmsgID probeVehicleData = 
	new DSRCmsgID(26);
    public static final DSRCmsgID roadSideAlert = 
	new DSRCmsgID(27);
    public static final DSRCmsgID rtcmCorrections = 
	new DSRCmsgID(28);
    public static final DSRCmsgID signalRequestMessage = 
	new DSRCmsgID(29);
    public static final DSRCmsgID signalStatusMessage = 
	new DSRCmsgID(30);
    public static final DSRCmsgID travelerInformation = 
	new DSRCmsgID(31);
    public static final DSRCmsgID personalSafetyMessage = 
	new DSRCmsgID(32);
    public static final DSRCmsgID testMessage00 = 
	new DSRCmsgID(240);
    public static final DSRCmsgID testMessage01 = 
	new DSRCmsgID(241);
    public static final DSRCmsgID testMessage02 = 
	new DSRCmsgID(242);
    public static final DSRCmsgID testMessage03 = 
	new DSRCmsgID(243);
    public static final DSRCmsgID testMessage04 = 
	new DSRCmsgID(244);
    public static final DSRCmsgID testMessage05 = 
	new DSRCmsgID(245);
    public static final DSRCmsgID testMessage06 = 
	new DSRCmsgID(246);
    public static final DSRCmsgID testMessage07 = 
	new DSRCmsgID(247);
    public static final DSRCmsgID testMessage08 = 
	new DSRCmsgID(248);
    public static final DSRCmsgID testMessage09 = 
	new DSRCmsgID(249);
    public static final DSRCmsgID testMessage10 = 
	new DSRCmsgID(250);
    public static final DSRCmsgID testMessage11 = 
	new DSRCmsgID(251);
    public static final DSRCmsgID testMessage12 = 
	new DSRCmsgID(252);
    public static final DSRCmsgID testMessage13 = 
	new DSRCmsgID(253);
    public static final DSRCmsgID testMessage14 = 
	new DSRCmsgID(254);
    public static final DSRCmsgID testMessage15 = 
	new DSRCmsgID(255);
    public static final FuelType unknownFuel = 
	new FuelType(0);
    public static final FuelType gasoline = 
	new FuelType(1);
    public static final FuelType ethanol = 
	new FuelType(2);
    public static final FuelType diesel = 
	new FuelType(3);
    public static final FuelType electric = 
	new FuelType(4);
    public static final FuelType hybrid = 
	new FuelType(5);
    public static final FuelType hydrogen = 
	new FuelType(6);
    public static final FuelType natGasLiquid = 
	new FuelType(7);
    public static final FuelType natGasComp = 
	new FuelType(8);
    public static final FuelType propane = 
	new FuelType(9);
    public static final RegionId noRegion = 
	new RegionId(0);
    public static final RegionId addGrpA = 
	new RegionId(1);
    public static final RegionId addGrpB = 
	new RegionId(2);
    public static final RegionId addGrpC = 
	new RegionId(3);
}
