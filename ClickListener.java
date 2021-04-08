import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 *
 * @author Vivek Ily
 * @version April 8th, 2021
 */
public class ClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Button clicked.");
    }
}
