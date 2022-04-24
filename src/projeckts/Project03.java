package projeckts;

import java.util.Scanner;

public class Project03 {
    public static void main(String[] args) {

        //Task-1
        Scanner input = new Scanner(System.in);

        String s1 = "24", s2 = "5";
        int num1 =Integer.valueOf (s1), num2 = Integer.valueOf(s2);

        System.out.println("The sum of " + num1 + " and" + num2 + " = " + (num1+num2) +
                "\nThe subtraction of " + num1 + "and " + num2 + " = " + (num1 - num2) +
                "\nThe division of " + num1 + " and " + num2 + " = " + (num1/num2) +
                "\nThe multiplication of " + "and " + num2 + "  = " + (num1 * num2) +
                "\nThe remainder of " + num1 + " and " + num2 + " = " + (num1 % num2));

        //Task-2

        int n =(int) (Math.random() * (35 - 1 +1) + (1));
        System.out.println(n);

        if (n == 1 || n == 2 || n == 3 || n == 5 || n == 7 || n == 11|| n == 13 || n ==17 || n == 19 || n == 23 || n ==29 || n == 31) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        }
        else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");

        //Task-3

        int n1 = (int) (Math.random()* (50 - 1 + 1) + (1));
        int n2 = (int) (Math.random()* (50 - 1 + 1) + (1));
        int n3 = (int) (Math.random()* (50 - 1 + 1) + (1));

        System.out.println("Random number 1 = " + n1 +
                "\nRandom number 2 = " + n2 +
                "\nRandom number 3 = " + n3);

         if (n1 < n2 && n2 < n3 ) System.out.println("Lowest number is = " + n1);
         else if(n2 < n1 && n2 < n3) System.out.println("Lowest number is = " + n2);
         else System.out.println("Lowest number is = " + n3);

         if (n1 < n2 && n2 < n3 || n3 < n2 && n2 < n1) System.out.println("Middle number is = " + n2);
         else if (n2 < n1 && n1 < n3 || n3 < n1 && n1 < n2) System.out.println("Middle number is = " + n1);
         else System.out.println("Middle number is = " + n3);

        if (n1 > n2 && n2 > n3 ) System.out.println("Greatest number is = " + n1);
        else if(n2 > n1 && n2 > n3) System.out.println("Greatest number is = " + n2);
        else System.out.println("Greatest number is = " + n3);

        //Task-4

        System.out.println("Please put 1 letter or symbol: ");
        char c = input.next().charAt(0);

        if (c >= 65 && c <= 90 || c >= 97 && c<= 122) System.out.println("Character is a letter");
        else System.out.println("Invalid character detected!!!");
        if (c >= 0 && c <= 64 || c >= 91 &&  c <= 96 || c >= 124 && c<= 127){
            System.out.println("Special character is = " + c);
        }
        if ( c>= 97 && c <=  122  ) System.out.println("The letter is lower");
        if (c >= 65 && c <= 90) System.out.println("The letter is uppercase");

        //Task-5

        System.out.println("Please put 1 letter : ");
        char c1 = input.next().charAt(0);

        if (c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122) System.out.println("Character is a letter");
        else System.out.println("Invalid character detected!!!");
        if ( c1 >= 97 && c1 <=  122  ) System.out.println("The letter is lower");
        if (c1 >= 65 && c1 <= 90) System.out.println("The letter is consonant");

        //Task-6

        char c2 = '8';

        if (c2 >= 0 && c2 <= 47 || c2 >= 58 && c2 <= 64 || c2 >= 91 && c >= 96 || c2 >= 123 && c2 <= 127){
            System.out.println(c2 + " is the special character");}
        else System.out.println("Invalid character detected!!!");

        //Task-7

        char cc = '*';

        if (cc >= 65 && cc <= 90 || cc >= 97 && cc <= 122) System.out.println("Character is a letter");
        else if(cc >= 48 && cc <= 57) System.out.println("Character is a digit");
        else System.out.println("Character is a special character");

    }
}
