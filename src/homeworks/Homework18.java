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
        str = str.trim();

        if(str.length()<2)return "";
        else
            for (int i = 1; i < str.length() - 1; i++) {
                s += str.charAt(i);
            }
            str = str.charAt(str.length() - 1) + s + str.charAt(0);

        return str;
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
        for (int i = 0; i < arr.length; i++) if (arr[i].toLowerCase().startsWith("a")) arr[i] = "###";
        return arr;
    }


    public static int[] no3or5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%15 == 0) arr[i] = 101;
            else if (arr[i] % 5 == 0) arr[i] = 99;
            else if  (arr[i] % 3 == 0) arr[i] = 100;
        }
        return arr;
    }

    public static int countPrimes(int[] arr){
        int c = 0;
        for (int num : arr) {
            if (num < 2 ) continue;
            boolean isPrime = true;
            for (int i = 2; i < num/2; i++) {
                if (num % i == 0) isPrime = false;
                break;
            }
            if (isPrime) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(noSpace(" Hello World   "));
        System.out.println(replaceFirstLast("   AB      "));
        System.out.println(hasVowel("java"));
        checkAge(1994);
        System.out.println(averageOfEdges(0, 0, 6));
        System.out.println(Arrays.toString(noA(new String[]{"a;;;", "ddd", "aaaggg"})));
        System.out.println(Arrays.toString(no3or5(new int[]{3, 4, 5, 6})));
    }
}
