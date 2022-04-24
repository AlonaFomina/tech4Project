package loops.doWhileLoop;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        Random random = new Random();
        boolean b = random.nextBoolean();;

        while (b) {
            System.out.println("it is true");
            b = random.nextBoolean();
        }
        System.out.println("end of the program");

        System.out.println("_---------------__--------____--------___-------");


        boolean b2 = false ;
        do{
            System.out.println("true");
        }
        while (b);
    }

}
