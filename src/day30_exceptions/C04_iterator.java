package day30_exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_iterator {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(9);
        System.out.println(numbers); //[5, 12, 3, 9]
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i)+2);

        }
        System.out.println(numbers);
        for (Integer each:numbers) {

            each+=2;

        }
        System.out.println(numbers);
        Iterator iterator=numbers.iterator();

        iterator.next();
        iterator.remove();

        iterator.next();
        iterator.remove();

        iterator.next();
        iterator.remove();


        iterator.next();
        iterator.remove();


        System.out.println(numbers);
    }
}
