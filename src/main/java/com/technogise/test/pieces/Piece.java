package com.technogise.test.pieces;

import java.util.List;

public abstract class Piece {
    String name;

    Piece(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract List<String> getPossibleMoves(int curRow, char curCol);
}
