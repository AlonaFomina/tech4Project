package projeckts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Project08 {
  static String[] strings = {"foo", "", " " , "foo bar", "java is fun", " ruby "};
  static ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
  public static int countMultipleWords(String array[]){
    int words = 0;

    for (String s : array) {
      if(s.trim().contains(" "))words++;
    }
    return words;
  }

  public static ArrayList<Integer> removeNegatives(ArrayList<Integer> integers) {
    Iterator<Integer> it = integers.iterator();
    while (it.hasNext()) if(it.next() < 0) it.remove();
    return integers;
  }

  public static boolean  validatePassword(String password){
     int uc = 0, lw = 0, sc = 0, dg = 0;
    for (int i = 0; i < password.length() ; i++) {
      if (Character.isUpperCase(password.charAt(i))) uc++;
      else if (Character.isLowerCase(password.charAt(i))) lw++;
      else if (Character.isDigit(password.charAt(i))) dg++;
      else sc++;
    }

    return uc > 0 && lw > 0 && sc > 0 && dg > 0 && !password.contains(" ")
            && (password.length() >= 8 && password.length() < 17);
  }

  public static boolean validateEmailAddress(String password){
    boolean notHasDot = true;
    for (int i = password.lastIndexOf("@") + 1; i < password.lastIndexOf(".") ; i++) {
      if(password.charAt(i) == '.') {
        notHasDot = false;
        break;
      }
    }

    return ((password.indexOf("@") == password.lastIndexOf("@")  && password.contains("@")))
            &&(password.lastIndexOf("@") < password.lastIndexOf(".")) && notHasDot
    && (password.length() - password.lastIndexOf(".") + 1 >= 2) && (password.lastIndexOf(".") - password.indexOf("@") > 2)
            &&(password.indexOf("@") > 1);

    }


  public static void main(String[] args) {
    System.out.println(countMultipleWords(strings));
    System.out.println(removeNegatives(ints));
    System.out.println(validateEmailAddress("a.l.o.na@egm"));
  }
}

