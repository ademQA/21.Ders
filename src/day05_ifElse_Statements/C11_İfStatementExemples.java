package day05_ifElse_Statements;

import java.util.Scanner;

public class C11_İfStatementExemples {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input your point :");
        double point= scanner.nextDouble();
        if (point<0 || point>100)
        {
            System.out.println("incorrect point");
        } else if (point>=85) {
            System.out.println("your point:AA");
        } else if (point>=65)
        {  System.out.println("your point:BB");
        } else if (point>=50) {
            System.out.println("your point:CC");
        } else {
            System.out.println("your point:DD");
        }
        }
    }

