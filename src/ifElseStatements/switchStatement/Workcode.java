package ifElseStatements.switchStatement;

import java.util.Scanner;

public class Workcode {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        /* 1monday> black
        2tuesday > red
        3Wednesday > purple
        4Thursday > yellow
        5friday > orange

         */

        int day;
        String dayString;

        System.out.println("What day is it?");
        day = userInput.nextInt();

        switch (day){
            case 1 :
                System.out.println("Wear the black");dayString ="Wear the black";
                break;
            case 2 :
                System.out.println("wear the red");dayString = "wear the red";
                break;
                 case 3 :
                     System.out.println("Wear the purple");dayString = "Wear the purple";
               break;
               case 4 :
                        System.out.println("wear the yellow");dayString ="wear the yellow";break;
                        case 5:
                            System.out.println("wear the orange");dayString ="wear the orange";
                            break;
            case 6:
            case 7:
            default:
                System.out.println("This is not representative");
                        }
                    }
                }




