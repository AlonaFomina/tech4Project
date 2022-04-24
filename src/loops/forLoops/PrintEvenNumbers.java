package loops.forLoops;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        System.out.println("-----1-st-way-----");
        for (int i = 0; i <= 10; i++){
            if (i%2==0) System.out.println(i);
        }

        System.out.println("-----2-st-way-----");
        for (int i = 0; i <= 10; i++){
            if(MathHelper.isEven(i)) System.out.println(i);
        }

        System.out.println("-----3-st-way-----");
        for (int i = 0; i <= 10; i+=2){// be cerafue with start point
            System.out.println(i);
        }

        System.out.println("-----4-st-way-----");
        for (int i = 0; i <= 10; i++){
            System.out.println(i++);
        }


    }
}
