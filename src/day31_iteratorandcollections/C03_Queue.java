package day31_iteratorandcollections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        Queue<String >mealQueue=new LinkedList<>();
        mealQueue.add("Murat");
        mealQueue.add("Muhammet");
        System.out.println(mealQueue);
        System.out.println(mealQueue.remove());
        System.out.println(mealQueue);
        mealQueue.add("Veysel");
        mealQueue.add("Ayşegül");
        System.out.println(mealQueue);

        System.out.println(mealQueue.poll());
        System.out.println(mealQueue);

        Queue<String> mealQueue1 = new LinkedList<>();
        //mealQueue1.remove();
        System.out.println(mealQueue1.poll());
        mealQueue1.offer("Firdevs");
        System.out.println(mealQueue1);

        System.out.println(mealQueue1.peek());
        System.out.println(mealQueue1);
        System.out.println(mealQueue1.peek());
        System.out.println(mealQueue.element());
        System.out.println(mealQueue);


    }
}
