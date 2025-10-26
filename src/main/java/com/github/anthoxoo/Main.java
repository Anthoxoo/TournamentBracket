package com.github.anthoxoo;
import com.github.anthoxoo.Classes.*;
import com.github.anthoxoo.Services.*;

import java.util.List;


public class Main {
    static void main() {
        Player p1 = new Player("Alice", 'F');
        Player p2 = new Player("Bob", 'M');
        Player p3 = new Player("Charlie", 'M');
        Player p4 = new Player("Diana", 'F');
        Player p5 = new Player("Ethan", 'M');
        Player p6 = new Player("Fiona", 'F');
        Player p7 = new Player("George", 'M');
        Player p8 = new Player("Hannah", 'F');

        Team t1 = new Team("Team A", p1, p2, "Go A!");
        Team t2 = new Team("Team B", p3, p4, "Go B!");
        Team t3 = new Team("Team C", p5, p6, "Go C!");
        Team t4 = new Team("Team D", p7, p8, "Go D!");
        // TODO creates the match based on the number of teams, browse the tree to find the current match and ask for the winner,
        // TODO be able to do the opposite match so match 1 from left then match 1 from right...
        Match match1 = new Match(t1, t2);
        Match match2 = new Match(t3, t4);

        List<Team> teams = List.of(t1, t2, t3, t4);
        TreeService builder = new TreeService();
        MatchNode root = builder.buildTree(teams);


    }
}
