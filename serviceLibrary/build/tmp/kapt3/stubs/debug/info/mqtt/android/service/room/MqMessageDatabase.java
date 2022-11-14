package info.mqtt.android.service.room;

import java.lang.System;

@androidx.room.TypeConverters(value = {info.mqtt.android.service.room.Converters.class})
@androidx.room.Database(entities = {info.mqtt.android.service.room.entity.MqMessageEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000f"}, d2 = {"Linfo/mqtt/android/service/room/MqMessageDatabase;", "Landroidx/room/RoomDatabase;", "()V", "discardArrived", "", "clientHandle", "", "id", "persistenceDao", "Linfo/mqtt/android/service/room/MqMessageDao;", "storeArrived", "topic", "message", "Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "Companion", "serviceLibrary_debug"})
public abstract class MqMessageDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final info.mqtt.android.service.room.MqMessageDatabase.Companion Companion = null;
    public static final int MQ_DB_VERSION = 1;
    private static info.mqtt.android.service.room.MqMessageDatabase db;
    
    public MqMessageDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract info.mqtt.android.service.room.MqMessageDao persistenceDao();
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String storeArrived(@org.jetbrains.annotations.NotNull()
    java.lang.String clientHandle, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage message) {
        return null;
    }
    
    public final boolean discardArrived(@org.jetbrains.annotations.NotNull()
    java.lang.String clientHandle, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return false;
    }
    
    @kotlin.Suppress(names = {"SimpleRedundantLet"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Linfo/mqtt/android/service/room/MqMessageDatabase$Companion;", "", "()V", "MQ_DB_VERSION", "", "db", "Linfo/mqtt/android/service/room/MqMessageDatabase;", "getDatabase", "context", "Landroid/content/Context;", "storageName", "", "serviceLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized info.mqtt.android.service.room.MqMessageDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String storageName) {
            return null;
        }
    }
}