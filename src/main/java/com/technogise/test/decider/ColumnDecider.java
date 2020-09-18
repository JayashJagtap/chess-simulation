package com.technogise.test.decider;

public class ColumnDecider {

    private static char LEFT_BORDER = 'A';

    private static char RIGHT_BORDER = 'H';

    public static boolean canMoveLeft(char curColumn, int step) {
        return (curColumn-step) >= LEFT_BORDER;
    }

    public static boolean canMoveRight(char curColumn, int step) {
        return (curColumn+step) <= RIGHT_BORDER;

    }
}
