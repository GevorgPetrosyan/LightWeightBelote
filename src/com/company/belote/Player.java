package com.company.belote;

import java.util.*;

/**
 * Created by gpetrosy on 11-Feb-17.
 */
public class Player {
    String name;
    private List<Card> cards = new ArrayList<>();
    private static final Random randomGenerator = new Random();

    public Player(String name) {
        this.name = name;
    }

    public Card play() {
        return cards.remove(randomGenerator.nextInt(cards.size()));
    }

    public Card play(Type type) {

        Optional<Card> optional = cards.stream().filter(x -> type.equals(x.getType()))
                .findFirst();
        if (optional.isPresent()) {
            cards.remove(optional.get());
        }
        return optional.isPresent() ? optional.get() : play();
    }

    public boolean hasCard() {
        return !cards.isEmpty();
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }
}
