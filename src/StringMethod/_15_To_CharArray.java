package StringMethod;

import java.sql.Array;
import java.util.Arrays;

public class _15_To_CharArray {
    public static void main(String[] args) {

        String s = "Java";

        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(Arrays.toString("Hello".toCharArray()));

        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

        int countA = 0;
        for (char element : chars) {
            if(element == 'a') countA++;
        }
        System.out.println(countA);

    }
}
