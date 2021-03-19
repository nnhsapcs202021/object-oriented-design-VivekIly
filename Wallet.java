
/**
 * Write a description of class Wallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wallet
{
    private Card card1, card2;
    
    public void addCard(Card c) {
        if (card1 == null) card1 = c;
        else if (card2 == null) card2 = c;
    }
    
    public int getExpiredCardCount() {
        int count = 0;
        if (card1.isExpired()) count++;
        if (card2.isExpired()) count++;
        
        return count;
    }
    
    @Override
    public String toString() {
        String str = "[";
        if (card1 != null) str += this.card1.toString();
        str += "|";
        if (card2 != null) str += this.card2.toString();
        str += "]";
        return str;
    }
}
