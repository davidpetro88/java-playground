package com.example.generics.ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
  private String name;
  private ArrayList<T> league;

  public League(String name) {
    this.name = name;
    this.league = new ArrayList<>();
  }

  public boolean add(T team) {
    if (league.contains(team)) return false;
    return league.add(team);
  }

  public void showLeagueTable() {
    Collections.sort(league);
    for( T t: league) {
      System.out.println(t.getName() + " rank : " + t.ranking() + " Won : " + t.won + " Lost: " + t.lost);
    }
  }
}
