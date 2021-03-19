
/**
 * Write a description of class WalletTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalletTester
{
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        Card c1 = new ATMCard(123, 456, "Name");
        Card c2 = new DriverLicense(2022, "Name2");
        wallet.addCard(c1);
        wallet.addCard(c2);
        System.out.println(wallet);
        System.out.println(wallet.getExpiredCardCount());
    }
}
