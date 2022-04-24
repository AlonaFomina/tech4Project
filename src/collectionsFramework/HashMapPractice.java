package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {

        System.out.println("\n__________Understanding LinkedHashMap__________\n");
        LinkedHashMap<String, String > capitals0 = new LinkedHashMap<>();
        capitals0.put("Ukraine", "Kiev");
        capitals0.put("Spain", "Madrid");
        capitals0.put("Portugal", "Lisabon");
        capitals0.put("Italy", "Roma");
        capitals0.put("US", "DC");
        capitals0.put("Canada", "Ottawa");
        //print a HashMap
        System.out.println(capitals0);



        System.out.println("\n__________Understanding HashMap__________\n");
         LinkedHashMap<String, String > capitals = new LinkedHashMap<>();
         capitals.put("Ukraine", "Kiev");
         capitals.put("Spain", "Madrid");
         capitals.put("Portugal", "Lisabon");
         capitals.put("Italy", "Roma");
         capitals.put("US", "DC");
         capitals.put("Canada", "Ottawa");
        //print a HashMap
         System.out.println(capitals);

        System.out.println("\n__________Understanding TreeMap__________\n");
        TreeMap<String, String > capitals1= new TreeMap<>();
        capitals1.put("Ukraine", "Kiev");
        capitals1.put("Spain", "Madrid");
        capitals1.put("Portugal", "Lisabon");
        capitals1.put("Italy", "Roma");
        capitals1.put("US", "DC");
        capitals1.put("Canada", "Ottawa");
        //print a HashMap
        System.out.println(capitals1);
        System.out.println(capitals.get("Spain"));
        System.out.println(capitals.get("Germany"));


        System.out.println("\n__________Understanding HashMap__________\n");
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1,"Alona");
        students.put(2,"Abdulah");
        students.put(5,null);
        students.put(6,null);
        students.put(7,null);
        students.put(3,"Abdulah");
        students.put(4,"Data");
        students.put(null, "John");
        students.put(null, "Alex");//update previous element
        students.put(null,null);

        System.out.println(students.size());
        System.out.println(students);

    }
}
