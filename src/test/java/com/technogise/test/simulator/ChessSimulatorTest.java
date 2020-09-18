package com.technogise.test.simulator;

import com.technogise.test.exception.InvalidCellException;
import com.technogise.test.exception.InvalidPieceException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ChessSimulatorTest {

    private ChessSimulator application;

    @Before
    public void init() {
        application = new ChessSimulator();
    }

    @Test
    public void testValidInput() {
        String input = "King D4";
        List<String> result = application.simulateChessPossibleMoves(input);
        Assert.assertNotNull(result);
        Assert.assertFalse( result.isEmpty());
    }

    @Test(expected = InvalidPieceException.class)
    public void testInvalidPiece() {
        String input = "Prince D4";
        application.simulateChessPossibleMoves(input);
    }

    @Test(expected = InvalidCellException.class)
    public void testInvalidCellColumn() {
        String input = "King L1";
        application.simulateChessPossibleMoves(input);
    }

    @Test(expected = InvalidCellException.class)
    public void testInvalidCellRow() {
        String input = "King D9";
        application.simulateChessPossibleMoves(input);
    }
}
