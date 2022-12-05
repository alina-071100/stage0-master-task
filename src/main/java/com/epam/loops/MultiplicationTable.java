package com.epam.loops;

public class MultiplicationTable {
    public void printTable(int multiplicand) {

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.printf(
                    "%d x %d = %d\n",
                    multiplier, multiplicand, multiplier * multiplicand
            );
        }

    }
}
