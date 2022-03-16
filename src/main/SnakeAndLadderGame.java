package main;

public class SnakeAndLadderGame {

    public final int LADDER = 1;
    public final int SNAKE = 2;
    public final int WINNING_POSITION = 100;
    public final int START_POSITION = 0;

    public int option() {
        int playerPosition = 0;
        while (playerPosition < WINNING_POSITION) {
            int opt = (int) (Math.random() * 10 % 3);
            int diceVal = ((int) (Math.random() * 10 % 6 + 1));
            switch (opt) {
                case LADDER:
                    playerPosition += diceVal;
                    if (playerPosition > WINNING_POSITION)
                        playerPosition -= diceVal;
                    break;  
                case SNAKE:
                    playerPosition -= diceVal;
                    if (playerPosition < START_POSITION)
                        playerPosition = START_POSITION;
                    break;
            }
        }
        return playerPosition;
    }
}

