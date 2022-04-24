package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

import java.util.Locale;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("-----Task-1-----");

        String c = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                c += i + " - ";
            }
        }
        System.out.println(c.substring(0, c.length() - 3));


        System.out.println("-----Task-2-----");


        String c1 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                c1 += i + " - ";
            }
        }
        System.out.println(c1.substring(0, c1.length() - 3));


        System.out.println("-----Task-3-----");

        String s = "";

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) {
                s += i + " - ";
            }
        }
        System.out.println(s.substring(0, s.length() - 3));


        System.out.println("-----Task-4-----");


        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);

        }


        System.out.println("-----Task-5-----");

        int cont = 0;

        for (int i = 0; i <= 10; i++) {
            cont += i;
        }
        System.out.println(cont);


        System.out.println("-----Task-6-----");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a positive number:");
        int number = input.nextInt();

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(number + fact);


        System.out.println("-----Task-7-----");

        String name = ScannerHelper.getNameFromUser();
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (CharacterHelper.isVowel(name.charAt(i)))
                count++;
        }
        System.out.println("There are " + count + " vowel letters in this full name ");


        System.out.println("-----Task-8-----");
        int total = 0;
        int n1 = 0;
        int attempt = 1;
        do {
            n1 = ScannerHelper.getNumberFromUser();

            if (n1 >= 100 && attempt == 1) {
                System.out.println("This number is already more than 100");
                break;
            } else {
                total += n1;
            }

            if (total >= 100 && attempt != 1) {
                System.out.println("Sum of the entered numbers is at least 100");
            }
            attempt++;
        }
        while (total < 100);


        System.out.println("-----Task-9-----");

        int fib = ScannerHelper.getNumberFromUser();
        int first = 0;
        int second = 1;
        int third = 0;
        String sss = "";

        for (int i = 0; i <= fib; ++i) {

            sss += first + " - ";

            third = first + second;
            first = second;
            second = third;
    }
        System.out.println(sss.substring(0,sss.length()-3));


        System.out.println("-----Task-10-----");

        String name1;
        do {
                name1 = ScannerHelper.getNameFromUser();

                if (name1.toLowerCase().startsWith("j"))
                    System.out.println("End the program");
            }
        while (!(name1.toLowerCase().startsWith("j")));

    }
}
