package com.technogise.test.pieces;

import com.technogise.test.exception.InvalidPieceException;
import com.technogise.test.pieces.Piece;
import com.technogise.test.pieces.PieceFactory;
import org.junit.Assert;
import org.junit.Test;

public class PieceFactoryTest {

    @Test
    public void testValidPiece() {
        String pieceName = "King";
        Piece piece = PieceFactory.getPiece(pieceName);
        Assert.assertEquals(pieceName, piece.getName());
    }

    @Test(expected = InvalidPieceException.class)
    public void testInvalidPiece() {
        String pieceName = "Price";
        PieceFactory.getPiece(pieceName);
    }
}
