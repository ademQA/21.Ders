package day10_nestedForLoop_Methot;

public class C01_ForLoop_Multiplication_Table {
    public static void main(String[] args) {
        //Create a multiplication table for numbers 1 to 4
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println("----------");
        }
    }
}
