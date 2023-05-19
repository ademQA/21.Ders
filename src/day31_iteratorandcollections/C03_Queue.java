package day31_iteratorandcollections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        Queue<String >mealQueue=new LinkedList<>();
        mealQueue.add("Murat");
        mealQueue.add("Muhammet");
        System.out.println(mealQueue);  //[Murat, Muhammet]
        System.out.println(mealQueue.remove()); //Murat
        System.out.println(mealQueue);  //[Muhammet]
        mealQueue.add("Veysel");
        mealQueue.add("Ayşegül");
        System.out.println(mealQueue);  //[Muhammet, Veysel, Ayşegül]

        System.out.println(mealQueue.poll());   //Muhammet---Remove
        System.out.println(mealQueue);  //[Veysel, Ayşegül]

        Queue<String> mealQueue1 = new LinkedList<>();
        //mealQueue1.remove();  //NoSuchElementException
        System.out.println(mealQueue1.poll());  //null
        mealQueue.offer("Firdevs"); //add
        System.out.println(mealQueue); //[Veysel, Ayşegül, Firdevs]

        System.out.println(mealQueue.peek());   //Veysel
        System.out.println(mealQueue);  //[Veysel, Ayşegül, Firdevs]
        System.out.println(mealQueue1.peek());  //null
        System.out.println(mealQueue.element());    //Veysel
        System.out.println(mealQueue);  //[Veysel, Ayşegül, Firdevs]


    }
}
