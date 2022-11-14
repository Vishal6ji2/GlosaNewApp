package com.example.glosanewapp.util;


import j2735.J2735;
import j2735.dsrc.AdvisorySpeed;
import j2735.dsrc.AdvisorySpeedList;
import j2735.dsrc.AdvisorySpeedType;
import j2735.dsrc.DSRC;
import j2735.dsrc.DescriptiveName;
import j2735.dsrc.EnabledLaneList;
import j2735.dsrc.IntersectionID;
import j2735.dsrc.IntersectionReferenceID;
import j2735.dsrc.IntersectionState;
import j2735.dsrc.IntersectionStateList;
import j2735.dsrc.IntersectionStatusObject;
import j2735.dsrc.LaneID;
import j2735.dsrc.MessageFrame;
import j2735.dsrc.MinuteOfTheYear;
import j2735.dsrc.MovementEvent;
import j2735.dsrc.MovementEventList;
import j2735.dsrc.MovementList;
import j2735.dsrc.MovementPhaseState;
import j2735.dsrc.MovementState;
import j2735.dsrc.MsgCount;
import j2735.dsrc.RoadRegulatorID;
import j2735.dsrc.SPAT;
import j2735.dsrc.SignalGroupID;
import j2735.dsrc.SpeedAdvice;
import j2735.dsrc.SpeedConfidence;
import j2735.dsrc.TimeChangeDetails;
import j2735.dsrc.TimeIntervalConfidence;
import j2735.dsrc.TimeMark;
import j2735.dsrc.ZoneLength;
import com.oss.asn1.Coder;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.OpenType;
import com.oss.util.HexTool;

import java.io.ByteArrayOutputStream;



public class SPATUPEREncoder {
    static Coder coder;
    static String border = "-------------------------------------------------------";

    public SPATUPEREncoder()
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


    public byte[] getSPATMessage(){

        // Construct a sample PDU for encoding

        MessageFrame msg = new MessageFrame(
                DSRC.signalPhaseAndTimingMessage,
                new OpenType(create_SPAT()));

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
        return encoding;
    }

/*
    {

        "timeStamp":0,

            "name":"0",

            "intersections":[

        {

            "name":"0",

                "id":{

            "region":0,

                    "id":0

        },

            "revision":0,

                "status":"FFFC",

                "moy":0,

                "timeStamp":0,

                "enabledLanes":[

            0

      ],

            "states":[

            {

                "movementName":"0",

                    "signalGroup":0,

                    "state-time-speed":[

                {

                    "eventState":"unavailable",

                        "speeds":[

                    {

                        "type":"none",

                            "speed":0,

                            "confidence":"unavailable",

                            "distance":0,

                            "class":0

                    }

              ]

                }

          ]

            }

      ]

        }

  ]

    }*/

    public static SPAT create_SPAT()
    {
        SPAT spat_UPERVALUE = new SPAT();
        /*SPAT.Regional regional = new SPAT.Regional();
        spat_UPERVALUE.setRegional(regional);*/

        spat_UPERVALUE.setName(new DescriptiveName("Unitech Cyber Park"));
        spat_UPERVALUE.setTimeStamp(new MinuteOfTheYear(10));


        IntersectionStateList intersectionStateList = new IntersectionStateList();

        IntersectionState intersectionState = new IntersectionState();

        intersectionState.setName(new DescriptiveName("Unitech Cyber Park"));
        intersectionState.setId(new IntersectionReferenceID(new RoadRegulatorID(0),new IntersectionID(0)));
        intersectionState.setRevision(new MsgCount(27));
        intersectionState.setStatus(new IntersectionStatusObject(null));
        intersectionState.setMoy(new MinuteOfTheYear(527039));

        EnabledLaneList enabledLaneList = new EnabledLaneList();
        enabledLaneList.add(new LaneID(23));
        intersectionState.setEnabledLanes(enabledLaneList);

        MovementList movementList = new MovementList();
        MovementState movementState = new MovementState();
        movementState.setMovementName(new DescriptiveName("Sen Chowk"));
        movementState.setSignalGroup(new SignalGroupID(2));
        movementState.setManeuverAssistList(null);

        MovementEventList movementEventList = new MovementEventList();
        MovementEvent movementEvent = new MovementEvent();
        TimeMark timeMark = new TimeMark();
        timeMark.setValue(343);

        movementEvent.setTiming(new TimeChangeDetails(timeMark,timeMark,timeMark,timeMark,new TimeIntervalConfidence(10),timeMark));
        movementEvent.setEventState(MovementPhaseState.stop_And_Remain);

        AdvisorySpeedList advisorySpeedList = new AdvisorySpeedList();

        AdvisorySpeed advisorySpeed = new AdvisorySpeed();
        advisorySpeed.setSpeed(new SpeedAdvice(40));
        advisorySpeed.setType(AdvisorySpeedType.ecoDrive);
        advisorySpeed.setConfidence(SpeedConfidence.prec100ms);
        advisorySpeed.setDistance(new ZoneLength(100));
        advisorySpeedList.add(advisorySpeed);

        movementEvent.setSpeeds(advisorySpeedList);


        movementEventList.add(movementEvent);
        movementState.setState_time_speed(movementEventList);
        movementList.add(movementState);
        intersectionState.setStates(movementList);

        intersectionStateList.add(intersectionState);

        spat_UPERVALUE.setIntersections(intersectionStateList);

        return spat_UPERVALUE;

    }


}
