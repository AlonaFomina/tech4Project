package methods;

import utilities.MathHelper;
import utilities.MyMethod;
import utilities.ScannerHelper;

import java.util.Scanner;

public class FindIfNumberIsNegativeOrZero {
    public static void main(String[] args) {
      //  Scanner input = new Scanner(System.in);

       // System.out.println("Please enter eny number: ");
       // int num = input.nextInt();

        int num = ScannerHelper.getNumberFromUser();
        if (MathHelper.isPositive(num)) System.out.println("The number is Positive");
        else if (MathHelper.isNegative(num)) System.out.println("The number Is negative");
        else System.out.println("Number is Zero");
        System.out.println("The end of the program");


    }
}
