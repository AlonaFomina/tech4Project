package javaMemoryManagment;

public class JavaMemoryManagement {
    public static String reverse1(String s){
        StringBuilder r = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            r.append(s.charAt(i));
        }
        return r.toString();
    }

    public static String reverseS(String str){
        return new StringBuilder(str).reverse().toString();

    }

    public static boolean isPalindrome(String str){
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(reverseS("civic"));
        System.out.println(reverseS("daria"));

        System.out.println(isPalindrome("madaM"));//true
        System.out.println(isPalindrome("madam"));//true
        System.out.println(isPalindrome("123321"));//true
    }
}
