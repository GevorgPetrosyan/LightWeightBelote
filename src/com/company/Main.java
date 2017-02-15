package com.company;

import com.company.belote.CardDealer;
import com.company.belote.Game;
import com.company.belote.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players =new ArrayList<>();
        players.add(new Player("Mark"));
        players.add(new Player("John"));
        players.add(new Player("Ben"));
        players.add(new Player("Tom"));
        Game game= new Game(new CardDealer(),players);
        game.startGame();
        game.printGame();
    }
}
