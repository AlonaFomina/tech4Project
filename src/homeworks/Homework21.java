package homeworks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class Homework21 {

    public static void fizzBuzz1(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Buzz");
            else if (i % 5 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
        System.out.println(num);
    }

    public static String fizzBuzz2(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        else if (num % 3 == 0) return "Buzz";
        else if (num % 5 == 0) return "Fizz";
        else return String.valueOf(num);
    }


    public static int findSumNumbers(String str) {

        String[] strArr = str.replaceAll("[^0-9]", " ").trim().split("\\s+");
        int cont = 0;
        for (String number : strArr) cont += Integer.parseInt(number);
        return cont;

    }

    public static int findBiggestNumber(String str) {
        String[] strArr = str.replaceAll("[^0-9]", " ").trim().split("\\s+");
        Arrays.sort(strArr);
        return Integer.parseInt(strArr[strArr.length - 1]);
    }


    public static String countSequenceOfCharacters(String str) {

        LinkedHashMap<Character, Integer> mapCollection = new LinkedHashMap<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!mapCollection.containsKey(str.charAt(i))) mapCollection.put(str.charAt(i), 1);
            else mapCollection.put(str.charAt(i), mapCollection.get(str.charAt(i)) + 1);
        }
        for (Character character : mapCollection.keySet()) {
            sb.append("" + mapCollection.get(character) + character);
        }
     return sb.toString();
    }

    public static void main(String[] args) {
        fizzBuzz1(5);
        System.out.println(fizzBuzz2(1));
        System.out.println(findSumNumbers("abd23bbb555"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(countSequenceOfCharacters("abd"));
        System.out.println(countSequenceOfCharacters("abcabs"));
    }
}