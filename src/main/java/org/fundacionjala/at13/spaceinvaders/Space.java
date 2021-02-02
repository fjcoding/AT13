package org.fundacionjala.at13.spaceinvaders;

public class Space {

    private static final int SPACE_HEIGHT = 50;
    private static final int SPACE_WIDTH = 100;
    private static final String FONT_SPACE = ".";
    private static String[][] space = new String[SPACE_HEIGHT][SPACE_WIDTH];

    protected Space() {
        // prevents calls from subclass
        throw new UnsupportedOperationException();
    }

    public static void createdSpace() {
        for (int i = 0; i < space.length; i++) {
            for (int j = 0; j < space[i].length; j++) {
                space[i][j] = FONT_SPACE;
            }
        }
    }

    public static void showSpace() {
        for (int i = 0; i < space.length; i++) {
            for (int j = 0; j < space[i].length; j++) {
                System.out.print(space[i][j]);
            }
            System.out.println();
        }
    }

}
