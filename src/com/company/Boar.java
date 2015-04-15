package com.company;

import java.util.ArrayList;
import java.util.List;

public class Boar {

    int width;
    int heigth;

    List<Position> existsPosition;

    public Boar (int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public boolean createStep(Position position, Player player) {

        if (position.vertical > width - 1 || position.horizontal > heigth - 1) {
            return false;
        }

        if (existsPosition == null) {
            existsPosition = new ArrayList<Position>();
            existsPosition.add(position);
        }
        else {

            for (int i = 0; i < existsPosition.size(); i++) {
                if (existsPosition.get(i).equals(position)) {
                    return false;
                }
            }

            existsPosition.add(position);

            return true;
        }

        return true;
    }

    public boolean isAvailableStep() {
        if (width * heigth <= existsPosition.size()) {
            return false;
        }
        else {
            return true;
        }
    }
}
