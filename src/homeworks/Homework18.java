package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Homework18 {
    public static String noSpace(String str) {
        return str.trim().replaceAll(" ", "").replaceAll("//s+", "");
    }


    public static String replaceFirstLast(String str) {
        String s = "";
        for (int i = 1; i <= str.length() - 2; i++) {
            s += str.charAt(i);
        }
        return str.charAt(str.length() - 1) + s + str.charAt(0);
    }


    public static boolean hasVowel(String str) {
        boolean isVowel = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'e' ||
                    str.toLowerCase().charAt(i) == 'o' ||
                    str.toLowerCase().charAt(i) == 'u' ||
                    str.toLowerCase().charAt(i) == 'a' ||
                    str.toLowerCase().charAt(i) == 'i') isVowel = true;
        }
        return isVowel;
    }


    public static void checkAge(int year) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date currentDate = new Date();

        int age = Integer.parseInt(new SimpleDateFormat("yyyy").format(currentDate)) - year;
        if (age < 16) System.out.println("AGE IS NOT ALLOWED");
        if (age >= 16) System.out.println("AGE IS ALLOWED");
        if (age >= 100) System.out.println("AGE IS not valid");
    }


    public static int averageOfEdges(int a, int b, int c) {
        return (Math.max(Math.max(b, c), a) + Math.min(Math.min(b, c), a)) / 2;
    }

    public static String[] noA(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().startsWith("a")) {
                int size = arr[i].length();
                arr[i] = "";
                for (int j = 0; j < size; j++) arr[i] += "#";
            }
        }
        return arr;
    }

    /*
    Create a method called no3or5()
-This method will take an int array argument and it will
return a new array with some elements replaced as below
If element can be divided by 5, replace it with 99
If element can be divided by 3, replace it with 100
If el
     */
    public static int[] no3or5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%15 == 0) arr[i] = 101;
            else if (arr[i] % 5 == 0) arr[i] = 99;
            else if  (arr[i] % 3 == 0) arr[i] = 100;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(noSpace(" Hello World   "));
        System.out.println(replaceFirstLast("hello"));
        System.out.println(hasVowel("java"));
        checkAge(1994);
        System.out.println(averageOfEdges(0, 0, 6));
        System.out.println(Arrays.toString(noA(new String[]{"a;;;", "ddd", "aaaggg"})));
        System.out.println(Arrays.toString(no3or5(new int[]{3, 4, 5, 6})));
    }
}
