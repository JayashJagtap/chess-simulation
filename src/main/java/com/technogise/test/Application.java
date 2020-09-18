package com.technogise.test;

import com.technogise.test.pieces.Piece;
import com.technogise.test.pieces.PieceFactory;

import java.util.List;

public class Application {

    public List<String> simulateChessPossibleMoves(String input) {
        String[] inputs = input.split(" ");
        Piece piece = PieceFactory.getPiece(inputs[0]);
        System.out.println("Piece:"+piece.getName());
        System.out.println("Current Position:"+inputs[1].charAt(0)+ "-"+ Character.getNumericValue(inputs[1].charAt(1)));
        List<String> possibleMoves = piece.getPossibleMoves(Character.getNumericValue(inputs[1].charAt(1)), inputs[1].charAt(0));
        System.out.println("Possible Moves:"+possibleMoves);
        return possibleMoves;
    }
}
