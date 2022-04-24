package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_FindSecondMin {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);

        TreeSet<Integer> uniques =  new TreeSet<Integer>(numbers);
        System.out.println(uniques);//sorted uniques

        ArrayList<Integer> uniquesList = new ArrayList<>(uniques);
       // ArrayList<Integer> uniquesList = new ArrayList<>(new TreeSet<Integer>(numbers)); or this one if we don't want to create a treeSet separately

        System.out.println(uniquesList.get(uniquesList.size()-2));//second Max
        System.out.println(uniquesList.get(uniquesList.size()-1));//Max
        System.out.println(uniquesList.get(2));//secondMin
        System.out.println(uniquesList.get(1));//min

    }
}
