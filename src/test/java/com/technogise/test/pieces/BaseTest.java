package com.technogise.test.pieces;

import com.technogise.test.simulator.ChessSimulator;
import org.junit.Assert;
import org.junit.Before;

import java.util.List;

public class BaseTest {

    private ChessSimulator simulationApp;

    @Before
    public void init() {
        simulationApp = new ChessSimulator();
    }

    protected List<String> testChessSimulationApp(String input) {
        return simulationApp.simulateChessPossibleMoves(input);
    }

    protected void assertCollectionsEqual(List<String> expected, List<String> actual) {
        // matching both ways to check exact same contents,
        // so that no any additional move in actual than the expected

        Assert.assertTrue(expected.containsAll(actual));
        Assert.assertTrue(actual.containsAll(expected));
    }
}
