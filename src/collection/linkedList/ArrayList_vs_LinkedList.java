package collection.linkedList;

import java.util.LinkedList;

public class ArrayList_vs_LinkedList {
    public static void main(String[] args) {
        LinkedList<Double> numbers = new LinkedList<>();

        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);


        System.out.println("\n__________LOOPING LinkedList__________\n");
        for (Double d : numbers) {
            System.out.println(d);
        }

        System.out.println("\n__________Some Methods for LinkedList LinkedList__________\n");
        System.out.println(numbers.get(0));//10.5
        System.out.println(numbers.getFirst());//10.5
        System.out.println(numbers.getLast());//17.7


        System.out.println("\n__________For I LinkedList__________\n");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("\n__________Some additional methods for LinkedList__________\n");

        System.out.println(numbers.peek());// getFirst() 10.5
        System.out.println(numbers.peekFirst());//10.5
        System.out.println(numbers.peekLast());//17.7


        System.out.println(numbers);

        System.out.println("\n_______________________________________\n");
        System.out.println(numbers.poll());// retrives first element and removes
        System.out.println(numbers.pollFirst());//retrives first element

        System.out.println(numbers.pollLast());//retrives last element
        System.out.println(numbers);


        System.out.println("\n_______________________________________\n");

        numbers.push(5.7);// adds the object to the 0
        System.out.println(numbers);

        numbers.push(8.9);
        System.out.println(numbers);

        numbers.pop();
        System.out.println(numbers);//removes first element
    }
}
