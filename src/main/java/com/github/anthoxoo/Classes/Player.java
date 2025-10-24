package com.github.anthoxoo.Classes;

public class Player {
    private int playerId;
    private String name;
    private char gender;
    private Team team;

    // Constructor
    public Player(int playerId, String name, char gender, Team team) {
        this.playerId = playerId;
        this.name = name;
        this.gender = gender;
        this.team = team;
    }

    //getters
    public int getPlayerId(){
        return this.playerId;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }
    public int getTeamId(){
        return this.teamId;
    }

    //setters
    public void setTeamId(int newTeamId){
        this.teamId = newTeamId;
    }
    public void setPlayerId(int newPlayerId){
        this.playerId = newPlayerId;
    }
}
