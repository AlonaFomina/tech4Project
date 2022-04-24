package homeworks;

import java.util.Scanner;

public class Homework04 {
    //Task-1

    public static void main(String[] args) {
   Scanner userInput = new Scanner(System.in);
   int num1, num2;



        System.out.print("User's first number is: ");
        num1 = userInput.nextInt();

        System.out.print("User second number is: ");
        num2  = userInput.nextInt();

        System.out.println("The average of the given 2 numbers is: "+ ((num1 + num2)/2));

        //Task-2

        int x = 3, y = 5;

        System.out.println("Enter your First number: ");
        x = userInput.nextInt();

        System.out.println("Enter your second number: ");
        y = userInput.nextInt();

        System.out.println("The product of the given 2 numbers is: "+ (x*y));

        //Task-3

        int number1, number2, number3;

        System.out.println("Enter your first number: ");
        number1 = userInput.nextInt();

        System.out.println("Enter your second number: ");
        number2 = userInput.nextInt();

        System.out.println("Enter your third number: " );
        number3 = userInput.nextInt();

        System.out.println("The " + number1 +  " multiplied with " + number1 + " is = " + (number1 * number1)+
                "\nThe " + number2 + " multiplied with " + number2 + " is = " + (number2 * number2)+
                "\nThe " + number3 + " multiplied with " + number3 + " is = " + number3 * number3);

        //Task-4

        int a, b;

        System.out.println("Enter your first number: ");
        a = userInput.nextInt();

        System.out.println("Enter your second number: ");
        b= userInput.nextInt();

        System.out.println("The remainder of " + a + " % " + b +  "= "+(a % b));

        //Task-5

         int n1,n2,n3,n4,n5;

        System.out.println("Enter your number 1: ");
        n1 = userInput.nextInt();

        System.out.println("Enter your number 2: ");
        n2 = userInput.nextInt();

        System.out.println("Enter your number 3: ");
        n3 = userInput.nextInt();

        System.out.println("Enter your number 4: ");
        n4 = userInput.nextInt();

        System.out.println("Enter your number 5: ");
        n5 = userInput.nextInt();

        System.out.println("The average of the given 5 numbers is: " + ((n1 + n2 + n3 + n4 + n5)/5));

        //Task-6

        int userNumber;

        System.out.println("Enter your number: ");
        userNumber = userInput.nextInt();

        System.out.println(userNumber +" * 1 = " + (userNumber * 1)) ;
        System.out.println(userNumber +" * 2 = " + (userNumber * 2)) ;
        System.out.println(userNumber +" * 3 = " + (userNumber * 3)) ;
        System.out.println(userNumber +" * 4 = " + (userNumber * 4)) ;
        System.out.println(userNumber +" * 5 = " + (userNumber * 5)) ;
        System.out.println(userNumber +" * 6 = " + (userNumber * 6)) ;
        System.out.println(userNumber +" * 7 = " + (userNumber * 7)) ;
        System.out.println(userNumber +" * 8 = " + (userNumber * 8)) ;
        System.out.println(userNumber +" * 9 = " + (userNumber * 9)) ;
        System.out.println(userNumber +" * 10 = " + (userNumber * 10)) ;

        //Task-7

        int sideSquare;

        System.out.println("What is leigh of the side ot the square? : ");
        sideSquare = userInput.nextInt();

        System.out.println("Perimeter of the square = " + (sideSquare + sideSquare + sideSquare + sideSquare) +
                "\nArea of the square = " + ( sideSquare * sideSquare));


    }
}
