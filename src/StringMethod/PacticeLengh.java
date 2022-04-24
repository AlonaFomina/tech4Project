package StringMethod;

import java.util.Scanner;

public class PacticeLengh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Write a Java program that asks user to enter their favorite book name and quote and store answers of user in different Strings
Finally, print the length of those Strings with proper message
 */

        System.out.println("Please enter your favorite book and name of the quote");
        String book = input.nextLine();
        String quote = input.nextLine();

        System.out.println("First length of "  + book + "is"+ book.length()+ " " + "\nLength of favorite quote " +
                quote + " is " +quote.length());



    }
}
