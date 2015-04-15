package com.company;

public class Position {
    int horizontal;
    int vertical;

    public Position(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public boolean equals(Position otherPosition) {
        if (this.horizontal != otherPosition.horizontal || this.vertical != otherPosition.vertical) {
            return false;
        }
        else {
            return true;
        }
    }
}
