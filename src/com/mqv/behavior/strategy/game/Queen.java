package com.mqv.behavior.strategy.game;

public class Queen extends Character {
    public Queen() {
        weapon = new Knife();
    }

    @Override
    public void fight() {
        weapon.use();
    }
}
