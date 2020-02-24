package edu.cnm.deepdive.beatnpath.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;

@Entity(
    foreignKeys = {
        @ForeignKey(
        entity = User.class,
        parentColumns = "user_id",
        childColumns = "user_id",
        onDelete = ForeignKey.CASCADE
        )
    }
)
public class User {

  @ColumnInfo(name = "user_id")
  @PrimaryKey(autoGenerate = true)
  private long user;

  @ColumnInfo(name = "spotify_login", index = true)
  @Expose
  private long spotifyLogin;

  @ColumnInfo(name = "zones", index = true)
  @Expose//TODO you need to redo this idea, and work it out on your erd.
  private long zones;

  public long getUser() {
    return user;
  }

  public void setUser(long user) {
    this.user = user;
  }

  public long getSpotifyLogin() {
    return spotifyLogin;
  }

  public void setSpotifyLogin(long spotifyLogin) {
    this.spotifyLogin = spotifyLogin;
  }

  public long getZones() {
    return zones;
  }

  public void setZones(long zones) {
    this.zones = zones;
  }
}
