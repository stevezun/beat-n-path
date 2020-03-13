package edu.cnm.deepdive.beatnpath.service;

import android.app.Application;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import edu.cnm.deepdive.beatnpath.model.dao.MeasurementDao;
import edu.cnm.deepdive.beatnpath.model.dao.SongDao;
import edu.cnm.deepdive.beatnpath.model.dao.UserDao;
import edu.cnm.deepdive.beatnpath.model.entity.Measurement;
import edu.cnm.deepdive.beatnpath.model.entity.Song;
import edu.cnm.deepdive.beatnpath.model.entity.User;
import edu.cnm.deepdive.beatnpath.model.repository.MeasurementRepository;
import edu.cnm.deepdive.beatnpath.service.BeatNPathDatabase.Converters;
import java.util.Date;

@Database(
    entities = {User.class, Song.class, Measurement.class},
    version = 1,
    exportSchema = true
)
@TypeConverters({Converters.class})
public abstract class BeatNPathDatabase extends RoomDatabase {

  private static final String DB_NAME = "beatnpath_db";

  private static Application context;

  public static void setContext (Application context) { BeatNPathDatabase.context = context; }

  public static BeatNPathDatabase getInstance() { return InstanceHolder.INSTANCE; }

  public abstract SongDao getSongDao();

  public abstract UserDao getUserDao();

  public abstract MeasurementDao getMeasurementDao();

  public static class InstanceHolder {

    private static final BeatNPathDatabase INSTANCE = Room.databaseBuilder(
        context, BeatNPathDatabase.class, DB_NAME)
        .build();

    public static MeasurementRepository Instance;
  }

  public static class Converters {

    @TypeConverter
    public static Long fromDate(Date date) {
      return (date != null) ? date.getTime() : null;
    }

    @TypeConverter
    public static Date fromLong(Long value) {
      return (value != null) ? new Date(value) : null;
    }

  }


}
