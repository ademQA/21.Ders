package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C08_TernoryOperator {
    public static void main(String[] args) {
// Question 4- Get the user's note
//"Pass Class" if 50 or greater,
// If less than 50, print "Sorry you failed".
        Scanner scanner=new Scanner(System.in);
        System.out.println("please, input your point");
        double point = scanner.nextDouble();
        System.out.println(point>=50 ? "you passed the class" : "Sorry you failed, you didn't pass the class");
    }
    }

