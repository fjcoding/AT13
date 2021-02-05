package org.fundacionjala.at13.spaceinvaders;
public class Alien {
    public static final int DEFAULT_POSX = 25;
    public static final int DEFAULT_POSY = 48;
    private int xPos;
    private int yPos;
    private final int lowerLimit = 0;
    private final int upperLimit = 50;
    public Alien(final int pX, final int pY) {
        this.xPos = pX;
        this.yPos = pY;
    }

    public Alien() {
        this.xPos = 0;
        this.yPos = 0;
    }

    /**
     * Description: Function that gets xPos.
     *
     * @return xPos an int that shows x position.
     */
    public int getXPos() {
        return xPos;
    }

    /**
     * Description: Function that sets xPos.
     */
    public void setXPos(final int x) {
        this.xPos = x;
    }

    /**
     * Description: Function that gets yPos.
     *
     * @return yPos an int that shows y position.
     */
    public int getYPos() {
        return yPos;
    }

    /**
     * Description: Function that sets yPos.
     */
    public void setYPos(final int y) {
        this.yPos = y;
    }

    /**
     * Description: Function moves alien right.
     *
     * @return int that represents movement.
     */
    public int moveRight() {
        return 1;
    }

    /**
     * Description: Function moves alien left.
     *
     * @return int that represents movement.
     */
    public int moveLeft() {
        return 1;
    }

    /**
     * Description: Function moves alien down.
     *
     * @return int that represents movement.
     */
    public int moveDown() {
        return 1;
    }

    /**
     * Description: Function shoots a bullet.
     *
     * @return string that represents a shoot.
     */
    public Bullet shoot() {
        Bullet bulletShot = new Bullet ("Alien", xPos, yPos);
        return bulletShot;
    }

    /**
     * Description: Function makes alien die.
     *
     * @return boolean that represents alien's dead.
     */
    public Boolean die() {
        return false;
    }
}
