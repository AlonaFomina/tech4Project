package methods;

import utilities.CharacterHelper;
import utilities.MyMethod;
import utilities.ScannerHelper;

public class TestingMyMethod {
    public static void main(String[] args) {
        //write a program witch going to print math max of 4
        int num1 = 2,num2 = 6,num3 = 3,num4 = 9;
        System.out.println(Math.max(Math.max(Math.max(num1,num2),num3),num4));

        //same with the  print method
        MyMethod.printmaxOfFour(num1, num2, num3, num4);


        // same with return method
        System.out.println(MyMethod.maxOfFour(num1, num2, num3, num4));

        //program finding the absolute diff beetween max and bun1
        Math.abs(Math.max(Math.max(Math.max(num1,num2),num3),num4) - num1);

        Math.abs(MyMethod.maxOfFour(num1, num2 , num3, num4) - num1);






    }
}
