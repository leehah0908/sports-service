<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Sports Matches</title>

        <style>
            .game-block {
                border: 1px solid #ddd;
                margin-bottom: 20px;
                padding: 10px;
                display: flex;
                flex-direction: column;
                background-color: #f9f9f9;
            }
            .game-info {
                display: flex;
                align-items: center;
                justify-content: space-between;
                padding: 10px 0;
            }
            .team-block {
                display: flex;
                align-items: center;
            }
            .team-block img {
                width: 50px;
                height: 50px;
                margin-right: 10px;
            }
            .details {
                font-size: 14px;
                color: #555;
            }
        </style>
    </head>
    <body>
        <h2>Sports Results and Schedule</h2>

        <div>
            <c:forEach var="game" items="${gameList}">
                <div class="game-block">
                    <!-- Game Date -->
                    <div class="details">Date: ${game.date}</div>
                    
                    <!-- Teams and Scores -->
                    <div class="game-info">
                        <div class="team-block">
                            <!-- Home Team Logo and Name -->
                            <img src="<c:url value='/img/logos/${game.homeTeam}.png'/>" alt="${game.homeTeam} Logo">
                            <span>${game.homeTeam} (${game.homeScore})</span>
                        </div>
                        <span>vs</span>
                        <div class="team-block">
                            <!-- Away Team Logo and Name -->
                            <img src="<c:url value='/img/logos/${game.awayTeam}.png'/>" alt="${game.awayTeam} Logo">
                            <span>${game.awayTeam} (${game.awayScore})</span>
                        </div>
                    </div>
    
                    <!-- Game Status and Winner -->
                    <div class="details">
                        Status: ${game.status} | Winner: ${game.winnerTeam}
                    </div>
                    
                    <!-- Field and Starting Pitchers -->
                    <div class="details">
                        Field: ${game.field}
                    </div>
                    <div class="details">
                        Home Team Starting Pitcher: ${game.homeTeamStartingPitcher}
                    </div>
                    <div class="details">
                        Away Team Starting Pitcher: ${game.awayTeamStartingPitcher}
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
</html>
