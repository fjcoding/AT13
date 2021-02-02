package org.fundacionjala.at13.spaceinvaders;
public class Bullet {
    private int positionInitialX;
    private int positionInitialY;
    private boolean bulletExist;

    public Bullet(int x, int y) {
        positionInitialX = x;
        positionInitialY = y;
        bulletExist = true;
    }

    /**
     * Description: The function displays bullet's position initial x.
     *
     * @return a int that shows bullet's position initial x.
     */
    public int getPositionX() {
        return this.positionInitialX;
    }

    /**
     * Description: The function displays bullet's position initial y.
     *
     * @return a int that shows bullet's position initial y.
     */
    public int getPositionY() {
        return this.positionInitialY;
    }

    /**
     * Description: The function verifies if the bullet exists.
     *
     * @return a boolean that verifies if the bullet exists.
     */
    public boolean getBulletExist() {
        return this.bulletExist;
    }

    /**
     * Description: The function displays a bullet shoot.
     *
     * @return a String that shoots a bullet.
     */
    public String shooter(String type) {
        if (bulletExist) {
            bulletExist = false;
            return "The " + type + " has fired from " + this.positionInitialX
            + " " + this.positionInitialY;
        } else {
            return "the " + type + " cannot fired";
        }
    }

    /**
     * Description: The function verifies if the bullet collapses.
     *
     * @return a boolean that verifies if the bullet collapses.
     */
    public boolean isCollapsedBullet(int positionX1, int positionY1,
                          int positionX2, int positionY2) {
        if (positionX1 == positionX2 && positionY1 == positionY2) {
            System.out.println("The bullet has collapsed");
            bulletExist = true;
            return true;
        }
        return false;
    }

}
