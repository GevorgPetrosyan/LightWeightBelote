package com.company.belote;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gpetrosy on 11-Feb-17.
 */
public class CardDeck {
    private List<Card> deck = new ArrayList<>();

    public CardDeck() {
        for (Type type : Type.values()) {
            for (CardValue value : CardValue.values()) {
                deck.add(new Card(type, value));
            }
        }
    }

    public List<Card> getEightCards() {
        List<Card> cards = new ArrayList<>();
        for (int i=0;i<8;i++){
            cards.add(deck.remove(deck.size()-1));
        }
        return cards;
    }

    public List<Card> getDeck() {
        return deck;
    }
}
