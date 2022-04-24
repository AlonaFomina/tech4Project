package StringMethod;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a string");
        String s1 = userInput.nextLine();
        String s2 = userInput.nextLine();

        if(!(s1.equals(s2))){
            System.out.println("These string is not equal");
        }

        System.out.println("Please enter a string");
        String ss=userInput.nextLine();
        String sss = userInput.nextLine();
       if (ss.equals(sss)){
           System.out.println("These string is equal");
       }

       //2nd way
        String str1 = ScannerHelper.getAStringFromUser();
        String str2 = ScannerHelper.getAStringFromUser();

        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ? "These string are equal" : "These string are not equal");
    }
}
