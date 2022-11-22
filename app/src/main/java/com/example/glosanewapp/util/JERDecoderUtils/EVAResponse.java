package com.example.glosanewapp.util.JERDecoderUtils;

import com.google.gson.annotations.SerializedName;

public class EVAResponse {

    @SerializedName("MessageFrame")
    public MessageFrame messageFrame = new MessageFrame();

    public class MessageFrame {
        public String messageId;
        public Value value = new Value();
    }

    public class Value {
        @SerializedName("EmergencyVehicleAlert")
        public EmergencyVehicleAlert emergencyVehicleAlert = new EmergencyVehicleAlert();
    }

    public class EmergencyVehicleAlert {
        public RSAResponse.RoadSideAlert rsaMsg;
        public String id;
        public String timeStamp;

    }
}
