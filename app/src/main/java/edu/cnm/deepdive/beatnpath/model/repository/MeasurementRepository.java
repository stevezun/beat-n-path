package edu.cnm.deepdive.beatnpath.model.repository;

import android.app.Application;
import edu.cnm.deepdive.beatnpath.model.dao.MeasurementDao;
import edu.cnm.deepdive.beatnpath.model.entity.Measurement;
import edu.cnm.deepdive.beatnpath.model.entity.Song;
import edu.cnm.deepdive.beatnpath.service.BeatNPathDatabase;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MeasurementRepository {

  private static final int NETWORK_THREAD_COUNT = 10;

  private final BeatNPathDatabase database;
  private final Executor networkPool;

  private static Application context;

  private MeasurementRepository() {
    if (context == null) {
      throw new IllegalStateException(  );
    }
    database = BeatNPathDatabase.getInstance();
    networkPool = Executors.newFixedThreadPool( NETWORK_THREAD_COUNT );
  }

  public static void setContext(Application context) {
    MeasurementRepository.context = context;
  }

  public static MeasurementRepository getInstance() {
    return BeatNPathDatabase.InstanceHolder.Instance;
  }

  public List<Measurement> measurementData() {
    MeasurementDao dao = database.getMeasurementDao();
    return dao.measurementData();                           //TODO list keeps switching from measurement to song
  }

  private static class InstanceHolder {
    private static final MeasurementRepository INSTANCE = new MeasurementRepository();
  }

}
