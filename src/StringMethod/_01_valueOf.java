package StringMethod;

public class _01_valueOf {
    public static void main(String[] args) {
        /*
        Method Task : convert given variable to a String
        - it is static(u can call it with class name)
        - it is a return type and its return a String
        - it takes different arguments it is a overloaded methods and converts given args to a String
         */


        int i = 5;
        String num = String.valueOf(i);

        System.out.println(i+i);
        System.out.println(num+num);

    }

    public static class _07_indexOf_lastIndexOf {

        /*
        Method task:
        - used to find the index or last index of some char ot anothes string
        - there non-static method
        - called with another string object
        - they are return type , and they return int index
        - they take either string or char as an arguments

        Note: if the given char or string are not exist then its returns
        Note : if yuo are looking for index of string and its exist this will return first index of match

         */
        public static void main(String[] args) {


            String sentence = "I like Chicago and Miami more than any other cities";
            System.out.println(sentence.indexOf('C'));// 7
            System.out.println(sentence.indexOf('c'));//10

            System.out.println(sentence.lastIndexOf('c'));
            sentence.indexOf("Chicago");// 7
            sentence.indexOf("Miami");//19

            sentence.indexOf("chicago"); //-1

            sentence.indexOf('C', 50);
            sentence.indexOf('G');

        }
    }
}
