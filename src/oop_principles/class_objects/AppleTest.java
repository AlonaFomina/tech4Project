package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleTest {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        System.out.println(apple1);// location


        apple1.colour = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;
        System.out.println(apple1.colour);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);

        Apple apple2 = new Apple();
        System.out.println(apple2);// different location
        apple2.colour = "Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;

        System.out.println(apple2.colour);
        System.out.println(apple2.taste);
        System.out.println(apple2.price);

        apple1.toString();
        apple2.toString();
        System.out.println(apple2);


        Apple apple3 = new Apple();
        System.out.println(apple3);
        apple3.colour = "Yellow";
        apple3.taste = "Sweet";
        apple3.price = 0.95;
        System.out.println(apple3);

        Apple[] myApples = {apple1, apple2, apple3};
        System.out.println(Arrays.toString(myApples));

        ArrayList<Apple> ArrayList;
        ArrayList<Apple> myAppleList = new ArrayList<>(Arrays.asList(myApples));
        System.out.println(myAppleList);

        for (Apple apple : myAppleList) {
            //System.out.println("My apple = " + apple);
            System.out.println(apple.taste);
            System.out.println(apple.colour);
            System.out.println(apple.price);
        }
    }
}
