package collection.linkedList;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {
    /*
        Create a List and store below data - countries

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal

        Print your list

        RESULT:
        [USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]
         */

        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};

        //WAY - 1 to convert Array to List (ArrayList or LinkedList)
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);


        //2-nd way
        List<String> country3 = new ArrayList<>();
        List<String> country4 = new LinkedList<>();

        Collections.addAll(country3,countries);// this method is adding all array element to list collection
        Collections.addAll(country4,countries);// this method is adding all array element to list collection

        System.out.println(country3);
        System.out.println(country4);


        //3-rd way - manual way
        int[] numbers = {1,2,3,4,5};

        List<Integer> numbersList = new LinkedList<>(); // or ArrayList

      // Collections.addAll(numbersList,numbers);

        for (int i : numbers) {
            numbersList.add(i);
        }
        System.out.println(numbersList);
    }
}
