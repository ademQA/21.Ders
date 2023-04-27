package day16_ArrayList;

public class C09_For_Each_Loop {
    public static void main(String[] args) {
        int[]arr={5,7,6,4,2,4,6,8,0,9,5,4,6,8,5,3,2,4,6,8,0,5,7,4,5};
        int total=0;
        for (int each:arr){
           if (each>5)
               total+=each;
        }
        System.out.println("total of numbers in arr :"+total);
    }
}
