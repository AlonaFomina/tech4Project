package StringMethod;

public class _13_replace {
    public static void main(String[] args) {
        /*
        Method Task : it is used to replace some value in the string with another string
        - its replaces all of the occurrence
        -its non static
        - it is a returns type and return another string
        - its takes two arguments (char or string)
         */
        String name = "banana";
        System.out.println(name.replace('a','e'));

        String s1 = "canI can a can";
        System.out.println(s1.replace("can", "xxx"));

        String s2 = "hello";
        System.out.println(s2.replace("l", " "));

        String tg = "TechGlobal";
        System.out.println(tg.replace("abc", "xxx"));

        System.out.println(tg.replace("ec", "xx").replace("Gl", "yy"));

        System.out.println("Hello".replace("hello","nice"));// does not exist
    }
}
