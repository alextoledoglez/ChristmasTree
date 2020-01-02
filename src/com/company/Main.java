package com.company;

import java.util.Scanner;

public class Main {

    private final static int treeSides = 2;
    private final static int defaultTreeWidth = 10;
    private final static String treeEmptyChar = " ";
    private final static String defaultTreeTextChar = "*";

    private static void printChristmasTreeFrom(final int treeHeight,
                                               final String treeChar) {
        final int treeWidth = (treeHeight * treeSides);
        for (int i = 0; i < treeHeight; i++) {
            int multiplesTimes = (i + 1) + i;
            printlnFrom(treeWidth, treeChar, multiplesTimes);
            System.out.println();
        }
    }

    private static void printlnFrom(final int treeWidth,
                                    final String treeChar,
                                    final int multiplesTimes) {
        int emptyCharsCount = (treeWidth - multiplesTimes);
        int twiceEmptyCharsCount = (emptyCharsCount / treeSides);
        printEmptyCharInLineFrom(twiceEmptyCharsCount);
        printTreeCharMultiplesTimes(treeChar, multiplesTimes);
        printEmptyCharInLineFrom(twiceEmptyCharsCount);
    }

    private static void printTreeCharMultiplesTimes(final String treeChar,
                                                    final int multiplesTimes) {
        for (int i = 0; i < multiplesTimes; i++) {
            System.out.print(treeChar);
        }
    }

    private static void printEmptyCharInLineFrom(final int twiceEmptyCharsCount) {
        for (int i = 0; i < twiceEmptyCharsCount; i++) {
            System.out.print(treeEmptyChar);
        }
    }

    private static int getValidTreeHeightFrom(final String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            return defaultTreeWidth;
        }
    }

    private static String getValidTreeCharFrom(final String input) {
        return (input != null && input.length() == 1) ?
                input :
                defaultTreeTextChar;
    }

    public static void main(String[] args) {

        System.out.println("Set the desired christmas tree options!!!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set tree height: ");
        final int treeHeight = getValidTreeHeightFrom(scanner.next());

        System.out.print("Set tree char: ");
        final String treeChar = getValidTreeCharFrom(scanner.next());

        printChristmasTreeFrom(treeHeight, treeChar);
    }
}
