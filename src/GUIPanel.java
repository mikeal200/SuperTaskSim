import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GUIPanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 600;
    boolean running = false;
    Color startingColor;
    int delay = 30000;
    int initDelay = 60000;
    Timer timer;
    
    GUIPanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.red);
        this.setFocusable(true);
        startSim();
    }

    public void startSim() {
        running = true;
        timer = new Timer(delay, this);
        timer.setInitialDelay(initDelay);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
    }

    public void changeBackground() {
        if(running) {
            if(timer.getDelay() != 0) {
                if(this.getBackground() == Color.green) {
                    this.setBackground(Color.red);
                }
                else {
                    this.setBackground(Color.green);
                }
                delay = delay / 2;
                timer.setDelay(delay);
            }
            else {
                timer.stop();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        changeBackground();
        repaint();
    }
}
