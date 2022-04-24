package arrays;

import java.util.Arrays;

public class DeffaultValues {
    public static void main(String[] args) {

        String[]s = new String[5];
        System.out.println(Arrays.toString(s));

        int[] ints = new int[5];
        System.out.println(Arrays.toString(ints)); // default value == 0

        double[] doubles = new double[5];
        System.out.println(Arrays.toString(doubles));

        boolean[] booleans = new boolean[5];
        System.out.println(Arrays.toString(booleans));

        char[] chars = new char[5];
        System.out.println(Arrays.toString(chars));
        chars[1]= '#';
    }
}
