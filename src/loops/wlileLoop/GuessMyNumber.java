package loops.wlileLoop;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Random;


public class GuessMyNumber {
    public static void main(String[] args) {
        int mynum = 7;
        int usernum = ScannerHelper.getNumberFromUser();

        while (mynum != usernum) {
           usernum = ScannerHelper.getNumberFromUser();
        }
        System.out.println("Finnally you could find a number!");


        System.out.println("----------------------------------------------");



        int myNumber = 7;

        System.out.println("The random number is = " + myNumber);
        Random random = new Random();
        int usersNumber = random.nextInt(10) + 1;

        int attempt = 1;

        while(usersNumber != myNumber){
            System.out.println("My random attempt number is = " + usersNumber);
            usersNumber = random.nextInt(10) + 1;
            attempt++;
        }


        System.out.println("Finally you could find the number!");
        System.out.println("You could find it after " + attempt + " times!!!");
    }
}

