package com.hackerrank.java;

import java.util.Arrays;
import java.util.Comparator;

public class JavaComparator {

  public static void main(String[] args) {
    Player[] players = {new Player("amy", 100), new Player("david", 100), new Player("heraldo", 50),
        new Player("aakansha", 75), new Player("aleksa", 150)};
    Checker checker = new Checker();
    Arrays.sort(players, checker);

    for (Player p : players) {
      System.out.printf("%s %s\n", p.name, p.score);
    }

  }

}

class Checker implements Comparator<Player> {

  @Override
  public int compare(Player playerOne, Player playerTwo) {
    return playerOne.score == playerTwo.score ? playerOne.name
        .compareTo(playerTwo.name) : Integer.compare(playerTwo.score,
        playerOne.score);
  }
}

class Player{
  String name;
  int score;

  Player(String name, int score){
    this.name = name;
    this.score = score;
  }


}
