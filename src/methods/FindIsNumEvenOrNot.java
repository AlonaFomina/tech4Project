package methods;

import utilities.MathHelper;
import utilities.MyMethod;
import utilities.RunderNumberGener;

public class FindIsNumEvenOrNot {
    public static void main(String[] args) {
        int n1= RunderNumberGener.getRandomNumber(17,33);

        System.out.println( "The number generator is = " + n1);
       // if ( RunderNumberGener.getRandomNumber(17,33) % 2 == 0) System.out.println("even");
      //  else System.out.println("odd");
        if (MyMethod.isEven(n1)){
            System.out.println("Even");
        }
        else System.out.println("Odd");
    }
}

