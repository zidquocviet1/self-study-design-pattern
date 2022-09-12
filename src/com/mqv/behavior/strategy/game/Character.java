package com.mqv.behavior.strategy.game;

public abstract class Character {
    protected WeaponStrategy weapon;

    public Character() {}

    public void setWeapon(WeaponStrategy weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();
}
