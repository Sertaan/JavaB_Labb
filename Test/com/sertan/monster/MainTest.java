package com.sertan.monster;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testBattle() {
        Player player = new Player("player", 100, 25);
        Monster monster = new Monster(5, 100, 25);

        Main.battle(player, monster);

        assertEquals(70, player.getHealth());
        assertEquals(false, player.isDead());

        assertEquals(80, monster.getHealth());
        assertEquals(false, monster.isDead());

    }

    @Test
    public void testLevelUp() {
        Player player = new Player("player", 100, 105);
        Monster monster = new Monster(5, 100, 25);

        Main.battle(player, monster);

        assertEquals(80, player.getHealth());
        assertEquals(106, player.getDamage());
        assertEquals(2, player.getLevel());
        assertEquals(false, player.isDead());

        assertEquals(0, monster.getHealth());
        assertEquals(true, monster.isDead());
    }


}
