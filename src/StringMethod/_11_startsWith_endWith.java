package StringMethod;

public class _11_startsWith_endWith {
    public static void main(String[] args) {
        /*
        method task: used to find out is string starts with or ends with another letter or a string
        - nonstatic, we called it with objects
        - its returns boolean
        - they take string as an object

         */
        String str = "Today is Sunday";
        System.out.println(str.startsWith("Today"));// true
        System.out.println(str.startsWith("today")); // false
        System.out.println(str.endsWith("day"));// true

        System.out.println(str.toUpperCase().endsWith("SUNDAY"));// true
        System.out.println(str.startsWith("is" , 6));// true

        //System.out.println("Hello".startsWith('H')); // compiler error
    }
}
