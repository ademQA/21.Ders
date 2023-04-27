package day05_ifElse_Statements;

import java.util.Scanner;

public class C14_İfElseStatement {
    public static void main(String[] args) {
//Question 2- Ask for the user's weight (kg) and height (cm) and
// calculate the body mass index (weight * 10000 / (height * height))
// if the body mass index is greater than 30 obese,
// between 25-30 overweight, between 20-25 normal, if less than 20 print weak.
        Scanner scanner=new Scanner(System.in);
        System.out.println("input your weight as kg:");
        double weight=scanner.nextDouble();
        System.out.println("input your height as cm:");
        double height= scanner.nextDouble();
        double vke=weight*10000/(height*height);
        if (vke>30){
            System.out.println("you are obese");
        } else if (vke>25) {
            System.out.println("you are overweight");
        } else if (vke>20) {
            System.out.println("normal");
        } else
            System.out.println("weak");
        }



}
