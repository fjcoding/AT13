package org.fundacionjala.at13.spaceinvaders;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interface2 extends JFrame {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();

    private static JLabel ship = new JLabel(new ImageIcon("resources/spaceship.png"));/* 
    private static JLabel bullet = new JLabel(new ImageIcon("resources/spaceship.png")); */
/*     private static final int GO_LEFT = 37;
    private static final int GO_RIGHT = 39; */
    private static final int SIZE_IMAGE = 20;
    private static final int POS_X = (Space.DEFAULT_WIDTH * 5 - 23) / 2;
    private static final int POS_Y = Space.DEFAULT_HEIGHT * 14 - 23;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH * 20;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT * 20;
    
    public Interface2() {
        init();
    }

    /**
     * Method initialize the graphical interface.
     */
    public void init() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                Space space = new Space(SCALE_WIDTH, SCALE_HEIGHT);
                frame.getContentPane().add(panel);
                panel.setFocusable(true);
                panel.requestFocusInWindow();
                panel.setLayout(null);
                panel.setBackground(Color.BLACK);
                frame.setSize(new Dimension(SCALE_WIDTH, SCALE_HEIGHT));
                frame.setVisible(true);
                frame.setTitle("Jala AT13 - Space Invanders");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                //spaceShipImage(POS_X, POS_Y);
            }
        };
        SwingUtilities.invokeLater(r);
        //eventKey();
    }

    /**
     * Method initialize the image.
     */
    public final void spaceShipImage(final int posX, final int posY) {
        ship.setBounds(posX, posY, SIZE_IMAGE, SIZE_IMAGE);
        bullet.setBounds(posX, posY - SIZE_IMAGE, SIZE_IMAGE, SIZE_IMAGE);
        panel.add(ship);
        panel.add(bullet);
    }

    /**
     * Method for the key.
     */
    public void eventKey() {
        KeyListener keyEvent = new KeyListener() {

            @Override
            public void keyTyped(final KeyEvent e) { }

            @Override
            public void keyPressed(final KeyEvent e) {
                Game.moveSpaceship(e.getKeyCode());
                ship.setBounds(Game.spaceship.getPosX() * SIZE_IMAGE, POS_Y, SIZE_IMAGE, SIZE_IMAGE);
                bullet.setBounds(POS_X, POS_Y - Game.bullet.getPositionY(), SIZE_IMAGE, SIZE_IMAGE);
            }

            @Override
            public void keyReleased(final KeyEvent e) { }

        };
        panel.addKeyListener(keyEvent);
    }
}
    

