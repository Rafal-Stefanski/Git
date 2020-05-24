package udemy.java_programming_masterclass.section10.challenge_generics;

import udemy.java_programming_masterclass.section10.how_generics_work.Team;

import java.util.ArrayList;
import java.util.Collections;

public abstract class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
