package org.fundacionjala.at13.spaceinvaders;

public class Spaceship {

    private int posX;
    private int posY;
    private final int lowerLimit = 0;
    private final int upperLimit = 50;

    public Spaceship(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public int getPosX() {
        return this.posX;
    }
    public int getPosY() {
        return this.posY;
    }
    public void setPosX(int posX) {
        if (posX < lowerLimit) {
            this.posX = lowerLimit;
        } else if (posX > upperLimit - 1) {
            this.posX = (upperLimit - 1);
        } else {
            this.posX = posX;
        }
    }
    public void setPosY(int posY) {
        if (posY < lowerLimit) {
            this.posY = lowerLimit;
        } else if (posY > upperLimit) {
            this.posY = upperLimit - 1;
        } else {
            this.posY = posY;
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
