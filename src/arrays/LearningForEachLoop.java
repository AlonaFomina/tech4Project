package arrays;

public class LearningForEachLoop {
    public static void main(String[] args) {

        System.out.println("__________________________________________________");
        char[] chars = {'a',' ', ',', '#','@', '$'};

        System.out.println(chars.length);
        System.out.println("Element 1 = " + chars[0]);
        System.out.println("Element 2 = " + chars[1]);
        System.out.println("Element 3 = " + chars[2]);
        System.out.println("Element 4 = " + chars[3]);
        System.out.println("Element 5 = " + chars[4]);
        System.out.println("Element 6 = " + chars[5]);


        System.out.println("__________________________________________________");

        for (int i = 0; i < chars.length; i++) {
            System.out.println("Element is = " +chars[i]);
        }


        System.out.println("__________________________________________________");

        for (char element :
            chars ) {
            System.out.println("ELEMENT = " + element);

        }
    }
}
