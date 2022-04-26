package recusion;

public class _02_productOfNumbers {
    public static int recursiveProduct(int n){

        if(n > 1) return n * recursiveProduct(n-1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(recursiveProduct(-7));
    }
}
