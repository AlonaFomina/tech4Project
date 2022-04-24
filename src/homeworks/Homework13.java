package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("__________Task-1__________");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 5 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }


        System.out.println("__________Task-2__________");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        int p = 0, n = 0;

        for (int number : numbers) {
            if (number < 0 && p == 0) {
                p = number;
            } else if (number > 0 && n == 0) {
                n = number;
            }
        }
        System.out.println("First positive number is: " + p +
                "\nFirst negative number is: " + n);


        System.out.println("__________Task-3__________");

        int[] ints = new int[5];

        boolean containes2Or2 = false;
        for (int i = 0; i < 5; i++) {
            ints[i] = (int) (Math.random() * 11);
            if (ints[i] == 2 || ints[i] == 3) containes2Or2 = true;
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(containes2Or2);


        System.out.println("__________Task-4__________");

        String[] list = {"banana", "orange", "Apple"};
        String[] list1 = {"pineapple", "banana", "orange", "grapes"};

        boolean apple = false;
        int app = 0;
        for (String s : list1) {
            if (s.toLowerCase().contains("apple")) apple = true;
        }
        System.out.println(apple);


        System.out.println("__________Task-5__________");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {100, 300};

        boolean matchDoesntExists = true;

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    matchDoesntExists = false;
                    System.out.println(numbers1[i]);
                    break;
                }
            }
        }
        if (matchDoesntExists) System.out.println("There is no matching elements");

        System.out.println("__________Task-6__________");

        String result = "";
        String s = "baNana";

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j) &&
                        !result.contains(s.toLowerCase().substring(i, i + 1))) {

                    result += s.toLowerCase().charAt(i);
                    System.out.println(s.charAt(i));
                }
            }
        }
    }

}

