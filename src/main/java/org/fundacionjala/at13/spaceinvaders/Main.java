package org.fundacionjala.at13.spaceinvaders;
import javax.swing.JFrame;
public final class Main extends JFrame {
    public static final int ROWS = 20;
    public static final int COLUMNS = 30;
    public static final int VALORY = 10;
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;

    private Main() {
        initializeMain();
    }
    private void initializeMain() {
        add(new Space(ROWS, COLUMNS));
        setSize(WIDTH, HEIGHT);
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
