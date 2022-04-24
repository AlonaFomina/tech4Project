package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {
        System.out.println("__________Task1__________");

        int[] numbers = {5, 3, 0, -5};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) max = number;
        }
        System.out.println(max);

        int m = numbers[0];
        for (int number : numbers) {
            m = Math.max(m, number);
        }
        System.out.println(m);

        /*
TASK-2
Create a double array and store below elements
{2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}

Find the minimum value

RESULT:
0.5
 */

        System.out.println("__________Task2__________");

        double[] doubles = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double min = 0.5;

        for (double aDouble : doubles) {
            min = Math.min(aDouble, min);
        }
        System.out.println(min);


        System.out.println("__________Task3__________");
        double minValue2 = Double.MAX_VALUE;
        for (double number : doubles) {
            if (number != min && number < minValue2) minValue2 = number;
        }
        System.out.println(minValue2);

    }
}

