package day21_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C05_Period {
    public static void main(String[] args) {
        LocalDate bornDate= LocalDate.of(1995,6,8);
        LocalDate today= LocalDate.now();
        Period yasEnes = Period.between(bornDate,today);
        System.out.println(yasEnes); // P 27Y 10M 17D
        System.out.println("age of Enes : "+yasEnes.getYears());

    }
}
