# SQL data definition language (DDL)

```sqlite
CREATE TABLE IF NOT EXISTS `User`
(
    `user_id`       INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `spotify_login` INTEGER                           NOT NULL,
    `zones`         INTEGER                           NOT NULL,
    FOREIGN KEY (`user_id`) REFERENCES `User` (`user_id`) ON UPDATE NO ACTION ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS `Spotify`
(
    `spotify_id`       INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `song_bpm`         INTEGER                           NOT NULL,
    `song_time_length` INTEGER                           NOT NULL,
    `song_list`        INTEGER                           NOT NULL
);
CREATE TABLE IF NOT EXISTS `HeartMonitor`
(
    `heart_id`               INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `heart_beats_per_minute` INTEGER                           NOT NULL,
    `time_length`            INTEGER                           NOT NULL,
    ` heart_rate_average`    INTEGER                           NOT NULL,
    `heart_rate_peak`        INTEGER                           NOT NULL,
    FOREIGN KEY (`heart_id`) REFERENCES `HeartMonitor` (`heart_id`) ON UPDATE NO ACTION ON DELETE CASCADE
);
``` 

[Download](ddl.sql)