package arrays;

public class _07_find_longest_string {
    public static void main(String[] args) {


        String[] colors = {"red", "blue", "yellow", "brown"};
        String longest="";
        for (String color : colors) {
            if(color.length()>longest.length())longest=color;

        }
        System.out.println(longest);
    }
}

