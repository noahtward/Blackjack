import java.util.Random;

public class Player {
    private Hand playerHand;

    public Player(Deck deck, Random rng) {
        this.playerHand = new Hand(deck, rng);
    }

    public void getCard(Deck deck, Random rng) {
        playerHand.addCardToHand(deck, rng);
    }

    public boolean isBust() {
        return (playerHand.getHandValue(playerHand.getHandLength()) > 21);
    }

    public void displayHand() {
        System.out.println("Your hand:");
        playerHand.displayHand(playerHand.getHandLength());
        System.out.println();
        System.out.println(playerHand.getHandValue(playerHand.getHandLength()) + " showing");
        System.out.println();
    }
}
