package collectionsFramework;

import java.util.*;

public class RecapArrayList {
    public static void main(String[] args) {
        System.out.println("\n__________Int Array__________\n");
        int[] arr = {1, 5, 7, 9, 10, 10};// null is not allowed in the primitive array
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]); //7

        System.out.println("\n__________String Array__________\n");
        String[] cities = {"Tokio", "Berlin", "Oslo", "Denver", null , null };
        System.out.println(Arrays.toString(cities));

        System.out.println("\n__________ List:ArrayList - Vector - LinkList__________\n");
        ArrayList<String> cities2 = new ArrayList<>();///Arrays.asList(cities
        Collections.addAll(cities2,cities);
        cities2.add("Tokio");
        System.out.println(cities2);
        System.out.println(cities2.get(3));


        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        names.forEach(System.out::println);
        System.out.println("Name at index of 5 = " + names.get(5));
       // List<String> names2 = new ArrayList<>();


        System.out.println("\n__________LinkedList Array__________\n");
        LinkedList<String> object1 = new LinkedList<>();
        object1.add("Phone");
        object1.add("Computer");
        object1.add("Airpods");
        object1.add("Screen");
        object1.add("Screen");
        object1.add(null);
        object1.add(null);
        object1.add(null);
        object1.add(null);
        System.out.println(object1.getLast());
        System.out.println(object1);

        int c = 0;
        for (String s : object1) {
            if (s == null)c++;
        }
        System.out.println(c);//4
        System.out.println(object1.stream().filter(Objects::isNull).count());//4


    }
}
