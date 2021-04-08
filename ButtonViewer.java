import javax.swing.*;
import java.awt.event.*;

/**
 *
 *
 * @author Vivek Ily
 * @version April 8th, 2021
 */
public class ButtonViewer {

    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;

    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel labelA;
    private JLabel labelB;

    private int clickCountA;
    private int clickCountB;

    public ButtonViewer() {
        this.clickCountA = 0;
        this.clickCountB = 0;

        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.buttonA = new JButton("Click Me!");
        this.buttonB = new JButton("No, Click Me!");
        this.labelA = new JLabel("0 clicks");
        this.labelB = new JLabel("0 clicks");

        this.panel.add(this.labelA);
        this.panel.add(this.buttonA);
        this.panel.add(this.buttonB);
        this.panel.add(this.labelB);
        this.frame.add(this.panel);

        // 2. create listener objects
        ClickListener listener = new ClickListener();

        // 3. register listener objects with components that generate events
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main(String[] args) {
        ButtonViewer viewer = new ButtonViewer();
    }

    public class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == buttonA) {
                clickCountA++;
            } else if (event.getSource() == buttonB) {
                clickCountB++;
            }

            labelA.setText(clickCountA + " clicks");
            labelB.setText(clickCountB + " clicks");
        }
    }
}