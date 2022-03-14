package main;

public class SnakeAndLadderGame {
    int playerPosition = 0;

    public int diceRoll() {
        return (int) (Math.random() * 10 % 6 + 1);
    }
}

