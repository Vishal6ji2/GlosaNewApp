package info.mqtt.android.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0015\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0016\u00a2\u0006\u0002\u0010\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Linfo/mqtt/android/service/MqttConnectTokenAndroid;", "Lorg/eclipse/paho/client/mqttv3/IMqttToken;", "sessionPresent", "", "(Z)V", "getActionCallback", "Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;", "getClient", "Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;", "getException", "Lorg/eclipse/paho/client/mqttv3/MqttException;", "getGrantedQos", "", "getMessageId", "", "getResponse", "Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;", "getSessionPresent", "getTopics", "", "", "()[Ljava/lang/String;", "getUserContext", "", "isComplete", "setActionCallback", "", "listener", "setUserContext", "userContext", "waitForCompletion", "timeout", "", "serviceLibrary_debug"})
public final class MqttConnectTokenAndroid implements org.eclipse.paho.client.mqttv3.IMqttToken {
    private final boolean sessionPresent = false;
    
    public MqttConnectTokenAndroid(boolean sessionPresent) {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttException.class})
    @java.lang.Override()
    public void waitForCompletion() throws org.eclipse.paho.client.mqttv3.MqttException {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttException.class})
    @java.lang.Override()
    public void waitForCompletion(long timeout) throws org.eclipse.paho.client.mqttv3.MqttException {
    }
    
    @java.lang.Override()
    public boolean isComplete() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.MqttException getException() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttActionListener getActionCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void setActionCallback(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.IMqttActionListener listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttAsyncClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String[] getTopics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserContext() {
        return null;
    }
    
    @java.lang.Override()
    public void setUserContext(@org.jetbrains.annotations.NotNull()
    java.lang.Object userContext) {
    }
    
    @java.lang.Override()
    public int getMessageId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public int[] getGrantedQos() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getSessionPresent() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage getResponse() {
        return null;
    }
}