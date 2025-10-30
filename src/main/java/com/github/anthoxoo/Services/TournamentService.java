package com.github.anthoxoo.Services;

import com.github.anthoxoo.Classes.Match;
import com.github.anthoxoo.Classes.Player;
import com.github.anthoxoo.Classes.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TournamentService {
    private Scanner scanner;

    public TournamentService(Scanner scanner) {
        this.scanner = scanner;
    }
    public ArrayList<Team> createTeams(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many teams will there be in the tournament ?");
        int numberTeams = scanner.nextInt();
        scanner.nextLine(); // avoid a scanner issue where it skips a scanner.nextLine()
        ArrayList<Team> remainingTeams = new ArrayList<>();

        for(int i = 0; i < numberTeams; i++) {
            System.out.println("\n=== Team " + (i+1) + " ===");

            System.out.print("What is the name of the first player: ");
            String player1Name = scanner.nextLine();
            Player tempPlayer1 = new Player(player1Name);

            System.out.print("What is the name of the second player: ");
            String player2Name = scanner.nextLine();
            Player tempPlayer2 = new Player(player2Name);

            System.out.print("What is the name of the team: ");
            String teamName = scanner.nextLine();

            Team newTeam = new Team(teamName, tempPlayer1, tempPlayer2);
            remainingTeams.add(newTeam);

        }
        return remainingTeams;
    }

    public void tournamentPlayer(ArrayList<Team> teams){
        int round = 0;
        // Creating the matches
        if (teams.size() % 2 != 0){ // the number of teams is not even
            teams.add(null);
        }
        System.out.println("\n========== ROUND " + round + " ==========");
        while (teams.size() > 1) {
            ArrayList<Team> winners = new ArrayList<>();

            for (int i = 0; i < teams.size(); i += 2) {
                Team team1 = teams.get(i);
                Team team2 = teams.get(i + 1);

                new Match(team1, team2);

                if (team1 == null){
                    winners.add(team2);
                    System.out.println(team2.getTeamName() + " pass the round without having to play !");
                }
                else if (team2 == null) {
                    winners.add(team1);
                    System.out.println(team1.getTeamName() + " pass the round without having to play !");

                }
                else {
                    System.out.println("The match will be opposing : " + team1.getTeamName() + " against " + team2.getTeamName());
                    Team tempWinner = askWinner(team1, team2);
                    System.out.println("The match between : " + team1.getTeamName() + " opposing " + team2.getTeamName() + " has ended by the win of " + tempWinner.getTeamName());
                    winners.add(tempWinner);
                }
                round++;
            }
            teams = winners;
        }
        System.out.println("The winner is ........ : " + teams.getFirst().getTeamName() + " after a total of : " + round + " matches played !");
    }

    public Team askWinner(Team team1, Team team2){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("\n who is the winner of the match ? ");
            String matchWinner = scanner.nextLine();

            if (matchWinner.equals(team1.getTeamName())){
                return team1;
            }
            else if (matchWinner.equals(team2.getTeamName())) {
                return team2;
            }
            else{
                System.out.println("Invalid choice : either " + team1.getTeamName() + " or " + team2.getTeamName());
            }
        }
    }
}
