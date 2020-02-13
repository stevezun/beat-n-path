package edu.cnm.deepdive.beatnpath.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.beatnpath.model.entity.HeartMonitor;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface HeartMonitorDao {

  @Insert
  Single<Long> insert(HeartMonitor heartmonitor);

  @Insert
  Single<List<Long>> insert(Collection<HeartMonitor> heartmonitor);

  @Insert
  Single<List<Long>> insert(HeartMonitor... heartmonitor);

  @Delete
  Single<Integer> delete(HeartMonitor heartmonitor);

  @Delete
  Single<Integer> delete(Collection<HeartMonitor> heartmonitor);

  @Delete
  Single<Integer> delete(HeartMonitor... heartmonitors);

  @Query( "SELECT * FROM HeartMonitor ORDER BY heart_id DESC" )
  LiveData<List<HeartMonitor>> select();
}
