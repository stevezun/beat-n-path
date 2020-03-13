package edu.cnm.deepdive.beatnpath.model.repository;

import android.app.Application;
import edu.cnm.deepdive.beatnpath.model.dao.SongDao;
import edu.cnm.deepdive.beatnpath.model.entity.Song;
import edu.cnm.deepdive.beatnpath.service.BeatNPathDatabase;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SongRepository {

  private static final int NETWORK_THREAD_COUNT = 10;

  private final BeatNPathDatabase database;
  private final Executor networkPool;

  private static Application context;

  private SongRepository() {
    if (context == null) {
      throw new IllegalStateException(  );
    }
    database = BeatNPathDatabase.getInstance();
    networkPool = Executors.newFixedThreadPool( NETWORK_THREAD_COUNT );
  }

  public static void  setContext(Application context) {
    SongRepository.context = context;
  }
  public static SongRepository getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public List<Song> songTempo() {
    SongDao dao = database.getSongDao();
    return dao.songTempo();
  }

  private static class InstanceHolder {
    private static final SongRepository INSTANCE = new SongRepository();
  }
}
