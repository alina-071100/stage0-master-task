package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double a, double b, double c) {

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }

    }

}
