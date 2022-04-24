package ifElseStatements.ifStatements;

import java.util.Scanner;

public class BalanceExample {
    public static void main(String[] args) {
        double balance = 1000;
        boolean isBalanceLessthan0 = balance < 0;
        boolean isBalance100 = balance == 100;
        boolean isbiggerOrEqualThan1000 = balance >= 1000;
        boolean notequalTo_1 = balance != -1;



        if (isBalanceLessthan0) {
            System.out.println("Your balance is under 0");

        }
        Scanner userInput = new Scanner(System.in);

    }
}
