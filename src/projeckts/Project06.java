package projeckts;

import utilities.ScannerHelper;

public class Project06 {
    public static void main(String[] args) {


        System.out.println("________Task-1________");

        int cont = 0;
        String sentence = ScannerHelper.getAStringFromUser();

        if (sentence.trim().contains(" ")) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    cont++;

                }
            }
            System.out.println("This sentence has " + (cont + 1) + " words.");
        } else System.out.println("This sentence does not have multiple words");


        System.out.println("________Task-2________");

        String str = ScannerHelper.getAStringFromUser();
        if (str.length() < 1) System.out.println("This word does not have 1 or more characters");
        else {
            String rStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rStr += str.charAt(i);
            }

            System.out.println((str.equals(rStr)) ?
                    "This is palindrome" :
                    "This is not palindrome");
        }


        System.out.println("________Task-3________");

        int a = 0;
        String sent = ScannerHelper.getAStringFromUser();
        if ((sent.length() < 1)) System.out.println("This sentence does not have any characters");
        else {
            for (int i = 0; i < sent.length(); i++) {
                if (sent.toLowerCase().charAt(i) == 'a') a++;
            }
            System.out.println("This sentence has " + a + " a or A letters");
        }



        System.out.println("________Task-4________");

        int num = ScannerHelper.getNumberFromUser();

        for (int i = 0; i <= num; i++) {
            if( i % 3 == 0 && i % 2 == 0 ) System.out.println("FooBar");
            else if (i % 3 == 0 ) System.out.println("Bar");
            else if (i % 2 == 0 ) System.out.println("Foo");
            else System.out.println(i);;

        }

    }
}
