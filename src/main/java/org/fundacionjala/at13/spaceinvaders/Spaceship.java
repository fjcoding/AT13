package org.fundacionjala.at13.spaceinvaders;

public class Spaceship {

    private int posX;
    private int posY;
    private final int lowerLimit = 0;
    private final int upperLimit = 50;

    public Spaceship(final int pX, final int pY) {
        this.posX = pX;
        this.posY = pY;
    }
    /**
     * Description: Getter method.
     * @return an Integer with position X of Spaceship.
     */
    public int getPosX() {
        return this.posX;
    }

    /**
     * Description: Getter method.
     * @return an Integer with position Y of Spaceship.
     */
    public int getPosY() {
        return this.posY;
    }

    /**
     * Description: Change position X for a new one.
     */
    public void setPosX(final int pX) {
        if (pX < lowerLimit) {
            this.posX = lowerLimit;
        } else if (pX > upperLimit - 1) {
            this.posX = (upperLimit - 1);
        } else {
            this.posX = pX;
        }
    }

    /**
     * Description: Change position Y for a new one.
     */
    public void setPosY(final int pY) {
        if (pY < lowerLimit) {
            this.posY = lowerLimit;
        } else if (pY > upperLimit) {
            this.posY = upperLimit - 1;
        } else {
            this.posY = posY;
        }
    }

    /**
     * Description: Getter method.
     * @return an Integer with lower limit that Spaceship can move.
     */
    public int getLowerLimint() {
        return this.lowerLimit;
    }

    /**
     * Description: Getter method.
     * @return an Integer with upper limit that Spaceship can move.
     */
    public int getUpperLimint() {
        return this.upperLimit;
    }

    /**
     * Description: Add one position to posY if new psition is between limits.
     */
    public void moveToRight() {
        if (this.posY < upperLimit) {
            this.posY += 1;
        }
    }

    /**
     * Description: Less one position to posY if new psition is between limits..
     */
    public void moveToLeft() {
        if (this.posY > lowerLimit) {
            this.posY -= 1;
        }
    }

    /**
     * Description: Getter method.
     * @return an String with position x and y where it shooted.
     */
    public String shoot() {
        return ">>>>> piw <<<<< shoot position: " + getPosX() + "," + getPosY();
    }
}
