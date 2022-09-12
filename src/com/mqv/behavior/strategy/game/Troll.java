package com.mqv.behavior.strategy.game;

public class Troll extends Character {
    public Troll() {
        weapon = new Axe();
    }

    @Override
    public void fight() {
        weapon.use();
    }
}
