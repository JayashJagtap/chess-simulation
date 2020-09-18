package com.technogise.test;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    Bishop() {
        super("Bishop");
    }

    @Override
    List<String> getPossibleMoves(int curRow, char curCol) {
        //Can move across the board only diagonally
        List<String> possibleMoves = new ArrayList<>();

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
