package com.technogise.test.pieces;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class HorseTest extends BaseTest {
    @Test
    public void testHorseInMiddleCanMoveEightPositions() {
        String input = "Horse E3";
        List<String> expectedPossibleMoves = Arrays.asList("F5", "D5", "G4", "G2", "D1", "F1", "C4", "C2");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testHorseInCornerCanMoveTwoPositions() {
        String input = "Horse A1";
        List<String> expectedPossibleMoves = Arrays.asList("B3", "C2");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse A8";
        expectedPossibleMoves = Arrays.asList("B6", "C7");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse H1";
        expectedPossibleMoves = Arrays.asList("F2", "G3");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse H8";
        expectedPossibleMoves = Arrays.asList("F7", "G6");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testHorseOnBorderInMiddleCanMoveFourPositions() {
        String input = "Horse E1";
        List<String> expectedPossibleMoves = Arrays.asList("C2", "D3", "F3", "G2");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse E8";
        expectedPossibleMoves = Arrays.asList("C7", "D6", "F6", "G7");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse A4";
        expectedPossibleMoves = Arrays.asList("B6", "C5", "C3", "B2");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse H4";
        expectedPossibleMoves = Arrays.asList("G6", "F5", "F3", "G2");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testHorseOnBorderNearCornerCanMoveThreePositions() {
        String input = "Horse A2";
        List<String> expectedPossibleMoves = Arrays.asList("B4", "C3", "C1");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse A7";
        expectedPossibleMoves = Arrays.asList("B5", "C8", "C6");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse H2";
        expectedPossibleMoves = Arrays.asList("G4", "F3", "F1");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse H7";
        expectedPossibleMoves = Arrays.asList("G5", "F8", "F6");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse B1";
        expectedPossibleMoves = Arrays.asList("D2", "A3", "C3");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse B8";
        expectedPossibleMoves = Arrays.asList("D7", "A6", "C6");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse G1";
        expectedPossibleMoves = Arrays.asList("E2", "F3", "H3");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);

        input = "Horse G8";
        expectedPossibleMoves = Arrays.asList("E7", "F6", "H6");
        possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }
}
