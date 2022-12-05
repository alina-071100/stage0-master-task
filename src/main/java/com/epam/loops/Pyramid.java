package com.epam.loops;


public class Pyramid {

    public void printPyramid(int legLength) {

        for (int i = 1; i <= legLength; i++) {

            for (int j = 0; j < legLength - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();

        }

    }

}
