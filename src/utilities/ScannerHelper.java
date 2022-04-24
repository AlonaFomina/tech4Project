package utilities;

import java.util.Scanner;

public class ScannerHelper {
    public static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int num = input.nextInt();
        input.nextLine();
        return num;

    }


    public static double getDoubleFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the double number : ");
        double num1 = input.nextDouble();
        input.nextLine();
        return num1;
    }

    public static int getNumWithMessage(String message) { // "Hey user enter your number"
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        int n = input.nextInt();
        if (n >= 5 && n <= 10) {
            return n;
        }
        else return -1;

    }

    public static int getNumFrom1to10(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        int n = input.nextInt();
        if (n >= 1 && n <= 10) {
            return n;
        }
        else return -1;
    }
    public static String getAStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        return string;
    }
    public static String getNameFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String string = scanner.nextLine();
        return string;
    }
}