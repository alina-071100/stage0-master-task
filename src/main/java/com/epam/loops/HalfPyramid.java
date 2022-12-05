package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int legLength) {

        for (int i = 1; i <= legLength; i++) {

            for (int j = 0; j < legLength; j++) {
                System.out.print(legLength - j > i ? " " : "*");
            }

            System.out.println();

        }

    }

}
