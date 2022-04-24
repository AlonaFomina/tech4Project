package arrays;

import java.util.Arrays;

public class _09_Practice {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------");


        int[] nu = {0, 5, 3, 2, 4, 7, 10};


        System.out.println(Arrays.toString(nu));


        int countEven = 0;
        int countOdd = 0;
        for (int number : nu) {
            if (number % 2 == 0 && countEven == 0) {
                System.out.println("First even number is: " + number);
                countEven++;
            } else if (number % 2 == 1 && countOdd == 0) {
                System.out.println("First odd number is: " + number);
                countOdd++;
            }
        }

        System.out.println("--------------------------------------------------------------------");
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        /*
        First even = 0
        First odd = 5
         */

        boolean isFirstEvenFound = false;
        boolean isFirstOddFound = false;

        for (int number : numbers) {
            if(number % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                System.out.println("First Even = " + number);
            }
            else if(!isFirstOddFound){
                isFirstOddFound = true;
                System.out.println("First Odd = " + number);
            }

            if(isFirstEvenFound && isFirstOddFound) break;
        }

        if(!isFirstEvenFound) System.out.println("There is no even in this array");
        if(!isFirstOddFound) System.out.println("There is no odd in this array");


        System.out.println("--------------------------------------------------------------------");

        int even = 1, odd = 0;

        for (int number : numbers) {
            if(even % 2 == 0 && odd % 2 == 1) break;
            if(even %2 == 1 && number % 2 == 0) even = number;
            else if(odd % 2 == 0 && number % 2 == 1) odd = number;
        }
        System.out.println((even == 1)? "There is no even" : "First even = " + even);
        System.out.println((odd == 0 )? "There is no odd" : "First even = " + odd);
    }
}
