package com.example.glosanewapp.util;
/*****************************************************************************/
/* Copyright (C) ###RELEASE_YEAR### OSS Nokalva, Inc.  All rights reserved.                */
/*****************************************************************************/
/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.                    */
/* AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.             */
/* THIS FILE MAY NOT BE DISTRIBUTED.                                         */
/* THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED.                              */
/*****************************************************************************/
/* THIS SAMPLE PROGRAM IS PROVIDED AS IS. THE SAMPLE PROGRAM AND ANY RESULTS */
/* OBTAINED FROM IT ARE PROVIDED WITHOUT ANY WARRANTIES OR REPRESENTATIONS,  */
/* EXPRESS, IMPLIED OR STATUTORY.                                            */
/*****************************************************************************/
/*
 * $Id: 02109a016e3bfe43fd14fd342cd048f1b7ffa727 $
 */

/*
 * Demonstrates encoding of the DSRC MessageFrame PDU containing the
 * BasicSafetyMessage.
 */


import j2735.J2735;
import j2735.dsrc.Acceleration;
import j2735.dsrc.AccelerationSet4Way;
import j2735.dsrc.AntiLockBrakeStatus;
import j2735.dsrc.AuxiliaryBrakeStatus;
import j2735.dsrc.BSMcoreData;
import j2735.dsrc.BasicSafetyMessage;
import j2735.dsrc.BrakeAppliedStatus;
import j2735.dsrc.BrakeBoostApplied;
import j2735.dsrc.BrakeSystemStatus;
import j2735.dsrc.Confidence;
import j2735.dsrc.DDateTime;
import j2735.dsrc.DDay;
import j2735.dsrc.DHour;
import j2735.dsrc.DMinute;
import j2735.dsrc.DMonth;
import j2735.dsrc.DSRC;
import j2735.dsrc.DSecond;
import j2735.dsrc.DYear;
import j2735.dsrc.Elevation;
import j2735.dsrc.ElevationConfidence;
import j2735.dsrc.ExteriorLights;
import j2735.dsrc.FullPositionVector;
import j2735.dsrc.Heading;
import j2735.dsrc.HeadingConfidence;
import j2735.dsrc.Latitude;
import j2735.dsrc.Longitude;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.MsgCount;
import j2735.dsrc.OffsetLL_B18;
import j2735.dsrc.PathHistory;
import j2735.dsrc.PathHistoryPoint;
import j2735.dsrc.PathHistoryPointList;
import j2735.dsrc.PathPrediction;
import j2735.dsrc.PositionConfidence;
import j2735.dsrc.PositionConfidenceSet;
import j2735.dsrc.PositionalAccuracy;
import j2735.dsrc.RadiusOfCurvature;
import j2735.dsrc.SemiMajorAxisAccuracy;
import j2735.dsrc.SemiMajorAxisOrientation;
import j2735.dsrc.SemiMinorAxisAccuracy;
import j2735.dsrc.Speed;
import j2735.dsrc.SpeedConfidence;
import j2735.dsrc.SpeedandHeadingandThrottleConfidence;
import j2735.dsrc.StabilityControlStatus;
import j2735.dsrc.SteeringWheelAngle;
import j2735.dsrc.TemporaryID;
import j2735.dsrc.ThrottleConfidence;
import j2735.dsrc.TimeConfidence;
import j2735.dsrc.TimeOffset;
import j2735.dsrc.TractionControlStatus;
import j2735.dsrc.TransmissionAndSpeed;
import j2735.dsrc.TransmissionState;
import j2735.dsrc.VehicleEventFlags;
import j2735.dsrc.VehicleLength;
import j2735.dsrc.VehicleSafetyExtensions;
import j2735.dsrc.VehicleSize;
import j2735.dsrc.VehicleWidth;
import j2735.dsrc.Velocity;
import j2735.dsrc.VertOffset_B12;
import j2735.dsrc.VerticalAcceleration;
import j2735.dsrc.YawRate;
import com.oss.asn1.Coder;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.OpenType;
import com.oss.util.HexTool;

