package day32_Map;

import java.util.Map;
import java.util.Set;

public class C05_KeyValueUsageTogether {
    public static void main(String[] args) {
        // student number between two given values (including limit values)
        // print the number, name, surname and section of all students

        Map<Integer,String>studentMap=MapMethods.studentCreate();
        int startNo=102;
        int finishNo=104;
        MapMethods.studentWriteBetwenNumbers(studentMap,startNo,finishNo);
    }

}
