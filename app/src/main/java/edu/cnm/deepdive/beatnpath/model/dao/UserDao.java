package edu.cnm.deepdive.beatnpath.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.beatnpath.model.entity.User;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface UserDao {

  @Insert
  Single<Long> insert(User user);

  @Insert
  List<Long> insert(Collection<User> users);

  @Update
  int update(User user);

  @Delete
  int delete(User... users );

  @Query( "SELECT * FROM User ORDER BY user_id DESC" )
  LiveData<List<User>> select();

  @Query(  )


}
