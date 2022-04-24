package ifElseStatements;

public class findGreatest {
    public static void main(String[] args) {
        int num1 = (int )(Math.random()*(10 - 0 + 1) + (0));
        int num2 = (int )(Math.random()*(10 - 0 + 1) + (0));

        System.out.println(num1);
        System.out.println(num2);
        //System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + Math.max(num1, num2));

        /*if (num1 >= num2){
            System.out.println("Greater is " + num1);
        }
        else {
            System.out.println("Greater is " + num2);
        }*/

        //Shortcut -> ONLY ONE STATEMENT
        if (num1 >= num2)System.out.println("Greater is " + num1);
        else System.out.println("Greater is " + num2);
    }
}
