# Magical Arena Game

## Overview
In Magical Arena, two players are pitted against each other in a turn-based battle. Each turn involves:
    Determining an attacker and defender based on health values.
    Rolling dice to calculate attack and defense strength.
    Applying damage to the defender based on the attack strength minus defense.
The game ends when one player's health reaches zero, and the winner is declared.


## How It Works
1. Player Initialization:
    Players are initialized with:
    a. Name
    b. Health
    c. Attack Strength
    d. Defense Strength

2. Dice Mechanics:
    A dice is rolled to generate random values for attack and defense multipliers.

3. Damage Calculation:
    Damage is calculated as:
    Damage = (Attacker's Attack Strength * Attack Roll) - (Defender's Defense Strength * Defense Roll)
    If damage is less than 0, it is set to 0.

4. Game Progression:
    The game continues until one player's health reaches zero.


## Folder Structure
 magical-arena/
├── bin/                # Compiled Java class files
│   ├── arena/          # Game logic classes
│   └── tests/          # Test classes
├── src/                # Source code files
│   ├── arena/          # Game logic classes
│   │   ├── Arena.java
│   │   ├── Player.java
│   │   └── Dice.java
│   └── tests/          # Test classes
│       ├── PlayerTest.java
│       ├── ArenaTest.java
│       └── DiceTest.java
└── README.md           # Project documentation


## Setup Instructions
1. Clone the Repository:
    git clone <repository_url>
    cd magical-arena

2. Compile the Code:
    javac -d bin -sourcepath src src/arena/*.java

3. Compile the Tests:
    javac -d bin -sourcepath src src/tests/*.java


## Running the Game
1. Execute the main program:
    java -cp bin arena.Arena
    The output will display the battle simulation and the winner.


## Running Tests
To validate the functionality of individual components, run the test classes:

1. PlayerTest:
    java -cp bin tests.PlayerTest

2. ArenaTest:
    java -cp bin tests.ArenaTest

3. DiceTest:
    java -cp bin tests.ArenaTest


## Important Notes
1. Ensure you are running this in a Java 8 or higher environment.

2. Run all commands from the project root directory


## Future Enhancements
Here are some ideas for improving the game:

1. Special Abilities:
    Players could have unique abilities (e.g., healing or critical strikes).

2. Multiplayer:
    Expand to support more than two players in a battle royale format.

3. GUI Version:
    Add a graphical user interface for an interactive experience.

4. Customizable Characters:
    Allow players to create their characters with custom stats.

5. Advanced Battle Mechanics:
    Introduce buffs, debuffs, or status effects.

## Author
Developed by Disha Kaw.
For queries, feel free to reach out at:
Email: dishakaw2002@gmail.com





