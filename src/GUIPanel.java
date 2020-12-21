import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GUIPanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 600;
    boolean running = false;
    Color startingColor;
    static final int delay = 60;
    Timer timer;
    Random random;
    
    GUIPanel() {
        /*int color = random.nextInt(2);
        if(color == 0) {
            startingColor = Color.red; 
        }
        else {
            startingColor = Color.green;
        }*/
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.red);
        this.setFocusable(true);
        startSim();
    }

    public void startSim() {
        running = true;
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        //if(running) {
            if(this.getBackground() == Color.green) {
                this.setBackground(Color.red);
            }
            else {
                this.setBackground(Color.green);
            }
            //delay = delay / 2;
        //}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
