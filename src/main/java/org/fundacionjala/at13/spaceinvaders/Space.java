package org.fundacionjala.at13.spaceinvaders;

public class Space {
    private static final int SPACE_SIZE=50;

    static String [][] space = new String[SPACE_SIZE][SPACE_SIZE];
    private static void createdSpace(){
        for (int i = 0; i < space[0].length ; i++) {
            for (int j = 0; j <space[0].length-1 ; j++) {
                space[i][j] = ".";
            }
        }
    }

    public static void showSpace(){
        createdSpace();
        for (int i = 0; i < space[0].length ; i++) {
            for (int j = 0; j <space[0].length-1 ; j++) {
                System.out.print(space[i][j]);
            }
            System.out.println();
        }
    }


}
