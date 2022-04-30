package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Test {

    public static void main(String[] arg) {
        System.out.println(findSecondMax(new int[]{-5, 4, 1, 10, 2, -5, 8}));
        System.out.println(countwords("Darina koza"));
    }

//    public static int countWords(String str){
//        str.trim().split(Character.i);
//}

    public static int findSecondMax(int[] arr){
        TreeSet<Integer> u = new TreeSet<>();
        for (int i : arr) u.add(i);
        ArrayList<Integer> uNums = new ArrayList<>(u);
       return uNums.get(uNums.size() - 1);


    }
    public static int countwords(String s){
        return s.trim().split("\\s+").length;
    }
}
