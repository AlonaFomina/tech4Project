package collection.arrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class _03_Practice_RemoveElements {
    private static char aChar;

    public static void main(String[] args) {

        System.out.println("TASK-1");
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        languages.getFirst();
        languages.getLast();

        languages.remove("Python");//remove stuff
        System.out.println(languages);

        System.out.println("TASK-2");

        /*List<String> j = new LinkedList<>();
        for (String language : languages) {
            if(language.startsWith("J"))j.add(language);
        }

        languages.removeAll(j);
        System.out.println(languages);

         */


        languages.removeIf(element -> element.startsWith("J"));
        System.out.println(languages);

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()){
            String element = iterator.next();
            if (element.startsWith("J")) iterator.remove();
        }
        System.out.println(languages);
    }
}
