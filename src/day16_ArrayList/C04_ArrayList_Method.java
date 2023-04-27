package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayList_Method {
    public static void main(String[] args) {
       // the average of the student grades received from the teacher and how many students got above average
        // write a method that sends it to us

        List<Integer>pointList=C03_ArrayList_Add.getNumberUser();
        averagePoint(pointList);
    }

    public static void averagePoint(List<Integer>pointList){
        int totalpoint=0;
        double average=0;
        int counter=0;
       // List<Integer>numberList=new ArrayList<>();

        for (int i = 0; i < pointList.size(); i++) {
            totalpoint+=pointList.get(i);
            average=totalpoint/pointList.size();
        }
        for (int i = 0; i < pointList.size(); i++) {
            if (pointList.get(i)>average)
                counter++;
        }
        System.out.println("average point: "+average);
        System.out.println("number of students above average :"+counter);
        System.out.println("Points list :"+pointList);
    }
}
