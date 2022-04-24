package CharacterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {
        //Write a program that counts spaces for below String

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int counter = 0;
        for (int i = 0; i <= address.length() - 1; i++) {
            if (Character.isSpaceChar(address.charAt(i))) counter++;
        }
        System.out.println(counter);


        System.out.println("-----------------------------------------------------------");
        /*
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
         */
        int counter1 = 0;
        for (int i = 0; i <= address.length() - 1; i++) {
            if (Character.isLetter(address.charAt(i))) counter1++;
        }
        System.out.println(counter1);


        System.out.println("-----------------------------------------------------------");
        /*
        Write a program that counts uppercase and lowercase letters for below String.
Then, find the difference between lowercase letters and uppercase letters
Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
         */
        int counter2 = 0, counter3 = 0;
        for (int i = 0; i <= address.length() - 1; i++) {
            if (Character.isLowerCase(address.charAt(i))) counter2++;
            else if (Character.isUpperCase(address.charAt(i))) counter3++;
        }
        System.out.println(Math.abs(counter2 - counter3));


        System.out.println("\n---TASK-3 - Second Way---\n");

        int count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isUpperCase(c)) count3++;
            else if(Character.isLowerCase(c)) count3--;
        }

        //String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        System.out.println(Math.abs(count3));

        System.out.println("\n---TASK-3 - Third Way---\n");

        count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)) count3++;
                else count3--;
            }
        }

        System.out.println("-----------------------------------------------------------");

        /*
        Write a program that counts vowel and consonants letters for below String.
Then, print them with below messages

         */
        int isvowel=0 , novowel = 0;
        for (int i = 0; i <= address.length() - 1; i++) {
            if (CharacterHelper.isVowel(address.charAt(i))) isvowel++;
            else if (!CharacterHelper.isVowel(address.charAt(i)) && Character.isLetter(address.charAt(i))) novowel++;
        }

        System.out.println("Vowels = " + isvowel+
                "\nNo Vowel = " + novowel);



        System.out.println("-----------------------------------------------------------");

        /*
        TASK-5 - Putting all together
Write a program that characters from the below String.
Then, print them with below messages

         */
        int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, vowelCounter = 0, consonantCounter = 0, evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                letterCounter++;
                if(Character.isUpperCase(c)){
                    upperCounter++;
                }
                else{
                    lowerCounter++;
                }

                if(CharacterHelper.isVowel(c)){
                    vowelCounter++;
                }
                else{
                    consonantCounter++;
                }
            }
            else if(Character.isDigit(c)){
                digitCounter++;
                if(Integer.parseInt("" + c) % 2 == 0){
                    evenCounter++;
                }
                else{
                    oddCounter++;
                }
            }
            else if(Character.isSpaceChar(c)){
                spaceCounter++;
            }
            else{
                specialCounter++;
            }
        }

        System.out.println("Letters = " + letterCounter);
        System.out.println("Uppercases = " + upperCounter);
        System.out.println("Lowercases = " + lowerCounter);
        System.out.println("Vowels = " + vowelCounter);
        System.out.println("Consonants = " + consonantCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Evens = " + evenCounter);
        System.out.println("Odds = " + oddCounter);
        System.out.println("Spaces = " + spaceCounter);
        System.out.println("Specials = " + specialCounter);


    }
}








