package edu.cnm.deepdive.beatnpath;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.beatnpath.service.BeatNPathDatabase;
import io.reactivex.schedulers.Schedulers;
import okhttp3.logging.HttpLoggingInterceptor.Level;

public class BeatNPathApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
    BeatNPathDatabase.setContext(this);
    BeatNPathDatabase.getInstance().getSpotifyDao().delete()
        .subscribeOn( Schedulers.io())
        .subscribe();
  }

}
