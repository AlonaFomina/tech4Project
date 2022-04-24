package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("__________Task-1__________");

        int[] ints = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};
        System.out.println(ints[3]);
        System.out.println(ints[0]);
        System.out.println(ints[9]);
        System.out.println(Arrays.toString(ints));


        System.out.println("__________Task-2__________");

        String[] strings = new String[5];
        strings[1] = "abc";
        strings[4] = "xyx";
        System.out.println(strings[3]);
        System.out.println(strings[0]);
        System.out.println(strings[4]);
        System.out.println(Arrays.toString(strings));


        System.out.println("__________Task-3__________");

        int[] ints1 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(ints1));
        Arrays.sort(ints1);
        System.out.println(Arrays.toString(ints1));


        System.out.println("__________Task-4__________");

        String[] strings1 = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(strings1));
        Arrays.sort(strings1);
        System.out.println(Arrays.toString(strings1));


        System.out.println("__________Task-5__________");

        boolean containsPluto = false;
        String[] strings2 = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(strings2));
        for (String s : strings2) {
            if (s.toLowerCase().contains("pluto")) containsPluto = true;
                break;
        }
        System.out.println(containsPluto);


        System.out.println("__________Task-6__________");
        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        System.out.println(Arrays.toString(cats));
        boolean hasBoth = false;
        for (String cat : cats) {
            if(cat.equalsIgnoreCase("Garfield")){
                if(cat.equalsIgnoreCase("Felix"))hasBoth = true;
            }
        }
        System.out.println(hasBoth);


        System.out.println("__________Task-7__________");

        double[] doubles = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(doubles));
        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }


        System.out.println("__________Task-8__________");

        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        int up = 0, low = 0, let = 0, dig = 0,spec = 0;
        for (char aChar : chars) {
            if (CharacterHelper.isLetter(aChar)) {
                let++;
            if (CharacterHelper.isUppercase(aChar)) up++;
            else low++;
            }
            else if(CharacterHelper.isDigit(aChar)) dig++;
            else spec++;
        }
        System.out.println(Arrays.toString(chars));
        System.out.println("Letters = " + let +
                "\nUppercase letters = " + up +
                "\nLowercase letters = " + low +
                "\nDigits = " + dig +
                "\nSpecial characters " + spec);


        System.out.println("__________Task-9__________");

        String[] strings4 = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int u = 0, l = 0, bp = 0, bookpen = 0;
        for (String element : strings4) {
            if (CharacterHelper.isLowercase(element.charAt(0))) l++;
            else u ++;
            if(element.toLowerCase().startsWith("b") ||  element.toLowerCase().startsWith("p")) bp++;
            if (element.toLowerCase().contains("pen") || element.toLowerCase().contains("book")) bookpen++;

        }
        System.out.println(Arrays.toString(strings4));
        System.out.println("Elements starts with uppercase = " + u +
                "\nElements starts with lowercase = " + l +
                "\nElements starting with B or P = " + bp+
                "\nElements having ”book” or “pen”= " + bookpen);


        System.out.println("__________Task-10__________");
        int[] ints2 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int more = 0, less = 0, equals = 0;
        for (int i : ints2) {
            if (i == 10) equals++;
            else if (i > 10 ) more++;
            else less++;
        }
        System.out.println(Arrays.toString(ints2));
        System.out.println("Elements that are more than 10 = " + more +
                "\nElements that are less than 10 = " + less +
                "\nElements that are 10 = " + equals);


        System.out.println("__________Task-11__________");
        int[] i1 = {5, 8, 13, 1, 2};
        int[] i2 = {9, 3, 67, 1, 0};

        int i3[] = new int[i1.length];

        for (int i = 0; i < 5; i++) {
            i3[i]= Math.max(i1[i], i2[i]);
        }

        System.out.println("1st array is = " + Arrays.toString(i1));
        System.out.println("2st array is = " + Arrays.toString(i2));
        System.out.println("3rd array is = " + Arrays.toString(i3));

        }
    }

