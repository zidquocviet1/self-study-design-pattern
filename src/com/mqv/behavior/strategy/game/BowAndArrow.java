package com.mqv.behavior.strategy.game;

public class BowAndArrow implements WeaponStrategy {
    @Override
    public void use() {
        System.out.println("Shoot");
    }
}
