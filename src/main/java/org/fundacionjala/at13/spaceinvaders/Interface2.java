package org.fundacionjala.at13.spaceinvaders;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interface2 extends JFrame {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();

    private static JLabel ship = new JLabel(new ImageIcon("resources/spaceship.png"));
    private static JLabel[] alien;
    private static JLabel bullet = new JLabel(new ImageIcon("resources/spaceship.png"));
    
    private static final int SIZE_IMAGE = 20;
    private static final int POS_Y = Space.DEFAULT_HEIGHT * 18;
    private static final int SCALE_WIDTH = Space.DEFAULT_WIDTH * 20;
    private static final int SCALE_HEIGHT = Space.DEFAULT_HEIGHT * 20;
    private int SCALE = 20;
    private Game game;
    
    public Interface2() {
        game = new Game();
        init();
        System.out.println("antes de star()");
        start();
        System.out.println("adespues de star()");
    }

    /**
     * Method initialize the graphical interface.
     */
    public void init() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                frame.getContentPane().add(panel);
                panel.setFocusable(true);
                panel.requestFocusInWindow();
                panel.setLayout(null);
                panel.setBackground(Color.BLACK);
                frame.setSize(new Dimension(game.widthSpace() * SCALE + SIZE_IMAGE, game.heightSpace() * SCALE));
                frame.setVisible(true);
                frame.setTitle("Jala AT13 - Space Invanders");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                alien = new JLabel[game.ALIEN_ROW * game.ALIEN_COLUMN];
                for (int i = 0; i < alien.length; i++) {
                        alien[i] = new JLabel(new ImageIcon("resources/spaceship.png"));
                }
                spaceAlienImage();
                spaceShipImage(game.posXSpaceship(), POS_Y);
            }
        };
        
        System.out.println("antes del keylistener");
        SwingUtilities.invokeLater(r);
        eventKey();
    }

    /**
     * Method initialize the image.
     */
    public final void spaceShipImage(final int posX, final int posY) {
        ship.setBounds(posX, posY, SIZE_IMAGE, SIZE_IMAGE);
        panel.add(ship);
    }

    /**
     * Method initialize the image.
     */
    public final void spaceAlienImage() {
        for (int i = 0; i < game.getAlienGroup().size(); i++) {
                alien[i].setBounds(game.getAlienGroup().get(i).getPosX() * 20,
                game.getAlienGroup().get(i).getPosY() * 20, SIZE_IMAGE, SIZE_IMAGE);
                panel.add(alien[i]);
        }
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
                game.moveSpaceship(e.getKeyCode());
                ship.setBounds(game.getSpaceship().getPosX() * SIZE_IMAGE, POS_Y, SIZE_IMAGE, SIZE_IMAGE);
            }

            @Override
            public void keyReleased(final KeyEvent e) { }

        };
        panel.addKeyListener(keyEvent);
    }

    /** */
    public void start() {
        while (true) {
            try {
                game.startMoving();;
                Thread.sleep(500);
                spaceAlienImage2();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }

    /**
     * Method initialize the image.
     */
    public final void spaceAlienImage2() {
        for (int i = 0; i < game.getAlienGroup().size(); i++) {
                alien[i].setLocation(game.getAlienGroup().get(i).getPosX() * 20,
                game.getAlienGroup().get(i).getPosY() * 20);
                panel.add(alien[i]);
        }
        if(game.getBullet()!=null) {
            bullet.setLocation(game.getBullet().getPositionX() * 20,
            game.getBullet().getPositionX() * 20);
            panel.add(bullet);
        }
    }
}
    

