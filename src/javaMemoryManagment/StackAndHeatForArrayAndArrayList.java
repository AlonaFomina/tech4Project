package javaMemoryManagment;

import java.util.ArrayList;
import java.util.Arrays;

public class StackAndHeatForArrayAndArrayList {
    public static void main(String[] args) {
        String[] names = new  String[3];
        names[0]= "John";
        names[1]= "Alex";
        names[2]= "Kaly";


        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        namesList = null;//went to garbage collection
        System.gc();

        ArrayList<String> newL = namesList;
        names[0] = "";
        System.out.println(Arrays.asList(names));//[John, Alex, Kaly]
        System.out.println(namesList);//[John, Alex, Kaly]



    }
}
