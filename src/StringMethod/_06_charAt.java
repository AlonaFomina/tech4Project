package StringMethod;

public class _06_charAt {
    public static void main(String[] args) {
/*

 */
        String name = " John";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));


        char firstChar = name.charAt(0);
        if (firstChar == 'A' || firstChar== 'a') System.out.println("Starts with A");
        else System.out.println("this name not starts with A");

    }
}
