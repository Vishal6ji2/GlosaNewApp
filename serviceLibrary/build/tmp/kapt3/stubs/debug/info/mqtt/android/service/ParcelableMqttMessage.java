package info.mqtt.android.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Linfo/mqtt/android/service/ParcelableMqttMessage;", "Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "Landroid/os/Parcelable;", "original", "(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "messageId", "", "getMessageId", "()Ljava/lang/String;", "setMessageId", "(Ljava/lang/String;)V", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "serviceLibrary_debug"})
public final class ParcelableMqttMessage extends org.eclipse.paho.client.mqttv3.MqttMessage implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String messageId;
    @org.jetbrains.annotations.NotNull()
    public static final info.mqtt.android.service.ParcelableMqttMessage.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessageId() {
        return null;
    }
    
    public final void setMessageId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ParcelableMqttMessage(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage original) {
        super();
    }
    
    public ParcelableMqttMessage(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Linfo/mqtt/android/service/ParcelableMqttMessage$CREATOR;", "Landroid/os/Parcelable$Creator;", "Linfo/mqtt/android/service/ParcelableMqttMessage;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Linfo/mqtt/android/service/ParcelableMqttMessage;", "serviceLibrary_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<info.mqtt.android.service.ParcelableMqttMessage> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.mqtt.android.service.ParcelableMqttMessage createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.mqtt.android.service.ParcelableMqttMessage[] newArray(int size) {
            return null;
        }
    }
}