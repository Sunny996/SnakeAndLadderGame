package main;

public class SnakeAndLadderGame {

    int LADDER = 1;
    int SNAKE = 2;
    int MAX_BOARD_VALUE = 100;
    int MIN_BOARD_VALUE = 0;
    int players[] = new int[2];

    public int option() {
        int playerPosition = 0;
        int noOfDieRolls = 0;
        int playerIndex = 0;
        while (players[playerIndex] < MAX_BOARD_VALUE) {
            int opt = (int) (Math.random() * 10 % 3);
            int diceVal = ((int) (Math.random() * 10 % 6 + 1));
            switch (opt) {
                case 1:
                    if ((players[playerIndex] + diceVal) > MAX_BOARD_VALUE) {
                    } else
                        players[playerIndex] += diceVal;
                    break;
                case 2:
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


