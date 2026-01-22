import java.util.ArrayList;
import java.util.Random;

public class Hand {

    private final int INTITIAL_HAND_SIZE = 2;
    private ArrayList<Card> hand = new ArrayList<>();

    public Hand(Deck deck, Random rng) { //initializes a hand with 2 random cards
        for (int i = 0; i < INTITIAL_HAND_SIZE; ++i) {
            hand.add(deck.getCard(rng.nextInt(deck.getDeckLength())));
        }
    }

    public void displayHand(int maxIndex) { //Displays the cards currently in the hand
        for (int i = 0; i < maxIndex; ++i) {
            System.out.print(hand.get(i).toString() + " ");
        }
    }

    public void addCardToHand(Deck deck, Random rng) { //gets a random card from the deck and adds it to hand
        hand.add(deck.getCard(rng.nextInt(deck.getDeckLength())));
    }

    public int getHandValue(int maxIndex) {
        int value = 0;
        for (int i = 0; i < maxIndex; ++i) {
            value += hand.get(i).getValue();
        }

        return value;
    }

    public int getHandLength() { //returns the amount of elements in a hand object, usefull for other functions in this class, when you need a max index
        return hand.size();
    }
    
}
