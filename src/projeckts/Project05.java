package projeckts;

import utilities.ScannerHelper;

import java.util.Locale;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("----TASK-1----");
        String s1 = ScannerHelper.getAStringFromUser();

        if (s1.length() < 8) {
            System.out.println("This String does not have 8 characters");
        } else System.out.println(s1.substring(s1.length() - 4) + s1.substring(4, 6) + s1.substring(0, 4));


        System.out.println("----TASK-2----");

        String s2 = ScannerHelper.getAStringFromUser();
        if (s2.trim().contains(" ")){
            System.out.println(s2.substring(s2.lastIndexOf(" ") + 1) +
                s2.substring(s2.indexOf(" "), s2.lastIndexOf(" ") + 1) +
                s2.substring(0, s2.indexOf(" ")));
        }
        else System.out.println("This sentence does not have 2 or more words to swap");


        System.out.println("----TASK-3----");

        String str1 = ScannerHelper.getAStringFromUser();

        System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));


        System.out.println("----TASK-4----");

        String name = ScannerHelper.getNameFromUser();

        if (name.length() < 2) System.out.println("Invalid input");
        else if (name.length() % 2 == 0) {
            System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
        } else System.out.println(name.charAt(name.length() / 2));


        System.out.println("----TASK-5----");

        String country = ScannerHelper.getAStringFromUser();

        if (country.length() < 5) System.out.println("Invalid input!!!");
        else System.out.println(country.substring(2, country.length() - 2));


        System.out.println("----TASK-6----");

        String address = ScannerHelper.getAStringFromUser();

        System.out.println(address.toLowerCase().replace('a', '*')
                .replace('e', '#')
                .replace('i', '+')
                .replace('u', '$')
                .replace('o', '@'));


        System.out.println("----TASK-7----");

        int num1 = (int) (Math.random() * 26);
        int num2 = (int) (Math.random() * 26);


        for (int i1 = Math.min(num1,num2); i1 < Math.max(num1, num2); i1++) {
            if (i1 % 5 != 0) {
                System.out.println(i1 + " - ");
            }
        }
    }
}