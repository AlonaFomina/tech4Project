package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {
        /*
        write the program Asks user for 5 of their grades and  avg
         */
        Scanner userInput = new Scanner(System.in);

        System.out.println(
                "Average grade is = " +
                        (Integer.valueOf(userInput.next()) + Integer.valueOf(userInput.next()) + Integer.valueOf(userInput.next())
                                +Integer.valueOf(userInput.next()) + Integer.valueOf(userInput.next())) /5
        );
       /* Scanner userIn = new Scanner(System.in);
        String fullName = userIn.nextLine(), phon = userIn.nextLine(), age = userInput.next();

        System.out.println("ege of kids");
        String age1 = userInput.nextLine(), age2 = userIn.nextLine(), age3 = userIn.nextLine();

        Integer a1 = Integer.valueOf(age1), a2= Integer.valueOf(age2), a3 = Integer.valueOf(age3);
        userInput.nextLine();


         System.out.println("Your name is " + fullName + " , your phone number is " + phon
                 + " You are " +  age + " years old, your oldest kid is " +  Math.max(Math.max(a1,a2),a3)
                 + " years old, You \nyangest is" + Math.min(Math.min(a1,a2),a3)
                 +", difference between oldest and yangest is "
                 + Math.abs(Math.max(Math.max(a1,a2),a3) - Math.min(Math.min(a1,a2),a3))
                 +"years");*/





      ;


    }
}
