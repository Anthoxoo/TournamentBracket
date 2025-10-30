package com.github.anthoxoo.Classes;

public class Player {
    // shared with every Players thanks to the static keyword
    private static int numPlayers = 0;

    private final int playerId;
    private final String name;
    private Team team;

    // Constructor
    public Player(String name) {
        this.playerId = numPlayers++;
        this.name = name;
        this.team = null; //may be useful later with javaFX cause more infos
    }

    //getters
    public int getPlayerId(){
        return this.playerId;
    }
    public String getName(){
        return this.name;
    }
    public Team getTeam(){ return this.team; }

    public void setTeam(Team team){ this.team = team; }
}
