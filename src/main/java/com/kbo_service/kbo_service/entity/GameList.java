package com.kbo_service.kbo_service.entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GameList {
    private String gameId;
    private String date;
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private String winnerTeam;
    private String status;

    private String field;
    private String awayTeamStartingPitcher;
    private String homeTeamStartingPitcher;
}
