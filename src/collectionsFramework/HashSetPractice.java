package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
        numbers.add(null);
        numbers.add(55);
        numbers.add(55);
        numbers.add(55);
        System.out.println(numbers.stream().findFirst());
        System.out.println(numbers);
    }
}
