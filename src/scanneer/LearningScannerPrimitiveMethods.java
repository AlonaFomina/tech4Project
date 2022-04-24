package scanneer;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args) {
        /*
        how to use scanner method?
        1.Create an object of Scanner (import the class as well)

        ClassName/DataType variable name/objectName = new className/DataType();
        2. variable name/objectName.methodName(if we needed parameter) ;

         */
        /*
        Task-1
        1. Ask user to enter their age
        2. print the question
        3. Ask use the proper next method (nexInt)
        4. Print out the users age

         */
        Scanner collect = new Scanner(System.in);
        System.out.println("What is your age");

        int usersAge= collect.nextInt();
        System.out.println(" Users age is = " + usersAge);

        System.out.println("What is your account balance?");
        double accountBalance= collect.nextDouble();
        System.out.println("\n\t\'User balance is\' = \"$" + accountBalance + "\"");

        /*
        ask for user are you understanding this java class today?
        Get the answer and store it
        print the answer;

         */
        System.out.println("Are you understand java class today?");
        boolean understandingClass = collect.hasNextBoolean();
        System.out.println(" Class understanding = " + understandingClass);

        Scanner inputAdress= new Scanner(System.in);
        System.out.println("Your full address id = ");
        String address= inputAdress.nextLine();
        System.out.println("Your full address is = \" " + address+ " \"" );


    }
}
