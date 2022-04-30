package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practices_01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date currentDate = new Date();

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your year of the birth ");

        System.out.println("User's age = "  + (Integer.parseInt(new SimpleDateFormat("yyyy").format(currentDate)) - userInput.nextInt()));

    }
}
