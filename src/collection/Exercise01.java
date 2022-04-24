package collection;

import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {


        String[] cities1 = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        List<String> citiesList = new LinkedList<>();
        Collections.addAll(citiesList, cities1);

        System.out.println(citiesList);
        citiesList.removeIf(element -> element.equals("Dallas"));
        citiesList.remove("Miami");
        System.out.println(citiesList);
    }
}
