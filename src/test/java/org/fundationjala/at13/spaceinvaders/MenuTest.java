package org.fundationjala.at13.spaceinvaders;
import org.fundacionjala.at13.spaceinvaders.Menu;
import static org.junit.Assert.*;
import org.junit.Test;


public class MenuTest {
    
    @Test
    public void itDisplaySpaceByOptionOne() {
        Menu menu = new Menu();
        boolean result = menu.menuOptions(1);
        assertTrue(result);
    }

    @Test
    public void itDisplaySpaceByOptionZero() {
        Menu menu = new Menu();
        boolean result = menu.menuOptions(0);
        assertFalse(result);
    }

}
