package org.fundacionjala.at13.spaceinvaders;

public class Space{

    static String [][] space = new String[50][50];

    public static void createdSpace(){
        for (int i = 0; i < space.length ; i++) {
            for (int j = 0; j <space[i].length ; j++) {
                space[i][j] = ".";
            }
        }
    }

    public static void showSpace(){
        for (int i = 0; i < space.length ; i++) {
            for (int j = 0; j <space[i].length ; j++) {
                System.out.print(space[i][j]);
            }
            System.out.println();
        }
    }

}