package operator.ShortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        1. create variables
        2. use shorthand
        print them

         */
        int a = 8, b = 3;

        System.out.println("a +=b   -> " + (a +=b));
        System.out.println("a -=b   -> " + (a -=b));
        System.out.println ("a *=7  ->" + (a *=7));
        System.out.println("(a /=b)  -> " + (a /=b));
        System.out.println("a %=5  ->" + (a %=5));

    }
}
