package edu.cnm.deepdive.beatnpath.model.entity;

import android.app.Application;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;

@Entity
public class Spotify {

  @ColumnInfo(name = "spotify_id")
  @PrimaryKey(autoGenerate = true)
  private long id;


  @ColumnInfo(name = "song_bpm", index = true)
  @Expose
  private long songBPM;

  @ColumnInfo(name = "song_time_length", index = true)
  @Expose
  private long songTimeLength;

  @ColumnInfo(name = "song_list", index = true)
  @Expose
  private long songList;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSongBPM() {
    return songBPM;
  }

  public void setSongBPM(long songBPM) {
    this.songBPM = songBPM;
  }

  public long getSongTimeLength() {
    return songTimeLength;
  }

  public void setSongTimeLength(long songTimeLength) {
    this.songTimeLength = songTimeLength;
  }

  public long getSongList() {
    return songList;
  }

  public void setSongList(long songList) {
    this.songList = songList;
  }
}
