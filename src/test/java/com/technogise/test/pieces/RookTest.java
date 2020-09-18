package com.technogise.test.pieces;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RookTest extends BaseTest {

    @Test
    public void testRookInMiddleCanMoveFourDirectionsHorizontallyAndVertically() {
        String input = "Rook E4";
        List<String> expectedPossibleMoves = Arrays.asList(
                "E1", "E2", "E3", "E5", "E6", "E7", "E8",
                "A4", "B4", "C4", "D4", "F4", "G4", "H4");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testRookInCornerCanMoveTwoDirectionsHorizontallyAndVertically() {
        String input = "Rook A1";
        List<String> expectedPossibleMoves = Arrays.asList(
                "A2", "A3", "A4", "A5", "A6", "A7", "A8",
                "B1", "C1", "D1", "E1", "F1", "G1", "H1");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Rook A8";
        expectedPossibleMoves = Arrays.asList(
                "A7", "A6", "A5", "A4", "A3", "A2", "A1",
                "B8", "C8", "D8", "E8", "F8", "G8", "H8");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Rook H8";
        expectedPossibleMoves = Arrays.asList(
                "H7", "H6", "H5", "H4", "H3", "H2", "H1",
                "A8", "B8", "C8", "D8", "E8", "F8", "G8");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Rook H1";
        expectedPossibleMoves = Arrays.asList(
                "H2", "H3", "H4", "H5", "H6", "H7", "H8",
                "A1", "B1", "C1", "D1", "E1", "F1", "G1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testRookOnBorderCanMoveThreeDirectionsHorizontallyAndVertically() {
        String input = "Rook A4";
        List<String> expectedPossibleMoves = Arrays.asList(
                "A1", "A2", "A3", "A5", "A6", "A7", "A8",
                "B4", "C4", "D4", "E4", "F4", "G4", "H4");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Rook B8";
        expectedPossibleMoves = Arrays.asList(
                "B1", "B2", "B3", "B4", "B5", "B6", "B7",
                "A8", "C8", "D8", "E8", "F8", "G8", "H8");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Rook H3";
        expectedPossibleMoves = Arrays.asList(
                "H1", "H2", "H4", "H5", "H6", "H7", "H8",
                "A3", "B3", "C3", "D3", "E3", "F3", "G3");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Rook E1";
        expectedPossibleMoves = Arrays.asList(
                "E2", "E3", "E4", "E5", "E6", "E7", "E8",
                "A1", "B1", "C1", "D1", "F1", "G1", "H1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }
}
