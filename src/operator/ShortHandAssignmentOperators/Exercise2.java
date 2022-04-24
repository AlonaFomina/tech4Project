package operator.ShortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise2 {
    static Scanner transactionInput = new Scanner(System.in);

    public static void main(String[] args) {
        double balance, firstTran, secondTran, thirdTran;

        System.out.println("Enter your balance $ " );
        balance  = transactionInput.nextDouble();

        System.out.println("Enter your first transaction = $ ");
        firstTran = transactionInput.nextDouble();
        balance -= firstTran;
        System.out.println("Your balance is = $ " + balance);

        System.out.println("Enter second transaction  = $ ");
        secondTran = transactionInput.nextDouble();
        balance -= secondTran;
        System.out.println(" Your balance is = $ " + balance);

        System.out.println("Enter your  third transaction = ");
        thirdTran = transactionInput.nextDouble();
        balance -= thirdTran;
        System.out.println(" Your balance is = $ " + balance);




    }
}
