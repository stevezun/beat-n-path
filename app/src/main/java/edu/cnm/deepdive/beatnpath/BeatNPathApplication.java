package edu.cnm.deepdive.beatnpath;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class BeatNPathApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults( this );
  }
}
