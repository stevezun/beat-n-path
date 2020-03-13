package edu.cnm.deepdive.beatnpath.model.entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;
import java.util.Date;
import javax.annotation.Nullable;

@Entity(
    indices = {
        @Index(value = "measurement_data"),
        @Index( value = "date", unique = true),
        @Index( value = "song_id")
    },
    foreignKeys = {
        @ForeignKey(
            entity = Song.class,
            parentColumns = "song_id",
            childColumns = "song_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class Measurement {

  @ColumnInfo( name = "measurement_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "measurement_data")
  private long measurementData;

  @ColumnInfo(name = "date")
  private Date date;

  @Nullable
  @ColumnInfo(name = "song_id")
  private long songId;

  @ColumnInfo(name = "user_id")
  private long userId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getMeasurementData() {
    return measurementData;
  }

  public void setMeasurementData(long measurementData) {
    this.measurementData = measurementData;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public long getSongId() {
    return songId;
  }

  public void setSongId(long songId) {
    this.songId = songId;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}


