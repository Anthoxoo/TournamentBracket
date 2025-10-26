package com.github.anthoxoo.Services;
import com.github.anthoxoo.Classes.*;
import java.util.List;
public class TreeService {
        // Builds the tree recursively
        public MatchNode buildTree(List<Team> teams) {
        if (teams.size() == 2) {
            // Cas de base : match entre 2 équipes
            Match match = new Match(teams.get(0), teams.get(1));
            return new MatchNode(match);
        }

        // Divide in two the teams to put them left and right
        int mid = teams.size() / 2;
        List<Team> leftTeams = teams.subList(0, mid);
        List<Team> rightTeams = teams.subList(mid, teams.size());

        // Recursive calls until base case
        MatchNode left = buildTree(leftTeams);
        MatchNode right = buildTree(rightTeams);

        // Preparing the match of the winner with null data
        Match parentMatch = new Match(null, null);
        MatchNode parent = new MatchNode(parentMatch);

        parent.setLeft(left);
        parent.setRight(right);

        return parent;
    }
}

