<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Match Details</title>
        <style>
            .match-detail {
                padding: 20px;
                border: 1px solid #ddd;
                margin-bottom: 20px;
                background-color: #f9f9f9;
            }
            .details {
                font-size: 14px;
                color: #555;
                margin-bottom: 10px;
            }
            .key-players,
            .game-stats {
                margin-top: 15px;
            }
            h3 {
                margin-top: 20px;
                font-size: 18px;
                color: #333;
            }
        </style>
    </head>
    <body>
        <h2>Match Details</h2>

        <div class="match-detail">
            <!-- Basic Info -->
            <div class="details">Game ID: ${match.gameId}</div>
            <div class="details">Nth Game: ${match.nth}</div>
            <div class="details">Field: ${match.field}</div>
            <div class="details">Game Time: ${match.gameTime}</div>
            <div class="details">Runtime: ${match.runtime}</div>
            <div class="details">Broadcast: ${match.broadcast}</div>
            <div class="details">Crowd: ${match.crowd}</div>

            <!-- Key Players -->
            <h3>Key Players</h3>
            <div class="details">Hitting Key Player: ${match.hittingKeyPlayer}</div>
            <div class="details">Pitching Key Player: ${match.pitchingKeyPlayer}</div>
            <div class="details">Winning Pitcher: ${match.winningPitcher}</div>
            <div class="details">Losing Pitcher: ${match.losingPitcher}</div>
            <div class="details">Save Pitcher: ${match.savePitcher}</div>
            <div class="details">Away Team Starting Pitcher: ${match.awayTeamStartingPitcher}</div>
            <div class="details">Home Team Starting Pitcher: ${match.homeTeamStartingPitcher}</div>

            <!-- Game Highlights -->
            <h3>Game Highlights</h3>
            <div class="details">Winning Hit: ${match.winningHit}</div>
            <div class="details">Home Run: ${match.homeRun}</div>
            <div class="details">Double: ${match.two}</div>
            <div class="details">Triple: ${match.triple}</div>
            <div class="details">Error: ${match.error}</div>
            <div class="details">Double Play: ${match.doublePlay}</div>
            <div class="details">Stolen Base: ${match.stolenBase}</div>
            <div class="details">Caught Stealing: ${match.caughtStealing}</div>
            <div class="details">Run Out: ${match.runOut}</div>
            <div class="details">Pick Off: ${match.pickOff}</div>
            <div class="details">Passed Ball: ${match.passedBall}</div>
            <div class="details">Wild Pitch: ${match.wildPitch}</div>

            <!-- Umpire Information -->
            <h3>Umpire</h3>
            <div class="details">Umpire: ${match.umpire}</div>
        </div>

        <a href="/game/list">Back to Matches</a>
    </body>
</html>
