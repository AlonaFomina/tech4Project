package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Task-1

        int num1,num2,num3,num4;

        num1 =(int) (Math.random()*(10-0+1) + 0);
        num2 =(int) (Math.random()*(10-0+1) + 0);
        num3 =(int) (Math.random()*(10-0+1) + 0);
        num4 =(int) (Math.random()*(10-0+1) + 0);

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);

        System.out.println("Absolute difference of " + num1 + " with 5 is = " + (5 - num1));
        System.out.println("Absolute difference of " + num2 + " with 5 is = " + (5 - num2));
        System.out.println("Absolute difference of " + num3 + " with 5 is = " + (5 - num3));
        System.out.println("Absolute difference of " + num4 + " with 5 is = " + (5 - num4));

        System.out.println("Greatest number is = " + Math.max (Math.max (Math.max(1,2),3),4));
        System.out.println("Smallest number is = " + Math.min (Math.min (Math.min(1,2),3),4));

        //Task-2

        int n1,n2,n3,n4,n5,n6,n7,n8;

        n1 = (int) (Math.random()* (50 - (-50) + 1) + (-50));
        n2 = (int) (Math.random()* (50 - (-50) + 1) + (-50));
        n3 = (int) (Math.random()* (50 - (-50) + 1) + (-50));
        n4 = (int) (Math.random()* (50 - (-50) + 1) + (-50));
        n5 = (int) (Math.random()* (50 - (-50) + 1) + (-50));
        n6 = (int) (Math.random()* (50 - (-50) + 1) + (-50));
        n7 = (int) (Math.random()* (50 - (-50) + 1) + (-50));
        n8 = (int) (Math.random()* (50 - (-50) + 1) + (-50));

        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);
        System.out.println("Number 3 = " + n3);
        System.out.println("Number 4 = " + n4);
        System.out.println("Number 5 = " + n5);
        System.out.println("Number 6 = " + n6);
        System.out.println("Number 7 = " + n7);
        System.out.println("Number 8 = " + n8);

        int max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(n1 ,n2),n3),n4),n5),n6),n7),n8);
        int min = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(n1,n2),n3),n4),n5),n6),n7),n8);


        System.out.println("Greatest number is = " + max);
        System.out.println("Smallest number is = " + min);
        System.out.println("Average of 8 numbers is = " + (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8) / 8);
        System.out.println("Absolute difference between smallest and greatest is = " + (max - min));


        if (n3 >= 0)System.out.println("3rd number is positive = true" );
        else System.out.println("thirt nubmer is = false" );
        if (n5 < 0) System.out.println("5th number is negative = true");
        else System.out.println("5th number is negative = false");
        if(n1 == 0 || n2 ==0 || n3 == 0 || n4 == 0 || n5 == 0 || n6 == 0 || n7 == 0 || n8 == 0) {
            System.out.println("There is at least one zero among those numbers is = false " );
        }

        //Task-3

        int n11,n22,n33,n44,n55,n66,n77;

        System.out.println("Print 7 numbers : ");
        n11 = userInput.nextInt();
        n22 = userInput.nextInt();
        n33 = userInput.nextInt();
        n44 = userInput.nextInt();
        n55 = userInput.nextInt();
        n66 = userInput.nextInt();
        n77 = userInput.nextInt();

        int maxn = (int) Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(n11,n22),n33),n44),n55),n66),n77);
        int smal = (int) Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(n11,n22),n33),n44),n55),n66),n77);

        System.out.println("Greatest number is = " + maxn);
        System.out.println("Smallest number is = " + smal);
        System.out.println("Average of 7 numbers is = " + (n11 + n22 + n33 + n44 + n55 + n66 + n77)/7);

        if (n11 >= 10) System.out.println("First number is greater than or equal to 10 = true");
        else System.out.println("First number is greater than or equal to 10 = false");
        if (n77 <= 40) System.out.println("Last number is less than or equal to 40 = true");
        else System.out.println("Last number is less than or equal to 40 = false");


       if(n11== 0 || n11 == 50)System.out.println("At least one of those numbers is 0 or 50  = true");
       else if(n22== 0 || n22 == 50)System.out.println("At least one of those numbers is 0 or 50  = true");
       else if (n33== 0 || n33 == 50)System.out.println("At least one of those numbers is 0 or 50  = true");
       else if (n44== 0 || n44 == 50)System.out.println("At least one of those numbers is 0 or 50  = true");
       else if (n55== 0 || n55 == 50)System.out.println("At least one of those numbers is 0 or 50  = true");
       else if (n66== 0 || n66 == 50)System.out.println("At least one of those numbers is 0 or 50  = true");
       else if (n77== 0 || n77 == 50)System.out.println("At least one of those numbers is 0 or 50  = true");
       else System.out.println("At least one of those numbers is 0 or 50  = false");


        if (n11>=40 && n11 <=50) System.out.println("There is no number between 40 and 50 = true");
        else if (n22>=40 || n22 <=50) System.out.println("There is no number between 40 and 50 = true");
        else if (n33>=40 || n33 <=50) System.out.println("There is no number between 40 and 50 = true");
        else if (n44>=40 || n44 <=50) System.out.println("There is no number between 40 and 50 = true");
        else if (n55>=40 || n55 <=50) System.out.println("There is no number between 40 and 50 = true");
        else if (n66>=40 || n66 <=50) System.out.println("There is no number between 40 and 50 = true");
        else if (n77>=40 || n77 <=50) System.out.println("There is no number between 40 and 50 = true");
        else System.out.println("There is no number between 40 and 50 = false");

        //Task=4

        int a,b,c;
        a = (int) (Math.random()* (100 - 0 + 1) + (0));
        b = (int) (Math.random()* (100 - 0 + 1) + (0));
        c = (int) (Math.random()* (100 - 0 + 1) + (0));

        System.out.println(a+ " " + b + " " + c);

        if (a > 25 || b > 25 || c > 25) System.out.println("All numbers greater than 25");
        else System.out.println("all numbers less than 25");

        //Task-5

        int day;

        System.out.println("What is the day number today? ");
        day = userInput.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                    System.out.println("Friday");
                    break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("This is not representative");}

        //Task-6

        int num;

        System.out.println("Please enter number between (-10) to 10");
        num = userInput.nextInt();

        if (num > 0) System.out.println("Number entered is POSITIVE”");
        else System.out.println("“Number entered is NEGATIVE”");

        if(num == 0) System.out.println("Number entered is ZERO");
        if (num %2 == 0) System.out.println("Number entered is EVEN");
        else System.out.println("Number entered is ODD");

        //Task-7

        int exam1,exam2,exam3;

        System.out.println("Tell me your exam results? ");
        exam1 = userInput.nextInt();
        exam2 = userInput.nextInt();
        exam3 = userInput.nextInt();

        if ((exam1 + exam2 + exam3)/3 < 70) System.out.println("YOU FAILED!");
        else System.out.println("YOU PASSED!");

        //Task-8

        int x,y,z;

        System.out.println("Enter 3 numbers ");
        x = userInput.nextInt();
        y = userInput.nextInt();
        z = userInput.nextInt();

        if (x == y && y == z && z == x) System.out.println("TRIPLE  MATCH");
        else if (x == y || y == z || z == x) System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");

    }
}
