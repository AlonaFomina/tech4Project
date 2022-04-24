package swichStatement;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Hello, tell me the greeting :");
        String greeting = user.nextLine();
        //String greeting = "good morning";

        switch (greeting){
            case "good morning":
                System.out.println("It is morning");
                break;
            case "good afternoon":
                System.out.println("Afternoon");
                break;
            case "good evening":
                System.out.println("evening");
                break; default:
                System.out.println("learn more English");
        }
    }
}
