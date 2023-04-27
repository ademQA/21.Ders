package day21_dateTime_varargs;


import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date); // 2023-04-25
        LocalDate date2 = LocalDate.ofYearDay(2024,200);
        LocalDate date3=LocalDate.ofYearDay(2023,200);
        System.out.println(date3);
        System.out.println(date2); // 2024-07-18
        System.out.println(date.isAfter(date2)); // false
        System.out.println(date.isLeapYear()); // false
        System.out.println(date2.isLeapYear()); // true

        System.out.println(date.getDayOfWeek()); // TUESDAY
        LocalDate bornDate= LocalDate.of(2008,5,20);
        System.out.println(bornDate.getDayOfWeek()); // TUESDAY
        System.out.println(date3.lengthOfYear()); // 365


    }
    }

