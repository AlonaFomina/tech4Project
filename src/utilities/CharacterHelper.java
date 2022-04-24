package utilities;

public class CharacterHelper {


    public static boolean isSpase(char spase) {
        return spase == ' ';
    }

    public static boolean isDigit(char digit) {
        return digit >= 48 && digit <= 57;
    }

    public static boolean isUppercase(char upper) {
        return upper >= 65 && upper <= 90;
    }

    public static boolean isLowercase(char lower) {
        return lower >= 97 && lower <= 122;
    }
    public static boolean isLetter(char letter) {
        return isLowercase(letter) || isUppercase(letter);
    }
    public static boolean isVowel(char vowel) {
        return vowel == 'A' || vowel == 'E' || vowel == 'O' || vowel == 'U' || vowel == 'I'
                || vowel == 'a' || vowel == 'e'|| vowel == 'o' || vowel == 'u' || vowel == 'i';
    }

    public static boolean isConsonant( char consonant){
        return isLowercase(consonant) || isUppercase(consonant)
                && consonant != 65 && consonant != 69 && consonant !=73 && consonant != 79  && consonant != 85
                && consonant != 97  && consonant != 101 && consonant != 105  && consonant != 111 && consonant != 117;
    }
}
