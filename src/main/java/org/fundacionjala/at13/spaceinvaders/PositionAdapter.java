package org.fundacionjala.at13.spaceinvaders;

public class PositionAdapter {

    public static final int MATRIX_POS_OFFSET = 1;

    /**
     * Method to adapt x y positions to i j indexes of a matrix
     *
     * Mapping formula for matrix[i][j]
     *  i = matrix.length - posY - 1
     *  j = posX
     *
     * @param posX the position x to adapt for index i
     * @param posY the position y to adapt for index j
     * @param matrixHeight the height reference of the matrix used to calculate adapted i
     * @return PositionElement instance containing the indexes i and j for a matrix
     */
    public PositionElement adaptPosition(final int posX, final int posY, final int matrixHeight) {
        int adaptedi = matrixHeight - posY - MATRIX_POS_OFFSET;
        int adaptedj = posX;
        return new PositionElement(adaptedi, adaptedj);
    }
}
