package day32_Map;

import java.util.Collection;
import java.util.Map;

public class C04_Values {
    public static void main(String[] args) {

        Map<Integer,String>studentMap=MapMethods.studentCreate();
        System.out.println(studentMap); //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
                                        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        // print only the values of all students
        System.out.println(studentMap.values());    //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM,
                                                    // Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]



        // print the names and surnames of all students in the desired class

        Collection<String>valueCollection=studentMap.values();
        MapMethods.studentNameSurnameWrite(studentMap,11);
    }

}
