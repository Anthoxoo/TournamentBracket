package com.github.anthoxoo.Classes;

public class Match {
    private static int numMatches = 0;

    private final int matchId;
    private final Team team1;
    private final Team team2;

    //constructor
    public Match(Team team1, Team team2){
        this.matchId = numMatches++;
        this.team1 = team1;
        this.team2 = team2;
    }
    //getters
    public int getMatchId(){ return this.matchId; }
    public Team getTeam1(){
        return this.team1;
    }
    public Team getTeam2(){ return this.team2; }
}

