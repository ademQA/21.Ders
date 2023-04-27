package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C20_ArrayList_Fibonacci {
    public static void main(String[] args) {
        //Take a given positive integer n and construct a method
        // that returns us the first n Fibonacci numbers as a list.
        System.out.println(fibonachi());
    }
    public static List <Integer> fibonachi(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("input a number: ");
        int number=scanner.nextInt();
        List<Integer>fibonacciList=new ArrayList<>();
        int a=0;
        int b=1;
        int total=0;
        fibonacciList.add(a);
        fibonacciList.add(b);
        for (int i = 1; i < number; i++) {
          total=a+b;
          fibonacciList.add(total);
          a=b;
          b=total;
        }
        return fibonacciList;

    }
}
