package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Homework16 {

    public static int countWords(String str) {
        int c = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isSpaceChar(str.charAt(i))) c++;
        }
        return !str.isEmpty() ? ++c : 0;
    }

    public static int countA(String str) {
        int c1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') c1++;
        }
        return c1;
    }

    public static int countPos(ArrayList<Integer> integers) {
        int c2 = 0;
        for (Integer integer : integers) {
            if (integer > 0) c2++;
        }
        return c2;
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> arrayList) {
        ArrayList<Integer> noDup = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (!noDup.contains(integer)) noDup.add(integer);
        }
        return noDup;
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> stringArray) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String s : stringArray) {
            if (!stringArrayList.contains(s)) stringArrayList.add(s);
        }
        return stringArrayList;
    }

    public static String removeExtraSpaces(String str) {
        //“   I ! am      learning     Java      ”
        str = str.trim();
        //“I   am      learning     Java”
        String c = ""; // I
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') c += str.charAt(i);
            else if (str.charAt(i) == ' ' && c.charAt(c.length() - 1) != ' ') c += " ";

        }

        return c;
    }

    public static int[] returnSumOfArrays(int[] array1, int[] array2) {
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            //array1.length > array2.length ? (array1[i]+=array2[i]) : (array2[i] += array1[i]);
            if (array1.length > array2.length) array1[i] += array2[i];

            else array2[i] += array1[i];


        }
        return array1.length > array2.length ? array1 : array2;
    }

    /*
    Write a method findClosestTo10() that takes an int[] array
as an argument, and returns the closest element to 10
from given array
Test data 1:
int[] numbers = {10, -13, 5, 70, 15, 57};
Expected output 1:
5
     */

    public static int findClosestTo10(int[] arr) {
        int minDiff = Integer.MAX_VALUE;

        for (int current : arr) if (current != 10 && minDiff > Math.abs(10 - current)) minDiff = Math.abs(10 - current);

        Arrays.sort(arr);
        if (Arrays.binarySearch(arr, 10 - minDiff) >= 0) return (10 - minDiff);
        return (10 + minDiff);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 7, 11};

        System.out.println(countWords("     Java is fun      "));
        System.out.println(countA("echGlobal is a QA bootcamp"));
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(ints));
        System.out.println(removeDuplicateNumbers(ints));
        System.out.println(Arrays.toString(returnSumOfArrays(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5, 9, 8, 7})));
        System.out.println(findClosestTo10(arr));


    }
}
