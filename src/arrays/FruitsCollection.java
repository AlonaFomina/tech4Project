package arrays;

import java.util.Arrays;
import java.util.Locale;

public class FruitsCollection {
    public static void main(String[] args) {

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));
        fruits[0] = "orange";
        fruits[3] = "grape";
        System.out.println(Arrays.toString(fruits));

        System.out.println(fruits.length);
        System.out.println(fruits[0] +", " + fruits[3]);
        System.out.println(fruits[1]);
        System.out.println(fruits[0].toLowerCase());
        System.out.println(fruits[3].toUpperCase());
        System.out.println(fruits[0].length());
        System.out.println(fruits[3].charAt(0));


    }
}
