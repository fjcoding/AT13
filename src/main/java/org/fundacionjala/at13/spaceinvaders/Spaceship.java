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
    public int getPosX() {
        return this.posX;
    }
    public int getPosY() {
        return this.posY;
    }
    public void setPosX(final int pX) {
        if (pX < lowerLimit) {
            this.posX = lowerLimit;
        } else if (pX > upperLimit - 1) {
            this.posX = (upperLimit - 1);
        } else {
            this.posX = pX;
        }
    }
    public void setPosY(final int pY) {
        if (pY < lowerLimit) {
            this.posY = lowerLimit;
        } else if (pY > upperLimit) {
            this.posY = upperLimit - 1;
        } else {
            this.posY = pY;
        }
    }

    public int getLowerLimint() {
        return this.lowerLimit;
    }

    public int getUpperLimint() {
        return this.upperLimit;
    }

    public void moveToRight() {
        if (this.posY < upperLimit) {
            this.posY += 1;
        }
    }

    public void moveToLeft() {
        if (this.posY > lowerLimit) {
            this.posY -= 1;
        }
    }
    public String shoot() {
        return ">>>>> piw <<<<< shoot position: " + getPosX() + "," + getPosY();
    }
}
