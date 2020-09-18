package com.technogise.test;

import java.util.List;

public abstract class Piece {
    String name;

    Piece(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract List<String> getPossibleMoves(int curRow, char curCol);
}
