package com.sertan.monster;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonsterTest {

    @Test
    public void testMonsterValues() {
        Monster monster = new Monster(100, 25, 10);
        assertEquals(125, monster.getHealth());
        assertEquals(110, monster.getDamage());
        assertEquals(false, monster.isDead());
    }

    @Test
    public void takeDamage() {
        Monster monster = new Monster(100, 25, 10);
        monster.takeDamage(50);

        assertEquals(75, monster.getHealth());
        assertEquals(false, monster.isDead());
    }

    @Test
    public void isDeadTest() {
        Monster monster = new Monster(100, 25, 10);
        monster.takeDamage(125);

        assertEquals(0, monster.getHealth());
        assertEquals(true, monster.isDead());
    }

}
