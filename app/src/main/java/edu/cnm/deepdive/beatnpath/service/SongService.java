package edu.cnm.deepdive.beatnpath.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.cnm.deepdive.beatnpath.BuildConfig;
import edu.cnm.deepdive.beatnpath.model.entity.Song;
import edu.cnm.deepdive.beatnpath.service.BeatNPathDatabase.InstanceHolder;
import io.reactivex.Single;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface SongService {

  @GET("v1/me/playlists")
  Single<Song> getAll(@Header( "Authorization" ) String oauthHeader);

  @GET("v1/playlists/{playslist_id}/tracks")
  Single<List<Song>> get(@Header( "Authorization" ) String oauthHeader);

  static SongService getInstance() {
    return InstanceHolder.INSTANCE;
  }
  class InstanceHolder {

    private static final  SongService INSTANCE;

    static {
      Gson gson = new GsonBuilder()
          .excludeFieldsWithoutExposeAnnotation()
          .create();
      HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(  );
      interceptor.setLevel( Level.BODY );
      OkHttpClient client = new OkHttpClient().Builder
          .readTimeout(60, TimeUnit.SECONDS )
          .addInterceptor( interceptor)
          .build();
      Retrofit retrofit = new Retrofit.Builder()
          .addConverterFactory( GsonConverterFactory.create(gson) )
          .addCallAdapterFactory( RxJava2CallAdapterFactory.create() )
          .client( client )
          .baseUrl( BuildConfig.BASE_URL ) //TODO Create BASE_URL in config
          .build();
      INSTANCE = retrofit.create( SongService.class );

    }
  }
}
