import java.util.ArrayList;
import java.util.Random;

public class Hand {

    private final int INTITIAL_HAND_SIZE = 2;
    private ArrayList<Card> hand = new ArrayList<>();
    private int handValue;

    public Hand(Deck deck, Random rng) { //initializes a hand with 2 random cards
        for (int i = 0; i < INTITIAL_HAND_SIZE; ++i) {
            hand.add(deck.getCard(rng.nextInt(deck.getDeckLength())));
            handValue += hand.get(i).getValue();
        }
    }

    public void displayHand(boolean showDeck) { //Displays the cards currently in the hand
        if (!showDeck) { //only show first card at index 0
            System.out.print(hand.get(0).toString() + " ");
        } else { // shows all cards in hand
            for (int i = 0; i < hand.size(); ++i) {
                System.out.print(hand.get(i).toString() + " ");
            }
        }
        
    }

    public void addCardToHand(Deck deck, Random rng) { //gets a random card from the deck and adds it to hand
        hand.add(deck.getCard(rng.nextInt(deck.getDeckLength())));
        handValue += hand.get(hand.size() - 1).getValue(); //add value of new card to handValue
    }

    public int getHandValue(boolean showDeck) {
        if(!showDeck) { //only show value of first card
            return hand.get(0).getValue();
        } else { //show value of all cards combined
            return handValue;
        }
        
    }
    
}
