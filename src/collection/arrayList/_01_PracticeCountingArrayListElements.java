package collection.arrayList;

import utilities.CharacterHelper;

import java.util.ArrayList;
import java.util.List;

public class _01_PracticeCountingArrayListElements {
    public static void main(String[] args) {

        System.out.println("__________Task-1________");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println("Unsorted = " + numbers);


        System.out.println("__________Task-2________");

        int count = 0;

        for (Integer number : numbers) {
            if (number % 2 != 0) count++;
        }
        System.out.println("Odds = " + count);


        int countOdds = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) countOdds++;
        }
        System.out.println("Odds = " + countOdds);


        /* More practice
        Practices
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */

        System.out.println("__________Task-3________");
        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add("");
        colors.add(null);

        System.out.println(colors);


        System.out.println("__________Task-3________");
        int count1 = 0;

        for (String color : colors) {
            if (CharacterHelper.isUppercase(color.charAt(0))) count1++;
        }
        System.out.println(count1);


        System.out.println("__________Task-4________");

        int count11 = 0;

        for (int i = 0; i < colors.size(); i++) {
           if( Character.isUpperCase(colors.get(i).charAt(0))) count11++;
        }
        System.out.println(count1);
        /*
        Practices
        Lowercases
        nulls
        empties
        That has length of 4 at least
        That has length of even or odd
        That has a or A
         */
    }
}

