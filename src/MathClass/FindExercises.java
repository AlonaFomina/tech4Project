package MathClass;

import java.util.Scanner;

public class FindExercises {
    public static void main(String[] args) {
       // int x = 4 ,y = 67 ,z = -54 ;
       // int minXY = Math. min(x,y), minXYZ =  Math.min(minXY,z);
       // int maxXY = Math.max(x,y), maxXYZ = Math.max(maxXY,z);

        //System.out.println(minXYZ);
       // System.out.println(maxXYZ);
        //Math.max(x,y);Math.min(x,y);

       // System.out.println (Math.max(Math.max(x,y),z));
       // System.out.println(Math.min(Math.min(x,y),z));

        System.out.println(Math.max(Math.max(4, 56),23));
        Scanner input =  new Scanner(System.in);

        System.out.println("Put 4 numbers : ");
        System.out.println(" Max of given numbers is : " + Math.max(( Math.max(Math.max(input.nextInt(), input.nextInt()), input.nextInt())),input.nextInt()));

        System.out.println("Put 4 numbers : ");
        System.out.println(" MIn of given numbers is : " + Math.min(( Math.min(Math.min(input.nextInt(), input.nextInt()), input.nextInt())),input.nextInt()));

        //get a random betweem 15-30






    }
}
