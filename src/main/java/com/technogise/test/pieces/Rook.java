package com.technogise.test.pieces;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    Rook() {
        super("Rook");
    }

    @Override
    public List<String> getPossibleMoves(int curRow, char curCol) {
        //Can move across the board only vertically and horizontally
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
