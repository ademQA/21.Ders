package day29_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C07_CheckedExeption {

    public static void main(String[] args) throws FileNotFoundException {
        String filePath="day29_exceptions/deneme.txt";
        FileInputStream obj=new FileInputStream(filePath);
    }


}
