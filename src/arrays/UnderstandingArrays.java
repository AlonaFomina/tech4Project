package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        String name;
        name = "John";
        int age = 45;

        System.out.println("name is " + name);
        System.out.println("Age is " + age);
        /*
        the trend is to have multiply students information
         */

        String[] names = {"Alex","Abe","Alona"};
        int[] ages = {20,21,22};
        char[] favChar = {'a','%','$'};
        double[] doubles = {5.6, 15,23.6};
        boolean[] doTheyLikeJava = {true,true,true};

        // how to print all ARRAY


        String nameToString = Arrays.toString(names);
        System.out.println(nameToString);


        //HOW TO GET ELEMENT DATA FROM RA


        System.out.println(names[1]);//ABE
        System.out.println(names[0]);//Alex
        System.out.println(names[2]);//Alona


        //HOW TO UPDATE AN ELEMENT Abe ->Abraham

        names[1] = "Abraham";
        System.out.println(names[1]);


        for (int i = 0; i <=2 ; i++) {
            System.out.println(names[i] + "'s age is " + ages[i] + " and his fav char is " + favChar[i] + ".");

        }
    }
}
