package operator.ReletionaOperator;

public class reletionalOperator {
    public static void main(String[] args) {
        int a = 4, b = 10, x = 3, y = 5 , z = 9;
        boolean bool = x + y == --z;
        bool = x + y + 1 == z ;
        boolean isAEqualToB = a == b , isANotEqualToB = a != b , isASmallerThanB = a < b , isAGreaterThanB = a > b, isASmallerOrEqualThanB = a <= b ,isABiggerOrEqualThanB = a >= b;

        System.out.println(" Naim's question: " + (y == --z));
        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB);
        System.out.println(" a > b : " + isAGreaterThanB);
        System.out.println(" a < b : "+ isASmallerThanB);
        System.out.println(" a <= b : " + isASmallerOrEqualThanB);
        System.out.println(" a>= b : " + isABiggerOrEqualThanB);




    }

}
