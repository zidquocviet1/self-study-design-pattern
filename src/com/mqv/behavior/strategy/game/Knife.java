package com.mqv.behavior.strategy.game;

public class Knife implements WeaponStrategy {
    @Override
    public void use() {
        System.out.println("cutting");
    }
}
