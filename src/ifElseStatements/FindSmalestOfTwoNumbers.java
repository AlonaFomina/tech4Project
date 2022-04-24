package ifElseStatements;

import java.util.Scanner;

public class FindSmalestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;

        System.out.println("Please enter 2 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();

        //if (num1<=num2) System.out.println("Smallest is " + num1);
       // else System.out.println("Smallest is " + num2);

        //ternary operator can be used only for simple IF and Else statements

       // int smallest =(int) Math.min(num1,num2);

        int smallest = num1 < num2 ? num1 : num2;
        System.out.println(smallest);
        System.out.println("end the program!");

        int ade1 = 19, age2 = 20;






    }
}
