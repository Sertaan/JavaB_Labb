package com.sertan.monster;

public interface Combat {
    void takeDamage(int damage);

    boolean isDead();

    void getStatus();
}
