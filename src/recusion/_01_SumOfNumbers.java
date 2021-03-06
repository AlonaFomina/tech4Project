package recusion;

public class _01_SumOfNumbers {
    /*
Write a method that finds the sum of the numbers from 1-n
Both 1 and n are included
Method must be return type and static

n=5
1+2+3+4+5 = 15

n=7
1+2+3+4+5+6+7 = 28
 */

    public static int recursiveSum(int n) {

        if (n > 0) return n + recursiveSum(n - 1);
        return 0;
    }

    public static int sum1toEnd(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printUntil100(int n) {

        if (n < 101){
            System.out.println(n);
            printUntil100(n + 1);
        }
    }

    public static void main(String[] args) {
//        System.out.println(sum1toEnd(7));
//        System.out.println(recursiveSum(5));
        printUntil100(1);
    }
}
