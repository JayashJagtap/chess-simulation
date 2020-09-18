package com.technogise.test;

import com.technogise.test.simulator.ChessSimulator;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ChessSimulator chessSimulator = new ChessSimulator();
        System.out.println("Please enter Piece and its Position:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<String> result = chessSimulator.simulateChessPossibleMoves(input);
        System.out.println("Result:"+result);
    }
}
