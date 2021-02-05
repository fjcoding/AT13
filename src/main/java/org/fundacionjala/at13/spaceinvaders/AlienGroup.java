package org.fundacionjala.at13.spaceinvaders;
import java.util.ArrayList;

public class AlienGroup {
    private static final String TYPE = "Alien";
    private static final int INIT_X_POS = 0;
    private static final int INIT_Y_POS = 0;
    private ArrayList<Alien> alienGroup;
    /**
     * Class AlienGroup.
     */
    public AlienGroup() {

    }
    /**
     * Method to add aliens.
     */
    public void addAliens() {

    }
    /**
     * Method to move all aliens
     */
    public void moveAliens() {

    }
    /**
     * Method to move aliens to the right.
     */
    public void aliensMoveRight() {

    }
    /**
     * Method to move aliens to the left.
     */
    public void aliensMoveLeft() {

    }
    /**
     * Method to move aliens towards down.
     */
    public void aliensMoveDown() {

    }
    /**
     * @return arrayList of all aliens contained.
     */
    public ArrayList getAliens() {
        return alienGroup;
    }
    /**
     * @return a boolean when the group reached the spaceship.
     */
    public boolean gotToTheSpaceship() {
        return false;
    }
    /**
     * Method to calculate the new right limit of the group
     * when an alien column dies.
     */
    public void calculateGroupRightLimit() {

    }
    /**
     * Set the new right limit of the group.
     */
    public void setGroupRightLimit() {

    }
    /**
     * @return a bullet from the alien chosen to shoot.
     */
    public Bullet alienGroupShoot() {
        return new Bullet(TYPE, INIT_X_POS, INIT_Y_POS);
    }
}