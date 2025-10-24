package com.github.anthoxoo.Classes;

public class Team {
    private int teamId;
    private String teamName;
    private Player player1;
    private Player player2;
    private String anthem;

    public Team(int teamId, String teamName, Player player1, Player player2, String anthem) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.player1 = player1;
        this.player2 = player2;
        this.anthem = anthem;
    }

    public Player getPlayer1() {
        return player1;
    }
    public Player getPlayer2() {
        return player2;
    }
    

    // etc.
}
