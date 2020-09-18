package com.technogise.test.pieces;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class QueenTest extends BaseTest {

    @Test
    public void testQueenInMiddleCanMoveAllEightDirections() {
        String input = "Queen D5";
        List<String> expectedPossibleMoves = Arrays.asList(
                "A8", "B7", "C6", "E4", "F3", "G2", "H1",
                "A2", "B3", "C4", "E6", "F7", "G8",
                "D1", "D2", "D3", "D4", "D6", "D7", "D8",
                "A5", "B5", "C5", "E5", "F5", "G5", "H5");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testQueenInCornerCanMoveThreeDirections() {
        String input = "Queen A1";
        List<String> expectedPossibleMoves = Arrays.asList(
                "A2", "A3", "A4", "A5", "A6", "A7", "A8",
                "B1", "C1", "D1", "E1", "F1", "G1", "H1",
                "B2", "C3", "D4", "E5", "F6", "G7", "H8");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Queen A8";
        expectedPossibleMoves = Arrays.asList(
                "A1", "A2", "A3", "A4", "A5", "A6", "A7",
                "B8", "C8", "D8", "E8", "F8", "G8", "H8",
                "B7", "C6", "D5", "E4", "F3", "G2", "H1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Queen H1";
        expectedPossibleMoves = Arrays.asList(
                "H2", "H3", "H4", "H5", "H6", "H7", "H8",
                "G1", "F1", "E1", "D1", "C1", "B1", "A1",
                "G2", "F3", "E4", "D5", "C6", "B7", "A8");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Queen H8";
        expectedPossibleMoves = Arrays.asList(
                "H7", "H6", "H5", "H4", "H3", "H2", "H1",
                "G8", "F8", "E8", "D8", "C8", "B8", "A8",
                "G7", "F6", "E5", "D4", "C3", "B2", "A1"
        );
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }


    @Test
    public void testQueenOnBorderCanMoveFiveDirections() {
        String input = "Queen A4";
        List<String> expectedPossibleMoves = Arrays.asList(
                "A3", "A2", "A1",
                "A5", "A6", "A7", "A8",
                "B4", "C4", "D4", "E4", "F4", "G4", "H4",
                "B5", "C6", "D7", "E8",
                "B3", "C2", "D1");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Queen H4";
        expectedPossibleMoves = Arrays.asList(
                "H3", "H2", "H1",
                "H5", "H6", "H7", "H8",
                "G4", "F4", "E4", "D4", "C4", "B4", "A4",
                "G5", "F6", "E7", "D8",
                "G3", "F2", "E1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Queen C1";
        expectedPossibleMoves = Arrays.asList(
                "B1", "A1",
                "D1", "E1", "F1", "G1", "H1",
                "C2", "C3", "C4", "C5", "C6", "C7", "C8",
                "D2", "E3", "F4", "G5", "H6",
                "B2", "A3");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Queen C8";
        expectedPossibleMoves = Arrays.asList(
                "A8", "B8",
                "D8", "E8", "F8", "G8", "H8",
                "C7", "C6", "C5", "C4", "C3", "C2", "C1",
                "D7", "E6", "F5", "G4", "H3",
                "B7", "A6");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }
}
