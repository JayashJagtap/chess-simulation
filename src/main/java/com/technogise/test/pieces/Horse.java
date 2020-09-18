package com.technogise.test.pieces;

import com.technogise.test.decider.ColumnDecider;
import com.technogise.test.decider.RowDecider;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Piece {
    Horse() {
        super("Horse");
    }

    @Override
    public List<String> getPossibleMoves(int curRow, char curCol) {
        //Can move across the board only in 2.5 steps
        // (2 vertical steps and 1 horizontal step)
        // (2 horizontal steps and 1 vertical step)

        List<String> possibleMoves = new ArrayList<>();

        if(RowDecider.canMoveUp(curRow,2)) {
            if(ColumnDecider.canMoveLeft(curCol,1)) {
                possibleMoves.add("" + (char) (curCol - 1) + (curRow + 2));
            }
            if(ColumnDecider.canMoveRight(curCol,1)) {
                possibleMoves.add("" + (char) (curCol+1) + (curRow + 2));
            }
        }

        if(RowDecider.canMoveDown(curRow,2)) {
            if(ColumnDecider.canMoveLeft(curCol,1)) {
                possibleMoves.add("" + (char) (curCol - 1) + (curRow - 2));
            }
            if(ColumnDecider.canMoveRight(curCol,1)) {
                possibleMoves.add("" + (char) (curCol+1) + (curRow - 2));
            }
        }

        if(RowDecider.canMoveUp(curRow ,1)) {
            if(ColumnDecider.canMoveLeft(curCol,2)) {
                possibleMoves.add("" + (char) (curCol - 2) + (curRow + 1));
            }
            if(ColumnDecider.canMoveRight(curCol,2)) {
                possibleMoves.add("" + (char) (curCol+2) + (curRow + 1));
            }
        }

        if(RowDecider.canMoveDown(curRow,1)) {
            if(ColumnDecider.canMoveLeft(curCol,2)) {
                possibleMoves.add("" + (char) (curCol - 2) + (curRow - 1));
            }
            if(ColumnDecider.canMoveRight(curCol,2)) {
                possibleMoves.add("" + (char) (curCol+2) + (curRow - 1));
            }
        }

        return possibleMoves;
    }
}
