package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        int reversed = NumberUtils.ones(number) * 100
                + NumberUtils.tens(number) * 10
                + NumberUtils.hundreds(number);

        System.out.println(reversed);

    }

}
