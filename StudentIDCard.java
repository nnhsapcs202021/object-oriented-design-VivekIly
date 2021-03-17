
/**
 * Write a description of class StudentIDCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentIDCard extends Card
{
    private int ID;
    
    public StudentIDCard(int IDnum, String name) {
        super(name);
        this.ID = IDnum;
    }
    
    public int getID() {
        return this.ID;
    }
    
    public void setID(int IDnum) {
        this.ID = IDnum;
    }
    
    public String toString() {
        return "Card holder: " + super.getName() + "; ID: " + this.ID;
    }
}
