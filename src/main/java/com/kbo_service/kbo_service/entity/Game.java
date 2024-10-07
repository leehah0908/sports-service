package com.kbo_service.kbo_service.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Game {

    private String gameId;
    private LocalDateTime date;
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private String winnerTeam;
    private String status; // 나중에 enum으로 바꿔보기

}
