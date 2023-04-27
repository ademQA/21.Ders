package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_ArrayList_Add {
    public static void main(String[] args) {
        //// create a method that returns an integer list from the user

        System.out.println(getNumberUser());
    }

    public static List<Integer>getNumberUser(){
        Scanner scanner=new Scanner(System.in);
        List<Integer>numberList=new ArrayList<>();
        Integer number=1;
        while (number!=0){
            System.out.println("input number: ");
            number=scanner.nextInt();
            if (number!=0)
            numberList.add(number);
        }
        return numberList;
    }
}
