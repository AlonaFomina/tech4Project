package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("I love TechGlobal");

        System.out.println(matcher.matches());
        while (matcher.find()){//find the next match pattern in the given string
            System.out.println(matcher.group());
            System.out.println("Start pattern: " + matcher.start());//return  int -> prints out where found pattern
            System.out.println("Ends pattern: " +matcher.end());// returns int -> where pattern is ends
        }

        System.out.println(Pattern.matches("[xyz]", "xyz"));//false
        System.out.println(Pattern.matches("[xyz]", "xxxx"));//false
        System.out.println(Pattern.matches("[xyz]", "x"));//true
        System.out.println(Pattern.matches("[^xyz]", "y"));//false
        System.out.println(Pattern.matches("[^a-z]","!23"));//false
    }
}
