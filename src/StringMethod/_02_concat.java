package StringMethod;

public class _02_concat {
    public static void main(String[] args) {
        /*
        Method Task : It is used to combine multiple Strings , and form a new one
        - we didn't call a class so its non - static, and we can call it with an object name
        - it is return type / its come with a result combination with the others
        - its takes string as an arguments
         */

        String s1 = "Tech";
        String s2 = "Global";
        String s3 = s1.concat(s2); // String s3 = s1 + s2

        System.out.println(s3.concat(" School")); // TechGlobal School

        System.out.println("Hello".concat(" World!")); // Hello World

        System.out.println("Hello".concat((" ").concat("World!"))); // Hello World

        System.out.println("Hello".concat(" ") + "World!"); //Hello World!

    }
}
