package ifElseStatements.nestedIfStatements;

import java.util.Scanner;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int age;

        System.out.println("What is your age? ");
        age = userInput.nextInt();

        if (age >= 18) {
            if (age > 21) {
                System.out.println("You are older than 21");
            }
        }

        int num = (int) (Math.random() * (50 - (-50) + 1) + (-50));
        System.out.println(num);

        if (num < 0){
            System.out.println("Number is negative");
            if (num % 2 != 0) {
                System.out.println("Number is odd");
            } else {
                System.out.println("Number is even");
            }
        }

        if (num > 0) {
            System.out.println("Number is positive");
            if (num % 2 != 0) {
                System.out.println("Number is odd");
            } else {
                System.out.println("Number is even");
            }
        }
        if (num == 0){
            System.out.println(" number = 0");
        }
    }
}
