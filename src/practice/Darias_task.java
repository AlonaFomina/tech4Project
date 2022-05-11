package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Darias_task {
    public static void main(String[] args) {
        /*
        String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together. Ex:
Input: “DC501GCCCA098911”
OutPut: “CD015ACCCG011899"
         */
        String s = "DC501GCCCA098911";

            for (int i = 0; i < s.length() - 1; i++) {
                char c1 = s.charAt(i), c2 = s.charAt(i + 1);
                if (
                        (Character.isLetter(c1) && Character.isDigit(c2)) ||
                                (Character.isLetter(c2) && Character.isDigit(c1)))
                    s = s.substring(0, i + 1) + " " + s.substring(i + 1);
            }
            System.out.println(s);

            StringBuilder sb = new StringBuilder();
            for (String o : s.split(" ")) {
                char[] chars = o.toCharArray();
                Arrays.sort(chars);
                for (char c : chars) sb.append(c);
            }
        System.out.println(sb);
        }

}
