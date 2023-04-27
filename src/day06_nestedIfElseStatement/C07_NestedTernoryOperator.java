package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C07_NestedTernoryOperator {
    public static void main(String[] args) {
        //Get an integer from the user.
        //  If the number is positive, print an even number or not an even number, as appropriate
        //  If the number is not positive, print the appropriate 3-digit or not 3-digit option

    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
        System.out.println(number>0
        ?
         number%2==0 ? "even number" :"odd number"
        :
                number>=-999 && number<=-100 ? "3 digit" :"not 3 digit"
        );

}
}
