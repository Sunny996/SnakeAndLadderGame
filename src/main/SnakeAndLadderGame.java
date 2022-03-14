package main;

public class SnakeAndLadderGame {

    int LADDER = 1;
    int SNAKE = 2;
    int MAX_BOARD_VALUE = 100;
    int MIN_BOARD_VALUE = 0;

    public int option() {
        int playerPosition = 0;
        int noOfDieRolls = 0;
        while (playerPosition < MAX_BOARD_VALUE) {
            int opt = (int) (Math.random() * 10 % 3);
            int diceVal = ((int) (Math.random() * 10 % 6 + 1));
            switch (opt) {
                case 1:
                    if ((playerPosition + diceVal) > MAX_BOARD_VALUE) {
                    } else
                        playerPosition += diceVal;
                    break;
                case 2:
                    if ((playerPosition - diceVal) < MIN_BOARD_VALUE)
                        playerPosition = MIN_BOARD_VALUE;
                    else
                        playerPosition -= diceVal;
                    break;
            }
            noOfDieRolls++;
            System.out.println("Player Position :" + playerPosition);

        }
        System.out.println("No of die rolls to win_" + noOfDieRolls);
        return playerPosition;
    }
}

