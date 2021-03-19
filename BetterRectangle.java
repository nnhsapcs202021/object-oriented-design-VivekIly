import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int pos_x, int pos_y, int width, int height) {
        super(pos_x, pos_y, width, height);
        /*super.setLocation(pos_x, pos_y);
        super.setSize(width, height);*/
    }

    public double getPerimeter() {
        return 2 * getWidth() + 2 * getHeight();
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
}
