package com.technogise.test;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Piece {
    Horse() {
        super("Horse");
    }

    @Override
    List<String> getPossibleMoves(int curRow, char curCol) {
        //Can move across the board only in 2.5 steps
        // (2 vertical steps and 1 horizontal step)
        // (2 horizontal steps and 1 vertical step)

        List<String> possibleMoves = new ArrayList<>();

        if(curRow + 2 <= 8 && (curCol-1) >= 'A') {
            possibleMoves.add("" + (char) (curCol-1) + (curRow + 2));
        }

        if(curRow + 2 <= 8 && (curCol+1) <= 'H') {
            possibleMoves.add("" + (char) (curCol+1) + (curRow + 2));
        }

        if(curRow - 2 > 0 && (curCol-1) >= 'A') {
            possibleMoves.add("" + (char) (curCol-1) + (curRow - 2));
        }

        if(curRow - 2 > 0 && (curCol+1) <= 'H') {
            possibleMoves.add("" + (char) (curCol+1) + (curRow - 2));
        }

        if(curRow +1  <= 8 && (curCol-2) >= 'A') {
            possibleMoves.add("" + (char) (curCol-2) + (curRow + 1));
        }

        if(curRow -1  > 0 && (curCol-2) >= 'A') {
            possibleMoves.add("" + (char) (curCol-2) + (curRow - 1));
        }

        if(curRow +1  <= 8 && (curCol+2) <= 'H') {
            possibleMoves.add("" + (char) (curCol+2) + (curRow + 1));
        }

        if(curRow -1  > 0 && (curCol+2) <= 'H') {
            possibleMoves.add("" + (char) (curCol+2) + (curRow - 1));
        }

        return possibleMoves;
    }
}
