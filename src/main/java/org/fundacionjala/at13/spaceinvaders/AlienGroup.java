package org.fundacionjala.at13.spaceinvaders;
import java.util.ArrayList;

public class AlienGroup {
    private static final String TYPE = "Alien";
    private static final int INIT_X_POS = 0;
    private static final int INIT_Y_POS = 0;
    private static final int SPACE_SIZE_HEIGHT = 10;
    private static final int SPACE_SIZE_WIDTH = 15;
    private int GROUP_LEFT_LIMIT = 5;
    private int GROUP_RIGHT_LIMIT = 9;
    private int GROUP_DOWN_LIMIT = 2;
    private boolean directionIsTowardsRight = true;
    private ArrayList<Alien> alienGroup;
    /**
     * Class AlienGroup.
     */
    public AlienGroup() {
        alienGroup = new ArrayList<Alien>();
        addAliens();
    }
    /**
     * Method to add aliens.
     */
    public void addAliens() {
        for (int row = 0; row <= this.GROUP_DOWN_LIMIT; row++) {
            for (int col = this.GROUP_LEFT_LIMIT; col <= this.GROUP_RIGHT_LIMIT; col++) {
                Alien alien=new Alien(col,row);
                alienGroup.add(alien);
            }
        }
    }
    /**
     * Method to move all aliens
     */
    public void moveAliens() {
        if (gotToTheSpaceship() == false) {
            if(directionIsTowardsRight == false){
                if (this.GROUP_LEFT_LIMIT == 0) {
                    aliensMoveDown();
                    directionIsTowardsRight = true;
                    this.GROUP_DOWN_LIMIT += 1;
                } else {
                    aliensMoveLeft();
                    this.GROUP_RIGHT_LIMIT -= 1;
                    this.GROUP_LEFT_LIMIT -= 1;
                }
            }
            else{
                if (this.GROUP_RIGHT_LIMIT == SPACE_SIZE_WIDTH-1) {
                    aliensMoveDown();
                    this.GROUP_DOWN_LIMIT += 1;
                    directionIsTowardsRight=false;
                } else {
                    aliensMoveRight();
                    this.GROUP_RIGHT_LIMIT += 1;
                    this.GROUP_LEFT_LIMIT += 1;
                }

            }

        }
    }
    /**
     * Method to move aliens to the right.
     */
    public void aliensMoveRight() {
        for (Alien alien : alienGroup) {
            alien.moveRight();
        }
    }
    /**
     * Method to move aliens to the left.
     */
    public void aliensMoveLeft() {
        for (Alien alien : alienGroup) {
            alien.moveLeft();
        }
    }
    /**
     * Method to move aliens towards down.
     */
    public void aliensMoveDown() {
        for (Alien alien : alienGroup) {
            alien.moveDown();
        }
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
        if(this.GROUP_DOWN_LIMIT >= SPACE_SIZE_HEIGHT-2) {
            return true;
        } else { 
            return false; 
        }
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
        int maxAliens = alienGroup.size()-1;  
        int alienTurnToShoot = (int)(Math.random() * maxAliens);
        Bullet bulletShot = alienGroup.get(alienTurnToShoot).shoot();
        return bulletShot;
    }
}