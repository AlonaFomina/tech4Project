package utilities;

public class MathHelper {
    //create a method that takes 3 ints and return the max

    public static int maxOfThree(int n1, int n2, int n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    public static double maxOfThree(double n1, double n2, double n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    public static double maxOfThree(double n2, byte n3) {
        return Math.max(n2, n3);
    }

    public static byte maxOfThree(byte n1, byte n2, byte n3) {
        return (byte) Math.max(n1, Math.max(n2, n3));
    }
    public static boolean isEven(int num){
        return num %2 ==0 ;
    }
    public static boolean isOdd(int num){
        return num%2==1;
    }
    public static boolean isPositive(int num){
        return num>0;
    }
    public static boolean isNegative(int num){
        return num<0;
    }
    public static boolean isZero(int num){
        return num==0;
    }
    public static  void isNum10to25( int num1){
        if (num1 >= 10 && num1 <= 25 ){
            System.out.println(true);
        }
        else System.out.println(false);


    }
}



