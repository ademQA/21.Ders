package day32_Map;

import java.util.Map;
import java.util.Set;

public class C03_Keys {
    public static void main(String[] args) {
        Map<Integer,String> studentMap=MapMethods.studentCreate();
        System.out.println(studentMap); //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        System.out.println(studentMap.keySet());    //[101, 102, 103, 104, 105, 106]
        Set<Integer>keySet=studentMap.keySet();

        int orderNo=1;
        for (Integer eachKey:keySet) {
            System.out.println(orderNo+"- "+eachKey);   //
            orderNo++;
        }

        // prints all students' names and surnames as a list
        // create a method
        MapMethods.allStudentWrite(studentMap);
    }
}
