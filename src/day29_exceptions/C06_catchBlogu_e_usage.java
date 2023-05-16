package day29_exceptions;

public class C06_catchBlogu_e_usage {
    public static void main(String[] args) {
        int number1=10;
        int number2=0;
        try {
            System.out.println(number1 / number2);
        } catch (Exception e) {
           // Exception e=occuredError;
            e.printStackTrace();//
            System.out.println(e.getMessage());//zero
            System.out.println(e.getCause());//nullby

        }
    }
}
