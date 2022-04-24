package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("____Task1____");

        String name = ScannerHelper.getNameFromUser();

        System.out.println("The length of the name is = " + name.length() +
                "\nThe first character in the name is = " + name.charAt(0) +
                "\nThe last character in the name is = " + name.charAt(name.length() - 1) +
                "\nThe first 3 characters in the name are = " + name.substring(0, 3) +
                "\nThe last 3 characters in the name are = " + name.substring(name.length() - 3));

        if (name.toLowerCase().startsWith("a")) {
            System.out.println("You are in the club!");
        } else System.out.println("Sorry, you are not in the club");

        System.out.println("____Task2____");

        String address = ScannerHelper.getAStringFromUser();

        if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");

        System.out.println("____Task3____");

        String colour = ScannerHelper.getAStringFromUser();
        if (colour.toLowerCase().contains("green") && colour.toLowerCase().contains("red")) System.out.println("Green and red are in the list");
        else if (colour.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else if (colour.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");

        System.out.println("____Task4____");

        String str = "   Java is FUN   ";
        str = str.trim();
        String str1 = str.substring(0,str.indexOf(" "));
        String str2 = str.substring(str.indexOf( " ") +1 , str.lastIndexOf(" "));
        String str3 = str.substring(str.lastIndexOf(" ") + 1);

        System.out.println("The first word in the str is = " + str1 +
                "\nThe second word in the str is = " + str2 +
                "\nThe third word in the str is = " + str3);

    }
}