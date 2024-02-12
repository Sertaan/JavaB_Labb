package com.sertan.monster;

import java.util.concurrent.ThreadLocalRandom;

import static com.sertan.monster.PrintUtils.printStatus;

public class Monster {
    // Health
    private static final int MINUMUM_HEALTH = 5;
    private static final int MAXIMUM_HEALTH = 20;

    // Damage
    private static final int MINUMUM_DAMAGE = 5;
    private static final int MAXIMUM_DAMAGE = 20;

    private int health;
    private int damage;

    public Monster() {
        this.health = ThreadLocalRandom.current().nextInt(MINUMUM_HEALTH, MAXIMUM_HEALTH + 1);
        this.damage = ThreadLocalRandom.current().nextInt(MINUMUM_DAMAGE, MAXIMUM_DAMAGE + 1);
    }

    public Monster(int level) {
        this.health = ThreadLocalRandom.current().nextInt(MINUMUM_HEALTH, MAXIMUM_HEALTH + 1 + level);
        this.damage = ThreadLocalRandom.current().nextInt(MINUMUM_DAMAGE, MAXIMUM_DAMAGE + 1 + level);
    }


    public void takeDamage(int damage) {
        if (damage > getHealth()) {
            setHealth(0);
        } else {
            setHealth( getHealth() - damage );
        }
    }

    public boolean isDead() {
        return this.health == 0;
    }

    public void getStatus() {
        printStatus(this.health, this.damage);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
