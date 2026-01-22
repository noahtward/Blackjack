import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);

        //Create Player and Dealer
        Player player = new Player(deck, rng);
        Dealer dealer = new Dealer(deck, rng);

        boolean isPlayerTurn = true;

        player.displayHand();
        dealer.displayHand(isPlayerTurn);

        while(isPlayerTurn) { //player game loop

            System.out.print("1. Hit\n2.Stand\nChoose (1, 2): ");

            switch (scanner.nextInt()) {
                case 1: //Hit
                   player.getCard(deck, rng);
                   player.displayHand();
                   dealer.displayHand(isPlayerTurn);
                   break;
                case 2: //Stand
                   isPlayerTurn = false;
                   player.displayHand();
                   dealer.displayHand(isPlayerTurn);
                   break;
                default:
                    throw new AssertionError();
            }
        }

        scanner.close();
    }
}