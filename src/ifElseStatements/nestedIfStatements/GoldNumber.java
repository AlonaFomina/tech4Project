package ifElseStatements.nestedIfStatements;

import java.util.Scanner;

public class GoldNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        /*
Write a program that generates a random number bt -50 and 50
if number is positive, then we will win 10 points
if number is more than 25, then we will win extra 10 points
if number is -7, then we will win extra 10 points
lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
*/
        int num = (int) (Math.random()* (50 -(-50) +1) + (-50));
        int point = 0;
        System.out.println(num + " is a number");

        if (num < 0){
            point+=10;
           // System.out.println(point);
            if (num == -7){
                point += 10;
               // System.out.println(point);
            }
        }

        if (num>0){
            point += 10;
           // System.out.println(point);
            if(num > 25){
                point += 10;
                //System.out.println(point);
                    if(num == 7){
                       point +=100;
                       // System.out.println(point);
                    }
                }
            }
        System.out.println(point + " you won points");
        }
    }

