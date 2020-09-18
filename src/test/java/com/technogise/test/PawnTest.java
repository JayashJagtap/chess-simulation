package com.technogise.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PawnTest extends BaseTest {

    @Test
    public void testPawnInMiddleCanMoveOneStepForwardVertically() {
        String input = "Pawn D4";
        List<String> expectedPossibleMoves = Arrays.asList("D5");
        List<String> possibleMoves = testChessSimulationApp(input);
        assertCollectionsEqual(expectedPossibleMoves, possibleMoves);
    }

    @Test
    public void testPawnOnTopBorderCanNotMove() {
        String input = "Pawn D8";
        List<String> possibleMoves = testChessSimulationApp(input);
        Assert.assertEquals(0, possibleMoves.size());
    }

}
