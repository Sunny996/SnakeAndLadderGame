package main;

public class SnakeAndLadderGame {

    public final int LADDER = 1;
    public final int SNAKE = 2;
    public final int MAX_BOARD_VALUE = 100;
    public final int MIN_BOARD_VALUE = 0;
    int players[] = new int[2];

    public int option() {
        int playerPosition = 0;
        int noOfDieRolls = 0;
        int playerIndex = 0;
        while (players[playerIndex] < MAX_BOARD_VALUE) {
            int opt = (int) (Math.random() * 10 % 3);
            int diceVal = ((int) (Math.random() * 10 % 6 + 1));
            switch (opt) {
                case LADDER:
                    if ((players[playerIndex] + diceVal) > MAX_BOARD_VALUE) {
                    } else
                        players[playerIndex] += diceVal;
                    break;
                case SNAKE:
                    if ((players[playerIndex] - diceVal) < MIN_BOARD_VALUE)
                        players[playerIndex] = MIN_BOARD_VALUE;
                    else
                        players[playerIndex] -= diceVal;
                    playerIndex = Math.abs(playerIndex - 1);
                    break;
            }
        }
        return playerIndex;
    }
}


