package collectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise_03__count_each_character_in_String {
    public static void main(String[] args) {
        String word = "Chicago is nice city";

        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();


        for (Character c : word.toCharArray()) {
            if(!charCounts.containsKey(c)) charCounts.put(c,1);
            else charCounts.put(c,charCounts.get(c)+1);
        }
        for (Map.Entry entry: charCounts.entrySet()){
            System.out.println(entry);
        }
    }
}
