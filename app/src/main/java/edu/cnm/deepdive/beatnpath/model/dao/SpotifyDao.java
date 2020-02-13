package edu.cnm.deepdive.beatnpath.model.dao;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.beatnpath.model.entity.Spotify;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface SpotifyDao {

  @Insert
  Single<Long> insert(Spotify spotify);

  @Insert
  Single<List<Long>> insert(Collection<Spotify> spotify);

  @Delete
  Single<Integer> delete(Spotify spotify);

  @Delete
  Single<Integer> delete(Collection<Spotify> spotify);

  @Delete
  Single<Integer> delete(Spotify... spotify);

  @Query( "SELECT * FROM Spotify ORDER BY song_bpm DESC" )
  LiveData<List<Spotify>> select();


}
