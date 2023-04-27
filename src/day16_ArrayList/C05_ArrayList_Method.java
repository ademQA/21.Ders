package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ArrayList_Method {
    public static void main(String[] args) {
        //Write a method that returns the positive divisors of an entered integer
        int number=15;
        System.out.println(divorsList(number));
    }
    public static List<Integer>divorsList(Integer number){
        List<Integer>divorsList=new ArrayList<>();
        for (int i = 1; i <=number; i++) {
           if (number%i==0)
               divorsList.add(i);
        }
        return divorsList;
    }
}
