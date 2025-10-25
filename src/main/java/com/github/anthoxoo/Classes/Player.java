package com.github.anthoxoo.Classes;

public class Player {
    private final int playerId;
    private final String name;
    private final char gender;
    private Team team;

    // Constructor
    public Player(int playerId, String name, char gender) {
        this.playerId = playerId;
        this.name = name;
        this.gender = gender;
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
    public Team getTeam(){
        if (this.team != null){
            return this.team;
        }
        else{
            System.out.println("This player does not have a team yet !");
            return null;
        }
    }

    //setters
    public void setTeam(Team team){
        this.team = team;
    }
}
