package ifElseStatements.ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {
        int n1 =(int) (Math.random()*(10 - (-10) + 1) + (-10));
        System.out.println(n1);

        if (n1 > 0){
            System.out.println(n1 + " positive");
        }
        else if( n1 < 0){
            System.out.println(n1 + " negative");
        }
        else {
            System.out.println(n1 + " = 0");
        }
    }
}
