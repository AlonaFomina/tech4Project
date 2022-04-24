package collection.arrayList;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers.size());//3
        System.out.println(numbers);//[5, 7, 10]
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        System.out.println("___________Printing all element wiith Ioop__________");

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));

        }

        System.out.println("___________Printing all element wiith each loop__________");
        for (Integer number : numbers) {
            System.out.println(number);

        }

        int counter= 0;

        for (Integer number : numbers) {
            if(number%  2 == 0) counter++;

        }
        System.out.println(counter);
    }
}
