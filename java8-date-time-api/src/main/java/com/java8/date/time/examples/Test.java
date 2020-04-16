package com.java8.date.time.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.printf("%d - %d - %d\n", day, month, year);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nano = time.getNano();

        System.out.printf("%d:%d:%d:%d\n", hour,minute,second,nano);

        LocalDateTime timestamp = LocalDateTime.now();
        System.out.println(timestamp);
        System.out.printf("%d-%d-%d %d:%d:%d:%d\n", timestamp.getDayOfMonth(), timestamp.getMonthValue(), timestamp.getYear(), timestamp.getHour(),
                                timestamp.getMinute(), timestamp.getSecond(), timestamp.getNano());

        LocalDateTime of = LocalDateTime.of(1991, Month.MAY, 17, 19,45);
        System.out.println(of);
        System.out.println("Before Six Months " + of.plusMonths(6));
        System.out.println("After Six Months " + of.minusMonths(6));

    }
}
