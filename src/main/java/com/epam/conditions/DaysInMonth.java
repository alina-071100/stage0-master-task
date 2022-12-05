package com.epam.conditions;

public class DaysInMonth {


    private static final int APRIL = 4;
    private static final int JUNE = 6;
    private static final int SEPTEMBER = 9;
    private static final int NOVEMBER = 11;
    public static final int FEBRUARY = 2;

    public void printDays(int year, int month) {

        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        System.out.println(
                daysInMonth(month, isLeapYear(year))
        );

    }

    private boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    private int daysInMonth(int month, boolean leapYear) {

        return switch (month) {
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> leapYear ? 29 : 28;
            default -> 31;
        };

    }

}
