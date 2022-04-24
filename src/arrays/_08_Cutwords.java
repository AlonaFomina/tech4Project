package arrays;

import java.util.Arrays;

public class _08_Cutwords {
    public static void main(String[] args) {

        System.out.println("----------Task1----------");

        String s1 = "Today is Tuesday";

        String ss = Arrays.toString(s1.split(" "));
        System.out.println(s1.split(" ").length);


        System.out.println("----------Task2----------");
        String s2 = "Some countries I visited were Argentina, Belgium and Malta";
        String[] words2 = s2.split(" ");
        System.out.println(Arrays.toString(words2));

        int a = 0;
        for (String word:words2) {
            if(word.toLowerCase().startsWith("a")) a++;
        }
        System.out.println(a);
        }
    }
