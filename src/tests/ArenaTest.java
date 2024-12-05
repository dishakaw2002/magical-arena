package tests;

import arena.Player;
import arena.Arena;

/**
 * Tests for the Arena class.
 */
public class ArenaTest {
    public static void main(String[] args) {
        Player player1 = new Player("Player A", 50, 5, 10);
        Player player2 = new Player("Player B", 100, 10, 5);

        // Create an arena and simulate the match
        Arena arena = new Arena(player1, player2);
        arena.simulateMatch();

        // Ensure one player is the winner
        assert player1.isAlive() || player2.isAlive() : "One player should win the match";
        assert !(player1.isAlive() && player2.isAlive()) : "Both players cannot be alive at the end";

        System.out.println("ArenaTest passed!");
    }
}
