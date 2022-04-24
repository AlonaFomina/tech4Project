package StringMethod;

public class _08_length {
    public static void main(String[] args) {
        /*
        method Task : count total number of characters of the String and return it as an int
        - ins non-static(we didn't call class)
        - can be call with object
        - it is a return type method, and its return an int( total number of characters)
        - its does not take any arguments
        Note : it is like human thinking - hpw many

         */
        String city = "Chicago";

        System.out.println(city.length());
        System.out.println(city.length() + 3);

        String company = "TechGlobal";

        int size = company.length();

        System.out.println(size);

    }
}
