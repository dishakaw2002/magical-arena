package arena;

/**
 * Arena class simulates the battle between two players.
 */
public class Arena {
    private Player player1;
    private Player player2;

    // Constructor initializes the players
    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // Simulates the match between two players
    public void simulateMatch() {
        Dice dice = new Dice();

        while (player1.isAlive() && player2.isAlive()) {
            // Determine attacker and defender
            Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
            Player defender = attacker == player1 ? player2 : player1;

            // Roll dice for attack and defense
            int attackRoll = dice.roll();
            int defenseRoll = dice.roll();

            // Calculate damage dealt
            int damageDealt = Math.max(0, (attacker.getAttack() * attackRoll) - (defender.getStrength() * defenseRoll));
            defender.reduceHealth(damageDealt);

            // Print battle information
            System.out.println(attacker.getName() + " attacks " + defender.getName() +
                " for " + damageDealt + " damage. " +
                defender.getName() + "'s health: " + defender.getHealth());
        }

        // Determine and announce the winner
        Player winner = player1.isAlive() ? player1 : player2;
        System.out.println("Winner: " + winner.getName());
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Initialize players
        Player player1 = new Player("Player A", 50, 5, 10);
        Player player2 = new Player("Player B", 100, 10, 5);

        // Create arena and simulate match
        Arena arena = new Arena(player1, player2);
        arena.simulateMatch();
    }
}
