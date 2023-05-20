package day32_Map;

import java.util.Map;

public class C07_HomeWork1 {
    // print all students with given last name
    public static void main(String[] args) {
        Map<Integer,String>studentMap=MapMethods.studentCreate();
        String surname="can";
       // System.out.println(studentMap.keySet());
MapMethods.studentWrite(studentMap,surname);
    }
}
