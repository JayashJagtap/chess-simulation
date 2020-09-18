package com.technogise.test;

import com.technogise.test.exception.InvalidCellException;
import com.technogise.test.exception.InvalidInputException;
import com.technogise.test.pieces.Piece;
import com.technogise.test.pieces.PieceFactory;

import java.util.List;

/**
 * Chess simulation application.
 *
 * Simulates movement of each unique piece on an empty chessboard.
 */
public class Application {

    /**
     * Simulate moves
     * @param input : Type of chess piece and its position e.g. King D4
     * @return List of all cells in which the piece can move.
     */
    public List<String> simulateChessPossibleMoves(String input) {
        validateInput(input);
        String[] inputs = input.split(" ");
        String pieceName = inputs[0];
        String cell = inputs[1];
        validateCell(cell);
        Piece piece = PieceFactory.getPiece(pieceName);
        System.out.println("Piece:"+piece.getName());
        System.out.println("Current Position:"+cell.charAt(0)+ "-"+ Character.getNumericValue(cell.charAt(1)));
        List<String> possibleMoves = piece.getPossibleMoves(Character.getNumericValue(cell.charAt(1)), cell.charAt(0));
        System.out.println("Possible Moves:"+possibleMoves);
        return possibleMoves;
    }

    private void validateInput(String input) {
        if(input == null || input.length() == 0 || input.split(" ").length <2) {
            throw new InvalidInputException("Please provide input in 'PieceName CellPosition' format");
        }
    }

    private void validateCell(String cell) {
        if(cell.charAt(0) < 'A' || cell.charAt(0) > 'H') {
            throw new InvalidCellException("Please provide Cell Column from A to H");
        }
        if(Character.getNumericValue(cell.charAt(1)) < 1 || Character.getNumericValue(cell.charAt(1)) > 8) {
            throw new InvalidCellException("Please provide Cell Row from 1 to 8");
        }
    }
}
