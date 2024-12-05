package tests;

import arena.Player;

/**
 * Tests for the Player class.
 */
public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player("Player A", 50, 5, 10);

        // Test initialization
        assert player.getHealth() == 50 : "Health should be initialized to 50";
        assert player.getStrength() == 5 : "Strength should be initialized to 5";
        assert player.getAttack() == 10 : "Attack should be initialized to 10";

        // Test health reduction
        player.reduceHealth(20);
        assert player.getHealth() == 30 : "Health should decrease correctly";

        // Test death condition
        player.reduceHealth(40);
        assert player.isAlive() == false : "Player should die when health is 0";

        System.out.println("PlayerTest passed!");
    }
}
