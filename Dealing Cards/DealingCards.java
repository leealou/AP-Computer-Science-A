/*
 * DEALS CARDS
 */
package dealingcards;
import java.util.Scanner;
/**
 *
 * @author leea23
 */
public class DealingCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 52; i++) //this will deal 52 cards out of a seemingly infinite decks
        {
            card Deal = new card();
            DeckOfCards deck = new DeckOfCards();
            Scanner scan = new Scanner(System.in);
            int cards = 52;

            System.out.println("Would you like a card to be dealt?");
            System.out.println("1: Yes, 2: No");
            int opt = scan.nextInt();

            while (opt == 1) 
            {
                System.out.println("");
                System.out.println("Dealing a card");

                deck.dealACard();
                cards = cards - 1;
                System.out.println("Would you like to shuffle the deck?");
                System.out.println("1: Yes, 2: No");

                int opt1 = scan.nextInt();

                if (opt1 == 1) 
                {
                    deck.shuffle();
                    System.out.println("There are " + cards + " in the deck.");
                    System.out.println("Would you like another card to be dealt?");
                    System.out.println("1: Yes 2: No");
                    opt = scan.nextInt();
                }

            }
        }
    }
}


