package com.technogise.test.pieces;

import com.technogise.test.decider.ColumnDecider;
import com.technogise.test.decider.RowDecider;

import java.util.ArrayList;
import java.util.List;

/**
 * Bishop Can move across the board only diagonally
 */
public class Bishop extends Piece {
    Bishop() {
        super("Bishop");
    }

    @Override
    public List<String> getPossibleMoves(int curRow, char curCol) {
        List<String> possibleMoves = new ArrayList<>();

        //Towards left top
        char colIndex = curCol;
        int rowIndex = curRow;
        while (RowDecider.canMoveUp(rowIndex, 1) && ColumnDecider.canMoveLeft(colIndex, 1)) {
            rowIndex++;
            colIndex--;
            possibleMoves.add("" + colIndex + rowIndex);
        }

        //Towards right bottom
        colIndex = curCol;
        rowIndex = curRow;
        while (RowDecider.canMoveDown(rowIndex, 1) && ColumnDecider.canMoveRight(colIndex, 1)) {
            rowIndex--;
            colIndex++;
            possibleMoves.add("" + colIndex + rowIndex);
        }

        //Towards right top
        colIndex = curCol;
        rowIndex = curRow;
        while (RowDecider.canMoveUp(rowIndex, 1) && ColumnDecider.canMoveRight(colIndex, 1)) {
            rowIndex++;
            colIndex++;
            possibleMoves.add("" + colIndex + rowIndex);

        }

        //Towards left bottom
        colIndex = curCol;
        rowIndex = curRow;
        while (RowDecider.canMoveDown(rowIndex, 1) && ColumnDecider.canMoveLeft(colIndex, 1)) {
            rowIndex--;
            colIndex--;
            possibleMoves.add("" + colIndex + rowIndex);
        }

        return possibleMoves;
    }
}
