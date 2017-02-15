package com.company.belote;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by gpetrosy on 11-Feb-17.
 */
public class CardDealer {
    private CardDeck deck = new CardDeck();

    public void dealCards(List<Player> players){
        Collections.shuffle(deck.getDeck(),new Random(System.nanoTime()));
            if (players.size()==4){
                for (Player player:players){
                    player.setCards(deck.getEightCards());
                }
            }else {
                System.err.println("There should be 4 players in the game.");
            }
    }
}
