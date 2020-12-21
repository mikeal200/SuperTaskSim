package src;
import javax.swing.JFrame;

public class GUIFrame extends JFrame {
    GUIFrame() {
        this.add(new GUIPanel());
        this.setTitle("Super Task Simulator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
    }
}
