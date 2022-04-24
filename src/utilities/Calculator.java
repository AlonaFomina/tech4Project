package utilities;

public class Calculator {
    /*
    what do we need to create helper
    1. Proper name.
    2. Decide its accessibility level(public)
    3.decide its accessibility way(you want to call it with the class name or objeckt)
    static -> u want to call it with class name
    non-static -> u want to call object name
    Defining accessibility of the method
    public -> everywhere in project
    private -> only in the same class
    default -> only in the same package
    protected


   //deciding method to be static or non-static
   with class name  -> static method * Math.max(),print(), println;
   with object -> non static * Scanner.
   if it returns -> decide what it returns
   if it not returns -> put void

   Note : if method return int then variable used  next must be in Int
   note : every method must have a body that runs a task

   note: we can have multiple  methods sharing same name in the same class only if they have differenr argu,ents

   Note: if your method  not void meaning that its returning something
   u must use keyword in the body of the method
     */


    public static int divide(int num1, int num2) { // 15,2 -> 7
        return num1 / num2;

    }

    public static double divide(double num1, double num2) {

        return num1 / num2;

        /*
        //Create a method that finds the sum of 2 int numbers and returns it
//Create a method that finds the sum of 2 double numbers and returns it
//Create a method that finds the absolute difference of 2 int numbers and returns it
//Create a method that finds the absolute difference of 2 double numbers and returns it
//Create a method that finds the product of 2 int numbers and returns it
//Create a method that finds the product of 2 double numbers and returns it
         */
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;

    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int difference(int num1, int num2) {
        //return num1 - num2;
        if (num1 > num2) {
            return num1 - num2;
        } else if (num2 > num1) {
            return num2 - num1;

        }
        return 0;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static double product(double num1, double num2) {
        return num1 * num2;
    }

    public static int getRandomNumber(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }
}

