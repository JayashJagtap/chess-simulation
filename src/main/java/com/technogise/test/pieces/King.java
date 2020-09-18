package com.technogise.test.pieces;

import com.technogise.test.decider.ColumnDecider;
import com.technogise.test.decider.RowDecider;

import java.util.ArrayList;
import java.util.List;

/*King Can move only 1 step at a time in all 8 directions
* (horizontal, vertical and diagonal)
*/
public class King extends Piece {
    King() {
        super("King");
    }

    @Override
    public List<String> getPossibleMoves(int curRow, char curCol) {
        List<String> possibleMoves = new ArrayList<>();

        if(RowDecider.canMoveUp(curRow,1)) {
            possibleMoves.add(""+(curCol)+(curRow+1));
            if(ColumnDecider.canMoveRight(curCol,1)) {
                possibleMoves.add("" + (char) (curCol + 1) + (curRow + 1));
            }
            if(ColumnDecider.canMoveLeft(curCol,1)) {
                possibleMoves.add("" + (char) (curCol - 1) + (curRow + 1));
            }
        }

        if(RowDecider.canMoveDown(curRow, 1)) {
            possibleMoves.add("" + (curCol) + (curRow - 1));
            if(ColumnDecider.canMoveRight(curCol,1)) {
                possibleMoves.add("" + (char) (curCol + 1) + (curRow - 1));
            }
            if(ColumnDecider.canMoveLeft(curCol,1)) {
                possibleMoves.add("" + (char) (curCol - 1) + (curRow - 1));
            }
        }

        if(ColumnDecider.canMoveRight(curCol,1)) {
            possibleMoves.add("" + (char) (curCol + 1) + (curRow));
        }

        if(ColumnDecider.canMoveLeft(curCol,1)) {
            possibleMoves.add("" + (char) (curCol - 1) + (curRow));
        }

        return possibleMoves;
    }
}
