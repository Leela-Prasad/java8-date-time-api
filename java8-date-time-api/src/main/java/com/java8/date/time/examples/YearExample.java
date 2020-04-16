package com.java8.date.time.examples;

import java.time.Year;

public class YearExample {

    public static void main(String[] args) {
        Year year = Year.of(2012);
        if(year.isLeap())
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}
