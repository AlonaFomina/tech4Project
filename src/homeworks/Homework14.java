package homeworks;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {

        final String noDuplicateMessage = "There is no duplicates";

        System.out.println("__________TASK-1__________");


        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        int[] numbers1 = {-8, 56, 7, 8, 65};

        boolean isDuplicate = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) break;
        }
        if (!isDuplicate) System.out.println(noDuplicateMessage);


        System.out.println("__________TASK-2__________");


        boolean isDuplicateWord = false;
        String[] words = {"xyz", "java", "abc", "Z", "z"};
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    isDuplicateWord = true;
                    System.out.println(words[j]);
                    break;
                }
            }
            if (isDuplicateWord) break;
        }
        if (!isDuplicateWord) System.out.println(noDuplicateMessage);


        System.out.println("__________TASK-3__________");

        int[] numbers2 = {0, -4, -7, 0, 5, 10, 45, -7, 0, 45, 45, 45};
        String duplicates = "";
        boolean isDuplicateNum = false;
        for (int i = 0; i < numbers2.length - 1; i++) {
            for (int j = i + 1; j < numbers2.length; j++) {
                if (numbers2[i] == numbers2[j] && !duplicates.contains(numbers2[i] + ""))
                    duplicates += numbers2[j] + "\n";
            }
        }
        if (duplicates.isEmpty()) System.out.println(noDuplicateMessage);
        else System.out.println(duplicates);


        System.out.println("__________TASK-4__________");


        String[] words1 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};

        String isDuplicatesWord = "";
        for (int i = 0; i < words1.length - 1; i++) {
            for (int j = i + 1; j < words1.length; j++) {
                if (words1[i].equalsIgnoreCase(words1[j])
                        && !isDuplicatesWord.contains(words1[i].toLowerCase())) {
                    System.out.println(words1[i]);
                    isDuplicatesWord += words1[i].toLowerCase();
                }

            }

        }

        if (isDuplicatesWord.isEmpty()) System.out.println(noDuplicateMessage);


        System.out.println("__________TASK-5__________");

        String[] words2 = {"abc", "foo", "bar"};
        String[] newWords2 = new String[words2.length];

        for (int i = words2.length - 1; i >= 0; i--) {
            newWords2[words2.length - 1 - i] = words2[i];
        }
        System.out.println(Arrays.toString(newWords2));


        System.out.println("__________TASK-6__________");

        String str = "Java is fun";
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            // getting every word
            String reverseStr = "";
            for (int j = strArr[i].length() - 1; j >=0; j--) {
                reverseStr += strArr[i].charAt(j);
            }
            strArr[i] = reverseStr;
        }

        for (int i = 0; i < strArr.length; i++) {
            System.out.print((i == strArr.length - 1) ? strArr[i] : strArr[i] + " ");
        }

    }
}
