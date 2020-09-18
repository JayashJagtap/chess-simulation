package com.technogise.test.pieces;

import com.technogise.test.exception.InvalidPieceException;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {
    private static Map<String, Piece> piecesMap = new HashMap<>();

    static {
        piecesMap.put("King", new King());
        piecesMap.put("Queen", new Queen());
        piecesMap.put("Bishop", new Bishop());
        piecesMap.put("Horse", new Horse());
        piecesMap.put("Rook", new Rook());
        piecesMap.put("Pawn", new Pawn());

    }

    public static Piece getPiece(String name) {
        if(!piecesMap.containsKey(name)) {
            throw new InvalidPieceException("Please provide one of the valid piece names [King/Queen/Bishop/Horse/Rook/Pawn]");
        }
        return piecesMap.get(name);
    }
}
