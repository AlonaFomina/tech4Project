package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<String,Integer> studentsAges = new TreeMap<>();
        studentsAges.put("Daria", 27);
        studentsAges.put("Alona", 27);
        studentsAges.put("Data", 28);
        studentsAges.put("andrei", 34);
        studentsAges.put("Kaly", 29);
        studentsAges.put("Regina", 26);
        studentsAges.put("Guluzar", null);
        studentsAges.put("Melda", null);
        studentsAges.put("Ismail", null);
        //studentsAges.put(null, 26);not allowed

        System.out.println(studentsAges);
    }
}
