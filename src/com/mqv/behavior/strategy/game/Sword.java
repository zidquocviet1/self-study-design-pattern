package com.mqv.behavior.strategy.game;

public class Sword implements WeaponStrategy {
    @Override
    public void use() {
        System.out.println("Swigging");
    }
}
