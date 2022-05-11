package practice;

import collectionsFramework.TreeMapPractice;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Akins_extra {

    public static TreeMap<String, String> parse_data_From_a_String_As_Key_AndValue(String str){
        TreeMap<String,String> map = new TreeMap<>();

        for (String key : str.substring(1).split("\\{")) {
            map.put(key.substring(0, key.indexOf('}')), key.substring(key.indexOf('}') + 1));

        }
        return map;
    }

    public static LinkedHashMap<Character, Integer> count_Characters_In_The_String(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if (counts.containsKey(c )) counts.put(c, counts.get(c) +1);
            else counts.put(c, 1);
        }
        return counts;

    }

    public static void main(String[] args) {


        System.out.println(count_Characters_In_The_String("Nice Banana"));
        System.out.println(parse_data_From_a_String_As_Key_AndValue("{100}LA{2000}Berlin{201}Uman"));

    }

}
