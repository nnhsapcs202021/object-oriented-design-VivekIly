/**
 * Write a description of class ComboLock here.
 *
 * @author Vivek Ily
 * @version 03/10/21
 */
public class ComboLock {

    private int pointer;
    private final int num1, num2, num3;
    private int try1, try2, try3;
    private boolean changed1, changed2, changed3;

    public ComboLock(int secret1, int secret2, int secret3) {
        this.pointer = 0;
        this.num1 = secret1;
        this.num2 = secret2;
        this.num3 = secret3;
    }

    public void turnClockwise(int ticks) {
        pointer -= ticks;
        pointer = 39 - Math.abs(pointer % 39);

        if (!changed1) {
            try1 = pointer;
            changed1 = true;
            //System.out.println(try1);
        }
        else {
            try3 = pointer;
            changed3 = true;
            //System.out.println(try3);
        }
    }

    public void turnCounterclockwise(int ticks) {
        pointer += ticks;
        pointer = Math.abs(pointer % 39);

        if (!changed2) {
            try2 = pointer;
            changed2 = true;
            //System.out.println(try2);
        }
    }

    public boolean open() {
        if (try1 == this.num1 && try2 == this.num2 && try3 == this.num3) return true;
        return false;
    }
    
    public void reset() {
        this.pointer = 0;
        this.try1 = 0;
        this.try2 = 0;
        this.try3 = 0;
        this.changed1 = false;
        this.changed2 = false;
        this.changed3 = false;
    }
}