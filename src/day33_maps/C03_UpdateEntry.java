package day33_maps;

import day32_Map.MapMethods;

import java.util.Map;

public class C03_UpdateEntry {
    public static void main(String[] args) {
        // increase the end of the year class in the student map
        // write graduate as class information for 12th graders
        // if there is a graduate, no action will be taken
        Map<Integer,String> studentMap=MapMethods.studentCreate();
       studentMap=MapMethods.endofyearClassIncrease(studentMap);
        System.out.println(studentMap);
    }
}
