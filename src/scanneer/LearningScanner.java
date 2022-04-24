package scanneer;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        /*
        1.I am going ton use scanner class to create my object.
        2.I will use the object for reading the data.

         */
        Scanner scanner = new Scanner(System.in); // creating scanner object for using the method
        System.out.println("Please put your first name");//  this is my statement// what I want user to input
        String firstName = scanner.next();//Alona// storing the first name from user
        System.out.println("Please put your last name");//second message user
        String lastName = scanner.next();//storing last name

        System.out.println("The mane user put = "+ firstName) ;// printing my object/veriables/name of so on
        System.out.println("Last Name = "+ lastName);



    }
}
