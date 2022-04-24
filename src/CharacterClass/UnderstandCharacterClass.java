package CharacterClass;

public class UnderstandCharacterClass {
    public static void main(String[] args) {

        boolean e = Character.isDigit('9');// true

        System.out.println(e);// true

        System.out.println(Character.isDigit('9'));// true

        System.out.println(Character.isUpperCase('a'));//false
        System.out.println(Character.isUpperCase('B'));// true

        System.out.println(Character.isLowerCase('G'));//false
        System.out.println(Character.isLowerCase('h'));//true

        System.out.println(Character.isLetter('l'));
        System.out.println(Character.isLetterOrDigit('l'));
        System.out.println(Character.isLetterOrDigit(' '));

        System.out.println(Character.isWhitespace(' '));//true
        System.out.println(Character.isSpaceChar(' '));// true



        char c2 = '-';

        System.out.println(!Character.isLetterOrDigit(c2) && !Character.isSpaceChar(c2)); //true

        char c3 = 'A';

        String s = "AEQUiaeiou";

        System.out.println(s.contains((c3 + "")));//true

        char c4 = 'a';

       boolean isc4Vowel = false;

        for (int i = 0; i <s.length() ; i++) {
             if (s.charAt(i) == c4)
            isc4Vowel = true;
             break;
        }
        if (isc4Vowel) System.out.println("c4 is Vowel");
        else System.out.println("c4 is not vowel");
    }
}
