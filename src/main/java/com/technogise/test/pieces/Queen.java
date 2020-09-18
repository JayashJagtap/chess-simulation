package com.technogise.test.pieces;

import com.technogise.test.decider.ColumnDecider;
import com.technogise.test.decider.RowDecider;

import java.util.ArrayList;
import java.util.List;

/**
 * Queen Can move across the board in all 8 directions
 */
public class Queen extends Piece {
    Queen() {
        super("Queen");
    }

    @Override
    public List<String> getPossibleMoves(int curRow, char curCol) {
        List<String> possibleMoves = new ArrayList<>();

        // Vertical
        int rowIndex = 0;
        while(RowDecider.canMoveUp(rowIndex,1)) {
            rowIndex++;
            if(curRow != rowIndex) {
                possibleMoves.add("" + curCol + rowIndex);
            }
        }

        // Horizontal
        char colIndex = 'A'-1;
        while (ColumnDecider.canMoveRight(colIndex,1)){
            colIndex++;
            if(curCol != colIndex) {
                possibleMoves.add("" + colIndex + curRow);
            }
        }

        //Towards left top
        colIndex = curCol;
        rowIndex = curRow;
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
