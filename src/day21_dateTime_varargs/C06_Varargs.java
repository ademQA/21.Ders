package day21_dateTime_varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        // iki tamsayiyi toplayip yazdiran bir method olusturun
        topla(15,6);
        topla(15,20,25);
        topla(10,13,44,35);
        //topla(12,14,14,12,23);
        //topla(1,3,5,7,8,3,4,2);
        // topla(2,3,5,6,7,8,9,1,2,3,5);
    }
    private static void topla(int number1, int number2, int number3, int number4) {
        System.out.println("sum of numbers: " + (number1+number2+number3+number4));
    }
    private static void topla(int number1, int number2, int number3) {
        System.out.println("sum of numbers : " + (number1+number2+number3));
    }
    private static void topla(int number1, int number2) {
        System.out.println("sum of numbers : " + (number1+number2));
    }
}
