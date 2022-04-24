package arrays;

public class _04_Practice_Partial_arrays {
    public static void main(String[] args) {

        System.out.println("_____TASK-1_____");
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for (int arrayNumber : numbers) {
            System.out.println(arrayNumber);
        }


        System.out.println("_____TASK-2_____");

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);


        System.out.println("_____TASK-3_____");

        int c = 0;
        for (int i = 0; i <= 2; i++) {
            c += numbers[i];
        }
        System.out.println(c);


        System.out.println("_____TASK-4_____");

        int c5 = 0;

        for (int i = numbers.length - 5; i < numbers.length; i++) {
            c5 += numbers[i];
        }
        System.out.println(c5);

        System.out.println("_____TASK-5_____");

        int p = 1;

        for (int i = numbers.length - 4; i < numbers.length; i++) {
            if (numbers[i] == 0) continue;
            else p *= numbers[i];
        }
        System.out.println(p);


        System.out.println("_____TASK-6_____");

        boolean collection = false;
        for (int n : numbers) {
            if (n == 0) {
                collection = true;
                break;
            }
        }
        System.out.println(collection);
    }
}
