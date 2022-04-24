package ifElseStatements.ifStatements;

import java.util.Scanner;

public class Divideby7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please put your number");
        int num  = input.nextInt();

        if( num % 7 == 0 ){
            System.out.println("Number dividable by 7 ");
        }
        else{
            System.out.println("Number is not dividable by 7 ");
        }


    }
}
