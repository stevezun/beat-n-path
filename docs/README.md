# Beat N Path

## Description

Beat N Path is a live data driven music player. Rather than visualizing data, the app will take
live data and turn into sounds by matching it with a music service. Live heart data will be taken
from a user and be used to match music from Spotify. Beat N Path will be the solution for people who want
to have music streaming to their physical activities without the stress of having to be distracted trying to
coordinate it.

## Intended users

The intended users of Beat N Path will be consumers who use wearable devices that transmit live data to a device. The user will be the type of person that wants
to perform an activity where music is important to their focus but cannot be distracted by having to curate their own music every time a song is over. They prefer
the music to match their activity and performance levels.

### [User Stories](userstories.md)

### [Entity-Relationship-Diagram](erd.md)

### [Wireframe](wireframe.md)

## External services/data
The external service/data will require a connection to Spotify music app and library, eventually the service can be connected to other music libraries.

- [Spotify Android SDK](https://developer.song.com/documentation/android/) Allows me to access the Spotify app and run in the background.

- [Spotify Documentation](https://developer.song.com/documentation/web-api/reference-beta/#object-audiofeaturesobject) Query Parameters from the Spotify Docs,
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