import java.io.ByteArrayOutputStream;


public class BSMUPEREncoder {

    static Coder coder;
    static String border = "-------------------------------------------------------";

    public BSMUPEREncoder()
    {
        // Initialize the project
        try {
            J2735.initialize();
        } catch (Exception e) {
            System.out.println("Initialization exception: " + e);
            System.exit(1);
        }

        coder = J2735.getPERUnalignedCoder();
        coder.enableAutomaticEncoding();
        coder.enableAutomaticDecoding();
        coder.enableEncoderDebugging();
        coder.enableDecoderDebugging();
        String relax = System.getProperty("oss.samples.relaxedmode");
        if (relax != null && relax.equalsIgnoreCase("on")) {
            coder.enableRelaxedDecoding();
        }

    }

    public byte[] getBSMMessage(Latitude latitude, Longitude longitude, Heading heading, Speed speed, byte[] temporaryID ) throws EncodeFailedException, EncodeNotSupportedException {


        // Construct a sample PDU for encoding

        MessageFrame msg = new MessageFrame(
                DSRC.basicSafetyMessage,
            new OpenType(create_BSM(latitude,longitude,heading,speed,temporaryID)));


        System.out.println("\nPDU for encoding...\n");
        System.out.println(msg);
        System.out.println("\nEncoding...");
        /*
         * Set the output stream.
         */
        ByteArrayOutputStream sink = new ByteArrayOutputStream();
        /*
         * Encode the PDU.
         */
        try {
            coder.encode(msg, sink);
        } catch (EncodeNotSupportedException | EncodeFailedException e) {
            System.out.println("Encoding failed: " + e);
            System.exit(2);
        }
        System.out.println("Encoded successfully.");
        /*
         * Print the encoded PDU.
         */
        System.out.println("\nEncoded PDU...\n");
        byte[] encoding = sink.toByteArray();
        HexTool.printHex(encoding);
        System.out.println("Encoded hex Format: "+  HexTool.getHex(encoding));

        return encoding;
    }

    // Constructs the value of the BasicSafetyMessage
    private static BasicSafetyMessage create_BSM(Latitude latitude, Longitude longitude, Heading heading, Speed speed, byte[] temporaryID)

    {
        // Setup the BSMCoreData
        BSMcoreData bsmCoreData = new BSMcoreData();
        bsmCoreData.setMsgCnt(new MsgCount(1));
        bsmCoreData.setId(new TemporaryID(temporaryID));
        bsmCoreData.setSecMark(new DSecond(19000));
        bsmCoreData.setLat(latitude);
        //566966765
        bsmCoreData.set_long(longitude);

        bsmCoreData.setElev((new Elevation(49499)));
        bsmCoreData.setAccuracy(
                new PositionalAccuracy(
                        new SemiMajorAxisAccuracy(0),
                        new SemiMinorAxisAccuracy(0),
                        new SemiMajorAxisOrientation(0)));
        bsmCoreData.setTransmission(TransmissionState.neutral);
        bsmCoreData.setSpeed(speed);
        bsmCoreData.setHeading(heading);

        bsmCoreData.setAngle(new SteeringWheelAngle(-74));
        bsmCoreData.setAccelSet(
                new AccelerationSet4Way(
                        new Acceleration(0),
                        new Acceleration(0),
                        new VerticalAcceleration(0),
                        new YawRate(0)));
        BrakeAppliedStatus brakeAppliedStatus = new BrakeAppliedStatus();
        brakeAppliedStatus.setBit(BrakeAppliedStatus.unavailable);
        bsmCoreData.setBrakes(
                new BrakeSystemStatus(
                        brakeAppliedStatus,
                        TractionControlStatus.unavailable,
                        AntiLockBrakeStatus.unavailable,
                        StabilityControlStatus.unavailable,
                        BrakeBoostApplied.unavailable,
                        AuxiliaryBrakeStatus.unavailable));
        bsmCoreData.setSize(
                new VehicleSize(
                        new VehicleWidth(130),
                        new VehicleLength(2361)));

        // Create the PartII component
        BasicSafetyMessage.PartII partII = new BasicSafetyMessage.PartII();

        BasicSafetyMessage.PartII.Sequence_ element = new BasicSafetyMessage.PartII.Sequence_(
                DSRC.vehicleSafetyExt,
                new OpenType(create_VehicleSafetyExtensions()));
        partII.add(element);

        return new BasicSafetyMessage(
                bsmCoreData,
                null,
                null    // Regional extensions are omitted
        );
    }

