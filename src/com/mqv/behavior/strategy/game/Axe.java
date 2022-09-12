package com.mqv.behavior.strategy.game;

public class Axe implements WeaponStrategy {
    @Override
    public void use() {
        System.out.println("chop ping");
    }
}
