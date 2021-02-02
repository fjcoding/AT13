package org.fundacionjala.at13.spaceinvaders;

public class Menu {

    /** DESCRIPTION.
     * method for option menu for the play
     */
    public boolean menuOptions(final int option) {
        switch (option) {
            case 1:
                Space.showSpace();
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
