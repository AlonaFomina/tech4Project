package ifElseStatements.ifStatements;

import java.util.Scanner;

public class beetween0and100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please put your number : ");
        int num = input.nextInt();

      // boolean num1 = num>=0, num2 = num<=100;
      //  boolean between0and100 = num1 && num2;


        if(num <= 100 == num >=0){
            System.out.println("is between 0 and 100");
        }
        else{
            System.out.println("not between 0 and 100");


            /*Write a program which is going to
             generate three random numbers between 32-74
             and print out the max, min and middle one with message.
Ex:
Input: 54, 43, 64
Output:
Max is 64
Min is 43
Middle is 54*/

            System.out.println("Random number 1 :" + (Math.random()* (33) + (42))
                    + "\nRandom number 2 :" + (Math.random()* (33) + (42))
                    +"\nRandom number 3 :" + (Math.random()* (33) + (42)));



        }
    }
}

