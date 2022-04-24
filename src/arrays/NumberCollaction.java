package arrays;

import java.util.Arrays;

public class NumberCollaction {
    public static void main(String[] args) {
        //1-st way

        int[] ints = new int[3];
        ints[0] = 1;
        ints[2] = 3;
        ints[1] = 2;
        System.out.println(Arrays.toString(ints));


        //2-nd way
        for (int i = 0; i < 3; i++) {
            System.out.println(ints[i]);



            System.out.println("\n-----1st way-----\n");
            int[] numbers1 = new int[3]; // [0, 0, 0]
            numbers1[0] = 1; // [1, 0, 0]
            numbers1[1] = 2; // [1, 2, 0]
            numbers1[2] = 3; // [1, 2, 3]

            System.out.println(Arrays.toString(numbers1));


            System.out.println("\n-----2nd way-----\n");
            int[] numbers2 = {1, 2, 3};
            System.out.println(Arrays.toString(numbers2));


            System.out.println("\n-----3rd way-----\n");
            int[] numbers3 = new int[]{1, 2, 3};
            System.out.println(Arrays.toString(numbers3));

        }
    }
}
