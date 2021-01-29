package org.fundacionjala.at13.spaceinvaders;

public class Menu {
    public boolean menuOptions(int option){
        switch (option){
            case 1:
                Space.showSpace();
                return true;
            case 0:
                System.out.println("Finished");
                return false;
            default:
                System.out.println("option incorrect");
                return false;
        }
    }

}
