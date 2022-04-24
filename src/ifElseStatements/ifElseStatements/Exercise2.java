package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int age;
        double weigh;

        System.out.println("Please enter your age : ");
         age = userInput.nextInt();

        System.out.println("Please enter your weigh : ");
        weigh = userInput.nextDouble();

         if ( age >= 18){
             System.out.println("You are old enough to drive");
         }
         else {
             System.out.println("You are not old enough to drive");
         }
        if (weigh >= 150.0){
            System.out.println("You are heavier than  150 pounds");
        }
        else {
            System.out.println("You are lighter than 150 pounds");
        }

    }
}
