package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C11_NestedIfElseStatement {
    public static void main(String[] args) {
        //Question 4- Ask the user to enter the name of the day, if the entered day is a weekday,
        // print the number of days left for the weekend break as
        // "Now it is working time for vacation ... days", if the entered day is the weekend,
        // print "Time to rest now".
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input name of day:");
        String day1= scanner.nextLine();
        if (day1.equals("Monday")){System.out.println("Now it is working time.There is "+ 4 +" days for vacation");}
        else if (day1.equals("Tuesday")) {System.out.println("Now it is working time.There is "+ 3 +" days for vacation");}
        else if (day1.equals("Wednesday")) {System.out.println("Now it is working time.There is " + 2 +" days for vacation");}
        else if (day1.equals("Thursday")) {System.out.println("Now it is working time.There is "+ 1 +" days for vacation");}
        else if (day1.equals("Friday")) {System.out.println("Now it is working time.Today is last day for vacation");}
        else if (day1.equals("Saturday")|| day1.equals("Sunday")){System.out.println("Time to rest now");}
    }
}
