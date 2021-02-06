package org.fundacionjala.at13.spaceinvaders;

public class SpaceElement {

    private int lowerLimit;
    private int upperLimit;
    private int posX;
    private int posY;

    public SpaceElement(final int pX, final int pY, final int llimit, final int ulimit) {
        this.lowerLimit = llimit;
        this.upperLimit = ulimit;
        setPosX(pX);
        this.posY = pY;
    }

    /**
     * @return an Integer with actual X position of SpaceElement.
     */
    public int getPosX() {
        return this.posX;
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
     * @return an Integer with actual Y position of SpaceElement.
     */
    public int getPosY() {
        return this.posY;
    }

    /**
     * Description: Change position Y for a new one.
     */
    public void setPosY(final int pY) {
        this.posY = pY;
    }

    /**
     * @return an Integer with actual lower X limit that SpaceElement can move.
     */
    public int getLowerLimit() {
        return this.lowerLimit;
    }

    /**
     * Description: Change lower limit for a new one.
     */
    public void setLowerLimit(final int lLimit) {
        this.lowerLimit = lLimit;
    }

    /**
     * @return an Integer with actual lower X limit that SpaceElement can move.
     */
    public int getUpperLimit() {
        return this.upperLimit;
    }

    /**
     * Description: Change upper limit for a new one.
     */
    public void setUpperLimit(final int uLimit) {
        this.upperLimit = uLimit;
    }

    /**
     * Description: Add one position to posX if new psition is between limits.
     */
    public void moveRight() {
        if (this.posX < upperLimit - 1) {
            this.posX += 1;
        }
    }

    /**
     * Description: Less one position to posX if new psition is between limits..
     */
    public void moveLeft() {
        if (this.posX > lowerLimit) {
            this.posX -= 1;
        }
    }


}
