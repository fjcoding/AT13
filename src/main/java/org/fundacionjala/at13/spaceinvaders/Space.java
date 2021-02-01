package org.fundacionjala.at13.spaceinvaders;

public class Space{

    private static final int SPACE_SIZE_HIGHT = 50;
    private static final int SPACE_SIZE_WIDTH = 100;
    private static final String FONT_SPACE = ".";

    static String [][] space = new String[SPACE_SIZE_HIGHT][SPACE_SIZE_WIDTH];

    public static void createdSpace(){
        for (int i = 0; i < space.length ; i++) {
            for (int j = 0; j <space[i].length ; j++) {
                space[i][j] = FONT_SPACE;
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