package StringMethod;

public class _10_substring {
    public static void main(String[] args) {
        /*
Method task : They are used to extract a subtracting from a larger string
- they are nonstatic , and we call it object
- they are return type ,and return other String
- There is 2 overloaded substring methods
1. substring(int beginIndex)
               -This method takes begin index as an argument, and it extracts a substring starting from given index
               to the end
            2. substring(int beginIndex, int endIndex)
               -This method will take 2 args to define which index to start and which index to stop to extract
               a substring
               NOTE: beginIndex is inclusive but endIndex is exclusive
               NOTE: if your beginIndex is equal to endIndex, then it will return empty string
               NOTE: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException



         */
        String result = " About 3,520,000,000 result (0.82 seconds)";

        String num = result.substring(6, 18);

        System.out.println(num);

        // use the substring to get (0.82 seconds)

        String num2 = result.substring (28);
        System.out.println(num2);

        System.out.println(result.substring(result.indexOf('(')));
        System.out.println(result.substring(result.lastIndexOf(' ') - 5));
        System.out.println(result.substring(result.length()-14));

        String name = "Lionel";

        System.out.println(name.substring(3, 4)); // "n" name.charAt(3)


    }
}
