package day05_ifElse_Statements;

import java.util.Scanner;

public class C19_İfElseStatement {
    public static void main(String[] args) {
        //Question 4- Get the distance from the user in kilometers and ask the unit he wants to convert,
        // if the unit he wants is meters or centimeters, convert and print it,
        // otherwise print "the unit you want is not registered to the system".
        Scanner scanner=new Scanner(System.in);
        System.out.println("input distance as kilometres:");
        double distance= scanner.nextDouble();
        System.out.println("input unit you want to convert:" +
                "\nİnput 'M' OR 'm' for metre \n" +
                " İnput 'C' OR 'c' for centimetre");
        char unit=scanner.next().charAt(0);
        if (unit=='M' || unit=='m')
            System.out.println("distance:"+distance*1000+" metreS");
        else if (unit=='C'||unit=='c') {
            System.out.println("distance:"+distance*1000*1000+" centimetre");
        }else {
            System.out.println("the unit you want is not registered to the system");
        }
    }
}
