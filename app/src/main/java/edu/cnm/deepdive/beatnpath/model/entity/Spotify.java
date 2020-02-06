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
            parentColumns = "application_id",
            childColumns = "application_id",
            onDelete = ForeignKey.CASCADE

        )
    }
)
public class Spotify {

  @ColumnInfo(name = "spotify_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "login_id", index = true)
  private long loginId;

  @ColumnInfo(name = "song_list", index = true)
  private long songList;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getLoginId() {
    return loginId;
  }

  public void setLoginId(long loginId) {
    this.loginId = loginId;
  }

  public long getSongList() {
    return songList;
  }

  public void setSongList(long songList) {
    this.songList = songList;
  }
}
