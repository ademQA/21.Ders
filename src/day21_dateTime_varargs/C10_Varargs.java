package day21_dateTime_varargs;

public class C10_Varargs {
    public static void main(String[] args) {
        takeAction(2,4); // 2
        takeAction(5); // 0
        takeAction(5,4,7,8); //15
    }
    public static void takeAction(int x, int... y){
        System.out.println(x * y.length);
    }
}
