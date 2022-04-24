package homeworks;

import utilities.ScannerHelper;

public class Practice_01 {
    public static void main(String[] args) {
        System.out.println("-----Task -1-----");
        /*
        Assume that you are given a String as below;
String str = ”SDLC is step by step procedure to create an application”;
Write a program to find length of given String and the indexes of “SDLC” and “application” words
         */
        String sdlc = "SDLC is step by step procedure to create an application";

        System.out.println("length of given String is :"+ sdlc.length()+
                "\n The index of SDLC is :"+ sdlc.indexOf("SDLC") + "\nIndex of application is : " + sdlc.indexOf("application") );


        System.out.println("-----Task -2-----");
        /*
        Assume that you are given a String as below;
String str = “  I know how to code with Python  ”;
•
Write a program to manipulate given String and convert it to be:
“I KNOW HOW TO CODE WITH JAVA”
         */
        String str = " I know how to code with Python  ";

        System.out.println(str.trim().replace("Python","Java").toUpperCase());


        System.out.println("-----Task - 3-----");
        /*
         Assume that you are given a String as below;
String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
1.Find the first character of given String which is not white space
2.Find the last character of given String which is not white space
         */

        String str1 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();

        System.out.println("First char that is not space is = " + str1.charAt(0));
        System.out.println("Last char that is not space is = " + str1.charAt(str1.length()-1));


        System.out.println("-----Task - 4-----");

        /*
        Assume you are given 3 Strings as below;
String s1 = “  TECH ”;
String s2 = “ glo  ”;
String s3 = “ BAL       “;
Write a program that manipulates these 3 Strings and stores
them in a new String s4 and s4 will get value of “TechGlobal”
Note: The length of s4 will be 10 at the end!!!
         */

        String s1 = "  TECH ".trim();
        String s2 = " glo  ".trim();
        String s3 = " BAL       ".trim();

        System.out.println(s1.toLowerCase().replace("t", "T").concat(s2.replace("g", "G").concat(s3.toLowerCase())));


        System.out.println("-----Task - 5-----");

        /*
        Requirement:
Write a program that asks user to enter their favorite color.
Then, print the first and last characters of the color
Also, print the first and last 3 characters of the color
Test data:
green
Expected output:
1st character is = g
2nd character is = n
First 3 characters are = gre
Last 3 characters are = een
         */

        String n = ScannerHelper.getAStringFromUser();
        System.out.println("1st character is =" +n.charAt(0));
        System.out.println("2nd character is =" + n.charAt(1));
        System.out.println("2nd character is =" + n.substring(0,3));
        System.out.println("Last 3 characters are =" + n.substring(n.length()-3));



        System.out.println("-----Task - 6-----");
        /*
        Requirement:
Write a program that asks user to enter a full sentence
Then, convert all sentence to lower case and print the first and last words in the given sentence
Test data:
JavA is an object-oriented programming LanguAGE
Expected output:
1st word is = java
2nd word is = language
         */
        String sentence = ScannerHelper.getAStringFromUser().toLowerCase();

        System.out.println("1st word is =" + sentence.substring(0,sentence.indexOf(' ')));
        System.out.println("2nd word is =" + sentence.substring(sentence.lastIndexOf (' ' )+1));


        System.out.println("-----Task - 7-----");
        /* Write a program that asks user to enter a full sentence
Then, check if given sentence contains $ character
If it contains $ character, then find the index of the $ character and print a proper message for the found index
Test data 1:
I saved $100 to buy new airpods
Expected output 1:
This sentence contains $ character
$ character’s index is = 8
Test data 2:
I’ll become a Software Engineer in Test
Expected output 2:
This sentence does not contain $ character
*/



        String  dollar = ScannerHelper.getAStringFromUser();

        if (dollar.contains("$")){
            System.out.println("Contains $ character" + "\n$ character and print a proper message for the found index" + dollar.indexOf('$'));
        }
        else System.out.println("does not contains $ character");
    }
}
