package com.github.anthoxoo.Classes;


public class Match {
    // no setter needed here too so all final
    private final int matchId;
    private final Team team1;
    private final Team team2;


    //constructor
    public Match(int matchId, Team team1, Team team2){
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
    }
    //getters
    public int getMatchId(){
        return this.matchId;
    }
    public Team getTeam1(){
        return this.team1;
    }
    public Team getTeam2(){
        return this.team2;
    }
}
