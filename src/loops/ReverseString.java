package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Write a program that reads a name from user
Reverse the name and print it back

         */

        String name = ScannerHelper.getNameFromUser();
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.print("The reserve name is " + reverse);
        System.out.print("\nThe reverse to uppercase = " + reverse.toUpperCase());


        for (int i = 0; i <=10; i++){
            if(i == 9) System.out.println(i);
            else System.out.println(i + " - ");

            //
        }
    }
}
