package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Homework22 {

    public static int[] fibonacciSeries1(int num) {
        int arr[] = new int[num];
        if (num >= 1) arr[0] = 1;
        if (num >= 2) arr[1] = 1;
//        int num1 = 1;
//        int num2 = 1;
//        int num3 = 0;

        for (int i = 0; i < num - 2; i++) {
            arr[i + 2] = arr[i + 1] + arr[i];
//            arr[i] = num1;
//            num3 = num1 + num2;
//            num1 = num2;
//            num2 = num3;
        }
        return arr;

    }

    public static int fibonacciSeries2(int num) {
//        int arr[] = new int[num];
//        if (num >= 1) arr[0] = 1;
//        if (num >= 2) arr[1] = 1;
//        int nth = 0;
//        for (int i = 0; i < num - 2; i++) {
//            arr[i + 2] = arr[i + 1] + arr[i];
//        }
//        return arr[num - 1];
        return fibonacciSeries1(num)[num - 1];
    }

    public static int[] findUniques(int[] arr1, int[] arr2) {

        HashSet<Integer> intSet = new HashSet<>();

        List<Integer> common = new ArrayList<>();
        for (int a1 : arr1) for (int a2 : arr2) if (a1 == a2) common.add(a1);

        for (int a1 : arr1) if (!common.contains(a1)) intSet.add(a1);
        for (int a2 : arr2) if (!common.contains(a2)) intSet.add(a2);

        int[] uncommons = new int[intSet.size()];
        int i = 0;
        for (Integer uncommon : intSet) uncommons[i++] = uncommon;

        return uncommons;
    }

    public static boolean isPowerOf3(int num) {
//        while (num % 3 == 0) {
//            num /= 3;
//        }
//        return (num == 1);
        while (num != 1) {
            if (num % 3 != 0) return false;
            num /= 3;
        }
        return true;
    }

    public static int firstDuplicate(int[] arr) {
        int dup = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dup = arr[i];
                    break;
                }
            }
            if(dup!= -1) break;
        }
        return dup;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(fibonacciSeries1(6)));
//        System.out.println(fibonacciSeries2(6));
        int[] arr1 = {8, 9, 7, 5};
        int[] arr2 = {8, 9, 8, 7};
//        System.out.println(Arrays.toString(findUniques(arr1, arr2)));
        System.out.println(isPowerOf3(-81));
        System.out.println(Arrays.asList(firstDuplicate(new int[]{1, 2, 2, 3, 3, 4, 1})));
    }
}
