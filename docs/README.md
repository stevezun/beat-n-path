# Beat N Path

## Description

The purpose of the app is to create a tailored playlist for people who are exercising. The purpose of the app is to match the Heart bpm to the bpm of a specific style of music or curated playlist.


I want the program to be able to accomplish this in two ways. The first by being able to connect and sync with a heart rate monitor built into a smart watch. The live data will be fed into the app and calculated accordingly. The other way, which will be a offline mode of sorts, will allow you to start the program by manually inserting your preferred BPM and allow the program to pull up a set of songs with that range that is directly correlated to the input information.

An additional feature that I want to create is that you create zones or categories of desired heart rate with a set timer. The program will pull up music within the desired heart rate for that set amount of time. You would be able to create multiple zones that would run concurrently with each other to simulate warm-up, intensity, and cooldown, or any other custom arrangement the user wants to create.


## Intended users

The primary audience of the playlist will be for people who exercise and whose Heart bpm is important for performance and enjoy having music to match their exertion levels.

The preset zones can be key for personal trainers, fitness instructors, and coaches who curate their exercise routine and would like music to accompany their plan without them having to worry about adjusting during activity.

### [User Stories](C:\Users\steve\Desktop\bootcamp\projects\android-project-idea-1-stevezun\user-stories.md)

### [Entity-Relationship-Diagram](erd.md)

### [Wireframe](wireframe.md)

## External services/data
The external service/data will require a connection to Spotify music app and library, eventually the service can be connected to other music libraries.

- [Spotify Android SDK](https://developer.spotify.com/documentation/android/) Allows me to access the Spotify app and run in the background.

- [Spotify Documentation](https://developer.spotify.com/documentation/web-api/reference-beta/#object-audiofeaturesobject) Query Parameters from the Spotify Docs,
  allow me to make Requests based on many parameters, most specifically tempo or beats per minute.
  
- [Google Fit API](https://developers.google.com/fit/android/sensors) allows me to collect raw sensor data, from the phone or an external device that is a wearable.
  
 The app will not be able to work without the two programs. I will need to collect data to connect to the music service that will stream music. 
  
## Entity

[HeartMonitor](https://github.com/stevezun/beat-n-path/blob/master/app/src/main/java/edu/cnm/deepdive/beatnpath/model/entity/Spotify.java)

[Spotify](https://github.com/stevezun/beat-n-path/blob/master/app/src/main/java/edu/cnm/deepdive/beatnpath/model/entity/Spotify.java)

[User](https://github.com/stevezun/beat-n-path/blob/master/app/src/main/java/edu/cnm/deepdive/beatnpath/model/entity/User.java)

## Dao

[HeartMonitorDao](https://github.com/stevezun/beat-n-path/blob/master/app/src/main/java/edu/cnm/deepdive/beatnpath/model/dao/HeartMonitorDao.java)

[SpotifyDao](https://github.com/stevezun/beat-n-path/blob/master/app/src/main/java/edu/cnm/deepdive/beatnpath/model/dao/SpotifyDao.java)

[UserDao](https://github.com/stevezun/beat-n-path/blob/master/app/src/main/java/edu/cnm/deepdive/beatnpath/model/dao/UserDao.java)

## Database

[BeatNPathDatabase](https://github.com/stevezun/beat-n-path/blob/master/app/src/main/java/edu/cnm/deepdive/beatnpath/service/BeatNPathDatabase.java)
  
## Implementation

[Data definition language (DDL)](ddl.md)


