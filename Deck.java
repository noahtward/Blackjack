
import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> deck = new ArrayList<>();

    private final Rank[] ranks = Rank.values(); //array of all ranks 2-A
    private final Suit[] suits = Suit.values(); //array of suits


    public Deck() { //initializes a full deck of cards, goes through each rank and suit and adds a card for each
        for (Rank rank: ranks) { 
            for (Suit suit: suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public Card getCard(int i) { //returns a card object from the ArrayList, and then removes the card from the list
        return deck.remove(i);  
    }

    public int getDeckLength() { //returns the length of the deck in it's current state
        return deck.size();
    }


}