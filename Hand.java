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

    public void displayHand(boolean showDeck) { //Displays the cards currently in the hand
        if (!showDeck) {
            System.out.println(hand.get(0).toString());
        } else {
            for (int i = 0; i < hand.size(); ++i) {
                System.out.println(hand.get(i).toString());
            }
        }
        
    }

    public void addCardToHand(Deck deck, Random rng) {
        hand.add(deck.getCard(rng.nextInt(deck.getDeckLength())));
    }

    
}
