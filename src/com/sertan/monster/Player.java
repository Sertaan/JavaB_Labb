package com.sertan.monster;

import static com.sertan.monster.PrintUtils.printStatus;

public class Player implements Combat {
    private String name;
    private int health;
    private int damage;
    private int level = 1;

    public Player(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void takeDamage(int damage) {
        if (damage > getHealth()) {
            setHealth(0);
        } else {
            setHealth( getHealth() - damage );
        }
    }

    @Override
    public boolean isDead() {
        return this.health == 0;
    }

    @Override
    public void getStatus() {
        printStatus(this.health, this.damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        setHealth(this.health + 10);
        setDamage(this.damage + 1);
        this.level = level;
    }

}
