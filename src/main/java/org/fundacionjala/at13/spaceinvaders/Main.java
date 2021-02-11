package org.fundacionjala.at13.spaceinvaders;
import javax.swing.JFrame;
public class Main extends JFrame {
    public static final int ROWS = 3;
    public static final int COLUMNS = 5;
    public static final int VALORY = 10;
    public static final int ALIEN_COLUMN = 10;
    public static final int ALIEN_ROW = 5;
    private Main() {
        initializeMain();
    }
    private void initializeMain(){
        add(new Space(20, 30));
        setSize(1200,800);
        setResizable(false);
        setTitle("Space Invaders");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(final String[] args) {
        Main mainFrame = new Main();
        mainFrame.setVisible(true);
    }
}
