package StringMethod;

public class _09_trim {
    public static void main(String[] args) {
        /*
Method tak: remove white spaces from both ends of a String
- it is nonstatic , and we call with object name
- it is return type return a String
- It does not take any arguments

         */
        String s = " Hello World!!    ";

        System.out.println(s);
        System.out.println(s.length());
        String newS = s.trim();
        System.out.println(s.trim().length());
        System.out.println(newS);


        String str2 = "      Good       Morning";
        String str3 = str2.trim();

        System.out.println(str3);


    }
}
