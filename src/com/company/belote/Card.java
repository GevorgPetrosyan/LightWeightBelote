package com.company.belote;

/**
 * Created by gpetrosy on 11-Feb-17.
 */
public class Card {
    private final Type type;
    private final CardValue cardValue;

    public Card(Type type, CardValue cardValue) {
        this.type = type;
        this.cardValue = cardValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (type != card.type) return false;
        return cardValue == card.cardValue;

    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + cardValue.hashCode();
        return result;
    }

    public Type getType() {
        return type;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    @Override
    public String toString() {
        return  type.toString() + cardValue ;
    }
}
