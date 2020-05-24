package udemy.java_programming_masterclass.section10.challenge_generics;

import udemy.java_programming_masterclass.section10.how_generics_work.Team;

public class Main {
    public static void main(String[] args) {
//        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
    }
}

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.
