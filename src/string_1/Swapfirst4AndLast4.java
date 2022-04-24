package string_1;

import utilities.ScannerHelper;

public class Swapfirst4AndLast4 {
    public static void main(String[] args) {
        String s = ScannerHelper.getAStringFromUser();

        if (s.length() < 8) System.out.println("This String does not have 8 characters");

        else {

            String first4 = s.substring(0, 4);
            String middle = s.substring(4, s.length() - 4);
            String last4 = s.substring(s.length() - 4);
            System.out.println(last4 + middle + first4);

        }
    }
}
