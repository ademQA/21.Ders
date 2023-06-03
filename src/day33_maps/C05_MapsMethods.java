package day33_maps;

import day32_Map.MapMethods;

import java.util.Map;

public class C05_MapsMethods {
    public static void main(String[] args) {
        Map<Integer,String>studentMap= MapMethods.studentCreate();
        studentMap.put(110,"Sevda-Fan-12-H-MF");
        studentMap.put(101,"Ayşe-Yan-10-M-MF");
        System.out.println(studentMap);
        studentMap.replace(102,"Ayşegül-Man-11-M-MF");

        studentMap.replace(103,"Ali-Cem-11-K-TM","Kubra-Can-10-K-TM");
        studentMap.replace(104,"Ayse-Cen-10-H-MF","Hasan-Cem-11-K-TM");
        System.out.println(studentMap);

        System.out.println(studentMap.getOrDefault(105, "This student is not at Map"));
        System.out.println(studentMap.getOrDefault(120, "This student is not at Map"));
        System.out.println(studentMap.get(120));    //null

        System.out.println(studentMap.containsKey(105));    //true
        System.out.println(studentMap.containsValue("Ayşe"));   //false
        System.out.println(studentMap.containsValue("Ayşe-Yan-10-M-MF"));   //true

        studentMap.putIfAbsent(120,"Nurhayat-Zan-12-M-MF");
        studentMap.putIfAbsent(102,"Ahmet-Yan-10-M-MF");
        System.out.println(studentMap);

    }
}
