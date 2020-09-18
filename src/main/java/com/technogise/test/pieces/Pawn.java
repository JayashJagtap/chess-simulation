package com.technogise.test.pieces;

import com.technogise.test.decider.RowDecider;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    Pawn() {
        super("Pawn");
    }

    @Override
    public List<String> getPossibleMoves(int curRow, char curCol) {
        //Can move only 1 step at a time, in the forward direction, vertically.
        //Can also move 1 step forward diagonally, in order to eliminate an opposing piece.
        //Assumption : Assume that the board is empty. This means that the pawn cannot move diagonally.

        List<String> possibleMoves = new ArrayList<>();
        if(RowDecider.canMoveUp(curRow, 1)) {
            possibleMoves.add("" + curCol + (curRow + 1));
        }
        return possibleMoves;
    }
}
