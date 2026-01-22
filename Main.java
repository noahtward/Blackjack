import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean showDeck;
        boolean isPlayerTurn;

        //start of the game, shows both hands
        showDeck = true;
        Hand playerHand = new Hand(deck, rng);
        printPlayerHand(playerHand, showDeck);

        showDeck = false;
        Hand dealerHand = new Hand(deck, rng);
        printDealerHand(dealerHand, showDeck);

        isPlayerTurn = true;
        showDeck = true;

        while(isPlayerTurn) {
            System.out.print("1. Hit\n2.Stand\nChoose (1, 2): ");
            switch (scanner.nextInt()) {
                case 1: //Hit
                    playerHand.addCardToHand(deck, rng);
                    System.out.println("------------------");
                    printPlayerHand(playerHand, showDeck);
                    printDealerHand(dealerHand, !showDeck); //use !showDeck here because this is still the player's turn
                    break;
                case 2: //Stand
                    isPlayerTurn = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }

        scanner.close();
    }

    // For debugging: iterate through the remaining cards of the deck:

    // static void displayDeck(Deck deck) {
    //     while (deck.getDeckLength() > 0) {
    //         System.out.println(deck.getCard(0).toString());
    //     }
    // }
    
    static void printPlayerHand(Hand playerHand, boolean showDeck) { //displays the player's hand of cards
        System.out.println("Your hand:");
        playerHand.displayHand(showDeck);
        System.out.println();
        System.out.println(playerHand.getHandValue(showDeck) + " showing");
        System.out.println();
    }

    static void printDealerHand(Hand dealerHand, boolean showDeck) { // displays the dealers hand of cards
        System.out.println("Dealer's hand:");
        dealerHand.displayHand(showDeck);
        System.out.println();
        System.out.println(dealerHand.getHandValue(showDeck) + " showing");
        System.out.println();
    }
    
}