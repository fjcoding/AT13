package org.fundacionjala.at13.spaceinvaders;
public class Alien {
    private int xPos;
    private int yPos;
    private boolean isAlive;
    public Alien(final int x, final int y) {
        this.xPos = x;
        this.yPos = y;
        isAlive = true;
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
