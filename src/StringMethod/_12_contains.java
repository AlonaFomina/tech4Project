package StringMethod;

import utilities.ScannerHelper;

import java.util.Locale;

public class _12_contains {
    public static void main(String[] args) {
        /*
Method task : it is used to find out if if string contains another string or letter or the character
- it us nonstatic and we can coll it with an object
- it is return type and return boolean
- its take String argument
         */
        String str = "Tech Global";

        System.out.println(str.contains("T"));
        System.out.println(str.contains(" "));
        System.out.println(str.contains("123"));
        System.out.println(str.contains("s"));

        String address = ScannerHelper.getAStringFromUser();

        if (address.toLowerCase().contains("chicago"))System.out.println("You are in the club");
        else System.out.println("You are not in the club");

        System.out.println(address.toLowerCase().contains("chicago")? "You are in the club" :"You are not in the club");
    }
}
