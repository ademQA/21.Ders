package day32_Map;

import java.util.Map;

public class C08_HomeWork2 {
    public static void main(String[] args) {
        //print all students in the given branch
        Map<Integer,String>studentMap=MapMethods.studentCreate();
        String branch="H";
        MapMethods.allStudentWriteWithBranch(studentMap,branch);
    }

}
