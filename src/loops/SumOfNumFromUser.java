package loops;

import java.util.Scanner;

public class SumOfNumFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter?");
        int total = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= total; i++) {

            System.out.println("Please enter number " + i);
            sum += input.nextInt();
        }
        System.out.println(sum);


        System.out.println("----------------------------------------------------------");

        System.out.println("Please enter how many numbers you want to enter");
        int num = input.nextInt();
        int count = 1;
        int sum2 = 0;

        while (count <= num){
            System.out.println("Please enter a number " + count);
            sum2 += input.nextInt();
            count ++;
        }
        System.out.println(sum2);
    }
}