package scanneer;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args) {


        /*
        name     ->next()
        age      ->nextInt()
        myBrainOk -> nextBoolean
        fav quote->nextLine()
         */
        Scanner userInput =  new Scanner(System.in);

        System.out.println("What is your name? = ");
        String name = userInput.next();

        System.out.println("What is your age? = ");
        int age= userInput.nextInt();

        System.out.print("Is your brain fried? = ");
        boolean myBrainOk = userInput.hasNextBoolean();
        userInput.next();

        System.out.println("What is your address?" );
        String address = userInput.next();

        System.out.println("User name is = "+ name+
                "\nUser age is =" + age+
                "\nDoes user brain is OK? = "+ myBrainOk+
                "\nUser address is= " + address);

        /*System.out.println(" What is your number?");
        int number1 = userInput.nextInt() + userInput.nextInt() + userInput.nextInt();
        System.out.println( "Sum of the numbers = " + number1);
        int sum = number1;*/






    }
}

