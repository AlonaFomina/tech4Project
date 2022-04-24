package homeworks;

import utilities.MathHelper;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("Task-1");


        int rand = (int) (Math.random() * 51);

        System.out.println(rand);
        MathHelper.isNum10to25(rand);

        //System.out.println((r >= 10 && r <= 25)
        //        ? "r is in between 10 and 25(included)"
        //        : "r is NOT in between 10 and 25(included)");


        System.out.println("Task-2");


        int n = (int) (Math.random() * 101);

        if (n >= 1 && n <= 25) {
            System.out.println(n + " is the1st half" +
                    n + "\n is the 1st quarter");
        } else if (n >= 25 && n <= 50) {
            System.out.println(n + " is the 2nd quarter");
        } else if (n >= 51 && n <= 75) {
            System.out.println(n + " is the 2nd half" +
                    n + "\n is the 3nd quarter");
        } else System.out.println(n + " is the 2nd half" +
                n + "\n is the 4th quarter");


        System.out.println("Task-3");

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter 5 numbers between 1 and 10 ");
        int n1 = inp.nextInt();
        int n2 = inp.nextInt();
        int n3 = inp.nextInt();
        int n4 = inp.nextInt();
        int n5 = inp.nextInt();


        if (1 <= n1 && n1 <= 10){
            System.out.println(n1 *= 5);}
        else if (!(1 <= n1 && n1 <= 10)){
            System.out.println(n1 *= 0);}

        if( 1 <= n2 && n2 <= 10) {
            System.out.println(n2 *= 4);}
        else if(!(1 <= n2 && n2 <= 10)){
            System.out.println(n2 *= 0);}
        if (1 <=n3 && n3 <= 10) {
            System.out.println(n3 *= 3);}
        else if(!(1 <= n3 && n3 <= 10)){
            System.out.println(n3 *= 0);}
        if(1 <= n4 && n4 <= 10) {
            System.out.println(n4 *= 2);}
        else if(!(1 <= n4 && n4 <= 10)){
            System.out.println(n4 *= 0);}
        if(1 <= n5 && n5 <= 10) {
            System.out.println(n5 *= 1);}
        else {
            System.out.println(n5 *= 0);}

        System.out.println(n1 + n2 + n3 + n4 + n5);

    }
}


