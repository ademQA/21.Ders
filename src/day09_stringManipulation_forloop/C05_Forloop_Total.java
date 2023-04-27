package day09_stringManipulation_forloop;

public class C05_Forloop_Total {
    public static void main(String[] args) {
        int total=0;
        for (int i=100;i<1000;i+=2){
            total+=i;
        }
        System.out.println(total);
    }
}
