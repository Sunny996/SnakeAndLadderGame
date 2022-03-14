package main;

public class SnakeAndLadderGame {
    int playerPosition = 0;
    int LADDER = 1;
    int SNAKE = 2;

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

