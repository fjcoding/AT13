package org.fundacionjala.at13.spaceinvaders;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.EventQueue;
public final class Main extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -8447528754405114368L;
    public static final int WAIT_PERIOD = 50; // milliseconds
    public static final int ROWS = 3;
    public static final int COLUMNS = 5;

    public static final int VALORY = 10;
    public static final int ALIEN_COLUMN = 10;
    public static final int ALIEN_ROW = 5;
    public static final int SPACE_COL_GRIDS = 30;
    public static final int SPACE_ROW_GRIDS = 20;
    public static final int FRAME_HEIGHT = 800;
    public static final int FRAME_WIDHT = 1200;
    
    private Main() {
        initializeMain();
    }
    private void initializeMain() {
        add(new Space(SPACE_COL_GRIDS, SPACE_ROW_GRIDS));
        setSize(FRAME_WIDHT, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Space Invaders");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> {
            Main mainFrame = new Main();
            mainFrame.setVisible(true);
        });
    }
}
