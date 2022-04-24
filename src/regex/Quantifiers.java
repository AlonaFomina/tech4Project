package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]+", "hello"));//true
        System.out.println(Pattern.matches("[a-z]+", "Hello"));//false
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "Hello class"));//false
        System.out.println(Pattern.matches("[a-z-A-Z]+", "Hello"));//true n
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}", "Hello TechGLobal"));//false

        System.out.println(Pattern.matches("[0-9-()-]{1,}","(806)-551-3112"));
        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[\\d]{3}-[\\d]{4}","(806)-551-3112"));
        System.out.println(Pattern.matches("\\([1-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(733)-456-7890"));

        String str = "Hello World";

    }
}
