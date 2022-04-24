package utilities;

public class FavStudents {


    public static void printChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void checkVowel(String s) {

        //String nonVowel = "";
        for (int i = 0; i < s.length(); i++) {
            //if it is not vowel at that char
            if (!CharacterHelper.isVowel(s.charAt(i))) {
//              nonVowel += s.charAt(i);
                System.out.print(s.charAt(i));
            }
        }

        // System.out.println(nonVowel);
    }

    public static int charNumbers(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (CharacterHelper.isVowel(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int numFromString(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (CharacterHelper.isDigit(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}


