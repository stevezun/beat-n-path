package edu.cnm.deepdive.beatnpath.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.beatnpath.model.entity.Measurement;
import edu.cnm.deepdive.beatnpath.model.entity.Song;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface MeasurementDao {

  @Insert
  Single<Long> insert(edu.cnm.deepdive.beatnpath.model.entity.Measurement measurement);

  @Insert
  Single<List<Long>> insert(Collection<edu.cnm.deepdive.beatnpath.model.entity.Measurement> measurement);

  @Insert
  Single<List<Long>> insert(edu.cnm.deepdive.beatnpath.model.entity.Measurement... measurement);

  @Delete
  Single<Integer> delete(edu.cnm.deepdive.beatnpath.model.entity.Measurement measurement);

  @Delete
  Single<Integer> delete(Collection<edu.cnm.deepdive.beatnpath.model.entity.Measurement> measurement);

  @Delete
  Single<Integer> delete(edu.cnm.deepdive.beatnpath.model.entity.Measurement... measurement);

  @Query( "SELECT * FROM measurement ORDER BY measurement_data DESC" )
  List<Measurement> measurementData();
}
