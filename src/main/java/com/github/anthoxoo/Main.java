package com.github.anthoxoo;

import com.github.anthoxoo.Classes.Match;
import com.github.anthoxoo.Classes.Player;
import com.github.anthoxoo.Classes.Team;

public class Main {
    static void main() {
        //Playground to see if it works
        Player player1 = new Player(1,"Antoine", 'M');
        Player player2 = new Player(2,"Antoinette", 'F');
        Player player3 = new Player(3,"Julien", 'M');
        Player player4 = new Player(4,"Juliette", 'F');

        Team team1 = new Team(1, "An", player1, player2, "Lets go !");
        Team team2 = new Team(2, "Ju", player3, player4, "Here we go !");

        player1.setTeam(team1); player2.setTeam(team1);
        player3.setTeam(team2); player4.setTeam(team2);

        Match match1 = new Match(1,team1,team2);
        System.out.println(match1.getTeam1().getPlayer1().getName());

    }
}
