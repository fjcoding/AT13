package org.fundacionjala.at13.spaceinvaders;

public class PositionElement {

    private int indexi;
    private int indexj;

    public PositionElement(final int indexiToSet, final int indexjToSet) {
        this.indexi = indexiToSet;
        this.indexj = indexjToSet;
    }

    /**
     * Returns index i for an array
     *
     * @return index i for an array
     */
    public int getIndexi() {
        return indexi;
    }

    /**
     * Returns index j for an array
     *
     * @return index j for an array
     */
    public int getIndexj() {
        return indexj;
    }
}
