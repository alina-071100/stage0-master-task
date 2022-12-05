package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int digitSum = NumberUtils.ones(number) + NumberUtils.tens(number)
                + NumberUtils.hundreds(number) + NumberUtils.thousands(number);

        System.out.println(digitSum);

    }

}