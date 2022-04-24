package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {
       Math.max(5,Math.max(1,5));

       int max = MathHelper.maxOfThree(5,1,5);
        System.out.println("Max of three number is = " + max);

        System.out.println( MathHelper.maxOfThree(1.2,4.5,3.5));





    }
}
