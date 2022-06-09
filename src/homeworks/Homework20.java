package homeworks;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework20 {

    public static boolean hasLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)) && !Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public static ArrayList<Integer> noZero(ArrayList<Integer> arrayList) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer != 0) integers.add(integer);
        }
        return integers;
    }

    public static int[][] numberAndSquare(int[] arr) {

        int[][] newArr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            int[] arr1 = {arr[i], arr[i] * arr[i]};
            newArr[i] = arr1;

        }
        return newArr;
    }

    public static boolean containsValue(String[] arr, String s) {
        for (String s1 : arr) {
            if (s.equals(s1)) return true;
        }
        return false;
    }

    public static String reverseSentence(String str) {
        String[] words = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        if (!str.trim().contains(" ")) return "There is not enough words!";

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString().toUpperCase().charAt(0) + sb.toString().toLowerCase().substring(1).trim();
    }

    public static String removeStringSpecialsDigits(String str) {
        return str.trim().replaceAll("[^A-Za-z\\s]", "");
    }

    public static String[] removeArraySpecialsDigits(String[] arr) {
        String[] newArr = new String[arr.length];

        for (int i = 0; i <newArr.length ; i++) {
            for (int j = 0; j <= i; j++) {
                newArr[i] = arr[i].replaceAll("[^A-Za-z]", "");
            }
        }
        return newArr;
    }

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> s1,ArrayList<String> s2){
        ArrayList<String> newList = new ArrayList<>();
      Collections.sort(s1);
      Collections.sort(s2);

        for (int i = 0 , j = 0; i <s1.size() && j< s2.size() ; i++, j++) {
            if(s1.get(i)==s2.get(j))newList.add(String.valueOf(s1.get(i)));
        }
            return newList;
        }


    public static ArrayList<String> noXInVariables(ArrayList<String> arr){

        for (int i = 0; i <arr.size() ; i++) {
            if (!arr.get(i).toLowerCase().contains("x") &&
            arr.get(i).toLowerCase().replaceAll("[x]", "").length() == 0)continue;
            arr.set(i, arr.get(i).replaceAll("[Xx]", ""));
        }
        return arr;
    }



    public static void main(String[] args) {
        System.out.println(hasLowerCase("java"));
        System.out.println(noZero(new ArrayList(Arrays.asList(0, 3, 4, 6, 7))));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 4, 6, 7})));
        System.out.println(containsValue(new String[]{"Dasha", "Alona"}, "Katya"));
        System.out.println(reverseSentence("Java is"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));
        System.out.println(removeAndReturnCommons(new ArrayList<String>(Arrays.asList(new String[]{"Java","c#", "Python"})), new ArrayList<String>(Arrays.asList(new String[]{"Java", "Python"}))));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Java","c#","344", "Python"})));
        System.out.println(noXInVariables(new ArrayList<String>(Arrays.asList(new String[]{"JaXXva","c#", "Pyxxxthon"}))));

    }
}
