package StringMethod;

import java.util.Locale;

public class _05_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        /*
        These methods are used to convert letters of the string to upper or lower case
        - its non-static methods that u can call them with objects of String class
        - there are t=return type methods, and they return the modifies String back
        - not take any arguments
         */
        String s1 = "HELLO world 10$";
        System.out.println(s1);
        System.out.println(s1.toLowerCase());//hello world
        System.out.println(s1.toUpperCase());//HELLO WORLD

        String sentence =" I paid $100.99 to buy airpods.", s2 =sentence.toLowerCase();
        String s3 = sentence.toUpperCase();
        System.out.println(sentence);
        System.out.println(s2);
        System.out.println(s3.toLowerCase().toUpperCase());
    }
}
