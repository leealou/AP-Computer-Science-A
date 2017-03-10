/*
 * STORES 52 OBJECTS OF THE CARDS
 */
package dealingcards;

import java.util.Random;

/**
 *
 * @author leea23
 */
public class card {
    boolean dealt = false;
    private int suit;
    private int rank;

    private String suitValue;
    private String rankValue;

    //4 suits
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    //13 ranks
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    Random rand = new Random();

    public card() 
    {
        suit = rand.nextInt(3) + 1; //3 + 1 = 4 suits
        rank = rand.nextInt(12) + 1; //12 + 1 = 13 ranks
        suitValue = suits[suit];
        rankValue = ranks[rank];
    }

    card(int i) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getRank() 
    {
        return rankValue;
    }

    public String getSuit() 
    {
        return suitValue;
    }
}
