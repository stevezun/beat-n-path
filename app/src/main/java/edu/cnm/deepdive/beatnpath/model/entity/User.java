package edu.cnm.deepdive.beatnpath.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;

@Entity(
    indices = {
        @Index(value = "spotify_login", unique = true),
        @Index( value ="authkey", unique = true )
    }
)
public class User {

  @ColumnInfo( name = "user_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo( name = "spotify_login")
  private String spotifyLogin;

  @ColumnInfo( name = "authkey")
  private String oauth;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSpotifyLogin() {
    return spotifyLogin;
  }

  public void setSpotifyLogin(String spotifyLogin) {
    this.spotifyLogin = spotifyLogin;
  }

  public String getOauth() {
    return oauth;
  }

  public void setOauth(String oauth) {
    this.oauth = oauth;
  }
}
