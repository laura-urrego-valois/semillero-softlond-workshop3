package cardGame.abstractClasses;

import cardGame.interfaces.ICard;

public abstract class BasicCard implements ICard {

    private String suit;
    private String value;

    public BasicCard(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public void showCard() {
        System.out.println(value + " of " + suit);
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }
}
