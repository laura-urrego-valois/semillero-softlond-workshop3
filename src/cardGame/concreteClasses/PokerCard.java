package cardGame.concreteClasses;

import cardGame.abstractClasses.BasicCard;

public class PokerCard extends BasicCard {

    public PokerCard(String suit, String value) {
        super(suit, value);
    }

    @Override
    public int numericalValue() {
        if (getValue().equals("Ace")) {
            return 1;
        } else if (getValue().equals("Jack")) {
            return 11;
        } else if (getValue().equals("Queen")) {
            return 12;
        } else if (getValue().equals("King")) {
            return 13;
        } else {
            return Integer.parseInt(getValue());
        }
    }
}
