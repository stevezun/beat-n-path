package edu.cnm.deepdive.beatnpath.model.repository;

import android.app.Application;
import edu.cnm.deepdive.beatnpath.model.dao.UserDao;
import edu.cnm.deepdive.beatnpath.model.entity.User;
import edu.cnm.deepdive.beatnpath.service.BeatNPathDatabase;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class UserRepository {

  private static final int NETWORK_THREAD_COUNT = 10;

  private final BeatNPathDatabase database;
  private final Executor networkPool;

  private static Application context;

  private UserRepository() {
    if (context == null) {
      throw new IllegalStateException(  );
    }
    database = BeatNPathDatabase.getInstance();
    networkPool = Executors.newFixedThreadPool( NETWORK_THREAD_COUNT );
  }

  public static void setContext(Application context) {
    UserRepository.context = context;
  }

  public static UserRepository getInstance() {
    return UserRepository.InstanceHolder.INSTANCE;
  }

  public List<User> get() {6
    UserDao dao = database.getUserDao();
    return (List<User>) dao.select();
  }

  public Single<Object> get(long id) {
    UserDao dao = database.getUserDao();
    return dao.insert(id).subscribeOn(Schedulers.io());
  }

  private static class InstanceHolder {
    private static final UserRepository INSTANCE = new UserRepository();
  }
}
