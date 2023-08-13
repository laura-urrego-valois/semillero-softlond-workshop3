package cardGame;

import cardGame.concreteClasses.Deck;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.println("Welcome to our Poker game!");
        System.out.println("Deck before shuffling: ");
        deck.showDeck();

        deck.shuffleDeck();

        System.out.println("---------//----------");
        System.out.println("\nDeck after shuffling: ");
        deck.showDeck();

    }
}
