
/**
 * Write a description of class ATMCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATMCard extends Card
{
    private int cardNumber;
    private int pin;

    public ATMCard(int cardNum, int pinNum, String name) {
        super(name);
        this.cardNumber = cardNum;
        this.pin = pinNum;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cardNum) {
        this.cardNumber = cardNum;
    }

    @Override
    public boolean isExpired()
    {
        return false;
    }

    @Override
    public String toString() {
        return "Card holder: " + super.getName() + "; Card Number: " + this.cardNumber + "; Pin: " + this.pin;
    }
}
