package day30_exceptions;

public class C02_SomeExceptionTypes {
    public static void main(String[] args) {
        String str=null;
        System.out.println(str+"Java");//NullJava
        //System.out.println(str.concat("Java"));//NullPointerException
        String a="34a"; //a=34a NumberFormatException
        String b="55";
        int result=Integer.valueOf(a)+Integer.valueOf(b);
        System.out.println(result);

        String str1="Java";
        Object obj=str1;
        Integer number=(Integer) obj;//NumberFormatException

        // FileNotFoundException
        // IOException
        // RunTimeException
        // Exception
        // ArithmeticException
        // InputMisMatchException
        // StringIndexOutOfBoundsException
        // ArrayIndexOutOfBounds
        //NumberFormatException
        //NullPointerException

    }
}
