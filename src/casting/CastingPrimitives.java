package casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        /*
        double -> float -> long -> int -> char -> short -> byte
         */

        int myInt = 32;
        long myLong = myInt; // implicit casting

        myInt = (int) myLong; // explicit casting

        int mySecondInt = 'B'; // implicit casting
        char myChar = (char) 56; // dont have to cast it
        char mySecondChar = 56;

        int myThirdInt = (int) 45.4;
        short myShort = (short) myChar;
        char myThirdChar = (char) myChar;

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        byte num1 =45;
        int num2 = (int) num1;// implicit

        double num3 = 13.6;
        float num4 = (float) num3;
        int num5 = 45;
        short num6 = 34;
        char c = (char)num5;// have to cast for both cuz char should be positive
        c= (char) num6;

        int num = 36;
        String num1Str = 45 + "" + num;
        String num2Str = String.valueOf(num) + String.valueOf(45);

        System.out.println("num1Str" + num1Str);
        System.out.println("num2Str" + num2Str);












    }
}
