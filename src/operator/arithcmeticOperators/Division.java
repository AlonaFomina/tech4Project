package operator.arithcmeticOperators;

public class Division {
    public static void main(String[] args) {

        {

            double number1 = 5, number2 = 3,  num1 = 15, num2 = 3;
                    number1 = 5;
            double rem = number1 % number2;// 5 - (3 * 1) = 2
            int num3 = 4, num4=10;

            double division = num1 / num2, divisionByInt = num1 / num3, divisionByDouble = num4 / num2;


            //addition
             double sum = number1 + number2;//8

            //subtraction
            double sub = number1- number2;//2

            //multiplication
            double times = number1 * number2;//15

            //division
            double div = number1/ number2;

            //reminder


            System.out.println("Addition = " + sum);
            System.out.println("Subtraction is =" + sub);
            System.out.println("Multiplication = " + times);
            System.out.println("Division = " + div);
            System.out.println("Reminder = " + rem);
            System.out.println("num1/num2 = " + (num1 / num2));
            System.out.println("num1/num3 = " + (num1/ num3));
            System.out.println("num4/num2 = " + (num4 / num2));
            System.out.println("num1/num2 = " + (15.0 / 3.0));
            System.out.println("num1/num3 = " + (num1/ num3));
            System.out.println("num4/num2 = " + (num4 / num2));

        }

    }
}
