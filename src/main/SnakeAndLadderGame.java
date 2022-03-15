package main;

public class SnakeAndLadderGame {
    public int playerPosition = 0;
    public final int LADDER = 1;
    public final int SNAKE = 2;

    public int diceRoll() {
        return (int) (Math.random() * 10 % 6 + 1);
    }

    public int option() {
        int opt = (int) (Math.random() * 10 % 3);
        int diceVal = ((int) (Math.random() * 10 % 6 + 1));
        if (opt == LADDER)
            playerPosition += diceVal;
        else if (opt == SNAKE)
            playerPosition -= diceVal;
        return playerPosition;
    }
}

