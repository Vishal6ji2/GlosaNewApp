package info.mqtt.android.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\"\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH&\u00a8\u0006\u000b"}, d2 = {"Linfo/mqtt/android/service/MqttTraceHandler;", "", "traceDebug", "", "message", "", "traceError", "traceException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "serviceLibrary_debug"})
public abstract interface MqttTraceHandler {
    
    public abstract void traceDebug(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void traceError(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void traceException(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Exception e);
}