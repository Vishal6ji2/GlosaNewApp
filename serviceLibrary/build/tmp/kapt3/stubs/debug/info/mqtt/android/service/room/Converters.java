package info.mqtt.android.service.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0007\u00a8\u0006\f"}, d2 = {"Linfo/mqtt/android/service/room/Converters;", "", "()V", "fromMqttMessage", "", "value", "Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "fromQoS", "", "Linfo/mqtt/android/service/QoS;", "toMqttMessage", "toQoS", "serviceLibrary_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final info.mqtt.android.service.QoS toQoS(int value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public final int fromQoS(@org.jetbrains.annotations.NotNull()
    info.mqtt.android.service.QoS value) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final org.eclipse.paho.client.mqttv3.MqttMessage toMqttMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromMqttMessage(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage value) {
        return null;
    }
}