package com.example.glosanewapp.util.JERDecoderUtils;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class PSMResponse {

    @SerializedName("MessageFrame")
    public MessageFrame messageFrame=new MessageFrame();

    public class Value {
        @SerializedName("PersonalSafetyMessage")
        public PersonalSafetyMessage personalSafetyMessage = new PersonalSafetyMessage();
    }

    public class Accuracy {
        public int semiMajor=0;
        public int semiMinor=0;
        public int orientation=0;
    }

    public enum BasicTypevalues {
        aPEDESTRIAN,
        unavailable,
        aPEDALCYCLIST,
        aPUBLICSAFETYWORKER,
        anANIMAL
    }

    public class MessageFrame {
        public int messageId;
        public Value value = new Value();
    }

    public class PersonalSafetyMessage {
        public Accuracy accuracy = new Accuracy();
        public int speed;
        public int heading;
        public String basicType;
        public int secMark;
        public int msgCnt;
        public String id;
        public Position position = new Position();
    }

    public class Position {
        public int lat;
        @SerializedName("long")
        public int mylong;
    }


}
