package com.technogise.test.pieces;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KingTest extends BaseTest {

    @Test
    public void testKingInMiddleCanMoveEightPositions() {
        String input = "King D5";
        List<String> expectedPossibleMoves = Arrays.asList("D6", "E6", "E5", "E4", "D4", "C4", "C5", "C6");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testKingInCornerCanMoveThreePositions() {
        String input = "King A1";
        List<String> expectedPossibleMoves = Arrays.asList("A2", "B1", "B2");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "King A8";
        expectedPossibleMoves = Arrays.asList("A7", "B8", "B7");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "King H1";
        expectedPossibleMoves = Arrays.asList("H2", "G1", "G2");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "King H8";
        expectedPossibleMoves = Arrays.asList("H7", "G8", "G7");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testKingOnBorderCanMoveFivePositions() {
        String input = "King A5";
        List<String> expectedPossibleMoves = Arrays.asList("A4", "A6", "B4", "B5", "B6");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "King H5";
        expectedPossibleMoves = Arrays.asList("H4", "H6", "G4", "G5", "G6");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "King D1";
        expectedPossibleMoves = Arrays.asList("C1", "C2", "D2", "E2", "E1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "King D8";
        expectedPossibleMoves = Arrays.asList("C8", "E8", "C7", "D7", "E7");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }
}
