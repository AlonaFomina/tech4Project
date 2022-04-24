package collection;

import java.util.*;

public class ConvertingListToEachOther {
    public static void main(String[] args) {
        System.out.println("\n____________________________\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("The ArrayList is = " + numbers);

        System.out.println("\n________CONVERTING ARRAYLIST TO LINKEDLIST__________\n");

        LinkedList<Integer> numbers2 = new LinkedList<>(numbers);
        System.out.println("The LinkedList is = " + numbers2);


        System.out.println("\n________CONVERTING LINKEDLIST TO ARRAYLIST__________\n");
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);
        System.out.println(numbers3);

        System.out.println("\n________Vector__________\n");
        String[] namesArr = {"Kaly", "Tory","Taylor"};
       Vector<String> names = new Vector<>();
        Collections.addAll(names,namesArr);
        System.out.println(names);
    }
}
