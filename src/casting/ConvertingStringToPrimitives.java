package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {
        String num1 = "23";
        String num2 = "12";
         int num1Int = Integer.parseInt(num1 + num2);
         int num2Int =Integer.parseInt(num2);
        System.out.println(num1Int);// string to int
        System.out.println(num2Int);// return primitives

        Integer num1Intenger = Integer.valueOf(num1);//retirn a class
        Integer num12ntenger = Integer.valueOf(num2);
        System.out.println(num1Intenger + num12ntenger);

        int num1IntValuoOf = Integer.valueOf(num1);// string converted do Integer and then Int



    }
}
