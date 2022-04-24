package arrays;

import java.util.Arrays;
import java.util.Locale;

public class SortingArrays {
    public static void main(String[] args) {

        /*
        How to sort arrays of numbers
        byte,short, int, long, float, double

        ASCENDING: lowest to higher
        DESCENDING:  highest to lowest
         */

        System.out.println("\n Storing Arrays in order\n");
        int[] numbers = {10, -5, 0, 0, 3,0, 7, 9};

        System.out.println("My arrays is = " + Arrays.toString(numbers));

        //sort this array in ascending order(-5, 0,0,0,3,7,9,10)

        Arrays.sort(numbers);
        System.out.println("My arrays is = " + Arrays.toString(numbers));



        System.out.println("\n Storing characters in order\n");
        char[] chars = {'A', 'b', 'z'};

        System.out.println("My character array is = " + Arrays.toString(chars));

        Arrays.sort(chars);
        System.out.println("My character array is = " + Arrays.toString(chars));

        System.out.println("\n Sorting Words\n");
        String[] strings = {"Adam", "Adame", "Alex", "tom", "ally", "Adele", "terry", "Josh"};

        System.out.println("My names Arrays = " + Arrays.toString(strings));

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase().charAt(0) + strings[i].toLowerCase().substring(1);
        }
        Arrays.sort(strings);
        System.out.println("My names Arrays = " + Arrays.toString(strings)); //Lexicographically

    }
}
