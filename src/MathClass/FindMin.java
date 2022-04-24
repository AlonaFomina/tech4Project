package MathClass;

public class FindMin {
    public static void main(String[] args) {
        int x = 45,  y = 12, z = 65, a = 123,  b = - 123;

        int minOfXY = Math.min (x , y);
        int minOfZA = Math.min(z , a);
        int minOfZAB = Math.min( minOfZA , b);
        int minOfEvery = Math.min(minOfZAB, minOfXY);


        System.out.println(minOfXY);
        System.out.println(minOfZA);
        System.out.println(minOfZAB);
        System.out.println(minOfEvery);
    }
}
