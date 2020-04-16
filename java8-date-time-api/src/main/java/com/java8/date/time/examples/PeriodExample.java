package com.java8.date.time.examples;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalUnit;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1991, Month.MAY, 17);
        LocalDate today = LocalDate.now();

       Period period =  Period.between(birthDay, today);
       System.out.printf("Your age is %d years %d months %d days\n", period.getYears(), period.getMonths(), period.getDays());
        System.out.println("Total Nuber of days :" + (period.getYears() * 365 + period.getMonths()*30 + period.getDays()));

        System.out.println(period.getUnits());


    }
}
