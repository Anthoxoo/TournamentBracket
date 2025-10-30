package com.github.anthoxoo;
import com.github.anthoxoo.Services.TournamentService;
import com.github.anthoxoo.Classes.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TournamentService tournamentService = new TournamentService(scanner);

        ArrayList<Team> teams = tournamentService.createTeams();
        tournamentService.tournamentPlayer(teams);
        scanner.close();
    }
}