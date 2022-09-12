package com.mqv.behavior.strategy;

import com.mqv.behavior.strategy.game.Axe;
import com.mqv.behavior.strategy.game.BowAndArrow;
import com.mqv.behavior.strategy.game.Character;
import com.mqv.behavior.strategy.game.King;

/**
 * @author VietMai - Initial contribution
 */
public class GamePlay {
    public static void main(String[] args) {
        Character viet = new King();
        viet.fight();

        System.out.println("Change weapon to Axe");
        viet.setWeapon(new Axe());
        viet.fight();

        System.out.println("Change weapon to BowAndArrow");
        viet.setWeapon(new BowAndArrow());
        viet.fight();
    }
}
