package org.fundacionjala.at13.spaceinvaders;

public class Matrix {
    public static final int MATRIX_HEIGHT = 3;
    public static final int MATRIX_WIDTH = 3;
    private int[][] space;
    private Alien firstAlien = new Alien();

    public Matrix() {
        this.space = new int[MATRIX_HEIGHT][MATRIX_WIDTH];
    }

    /**
     * Description: The function creates an array of 1 and 0s.
     */
    public void fillMatrix() {
        for (int i = 0; i < MATRIX_HEIGHT; i++) {
            for (int j = 0; j < MATRIX_WIDTH; j++) {
                if ((i == firstAlien.getYPos())
                 && (j == firstAlien.getXPos())) {
                    space[i][j] = 1;
                } else {
                    space[i][j] = 0;
                }
            }
        }
    }

    /**
     * Description: The function displays an array.
     */
    public void showMatrix() {
        for (int i = 0; i < MATRIX_HEIGHT; i++) {
            for (int j = 0; j < MATRIX_WIDTH; j++) {
                System.out.print(space[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}
