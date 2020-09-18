package com.technogise.test;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    Queen() {
        super("Queen");
    }

    @Override
    List<String> getPossibleMoves(int curRow, char curCol) {
        //Can move across the board in all 8 directions
        List<String> possibleMoves = new ArrayList<>();

        // Horizontal
        for(int i=1; i<=8; i++) {
            if(curRow != i) {
                possibleMoves.add("" + curCol + i);
            }
        }

        // Vertical
        for(int i='A'; i<='H'; i++) {
            if(curCol != i) {
                possibleMoves.add("" + (char) i + curRow);
            }
        }

        //Towards left top
        int colIndex = curCol-1;
        for(int i=curRow+1;i<=8;i++) {
            if(colIndex < 'A') {
                break;
            }
            possibleMoves.add("" + (char)(colIndex) + i);
            colIndex--;
        }

        //Towards right bottom
        colIndex = curCol + 1;
        for(int i=curRow-1; i > 0; i--) {
            if(colIndex > 'H') {
                break;
            }
            possibleMoves.add("" + (char)(colIndex) + i);
            colIndex++;
        }

        //Towards right top
        colIndex = curCol + 1;
        for(int i=curRow+1; i <= 8; i++) {
            if(colIndex > 'H') {
                break;
            }
            possibleMoves.add("" + (char)(colIndex) + i);
            colIndex++;
        }

        //Towards left bottom
        colIndex = curCol - 1;
        for(int i=curRow-1; i > 0; i--) {
            if(colIndex < 'A') {
                break;
            }
            possibleMoves.add("" + (char)(colIndex) + i);
            colIndex--;
        }
        return possibleMoves;
    }
}
