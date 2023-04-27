package day02_dataType_Scanner;

import java.util.Scanner;

public class C11_ScannerExemples {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input radius of circle");
        int radius=scan.nextInt();
        double circleArea=2.14*radius*radius;
        double circlePerimeter=2*2.14*radius;
        System.out.println("area of circle:"+circleArea);
        System.out.println("perimeter of circle"+circlePerimeter);
    }
}
