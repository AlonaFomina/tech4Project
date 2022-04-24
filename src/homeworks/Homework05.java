package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        //Task-1

        int n1 = 6, n2 = 10, n3 = 3, min12 = Math.min(n1, n2), min123 = Math.min(min12, n3), max12 = Math.max(n1, n2), max123 = Math.max(max12, n3);

        System.out.println("Max value = " + max123 +
                "\nMin value = " + min123);

        //Task-2

        Scanner userInput = new Scanner(System.in);

        int num1, num2, num3, num4, num5;

        System.out.println("Enter your number 1: ");
        num1 = userInput.nextInt();

        System.out.println("Enter your number 2: ");
        num2 = userInput.nextInt();

        System.out.println("Enter your number 3: ");
        num3 = userInput.nextInt();

        System.out.println("Enter your number 4: ");
        num4 = userInput.nextInt();

        System.out.println("Enter your number 5: ");
        num5 = userInput.nextInt();

        int maxOf5 = Math.max(num1, Math.max(Math.max(num2, num3), Math.max(num4, num5)));
        int min122 = Math.min(num1, num2), min1233 = Math.min(min12, num3), min1234 = Math.min(min123, num4), min12345 = Math.min(min1234, num5);

        System.out.println("Max value = " + maxOf5 +
                "\nMin value = " + min12345);

        //Task-3

        int x, y;

        System.out.println("Enter your number 1: ");
        x = userInput.nextInt();

        System.out.println("Enter your number 2: ");
        y = userInput.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(x - y));

        //Task-4

        int randomAaCcBb1 = (int) (Math.random() * (51) + (50));
        int randomAaCcBb2 = (int) (Math.random() * (51) + (50));
        int randomAaCcBb3 = (int) (Math.random() * (51) + (50));

        System.out.println(randomAaCcBb1);
        System.out.println(randomAaCcBb2);
        System.out.println(randomAaCcBb3);

        System.out.println("The sum of numbers is = " + (randomAaCcBb1 + randomAaCcBb2 + randomAaCcBb3));

        //Task-5

        double alexMoney = 125, mikeMoney = 220, transaction = 25.5;
        alexMoney -= transaction;
        mikeMoney += transaction;

        System.out.println("Alex’s money: $" + alexMoney +
                "\nMike’s money: $" + mikeMoney);

        //Task-6

        double davidPerDay = 15.60, bicycleCost = 390;
        int daysForSaving = (int) Math.abs(bicycleCost/davidPerDay);

        System.out.println(daysForSaving);


    }
}
