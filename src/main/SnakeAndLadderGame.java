package main;

public class SnakeAndLadderGame {

    public final int LADDER = 1;
    public final int SNAKE = 2;
    public final int WINNING_POSITION = 100;
    public final int START_POSITION = 0;
    int players[] = new int[2];

    public int option() {
        int playerIndex = 0;
        while (players[playerIndex] < WINNING_POSITION) {
            int opt = (int) (Math.random() * 10 % 3);
            int diceVal = ((int) (Math.random() * 10 % 6 + 1));
            switch (opt) {
                case LADDER:
                    players[playerIndex] += diceVal;
                    if ((players[playerIndex] > WINNING_POSITION)
                        players[playerIndex] -= diceVal;
                    break;
                case SNAKE:
                    players[playerIndex] -= diceVal;
                    if ((players[playerIndex]) < START_POSITION)
                        players[playerIndex] = START_POSITION;
                    playerIndex = Math.abs(playerIndex - 1);
                    break;
            }
        }
        return playerIndex;
    }
}
