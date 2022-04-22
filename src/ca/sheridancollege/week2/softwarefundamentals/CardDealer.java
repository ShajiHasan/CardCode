/*
 * Shaji Hasan
 * 991441275
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card sevenHearts = new Card("Hearts", 7);
        
        System.out.printf("%d of %s", sevenHearts.getValue(), sevenHearts.getSuit());
        
        Card threeSpades = new Card("Spades", 3);
    }
}
