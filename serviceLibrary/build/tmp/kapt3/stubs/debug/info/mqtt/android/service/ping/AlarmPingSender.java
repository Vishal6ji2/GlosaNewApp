package info.mqtt.android.service.ping;

import java.lang.System;

/**
 * Default ping sender implementation on Android. It is based on AlarmManager.
 *
 * This class implements the [MqttPingSender] pinger interface
 * allowing applications to send ping packet to server every keep alive interval.
 *
 * @see MqttPingSender
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Linfo/mqtt/android/service/ping/AlarmPingSender;", "Lorg/eclipse/paho/client/mqttv3/MqttPingSender;", "service", "Linfo/mqtt/android/service/MqttService;", "(Linfo/mqtt/android/service/MqttService;)V", "alarmReceiver", "Landroid/content/BroadcastReceiver;", "clientComms", "Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;", "hasStarted", "", "pendingIntent", "Landroid/app/PendingIntent;", "pendingIntentFlags", "", "getService", "()Linfo/mqtt/android/service/MqttService;", "backgroundExecute", "comms", "init", "", "schedule", "delayInMilliseconds", "", "start", "stop", "AlarmReceiver", "Companion", "serviceLibrary_debug"})
public final class AlarmPingSender implements org.eclipse.paho.client.mqttv3.MqttPingSender {
    @org.jetbrains.annotations.NotNull()
    private final info.mqtt.android.service.MqttService service = null;
    private org.eclipse.paho.client.mqttv3.internal.ClientComms clientComms;
    private android.content.BroadcastReceiver alarmReceiver;
    private android.app.PendingIntent pendingIntent;
    private final int pendingIntentFlags = 0;
    @kotlin.jvm.Volatile()
    private volatile boolean hasStarted = false;
    @org.jetbrains.annotations.NotNull()
    public static final info.mqtt.android.service.ping.AlarmPingSender.Companion Companion = null;
    private static final long TIMEOUT = 600000L;
    
    public AlarmPingSender(@org.jetbrains.annotations.NotNull()
    info.mqtt.android.service.MqttService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.mqtt.android.service.MqttService getService() {
        return null;
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.internal.ClientComms comms) {
    }
    
    @java.lang.Override()
    public void start() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void schedule(long delayInMilliseconds) {
    }
    
    public final boolean backgroundExecute(@org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.internal.ClientComms comms) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Linfo/mqtt/android/service/ping/AlarmPingSender$AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "(Linfo/mqtt/android/service/ping/AlarmPingSender;)V", "wakeLockTag", "", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "serviceLibrary_debug"})
    public final class AlarmReceiver extends android.content.BroadcastReceiver {
        private final java.lang.String wakeLockTag = null;
        
        public AlarmReceiver() {
            super();
        }
        
        @android.annotation.SuppressLint(value = {"Wakelock"})
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linfo/mqtt/android/service/ping/AlarmPingSender$Companion;", "", "()V", "TIMEOUT", "", "serviceLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}