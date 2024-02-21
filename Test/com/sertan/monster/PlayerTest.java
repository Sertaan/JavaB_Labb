package com.sertan.monster;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testPLayerValues() {
        Player player = new Player("Sertan", 100, 25 );
        assertEquals(1, player.getLevel());
        assertEquals("Sertan", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(25, player.getDamage());
        assertEquals(false, player.isDead());
    }

    @Test
    public void takeDamage() {
        Player player = new Player("Sertan", 100, 25 );
        player.takeDamage(50);

        assertEquals(50, player.getHealth());
        assertEquals(false, player.isDead());
    }

    @Test
    public void isDeadTest() {
        Player player = new Player("Sertan", 100, 25 );
        player.takeDamage(100);

        assertEquals(0, player.getHealth());
        assertEquals(true, player.isDead());
    }


}
