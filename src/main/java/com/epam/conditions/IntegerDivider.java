package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {

        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        int fraction = dividend / divider;
        String message = fraction * divider == dividend
                ? "can be divided completely" : "cannot be divided completely";
        System.out.println(message);

    }

}
