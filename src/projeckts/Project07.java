package projeckts;

import java.util.Arrays;

public class Project07 {
    public static void main(String[] args) {

        System.out.println("__________Task-1__________");
        int[] ints = {10, 7, 7, 10 - 3, 10, -3};
        printSmallestGreatest(ints);


        System.out.println("__________Task-2__________");

        int[] ints1 = {10, 7, 7, 10 - 3, 10, -3};
        printGreatestSmallestWithNoSort(ints1);


        System.out.println("__________Task-3__________");

        int[] ints2 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(ints2);


        System.out.println("__________Task-4__________");
        int[] ints3 = {10, 5, 6, 7, 8, 5, 15, 15};
        secondMinSecondMax(ints3);


        System.out.println("__________Task-5__________");
        String[] strings = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz" };
        findDuplicatedElementsInAnArray(strings);


        System.out.println("__________Task-6__________");
        String[] strings1 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser","eraser","eraser"};
        findMostRepeatedElementInAnArray(strings1);


    }


    public static void printSmallestGreatest(int[] nums) {
        Arrays.sort(nums);
        System.out.println("Smallest = " + nums[0] +
                "\nGreatest = " + nums[nums.length - 1]);
    }


    public static void printGreatestSmallestWithNoSort(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        System.out.println("Smallest = " + min +
                "\nGreatest = " + max);
    }


    public static void findSecondGreatestAndSmallestWithSort(int[] nums) {
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[0]) secondMin = nums[i];
            if (nums[nums.length - 1 - i] != nums[nums.length - 1]) secondMax = nums[nums.length - i - 1];
        }
        System.out.println("Second Smallest = " + secondMin +
                "\nSecond Greatest = " + secondMax);
    }


    public static void secondMinSecondMax(int[] nums) {
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < getMax(nums) && nums[i] > secondMax) secondMax = nums[i];
            if (nums[i] > getMin(nums) && nums[i] < secondMin) secondMin = nums[i];
        }
        System.out.println("Second Smallest = " + secondMin +
                "\nSecond Greatest = " + secondMax);
    }

    public static int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;

    }

    public static int getMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min;
    }

    public static void findDuplicatedElementsInAnArray(String[] strings) {
        String cont = "";

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j]) && !cont.contains(strings[i])) {
                    cont += strings[i] + "\n";

                }
            }
        }

        System.out.println(cont);
    }


    public static void findMostRepeatedElementInAnArray(String[] arr) {
        Arrays.sort(arr);
        int max_count = 1, count = 1;
        String element = "";
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) count++;
            if(arr[i] != arr[i-1] || i == arr.length-1){
                if(count > max_count){
                    max_count = count;
                    element = arr[i-1];
                }
                count = 1;
            }
        }
        System.out.println(element);
    }
}
