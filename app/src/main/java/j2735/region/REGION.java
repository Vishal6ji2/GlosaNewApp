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


package j2735.region;

import com.oss.asn1.*;
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
  Abstract class for the REGION ASN.1 module.
  It contains statically initialized objects that represent ASN.1 values.
*/

public abstract class REGION extends ASN1Module {

    
    
    // Information object sets
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_AdvisorySpeed = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_AdvisorySpeed = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_AdvisorySpeed,
	    1,
	    "REGION",
	    "Reg-AdvisorySpeed"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_ComputedLane = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_ComputedLane = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_ComputedLane,
	    1,
	    "REGION",
	    "Reg-ComputedLane"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_EventDescription = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_EventDescription = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_EventDescription,
	    1,
	    "REGION",
	    "Reg-EventDescription"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_GenericLane = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_GenericLane = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_GenericLane,
	    1,
	    "REGION",
	    "Reg-GenericLane"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_GeographicalPath = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_GeographicalPath = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_GeographicalPath,
	    1,
	    "REGION",
	    "Reg-GeographicalPath"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_GeometricProjection = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_GeometricProjection = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_GeometricProjection,
	    1,
	    "REGION",
	    "Reg-GeometricProjection"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_IntersectionGeometry = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_IntersectionGeometry = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_IntersectionGeometry,
	    1,
	    "REGION",
	    "Reg-IntersectionGeometry"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_LaneAttributes = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_LaneAttributes = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_LaneAttributes,
	    1,
	    "REGION",
	    "Reg-LaneAttributes"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_MovementState = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_MovementState = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_MovementState,
	    1,
	    "REGION",
	    "Reg-MovementState"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_NodeAttributeSetLL = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NodeAttributeSetLL = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_NodeAttributeSetLL,
	    1,
	    "REGION",
	    "Reg-NodeAttributeSetLL"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_NodeAttributeSetXY = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NodeAttributeSetXY = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_NodeAttributeSetXY,
	    1,
	    "REGION",
	    "Reg-NodeAttributeSetXY"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_NodeOffsetPointLL = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NodeOffsetPointLL = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_NodeOffsetPointLL,
	    1,
	    "REGION",
	    "Reg-NodeOffsetPointLL"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_RequestorDescription = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RequestorDescription = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_RequestorDescription,
	    1,
	    "REGION",
	    "Reg-RequestorDescription"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_RequestorType = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RequestorType = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_RequestorType,
	    1,
	    "REGION",
	    "Reg-RequestorType"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_RoadSegment = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RoadSegment = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_RoadSegment,
	    1,
	    "REGION",
	    "Reg-RoadSegment"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SignalControlZone = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalControlZone = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SignalControlZone,
	    1,
	    "REGION",
	    "Reg-SignalControlZone"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SignalRequest = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalRequest = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SignalRequest,
	    1,
	    "REGION",
	    "Reg-SignalRequest"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SignalRequestPackage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalRequestPackage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SignalRequestPackage,
	    1,
	    "REGION",
	    "Reg-SignalRequestPackage"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SignalStatus = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalStatus = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SignalStatus,
	    1,
	    "REGION",
	    "Reg-SignalStatus"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SignalStatusPackage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalStatusPackage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SignalStatusPackage,
	    1,
	    "REGION",
	    "Reg-SignalStatusPackage"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SupplementalVehicleExtensions = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SupplementalVehicleExtensions = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SupplementalVehicleExtensions,
	    1,
	    "REGION",
	    "Reg-SupplementalVehicleExtensions"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_VehicleClassification = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_VehicleClassification = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_VehicleClassification,
	    1,
	    "REGION",
	    "Reg-VehicleClassification"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_VerticalOffset = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_VerticalOffset = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_VerticalOffset,
	    1,
	    "REGION",
	    "Reg-VerticalOffset"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_ConnectionManeuverAssist = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(3),
		j2735.addgrpc.ConnectionManeuverAssist_addGrpC._type
	    )
	};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_ConnectionManeuverAssist = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_ConnectionManeuverAssist,
	    1,
	    "REGION",
	    "Reg-ConnectionManeuverAssist"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_IntersectionState = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(3),
		j2735.addgrpc.IntersectionState_addGrpC._type
	    )
	};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_IntersectionState = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_IntersectionState,
	    1,
	    "REGION",
	    "Reg-IntersectionState"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_LaneDataAttribute = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(2),
		j2735.addgrpb.LaneDataAttribute_addGrpB._type
	    )
	};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_LaneDataAttribute = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_LaneDataAttribute,
	    1,
	    "REGION",
	    "Reg-LaneDataAttribute"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_MovementEvent = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(2),
		j2735.addgrpb.MovementEvent_addGrpB._type
	    )
	};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_MovementEvent = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_MovementEvent,
	    1,
	    "REGION",
	    "Reg-MovementEvent"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_NodeOffsetPointXY = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(2),
		j2735.addgrpb.NodeOffsetPointXY_addGrpB._type
	    )
	};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NodeOffsetPointXY = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_NodeOffsetPointXY,
	    1,
	    "REGION",
	    "Reg-NodeOffsetPointXY"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_Position3D = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(2),
		j2735.addgrpb.Position3D_addGrpB._type
	    ),
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(3),
		j2735.addgrpc.Position3D_addGrpC._type
	    )
	};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_Position3D = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_Position3D,
	    1,
	    "REGION",
	    "Reg-Position3D"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_RestrictionUserType = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(3),
		j2735.addgrpc.RestrictionUserType_addGrpC._type
	    )
	};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RestrictionUserType = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_RestrictionUserType,
	    1,
	    "REGION",
	    "Reg-RestrictionUserType"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_BasicSafetyMessage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_BasicSafetyMessage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_BasicSafetyMessage,
	    1,
	    "REGION",
	    "Reg-BasicSafetyMessage"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_CommonSafetyRequest = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_CommonSafetyRequest = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_CommonSafetyRequest,
	    1,
	    "REGION",
	    "Reg-CommonSafetyRequest"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_EmergencyVehicleAlert = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_EmergencyVehicleAlert = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_EmergencyVehicleAlert,
	    1,
	    "REGION",
	    "Reg-EmergencyVehicleAlert"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_IntersectionCollision = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_IntersectionCollision = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_IntersectionCollision,
	    1,
	    "REGION",
	    "Reg-IntersectionCollision"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_NMEAcorrections = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NMEAcorrections = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_NMEAcorrections,
	    1,
	    "REGION",
	    "Reg-NMEAcorrections"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_ProbeDataManagement = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_ProbeDataManagement = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_ProbeDataManagement,
	    1,
	    "REGION",
	    "Reg-ProbeDataManagement"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_ProbeVehicleData = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_ProbeVehicleData = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_ProbeVehicleData,
	    1,
	    "REGION",
	    "Reg-ProbeVehicleData"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_RoadSideAlert = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RoadSideAlert = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_RoadSideAlert,
	    1,
	    "REGION",
	    "Reg-RoadSideAlert"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_RTCMcorrections = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RTCMcorrections = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_RTCMcorrections,
	    1,
	    "REGION",
	    "Reg-RTCMcorrections"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SignalRequestMessage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalRequestMessage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SignalRequestMessage,
	    1,
	    "REGION",
	    "Reg-SignalRequestMessage"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SignalStatusMessage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalStatusMessage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SignalStatusMessage,
	    1,
	    "REGION",
	    "Reg-SignalStatusMessage"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_SPAT = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SPAT = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_SPAT,
	    1,
	    "REGION",
	    "Reg-SPAT"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TravelerInformation = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TravelerInformation = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TravelerInformation,
	    1,
	    "REGION",
	    "Reg-TravelerInformation"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_PersonalSafetyMessage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_PersonalSafetyMessage = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_PersonalSafetyMessage,
	    1,
	    "REGION",
	    "Reg-PersonalSafetyMessage"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_MapData = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {
	    new j2735.dsrc.REG_EXT_ID_AND_TYPE (
		new j2735.dsrc.RegionId(3),
		j2735.addgrpc.MapData_addGrpC._type
	    )
	};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_MapData = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_MapData,
	    1,
	    "REGION",
	    "Reg-MapData"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage00 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage00 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage00,
	    1,
	    "REGION",
	    "Reg-TestMessage00"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage01 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage01 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage01,
	    1,
	    "REGION",
	    "Reg-TestMessage01"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage02 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage02 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage02,
	    1,
	    "REGION",
	    "Reg-TestMessage02"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage03 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage03 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage03,
	    1,
	    "REGION",
	    "Reg-TestMessage03"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage04 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage04 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage04,
	    1,
	    "REGION",
	    "Reg-TestMessage04"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage05 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage05 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage05,
	    1,
	    "REGION",
	    "Reg-TestMessage05"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage06 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage06 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage06,
	    1,
	    "REGION",
	    "Reg-TestMessage06"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage07 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage07 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage07,
	    1,
	    "REGION",
	    "Reg-TestMessage07"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage08 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage08 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage08,
	    1,
	    "REGION",
	    "Reg-TestMessage08"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage09 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage09 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage09,
	    1,
	    "REGION",
	    "Reg-TestMessage09"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage10 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage10 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage10,
	    1,
	    "REGION",
	    "Reg-TestMessage10"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage11 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage11 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage11,
	    1,
	    "REGION",
	    "Reg-TestMessage11"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage12 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage12 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage12,
	    1,
	    "REGION",
	    "Reg-TestMessage12"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage13 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage13 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage13,
	    1,
	    "REGION",
	    "Reg-TestMessage13"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage14 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage14 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage14,
	    1,
	    "REGION",
	    "Reg-TestMessage14"
	);
    public static final j2735.dsrc.REG_EXT_ID_AND_TYPE[] _reg_TestMessage15 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE[] {};
    public static j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage15 = 
	new j2735.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    _reg_TestMessage15,
	    1,
	    "REGION",
	    "Reg-TestMessage15"
	);
    
}
