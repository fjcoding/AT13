package org.fundacionjala.at13.spaceinvaders;

public class Menu {

    /** DESCRIPTION.
     * method for option menu for the play
     */
    public boolean menuOptions(final int option) {
        switch (option) {
            case 1:
                //new Space(Constants.SPACE_SIZE_HEIGHT, Constants.SPACE_SIZE_WIDTH).show();
                return true;
            case 0:
                System.out.println("Exit");
                return false;
            default:
                System.out.println("option incorrect");
                return false;
        }
    }

}
