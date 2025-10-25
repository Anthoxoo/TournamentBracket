package com.github.anthoxoo.Classes;

public class Team {
    // final is good because we don't use getters so these are immuables.
    private final int teamId;
    private final String teamName;
    private final Player player1;
    private final Player player2;
    private final String anthem;

    // Constructor
    public Team(int teamId, String teamName, Player player1, Player player2, String anthem) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.player1 = player1;
        this.player2 = player2;
        this.anthem = anthem;
    }

    //getters
    /// getPlayer allows to use methods from the Player Class because we return the object itself
    /// example : team1.getPlayer1().getPlayerId()
    public Player getPlayer1() {
        return player1;
    }
    public Player getPlayer2() {
        return player2;
    }
    public String getTeamName(){return this.teamName;}
    public int getTeamId(){return this.teamId;}
    public String getAnthem(){return this.anthem;}
}
