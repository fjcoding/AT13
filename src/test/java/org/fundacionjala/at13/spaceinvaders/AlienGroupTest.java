package org.fundacionjala.at13.spaceinvaders;   
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class AlienGroupTest {
    @Test
    public void shouldFillArrayWithAliens() {
        int numberOfRowsForAliens = 3;
        int numberOfColumnsForAliens = 5;
        // 3 * 5 = 15 aliens
        int numberOfAliensExpected = 15;
        AlienGroup alienGroup = new AlienGroup(3, 5);
        assertEquals(numberOfAliensExpected, alienGroup.getAliens().size());
    }
    @Test
    public void shouldReturnArrayOfAliens(){
        AlienGroup alienGroup = new AlienGroup(3, 5);
        assertNotNull(alienGroup.getAliens());
    }
}
