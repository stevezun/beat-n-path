package edu.cnm.deepdive.beatnpath.model.entity;

import android.app.Application;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;
import java.util.Date;

@Entity(
    indices = {
        @Index(value = "date", unique = true),
        @Index( value = "song_tempo" )
    }
)
public class Song {

  @ColumnInfo(name = "song_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "song_tempo")
  private long songTempo;

  @ColumnInfo(name = "date")
  private Date date;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSongTempo() {
    return songTempo;
  }

  public void setSongTempo(long songTempo) {
    this.songTempo = songTempo;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
