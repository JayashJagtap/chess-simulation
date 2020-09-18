package com.technogise.test;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {
    private static Map<String, Piece> piecesMap = new HashMap<>();

    PieceFactory() {
        piecesMap.put("King", new King());
        piecesMap.put("Queen", new Queen());
        piecesMap.put("Bishop", new Bishop());
        piecesMap.put("Horse", new Horse());
        piecesMap.put("Rook", new Rook());
        piecesMap.put("Pawn", new Pawn());

    }

    public static Piece getPiece(String name) {
        return piecesMap.get(name);
    }
}
