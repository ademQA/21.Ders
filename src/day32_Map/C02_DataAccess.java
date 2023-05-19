package day32_Map;

import java.util.HashMap;
import java.util.Map;

public class C02_DataAccess {
    public static void main(String[] args) {
        // print the name and surname of the student whose number is given
        // with the first letters capitalized and the next letters small

        Map<Integer,String> studentMap=new HashMap<>();
        studentMap.put(101,"Ali-Can-11-H-MF");
        studentMap.put(102,"Veli-Cem-10-K-TM");
        studentMap.put(103,"Ali-Cem-11-K-TM");
        studentMap.put(104,"Ayse-Can-10-H-MF");
        studentMap.put(105,"Sevgi-Cem-11-M-TM");
        studentMap.put(106,"Sevgi-Can-10-K-MF");
        System.out.println(MapMethods.studentFindWithNumber(studentMap, 104));  //Ayse Can
    }

}
