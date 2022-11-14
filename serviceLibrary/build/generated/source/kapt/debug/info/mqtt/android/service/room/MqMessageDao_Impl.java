package info.mqtt.android.service.room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import info.mqtt.android.service.QoS;
import info.mqtt.android.service.room.entity.MqMessageEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.paho.client.mqttv3.MqttMessage;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MqMessageDao_Impl implements MqMessageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MqMessageEntity> __insertionAdapterOfMqMessageEntity;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<MqMessageEntity> __deletionAdapterOfMqMessageEntity;

  private final EntityDeletionOrUpdateAdapter<MqMessageEntity> __updateAdapterOfMqMessageEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteClientHandle;

  public MqMessageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMqMessageEntity = new EntityInsertionAdapter<MqMessageEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MqMessageEntity` (`messageId`,`clientHandle`,`topic`,`mqttMessage`,`qos`,`retained`,`duplicate`,`timestamp`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MqMessageEntity value) {
        if (value.getMessageId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMessageId());
        }
        if (value.getClientHandle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getClientHandle());
        }
        if (value.getTopic() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTopic());
        }
        final String _tmp = __converters.fromMqttMessage(value.getMqttMessage());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final int _tmp_1 = __converters.fromQoS(value.getQos());
        stmt.bindLong(5, _tmp_1);
        final int _tmp_2 = value.getRetained() ? 1 : 0;
        stmt.bindLong(6, _tmp_2);
        final int _tmp_3 = value.getDuplicate() ? 1 : 0;
        stmt.bindLong(7, _tmp_3);
        stmt.bindLong(8, value.getTimestamp());
      }
    };
    this.__deletionAdapterOfMqMessageEntity = new EntityDeletionOrUpdateAdapter<MqMessageEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `MqMessageEntity` WHERE `messageId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MqMessageEntity value) {
        if (value.getMessageId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMessageId());
        }
      }
    };
    this.__updateAdapterOfMqMessageEntity = new EntityDeletionOrUpdateAdapter<MqMessageEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `MqMessageEntity` SET `messageId` = ?,`clientHandle` = ?,`topic` = ?,`mqttMessage` = ?,`qos` = ?,`retained` = ?,`duplicate` = ?,`timestamp` = ? WHERE `messageId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MqMessageEntity value) {
        if (value.getMessageId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMessageId());
        }
        if (value.getClientHandle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getClientHandle());
        }
        if (value.getTopic() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTopic());
        }
        final String _tmp = __converters.fromMqttMessage(value.getMqttMessage());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final int _tmp_1 = __converters.fromQoS(value.getQos());
        stmt.bindLong(5, _tmp_1);
        final int _tmp_2 = value.getRetained() ? 1 : 0;
        stmt.bindLong(6, _tmp_2);
        final int _tmp_3 = value.getDuplicate() ? 1 : 0;
        stmt.bindLong(7, _tmp_3);
        stmt.bindLong(8, value.getTimestamp());
        if (value.getMessageId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMessageId());
        }
      }
    };
    this.__preparedStmtOfDeleteId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM MqMessageEntity WHERE clientHandle = ? AND messageId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteClientHandle = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM MqMessageEntity WHERE clientHandle = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final MqMessageEntity MqMessageEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfMqMessageEntity.insertAndReturnId(MqMessageEntity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final MqMessageEntity MqMessageEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMqMessageEntity.handle(MqMessageEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateAll(final MqMessageEntity... MqMessageEntities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMqMessageEntity.handleMultiple(MqMessageEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteId(final String clientHandle, final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteId.acquire();
    int _argIndex = 1;
    if (clientHandle == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, clientHandle);
    }
    _argIndex = 2;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteId.release(_stmt);
    }
  }

  @Override
  public int deleteClientHandle(final String clientHandle) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteClientHandle.acquire();
    int _argIndex = 1;
    if (clientHandle == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, clientHandle);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteClientHandle.release(_stmt);
    }
  }

  @Override
  public List<MqMessageEntity> getAll() {
    final String _sql = "SELECT * FROM MQMessageEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMessageId = CursorUtil.getColumnIndexOrThrow(_cursor, "messageId");
      final int _cursorIndexOfClientHandle = CursorUtil.getColumnIndexOrThrow(_cursor, "clientHandle");
      final int _cursorIndexOfTopic = CursorUtil.getColumnIndexOrThrow(_cursor, "topic");
      final int _cursorIndexOfMqttMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "mqttMessage");
      final int _cursorIndexOfQos = CursorUtil.getColumnIndexOrThrow(_cursor, "qos");
      final int _cursorIndexOfRetained = CursorUtil.getColumnIndexOrThrow(_cursor, "retained");
      final int _cursorIndexOfDuplicate = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final List<MqMessageEntity> _result = new ArrayList<MqMessageEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MqMessageEntity _item;
        final String _tmpMessageId;
        if (_cursor.isNull(_cursorIndexOfMessageId)) {
          _tmpMessageId = null;
        } else {
          _tmpMessageId = _cursor.getString(_cursorIndexOfMessageId);
        }
        final String _tmpClientHandle;
        if (_cursor.isNull(_cursorIndexOfClientHandle)) {
          _tmpClientHandle = null;
        } else {
          _tmpClientHandle = _cursor.getString(_cursorIndexOfClientHandle);
        }
        final String _tmpTopic;
        if (_cursor.isNull(_cursorIndexOfTopic)) {
          _tmpTopic = null;
        } else {
          _tmpTopic = _cursor.getString(_cursorIndexOfTopic);
        }
        final MqttMessage _tmpMqttMessage;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfMqttMessage)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfMqttMessage);
        }
        _tmpMqttMessage = __converters.toMqttMessage(_tmp);
        final QoS _tmpQos;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfQos);
        _tmpQos = __converters.toQoS(_tmp_1);
        final boolean _tmpRetained;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfRetained);
        _tmpRetained = _tmp_2 != 0;
        final boolean _tmpDuplicate;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfDuplicate);
        _tmpDuplicate = _tmp_3 != 0;
        final long _tmpTimestamp;
        _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
        _item = new MqMessageEntity(_tmpMessageId,_tmpClientHandle,_tmpTopic,_tmpMqttMessage,_tmpQos,_tmpRetained,_tmpDuplicate,_tmpTimestamp);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<MqMessageEntity> allArrived(final String clientHandle) {
    final String _sql = "SELECT * FROM MQMessageEntity WHERE clientHandle = ? ORDER BY timestamp ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (clientHandle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, clientHandle);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMessageId = CursorUtil.getColumnIndexOrThrow(_cursor, "messageId");
      final int _cursorIndexOfClientHandle = CursorUtil.getColumnIndexOrThrow(_cursor, "clientHandle");
      final int _cursorIndexOfTopic = CursorUtil.getColumnIndexOrThrow(_cursor, "topic");
      final int _cursorIndexOfMqttMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "mqttMessage");
      final int _cursorIndexOfQos = CursorUtil.getColumnIndexOrThrow(_cursor, "qos");
      final int _cursorIndexOfRetained = CursorUtil.getColumnIndexOrThrow(_cursor, "retained");
      final int _cursorIndexOfDuplicate = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final List<MqMessageEntity> _result = new ArrayList<MqMessageEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MqMessageEntity _item;
        final String _tmpMessageId;
        if (_cursor.isNull(_cursorIndexOfMessageId)) {
          _tmpMessageId = null;
        } else {
          _tmpMessageId = _cursor.getString(_cursorIndexOfMessageId);
        }
        final String _tmpClientHandle;
        if (_cursor.isNull(_cursorIndexOfClientHandle)) {
          _tmpClientHandle = null;
        } else {
          _tmpClientHandle = _cursor.getString(_cursorIndexOfClientHandle);
        }
        final String _tmpTopic;
        if (_cursor.isNull(_cursorIndexOfTopic)) {
          _tmpTopic = null;
        } else {
          _tmpTopic = _cursor.getString(_cursorIndexOfTopic);
        }
        final MqttMessage _tmpMqttMessage;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfMqttMessage)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfMqttMessage);
        }
        _tmpMqttMessage = __converters.toMqttMessage(_tmp);
        final QoS _tmpQos;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfQos);
        _tmpQos = __converters.toQoS(_tmp_1);
        final boolean _tmpRetained;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfRetained);
        _tmpRetained = _tmp_2 != 0;
        final boolean _tmpDuplicate;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfDuplicate);
        _tmpDuplicate = _tmp_3 != 0;
        final long _tmpTimestamp;
        _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
        _item = new MqMessageEntity(_tmpMessageId,_tmpClientHandle,_tmpTopic,_tmpMqttMessage,_tmpQos,_tmpRetained,_tmpDuplicate,_tmpTimestamp);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
