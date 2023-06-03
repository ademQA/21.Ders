package day33_maps;

import day32_Map.MapMethods;

import java.util.Map;

public class C02_EntryList {
    public static void main(String[] args) {
        // print the student list as number-name-surname-class
        Map<Integer,String>studentMap=MapMethods.studentCreate();
        MapMethods.allStudentWriteWithNumber(studentMap);
    }
}
