package info.mqtt.android.service;

import java.lang.System;

/**
 * Various strings used to identify operations or data in the Android MQTT
 * service, mainly used in Intents passed between Activities and the Service.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Linfo/mqtt/android/service/MqttServiceConstants;", "", "Companion", "serviceLibrary_debug"})
public abstract interface MqttServiceConstants {
    @org.jetbrains.annotations.NotNull()
    public static final info.mqtt.android.service.MqttServiceConstants.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DUPLICATE = "duplicate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RETAINED = "retained";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QOS = "qos";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYLOAD = "payload";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DESTINATION_NAME = "destinationName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLIENT_HANDLE = "clientHandle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_ID = "messageId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSION_PRESENT = "sessionPresent";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEND_ACTION = "send";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNSUBSCRIBE_ACTION = "unsubscribe";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUBSCRIBE_ACTION = "subscribe";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DISCONNECT_ACTION = "disconnect";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONNECT_ACTION = "connect";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONNECT_EXTENDED_ACTION = "connectExtended";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_ARRIVED_ACTION = "messageArrived";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_DELIVERED_ACTION = "messageDelivered";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ON_CONNECTION_LOST_ACTION = "onConnectionLost";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACE_ACTION = "trace";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_TO_ACTIVITY = ".callbackToActivity.v0";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_ACTION = ".callbackAction";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_STATUS = ".callbackStatus";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_CLIENT_HANDLE = ".clientHandle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_ERROR_MESSAGE = ".errorMessage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_EXCEPTION_STACK = ".exceptionStack";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_INVOCATION_CONTEXT = ".invocationContext";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_ACTIVITY_TOKEN = ".activityToken";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_DESTINATION_NAME = "destinationName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_MESSAGE_ID = "messageId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_RECONNECT = ".reconnect";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_SERVER_URI = ".serverURI";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_MESSAGE_PARCEL = ".PARCEL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_TRACE_SEVERITY = ".traceSeverity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_ERROR_NUMBER = ".ERROR_NUMBER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_EXCEPTION = ".exception";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PING_SENDER = ".pingSender.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PING_WAKELOCK = ".client.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACE_ERROR = "error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACE_DEBUG = "debug";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACE_EXCEPTION = "exception";
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Linfo/mqtt/android/service/MqttServiceConstants$Companion;", "", "()V", "CALLBACK_ACTION", "", "CALLBACK_ACTIVITY_TOKEN", "CALLBACK_CLIENT_HANDLE", "CALLBACK_DESTINATION_NAME", "CALLBACK_ERROR_MESSAGE", "CALLBACK_ERROR_NUMBER", "CALLBACK_EXCEPTION", "CALLBACK_EXCEPTION_STACK", "CALLBACK_INVOCATION_CONTEXT", "CALLBACK_MESSAGE_ID", "CALLBACK_MESSAGE_PARCEL", "CALLBACK_RECONNECT", "CALLBACK_SERVER_URI", "CALLBACK_STATUS", "CALLBACK_TO_ACTIVITY", "CALLBACK_TRACE_SEVERITY", "CLIENT_HANDLE", "CONNECT_ACTION", "CONNECT_EXTENDED_ACTION", "DESTINATION_NAME", "DISCONNECT_ACTION", "DUPLICATE", "MESSAGE_ARRIVED_ACTION", "MESSAGE_DELIVERED_ACTION", "MESSAGE_ID", "ON_CONNECTION_LOST_ACTION", "PAYLOAD", "PING_SENDER", "PING_WAKELOCK", "QOS", "RETAINED", "SEND_ACTION", "SESSION_PRESENT", "SUBSCRIBE_ACTION", "TRACE_ACTION", "TRACE_DEBUG", "TRACE_ERROR", "TRACE_EXCEPTION", "UNSUBSCRIBE_ACTION", "VERSION", "serviceLibrary_debug"})
    public static final class Companion {
        private static final java.lang.String VERSION = "v0";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DUPLICATE = "duplicate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RETAINED = "retained";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String QOS = "qos";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAYLOAD = "payload";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DESTINATION_NAME = "destinationName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CLIENT_HANDLE = "clientHandle";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MESSAGE_ID = "messageId";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SESSION_PRESENT = "sessionPresent";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SEND_ACTION = "send";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UNSUBSCRIBE_ACTION = "unsubscribe";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SUBSCRIBE_ACTION = "subscribe";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DISCONNECT_ACTION = "disconnect";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONNECT_ACTION = "connect";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONNECT_EXTENDED_ACTION = "connectExtended";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MESSAGE_ARRIVED_ACTION = "messageArrived";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MESSAGE_DELIVERED_ACTION = "messageDelivered";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ON_CONNECTION_LOST_ACTION = "onConnectionLost";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TRACE_ACTION = "trace";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_TO_ACTIVITY = ".callbackToActivity.v0";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_ACTION = ".callbackAction";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_STATUS = ".callbackStatus";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_CLIENT_HANDLE = ".clientHandle";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_ERROR_MESSAGE = ".errorMessage";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_EXCEPTION_STACK = ".exceptionStack";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_INVOCATION_CONTEXT = ".invocationContext";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_ACTIVITY_TOKEN = ".activityToken";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_DESTINATION_NAME = "destinationName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_MESSAGE_ID = "messageId";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_RECONNECT = ".reconnect";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_SERVER_URI = ".serverURI";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_MESSAGE_PARCEL = ".PARCEL";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_TRACE_SEVERITY = ".traceSeverity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_ERROR_NUMBER = ".ERROR_NUMBER";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CALLBACK_EXCEPTION = ".exception";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PING_SENDER = ".pingSender.";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PING_WAKELOCK = ".client.";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TRACE_ERROR = "error";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TRACE_DEBUG = "debug";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TRACE_EXCEPTION = "exception";
        
        private Companion() {
            super();
        }
    }
}