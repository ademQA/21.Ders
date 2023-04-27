package day11_method_Overloading_WhileLoop;

public class C03_Method_Overloading {
    public static void main(String[] args) {

        total(5,8);
        total('a','b');
        total(3.4 ,5);
        total(5,2.1);
    }
    public static void total(int number1, int number2){
        System.out.println("total of two integer:"+(number1+number2));
    }

    public static void total(int a, int b,int c){
        System.out.println("total of three integer:"+(a+b+c));
    }
    public static void total(char char1, char char2){
        System.out.println("total of two char : " +(char1+char2));
    }
    public static void total(int number1, double number2){
        System.out.println("total of integer and double : " +(number1+number2));
    }
    public static void total(double number1, int number2){
        System.out.println("total of double and integer : " +(number1+number2));
    }
}
