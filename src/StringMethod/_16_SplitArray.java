package StringMethod;

import java.util.Arrays;

public class _16_SplitArray {
    public static void main(String[] args) {

        String s = "Banana is nice";
        System.out.println(Arrays.toString(s.split(" ")));

        String [] sSolitFromSpaces = s.split(" ");
        System.out.println(Arrays.toString(sSolitFromSpaces));

        String[] splitFromI = s.split("i");
        System.out.println(Arrays.toString(splitFromI));

        String[] splitFromA = s.split("a");
        System.out.println(Arrays.toString(splitFromA));

        String[] splitFromIs = s.split("is");
        System.out.println(Arrays.toString(splitFromIs));
    }
}
