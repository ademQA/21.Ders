package day02_dataType_Scanner;

import java.util.Scanner;

public class C10_ScannerExemple {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input short edge of rectangular area:");
        int shortEdge=scan.nextInt();
        System.out.println("input long edge of rectangular area");
        int longtEdge=scan.nextInt();
        int rectangularArea=shortEdge*longtEdge;
        System.out.println("area of rectangular:"+rectangularArea);
    }
}
