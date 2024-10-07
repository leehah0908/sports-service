package com.kbo_service.kbo_service.entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GameDetail {

    private String gameId;
    private int nth;
    private String field;
    private String gameTime;
    private int runtime;
    private String broadcast;
    private int crowd;
    private String hittingKeyPlayer;
    private String pitchingKeyPlayer;
    private String winningPitcher;
    private String losingPitcher;
    private String savePitcher;
    private String awayTeamStartingPitcher;
    private String homeTeamStartingPitcher;
    private String winningHit;
    private String homeRun;
    private String two;
    private String triple;
    private String error;
    private String doublePlay;
    private String stolenBase;
    private String caughtStealing;
    private String runOut;
    private String pickOff;
    private String passedBall;
    private String wildPitch;
    private String umpire;

}
