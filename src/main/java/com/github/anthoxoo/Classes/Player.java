package com.github.anthoxoo.Classes;

public class Player {
    // shared with every Players thanks to the static keyword
    private static int numPlayers = 0;

    private final int playerId;
    private final String name;
    private final char gender;
    private Team team;

    // Constructor
    public Player(String name, char gender) {
        this.playerId = numPlayers++;
        this.name = name;
        this.gender = gender;
        this.team = null;
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
    public Team getTeam(){ return this.team; }

    //setters
    public void setTeam(Team team){
        this.team = team;
    }
}
