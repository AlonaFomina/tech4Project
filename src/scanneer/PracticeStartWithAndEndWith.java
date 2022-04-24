package scanneer;

import utilities.ScannerHelper;

import java.util.Locale;

public class PracticeStartWithAndEndWith {
    public static void main(String[] args) {
        String name = ScannerHelper.getAStringFromUser();

       /* if (name.startsWith("a") || name.startsWith("A")) {
            System.out.println("You are in the club A");
        }
        else System.out.println("You are not  in the club A");

        */
        //if (name.toUpperCase().startsWith("A")){
       //     System.out.println("You are in the club A");
       // }
       // else System.out.println("You are not  in the club A");

        if(name.charAt(0) == 65 || name.charAt(0) == 97){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        if(name.toUpperCase().charAt(0) == 65){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name.toLowerCase().charAt(0) == 97){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        System.out.println(name.toLowerCase().startsWith("a") ? "You are in the club A" : "You are not in the club A");
    }
}
