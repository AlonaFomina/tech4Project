package myFirstDay;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

public class CallClass {
    public static void main(String[] args) {
        int n = ScannerHelper.getNumberFromUser();

        System.out.println(n);

        double n1 = ScannerHelper.getDoubleFromUser();

        System.out.println(n1);

        int n3 = ScannerHelper.getNumWithMessage("Enter num from 5-10");

        System.out.println(n3);

        int n4 = ScannerHelper.getNumFrom1to10( " enter num from 1 to 10");
        System.out.println(n4);


    }
}
