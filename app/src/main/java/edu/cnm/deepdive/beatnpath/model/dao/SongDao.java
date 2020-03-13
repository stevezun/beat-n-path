package edu.cnm.deepdive.beatnpath.model.dao;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.beatnpath.model.entity.Song;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface SongDao {

  @Insert
  Single<Long> insert(Song song);

  @Insert
  Single<List<Long>> insert(Collection<Song> song);

  @Delete
  Single<Integer> delete(Song song);

  @Delete
  Single<Integer> delete(Collection<Song> song);

  @Delete
  Single<Integer> delete(Song... song);

  @Query( "SELECT * FROM Song ORDER BY song_tempo DESC" )
  List<Song> songTempo();

}
