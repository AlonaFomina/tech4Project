package scanneer;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args) {
        //dataType varibleName = data/value; -> Creating a verible
        //DataType/ClassName varibleName= new DataType/ClassName(if it needed);
        //Creating on object

    Scanner inputReader = new Scanner(System.in);

    System.out.println("Where is your address? ");
    String userAddres =  "\"" + inputReader.nextLine()+"\"";//veriableName.methodName();
        System.out.println("User address is =".concat(userAddres));

    }

}
