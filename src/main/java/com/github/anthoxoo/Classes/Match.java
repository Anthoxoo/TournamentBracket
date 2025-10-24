package com.github.anthoxoo.Classes;




public class Match {
    private int matchId;
    private int teamId1;
    private int teamId2;
    //constructor
    public Match(int matchId, int teamId1, int teamId2){
        this.matchId = matchId;
        this. teamId1 = teamId1;
        this. teamId2 = teamId2;
    }
    //getters
    public int getMatchId(){
        return this.matchId;
    }
    public int getTeamId1(){
        return this.teamId1;
    }
    public int getTeamId2(){
        return this.teamId2;
    }
    //Setters
    public void setMatchId(int newMatchId){
        this.matchId = newMatchId;
    }
    public void setTeamId1(int newTeamId1){
        this.teamId1 = newTeamId1;
    }
    public void setTeamId2(int newTeamId2){
        this.teamId2 = newTeamId2;
    }
}
