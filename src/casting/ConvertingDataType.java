package casting;

public class ConvertingDataType {
    public static void main(String[] args) {
        String num1 = "23", num2= "25";

       int  num1Int = Integer.valueOf(num1);
       int num2Int = Integer.parseInt(num2);

       Integer num1Integer = Integer.valueOf(num1);// string - int -integer
       Integer num2Integer = Integer.parseInt(num2);// string -  Integer


        System.out.println("Average of two numbers = " +((num1Int + num2Int)/2));
        System.out.println("Average of Integer = " + ((num1Integer + num2Integer)/2));

        String save = "390" , day = "15.60";
        Double saveToDouble = Double.parseDouble(save);
        Double dayToDouble = Double.parseDouble(day);

        System.out.println((int)(saveToDouble/dayToDouble));






    }
}
