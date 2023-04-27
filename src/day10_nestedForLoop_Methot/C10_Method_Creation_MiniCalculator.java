package day10_nestedForLoop_Methot;

public class C10_Method_Creation_MiniCalculator {
    public static void main(String[] args) {
        double result=miniCalculator(4,7,'+');
        double result1=miniCalculator(45,7,'/');
        System.out.println(result1);
    }
    public static double miniCalculator(int number1,int number2,char sembol){
        double result=0;
        switch (sembol){
            case '+':
                result=number1+number2;
                break;
            case '-':
                result=number1-number2;
                break;
            case '*':
                result=number1*number2;
                break;
            case '/':
                result=(double) (number1)/(number2);
                break;
            default:
                System.out.println("incorrect input");
        }
        return result;
    }
}
