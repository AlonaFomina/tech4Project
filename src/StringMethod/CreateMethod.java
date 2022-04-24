package StringMethod;

import utilities.CharacterHelper;

import java.util.Locale;

public class CreateMethod {


    public static String signAndLuckyNumber(int number) {

        switch (number) {
            case 9:
                return "you have a lucky number";
            case -11:
                return "Ypu have hit the unlucky number";
        }

        if (number > 0 && number < 50) {
            return "The number is positive and less then 50";
        } else if (number == 0) {
            return " The number is Zero";
        } else if (number > -50 && number < 0) {
            return "The number is negative and more then -50";
        }
        return "Number is NONE";

    }

    public static void ageAndName(int age, String name) {
        if (age > 30 && CharacterHelper.isUppercase(name.charAt(0))) {
            System.out.println("Age and letter checked out");
        } else if (age > 30 && CharacterHelper.isLowercase(name.charAt(0))) {
            System.out.println("Age check out but letter does not");
        } else if (age <= 30 && CharacterHelper.isUppercase(name.charAt(0))) {
            System.out.println("Age  does not check but  letter checked out");
        } else System.out.println("Age doe not  check and  letter does not check out");

    }

    public static int numreturn(int num1, int num2, int num3) {
        if (num1 >= 1 && num1 <= 10) {
            num1 = num1 * 15;
        } else num1 = 0;
        if (num2 >= 1 && num2 <= 10) {
            num2 = num2 * 10;
        } else num2 = 0;
        if (num3 >= 1 && num3 <= 10) {
            num3 = num3 * 15;

        }
        return num1 + num2 + num3;
    }

    public static void intAndAge(String name, String age) {
        if (name.toLowerCase().equals("alona") && age.equalsIgnoreCase("27")) {
            System.out.println("IMPOSTER!!!");

        } else {
            System.out.println(
                    Integer.parseInt(age) % name.length() == 0
                            ? "Your age and name gets along!"
                            : "Your age and name needs time:(");

            System.out.println(
                    CharacterHelper.isVowel(name.charAt(0))
                            ? "Starting with the vowels"
                            : "Starting with consonant I see"
            );

            System.out.println(
                    CharacterHelper.isConsonant(name.charAt(name.length() - 1))
                            ? "Nice Finish"
                            : "Seen better");


        }
    }
    public static String name(String full) {

        String s1 = full.substring(0, full.indexOf(" "));
        String s2 = full.substring(full.indexOf(" ") + 1);


        full = s1.toUpperCase().substring(0,1)+ s1.toLowerCase().substring(1).concat(" ").concat(s2.toUpperCase());
        return full;


    }
}
