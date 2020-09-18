package com.technogise.test;

import org.junit.Assert;

import java.util.List;

public class BaseTest {

    protected List<String> testChessSimulationApp(String input) {
        String[] inputs = input.split(" ");
        Piece piece = PieceFactory.getPiece(inputs[0]);
        System.out.println("Piece:"+piece.getName());
        System.out.println("Current Position:"+inputs[1].charAt(0)+ "-"+ Character.getNumericValue(inputs[1].charAt(1)));
        List<String> possibleMoves = piece.getPossibleMoves(Character.getNumericValue(inputs[1].charAt(1)), inputs[1].charAt(0));
        System.out.println("Possible Moves:"+possibleMoves);
        return possibleMoves;
    }

    protected void assertCollectionsEqual(List<String> expected, List<String> actual) {
        // matching both ways to check exact same contents,
        // so that no any additional move in actual than the expected

        Assert.assertTrue(expected.containsAll(actual));
        Assert.assertTrue(actual.containsAll(expected));
    }
}
