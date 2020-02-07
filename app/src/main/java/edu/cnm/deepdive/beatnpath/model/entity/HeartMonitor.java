package edu.cnm.deepdive.beatnpath.model.entity;


import android.app.Application;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Application.class
            parentColumns = "heart_id"
            childColumns = "heart_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class HeartMonitor {

  @ColumnInfo(name = "heart_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "heart_beats_per_minute", index = true)
  private long heartBeatsPerMinute;

  @ColumnInfo(name ="time_length", index = true)
  private long timeLength;

  @ColumnInfo(name = " heart_rate_average", index = true)
  private long heartRateAverage;

  @ColumnInfo(name = "heart_rate_peak", index = true)
  private long heartRatePeak;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getHeartBeatsPerMinute() {
    return heartBeatsPerMinute;
  }

  public void setHeartBeatsPerMinute(long heartBeatsPerMinute) {
    this.heartBeatsPerMinute = heartBeatsPerMinute;
  }

  public long getTimeLength() {
    return timeLength;
  }

  public void setTimeLength(long timeLength) {
    this.timeLength = timeLength;
  }

  public long getHeartRateAverage() {
    return heartRateAverage;
  }

  public void setHeartRateAverage(long heartRateAverage) {
    this.heartRateAverage = heartRateAverage;
  }

  public long getHeartRatePeak() {
    return heartRatePeak;
  }

  public void setHeartRatePeak(long heartRatePeak) {
    this.heartRatePeak = heartRatePeak;
  }
}
