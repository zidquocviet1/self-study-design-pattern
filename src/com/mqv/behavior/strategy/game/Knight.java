package com.mqv.behavior.strategy.game;

public class Knight extends Character {
    public Knight() {
        weapon = new BowAndArrow();
    }

    @Override
    public void fight() {
        weapon.use();
    }
}
