package day02_dataType_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input your name please:");
        String name=scan.nextLine();
        System.out.println(name);
        name=name.toUpperCase();
        System.out.println(name);
    }
}
