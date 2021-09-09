package com.example.rickandmorty.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.rickandmorty.local.entity.CharacterEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CharacterDao_Impl implements CharacterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CharacterEntity> __insertionAdapterOfCharacterEntity;

  public CharacterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCharacterEntity = new EntityInsertionAdapter<CharacterEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CharacterEntity` (`id`,`name`,`imageURL`,`status`,`gender`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CharacterEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImageURL() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageURL());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStatus());
        }
        if (value.getGender() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGender());
        }
      }
    };
  }

  @Override
  public Object insertCharacters(final List<CharacterEntity> list,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCharacterEntity.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllCharacters(final Continuation<? super List<CharacterEntity>> continuation) {
    final String _sql = "SELECT * FROM `CharacterEntity`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<CharacterEntity>>() {
      @Override
      public List<CharacterEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImageURL = CursorUtil.getColumnIndexOrThrow(_cursor, "imageURL");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final List<CharacterEntity> _result = new ArrayList<CharacterEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CharacterEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImageURL;
            if (_cursor.isNull(_cursorIndexOfImageURL)) {
              _tmpImageURL = null;
            } else {
              _tmpImageURL = _cursor.getString(_cursorIndexOfImageURL);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            _item = new CharacterEntity(_tmpId,_tmpName,_tmpImageURL,_tmpStatus,_tmpGender);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getFilteredName(final String namePattern,
      final Continuation<? super List<CharacterEntity>> continuation) {
    final String _sql = "SELECT * FROM `CharacterEntity` WHERE name LIKE '%' || ? ||'%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (namePattern == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, namePattern);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<CharacterEntity>>() {
      @Override
      public List<CharacterEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImageURL = CursorUtil.getColumnIndexOrThrow(_cursor, "imageURL");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final List<CharacterEntity> _result = new ArrayList<CharacterEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CharacterEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImageURL;
            if (_cursor.isNull(_cursorIndexOfImageURL)) {
              _tmpImageURL = null;
            } else {
              _tmpImageURL = _cursor.getString(_cursorIndexOfImageURL);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            _item = new CharacterEntity(_tmpId,_tmpName,_tmpImageURL,_tmpStatus,_tmpGender);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
