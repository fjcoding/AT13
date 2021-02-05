package org.fundacionjala.at13.spaceinvaders;
import org.fundacionjala.at13.spaceinvaders.SpaceElement;
import static org.junit.Assert.*;
import org.junit.Test;

public class SpaceElementTest {
    
    @Test
    public void itShouldCreateASpaceElementWithDefaultMinXPosition() {
        int lowerXLimit=0;
        int upperXLimit=10;
        int positionInitialX=lowerXLimit-5;
        int positionInitialY=6;
        SpaceElement spaceElement=new SpaceElement(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        assertEquals(lowerXLimit, spaceElement.getPosX());
    }

    @Test
    public void itShouldCreateASpaceElementWithDefaultMaxXPosition() {
        int lowerXLimit=0;
        int upperXLimit=10;
        int positionInitialX=upperXLimit+1;
        int positionInitialY=6;
        SpaceElement spaceElement=new SpaceElement(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        assertEquals(upperXLimit-1, spaceElement.getPosX());
    }

    @Test
    public void itShouldCreateASpaceElementBetweenXLimits() {
        int lowerXLimit=0;
        int upperXLimit=10;
        int positionInitialX=5;
        int positionInitialY=6;
        SpaceElement spaceElement=new SpaceElement(positionInitialX,positionInitialY,lowerXLimit,upperXLimit);
        assertEquals(positionInitialX, spaceElement.getPosX());
    }
}
