package day05_ifElse_Statements;

import java.util.Scanner;

public class C07_İfElseStatement {
    public static void main(String[] args) {
        // Question 4- Get the length of 3 sides of a triangle from the user,
        // If the triangle is equilateral, print "Equilateral triangle".
        Scanner scanner=new Scanner(System.in);
        System.out.println("input first edge,please:");
        int firstEdge= scanner.nextInt();
        System.out.println("input second edge,please:");
        int secondEdge= scanner.nextInt();
        System.out.println("input third edge,please:");
        int thirdEdge= scanner.nextInt();
        if (firstEdge==secondEdge && firstEdge==thirdEdge && firstEdge>0)
        {
            System.out.println("equilateral triangle");
        }
        else System.out.println("not equilateral triangle");

    }
}
