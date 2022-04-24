package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice {
    public static void main(String[] args) {

        System.out.println("TASK_1");

        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pencil");


        List<String> unique = new ArrayList<>();
        for (String object : objects) {
            if (!unique.contains(object)) unique.add(object);
        }
        System.out.println(unique);


    }
}
