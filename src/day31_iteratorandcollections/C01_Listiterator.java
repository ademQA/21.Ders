package day31_iteratorandcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_Listiterator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(9);
        System.out.println(numbers); //[5, 12, 3, 9]
        ListIterator listIterator = numbers.listIterator();
        Integer number = 0;
        while (listIterator.hasNext()) {
            number = (Integer) listIterator.next();
            listIterator.set(number + 2);
        }

        System.out.println(numbers);

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

        while (listIterator.hasNext()) {
            listIterator.next();
        }
        System.out.println("\n" + listIterator.nextIndex());
        System.out.println(listIterator.previousIndex());
    }
}
