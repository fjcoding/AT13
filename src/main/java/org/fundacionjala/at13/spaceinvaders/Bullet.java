package org.fundacionjala.at13.spaceinvaders;
public class Bullet {
    private int positionInitialX;
    private int positionInitialY;
    private boolean bulletExist;
    private String type;

    public Bullet(final String shooterType, final int x, final int y) {
        positionInitialX = x;
        positionInitialY = y;
        bulletExist = false;
        this.type = shooterType;
        goForward();
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
     * Description: The function returns the type of the shooter.
     *
     * @return a String with the type of the shooter.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Description: The function returns the type of the shooter.
     *
     * @return a String with the type of the shooter.
     */
    public void goForward() {
        if (this.getType() == Space.ALIEN) {
            goDown();
        } else {
            goUp();
        }
    }

    /**
     * Description: The function displays a bullet shoot.
     *
     * @return a String that shoots a bullet.
     */
    public String itShooting() {
        if (!bulletExist) {
            bulletExist = true;
            return "The " + this.type + " has fired from "
            + this.positionInitialX
            + " " + this.positionInitialY;
        } else {
            return "The " + this.type + " cannot fired.";
        }
    }

    /**
     * Description: The function verifies if the bullet collapses.
     *
     * @return a boolean that verifies if the bullet collapses.
     */
    public boolean isCollapsedBullet(final int positionX1, final int positionY1,
    final int positionX2, final int positionY2) {
        if (positionX1 == positionX2 && positionY1 == positionY2) {
            System.out.println("The bullet has collapsed");
            bulletExist = false;
            return true;
        }
        return false;
    }

    /**
     * Description: Less one position to move down the bullet.
     */
    public void goDown() {
        this.positionInitialY -= 1;
    }

    /**
     * Description: Add one position to move up the bullet.
     */
    public void goUp() {
        this.positionInitialY += 1;
    }

    /**
     * @return true if they are equal, false if they're not.
     */
    public boolean equals(final Bullet otherBullet) {
        return this.positionInitialX == otherBullet.getPositionX()
         && this.positionInitialY == otherBullet.getPositionY()
         && this.type == otherBullet.getType();
    }
}
