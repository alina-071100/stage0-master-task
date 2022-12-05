package com.epam.langSyntax;

public final class NumberUtils {

    static int ones(int number) {
        return number % 10;
    }

    static int tens(int number) {
        return number / 10 % 10;
    }

    static int hundreds(int number) {
        return number / 100 % 10;
    }

    static int thousands(int number) {
        return number / 1000 % 10;
    }

}