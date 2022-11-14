package info.mqtt.android.service;

import java.lang.System;

/**
 * Implementation of the IMqttDeliveryToken interface for use from within the MqttAndroidClient implementation
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Linfo/mqtt/android/service/MqttDeliveryTokenAndroid;", "Linfo/mqtt/android/service/MqttTokenAndroid;", "Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;", "client", "Linfo/mqtt/android/service/MqttAndroidClient;", "userContext", "", "listener", "Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;", "message", "Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "(Linfo/mqtt/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V", "getMessage", "notifyDelivery", "", "delivered", "setMessage", "serviceLibrary_debug"})
public final class MqttDeliveryTokenAndroid extends info.mqtt.android.service.MqttTokenAndroid implements org.eclipse.paho.client.mqttv3.IMqttDeliveryToken {
    private org.eclipse.paho.client.mqttv3.MqttMessage message;
    
    public MqttDeliveryTokenAndroid(@org.jetbrains.annotations.NotNull()
    info.mqtt.android.service.MqttAndroidClient client, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener listener, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage message) {
        super(null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.MqttMessage getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage message) {
    }
    
    public final void notifyDelivery(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage delivered) {
    }
}