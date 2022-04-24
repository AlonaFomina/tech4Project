package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("____Task1____");

        String s = ScannerHelper.getAStringFromUser();

        if (s.length() == 0) System.out.println("Length is zero.");
        else System.out.println("Length is = " + s.length() +
                "\nFirst char is = " + s.charAt(0) +
                "\nLast char is = " + s.charAt(s.length() - 1));
        if (s.toLowerCase().contains("a") || s.toLowerCase().contains("e") || s.toLowerCase().contains("u") || s.toLowerCase().contains("o"))
            ;
        System.out.println("This String has vowel");


        System.out.println("____Task2____");

        String str = ScannerHelper.getAStringFromUser();

        if (s.length() < 3) System.out.println("Length is less than 3");
        else if (str.length() % 2 == 0) System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
        else System.out.println(str.charAt(s.length() / 2));


        System.out.println("____Task3____");

        String s1 = ScannerHelper.getAStringFromUser();

        if (s1.length() < 4) System.out.println("INVALID INPUT");

        else System.out.println("First 2 characters are = " + s1.substring(0, 2) +
                "\nLast 2 characters are = " + s1.substring(s1.length() - 2,s1.length()) +
                "\nThe other characters are = " + s1.substring(2, s1.length() - 2));


        System.out.println("____Task4____");

        String s2 = ScannerHelper.getAStringFromUser();

        if (s2.length() < 2) System.out.println("length is less than 2");
        else if (s2.substring(0, 1).equalsIgnoreCase(s2.substring(s2.length() - 2, s2.length()-1))){
            System.out.println("true");
        }
        else System.out.println("false");


        System.out.println("____Task5____");

        String s3 = ScannerHelper.getAStringFromUser();
        String s4 = ScannerHelper.getAStringFromUser();

        if(s3.length() < 2 || s4.length() < 2) System.out.println("VALID INPUT");
        else System.out.println(s3.substring(2,s3.length()-1).concat(s4.substring(2,s4.length()-1)));


        System.out.println("____Task6____");

        String ss = ScannerHelper.getAStringFromUser();

        if(ss.length() < 4) System.out.println("INVALID INPUT");
        else if(ss.startsWith("xx") && ss.endsWith("xx")) System.out.println("true");
        else System.out.println("false");

    }
}


