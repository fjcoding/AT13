package org.fundacionjala.at13.spaceinvaders;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Space {

    public static final String EMPTY = ".";
    public static final String SPACESHIP = "^";
    public static final String ALIEN = "*";
    public static final String BULLET = "|";
    public static final int DEFAULT_HEIGHT = 10;
    public static final int DEFAULT_WIDTH = 15;
    public static final int INITIAL_RANGE = 0;
    public static final int ALIEN_ROWS_IN_SPACE = 3;
    public static final int ALIEN_COLS_IN_SPACE = 5;

    private GameBoard gameboard;
    private AlienGroup alienGroup;
    private Spaceship spaceship;
    private ArrayList<Alien> aliens;
    private Bullet bullet;
    private int height;
    private int width;
    private ArrayList<Bullet> bullets;

    public Space() {
        alienGroup = new AlienGroup(ALIEN_ROWS_IN_SPACE, ALIEN_COLS_IN_SPACE);
        aliens = this.alienGroup.getAliens();
        spaceship = new Spaceship(5, 9, 0, 14);
        bullets = new ArrayList<Bullet>();
        gameboard = new GameBoard(spaceship);
        gameboard.init();
    }
    public void init () {
        aliensShoot();
        updateSpace();
    }
    public void updateSpace() {
        gameboard.clearSpace();
        for (int row = 0; row < DEFAULT_HEIGHT; row++) {
            for (int col = 0; col < DEFAULT_WIDTH; col++) {
                if (row == spaceship.getPosX() && col == spaceship.getPosY()) {
                    gameboard.printSpaceship(row, col, spaceship.getImage());
                }
                if (checkIfThereIsAlienInThisPos(row, col)) {
                    gameboard.printAlien(col, row, alienGroup.getAliens().get(0).getImage());
                }
                if (checkIfThereIsBulletInThisPos(row, col)) {
                    gameboard.printBullet(col, row, bullets.get(0).getImage());
                }
            }
        }
    }
    public boolean checkIfThereIsAlienInThisPos(int posY, int posX) {
        for (Alien alien : aliens) {
            if (alien.getPosX() == posX && alien.getPosY() == posY) {
                return true;
            }
        }
        return false;
    }
    public boolean checkIfThereIsBulletInThisPos(int posY, int posX) {
        for (Bullet bullet : bullets) {
            if (bullet.getPositionX() == posX && bullet.getPositionY() == posY) {
                return true;
            }
        }
        return false;
    }
    public void aliensShoot() {
        bullets.add(aliens.get(10).shoot());
    }
    /**
     * Sets a new spaceship for this space instance
     */
    public void setSpaceship(final Spaceship newSpaceship) {
        this.spaceship = newSpaceship;
    }

    /**
     * Sets a new spaceship for this space instance
     */
    public void setAlien(final ArrayList<Alien> arrayList) {
        this.aliens = arrayList;
    }

    /**
     * Sets a new spaceship for this space instance
     */
    public void setBullet(final Bullet newBullet) {
        this.bullet = newBullet;
    }

    /**
     * Method that returns a String representation of the space.
     */
    public String[][] show() {
        String[][] space = new String[height][width];
        for (int i = 0; i < space.length; i++) {
            for (int j = 0; j < space[i].length; j++) {
                space[i][j] = EMPTY;
            }
        }
        if (this.spaceship != null) {
            int posX = this.spaceship.getPosX();
            int posY = this.spaceship.getPosY();
            PositionElement position = new PositionAdapter().adaptPosition(posX, posY, space.length);
            space[position.getIndexi()][position.getIndexj()] = SPACESHIP;
        }
        if (this.aliens != null) {
            for (Alien alien  : aliens) {
                int posX = alien.getPosX();
                int posY = alien.getPosY();
                space[posY][posX] = ALIEN;
            }
        }
        if (this.bullet != null) {
            int posX = this.bullet.getPositionX();
            int posY = this.bullet.getPositionY();
            PositionElement position = new PositionAdapter().adaptPosition(posX, posY, space.length);
            space[position.getIndexi()][position.getIndexj()] = BULLET;
        }
        return space;
    }
}
