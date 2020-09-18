package com.technogise.test.pieces;

import java.util.ArrayList;
import java.util.List;

/**
 * Rook Can move across the board only vertically and horizontally
 */
public class Rook extends Piece {
    Rook() {
        super("Rook");
    }

    @Override
    public List<String> getPossibleMoves(int curRow, char curCol) {
        List<String> possibleMoves = new ArrayList<>();
        int colIndex = 'A';
        for(int i=1;i<=8;i++) {
            if(i != curRow) {
                possibleMoves.add("" + (curCol) + i);
            }
            if(colIndex+i-1 != curCol) {
                possibleMoves.add("" + (char)(colIndex+i-1) + (curRow));
            }
        }

        return possibleMoves;
    }
}
