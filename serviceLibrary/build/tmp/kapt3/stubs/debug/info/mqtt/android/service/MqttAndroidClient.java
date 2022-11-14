package info.mqtt.android.service;

import java.lang.System;

/**
 * Enables an android application to communicate with an MQTT server using non-blocking methods.
 *
 * Implementation of the MQTT asynchronous client interface [IMqttAsyncClient] , using the MQTT
 * android service to actually interface with MQTT server. It provides android applications a simple programming interface to all features of the
 * MQTT version 3.1
 * specification including:
 *
 * * connect
 * * publish
 * * subscribe
 * * unsubscribe
 * * disconnect
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0004\u0087\u0001\u0088\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\rJ\b\u0010.\u001a\u00020,H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\u001c\u0010/\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010/\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u000fH\u0016J$\u0010/\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016J\u0012\u00104\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0012\u00107\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0012\u00108\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\u0018H\u0016J\b\u0010;\u001a\u00020\u0012H\u0016J\u001c\u0010;\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020=H\u0016J\"\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020=2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010-\u001a\u000202H\u0016J\b\u0010>\u001a\u00020,H\u0016J\u0010\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020=H\u0016J\u0018\u0010>\u001a\u00020,2\u0006\u0010<\u001a\u00020=2\u0006\u0010?\u001a\u00020=H\u0016J\u0012\u0010@\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\b\u0010A\u001a\u00020,H\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010:\u001a\u00020\u0018H\u0016J\b\u0010D\u001a\u00020\u0018H\u0016J\b\u0010E\u001a\u00020\u0006H\u0016J\b\u0010F\u001a\u00020\u0018H\u0016J\u0014\u0010G\u001a\u0004\u0018\u00010\u00122\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0013\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IH\u0016\u00a2\u0006\u0002\u0010KJ\u0018\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u00020\u0006J\b\u0010Q\u001a\u00020\u0006H\u0016J\b\u0010R\u001a\u00020\u001fH\u0016J\u0012\u0010S\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0018\u0010T\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010U\u001a\u00020\u0018H\u0016J\u0012\u0010V\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0018\u0010W\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010X\u001a\u00020YH\u0016J(\u0010Z\u001a\u00020J2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020]2\u0006\u0010U\u001a\u00020\u00182\u0006\u0010^\u001a\u00020\u001fH\u0016J<\u0010Z\u001a\u00020J2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020]2\u0006\u0010U\u001a\u00020\u00182\u0006\u0010^\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016J\u0018\u0010Z\u001a\u00020J2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010_\u001a\u00020CH\u0016J,\u0010Z\u001a\u00020J2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010_\u001a\u00020C2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016J\b\u0010`\u001a\u00020,H\u0016J\u0010\u0010a\u001a\u00020,2\u0006\u0010b\u001a\u00020\u0001H\u0002J\u0006\u0010c\u001a\u00020,J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020JH\u0016J\u0014\u0010f\u001a\u0004\u0018\u00010\u00122\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0012\u0010g\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0010\u0010h\u001a\u00020,2\u0006\u0010i\u001a\u00020jH\u0016J\u0010\u0010k\u001a\u00020,2\u0006\u0010-\u001a\u00020\rH\u0016J\u0016\u0010l\u001a\u00020,2\u0006\u0010m\u001a\u00020\u00162\u0006\u0010n\u001a\u00020\u0018J\u0010\u0010o\u001a\u00020,2\u0006\u0010p\u001a\u00020\u001fH\u0016J\u0010\u0010q\u001a\u00020,2\b\u0010&\u001a\u0004\u0018\u00010\'J\u000e\u0010r\u001a\u00020,2\u0006\u0010(\u001a\u00020\u001fJ\u001c\u0010s\u001a\u00020,2\b\u0010e\u001a\u0004\u0018\u00010\u00122\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0012\u0010t\u001a\u00020\u00062\b\u0010e\u001a\u0004\u0018\u00010\u0012H\u0002J#\u0010u\u001a\u00020\u00122\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060I2\u0006\u0010U\u001a\u00020vH\u0016\u00a2\u0006\u0002\u0010wJ7\u0010u\u001a\u00020\u00122\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060I2\u0006\u0010U\u001a\u00020v2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016\u00a2\u0006\u0002\u0010xJE\u0010u\u001a\u00020\u00122\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00060I2\u0006\u0010U\u001a\u00020v2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u0001022\f\u0010z\u001a\b\u0012\u0004\u0012\u00020{0IH\u0016\u00a2\u0006\u0002\u0010|J1\u0010u\u001a\u00020\u00122\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00060I2\u0006\u0010U\u001a\u00020v2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020{0IH\u0016\u00a2\u0006\u0002\u0010}J\u0018\u0010u\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0018H\u0016J,\u0010u\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016J4\u0010u\u001a\u00020\u00122\u0006\u0010~\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u0001022\u0006\u0010\u007f\u001a\u00020{H\u0016J \u0010u\u001a\u00020\u00122\u0006\u0010~\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00182\u0006\u0010\u007f\u001a\u00020{H\u0016J\u0013\u0010\u0080\u0001\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0013\u0010\u0081\u0001\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0013\u0010\u0082\u0001\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0007\u0010\u0083\u0001\u001a\u00020,J\u001d\u0010\u0084\u0001\u001a\u00020\u00122\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060IH\u0016\u00a2\u0006\u0003\u0010\u0085\u0001J1\u0010\u0084\u0001\u001a\u00020\u00122\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060I2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016\u00a2\u0006\u0003\u0010\u0086\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u0006H\u0016J%\u0010\u0084\u0001\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u000102H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00060\"R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0089\u0001"}, d2 = {"Linfo/mqtt/android/service/MqttAndroidClient;", "Landroid/content/BroadcastReceiver;", "Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;", "context", "Landroid/content/Context;", "serverURI", "", "clientId", "ackType", "Linfo/mqtt/android/service/Ack;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Linfo/mqtt/android/service/Ack;)V", "callbacksList", "Ljava/util/ArrayList;", "Lorg/eclipse/paho/client/mqttv3/MqttCallback;", "clientConnectOptions", "Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;", "clientHandle", "connectToken", "Lorg/eclipse/paho/client/mqttv3/IMqttToken;", "getContext", "()Landroid/content/Context;", "foregroundServiceNotification", "Landroid/app/Notification;", "foregroundServiceNotificationId", "", "messageAck", "mqttService", "Linfo/mqtt/android/service/MqttService;", "persistence", "Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;", "receiverRegistered", "", "serviceBound", "serviceConnection", "Linfo/mqtt/android/service/MqttAndroidClient$MyServiceConnection;", "tokenMap", "Landroid/util/SparseArray;", "tokenNumber", "traceCallback", "Linfo/mqtt/android/service/MqttTraceHandler;", "traceEnabled", "acknowledgeMessage", "messageId", "addCallback", "", "callback", "close", "connect", "userContext", "", "Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;", "options", "connectAction", "data", "Landroid/os/Bundle;", "connectExtendedAction", "connectionLostAction", "deleteBufferedMessage", "bufferIndex", "disconnect", "quiesceTimeout", "", "disconnectForcibly", "disconnectTimeout", "disconnected", "doConnect", "getBufferedMessage", "Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "getBufferedMessageCount", "getClientId", "getInFlightMessageCount", "getMqttToken", "getPendingDeliveryTokens", "", "Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;", "()[Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;", "getSSLSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "keyStore", "Ljava/io/InputStream;", "password", "getServerURI", "isConnected", "messageArrivedAction", "messageArrivedComplete", "qos", "messageDeliveredAction", "onReceive", "intent", "Landroid/content/Intent;", "publish", "topic", "payload", "", "retained", "message", "reconnect", "registerReceiver", "receiver", "registerResources", "removeMessage", "token", "removeMqttToken", "sendAction", "setBufferOpts", "bufferOpts", "Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;", "setCallback", "setForegroundService", "notification", "id", "setManualAcks", "manualAcks", "setTraceCallback", "setTraceEnabled", "simpleAction", "storeToken", "subscribe", "", "([Ljava/lang/String;[I)Lorg/eclipse/paho/client/mqttv3/IMqttToken;", "([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;", "topicFilters", "messageListeners", "Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;", "([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;", "([Ljava/lang/String;[I[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;", "topicFilter", "messageListener", "subscribeAction", "traceAction", "unSubscribeAction", "unregisterResources", "unsubscribe", "([Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;", "([Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;", "Companion", "MyServiceConnection", "serviceLibrary_debug"})
public final class MqttAndroidClient extends android.content.BroadcastReceiver implements org.eclipse.paho.client.mqttv3.IMqttAsyncClient {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final java.lang.String serverURI = null;
    private final java.lang.String clientId = null;
    private final info.mqtt.android.service.MqttAndroidClient.MyServiceConnection serviceConnection = null;
    private final android.util.SparseArray<org.eclipse.paho.client.mqttv3.IMqttToken> tokenMap = null;
    private final info.mqtt.android.service.Ack messageAck = null;
    private info.mqtt.android.service.MqttService mqttService;
    private java.lang.String clientHandle;
    private int tokenNumber = 0;
    private org.eclipse.paho.client.mqttv3.MqttClientPersistence persistence;
    private org.eclipse.paho.client.mqttv3.MqttConnectOptions clientConnectOptions;
    private org.eclipse.paho.client.mqttv3.IMqttToken connectToken;
    private java.util.ArrayList<org.eclipse.paho.client.mqttv3.MqttCallback> callbacksList;
    private info.mqtt.android.service.MqttTraceHandler traceCallback;
    private boolean traceEnabled = false;
    @kotlin.jvm.Volatile()
    private volatile boolean receiverRegistered = false;
    @kotlin.jvm.Volatile()
    private volatile boolean serviceBound = false;
    private int foregroundServiceNotificationId = -1;
    private android.app.Notification foregroundServiceNotification;
    @org.jetbrains.annotations.NotNull()
    public static final info.mqtt.android.service.MqttAndroidClient.Companion Companion = null;
    private static final java.lang.String SERVICE_NAME = null;
    private static final java.util.concurrent.ExecutorService pool = null;
    
    public MqttAndroidClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String serverURI, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    info.mqtt.android.service.Ack ackType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    /**
     * Determines if this client is currently connected to the server.
     *
     * @return `true` if connected, `false` otherwise.
     */
    @java.lang.Override()
    public boolean isConnected() {
        return false;
    }
    
    /**
     * Returns the client ID used by this client.
     *
     * All clients connected to the same server or server farm must have a
     * unique ID.
     *
     * @return the client ID used by this client.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientId() {
        return null;
    }
    
    /**
     * Returns the URI address of the server used by this client.
     *
     *
     * The format of the returned String is the same as that used on the
     * constructor.
     *
     *
     * @return the server's address, as a URI String.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getServerURI() {
        return null;
    }
    
    /**
     * Close the client. Releases all resource associated with the client. After
     * the client has been closed it cannot be reused. For instance attempts to
     * connect will fail.
     */
    @java.lang.Override()
    public void close() {
    }
    
    /**
     * Connects to an MQTT server using the default options.
     *
     * The default options are specified in [MqttConnectOptions] class.
     *
     * @return token used to track and wait for the connect to complete. The token will be passed to the callback methods if a callback is set.
     * @see .connect
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken connect() {
        return null;
    }
    
    /**
     * Connects to an MQTT server using the provided connect options.
     *
     * The connection will be established using the options specified in the [MqttConnectOptions] parameter.
     *
     * @param options a set of connection parameters that override the defaults.
     * @return token used to track and wait for the connect to complete. The token will be passed to any callback that has been set.
     * @see .connect
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken connect(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttConnectOptions options) {
        return null;
    }
    
    /**
     * Connects to an MQTT server using the default options.
     *
     * The default options are specified in [MqttConnectOptions] class.
     *
     * @param userContext optional object used to pass context to the callback. Use null if not required.
     * @param callback    optional listener that will be notified when the connect completes. Use null if not required.
     * @return token used to track and wait for the connect to complete. The token will be passed to any callback that has been set.
     * @see .connect
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken connect(@org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    /**
     * Connects to an MQTT server using the specified options.
     *
     * The server to connect to is specified on the constructor. It is recommended to call [.setCallback] prior to
     * connecting in order that messages destined for the client can be accepted as soon as the client is connected.
     *
     * The method returns control before the connect completes. Completion can be tracked by:
     *
     * * Waiting on the returned token [IMqttToken.waitForCompletion]
     * or
     * * Passing in a callback [IMqttActionListener]
     *
     * @param options     a set of connection parameters that override the defaults.
     * @param userContext optional object for used to pass context to the callback. Use null if not required.
     * @param callback    optional listener that will be notified when the connect completes. Use null if not required.
     * @return token used to track and wait for the connect to complete. The token will be passed to any callback that has been set.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken connect(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttConnectOptions options, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    private final void registerReceiver(android.content.BroadcastReceiver receiver) {
    }
    
    /**
     * Actually do the mqtt connect operation
     */
    private final void doConnect() {
    }
    
    /**
     * Disconnects from the server.
     *
     * An attempt is made to quiesce the client allowing outstanding work to
     * complete before disconnecting. It will wait for a maximum of 30 seconds
     * for work to quiesce before disconnecting. This method must not be called from inside [MqttCallback] methods.
     *
     * @return token used to track and wait for disconnect to complete. The token will be passed to any callback that has been set.
     * @see .disconnect
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken disconnect() {
        return null;
    }
    
    /**
     * Disconnects from the server.
     *
     * An attempt is made to quiesce the client allowing outstanding work to
     * complete before disconnecting. It will wait for a maximum of the
     * specified quiesce time for work to complete before disconnecting. This
     * method must not be called from inside [MqttCallback] methods.
     *
     * @param quiesceTimeout the amount of time in milliseconds to allow for existing work
     * to finish before disconnecting. A value of zero or less means the client will not quiesce.
     * @return token used to track and wait for disconnect to complete. The token will be passed to the callback methods if a callback is set.
     * @see .disconnect
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken disconnect(long quiesceTimeout) {
        return null;
    }
    
    /**
     * Disconnects from the server.
     *
     * An attempt is made to quiesce the client allowing outstanding work to complete before disconnecting. It will wait for a maximum of 30 seconds
     * for work to quiesce before disconnecting. This method must not be called from inside [MqttCallback] methods.
     *
     * @param userContext optional object used to pass context to the callback. Use null if not required.
     * @param callback    optional listener that will be notified when the disconnect completes. Use null if not required.
     * @return token used to track and wait for the disconnect to complete. The token will be passed to any callback that has been set.
     * @see .disconnect
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken disconnect(@org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    /**
     * Disconnects from the server.
     *
     * The client will wait for [MqttCallback] methods to complete. It
     * will then wait for up to the quiesce timeout to allow for work which has
     * already been initiated to complete. For instance when a QoS 2 message has
     * started flowing to the server but the QoS 2 flow has not completed.It
     * prevents new messages being accepted and does not send any messages that
     * have been accepted but not yet started delivery across the network to the
     * server. When work has completed or after the quiesce timeout, the client
     * will disconnect from the server. If the cleanSession flag was set to false and next time it is also set to false in the connection, the
     * messages made in QoS 1 or 2 which were not previously delivered will be delivered this time.
     *
     * This method must not be called from inside [MqttCallback] methods.
     *
     * The method returns control before the disconnect completes. Completioncan be tracked by:
     *
     * * Waiting on the returned token [IMqttToken.waitForCompletion]
     * or
     * * Passing in a callback [IMqttActionListener]
     *
     * @param quiesceTimeout the amount of time in milliseconds to allow for existing work
     * to finish before disconnecting. A value of zero or less means the client will not quiesce.
     * @param userContext    optional object used to pass context to the callback. Use null if not required.
     * @param callback       optional listener that will be notified when the disconnect completes. Use null if not required.
     * @return token used to track and wait for the disconnect to complete. The token will be passed to any callback that has been set.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken disconnect(long quiesceTimeout, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    /**
     * Publishes a message to a topic on the server.
     * A convenience method, which will create a new [MqttMessage] object
     * with a byte array payload and the specified QoS, and then publish it.
     *
     * @param topic    to deliver the message to, for example "finance\/stock\/ibm".
     * @param payload  the byte array to use as the payload
     * @param qos      the Quality of Service to deliver the message at. Valid values are 0, 1 or 2.
     * @param retained whether or not this message should be retained by the server.
     * @return token used to track and wait for the publish to complete. The token will be passed to any callback that has been set.
     * @throws IllegalArgumentException if value of QoS is not 0, 1 or 2.
     * @see .publish
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttDeliveryToken publish(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    byte[] payload, int qos, boolean retained) {
        return null;
    }
    
    /**
     * Publishes a message to a topic on the server. Takes an
     * [MqttMessage] message and delivers it to the server at the
     * requested quality of service.
     *
     * @param topic   to deliver the message to, for example "finance/stock/ibm".
     * @param message to deliver to the server
     * @return token used to track and wait for the publish to complete. The token will be passed to any callback that has been set.
     * @throws IllegalArgumentException if value of QoS is not 0, 1 or 2.
     * @see .publish
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttDeliveryToken publish(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage message) {
        return null;
    }
    
    /**
     * Publishes a message to a topic on the server.
     *
     * A convenience method, which will create a new [MqttMessage] object
     * with a byte array payload, the specified QoS and retained, then publish it.
     *
     * @param topic       to deliver the message to, for example "finance/stock/ibm".
     * @param payload     the byte array to use as the payload
     * @param qos         the Quality of Service to deliver the message at. Valid values
     * are 0, 1 or 2.
     * @param retained    whether or not this message should be retained by the server.
     * @param userContext optional object used to pass context to the callback. Use null if not required.
     * @param callback    optional listener that will be notified when message delivery
     * has completed to the requested quality of service
     * @return token used to track and wait for the publish to complete. The token will be passed to any callback that has been set.
     * @throws IllegalArgumentException if value of QoS is not 0, 1 or 2.
     * @see .publish
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttDeliveryToken publish(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    byte[] payload, int qos, boolean retained, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    /**
     * Publishes a message to a topic on the server.
     *
     * Once this method has returned cleanly, the message has been accepted for
     * publication by the client and will be delivered on a background thread.
     * In the event the connection fails or the client stops, Messages will be
     * delivered to the requested quality of service once the connection is
     * re-established to the server on condition that:
     *
     * * The connection is re-established with the same clientID
     * * The original connection was made with (@link MqttConnectOptions#setCleanSession(boolean)} set to false
     * * The connection is re-established with (@link MqttConnectOptions#setCleanSession(boolean)} set to false
     * * Depending when the failure occurs QoS 0 messages may not be elivered.
     *
     * When building an application, the design of the topic tree should take
     * into account the following principles of topic name syntax and semantics:
     *
     * * A topic must be at least one character long.
     * * Topic names are case sensitive. For example, *ACCOUNTS* and
     * *Accounts* are two different topics.
     * * Topic names can include the space character. For example,
     * *Accounts
     * payable* is a valid topic.
     * * A leading "/" creates a distinct topic. For example,
     * finance* is different from *finance*.
     * matches "+/+" and "/+", but not "+".
     * * Do not include the null character (Unicode *\x0000*) in any topic.
     *
     * The following principles apply to the construction and content of a topic
     * tree:
     *
     * * The length is limited to 64k but within that there are no limits to
     * the number of levels in a topic tree.
     * * There can be any number of root nodes; that is, there can be any
     * number of topic trees.
     *
     * The method returns control before the publish completes. Completion can
     * be tracked by:
     *
     * * Setting an [IMqttAsyncClient.setCallback] where
     * the [MqttCallback.deliveryComplete] method will
     * be called.
     * * Waiting on the returned token [MqttToken.waitForCompletion]
     * or
     * * Passing in a callback [IMqttActionListener] to this method
     *
     * @param topic to deliver the message to, for example "finance/stock/ibm".
     * @param message to deliver to the server
     * @param userContext optional object used to pass context to the callback. Use null if not required.
     * @param callback optional listener that will be notified when message delivery has completed to the requested quality of service
     * @ return token used to track and wait for the publish to complete. The token will be passed to callback methods if set.
     * @throws IllegalArgumentException if value of QoS is not 0, 1 or 2.
     * @see MqttMessage
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttDeliveryToken publish(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage message, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    /**
     * Subscribe to a topic, which may include wildcards.
     *
     * @param topic the topic to subscribe to, which can include wildcards.
     * @param qos   the maximum quality of service at which to subscribe. Messages
     * published at a lower quality of service will be received at the published QoS. Messages published at a higher quality of
     * service will be received using the QoS specified on the subscription.
     * @return token used to track and wait for the subscribe to complete. The token will be passed to callback methods if set.
     * @see .subscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, int qos) {
        return null;
    }
    
    /**
     * Subscribe to multiple topics, each topic may include wildcards.
     *
     * Provides an optimized way to subscribe to multiple topics compared to
     * subscribing to each one individually.
     *
     * @param topic one or more topics to subscribe to, which can include
     * wildcards
     * @param qos   the maximum quality of service at which to subscribe. Messages
     * published at a lower quality of service will be received at the published QoS. Messages published at a higher quality of
     * service will be received using the QoS specified on the subscription.
     * @return token used to track and wait for the subscription to complete. The token will be passed to callback methods if set.
     * @see .subscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String[] topic, @org.jetbrains.annotations.NotNull()
    int[] qos) {
        return null;
    }
    
    /**
     * Subscribe to a topic, which may include wildcards.
     *
     * @param topic       the topic to subscribe to, which can include wildcards.
     * @param qos         the maximum quality of service at which to subscribe. Messages
     * published at a lower quality of service will be received at the published QoS. Messages published at a higher quality of
     * service will be received using the QoS specified on the subscription.
     * @param userContext optional object used to pass context to the callback. Use null if not required.
     * @param callback    optional listener that will be notified when subscribe has completed
     * @return token used to track and wait for the subscribe to complete. The token will be passed to callback methods if set.
     * @see .subscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, int qos, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    /**
     * Subscribes to multiple topics, each topic may include wildcards.
     *
     * Provides an optimized way to subscribe to multiple topics compared to subscribing to each one individually.
     *
     * The [.setCallback] method should be called before this method, otherwise any received messages will be discarded.
     *
     * If (@link MqttConnectOptions#setCleanSession(boolean)} was set to true,
     * when connecting to the server, the subscription remains in place until
     * either:
     *
     * * The client disconnects
     * * An unsubscribe method is called to unsubscribe the topic
     *
     * If (@link MqttConnectOptions#setCleanSession(boolean)} was set to false,
     * when connecting to the server, the subscription remains in place
     * until either:
     *
     * * An unsubscribe method is called to unsubscribe the topic
     * * The next time the client connects with cleanSession set to true
     *
     * With cleanSession set to false the MQTT server will store messages
     * on behalf of the client when the client is not connected. The next time
     * the client connects with the **same client ID** the server will
     * deliver the stored messages to the client.
     *
     * The "topic filter" string is used when subscription may contain special
     * characters, which allows you to subscribe to multiple topics at once.
     * <dl>
     * <dt>Topic level separator</dt>
     * <dd>The forward slash (/) is used to separate each level within a topic
     * tree and provide a hierarchical structure to the topic space. The use of
     * the topic level separator is significant when the two wildcard characters
     * are encountered in topics specified by subscribers.</dd>
     *   </dl> *
     *
     * <dt>Multi-level wildcard</dt>
     * <dd>
     *   </dd> *
     *
     * The number sign (#) is a wildcard character that matches any number of
     * levels within a topic. For example, if you subscribe to <span><span class="filepath">finance/stock/ibm/#</span></span>, you receive messages
     * on these topics:
     *
     * * <pre>finance/stock/ibm</pre>
     * * <pre>finance/stock/ibm/closingprice</pre>
     * * <pre>finance/stock/ibm/currentprice</pre>
     *
     * The multi-level wildcard can represent zero or more levels. Therefore,
     * *finance/#* can also match the singular *finance*, where
     * *#* represents zero levels. The topic level separator is
     * meaningless in this context, because there are no levels to separate.
     *
     * The <span>multi-level</span> wildcard can be specified only on its own or
     * next to the topic level separator character. Therefore, *#* and
     * *finance/#* are both valid, but *finance#* is not valid.
     * <span>The multi-level wildcard must be the last character used within the
     * topic tree. For example, *finance/#* is valid but
     * *finance/#/closingprice* is not valid.</span>
     *
     * <dt>Single-level wildcard</dt>
     * <dd>
     *   </dd> *
     *
     * The plus sign (+) is a wildcard character that matches only one topic
     * level. For example, *finance/stock/+* matches
     * *finance/stock/ibm* and *finance/stock/xyz*, but not
     * *finance/stock/ibm/closingprice*. Also, because the single-level
     * wildcard matches only a single level, *finance/+* does not match
     * *finance*.
     *
     * Use the single-level wildcard at any level in the topic tree, and in
     * conjunction with the multilevel wildcard. Specify the single-level
     * wildcard next to the topic level separator, except when it is specified
     * on its own. Therefore, *+* and *finance/+* are both valid,
     * but *finance+* is not valid. <span>The single-level wildcard can
     * be used at the end of the topic tree or within the topic tree. For
     * example, *finance/+* and *finance/+/ibm* are both
     * valid.</span>
     *
     * The method returns control before the subscribe completes. Completion can
     * be tracked by:
     *
     * * Waiting on the supplied token [MqttToken.waitForCompletion]
     * or
     * * Passing in a callback [IMqttActionListener] to this method
     *
     * @param topic       one or more topics to subscribe to, which can include
     * wildcards
     * @param qos         the maximum quality of service to subscribe each topic
     * at.Messages published at a lower quality of service will be received at the published QoS. Messages published at a higher
     * quality of service will be received using the QoS specified on the subscription.
     * @param userContext optional object used to pass context to the callback. Use null if not required.
     * @param callback    optional listener that will be notified when subscribe has completed
     * @return token used to track and wait for the subscribe to complete. The token will be passed to callback methods if set.
     * @throws IllegalArgumentException if the two supplied arrays are not the same size.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String[] topic, @org.jetbrains.annotations.NotNull()
    int[] qos, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    /**
     * Subscribe to a topic, which may include wildcards.
     *
     * @param topicFilter     the topic to subscribe to, which can include wildcards.
     * @param qos             the maximum quality of service at which to subscribe. Messages
     * published at a lower quality of service will be received at the published
     * QoS.  Messages published at a higher quality of service will be received using the QoS specified on the subscribe.
     * @param userContext     optional object used to pass context to the callback. Use null if not required.
     * @param callback        optional listener that will be notified when subscribe has completed
     * @param messageListener a callback to handle incoming messages
     * @return token used to track and wait for the subscribe to complete. The token will be passed to callback methods if set.
     * @see .subscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topicFilter, int qos, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.IMqttMessageListener messageListener) {
        return null;
    }
    
    /**
     * Subscribe to a topic, which may include wildcards.
     *
     * @param topicFilter     the topic to subscribe to, which can include wildcards.
     * @param qos             the maximum quality of service at which to subscribe. Messages
     * published at a lower quality of service will be received at the published
     * QoS.  Messages published at a higher quality of service will be received using the QoS specified on the subscribe.
     * @param messageListener a callback to handle incoming messages
     * @return token used to track and wait for the subscribe to complete. The token will be passed to callback methods if set.
     * @see .subscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topicFilter, int qos, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.IMqttMessageListener messageListener) {
        return null;
    }
    
    /**
     * Subscribe to multiple topics, each of which may include wildcards.
     *
     * Provides an optimized way to subscribe to multiple topics compared to
     * subscribing to each one individually.
     *
     * @param topicFilters     one or more topics to subscribe to, which can include wildcards
     * @param qos              the maximum quality of service at which to subscribe. Messages
     * published at a lower quality of service will be received at the published
     * QoS.  Messages published at a higher quality of service will be received using the QoS specified on the subscribe.
     * @param messageListeners an array of callbacks to handle incoming messages
     * @return token used to track and wait for the subscribe to complete. The token will be passed to callback methods if set.
     * @see .subscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String[] topicFilters, @org.jetbrains.annotations.NotNull()
    int[] qos, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.IMqttMessageListener[] messageListeners) {
        return null;
    }
    
    /**
     * Subscribe to multiple topics, each of which may include wildcards.
     *
     * Provides an optimized way to subscribe to multiple topics compared to
     * subscribing to each one individually.
     *
     * @param topicFilters     one or more topics to subscribe to, which can include wildcards
     * @param qos              the maximum quality of service at which to subscribe. Messages published at a lower quality of service will be
     * received at the published
     * QoS.  Messages published at a higher quality of service will be received using the QoS specified on the subscribe.
     * @param userContext      optional object used to pass context to the callback. Use null if not required.
     * @param callback         optional listener that will be notified when subscribe has completed
     * @param messageListeners an array of callbacks to handle incoming messages
     * @return token used to track and wait for the subscribe to complete. The token will be passed to callback methods if set.
     * @see .subscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String[] topicFilters, @org.jetbrains.annotations.NotNull()
    int[] qos, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.IMqttMessageListener[] messageListeners) {
        return null;
    }
    
    /**
     * Requests the server unsubscribe the client from a topic.
     *
     * @param topic the topic to unsubscribe from. It must match a topic specified on an earlier subscribe.
     * @return token used to track and wait for the unsubscribe to complete. The token will be passed to callback methods if set.
     * @see .unsubscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken unsubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
        return null;
    }
    
    /**
     * Requests the server to unsubscribe the client from one or more topics.
     *
     * @param topic one or more topics to unsubscribe from. Each topic must match one specified on an earlier subscription.
     * @return token used to track and wait for the unsubscribe to complete. The token will be passed to callback methods if set.
     * @see .unsubscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken unsubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String[] topic) {
        return null;
    }
    
    /**
     * Requests the server to unsubscribe the client from a topics.
     *
     * @param topic       the topic to unsubscribe from. It must match a topic specified on an earlier subscribe.
     * @param userContext optional object used to pass context to the callback. Use null if not required.
     * @param callback    optional listener that will be notified when unsubscribe has completed
     * @return token used to track and wait for the unsubscribe to complete. The token will be passed to callback methods if set.
     * @see .unsubscribe
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken unsubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    /**
     * Requests the server to unsubscribe the client from one or more topics.
     *
     * Unsubcribing is the opposite of subscribing. When the server receives the
     * unsubscribe request it looks to see if it can find a matching
     * subscription for the client and then removes it. After this point the
     * server will send no more messages to the client for this subscription.
     *
     * The topic(s) specified on the unsubscribe must match the topic(s)
     * specified in the original subscribe request for the unsubscribe to
     * succeed
     *
     * The method returns control before the unsubscribe completes. Completion
     * can be tracked by:
     *
     * * Waiting on the returned token [MqttToken.waitForCompletion]
     * or
     * * Passing in a callback [IMqttActionListener] to this method
     *
     * @param topic       one or more topics to unsubscribe from. Each topic must match one specified on an earlier subscription.
     * @param userContext optional object used to pass context to the callback. Use null if not required.
     * @param callback    optional listener that will be notified when unsubscribe has completed
     * @return token used to track and wait for the unsubscribe to complete. The token will be passed to callback methods if set.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttToken unsubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String[] topic, @org.jetbrains.annotations.Nullable()
    java.lang.Object userContext, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttActionListener callback) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttException.class})
    @java.lang.Override()
    public boolean removeMessage(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.IMqttDeliveryToken token) throws org.eclipse.paho.client.mqttv3.MqttException {
        return false;
    }
    
    /**
     * Returns the delivery tokens for any outstanding publish operations.
     *
     * If a client has been restarted and there are messages that were in the
     * process of being delivered when the client stopped, this method returns a
     * token for each in-flight message to enable the delivery to be tracked.
     * Alternately the [MqttCallback.deliveryComplete]
     * callback can be used to track the delivery of outstanding messages.
     *
     * If a client connects with cleanSession true then there will be no
     * delivery tokens as the cleanSession option deletes all earlier state. For
     * state to be remembered the client must connect with cleanSession set to
     * false
     *
     * @return zero or more delivery tokens
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.IMqttDeliveryToken[] getPendingDeliveryTokens() {
        return null;
    }
    
    /**
     * Sets a callback listener to use for events that happen asynchronously.
     *
     * There are a number of events that the listener will be notified about.
     * These include:
     *
     * * A new message has arrived and is ready to be processed
     * * The connection to the server has been lost
     * * Delivery of a message to the server has completed
     *
     * Other events that track the progress of an individual operation such as
     * connect and subscribe can be tracked using the [MqttToken] returned
     * from each non-blocking method or using setting a
     * [IMqttActionListener] on the non-blocking method.
     *
     * @param callback which will be invoked for certain asynchronous events
     * @see MqttCallback
     */
    @java.lang.Override()
    public void setCallback(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttCallback callback) {
    }
    
    /**
     * Adds a callback listener to use for events that happen asynchronously.
     *
     * There are a number of events that the listener will be notified about.
     * These include:
     *
     * * A new message has arrived and is ready to be processed
     * * The connection to the server has been lost
     * * Delivery of a message to the server has completed
     *
     * Other events that track the progress of an individual operation such as
     * connect and subscribe can be tracked using the [MqttToken] returned
     * from each non-blocking method or using setting a
     * [IMqttActionListener] on the non-blocking method.
     *
     * @param callback which will be invoked for certain asynchronous events
     * @see MqttCallback
     */
    public final void addCallback(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttCallback callback) {
    }
    
    /**
     * identify the callback to be invoked when making tracing calls back into
     * the Activity
     *
     * @param traceCallback handler
     */
    public final void setTraceCallback(@org.jetbrains.annotations.Nullable()
    info.mqtt.android.service.MqttTraceHandler traceCallback) {
    }
    
    /**
     * turn tracing on and off
     *
     * @param traceEnabled set `true` to enable trace, otherwise, set
     * `false` to disable trace
     */
    public final void setTraceEnabled(boolean traceEnabled) {
    }
    
    /**
     * Process incoming Intent objects representing the results of operations
     * and asynchronous activities such as message received
     *
     * **Note:** This is only a public method because the Android APIs require such.<br></br>
     * This method should not be explicitly invoked.
     */
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    /**
     * Acknowledges a message received on the
     * [MqttCallback.messageArrived]
     *
     * @param messageId the messageId received from the MqttMessage (To access this
     * field you need to cast [MqttMessage] to
     * [ParcelableMqttMessage])
     * @return whether or not the message was successfully acknowledged
     */
    public final boolean acknowledgeMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId) {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttException.class})
    @java.lang.Override()
    public void messageArrivedComplete(int messageId, int qos) throws org.eclipse.paho.client.mqttv3.MqttException {
    }
    
    @java.lang.Override()
    public void setManualAcks(boolean manualAcks) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttException.class})
    @java.lang.Override()
    public void reconnect() throws org.eclipse.paho.client.mqttv3.MqttException {
    }
    
    /**
     * Process the results of a connection
     */
    private final void connectAction(android.os.Bundle data) {
    }
    
    /**
     * Process a notification that we have disconnected
     */
    private final void disconnected(android.os.Bundle data) {
    }
    
    /**
     * Process a Connection Lost notification
     */
    private final void connectionLostAction(android.os.Bundle data) {
    }
    
    private final void connectExtendedAction(android.os.Bundle data) {
    }
    
    /**
     * Common processing for many notifications
     *
     * @param token the token associated with the action being undertake
     * @param data  the result data
     */
    private final void simpleAction(org.eclipse.paho.client.mqttv3.IMqttToken token, android.os.Bundle data) {
    }
    
    /**
     * Process notification of a publish(send) operation
     */
    private final void sendAction(android.os.Bundle data) {
    }
    
    /**
     * Process notification of a subscribe operation
     */
    private final void subscribeAction(android.os.Bundle data) {
    }
    
    /**
     * Process notification of an unsubscribe operation
     */
    private final void unSubscribeAction(android.os.Bundle data) {
    }
    
    /**
     * Process notification of a published message having been delivered
     */
    private final void messageDeliveredAction(android.os.Bundle data) {
    }
    
    /**
     * Process notification of a message's arrival
     */
    private final void messageArrivedAction(android.os.Bundle data) {
    }
    
    /**
     * Process trace action - pass trace data back to the callback
     */
    private final void traceAction(android.os.Bundle data) {
    }
    
    /**
     * @param token identifying an operation
     * @return an identifier for the token which can be passed to the Android
     * Service
     */
    @kotlin.jvm.Synchronized()
    private final synchronized java.lang.String storeToken(org.eclipse.paho.client.mqttv3.IMqttToken token) {
        return null;
    }
    
    /**
     * Get a token identified by a string, and remove it from our map
     *
     * @return the token
     */
    @kotlin.jvm.Synchronized()
    private final synchronized org.eclipse.paho.client.mqttv3.IMqttToken removeMqttToken(android.os.Bundle data) {
        return null;
    }
    
    /**
     * Get a token identified by a string, and remove it from our map
     *
     * @return the token
     */
    @kotlin.jvm.Synchronized()
    private final synchronized org.eclipse.paho.client.mqttv3.IMqttToken getMqttToken(android.os.Bundle data) {
        return null;
    }
    
    /**
     * Sets foregroundServiceNotification object. If it is not null at the time of
     * MqttService start then the service  will run in foreground mode which is
     * mandatory to keep MQTT service operation when app is
     * in the background on Android version >=8.
     *
     *
     * This method has no effect if Build.VERSION.SDK_INT < Build.VERSION_CODES.O
     *
     * @param notification notification to be used when MqttService runs in foreground mode
     */
    public final void setForegroundService(@org.jetbrains.annotations.NotNull()
    android.app.Notification notification, int id) {
    }
    
    /**
     * Sets the DisconnectedBufferOptions for this client
     *
     * @param bufferOpts the DisconnectedBufferOptions
     */
    @java.lang.Override()
    public void setBufferOpts(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions bufferOpts) {
    }
    
    @java.lang.Override()
    public int getBufferedMessageCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.eclipse.paho.client.mqttv3.MqttMessage getBufferedMessage(int bufferIndex) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteBufferedMessage(int bufferIndex) {
    }
    
    @java.lang.Override()
    public int getInFlightMessageCount() {
        return 0;
    }
    
    /**
     * Get the SSLSocketFactory using SSL key store and password
     * A convenience method, which will help user to create a SSLSocketFactory
     * object
     *
     * @param keyStore the SSL key store which is generated by some SSL key tool,
     * such as keytool in Java JDK
     * @param password the password of the key store which is set when the key store
     * is generated
     * @return SSLSocketFactory used to connect to the server with SSL
     * authentication
     * @throws MqttSecurityException if there was any error when getting the SSLSocketFactory
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttSecurityException.class})
    public final javax.net.ssl.SSLSocketFactory getSSLSocketFactory(@org.jetbrains.annotations.Nullable()
    java.io.InputStream keyStore, @org.jetbrains.annotations.NotNull()
    java.lang.String password) throws org.eclipse.paho.client.mqttv3.MqttSecurityException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttException.class})
    @java.lang.Override()
    public void disconnectForcibly() throws org.eclipse.paho.client.mqttv3.MqttException {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttException.class})
    @java.lang.Override()
    public void disconnectForcibly(long disconnectTimeout) throws org.eclipse.paho.client.mqttv3.MqttException {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.eclipse.paho.client.mqttv3.MqttException.class})
    @java.lang.Override()
    public void disconnectForcibly(long quiesceTimeout, long disconnectTimeout) throws org.eclipse.paho.client.mqttv3.MqttException {
    }
    
    /**
     * Unregister receiver which receives intent from MqttService avoids
     * IntentReceiver leaks.
     */
    public final void unregisterResources() {
    }
    
    /**
     * Register receiver to receiver intent from MqttService. Call this method when activity is hidden and become to show again.
     */
    public final void registerResources() {
    }
    
    /**
     * ServiceConnection to process when we bind to our service
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Linfo/mqtt/android/service/MqttAndroidClient$MyServiceConnection;", "Landroid/content/ServiceConnection;", "(Linfo/mqtt/android/service/MqttAndroidClient;)V", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "binder", "Landroid/os/IBinder;", "onServiceDisconnected", "serviceLibrary_debug"})
    final class MyServiceConnection implements android.content.ServiceConnection {
        
        public MyServiceConnection() {
            super();
        }
        
        @java.lang.Override()
        public void onServiceConnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName name, @org.jetbrains.annotations.NotNull()
        android.os.IBinder binder) {
        }
        
        @java.lang.Override()
        public void onServiceDisconnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName name) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Linfo/mqtt/android/service/MqttAndroidClient$Companion;", "", "()V", "SERVICE_NAME", "", "kotlin.jvm.PlatformType", "pool", "Ljava/util/concurrent/ExecutorService;", "serviceLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}