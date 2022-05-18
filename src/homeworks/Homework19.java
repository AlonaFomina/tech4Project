package homeworks;

import java.util.Arrays;

public class Homework19 {
    public static String noDigit(String str){
        return str.trim().replaceAll("[0-9]","");
    }


    public static String noDigit1(String str){
        String  s = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) continue;
            else s+=str.charAt(i)+"";
        }
        return s;
    }


    public static String noVowels(String str){
     return str.trim().toLowerCase().replaceAll("[aeoui]","");
    }

    public static String noVowels1(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i)== 'a' ||
                    str.toLowerCase().charAt(i)== 'o' ||
                    str.toLowerCase().charAt(i)== 'e' ||
                    str.toLowerCase().charAt(i)== 'u' ||
                    str.toLowerCase().charAt(i)== 'i') continue;
            else s += str.charAt(i);
        }
        return s;
    }

    public static int sumOfDigit(String str){
        int cont = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i)))cont += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return cont;
    }

    public static boolean haveUpperCase(String str){
        boolean hasUpperCase= false;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) hasUpperCase = true;
        }
return hasUpperCase;
    }

    public static int middleInt(int[] arr){
        Arrays.sort(arr);
        int middle = 0;
      middle = arr[arr.length/2];
       return middle;
    }

    public static int[] no13(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == 13) arr[i] = 0;
        }

        return arr;
    }

    public static String[] categorizeCharacters(String str){
        String specials="", letters="",digits="";
        int space = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i)))digits+=str.charAt(i);
            else if(Character.isLetter(str.charAt(i))) letters+= str.charAt(i);
            else if(Character.isSpaceChar(str.charAt(i))) space+= Integer.parseInt(String.valueOf(str.charAt(i)));
            else specials+=str.charAt(i);
        }
         return new String[]{letters, digits, specials};

    }

    public static int[] arrFactorials(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 || arr[i] == 1) arr[i] = 1;
            else{
                int number =  arr[i];
                for (int j = 2; j < number; j++) {
                    arr[i] *= j;
                }
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        System.out.println(noDigit("Hello123"));
        System.out.println(noDigit1("Java1234"));
        System.out.println(noVowels("java123"));
        System.out.println(noVowels1("jarasdge"));
        System.out.println(sumOfDigit("1234"));
        System.out.println(haveUpperCase("  ooo91991I"));
        System.out.println(middleInt(new int[]{5,3,5}));
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 4})));
        System.out.println(Arrays.toString(arrFactorials(new  int[] {5 , 0, 6})));
        System.out.println(Arrays.toString(categorizeCharacters("Alona122k@222")));
    }
}
