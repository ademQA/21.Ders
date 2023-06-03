package day33_maps;

import day32_Map.MapMethods;

import java.util.Map;

public class C01_LessonRepetition {
    public static void main(String[] args) {
        Map<Integer,String>studentMap= MapMethods.studentCreate();
        MapMethods.allStudentWrite(studentMap);
        System.out.println(MapMethods.studentFindWithNumber(studentMap, 104));
        MapMethods.studentWriteBetwenNumbers(studentMap,102,110);
    }
}
