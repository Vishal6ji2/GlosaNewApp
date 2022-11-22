package com.example.glosanewapp.util.JERDecoderUtils;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Map;

public class RSAResponse {

    public class Description{
        @SerializedName("ITIScodes")
        public ArrayList<String> iTIScodes;
    }

    public enum ExtentValues{
        useInstantlyOnly,
        useFor3meters,
        useFor10meters,
        useFor50meters,
        useFor100meters,
        useFor500meters,
        useFor1000meters,
        useFor5000meters,
        useFor10000meters,
        useFor50000meters,
        useFor100000meters,
        useFor500000meters,
        useFor1000000meters,
        useFor5000000meters,
        useFor10000000meters,
    }

    @SerializedName("MessageFrame")
    public MessageFrame messageFrame = new MessageFrame();

    public class MessageFrame{
        public String messageId;
        public Value value = new Value();
    }
    public class Value{
        @SerializedName("RoadSideAlert")
        public RoadSideAlert roadSideAlert =new RoadSideAlert();
    }

    public class Position{
        @SerializedName("long")
        public String mylong;
        public String lat;
        public String elevation;
        public String heading;
    }

    public class RoadSideAlert{
        public String heading;
        public Map<ExtentValues,String> extent;
        public Position position=new Position();
        public String furtherInfoID;
        public String msgCnt;
        public String timeStamp;
        public String typeEvent;
        public Description description;
    }





}
