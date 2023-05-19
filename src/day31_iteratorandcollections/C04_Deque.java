package day31_iteratorandcollections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("Adnan");
        deque.addLast("Sevda");
        deque.addFirst("Saida");
        System.out.println(deque);  //[Saida, Adnan, Sevda]
        System.out.println(deque.removeLastOccurrence("Sevda"));    //true
        System.out.println(deque);  //[Saida, Adnan]
        System.out.println(deque.pop());    //Saida
        System.out.println(deque);  //[Adnan]

        Deque<String> deque1 = new LinkedList<>();
        //deque1.remove();  //NoSuchElementException
        // deque1.pop(); //NoSuchElementException
        System.out.println(deque1.peek());  //null

    }
}
