package interviewQuestions;

public class FibonacciRecursion {

    public static int fibonacci(int n){
        if(n <= 1)return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // 8 => 1, 1, 2, 3, 5, 8, 13, 21
        for (int i = 0; i < 9; i++) System.out.println(fibonacci(i));
    }
}
