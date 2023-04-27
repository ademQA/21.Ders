package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C10_WhileLoopZeroTab {
    public static void main(String[] args) {
        // ask the user for positive integers to be summed
// continue processing until user presses 0
// when the user presses zero
// print the number of positive integers entered and their sum
// If the user enters a negative number, give a warning and do not add that number to the number

        Scanner scanner=new Scanner(System.in);
        int counter=0;
        int number=1;
        int total=0;
        while (number!=0){
            System.out.println("input number: ");
            number=scanner.nextInt();
            if (number<0)
                System.out.println("you entered negative number");
            else {
                total+=number;
                counter++;
            }
        }
        System.out.println("total of entered positive numbers: "+(total));
        System.out.println("piece of entered positive numbers: "+counter);
    }
}
