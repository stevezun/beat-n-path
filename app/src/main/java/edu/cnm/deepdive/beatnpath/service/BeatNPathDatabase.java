package edu.cnm.deepdive.beatnpath.service;

import android.app.Application;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import edu.cnm.deepdive.beatnpath.model.dao.HeartMonitorDao;
import edu.cnm.deepdive.beatnpath.model.dao.SpotifyDao;
import edu.cnm.deepdive.beatnpath.model.dao.UserDao;
import edu.cnm.deepdive.beatnpath.model.entity.HeartMonitor;
import edu.cnm.deepdive.beatnpath.model.entity.Spotify;
import edu.cnm.deepdive.beatnpath.model.entity.User;

@Database(
    entities = {User.class, Spotify.class, HeartMonitor.class},
    version = 1,
    exportSchema = true
)
public abstract class BeatNPathDatabase extends RoomDatabase {

  private static final String DB_NAME = "beatnpath_db";

  private static Application context;

  public static void setContext (Application context) { BeatNPathDatabase.context = context; }

  public static BeatNPathDatabase getInstance() { return InstanceHolder.INSTANCE; }

  public abstract SpotifyDao getSpotifyDao();

  public abstract UserDao getUserDao();

  public abstract HeartMonitorDao getHeartMonitorDao();

  private static class InstanceHolder {

    private static final BeatNPathDatabase INSTANCE = Room.databaseBuilder(
        context, BeatNPathDatabase.class, DB_NAME)
        .build();

  }


}
