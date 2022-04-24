package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        //numbers.add(null); does not take nulls

        System.out.println(numbers);

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Joe");
        names.add("Alex");
        names.add("ali");

        //words.add(null);does not take nulls// trow nullPointExceptions
        System.out.println(names);

    }
}
