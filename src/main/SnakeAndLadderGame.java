package main;

public class SnakeAndLadderGame {

    public final int LADDER = 1;
    public final int SNAKE = 2;
    public final int MAX_BOARD_VALUE = 100;
    public final int MIN_BOARD_VALUE = 0;

    public int option() {
        int playerPosition = 0;
        while (playerPosition < MAX_BOARD_VALUE) {
            int opt = (int) (Math.random() * 10 % 3);
            int diceVal = ((int) (Math.random() * 10 % 6 + 1));
            switch (opt) {
                case LADDER:
                    if ((playerPosition + diceVal) > MAX_BOARD_VALUE) {}
                    else
                    playerPosition += diceVal;
                    break;
                case SNAKE:
                    if ((playerPosition - diceVal) < MIN_BOARD_VALUE)
                        playerPosition = MIN_BOARD_VALUE;
                    else
                        playerPosition -= diceVal;
                    break;
            }
        }
        return playerPosition;
    }
}

