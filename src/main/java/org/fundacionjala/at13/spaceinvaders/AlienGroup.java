package org.fundacionjala.at13.spaceinvaders;
import java.util.ArrayList;

public class AlienGroup {
    private static final String TYPE = "Alien";
    private static final int INIT_X_POS = 0;
    private static final int INIT_Y_POS = 0;
<<<<<<< HEAD
=======
    private static final int SPACE_SIZE_HEIGHT = 10;
    private static final int SPACE_SIZE_WIDTH = 15;
    private static final int INITIAL_GROUP_LEFT_LIMIT = 5;
    private static final int INITIAL_GROUP_RIGHT_LIMIT = 9;
    private static final int INITIAL_GROUP_DOWN_LIMIT = 2;
    private int groupLeftLimit;
    private int groupRightLimit;
    private int groupDownLimit;
    private boolean directionIsTowardsRight = true;
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
    private ArrayList<Alien> alienGroup;
    /**
     * Class AlienGroup.
     */
    public AlienGroup() {
<<<<<<< HEAD

=======
        alienGroup = new ArrayList<Alien>();
        addAliens();
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
    }
    /**
     * Method to add aliens.
     */
    public void addAliens() {
<<<<<<< HEAD

=======
        for (int row = 0; row <= this.INITIAL_GROUP_DOWN_LIMIT; row++) {
            for (int col = this.INITIAL_GROUP_LEFT_LIMIT; col <= this.INITIAL_GROUP_RIGHT_LIMIT; col++) {
                Alien alien = new Alien(col, row);
                alienGroup.add(alien);
            }
        }
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
    }
    /**
     * Method to move all aliens
     */
    public void moveAliens() {
<<<<<<< HEAD

=======
        if (!gotToTheSpaceship()) {
            if(directionIsTowardsRight == false){
                if(this.groupLeftLimit == 0) {
                    aliensMoveDown();
                    directionIsTowardsRight = true;
                    this.groupDownLimit += 1;
                } else {
                    aliensMoveLeft();
                    this.groupRightLimit -= 1;
                    this.groupLeftLimit -= 1;
                }
            } else {
                if(this.groupRightLimit == SPACE_SIZE_WIDTH-1) {
                    aliensMoveDown();
                    this.groupDownLimit += 1;
                    directionIsTowardsRight = false;
                } else {
                    aliensMoveRight();
                    this.groupRightLimit += 1;
                    this.groupLeftLimit += 1;
                }
            }
        }
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
    }
    /**
     * Method to move aliens to the right.
     */
    public void aliensMoveRight() {
<<<<<<< HEAD

=======
        for (Alien alien : alienGroup) {
            alien.moveRight();
        }
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
    }
    /**
     * Method to move aliens to the left.
     */
    public void aliensMoveLeft() {
<<<<<<< HEAD

=======
        for (Alien alien : alienGroup) {
            alien.moveLeft();
        }
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
    }
    /**
     * Method to move aliens towards down.
     */
    public void aliensMoveDown() {
<<<<<<< HEAD

=======
        for (Alien alien : alienGroup) {
            alien.moveDown();
        }
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
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
<<<<<<< HEAD
        return false;
=======
        if (this.groupDownLimit >= SPACE_SIZE_HEIGHT - 2) {
            return true;
        } else {
            return false; 
        }
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
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
<<<<<<< HEAD
        return new Bullet(TYPE, INIT_X_POS, INIT_Y_POS);
=======
        int maxAliens = alienGroup.size() - 1;
        int alienTurnToShoot = (int) (Math.random() * maxAliens);
        Bullet bulletShot = alienGroup.get(alienTurnToShoot).shoot();
        return bulletShot;
>>>>>>> 7b4d12cc8deb9e37bb298779265697e1053fcd56
    }
}