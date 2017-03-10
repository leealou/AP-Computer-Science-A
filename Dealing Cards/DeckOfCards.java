/*
 * STORES 52 OBJECTS OF THE CARDS
 */
package dealingcards;

import java.util.Random;

/**
 *
 * @author leea23
 */
public class DeckOfCards {
    private card[] deck;
    private int card1, card2;
    private card shuffleVal = new card(1);
    boolean dealt = false;
    Random rand = new Random();

    public DeckOfCards() 
    {
        deck = new card[52];
        for (int i = 1; i <= 52; i++) 
        {
            deck[i - 1] = new card(i);
        }
    }

    public void shuffle() 
    {
        for (int i = 0; i < 52; i++) 
        {
            deck[i].dealt = false;
        }
        for (int i = 0; i <= 1000; i++) 
        {
            card1 = rand.nextInt(52);
            card2 = rand.nextInt(52);
            shuffleVal = deck[card1];
            deck[card1] = deck[card2];
            deck[card2] = shuffleVal;
        }
    }

    public void dealACard() 
    {
        for (int i = 0; i < 52; i++) 
        {
            if (!(deck[i].dealt)) 
            {
                System.out.println(deck[i]);
                deck[i].dealt = true;
                break;
            }
        }
    }

    public void printDeck() 
    {
        for (int i = 0; i < 52; i++) 
        {
            System.out.println(deck[i]);
        }
    }

    public void cardsInDeck() 
    {
        int count = 0;
        for (int i = 0; i < 52; i++) 
        {
            if (!(deck[i].dealt)) 
            {
                count++;

            }
        }
        System.out.println("There are " + count + " cards in the deck");
    }

}
