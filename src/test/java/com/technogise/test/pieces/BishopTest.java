package com.technogise.test.pieces;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BishopTest extends BaseTest {

    @Test
    public void testBishopInMiddleCanMoveFourDirectionsDiagonally() {
        String input = "Bishop D4";
        List<String> expectedPossibleMoves = Arrays.asList(
                "C5", "B6", "A7",
                "E5", "F6", "G7", "H8",
                "E3", "F2", "G1",
                "C3", "B2", "A1");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

    }

    @Test
    public void testBishopInCornerCanMoveOneDirectionDiagonally() {
        String input = "Bishop A1";
        List<String> expectedPossibleMoves = Arrays.asList("B2", "C3", "D4", "E5", "F6", "G7", "H8");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Bishop A8";
        expectedPossibleMoves = Arrays.asList("B7", "C6", "D5", "E4", "F3", "G2", "H1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Bishop H1";
        expectedPossibleMoves = Arrays.asList("G2", "F3", "E4", "D5", "C6", "B7", "A8");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Bishop H8";
        expectedPossibleMoves = Arrays.asList("G7", "F6", "E5", "D4", "C3", "B2", "A1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testBishopOnBorderCanMoveTwoDirectionsDiagonally() {
        String input = "Bishop E1";
        List<String> expectedPossibleMoves = Arrays.asList("D2", "C3", "B4", "A5", "F2", "G3", "H4");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Bishop E8";
        expectedPossibleMoves = Arrays.asList("D7", "C6", "B5", "A4", "F7", "G6", "H5");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Bishop A4";
        expectedPossibleMoves = Arrays.asList("B5", "C6", "D7", "E8", "B3", "C2", "D1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Bishop H4";
        expectedPossibleMoves = Arrays.asList("G3", "F2", "E1", "G5", "F6", "E7", "D8");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }
}
