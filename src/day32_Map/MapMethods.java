package day32_Map;

import java.util.*;

public class MapMethods {
    // When we give map and student number, name and surname information in the desired format.
    // let's create a method that returns us
    public static String studentFindWithNumber(Map<Integer, String> studentMap, int studentNumber) {
        String studentValue = studentMap.get(studentNumber);
        String[] valueArr = studentValue.split("-");
        String name = valueArr[0];
        String surname = valueArr[1];
        String nameSurname = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " " +
                surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        return nameSurname;
    }


    public static Map<Integer, String> studentCreate() {

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Ali-Can-12-H-MF");
        studentMap.put(102, "Veli-Cem-10-K-TM");
        studentMap.put(103, "Ali-Cem-11-K-TM");
        studentMap.put(104, "Ayse-Can-10-H-MF");
        studentMap.put(105, "Sevgi-Cem-11-M-TM");
        studentMap.put(106, "Sevgi-Can-10-K-MF");

        return studentMap;
    }

    // print the names and surnames of all students as a list
    public static void allStudentWrite(Map<Integer, String> studentMap) {
        Set<Integer> studentKeySet = studentMap.keySet(); //
        int orderNo = 1;
        for (Integer eachKey : studentKeySet) {
            System.out.println(orderNo + "- " + studentFindWithNumber(studentMap, eachKey));
            orderNo++;
        }
    }

    public static void studentWriteBetwenNumbers(Map<Integer, String> studentMap, int startNo, int finishNo) {
        // student number between two given values (including limit values)
        // print the number, name, surname and section of all students
        Set<Integer> studentKeySet = studentMap.keySet();
        int order = 1;
        for (Integer eachKey : studentKeySet) {
            if (eachKey >= startNo && eachKey <= finishNo) {
                String value = studentMap.get(eachKey);
                String[] valueArr = value.split("-");
                System.out.println(order + "- " + eachKey + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[4]);
                order++;
            }
        }
    }




    // print the names and surnames of all students in the desired class
    public static void studentNameSurnameWrite(Map<Integer, String> studentMap, int classes) {
        Collection<String> valueCollection = studentMap.values();
        int orderNo = 1;
        for (String each : valueCollection) {
            String[] eachArr = each.split("-");
            if (eachArr[2].equals(classes + "")) {
                System.out.println(orderNo + "- " + eachArr[0] + "  " + eachArr[1]);
                orderNo++;
            }
        }
    }



    public static Map<Integer, String> updateSurnameWithNumber(Map<Integer, String> studentMap, int studentNumber, String surname) {

        String value=studentMap.get(studentNumber);
        String[] valueArr=value.split("-");
        valueArr[1]=surname;
        value=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3];
        studentMap.put(studentNumber,value);
        return studentMap;
    }
    // print all students with given last name
    public static void studentWrite(Map<Integer,String>studentMap,String surname){
        Collection<String> valueCollection = studentMap.values();
        int orderNo=1;
            for (String each : valueCollection) {

                String[] valueArr = each.split("-");
                if (valueArr[1].equalsIgnoreCase(surname)) {
                    System.out.println(orderNo + "- " +  " adı  : " + valueArr[0] + "  Soyadı  : " + valueArr[1] + " Sınıf  : " + valueArr[2] +
                            "  Sube:  " + valueArr[3] + "  Bölüm:  " + valueArr[4]);
                    orderNo++;
                }

            }


    }
    //print all students in the given branch
    public static void allStudentWriteWithBranch(Map<Integer,String>studentMap,String branch){
        Collection<String> valueCollection = studentMap.values();
        int orderNo=1;
        for (String each : valueCollection) {

            String[] valueArr = each.split("-");
            if (valueArr[3].equalsIgnoreCase(branch)) {
                System.out.println(orderNo + "- " +  " adı  : " + valueArr[0] + "  Soyadı  : " + valueArr[1] + " Sınıf  : " + valueArr[2] +
                        "  Sube:  " + valueArr[3] + "  Bölüm:  " + valueArr[4]);
                orderNo++;
            }

        }

    }

    public static void allStudentWriteWithBranchandClass(Map<Integer, String> studentMap, String branch, String classes) {
        Collection<String> valueCollection = studentMap.values();
        int orderNo=1;
        for (String each : valueCollection) {       //"Sevgi-Can-10-K-MF"

            String[] valueArr = each.split("-");
            if (valueArr[3].equalsIgnoreCase(branch)&&valueArr[2].equalsIgnoreCase(classes)) {
                System.out.println(orderNo + "- " +  " adı  : " + valueArr[0] + "  Soyadı  : " + valueArr[1] + " Sınıf  : " + valueArr[2] +
                        "  Sube:  " + valueArr[3] + "  Bölüm:  " + valueArr[4]);
                orderNo++;
            }

        }

    }


    public static void allStudentWriteWithNumber(Map<Integer, String> studentMap) {
        // print the student list as number-name-surname-class
        Set<Map.Entry<Integer,String>>studentEntrySet=studentMap.entrySet();
       // System.out.println(studentMap);
       // System.out.println(studentEntrySet);
        for (Map.Entry<Integer,String> eachEntry:studentEntrySet) {
           // System.out.println(eachEntry);
            String studentValue=eachEntry.getValue();
            String[] studentArr=studentValue.split("-");
            System.out.println(eachEntry.getKey()+" "+studentArr[0]+" "+studentArr[1]+" "+studentArr[2]);
        }

    }

    public static Map<Integer,String> endofyearClassIncrease(Map<Integer, String> studentMap) {
        // increase the end of the year class in the student map
        // write graduate as class information for 12th graders
        // if there is a graduate, no action will be taken
        Set<Map.Entry<Integer,String>>studentEntrySet=studentMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry:studentEntrySet) {
            String eachValue=eachEntry.getValue();
            String[] eacValueArr=eachValue.split("-");
            Integer clas=Integer.valueOf(eacValueArr[2]);
            if (clas<12) {
                clas++;
                eacValueArr[2] = "" + clas;
            }
            else
            {
                eacValueArr[2]="Graduate";
            }
eachEntry.setValue(eacValueArr[0]+"-"+eacValueArr[1]+"-"+eacValueArr[2]+"-"+eacValueArr[3]+"-"+eacValueArr[4]);
        }


        return studentMap;
    }


    //capitalize all surnames on student map
    public static Map<Integer, String> capitalizeAllSurname(Map<Integer, String> studentMap) {

        Set<Map.Entry<Integer,String>>studentEntrySet=studentMap.entrySet();
        // System.out.println(studentMap);
        // System.out.println(studentEntrySet);
        for (Map.Entry<Integer,String> eachEntry:studentEntrySet) {
            // System.out.println(eachEntry);    //(101, "Ali-Can-12-H-MF");
            String studentValue=eachEntry.getValue();
            String[] studentArr=studentValue.split("-");
            String surname=studentArr[1];
            surname=surname.toUpperCase();
            studentArr[1]=surname;
            eachEntry.setValue(studentArr[0]+"-"+studentArr[1]+"-"+studentArr[2]+"-"+studentArr[3]+"-"+studentArr[4]);
            //System.out.println(eachEntry.getKey()+" "+studentArr[0]+" "+studentArr[1]+" "+studentArr[2]);
        }

        return studentMap;
    }
}


