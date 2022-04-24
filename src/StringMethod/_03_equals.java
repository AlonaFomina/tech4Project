package StringMethod;

public class _03_equals {
    public static void main(String[] args) {
        /*
 Method Task : It compares 2 Strings with each other , tells if it's equal or not
 - it is non-static and we called it with another String object
 - it is return type and returns a boolean
 - it is takes a string as an argument

         */
        System.out.println("Melda".equals("Melda"));// true
        System.out.println("Melda".equals("melda"));//false

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name2));

        System.out.println("\n ____________Practice___________\n");

        String str1 = "Hello", str2 = str1;
        boolean b = !(str1.equals(str2)); //false

        System.out.println(b);

        System.out.println(!"abc".concat("xyz").equals("abcx" + "yz"));

    }
}
