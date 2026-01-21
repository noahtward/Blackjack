
import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> deck = new ArrayList<>();

    private final Rank[] ranks = Rank.values();
    private final Suit[] suits = Suit.values();


    public Deck() {
        for (Rank rank: ranks) {
            for (Suit suit: suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public Card getCard(int i) {
        return deck.remove(i);
    }

    public int getDeckLength() {
        return deck.size();
    }


}