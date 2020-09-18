package com.technogise.test.decider;

public class RowDecider {

    private static int TOP_ROW = 8;

    private static int BOTTOM_ROW = 1;

    public static boolean canMoveUp(int curRow, int steps) {
        return (curRow + steps) <= TOP_ROW;
    }

    public static boolean canMoveDown(int curRow, int steps) {
        return (curRow - steps) >= BOTTOM_ROW;
    }
}
