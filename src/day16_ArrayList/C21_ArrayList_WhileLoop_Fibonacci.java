package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C21_ArrayList_WhileLoop_Fibonacci {
    public static void main(String[] args) {
        // Create a method that takes a positive integer from the user
        // and returns the smaller Fibonacci numbers to us as a list.
        System.out.println(fibonacci());
    }

    public static List<Integer> fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number: ");
        int number = scanner.nextInt();
        List<Integer> fibonacciList = new ArrayList<>();
        int a = 0;
        int b = 1;
        int total = 0;
        fibonacciList.add(a);
        fibonacciList.add(b);
while (number>total){
    total=a+b;
    if (total<number){
        fibonacciList.add(total);
        a = b;
        b = total;
    }
}
        return fibonacciList;
    }
}