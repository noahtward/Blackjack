public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() { //returns the card as a string e.g. 5♧ or A♢
        return rank.getDisplayName() + suit.getDisplayName();
    }

    public int getValue() { //returns the value of the card, gets it from the rank
        return rank.getValue();
    }

}
