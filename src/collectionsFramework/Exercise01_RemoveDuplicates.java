package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Exercise01_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Computer");
        elements.add("Phone");
        elements.add("Phone");
        elements.add("Mouse");
        elements.add("Mouse");
        elements.add("Phone");
        elements.add("Pen");
        System.out.println("My list before removing is = " + elements);

        ArrayList<String> uniques = new ArrayList<>();
        for (String unique : uniques) {
            if(!uniques.contains(elements)) uniques.add(unique);
        }


        LinkedHashSet<String> elements1 = new LinkedHashSet<>();
        //   LinkedHashSet<String> elements1 = new LinkedHashSet<>(elements);
        System.out.println(new LinkedHashSet<>(elements));
        elements1.addAll(elements);
        System.out.println(elements1);

        System.out.println("");
    }
}
