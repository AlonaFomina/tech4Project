package homeworks;

import java.util.Scanner;

public class Homework02 {
    //dataType varibleName = data/value; -> Creating a verible
    //DataType/ClassName varibleName= new DataType/ClassName(if it needed);
    //Creating on object

    public static void main(String[] args) {

        //Task-1

        Scanner userInput = new Scanner(System.in);
        String firstName, lastName, email, address, phoneNumber;
        int age;

        System.out.print("User who joined this program is = ");
        firstName = userInput.nextLine();

        System.out.print("User who joined this program last name  is = ");
        lastName = userInput.nextLine();

        System.out.print("John’s age is = ");
        age = userInput.nextInt();
        userInput.nextLine();

        System.out.print("John’s email address is = ");
        email = userInput.nextLine();

        System.out.print("User address is = ");
        address = userInput.nextLine();

        System.out.print("User phone number is = ");
        phoneNumber = userInput.nextLine();

        System.out.println("\tUser who joined this program is " + firstName +
                " " + lastName + "." + " John’s age is " + age + ".");
        System.out.println("John’s email address is :" + email + ",and address is " + address +
                ". John's phone number is " + phoneNumber);

        //Task-2
        String favBook, favColour;
        int favNumber;

        System.out.println("User’s favorite book is : ");
        favBook = userInput.nextLine();

        System.out.println("User’s favorite color is : ");
        favColour = userInput.next();

        System.out.println("User's favorite number is : ");
        favNumber = userInput.nextInt();

        System.out.println("User’s favorite book is: " + favBook +
                "\nUser’s favorite color is: " + favColour +
                "\nUser’s favorite number is: " + favNumber);

    }
}