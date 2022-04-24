package homeworks;

import java.util.Scanner;

public class Homework06 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Task1

        String s1 = "5", s2 = "10";
        int stringToInt1 = Integer.parseInt(s1), stringToInt2 = Integer.parseInt(s2);

        System.out.println("-Sum of " + stringToInt1 + " and " + stringToInt2 + " is = " + (stringToInt1 + stringToInt2) +
                "\n-Product of " + stringToInt1 + " and " + stringToInt2 + " is = " + (stringToInt1 * stringToInt2) +
                "\n-Division of " + stringToInt1 + " and " + stringToInt2 + "is = " + (stringToInt1 / stringToInt2) +
                "\n-Subtraction of  " + stringToInt1 + " and " + stringToInt2 + " is = " + (stringToInt1 - stringToInt2) +
                "\n-Remainder of " + stringToInt1 + " and " + stringToInt2 + " is = " + (stringToInt1 % stringToInt2));

        //Task-2

        String s11 = "200", s22 = "-50";
        int intS1 = Integer.parseInt(s11), intS2 = Integer.parseInt(s22);

        System.out.println("The greatest value is = " + Math.max(intS1, intS2) +
                "\nThe smallest value is = " + Math.min(intS1, intS2) +
                "\nThe average is = " + ((intS1 + intS2) / 2) +
                "\nThe absolute difference is = " + Math.abs(intS1 - intS2));

        //Task-3

        String day = "1";
        double quarters3 = 0.75, dime1 = 0.10, nickle2 = 0.10, penny = 0.01;
        int dayInt = Integer.parseInt(day);

        System.out.println((int)(24 / (quarters3 + dime1 + nickle2 + penny)) + " days " +
                "\n" + ((int)(168 / (quarters3 + dime1 + nickle2 + penny))) + " days " +
                "\n$" + ((double)(((dayInt * 150) * (quarters3 + dime1 + nickle2 + penny)))));

        //Task-4

        double saveADay = 62.5, computerCots = 1250;

        System.out.println((int)(computerCots / saveADay));

        //Task-5

        double saving = 14265, option1 = 475.50, option2 = 951;

        System.out.println("Option 1 will take " + (int)(saving / option1) + " months" +
                "\nOption 2 will take " + (int)(saving / option2) + " months");

        //Task-6

        System.out.println((double)((double)userInput.nextInt()/ userInput.nextInt()));




    }
}
