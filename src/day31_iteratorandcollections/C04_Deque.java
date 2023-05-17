package day31_iteratorandcollections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        Deque<String>deque=new LinkedList<>();
        deque.add("Adnan");
        deque.addLast("Sevda");
        deque.addFirst("Saida");
        System.out.println(deque);
        System.out.println(deque.removeLastOccurrence("Sevda"));
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);

        Deque<String>deque1=new LinkedList<>();
       // deque1.remove();
       // deque1.pop();
        System.out.println(deque1.peek());

    }
}
