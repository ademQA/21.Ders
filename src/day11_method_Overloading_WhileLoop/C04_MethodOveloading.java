package day11_method_Overloading_WhileLoop;

public class C04_MethodOveloading {
    public static void main(String[] args) {
        total(4,5);
        total('a','b');
        total(3.2f ,5.1f);
    }

    public static void total(double number1, double number2){
        System.out.println("total of two double:"+(number1+number2));
    }
    public static void total(int number1, float number2){
        System.out.println("total of integer and float number : " + (number1+number2));
    }
    public static void total(float number1, float number2){
        System.out.println("total of two float numbers : " + (number1+number2));
    }

}
