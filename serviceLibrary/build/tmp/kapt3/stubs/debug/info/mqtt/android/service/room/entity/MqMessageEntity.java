package info.mqtt.android.service.room.entity;

import java.lang.System;

@androidx.room.Entity(indices = {@androidx.room.Index(value = {"clientHandle"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\u000bH\u00c6\u0003J\t\u0010)\u001a\u00020\u000eH\u00c6\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013\u00a8\u00060"}, d2 = {"Linfo/mqtt/android/service/room/entity/MqMessageEntity;", "", "messageId", "", "clientHandle", "topic", "mqttMessage", "Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "qos", "Linfo/mqtt/android/service/QoS;", "retained", "", "duplicate", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Linfo/mqtt/android/service/QoS;ZZJ)V", "getClientHandle", "()Ljava/lang/String;", "setClientHandle", "(Ljava/lang/String;)V", "getDuplicate", "()Z", "getMessageId", "getMqttMessage", "()Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "setMqttMessage", "(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V", "getQos", "()Linfo/mqtt/android/service/QoS;", "getRetained", "getTimestamp", "()J", "getTopic", "setTopic", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "serviceLibrary_debug"})
public final class MqMessageEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final java.lang.String messageId = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clientHandle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String topic;
    @org.jetbrains.annotations.NotNull()
    private org.eclipse.paho.client.mqttv3.MqttMessage mqttMessage;
    @org.jetbrains.annotations.NotNull()
    private final info.mqtt.android.service.QoS qos = null;
    private final boolean retained = false;
    private final boolean duplicate = false;
    private final long timestamp = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final info.mqtt.android.service.room.entity.MqMessageEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientHandle, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage mqttMessage, @org.jetbrains.annotations.NotNull()
    info.mqtt.android.service.QoS qos, boolean retained, boolean duplicate, long timestamp) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MqMessageEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientHandle, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage mqttMessage, @org.jetbrains.annotations.NotNull()
    info.mqtt.android.service.QoS qos, boolean retained, boolean duplicate, long timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessageId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientHandle() {
        return null;
    }
    
    public final void setClientHandle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTopic() {
        return null;
    }
    
    public final void setTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.eclipse.paho.client.mqttv3.MqttMessage component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.eclipse.paho.client.mqttv3.MqttMessage getMqttMessage() {
        return null;
    }
    
    public final void setMqttMessage(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.mqtt.android.service.QoS component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.mqtt.android.service.QoS getQos() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getRetained() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getDuplicate() {
        return false;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
}