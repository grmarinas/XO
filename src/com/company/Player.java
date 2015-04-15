package com.company;

import java.util.Scanner;

public class Player {
    String playerName;
    String gameCharacter;

    public Player(String playerName, String gameCharacter) {
        this.playerName = playerName;
        this.gameCharacter = gameCharacter;
    }

    public Position playerInteraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println('\f');
        System.out.println(playerName);
        System.out.print("Please enter index by horizontal > ");
        int xPoint = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter index by vertical > ");
        int yPoint = Integer.parseInt(scanner.nextLine());

        return new Position(xPoint, yPoint);
    }

    public void notifyPlayer(String message) {
        System.out.println("Dear, " + this.playerName + ", " + message);
    }
}
