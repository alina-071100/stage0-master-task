package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {

        String quadrant;

        if (x == 0 || y == 0) {
            quadrant = "zero";
        } else if (x > 0) {
            quadrant = y > 0 ? "first" : "fourth";
        } else {
            quadrant = y > 0 ? "second" : "third";
        }

        System.out.println(quadrant);

    }

}

