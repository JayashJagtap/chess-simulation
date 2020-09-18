package com.technogise.test;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    King() {
        super("King");
    }

    @Override
    List<String> getPossibleMoves(int curRow, char curCol) {
        //Can move only 1 step at a time in all 8 directions (horizontal, vertical
        //and diagonal)

        List<String> possibleMoves = new ArrayList<>();

        if(curRow < 8) {
            possibleMoves.add(""+(curCol)+(curRow+1));
        }

        if(curCol > 'A' && curRow < 8) {
            possibleMoves.add("" + (char) (curCol - 1) + (curRow + 1));
        }

        if(curRow > 1) {
            possibleMoves.add("" + (curCol) + (curRow - 1));
        }

        if(curCol < 'H') {
            possibleMoves.add("" + (char) (curCol + 1) + (curRow));
        }

        if(curCol < 'H' && curRow > 1) {
            possibleMoves.add("" + (char) (curCol + 1) + (curRow - 1));
        }

        if(curCol > 'A') {
            possibleMoves.add("" + (char) (curCol - 1) + (curRow));
        }

        if(curCol < 'H' && curRow < 8) {
            possibleMoves.add("" + (char) (curCol + 1) + (curRow + 1));
        }
        if(curCol > 'A' && curRow > 1) {
            possibleMoves.add("" + (char) (curCol - 1) + (curRow - 1));
        }
        return possibleMoves;
    }
}
