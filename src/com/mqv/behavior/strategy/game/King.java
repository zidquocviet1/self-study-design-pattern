package com.mqv.behavior.strategy.game;

public class King extends Character {
    public King() {
        weapon = new Sword();
    }

    @Override
    public void fight() {
        weapon.use();
    }
}
