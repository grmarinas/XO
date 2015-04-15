package com.company;

public class GameXO extends Game {

    Player[] players;
    Boar board;

    public GameXO () {
        this.board = new Boar(3, 3);
        this.players = new Player[]{new Player("Player 1", "x"), new Player("Player 2", "o")};
    }

    public void start() {
        boolean gameIsOver = false;

        while (gameIsOver == false) {
            for (int i = 0; i < players.length; i++) {

                boolean isAValidStep = false;
                while (isAValidStep == false) {
                    Position position = players[i].playerInteraction();
                    isAValidStep = this.board.createStep(position, players[i]);
                    if (isAValidStep == false)
                        players[i].notifyPlayer("this step isn't valid. Please try again");
                }

                //TODO: to find a winner
                boolean isAvailableStep = this.board.isAvailableStep();

                if (isAvailableStep == false) {
                    gameIsOver = true;
                    break;
                }
            }
        }

        System.out.println("Game is over");
    }
}
