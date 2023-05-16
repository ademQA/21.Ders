package day30_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultipleExceptions {
    public static void main(String[] args) {
        try {
            FileInputStream obj = new FileInputStream("day29_exceptions/deneme.txt");
            int k = 0;
            while ((k = obj.read()) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Path is wrong");
        } catch (IOException e) {
            System.out.println("There is an error with file access");

        }
    }
}
