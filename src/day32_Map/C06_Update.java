package day32_Map;

import java.util.Map;

public class C06_Update {
    public static void main(String[] args) {
        //// Update the surname of the given student with the new value
        Map<Integer,String>studentMap=MapMethods.studentCreate();
        studentMap=MapMethods.updateSurnameWithNumber(studentMap,102,"Han");
        System.out.println(studentMap);
    }
}
