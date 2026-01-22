import java.util.Random;

public class Dealer {
    private Hand dealerHand;

    public Dealer(Deck deck, Random rng) {
        this.dealerHand = new Hand(deck, rng);
    }

    public void getCard(Deck deck, Random rng) {
        dealerHand.addCardToHand(deck, rng);
    }

    public boolean isBust() {
        return (dealerHand.getHandValue(dealerHand.getHandLength()) > 21);
    }

    public void displayHand(boolean isPlayerTurn) {
        System.out.println("Dealer's hand:");
        if (isPlayerTurn) {
            dealerHand.displayHand(1);
        } else {
            dealerHand.displayHand(dealerHand.getHandLength());
        }
        System.out.println();
        if (isPlayerTurn) {
            System.out.println(dealerHand.getHandValue(1) + " showing");
        } else {
            System.out.println(dealerHand.getHandValue(dealerHand.getHandLength()) + " showing");
        }
        System.out.println();
    }
}
