package loops;

import utilities.MathHelper;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        Print all numbers starting from 1 to 30 (1 and 30 are included)
If number is divided by 3, then print "Fizz" instead of number
if number is divided by 5, then print "Buzz" instead pf number
if number is divided by both 3 and 5, then print "FizzBuzz"
         */

         for (int i = 1; i <31; i++){
             if (i%15 == 0) System.out.println("FizzBuzz");
             else if (i%3 == 0) System.out.println("Fizz");
             else if (i%5 == 0) System.out.println("Buzz");
             else System.out.println(i);

         }
    }
}
