package org.fundacionjala.at13.spaceinvaders;

import java.util.ArrayList;

public class Space {

    public static final String EMPTY = ".";
    public static final String SPACESHIP = "^";
    public static final String ALIEN = "*";
    public static final String BULLET = "|";
    public static final int DEFAULT_HEIGHT = 50;
    public static final int DEFAULT_WIDTH = 100;

    private Spaceship spaceship;
    private ArrayList<Alien> aliens;
    private Bullet bullet;
    private int height;
    private int width;

    public Space(final int heightToSet, final int widthToSet) {
        this.height = heightToSet;
        this.width = widthToSet;
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
    public void setAlien(final ArrayList<Alien> newAlien) {
        this.aliens = newAlien;
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
                int posX = alien.getXPos();
                int posY = alien.getYPos();
//                PositionElement position = new PositionAdapter().adaptPosition(posX, posY, space.length);
//                space[position.getIndexi()][position.getIndexj()] = ALIEN;
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
