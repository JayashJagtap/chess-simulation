package com.technogise.test;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    Pawn() {
        super("Pawn");
    }

    @Override
    List<String> getPossibleMoves(int curRow, char curCol) {
        //Can move only 1 step at a time, in the forward direction, vertically.
        //Can also move 1 step forward diagonally, in order to eliminate an opposing piece.
        //Assumption : Assume that the board is empty. This means that the pawn cannot move diagonally.

        List<String> possibleMoves = new ArrayList<>();
        if(curRow < 8) {
            possibleMoves.add("" + (curCol) + (curRow + 1));
        }
        return possibleMoves;
    }
}