    // Constructs the value of the VehicleSafetyExtensions to be inserted into
    // the PartII component of the BasicSafetyMessage
    private static VehicleSafetyExtensions create_VehicleSafetyExtensions()
    {
        VehicleSafetyExtensions extensions = new VehicleSafetyExtensions();
        VehicleEventFlags events = new VehicleEventFlags();
        events.setBit(VehicleEventFlags.eventTractionControlLoss);
        events.setBit(VehicleEventFlags.eventFlatTire);
        extensions.setEvents(events);
        extensions.setPathHistory(create_PathHistory());
        extensions.setPathPrediction(
                new PathPrediction(
                        new RadiusOfCurvature(0),
                        new Confidence(10)));
        ExteriorLights lights = new ExteriorLights();
        lights.setBit(ExteriorLights.fogLightOn);
        lights.setBit(ExteriorLights.automaticLightControlOn);
        extensions.setLights(lights);

        return extensions;
    }

    // Constructs the value of the PathHistory to be inserted into
    // the VehicleSafetyExtensions component of the PartII component of
    // the BasicSafetyMessage
    private static PathHistory create_PathHistory()
    {
        PathHistory pathHistory = new PathHistory();
        // Setup the InitialPosition
        FullPositionVector initialPosition = new FullPositionVector();
        initialPosition.setUtcTime(
                new DDateTime(
                        new DYear(2010),
                        new DMonth(1),
                        new DDay(16),
                        new DHour(21),
                        new DMinute(5),
                        new DSecond(30000),
                        null // offset
                ));
        initialPosition.set_long(new Longitude(-887008270));
        initialPosition.setLat(new Latitude(-154554887));
        initialPosition.setElevation(new Elevation(512));
        initialPosition.setHeading(new Heading(11441));
        initialPosition.setSpeed(
                new TransmissionAndSpeed(
                        TransmissionState.neutral,
                        new Velocity(0)));
        initialPosition.setPosAccuracy(
                new PositionalAccuracy(
                        new SemiMajorAxisAccuracy(4),
                        new SemiMinorAxisAccuracy(2),
                        new SemiMajorAxisOrientation(65535)));
        initialPosition.setTimeConfidence(TimeConfidence.unavailable);
        initialPosition.setPosConfidence(
                new PositionConfidenceSet(
                        PositionConfidence.unavailable,
                        ElevationConfidence.unavailable));
        initialPosition.setSpeedConfidence(
                new SpeedandHeadingandThrottleConfidence(
                        HeadingConfidence.unavailable,
                        SpeedConfidence.unavailable,
                        ThrottleConfidence.unavailable));
        pathHistory.setInitialPosition(initialPosition);
        // Setup the CrumbData
        PathHistoryPointList pathHistoryPointList = new PathHistoryPointList();
        final int crumbDataSize = 23;
        int lonOffset = 0, timeOffset = 10;
        for (int i = 0; i < crumbDataSize; i++) {
            PathHistoryPoint pathHistoryPoint =
                    new PathHistoryPoint(
                            new OffsetLL_B18(0),         // Lattitude offset
                            new OffsetLL_B18(lonOffset), // Longitude offset
                            new VertOffset_B12(0),       // Elevation offset
                            new TimeOffset(timeOffset));
            pathHistoryPointList.add(pathHistoryPoint);
            ++lonOffset;
            timeOffset += 10;
        }
        pathHistory.setCrumbData(pathHistoryPointList);

        return pathHistory;
    }
}
