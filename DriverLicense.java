import java.util.GregorianCalendar;

/**
 * Write a description of class DriverLicense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    private int expiration;
    
    public DriverLicense(int expYear, String name) {
        super(name);
        this.expiration = expYear;
    }
    
    public int getExp() {
        return this.expiration;
    }
    
    public void setExp(int expYear) {
        this.expiration = expYear;
    }
    
    @Override
    public boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(calendar.YEAR);
        
        if (currentYear > this.expiration) return true;
        return false;
    }
    
    @Override
    public String toString() {
        return "Card holder: " + super.getName() + "; Expiration Year: " + this.expiration;
    }
}
