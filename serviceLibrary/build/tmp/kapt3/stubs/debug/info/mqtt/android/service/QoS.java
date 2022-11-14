package info.mqtt.android.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Linfo/mqtt/android/service/QoS;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "AtMostOnce", "AtLeastOnce", "ExactlyOnce", "Companion", "serviceLibrary_debug"})
public enum QoS {
    /*public static final*/ AtMostOnce /* = new AtMostOnce(0) */,
    /*public static final*/ AtLeastOnce /* = new AtLeastOnce(0) */,
    /*public static final*/ ExactlyOnce /* = new ExactlyOnce(0) */;
    private final int value = 0;
    @org.jetbrains.annotations.NotNull()
    public static final info.mqtt.android.service.QoS.Companion Companion = null;
    
    QoS(int value) {
    }
    
    public final int getValue() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final info.mqtt.android.service.QoS valueOf(int qos) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Linfo/mqtt/android/service/QoS$Companion;", "", "()V", "valueOf", "Linfo/mqtt/android/service/QoS;", "qos", "", "serviceLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final info.mqtt.android.service.QoS valueOf(int qos) {
            return null;
        }
    }
}