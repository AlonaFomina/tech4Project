package arrays;

import utilities.CharacterHelper;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {

        System.out.println("------------------------Task-1------------------");
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));


        System.out.println("------------------------Task-2------------------");
        System.out.println("The size of the array is =  " + chars.length);


        System.out.println("------------------------Task-3------------------");
        for (int i = 0; i <chars.length  ; i++) {
            System.out.println(chars[i]);
        }


        System.out.println("------------------------Task-4------------------");
        for (char element : chars) {
            System.out.println(element);
        }

        System.out.println("------------------------Task-5------------------");
        for (int i = 0; i < chars.length; i++) {
           if(CharacterHelper.isLetter(chars[i])) System.out.println(chars[i]);
        }


        System.out.println("------------------------Task-6------------------");
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            if(CharacterHelper.isUppercase(chars[i])) n++;
        }
        System.out.println(n);


        System.out.println("------------------------Task-7------------------");

        int  counter = 0;
        for (char c: chars) {
            if(CharacterHelper.isUppercase(c)) counter++;
        }
        System.out.println(counter);



        System.out.println("------------------------Task-7------------------");

        }
    }

