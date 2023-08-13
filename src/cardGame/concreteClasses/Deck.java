package cardGame.concreteClasses;

import cardGame.interfaces.ICard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<ICard> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new PokerCard(suit, value));
            }
        }
    }

    public void showDeck() {
        for (ICard card : cards) {
            card.showCard();
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
