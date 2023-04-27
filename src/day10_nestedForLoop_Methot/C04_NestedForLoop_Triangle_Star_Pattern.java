package day10_nestedForLoop_Methot;

public class C04_NestedForLoop_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int number=4;
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
