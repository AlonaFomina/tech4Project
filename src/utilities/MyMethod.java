package utilities;

public class MyMethod {
    //write method wich is gonna to find the max of 4 and print it

    public static void printmaxOfFour(int num1, int num2, int num3, int num4) {
        System.out.println(Math.max(Math.max(Math.max(num1, num2), num3), num4));
    }

    public static int maxOfFour(int num1, int num2, int num3, int num4) {
        return (int) Math.max(Math.max(Math.max(num1, num2), num3), num4);
    }

    public static void isNumBetween10and25(int num){
        //int r = RunderNumberGener.getRandomNumber(0, 50);

        System.out.println(num >= 10 && num <=25 );
    }

    public static boolean isEven(int number){
      return number % 2 == 0;//not odd
    }
    public static boolean isOdd(int num){
        return  num % 2 ==1;// odd





    }
}
