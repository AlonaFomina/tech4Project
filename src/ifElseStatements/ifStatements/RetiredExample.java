package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int age;
        System.out.println("what is your age");
         age = userInput.nextInt();
        if ( age >= 55) {
            System.out.println("Time for Retired");
        }
        else {
            System.out.println("go back to work");
        }
        System.out.println("What is your age");
        int age1 = userInput.nextInt();


    }
    class Test1{



    }
}
