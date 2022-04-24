package collectionsFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Methods {
    public static void main(String[] args) {
        HashMap<String,String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Colour", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Pet", "Knopa");
        favorites.put("Car", "Mercedes");
        Set<String> keys =  favorites.keySet();

        System.out.println(keys);
        Collection<String> values = favorites.values();
        System.out.println(values);

        System.out.println(values.stream().filter(element -> element.length() > 5).count()); // 3
        System.out.println(keys.stream().filter(element -> element.toLowerCase().startsWith("c")).count()); // 3

        //Entry = key-value

         Set<Map.Entry<String,String>>entrySet =  favorites.entrySet();
        for (Map.Entry entryy : entrySet) {
            System.out.println("My favorite " + entryy.getKey()+" is = " + entryy.getValue());
        }

        favorites.remove("Day");
        favorites.remove("Pet","Knopa");
        favorites.replace("Car","Porshe");
        favorites.containsKey("Car");//true
        favorites.containsValue("Nissan");//false
        System.out.println(favorites);
    }
}
