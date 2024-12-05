package tests;

import arena.Dice;

/**
 * Tests for the Dice class.
 */
public class DiceTest {
    public static void main(String[] args) {
        Dice dice = new Dice();

        // Test multiple rolls
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assert roll >= 1 && roll <= 6 : "Dice roll should be between 1 and 6";
        }

        System.out.println("DiceTest passed!");
    }
}
