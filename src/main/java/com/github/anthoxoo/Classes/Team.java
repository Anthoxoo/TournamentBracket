package com.github.anthoxoo.Classes;

public class Team {
    private static int numTeams = 0;

    //final everywhere because we want teams to be immuables
    private final int teamId;
    private final String teamName;
    private final Player player1;
    private final Player player2;

    // Constructor
    public Team(String teamName, Player player1, Player player2) {
        this.teamId = numTeams++;
        this.teamName = teamName;
        this.player1 = player1;
        this.player2 = player2;
    }

    // getters
    public Player getPlayer1() { return player1; }
    public Player getPlayer2() { return player2; }
    public String getTeamName() { return teamName; }
    public int getTeamId() { return teamId; }
}
